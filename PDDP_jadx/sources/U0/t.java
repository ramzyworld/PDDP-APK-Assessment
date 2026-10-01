package U0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends B0.g implements H0.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f941i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T0.e f943k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(T0.e eVar, z0.d dVar) {
        super(2, dVar);
        this.f943k = eVar;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        t tVar = new t(this.f943k, dVar);
        tVar.f942j = obj;
        return tVar;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((t) b(obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        A0.a aVar = A0.a.f0e;
        int i2 = this.f941i;
        if (i2 == 0) {
            p000a.a.O(obj);
            Object obj2 = this.f942j;
            this.f941i = 1;
            if (this.f943k.a(obj2, this) == aVar) {
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
