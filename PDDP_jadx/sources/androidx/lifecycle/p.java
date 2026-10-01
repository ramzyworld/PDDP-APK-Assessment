package androidx.lifecycle;

import G.C0013n;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p016j.C0121s;
import p039v0.C0145c;
import p039v0.C0148f;
import p039v0.C0150h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1603f;

    public /* synthetic */ p(int i2, Object obj) {
        this.f1602e = i2;
        this.f1603f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1602e) {
            case 0:
                s sVar = (s) this.f1603f;
                I0.i.e(sVar, "this$0");
                int i2 = sVar.f1606f;
                n nVar = sVar.f1610j;
                if (i2 == 0) {
                    sVar.f1607g = true;
                    nVar.c(f.ON_PAUSE);
                }
                if (sVar.f1605e == 0 && sVar.f1607g) {
                    nVar.c(f.ON_STOP);
                    sVar.f1608h = true;
                    return;
                }
                return;
            case 1:
                ((io.flutter.plugin.platform.o) this.f1603f).e(false);
                return;
            case 2:
                ((p019k0.b) this.f1603f).f2797b.f2804e.prefetchDefaultFontManager();
                return;
            case 3:
                ((C0121s) this.f1603f).getClass();
                return;
            default:
                C0145c c0145c = (C0145c) this.f1603f;
                I0.i.e(c0145c, "this$0");
                if (c0145c.f3335j) {
                    return;
                }
                while (true) {
                    WeakReference weakReference = (WeakReference) c0145c.f3330e.poll();
                    if (weakReference == null) {
                        c0145c.f3332g.postDelayed(c0145c.f3333h, c0145c.f3336k);
                        return;
                    }
                    HashMap map = c0145c.f3331f;
                    Object obj = null;
                    if (map instanceof J0.a) {
                        I0.s.c(map, "kotlin.collections.MutableMap");
                        throw null;
                    }
                    Long l2 = (Long) map.remove(weakReference);
                    if (l2 != null) {
                        c0145c.f3328c.remove(l2);
                        c0145c.f3329d.remove(l2);
                        long jLongValue = l2.longValue();
                        p028p0.b bVar = c0145c.f3326a;
                        C0150h c0150h = new C0150h(jLongValue);
                        C0148f c0148f = (C0148f) bVar.f2896f;
                        new C0013n(c0148f.f3350a, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (p030q0.j) C0148f.f3349b.a(), obj).f(a1.a.t(l2), new p011g0.t(3, c0150h));
                    }
                }
                break;
        }
    }
}
