package G;

/* JADX INFO: loaded from: classes.dex */
public final class E extends B0.g implements H0.l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Throwable f86i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f87j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f88k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(S s2, z0.d dVar) {
        super(1, dVar);
        this.f88k = s2;
    }

    @Override // H0.l
    public final Object j(Object obj) {
        return new E(this.f88k, (z0.d) obj).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        Throwable th;
        m0 f0Var;
        A0.a aVar = A0.a.f0e;
        int i2 = this.f87j;
        S s2 = this.f88k;
        try {
            if (i2 == 0) {
                p000a.a.O(obj);
                this.f87j = 1;
                obj = S.f(s2, true, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = this.f86i;
                    p000a.a.O(obj);
                    f0Var = new f0(th, ((Number) obj).intValue());
                    return new p041x0.b(f0Var, Boolean.TRUE);
                }
                p000a.a.O(obj);
            }
            f0Var = (m0) obj;
        } catch (Throwable th2) {
            l0 l0VarG = s2.g();
            this.f86i = th2;
            this.f87j = 2;
            Integer numA = l0VarG.a();
            if (numA == aVar) {
                return aVar;
            }
            th = th2;
            obj = numA;
        }
        return new p041x0.b(f0Var, Boolean.TRUE);
    }
}
