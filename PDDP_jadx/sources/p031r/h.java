package p031r;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000a.a;
import p029q.g;
import p038v.i;

/* JADX INFO: loaded from: classes.dex */
public class h extends f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Class f3053r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Constructor f3054s;
    public final Method t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Method f3055u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Method f3056v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Method f3057w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Method f3058x;

    public h() throws NoSuchMethodException {
        Method methodY;
        Constructor<?> constructor;
        Method methodX;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodX = X(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodY = Y(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            methodY = null;
            constructor = null;
            methodX = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f3053r = cls;
        this.f3054s = constructor;
        this.t = methodX;
        this.f3055u = method;
        this.f3056v = method2;
        this.f3057w = method3;
        this.f3058x = methodY;
    }

    public static Method X(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void R(Object obj) {
        try {
            this.f3057w.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean S(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.t.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface T(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f3053r, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f3058x.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean U(Object obj) {
        try {
            return ((Boolean) this.f3056v.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean V() {
        Method method = this.t;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object W() {
        try {
            return this.f3054s.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method Y(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p031r.f, a1.a
    public final Typeface g(Context context, g gVar, Resources resources, int i2) {
        if (!V()) {
            return super.g(context, gVar, resources, i2);
        }
        Object objW = W();
        if (objW == null) {
            return null;
        }
        for (p029q.h hVar : gVar.f2991a) {
            if (!S(context, objW, hVar.f2992a, hVar.f2996e, hVar.f2993b, hVar.f2994c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.f2995d))) {
                R(objW);
                return null;
            }
        }
        if (U(objW)) {
            return T(objW);
        }
        return null;
    }

    @Override // p031r.f, a1.a
    public final Typeface h(Context context, i[] iVarArr, int i2) {
        Typeface typefaceT;
        boolean zBooleanValue;
        if (iVarArr.length < 1) {
            return null;
        }
        if (!V()) {
            i iVarL = l(iVarArr, i2);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(iVarL.f3226a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(iVarL.f3228c).setItalic(iVarL.f3229d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (i iVar : iVarArr) {
            if (iVar.f3230e == 0) {
                Uri uri = iVar.f3226a;
                if (!map.containsKey(uri)) {
                    map.put(uri, a.A(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objW = W();
        if (objW == null) {
            return null;
        }
        boolean z2 = false;
        for (i iVar2 : iVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(iVar2.f3226a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.f3055u.invoke(objW, byteBuffer, Integer.valueOf(iVar2.f3227b), null, Integer.valueOf(iVar2.f3228c), Integer.valueOf(iVar2.f3229d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    R(objW);
                    return null;
                }
                z2 = true;
            }
        }
        if (!z2) {
            R(objW);
            return null;
        }
        if (U(objW) && (typefaceT = T(objW)) != null) {
            return Typeface.create(typefaceT, i2);
        }
        return null;
    }

    @Override // a1.a
    public final Typeface j(Context context, Resources resources, int i2, String str, int i3) {
        if (!V()) {
            return super.j(context, resources, i2, str, i3);
        }
        Object objW = W();
        if (objW == null) {
            return null;
        }
        if (!S(context, objW, str, 0, -1, -1, null)) {
            R(objW);
            return null;
        }
        if (U(objW)) {
            return T(objW);
        }
        return null;
    }
}
