package G;

/* JADX INFO: renamed from: G.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0016q extends B0.g implements H0.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f269i;

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        C0016q c0016q = new C0016q(2, dVar);
        c0016q.f269i = obj;
        return c0016q;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((C0016q) b((m0) obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        p000a.a.O(obj);
        return Boolean.valueOf(!(((m0) this.f269i) instanceof d0));
    }
}
