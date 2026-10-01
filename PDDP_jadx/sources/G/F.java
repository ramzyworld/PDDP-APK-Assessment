package G;

/* JADX INFO: loaded from: classes.dex */
public final class F extends B0.g implements H0.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Throwable f89i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f90j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f91k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f92l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f93m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(S s2, int i2, z0.d dVar) {
        super(2, dVar);
        this.f92l = s2;
        this.f93m = i2;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        F f2 = new F(this.f92l, this.f93m, dVar);
        f2.f91k = ((Boolean) obj).booleanValue();
        return f2;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((F) b(bool, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    @Override // B0.b
    public final Object k(Object obj) {
        Throwable th;
        int iIntValue;
        ?? r1;
        ?? r2;
        m0 m0Var;
        ?? r3;
        A0.a aVar = A0.a.f0e;
        ?? r4 = this.f90j;
        S s2 = this.f92l;
        try {
            if (r4 == 0) {
                p000a.a.O(obj);
                boolean z2 = this.f91k;
                this.f91k = z2;
                this.f90j = 1;
                obj = S.f(s2, z2, this);
                r4 = z2;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (r4 != 1) {
                    if (r4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = this.f91k;
                    th = this.f89i;
                    p000a.a.O(obj);
                    r2 = z3;
                    iIntValue = ((Number) obj).intValue();
                    r1 = r2;
                    f0 f0Var = new f0(th, iIntValue);
                    r3 = r1;
                    m0Var = f0Var;
                    return new p041x0.b(m0Var, Boolean.valueOf((boolean) r3));
                }
                boolean z4 = this.f91k;
                p000a.a.O(obj);
                r4 = z4;
            }
            m0Var = (m0) obj;
            r3 = r4;
        } catch (Throwable th2) {
            if (r4 != 0) {
                l0 l0VarG = s2.g();
                this.f89i = th2;
                this.f91k = r4;
                this.f90j = 2;
                Integer numA = l0VarG.a();
                if (numA == aVar) {
                    return aVar;
                }
                r2 = r4;
                th = th2;
                obj = numA;
            } else {
                ?? r5 = r4;
                th = th2;
                iIntValue = this.f93m;
                r1 = r5 == true ? 1 : 0;
            }
            f0 f0Var2 = new f0(th, iIntValue);
            r3 = r1;
            m0Var = f0Var2;
            return new p041x0.b(m0Var, Boolean.valueOf((boolean) r3));
        }
        return new p041x0.b(m0Var, Boolean.valueOf((boolean) r3));
    }
}
