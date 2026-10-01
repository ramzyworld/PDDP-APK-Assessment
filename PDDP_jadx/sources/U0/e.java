package U0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends B0.g implements H0.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f f917k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, z0.d dVar) {
        super(2, dVar);
        this.f917k = fVar;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        e eVar = new e(this.f917k, dVar);
        eVar.f916j = obj;
        return eVar;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((e) b((S0.p) obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        A0.a aVar = A0.a.f0e;
        int i2 = this.f915i;
        if (i2 == 0) {
            p000a.a.O(obj);
            S0.p pVar = (S0.p) this.f916j;
            this.f915i = 1;
            if (this.f917k.a(pVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p000a.a.O(obj);
        }
        return p041x0.g.f3419a;
    }
}
