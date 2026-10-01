package p011g0;

import G.C0013n;
import N.C0026b;
import N.C0038n;
import N.Q;
import Q0.AbstractC0043a;
import Q0.AbstractC0063v;
import Q0.B;
import Q0.C0061t;
import Q0.J;
import Q0.P;
import Q0.T;
import Q0.e0;
import T.d;
import V0.p;
import Y.h;
import Y.i;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.Selection;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.l;
import io.flutter.plugin.editing.g;
import io.flutter.plugin.editing.j;
import io.flutter.plugin.platform.o;
import io.flutter.view.k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p013h0.c;
import p028p0.m;
import p028p0.n;
import p030q0.f;
import p032r0.b;
import p034s0.a;
import z0.e;

/* JADX INFO: loaded from: classes.dex */
public final class q extends FrameLayout implements a, C {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public i f1892A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public s f1893B;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f1894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f1895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0102i f1896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f1897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f1898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashSet f1899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f1901l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashSet f1902m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Q f1903n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j f1904o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g f1905p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f1906q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0026b f1907r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0094a f1908s;
    public k t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextServicesManager f1909u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public D.j f1910v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.k f1911w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final D.j f1912x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final E.a f1913y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0099f f1914z;

    public q(AbstractActivityC0098e abstractActivityC0098e, k kVar) {
        super(abstractActivityC0098e, null);
        this.f1899j = new HashSet();
        this.f1902m = new HashSet();
        this.f1911w = new io.flutter.embedding.engine.renderer.k();
        this.f1912x = new D.j(17, this);
        this.f1913y = new E.a(this, new Handler(Looper.getMainLooper()), 1);
        this.f1914z = new C0099f(2, this);
        this.f1893B = new s();
        this.f1894e = kVar;
        this.f1897h = kVar;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.f1901l);
        if (c()) {
            Iterator it = this.f1902m.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            getContext().getContentResolver().unregisterContentObserver(this.f1913y);
            o oVar = this.f1901l.f1995r;
            int i2 = 0;
            while (true) {
                SparseArray sparseArray2 = oVar.f2355n;
                if (i2 >= sparseArray2.size()) {
                    break;
                }
                oVar.f2345d.removeView((io.flutter.plugin.platform.j) sparseArray2.valueAt(i2));
                i2++;
            }
            int i3 = 0;
            while (true) {
                SparseArray sparseArray3 = oVar.f2353l;
                if (i3 >= sparseArray3.size()) {
                    break;
                }
                oVar.f2345d.removeView((p021l0.a) sparseArray3.valueAt(i3));
                i3++;
            }
            oVar.c();
            if (oVar.f2345d == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                int i4 = 0;
                while (true) {
                    sparseArray = oVar.f2354m;
                    if (i4 >= sparseArray.size()) {
                        break;
                    }
                    oVar.f2345d.removeView((View) sparseArray.valueAt(i4));
                    i4++;
                }
                sparseArray.clear();
            }
            oVar.f2345d = null;
            oVar.f2357p = false;
            int i5 = 0;
            while (true) {
                SparseArray sparseArray4 = oVar.f2352k;
                if (i5 >= sparseArray4.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.g) sparseArray4.valueAt(i5)).getClass();
                i5++;
            }
            this.f1901l.f1995r.f2349h.f2309a = null;
            k kVar = this.t;
            kVar.f2499u = true;
            kVar.f2484e.f2349h.f2309a = null;
            kVar.f2498s = null;
            AccessibilityManager accessibilityManager = kVar.f2482c;
            accessibilityManager.removeAccessibilityStateChangeListener(kVar.f2501w);
            accessibilityManager.removeTouchExplorationStateChangeListener(kVar.f2502x);
            kVar.f2485f.unregisterContentObserver(kVar.f2503y);
            C0026b c0026b = kVar.f2481b;
            c0026b.f478h = null;
            ((FlutterJNI) c0026b.f476f).setAccessibilityDelegate(null);
            this.t = null;
            this.f1904o.f2293b.restartInput(this);
            this.f1904o.c();
            int size = ((HashSet) this.f1907r.f476f).size();
            if (size > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
            }
            g gVar = this.f1905p;
            if (gVar != null) {
                gVar.f2277a.f2896f = null;
                SpellCheckerSession spellCheckerSession = gVar.f2279c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            Q q2 = this.f1903n;
            if (q2 != null) {
                ((p028p0.b) q2.f472g).f2896f = null;
            }
            l lVar = this.f1901l.f1979b;
            this.f1900k = false;
            lVar.f2233a.removeIsDisplayingFlutterUiListener(this.f1914z);
            lVar.g();
            lVar.f2233a.setSemanticsEnabled(false);
            View view = this.f1898i;
            if (view != null && this.f1897h == this.f1896g) {
                this.f1897h = view;
            }
            this.f1897h.c();
            C0102i c0102i = this.f1896g;
            if (c0102i != null) {
                c0102i.f1873e.close();
                removeView(this.f1896g);
                this.f1896g = null;
            }
            this.f1898i = null;
            this.f1901l = null;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        C0013n c0013n;
        C0013n c0013n2;
        j jVar = this.f1904o;
        if (Build.VERSION.SDK_INT < 26) {
            jVar.getClass();
            return;
        }
        p028p0.o oVar = jVar.f2297f;
        if (oVar == null || jVar.f2298g == null || (c0013n = oVar.f2966j) == null) {
            return;
        }
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            p028p0.o oVar2 = (p028p0.o) jVar.f2298g.get(sparseArray.keyAt(i2));
            if (oVar2 != null && (c0013n2 = oVar2.f2966j) != null) {
                String string = d.h(sparseArray.valueAt(i2)).getTextValue().toString();
                p028p0.q qVar = new p028p0.q(string, string.length(), string.length(), -1, -1);
                String str = (String) c0013n2.f258a;
                if (str.equals((String) c0013n.f258a)) {
                    jVar.f2299h.f(qVar);
                } else {
                    map.put(str, qVar);
                }
            }
        }
        int i3 = jVar.f2296e.f535c;
        Q q2 = jVar.f2295d;
        q2.getClass();
        String.valueOf(map.size());
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            p028p0.q qVar2 = (p028p0.q) entry.getValue();
            map2.put((String) entry.getKey(), Q.i(qVar2.f2972a, qVar2.f2973b, qVar2.f2974c, -1, -1));
        }
        ((C0026b) q2.f471f).F("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i3), map2), null);
    }

    public final void b() {
        k kVar = this.f1894e;
        if (kVar != null) {
            addView(kVar);
        } else {
            m mVar = this.f1895f;
            if (mVar != null) {
                addView(mVar);
            } else {
                addView(this.f1896g);
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final boolean c() {
        c cVar = this.f1901l;
        if (cVar != null) {
            if (cVar.f1979b == this.f1897h.getAttachedRenderer()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        c cVar = this.f1901l;
        if (cVar == null) {
            return super.checkInputConnectionProxy(view);
        }
        o oVar = cVar.f1995r;
        if (view == null) {
            oVar.getClass();
            return false;
        }
        HashMap map = oVar.f2351j;
        if (!map.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) map.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    public final void d() {
        boolean z2;
        String str;
        char c2 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f1909u;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                z2 = this.f1909u.isSpellCheckerEnabled() && textServicesManager.getEnabledSpellCheckerInfos().stream().anyMatch(new o());
            }
        }
        C0013n c0013n = this.f1901l.f1991n.f2956a;
        HashMap map = new HashMap();
        map.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        map.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z2));
        map.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1));
        map.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
        if (c2 == 1) {
            str = "light";
        } else {
            if (c2 != 2) {
                throw null;
            }
            str = "dark";
        }
        map.put("platformBrightness", str);
        Objects.toString(map.get("textScaleFactor"));
        Objects.toString(map.get("alwaysUse24HourFormat"));
        Objects.toString(map.get("platformBrightness"));
        if (!(Build.VERSION.SDK_INT >= 34) || displayMetrics == null) {
            c0013n.f(map, null);
            return;
        }
        m mVar = new m(displayMetrics);
        C0026b c0026b = n.f2955b;
        ((ConcurrentLinkedQueue) c0026b.f477g).add(mVar);
        m mVar2 = (m) c0026b.f478h;
        c0026b.f478h = mVar;
        Q q2 = mVar2 != null ? new Q(c0026b, mVar2, 17, false) : null;
        map.put("configurationId", Integer.valueOf(mVar.f2953a));
        c0013n.f(map, q2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f1907r.D(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f2 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.k kVar = this.f1911w;
        kVar.f2215a = f2;
        kVar.f2230p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        l lVar = this.f1901l.f1979b;
        lVar.getClass();
        if (kVar.f2216b <= 0 || kVar.f2217c <= 0 || kVar.f2215a <= 0.0f) {
            return;
        }
        ArrayList arrayList = kVar.f2231q;
        arrayList.size();
        ArrayList arrayList2 = kVar.f2232r;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            io.flutter.embedding.engine.renderer.c cVar = (io.flutter.embedding.engine.renderer.c) arrayList.get(i2);
            int i3 = i2 * 4;
            Rect rect = cVar.f2195a;
            iArr[i3] = rect.left;
            iArr[i3 + 1] = rect.top;
            iArr[i3 + 2] = rect.right;
            iArr[i3 + 3] = rect.bottom;
            iArr2[i2] = I.j.b(cVar.f2196b);
            iArr3[i2] = I.j.b(cVar.f2197c);
        }
        int size2 = arrayList.size() * 4;
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            io.flutter.embedding.engine.renderer.c cVar2 = (io.flutter.embedding.engine.renderer.c) arrayList2.get(i4);
            int i5 = (i4 * 4) + size2;
            Rect rect2 = cVar2.f2195a;
            iArr[i5] = rect2.left;
            iArr[i5 + 1] = rect2.top;
            iArr[i5 + 2] = rect2.right;
            iArr[i5 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i4] = I.j.b(cVar2.f2196b);
            iArr3[arrayList.size() + i4] = I.j.b(cVar2.f2197c);
        }
        lVar.f2233a.setViewportMetrics(kVar.f2215a, kVar.f2216b, kVar.f2217c, kVar.f2218d, kVar.f2219e, kVar.f2220f, kVar.f2221g, kVar.f2222h, kVar.f2223i, kVar.f2224j, kVar.f2225k, kVar.f2226l, kVar.f2227m, kVar.f2228n, kVar.f2229o, kVar.f2230p, iArr, iArr2, iArr3);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        k kVar = this.t;
        if (kVar == null || !kVar.f2482c.isEnabled()) {
            return null;
        }
        return this.t;
    }

    public c getAttachedFlutterEngine() {
        return this.f1901l;
    }

    public f getBinaryMessenger() {
        return this.f1901l.f1980c;
    }

    public C0102i getCurrentImageSurface() {
        return this.f1896g;
    }

    public io.flutter.embedding.engine.renderer.k getViewportMetrics() {
        return this.f1911w;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0131  */
    /* JADX WARN: Code duplicated, block: B:33:0x0139  */
    /* JADX WARN: Code duplicated, block: B:51:0x0179  */
    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        char c2;
        int systemWindowInsetBottom;
        Window window;
        DisplayCutout displayCutout;
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i2 = Build.VERSION.SDK_INT;
        io.flutter.embedding.engine.renderer.k kVar = this.f1911w;
        if (i2 == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            kVar.f2226l = systemGestureInsets.top;
            kVar.f2227m = systemGestureInsets.right;
            kVar.f2228n = systemGestureInsets.bottom;
            kVar.f2229o = systemGestureInsets.left;
        }
        boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z3 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i2 >= 30) {
            Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
            kVar.f2218d = insets.top;
            kVar.f2219e = insets.right;
            kVar.f2220f = insets.bottom;
            kVar.f2221g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            kVar.f2222h = insets2.top;
            kVar.f2223i = insets2.right;
            kVar.f2224j = insets2.bottom;
            kVar.f2225k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            kVar.f2226l = insets3.top;
            kVar.f2227m = insets3.right;
            kVar.f2228n = insets3.bottom;
            kVar.f2229o = insets3.left;
            DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                Insets waterfallInsets = displayCutout2.getWaterfallInsets();
                kVar.f2218d = Math.max(Math.max(kVar.f2218d, waterfallInsets.top), displayCutout2.getSafeInsetTop());
                kVar.f2219e = Math.max(Math.max(kVar.f2219e, waterfallInsets.right), displayCutout2.getSafeInsetRight());
                kVar.f2220f = Math.max(Math.max(kVar.f2220f, waterfallInsets.bottom), displayCutout2.getSafeInsetBottom());
                kVar.f2221g = Math.max(Math.max(kVar.f2221g, waterfallInsets.left), displayCutout2.getSafeInsetLeft());
            }
        } else {
            if (z3) {
                c2 = 1;
            } else {
                Context context = getContext();
                if (context.getResources().getConfiguration().orientation != 2) {
                    c2 = 1;
                } else {
                    int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
                    if (rotation == 1) {
                        c2 = 3;
                    } else if (rotation == 3) {
                        if (i2 >= 23) {
                            c2 = 2;
                        } else {
                            c2 = 3;
                        }
                    } else if (rotation == 0 || rotation == 2) {
                        c2 = 4;
                    } else {
                        c2 = 1;
                    }
                }
            }
            kVar.f2218d = z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            kVar.f2219e = (c2 == 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (!z3) {
                systemWindowInsetBottom = 0;
            } else if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            } else {
                systemWindowInsetBottom = 0;
            }
            kVar.f2220f = systemWindowInsetBottom;
            kVar.f2221g = (c2 == 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            kVar.f2222h = 0;
            kVar.f2223i = 0;
            kVar.f2224j = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
            kVar.f2225k = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i2 >= 28 && (displayCutout = windowInsets.getDisplayCutout()) != null) {
            for (Rect rect : displayCutout.getBoundingRects()) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.c(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = kVar.f2232r;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            s sVar = this.f1893B;
            Context context2 = getContext();
            sVar.getClass();
            Activity activityT = p000a.a.t(context2);
            WindowInsets rootWindowInsets = null;
            if (activityT != null && (window = activityT.getWindow()) != null) {
                rootWindowInsets = window.getDecorView().getRootWindowInsets();
            }
            List listEmptyList = rootWindowInsets == null ? Collections.emptyList() : rootWindowInsets.getBoundingRects(WindowInsets.Type.captionBar());
            int iMax = kVar.f2218d;
            Iterator it = listEmptyList.iterator();
            while (it.hasNext()) {
                iMax = Math.max(iMax, ((Rect) it.next()).bottom);
            }
            kVar.f2218d = iMax;
        }
        e();
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        D.j jVar;
        T0.d dVarA;
        z0.j jVar2 = z0.j.f3504e;
        int i2 = 1;
        super.onAttachedToWindow();
        try {
            Y.g gVar = h.f1090c;
            Context context = getContext();
            gVar.getClass();
            jVar = new D.j(18, new Q(Y.g.a(context)));
        } catch (NoClassDefFoundError unused) {
            jVar = null;
        }
        this.f1910v = jVar;
        Activity activityT = p000a.a.t(getContext());
        D.j jVar3 = this.f1910v;
        if (jVar3 == null || activityT == null) {
            return;
        }
        this.f1892A = new i(i2, this);
        Context context2 = getContext();
        Executor executorA = Build.VERSION.SDK_INT >= 28 ? p027p.b.a(context2) : new p036u.a(new Handler(context2.getMainLooper()));
        i iVar = this.f1892A;
        Q q2 = (Q) jVar3.f44f;
        I0.i.e(executorA, "executor");
        I0.i.e(iVar, "consumer");
        Y.b bVar = (Y.b) q2.f471f;
        bVar.getClass();
        T0.c cVar = new T0.c(new Y.j(bVar, activityT, null), jVar2, -2, 1);
        X0.d dVar = B.f672a;
        R0.c cVar2 = p.f1007a;
        if (cVar2.f(C0061t.f743f) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar2).toString());
        }
        if (!cVar2.equals(jVar2)) {
            dVarA = cVar;
            dVarA = U0.l.a(cVar, cVar2, 0, 0, 6);
        }
        dVarA = cVar;
        Q q3 = (Q) q2.f472g;
        q3.getClass();
        I0.i.e(dVarA, "flow");
        ReentrantLock reentrantLock = (ReentrantLock) q3.f471f;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = (LinkedHashMap) q3.f472g;
        try {
            if (linkedHashMap.get(iVar) == null) {
                z0.i j2 = new J(executorA);
                if (j2.f(C0061t.f743f) == null) {
                    j2 = j2.c(new T(null));
                }
                W.a aVar = new W.a(dVarA, iVar, null);
                z0.i iVarA = AbstractC0063v.a(j2, jVar2, true);
                X0.d dVar2 = B.f672a;
                if (iVarA != dVar2 && iVarA.f(e.f3503e) == null) {
                    iVarA = iVarA.c(dVar2);
                }
                AbstractC0043a e0Var = new e0(iVarA, true);
                e0Var.W(1, e0Var, aVar);
                linkedHashMap.put(iVar, e0Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f1901l != null) {
            this.f1906q.b(configuration);
            d();
            p000a.a.a(getContext(), this.f1901l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c0  */
    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i2;
        int i3;
        int i4;
        if (!c()) {
            return super.onCreateInputConnection(editorInfo);
        }
        j jVar = this.f1904o;
        C0026b c0026b = this.f1907r;
        C0038n c0038n = jVar.f2296e;
        int i5 = c0038n.f534b;
        if (i5 == 1) {
            jVar.f2301j = null;
            return null;
        }
        int i6 = 4;
        if (i5 == 4) {
            return null;
        }
        if (i5 == 3) {
            if (jVar.f2306o) {
                return jVar.f2301j;
            }
            InputConnection inputConnectionOnCreateInputConnection = jVar.f2302k.g(c0038n.f535c).onCreateInputConnection(editorInfo);
            jVar.f2301j = inputConnectionOnCreateInputConnection;
            return inputConnectionOnCreateInputConnection;
        }
        p028p0.o oVar = jVar.f2297f;
        p028p0.p pVar = oVar.f2963g;
        int i7 = pVar.f2969a;
        if (i7 != 2) {
            if (i7 == 5) {
                int i8 = pVar.f2970b ? 4098 : 2;
                if (pVar.f2971c) {
                    i2 = i8 | 8192;
                    i6 = i2;
                } else {
                    i6 = i8;
                }
            } else if (i7 == 6) {
                i6 = 3;
            } else if (i7 == 11) {
                i6 = 0;
            } else {
                if (i7 == 7) {
                    i2 = 131073;
                } else if (i7 == 8 || i7 == 13) {
                    i2 = 33;
                } else if (i7 == 9 || i7 == 12) {
                    i2 = 17;
                } else if (i7 == 10) {
                    i2 = 145;
                } else if (i7 == 3) {
                    i2 = 97;
                } else {
                    i2 = i7 == 4 ? 113 : 1;
                }
                if (oVar.f2957a) {
                    i3 = 524416;
                } else {
                    if (oVar.f2958b) {
                        i2 |= 32768;
                    }
                    if (oVar.f2959c) {
                        i4 = oVar.f2962f;
                        if (i4 == 1) {
                            i2 |= 4096;
                        } else if (i4 == 2) {
                            i2 |= 8192;
                        } else if (i4 == 3) {
                            i2 |= 16384;
                        }
                    } else {
                        i3 = 524432;
                    }
                    i6 = i2;
                }
                i2 |= i3;
                i4 = oVar.f2962f;
                if (i4 == 1) {
                    i2 |= 4096;
                } else if (i4 == 2) {
                    i2 |= 8192;
                } else if (i4 == 3) {
                    i2 |= 16384;
                }
                i6 = i2;
            }
        }
        editorInfo.inputType = i6;
        editorInfo.imeOptions = 33554432;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && !oVar.f2960d) {
            editorInfo.imeOptions = 50331648;
        }
        int iIntValue = oVar.f2964h.intValue();
        p028p0.o oVar2 = jVar.f2297f;
        String str = oVar2.f2965i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = iIntValue;
        }
        editorInfo.imeOptions = iIntValue | editorInfo.imeOptions;
        String[] strArr = oVar2.f2967k;
        if (strArr != null) {
            if (i9 >= 25) {
                editorInfo.contentMimeTypes = strArr;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
            }
        }
        if (i9 >= 34) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.b bVar = new io.flutter.plugin.editing.b(this, jVar.f2296e.f535c, jVar.f2295d, c0026b, jVar.f2299h, editorInfo);
        io.flutter.plugin.editing.e eVar = jVar.f2299h;
        eVar.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(eVar);
        io.flutter.plugin.editing.e eVar2 = jVar.f2299h;
        eVar2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(eVar2);
        jVar.f2301j = bVar;
        return bVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        i iVar;
        D.j jVar = this.f1910v;
        if (jVar != null && (iVar = this.f1892A) != null) {
            Q q2 = (Q) ((Q) jVar.f44f).f472g;
            q2.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) q2.f471f;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) q2.f472g;
            try {
                P p2 = (P) linkedHashMap.get(iVar);
                if (p2 != null) {
                    p2.a(null);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        this.f1892A = null;
        this.f1910v = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C0094a c0094a = this.f1908s;
            Context context = getContext();
            c0094a.getClass();
            boolean zIsFromSource = motionEvent.isFromSource(2);
            boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (zIsFromSource && z2) {
                int iB = C0094a.b(motionEvent.getActionMasked());
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0094a.a(motionEvent, motionEvent.getActionIndex(), iB, 0, C0094a.f1845f, byteBufferAllocateDirect, context);
                if (byteBufferAllocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c0094a.f1846a.f2233a.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.t.e(motionEvent, false);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
        j jVar = this.f1904o;
        if (Build.VERSION.SDK_INT < 26) {
            jVar.getClass();
            return;
        }
        if (jVar.f2298g != null) {
            String str = (String) jVar.f2297f.f2966j.f258a;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i3 = 0; i3 < jVar.f2298g.size(); i3++) {
                int iKeyAt = jVar.f2298g.keyAt(i3);
                C0013n c0013n = ((p028p0.o) jVar.f2298g.valueAt(i3)).f2966j;
                if (c0013n != null) {
                    viewStructure.addChildCount(1);
                    ViewStructure viewStructureNewChild = viewStructure.newChild(i3);
                    viewStructureNewChild.setAutofillId(autofillId, iKeyAt);
                    String[] strArr = (String[]) c0013n.f259b;
                    if (strArr.length > 0) {
                        viewStructureNewChild.setAutofillHints(strArr);
                    }
                    viewStructureNewChild.setAutofillType(1);
                    viewStructureNewChild.setVisibility(0);
                    String str2 = (String) c0013n.f261d;
                    if (str2 != null) {
                        viewStructureNewChild.setHint(str2);
                    }
                    if (str.hashCode() != iKeyAt || (rect = jVar.f2303l) == null) {
                        viewStructureNewChild.setDimens(0, 0, 0, 0, 1, 1);
                        viewStructureNewChild.setAutofillValue(AutofillValue.forText(((p028p0.q) c0013n.f260c).f2972a));
                    } else {
                        viewStructureNewChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), jVar.f2303l.height());
                        viewStructureNewChild.setAutofillValue(AutofillValue.forText(jVar.f2299h));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        io.flutter.embedding.engine.renderer.k kVar = this.f1911w;
        kVar.f2216b = i2;
        kVar.f2217c = i3;
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        this.f1908s.d(motionEvent, C0094a.f1845f);
        return true;
    }

    public void setDelegate(s sVar) {
        this.f1893B = sVar;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f1897h;
        if (view instanceof k) {
            ((k) view).setVisibility(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    @TargetApi(28)
    public void setWindowInfoListenerDisplayFeatures(Y.k kVar) {
        ?? r8 = kVar.f1097a;
        ArrayList arrayList = new ArrayList();
        for (Y.c cVar : r8) {
            cVar.f1078a.c().toString();
            V.b bVar = cVar.f1078a;
            int iB = bVar.b();
            Y.b bVar2 = Y.b.f1071h;
            int i2 = 2;
            int i3 = ((iB == 0 || bVar.a() == 0) ? Y.b.f1070g : bVar2) == bVar2 ? 3 : 2;
            Y.b bVar3 = Y.b.f1072i;
            Y.b bVar4 = cVar.f1080c;
            if (bVar4 != bVar3) {
                i2 = bVar4 == Y.b.f1073j ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.c(bVar.c(), i3, i2));
        }
        ArrayList arrayList2 = this.f1911w.f2231q;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public q(AbstractActivityC0098e abstractActivityC0098e, m mVar) {
        super(abstractActivityC0098e, null);
        this.f1899j = new HashSet();
        this.f1902m = new HashSet();
        this.f1911w = new io.flutter.embedding.engine.renderer.k();
        this.f1912x = new D.j(17, this);
        this.f1913y = new E.a(this, new Handler(Looper.getMainLooper()), 1);
        this.f1914z = new C0099f(2, this);
        this.f1893B = new s();
        this.f1895f = mVar;
        this.f1897h = mVar;
        b();
    }
}
