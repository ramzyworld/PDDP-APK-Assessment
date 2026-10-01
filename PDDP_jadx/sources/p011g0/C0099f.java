package p011g0;

import android.os.Build;
import io.flutter.embedding.engine.renderer.l;
import io.flutter.embedding.engine.renderer.m;
import java.util.Iterator;

/* JADX INFO: renamed from: g0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0099f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1859b;

    public /* synthetic */ C0099f(int i2, Object obj) {
        this.f1858a = i2;
        this.f1859b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a() {
        switch (this.f1858a) {
            case 0:
                C0101h c0101h = (C0101h) this.f1859b;
                c0101h.f1862a.getClass();
                c0101h.f1868g = false;
                break;
            case 1:
                break;
            default:
                q qVar = (q) this.f1859b;
                qVar.f1900k = false;
                Iterator it = qVar.f1899j.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).a();
                }
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        switch (this.f1858a) {
            case 0:
                C0101h c0101h = (C0101h) this.f1859b;
                AbstractActivityC0098e abstractActivityC0098e = c0101h.f1862a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0098e.reportFullyDrawn();
                } else {
                    abstractActivityC0098e.getClass();
                }
                c0101h.f1868g = true;
                c0101h.f1869h = true;
                break;
            case 1:
                k kVar = (k) this.f1859b;
                kVar.setAlpha(1.0f);
                l lVar = kVar.f1882g;
                if (lVar != null) {
                    lVar.f2233a.removeIsDisplayingFlutterUiListener(this);
                }
                break;
            default:
                q qVar = (q) this.f1859b;
                qVar.f1900k = true;
                Iterator it = qVar.f1899j.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).b();
                }
                break;
        }
    }

    private final void c() {
    }
}
