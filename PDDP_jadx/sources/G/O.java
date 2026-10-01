package G;

/* JADX INFO: loaded from: classes.dex */
public final class O extends B0.g implements H0.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f126i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f127j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f128k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(S s2, z0.d dVar) {
        super(2, dVar);
        this.f128k = s2;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        O o2 = new O(this.f128k, dVar);
        o2.f127j = obj;
        return o2;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((O) b((e0) obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        A0.a aVar = A0.a.f0e;
        int i2 = this.f126i;
        if (i2 == 0) {
            p000a.a.O(obj);
            e0 e0Var = (e0) this.f127j;
            this.f126i = 1;
            if (S.b(this.f128k, e0Var, this) == aVar) {
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
