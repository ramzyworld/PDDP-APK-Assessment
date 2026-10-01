package z0;

import H0.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f3497e;

    public a(h hVar) {
        this.f3497e = hVar;
    }

    @Override // z0.i
    public final i c(i iVar) {
        I0.i.e(iVar, "context");
        return iVar == j.f3504e ? this : (i) iVar.d(this, b.f3499h);
    }

    @Override // z0.i
    public final Object d(Object obj, p pVar) {
        return pVar.h(obj, this);
    }

    @Override // z0.i
    public g f(h hVar) {
        return p000a.a.s(this, hVar);
    }

    @Override // z0.g
    public final h getKey() {
        return this.f3497e;
    }

    @Override // z0.i
    public i h(h hVar) {
        return p000a.a.z(this, hVar);
    }
}
