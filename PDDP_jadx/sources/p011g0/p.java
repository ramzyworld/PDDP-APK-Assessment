package p011g0;

import io.flutter.embedding.engine.renderer.l;
import io.flutter.embedding.engine.renderer.m;

/* JADX INFO: loaded from: classes.dex */
public final class p implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f1889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.p f1890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f1891c;

    public p(q qVar, l lVar, androidx.lifecycle.p pVar) {
        this.f1891c = qVar;
        this.f1889a = lVar;
        this.f1890b = pVar;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        C0102i c0102i;
        this.f1889a.f2233a.removeIsDisplayingFlutterUiListener(this);
        this.f1890b.run();
        q qVar = this.f1891c;
        if ((qVar.f1897h instanceof C0102i) || (c0102i = qVar.f1896g) == null) {
            return;
        }
        c0102i.c();
        C0102i c0102i2 = qVar.f1896g;
        if (c0102i2 != null) {
            c0102i2.f1873e.close();
            qVar.removeView(qVar.f1896g);
            qVar.f1896g = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a() {
    }
}
