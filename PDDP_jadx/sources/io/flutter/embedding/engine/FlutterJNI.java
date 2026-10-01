package io.flutter.embedding.engine;

import N.C0026b;
import N.Q;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.LocaleList;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.p;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.m;
import io.flutter.plugin.platform.c;
import io.flutter.plugin.platform.g;
import io.flutter.plugin.platform.o;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.f;
import io.flutter.view.s;
import io.flutter.view.t;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p002b.a;
import p011g0.AbstractActivityC0098e;
import p011g0.C0102i;
import p011g0.q;
import p013h0.k;
import p013h0.l;
import p015i0.d;
import p015i0.j;
import p028p0.n;
import p030q0.e;
import p032r0.b;

/* JADX INFO: loaded from: classes.dex */
@a
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static l asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private k accessibilityDelegate;
    private p017j0.a deferredComponentManager;
    private b localizationPlugin;
    private Long nativeShellHolderId;
    private p015i0.k platformMessageHandler;
    private o platformViewsController;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<p013h0.b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<m> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j2) {
        l lVar = asyncWaitForVsyncDelegate;
        if (lVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        io.flutter.view.b bVar = (io.flutter.view.b) lVar;
        bVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        t tVar = (t) bVar.f2394a;
        s sVar = tVar.f2521c;
        if (sVar != null) {
            sVar.f2515a = j2;
            tVar.f2521c = null;
        } else {
            sVar = new s(tVar, j2);
        }
        choreographer.postFrameCallback(sVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h0.j] */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new ImageDecoder.OnHeaderDecodedListener() { // from class: h0.j
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        FlutterJNI.lambda$decodeImage$0(j2, imageDecoder, imageInfo, source);
                    }
                });
            } catch (IOException e2) {
                Log.e(TAG, "Failed to decode image", e2);
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    @Deprecated
    public static String getObservatoryUri() {
        return vmServiceUri;
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i2, ByteBuffer byteBuffer) {
        e eVar;
        p015i0.k kVar = this.platformMessageHandler;
        if (kVar == null || (eVar = (e) ((j) kVar).f2187j.remove(Integer.valueOf(i2))) == null) {
            return;
        }
        try {
            eVar.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e2) {
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
                throw e2;
            }
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, e2);
        } catch (Exception e3) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$0(long j2, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        Size size = imageInfo.getSize();
        nativeImageHeaderCallback(j2, size.getWidth(), size.getHeight());
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j2);

    private native void nativeDeferredComponentInstallFailure(int i2, String str, boolean z2);

    private native void nativeDestroy(long j2);

    private native void nativeDispatchEmptyPlatformMessage(long j2, String str, int i2);

    private native void nativeDispatchPlatformMessage(long j2, String str, ByteBuffer byteBuffer, int i2, int i3);

    private native void nativeDispatchPointerDataPacket(long j2, ByteBuffer byteBuffer, int i2);

    private native void nativeDispatchSemanticsAction(long j2, int i2, int i3, ByteBuffer byteBuffer, int i4);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i2);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i2);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i2);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i2);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i2);

    private native Bitmap nativeGetBitmap(long j2);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j2, int i2, int i3);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j2);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j2, int i2);

    private native void nativeInvokePlatformMessageResponseCallback(long j2, int i2, ByteBuffer byteBuffer, int i3);

    private native void nativeLoadDartDeferredLibrary(long j2, int i2, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j2);

    private native void nativeMarkTextureFrameAvailable(long j2, long j3);

    private native void nativeNotifyLowMemoryWarning(long j2);

    private native void nativeOnVsync(long j2, long j3, long j4);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j2, long j3, WeakReference<TextureRegistry$ImageConsumer> weakReference);

    private native void nativeRegisterTexture(long j2, long j3, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j2, String str, String str2, String str3, AssetManager assetManager, List<String> list);

    private native void nativeScheduleFrame(long j2);

    private native void nativeSetAccessibilityFeatures(long j2, int i2);

    private native void nativeSetSemanticsEnabled(long j2, boolean z2);

    private native void nativeSetViewportMetrics(long j2, float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j2, String str, String str2, String str3, List<String> list);

    private native void nativeSurfaceChanged(long j2, int i2, int i3);

    private native void nativeSurfaceCreated(long j2, Surface surface);

    private native void nativeSurfaceDestroyed(long j2);

    private native void nativeSurfaceWindowChanged(long j2, Surface surface);

    private native void nativeUnregisterTexture(long j2, long j3);

    private native void nativeUpdateDisplayMetrics(long j2);

    private native void nativeUpdateJavaAssetManager(long j2, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f2);

    private void onPreEngineRestart() {
        Iterator<p013h0.b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            io.flutter.view.b bVar = (io.flutter.view.b) kVar;
            bVar.getClass();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.k kVar2 = (io.flutter.view.k) bVar.f2394a;
            kVar2.getClass();
            while (byteBuffer.hasRemaining()) {
                f fVarB = kVar2.b(byteBuffer.getInt());
                fVarB.f2423c = byteBuffer.getInt();
                int i2 = byteBuffer.getInt();
                String str = null;
                fVarB.f2424d = i2 == -1 ? null : strArr[i2];
                int i3 = byteBuffer.getInt();
                if (i3 != -1) {
                    str = strArr[i3];
                }
                fVarB.f2425e = str;
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            ((io.flutter.view.b) kVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public void addEngineLifecycleListener(p013h0.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(mVar);
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j2) {
        nativeCleanupMessageData(j2);
    }

    public String[] computePlatformResolvedLocale(String[] strArr) {
        Locale localeLookup;
        Locale locale;
        Locale locale2;
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2 += 3) {
            String str = strArr[i2];
            String str2 = strArr[i2 + 1];
            String str3 = strArr[i2 + 2];
            Locale.Builder builder = new Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        b bVar = this.localizationPlugin;
        bVar.getClass();
        if (arrayList.isEmpty()) {
            localeLookup = null;
        } else {
            int i3 = Build.VERSION.SDK_INT;
            AbstractActivityC0098e abstractActivityC0098e = bVar.f3060b;
            if (i3 >= 26) {
                ArrayList arrayList2 = new ArrayList();
                LocaleList locales = abstractActivityC0098e.getResources().getConfiguration().getLocales();
                int size = locales.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Locale locale3 = locales.get(i4);
                    String language = locale3.getLanguage();
                    if (!locale3.getScript().isEmpty()) {
                        language = language + "-" + locale3.getScript();
                    }
                    if (!locale3.getCountry().isEmpty()) {
                        language = language + "-" + locale3.getCountry();
                    }
                    arrayList2.add(p032r0.a.c(language));
                    p032r0.a.e();
                    arrayList2.add(p032r0.a.c(locale3.getLanguage()));
                    p032r0.a.e();
                    arrayList2.add(p032r0.a.c(locale3.getLanguage() + "-*"));
                }
                localeLookup = Locale.lookup(arrayList2, arrayList);
                if (localeLookup == null) {
                    localeLookup = (Locale) arrayList.get(0);
                }
            } else {
                if (i3 >= 24) {
                    LocaleList locales2 = abstractActivityC0098e.getResources().getConfiguration().getLocales();
                    int i5 = 0;
                    loop2: while (true) {
                        if (i5 >= locales2.size()) {
                            localeLookup = (Locale) arrayList.get(0);
                            break;
                        }
                        Locale locale4 = locales2.get(i5);
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                locale2 = (Locale) it.next();
                                if (locale4.equals(locale2)) {
                                }
                            } else {
                                Iterator it2 = arrayList.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        locale2 = (Locale) it2.next();
                                        if (locale4.getLanguage().equals(locale2.toLanguageTag())) {
                                        }
                                    } else {
                                        Iterator it3 = arrayList.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                locale2 = (Locale) it3.next();
                                                if (locale4.getLanguage().equals(locale2.getLanguage())) {
                                                }
                                            } else {
                                                i5++;
                                            }
                                        }
                                    }
                                }
                            }
                            localeLookup = locale2;
                            break loop2;
                        }
                    }
                }
                Locale locale5 = abstractActivityC0098e.getResources().getConfiguration().locale;
                if (locale5 != null) {
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            locale = (Locale) it4.next();
                            if (locale5.equals(locale)) {
                            }
                        } else {
                            Iterator it5 = arrayList.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    locale = (Locale) it5.next();
                                    if (locale5.getLanguage().equals(locale.toString())) {
                                    }
                                } else {
                                    localeLookup = (Locale) arrayList.get(0);
                                }
                            }
                        }
                        localeLookup = locale;
                    }
                } else {
                    localeLookup = (Locale) arrayList.get(0);
                }
            }
        }
        return localeLookup == null ? new String[0] : new String[]{localeLookup.getLanguage(), localeLookup.getCountry(), localeLookup.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        c cVar = new c(oVar.f2345d.getContext(), oVar.f2345d.getWidth(), oVar.f2345d.getHeight(), 2);
        cVar.f2311k = oVar.f2349h;
        int i2 = oVar.f2356o;
        oVar.f2356o = i2 + 1;
        oVar.f2354m.put(i2, cVar);
        return new FlutterOverlaySurface(i2, cVar.getSurface());
    }

    public void deferredComponentInstallFailure(int i2, String str, boolean z2) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i2, str, z2);
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        oVar.c();
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i2);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i2);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i2, int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i2, i3);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i3);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i2);
    }

    public void dispatchSemanticsAction(int i2, io.flutter.view.e eVar) {
        dispatchSemanticsAction(i2, eVar, null);
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0075  */
    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x0079, please report this as an issue */
    public float getScaledFontSize(float f2, int i2) {
        p028p0.m mVar;
        DisplayMetrics displayMetrics;
        C0026b c0026b = n.f2955b;
        p028p0.m mVar2 = (p028p0.m) c0026b.f476f;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c0026b.f477g;
        if (mVar2 == null) {
            c0026b.f476f = (p028p0.m) concurrentLinkedQueue.poll();
        }
        while (true) {
            mVar = (p028p0.m) c0026b.f476f;
            if (mVar == null || mVar.f2953a >= i2) {
                break;
            }
            c0026b.f476f = (p028p0.m) concurrentLinkedQueue.poll();
        }
        if (mVar != null) {
            if (mVar.f2953a != i2) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i2) + ", the oldest config is now: " + String.valueOf(((p028p0.m) c0026b.f476f).f2953a));
            }
            displayMetrics = mVar != null ? mVar.f2954b : null;
            if (displayMetrics == null) {
                return TypedValue.applyDimension(2, f2, displayMetrics) / displayMetrics.density;
            }
            Log.e(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i2) + ", which can't be found.");
            return -1.0f;
        }
        Log.e("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i2) + ", after exhausting the queue.");
        mVar = null;
        if (mVar != null) {
        }
        if (displayMetrics == null) {
            return TypedValue.applyDimension(2, f2, displayMetrics) / displayMetrics.density;
        }
        Log.e(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i2) + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i2, long j2) {
        p015i0.f fVar;
        boolean z2;
        p015i0.k kVar = this.platformMessageHandler;
        if (kVar == null) {
            nativeCleanupMessageData(j2);
            return;
        }
        j jVar = (j) kVar;
        synchronized (jVar.f2185h) {
            try {
                fVar = (p015i0.f) jVar.f2183f.get(str);
                z2 = jVar.f2186i.get() && fVar == null;
                if (z2) {
                    if (!jVar.f2184g.containsKey(str)) {
                        jVar.f2184g.put(str, new LinkedList());
                    }
                    ((List) jVar.f2184g.get(str)).add(new d(j2, byteBuffer, i2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            return;
        }
        jVar.a(str, fVar, byteBuffer, i2, j2);
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j2) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j2);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i2) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i2);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i2);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public void invokePlatformMessageResponseCallback(int i2, ByteBuffer byteBuffer, int i3) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i2, byteBuffer, i3);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i2);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i2) {
        return nativeFlutterTextUtilsIsEmoji(i2);
    }

    public boolean isCodePointEmojiModifier(int i2) {
        return nativeFlutterTextUtilsIsEmojiModifier(i2);
    }

    public boolean isCodePointEmojiModifierBase(int i2) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i2);
    }

    public boolean isCodePointRegionalIndicator(int i2) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i2);
    }

    public boolean isCodePointVariantSelector(int i2) {
        return nativeFlutterTextUtilsIsVariationSelector(i2);
    }

    public void loadDartDeferredLibrary(int i2, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i2, strArr);
    }

    public void loadLibrary(Context context) throws Throwable {
        Q q2;
        String[] strArrI;
        ZipFile zipFile;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        char c2 = 0;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        C0026b c0026b = new C0026b(3);
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        C0026b.H("Beginning load of %s...", "flutter");
        H.a aVar = (H.a) c0026b.f476f;
        HashSet hashSet = (HashSet) c0026b.f477g;
        if (hashSet.contains("flutter")) {
            C0026b.H("%s already loaded previously!", "flutter");
        } else {
            try {
                aVar.getClass();
                System.loadLibrary("flutter");
                hashSet.add("flutter");
                C0026b.H("%s (%s) was loaded normally!", "flutter", null);
            } catch (UnsatisfiedLinkError e2) {
                C0026b.H("Loading the library normally failed: %s", Log.getStackTraceString(e2));
                C0026b.H("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                File fileC = c0026b.C(context);
                if (!fileC.exists()) {
                    File dir = context.getDir("lib", 0);
                    File fileC2 = c0026b.C(context);
                    aVar.getClass();
                    File[] fileArrListFiles = dir.listFiles(new p008e0.a(System.mapLibraryName("flutter")));
                    if (fileArrListFiles != null) {
                        for (File file : fileArrListFiles) {
                            if (!file.getAbsolutePath().equals(fileC2.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    String[] strArr = Build.SUPPORTED_ABIS;
                    if (strArr.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String strMapLibraryName = System.mapLibraryName("flutter");
                    ((H.a) c0026b.f478h).getClass();
                    try {
                        Q qG = H.a.g(context, strArr, strMapLibraryName, c0026b);
                        try {
                            if (qG == null) {
                                try {
                                    strArrI = H.a.i(context, strMapLibraryName);
                                } catch (Exception e3) {
                                    strArrI = new String[]{e3.toString()};
                                }
                                throw new O.c(strMapLibraryName, strArr, strArrI);
                            }
                            int i2 = 0;
                            while (true) {
                                int i3 = i2 + 1;
                                zipFile = (ZipFile) qG.f471f;
                                if (i2 >= 5) {
                                    break;
                                }
                                Object[] objArr = new Object[1];
                                objArr[c2] = strMapLibraryName;
                                C0026b.H("Found %s! Extracting...", objArr);
                                try {
                                    if (fileC.exists() || fileC.createNewFile()) {
                                        try {
                                            inputStream2 = zipFile.getInputStream((ZipEntry) qG.f472g);
                                            try {
                                                fileOutputStream2 = new FileOutputStream(fileC);
                                                try {
                                                    byte[] bArr = new byte[4096];
                                                    long j2 = 0;
                                                    while (true) {
                                                        int i4 = inputStream2.read(bArr);
                                                        if (i4 == -1) {
                                                            break;
                                                        }
                                                        fileOutputStream2.write(bArr, 0, i4);
                                                        j2 += (long) i4;
                                                    }
                                                    fileOutputStream2.flush();
                                                    fileOutputStream2.getFD().sync();
                                                    if (j2 == fileC.length()) {
                                                        H.a.d(inputStream2);
                                                        H.a.d(fileOutputStream2);
                                                        fileC.setReadable(true, false);
                                                        fileC.setExecutable(true, false);
                                                        fileC.setWritable(true);
                                                        break;
                                                    }
                                                    H.a.d(inputStream2);
                                                    H.a.d(fileOutputStream2);
                                                } catch (FileNotFoundException unused) {
                                                    H.a.d(inputStream2);
                                                    H.a.d(fileOutputStream2);
                                                    i2 = i3;
                                                    c2 = 0;
                                                } catch (IOException unused2) {
                                                    H.a.d(inputStream2);
                                                    H.a.d(fileOutputStream2);
                                                    i2 = i3;
                                                    c2 = 0;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    inputStream = inputStream2;
                                                    fileOutputStream = fileOutputStream2;
                                                    H.a.d(inputStream);
                                                    H.a.d(fileOutputStream);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException unused3) {
                                                fileOutputStream2 = null;
                                                H.a.d(inputStream2);
                                                H.a.d(fileOutputStream2);
                                                i2 = i3;
                                                c2 = 0;
                                            } catch (IOException unused4) {
                                                fileOutputStream2 = null;
                                                H.a.d(inputStream2);
                                                H.a.d(fileOutputStream2);
                                                i2 = i3;
                                                c2 = 0;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                H.a.d(inputStream);
                                                H.a.d(fileOutputStream);
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused5) {
                                            inputStream2 = null;
                                        } catch (IOException unused6) {
                                            inputStream2 = null;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            inputStream = null;
                                        }
                                    }
                                } catch (IOException unused7) {
                                }
                                i2 = i3;
                                c2 = 0;
                            }
                            try {
                                zipFile.close();
                            } catch (IOException unused8) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            q2 = qG;
                            if (q2 != null) {
                                try {
                                    ((ZipFile) q2.f471f).close();
                                } catch (IOException unused9) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        q2 = null;
                    }
                }
                String absolutePath = fileC.getAbsolutePath();
                aVar.getClass();
                System.load(absolutePath);
                hashSet.add("flutter");
                C0026b.H("%s (%s) was re-linked!", "flutter", null);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j2);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        oVar.f2359r.clear();
        oVar.f2360s.clear();
    }

    public void onDisplayOverlaySurface(int i2, int i3, int i4, int i5, int i6) {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = oVar.f2354m;
        if (sparseArray.get(i2) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i2 + ") doesn't exist");
        }
        oVar.h();
        View view = (c) sparseArray.get(i2);
        if (view.getParent() == null) {
            oVar.f2345d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i6);
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        oVar.f2359r.add(Integer.valueOf(i2));
    }

    public void onDisplayPlatformView(final int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        final o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        oVar.h();
        SparseArray sparseArray = oVar.f2352k;
        g gVar = (g) sparseArray.get(i2);
        if (gVar == null) {
            return;
        }
        SparseArray sparseArray2 = oVar.f2353l;
        if (sparseArray2.get(i2) == null) {
            View view = gVar.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            Activity activity = oVar.f2344c;
            p021l0.a aVar = new p021l0.a(activity, activity.getResources().getDisplayMetrics().density, oVar.f2343b);
            aVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.k
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z2) {
                    o oVar2 = oVar;
                    int i9 = i2;
                    if (z2) {
                        C0026b c0026b = (C0026b) oVar2.f2348g.f471f;
                        if (c0026b == null) {
                            return;
                        }
                        c0026b.F("viewFocused", Integer.valueOf(i9), null);
                        return;
                    }
                    io.flutter.plugin.editing.j jVar = oVar2.f2347f;
                    if (jVar != null) {
                        jVar.b(i9);
                    }
                }
            });
            sparseArray2.put(i2, aVar);
            view.setImportantForAccessibility(4);
            aVar.addView(view);
            oVar.f2345d.addView(aVar);
        }
        p021l0.a aVar2 = (p021l0.a) sparseArray2.get(i2);
        aVar2.f2822e = flutterMutatorsStack;
        aVar2.f2824g = i3;
        aVar2.f2825h = i4;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i6);
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4;
        aVar2.setLayoutParams(layoutParams);
        aVar2.setWillNotDraw(false);
        aVar2.setVisibility(0);
        aVar2.bringToFront();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i7, i8);
        View view2 = ((g) sparseArray.get(i2)).getView();
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
            view2.bringToFront();
        }
        oVar.f2360s.add(Integer.valueOf(i2));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public void onEndFrame() {
        ?? r3;
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z2 = false;
        if (!oVar.f2357p || !oVar.f2360s.isEmpty()) {
            if (oVar.f2357p) {
                C0102i c0102i = oVar.f2345d.f1896g;
                if (c0102i != null ? c0102i.e() : false) {
                    z2 = true;
                }
            }
            oVar.e(z2);
            return;
        }
        oVar.f2357p = false;
        q qVar = oVar.f2345d;
        p pVar = new p(1, oVar);
        C0102i c0102i2 = qVar.f1896g;
        if (c0102i2 == null || (r3 = qVar.f1898i) == 0) {
            return;
        }
        qVar.f1897h = r3;
        qVar.f1898i = null;
        io.flutter.embedding.engine.renderer.l lVar = qVar.f1901l.f1979b;
        if (lVar != null) {
            r3.d();
            p011g0.p pVar2 = new p011g0.p(qVar, lVar, pVar);
            lVar.f2233a.addIsDisplayingFlutterUiListener(pVar2);
            if (lVar.f2236d) {
                pVar2.b();
                return;
            }
            return;
        }
        c0102i2.c();
        C0102i c0102i3 = qVar.f1896g;
        if (c0102i3 != null) {
            c0102i3.f1873e.close();
            qVar.removeView(qVar.f1896g);
            qVar.f1896g = null;
        }
        pVar.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<m> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<m> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void onSurfaceChanged(int i2, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i2, i3);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j2, long j3, long j4) {
        nativeOnVsync(j2, j3, j4);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j2, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j2, new WeakReference<>(textureRegistry$ImageConsumer));
    }

    public void registerTexture(long j2, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j2, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(p013h0.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(mVar);
    }

    public void requestDartDeferredLibrary(int i2) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(k kVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = kVar;
    }

    public void setAccessibilityFeatures(int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i2);
        }
    }

    public void setAccessibilityFeaturesInNative(int i2) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i2);
    }

    public void setAsyncWaitForVsyncDelegate(l lVar) {
        asyncWaitForVsyncDelegate = lVar;
    }

    public void setDeferredComponentManager(p017j0.a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setLocalizationPlugin(b bVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = bVar;
    }

    public void setPlatformMessageHandler(p015i0.k kVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = kVar;
    }

    public void setPlatformViewsController(o oVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = oVar;
    }

    public void setRefreshRateFPS(float f2) {
        refreshRateFPS = f2;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z2);
        }
    }

    public void setSemanticsEnabledInNative(boolean z2) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z2);
    }

    public void setViewportMetrics(float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f2, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, iArr, iArr2, iArr3);
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI flutterJNINativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list);
        Long l2 = flutterJNINativeSpawn.nativeShellHolderId;
        if ((l2 == null || l2.longValue() == 0) ? false : true) {
            return flutterJNINativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    public void unregisterTexture(long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j2);
    }

    public void updateDisplayMetrics(int i2, float f2, float f3, float f4) {
        displayWidth = f2;
        displayHeight = f3;
        displayDensity = f4;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i2, io.flutter.view.e eVar, Object obj) {
        ByteBuffer byteBufferB;
        int iPosition;
        ensureAttachedToNative();
        if (obj != null) {
            byteBufferB = p030q0.n.f3028a.b(obj);
            iPosition = byteBufferB.position();
        } else {
            byteBufferB = null;
            iPosition = 0;
        }
        dispatchSemanticsAction(i2, eVar.f2420e, byteBufferB, iPosition);
    }

    public void dispatchSemanticsAction(int i2, int i3, ByteBuffer byteBuffer, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i2, i3, byteBuffer, i4);
    }
}
