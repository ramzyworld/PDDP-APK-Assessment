package p038v;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p011g0.F;
import p022m.d;
import p022m.i;
import p031r.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f3222a = new d(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f3223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f3224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f3225d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new k());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f3223b = threadPoolExecutor;
        f3224c = new Object();
        f3225d = new i();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[EDGE_INSN: B:10:0x0020->B:24:0x003d BREAK  A[LOOP:0: B:17:0x002d->B:23:0x003a]] */
    public static g a(String str, Context context, d dVar, int i2) {
        d dVar2 = f3222a;
        Typeface typeface = (Typeface) dVar2.a(str);
        if (typeface != null) {
            return new g(typeface);
        }
        try {
            F fA = c.a(context, dVar);
            int i3 = 1;
            i[] iVarArr = (i[]) fA.f1838b;
            int i4 = fA.f1837a;
            if (i4 != 0) {
                if (i4 != 1) {
                    i3 = -3;
                    break;
                }
                i3 = -2;
            } else if (iVarArr != null && iVarArr.length != 0) {
                i3 = 0;
                for (i iVar : iVarArr) {
                    int i5 = iVar.f3230e;
                    if (i5 != 0) {
                        if (i5 >= 0) {
                            i3 = i5;
                            break;
                        }
                        i3 = -3;
                        break;
                    }
                }
            }
            if (i3 != 0) {
                return new g(i3);
            }
            Typeface typefaceH = e.f3042a.h(context, iVarArr, i2);
            if (typefaceH == null) {
                return new g(-3);
            }
            dVar2.b(str, typefaceH);
            return new g(typefaceH);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(-1);
        }
    }
}
