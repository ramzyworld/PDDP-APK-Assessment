package U0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends B0.g implements H0.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h f923k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, z0.d dVar) {
        super(2, dVar);
        this.f923k = hVar;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        g gVar = new g(this.f923k, dVar);
        gVar.f922j = obj;
        return gVar;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((g) b((T0.e) obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        A0.a aVar = A0.a.f0e;
        int i2 = this.f921i;
        p041x0.g gVar = p041x0.g.f3419a;
        if (i2 == 0) {
            p000a.a.O(obj);
            T0.e eVar = (T0.e) this.f922j;
            this.f921i = 1;
            Object objG = this.f923k.f924h.g(eVar, this);
            if (objG != aVar) {
                objG = gVar;
            }
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p000a.a.O(obj);
        }
        return gVar;
    }
}
