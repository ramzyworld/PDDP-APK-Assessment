package p031r;

import L.h;
import N.Q;
import a1.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p016j.C0121s;
import p022m.d;
import p028p0.b;
import p029q.f;
import p029q.i;
import p038v.g;
import p038v.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f3043b;

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f3042a = new j();
        } else if (i2 >= 28) {
            f3042a = new i();
        } else if (i2 >= 26) {
            f3042a = new h();
        } else if (i2 < 24) {
            f3042a = new f();
        } else {
            Method method = g.f3051o;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f3042a = new g();
            } else {
                f3042a = new f();
            }
        }
        f3043b = new d(16);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, f fVar, Resources resources, int i2, String str, int i3, int i4, C0121s c0121s) {
        Typeface typefaceG;
        Typeface typefaceCreate;
        Typeface typeface;
        int i5 = 3;
        int i6 = 1;
        boolean z2 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (fVar instanceof i) {
            i iVar = (i) fVar;
            String str2 = iVar.f3001d;
            typefaceG = null;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                new Handler(Looper.getMainLooper()).post(new h(i6, c0121s, typefaceCreate));
                return typefaceCreate;
            }
            boolean z3 = iVar.f3000c == 0;
            int i7 = iVar.f2999b;
            Handler handler = new Handler(Looper.getMainLooper());
            b bVar = new b();
            bVar.f2896f = c0121s;
            p038v.d dVar = iVar.f2998a;
            Q q2 = new Q(25, bVar, handler);
            if (z3) {
                d dVar2 = p038v.h.f3222a;
                String str3 = ((String) dVar.f3211e) + "-" + i4;
                typeface = (Typeface) p038v.h.f3222a.a(str3);
                if (typeface != null) {
                    handler.post(new V0.i(bVar, typeface, i5, z2));
                    typefaceG = typeface;
                } else if (i7 == -1) {
                    g gVarA = p038v.h.a(str3, context, dVar, i4);
                    q2.k(gVarA);
                    typefaceG = gVarA.f3220a;
                } else {
                    try {
                        try {
                            g gVar = (g) p038v.h.f3223b.submit(new p038v.e(str3, context, dVar, i4, 0)).get(i7, TimeUnit.MILLISECONDS);
                            q2.k(gVar);
                            typefaceG = gVar.f3220a;
                        } catch (InterruptedException e2) {
                            throw e2;
                        } catch (ExecutionException e3) {
                            throw new RuntimeException(e3);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) q2.f472g).post(new D.b((b) q2.f471f, -3));
                    }
                }
            } else {
                d dVar3 = p038v.h.f3222a;
                String str4 = ((String) dVar.f3211e) + "-" + i4;
                typeface = (Typeface) p038v.h.f3222a.a(str4);
                if (typeface != null) {
                    handler.post(new V0.i(bVar, typeface, i5, objArr2 == true ? 1 : 0));
                    typefaceG = typeface;
                } else {
                    p038v.f fVar2 = new p038v.f(objArr == true ? 1 : 0, q2);
                    synchronized (p038v.h.f3224c) {
                        try {
                            p022m.i iVar2 = p038v.h.f3225d;
                            ArrayList arrayList = (ArrayList) iVar2.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(fVar2);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(fVar2);
                                iVar2.put(str4, arrayList2);
                                p038v.e eVar = new p038v.e(str4, context, dVar, i4, 1);
                                ThreadPoolExecutor threadPoolExecutor = p038v.h.f3223b;
                                p038v.f fVar3 = new p038v.f(i6, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                l lVar = new l();
                                lVar.f3232e = eVar;
                                lVar.f3233f = fVar3;
                                lVar.f3234g = handler2;
                                threadPoolExecutor.execute(lVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } else {
            typefaceG = f3042a.g(context, (p029q.g) fVar, resources, i4);
            if (typefaceG != null) {
                new Handler(Looper.getMainLooper()).post(new h(i6, c0121s, typefaceG));
            } else {
                c0121s.a();
            }
        }
        if (typefaceG != null) {
            f3043b.b(b(resources, i2, str, i3, i4), typefaceG);
        }
        return typefaceG;
    }

    public static String b(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }
}
