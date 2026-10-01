package p014i;

import D.j;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f2038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f2039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f2040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f2041h;

    public e(j jVar, f fVar, k kVar, j jVar2) {
        this.f2041h = jVar;
        this.f2038e = fVar;
        this.f2039f = kVar;
        this.f2040g = jVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f2038e;
        if (fVar != null) {
            j jVar = this.f2041h;
            ((g) jVar.f44f).f2048D = true;
            fVar.f2043b.c(false);
            ((g) jVar.f44f).f2048D = false;
        }
        k kVar = this.f2039f;
        if (kVar.isEnabled() && kVar.hasSubMenu()) {
            this.f2040g.p(kVar, null, 4);
        }
    }
}
