package p031r;

import a1.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p029q.g;
import p029q.h;
import p038v.i;

/* JADX INFO: loaded from: classes.dex */
public class f extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Class f3044m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Constructor f3045n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Method f3046o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Method f3047p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f3048q = false;

    public static boolean P(Object obj, String str, int i2, boolean z2) throws NoSuchMethodException {
        Q();
        try {
            return ((Boolean) f3046o.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void Q() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f3048q) {
            return;
        }
        f3048q = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f3045n = constructor;
        f3044m = cls;
        f3046o = method2;
        f3047p = method;
    }

    @Override // a1.a
    public Typeface g(Context context, g gVar, Resources resources, int i2) throws NoSuchMethodException {
        Q();
        try {
            Object objNewInstance = f3045n.newInstance(null);
            for (h hVar : gVar.f2991a) {
                File fileW = p000a.a.w(context);
                if (fileW == null) {
                    return null;
                }
                try {
                    if (!p000a.a.j(fileW, resources, hVar.f2997f)) {
                        return null;
                    }
                    if (!P(objNewInstance, fileW.getPath(), hVar.f2993b, hVar.f2994c)) {
                        return null;
                    }
                    fileW.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileW.delete();
                }
            }
            Q();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f3044m, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f3047p.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // a1.a
    public Typeface h(Context context, i[] iVarArr, int i2) {
        File file;
        if (iVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(l(iVarArr, i2).f3226a, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                    file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                } catch (ErrnoException unused) {
                }
                if (file != null && file.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceI = i(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceI;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
