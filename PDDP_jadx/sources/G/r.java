package G;

/* JADX INFO: loaded from: classes.dex */
public final class r extends B0.g implements H0.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f272i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m0 f273j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(m0 m0Var, z0.d dVar) {
        super(2, dVar);
        this.f273j = m0Var;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        r rVar = new r(this.f273j, dVar);
        rVar.f272i = obj;
        return rVar;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((r) b((m0) obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        p000a.a.O(obj);
        m0 m0Var = (m0) this.f272i;
        return Boolean.valueOf((m0Var instanceof C0003d) && m0Var.f257a <= this.f273j.f257a);
    }
}
