package L;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p024n.h f406a = new p024n.h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f407b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static H.a f408c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? n.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static H.a b() {
        H.a aVar = new H.a(6);
        f408c = aVar;
        p024n.h hVar = f406a;
        hVar.getClass();
        if (p024n.g.f2881f.e(hVar, null, aVar)) {
            p024n.g.b(hVar);
        }
        return f408c;
    }

    public static void c(Context context, boolean z2) {
        o oVarA;
        int i2;
        if (z2 || f408c == null) {
            synchronized (f407b) {
                if (!z2) {
                    try {
                        if (f408c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i4 = 0;
                    boolean z3 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z4 = file2.exists() && length2 > 0;
                    try {
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                oVarA = o.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            oVarA = null;
                        }
                        if (oVarA != null && oVarA.f404c == jA && (i2 = oVarA.f403b) != 2) {
                            i4 = i2;
                        } else if (z3) {
                            i4 = 1;
                        } else if (z4) {
                            i4 = 2;
                        }
                        if (z2 && z4 && i4 != 1) {
                            i4 = 2;
                        }
                        o oVar = new o(1, (oVarA == null || oVarA.f403b != 2 || i4 != 1 || length >= oVarA.f405d) ? i4 : 3, jA, length2);
                        if (oVarA == null || !oVarA.equals(oVar)) {
                            try {
                                oVar.b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
