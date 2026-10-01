package p031r;

import a1.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import p029q.h;
import p038v.i;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Class f3049m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Constructor f3050n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Method f3051o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Method f3052p;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f3050n = constructor;
        f3049m = cls;
        f3051o = method2;
        f3052p = method;
    }

    public static boolean P(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z2) {
        try {
            return ((Boolean) f3051o.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface Q(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f3049m, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f3052p.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a A[LOOP:0: B:9:0x0015->B:37:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0069 A[SYNTHETIC] */
    @Override // a1.a
    public final Typeface g(Context context, p029q.g gVar, Resources resources, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f3050n.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (h hVar : gVar.f2991a) {
            int i3 = hVar.f2997f;
            File fileW = p000a.a.w(context);
            if (fileW != null) {
                try {
                    if (p000a.a.j(fileW, resources, i3)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(fileW);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                fileW.delete();
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException unused2) {
                            map = null;
                        }
                    } else {
                        fileW.delete();
                    }
                    if (map == null) {
                        return null;
                    }
                    if (!P(objNewInstance, map, hVar.f2996e, hVar.f2993b, hVar.f2994c)) {
                        return null;
                    }
                } catch (Throwable th3) {
                    fileW.delete();
                    throw th3;
                }
            }
            map = null;
            if (map == null) {
                return null;
            }
            if (!P(objNewInstance, map, hVar.f2996e, hVar.f2993b, hVar.f2994c)) {
                return null;
            }
        }
        return Q(objNewInstance);
    }

    @Override // a1.a
    public final Typeface h(Context context, i[] iVarArr, int i2) {
        Object objNewInstance;
        try {
            objNewInstance = f3050n.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        p022m.i iVar = new p022m.i();
        for (i iVar2 : iVarArr) {
            Uri uri = iVar2.f3226a;
            ByteBuffer byteBufferA = (ByteBuffer) iVar.getOrDefault(uri, null);
            if (byteBufferA == null) {
                byteBufferA = p000a.a.A(context, uri);
                iVar.put(uri, byteBufferA);
            }
            if (byteBufferA == null) {
                return null;
            }
            if (!P(objNewInstance, byteBufferA, iVar2.f3227b, iVar2.f3228c, iVar2.f3229d)) {
                return null;
            }
        }
        Typeface typefaceQ = Q(objNewInstance);
        if (typefaceQ == null) {
            return null;
        }
        return Typeface.create(typefaceQ, i2);
    }
}
