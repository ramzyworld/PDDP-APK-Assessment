package U0;

/* JADX INFO: loaded from: classes.dex */
public final class s implements z0.d, B0.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z0.d f939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z0.i f940f;

    public s(z0.d dVar, z0.i iVar) {
        this.f939e = dVar;
        this.f940f = iVar;
    }

    @Override // B0.c
    public final B0.c g() {
        z0.d dVar = this.f939e;
        if (dVar instanceof B0.c) {
            return (B0.c) dVar;
        }
        return null;
    }

    @Override // z0.d
    public final z0.i i() {
        return this.f940f;
    }

    @Override // z0.d
    public final void m(Object obj) {
        this.f939e.m(obj);
    }
}
