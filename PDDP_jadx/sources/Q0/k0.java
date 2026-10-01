package Q0;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements z0.g, z0.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k0 f725e = new k0();

    @Override // z0.i
    public final z0.i c(z0.i iVar) {
        I0.i.e(iVar, "context");
        return iVar == z0.j.f3504e ? this : (z0.i) iVar.d(this, z0.b.f3499h);
    }

    @Override // z0.i
    public final Object d(Object obj, H0.p pVar) {
        return pVar.h(obj, this);
    }

    @Override // z0.i
    public final z0.g f(z0.h hVar) {
        return p000a.a.s(this, hVar);
    }

    @Override // z0.i
    public final z0.i h(z0.h hVar) {
        return p000a.a.z(this, hVar);
    }

    @Override // z0.g
    public final z0.h getKey() {
        return this;
    }
}
