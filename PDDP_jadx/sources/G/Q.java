package G;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends B0.g implements H0.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public I0.o f133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I0.o f136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S f137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f139o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(I0.o oVar, S s2, Object obj, boolean z2, z0.d dVar) {
        super(2, dVar);
        this.f136l = oVar;
        this.f137m = s2;
        this.f138n = obj;
        this.f139o = z2;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        Q q2 = new Q(this.f136l, this.f137m, this.f138n, this.f139o, dVar);
        q2.f135k = obj;
        return q2;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((Q) b((c0) obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    @Override // B0.b
    public final Object k(Object obj) {
        I0.o oVar;
        c0 c0Var;
        int iHashCode;
        A0.a aVar = A0.a.f0e;
        int i2 = this.f134j;
        I0.o oVar2 = this.f136l;
        Object obj2 = this.f138n;
        S s2 = this.f137m;
        if (i2 != 0) {
            if (i2 == 1) {
                oVar = this.f133i;
                c0Var = (c0) this.f135k;
                p000a.a.O(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p000a.a.O(obj);
            }
            if (this.f139o) {
                D.j jVar = s2.f147l;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                jVar.x(new C0003d(obj2, iHashCode, oVar2.f337e));
            }
            return p041x0.g.f3419a;
        }
        p000a.a.O(obj);
        c0 c0Var2 = (c0) this.f135k;
        l0 l0VarG = s2.g();
        this.f135k = c0Var2;
        this.f133i = oVar2;
        this.f134j = 1;
        Integer num = new Integer(((AtomicInteger) l0VarG.f246b.f44f).incrementAndGet());
        if (num == aVar) {
            return aVar;
        }
        oVar = oVar2;
        c0Var = c0Var2;
        obj = num;
        oVar.f337e = ((Number) obj).intValue();
        this.f135k = null;
        this.f133i = null;
        this.f134j = 2;
        if (c0Var.b(obj2, this) == aVar) {
            return aVar;
        }
        if (this.f139o) {
            D.j jVar2 = s2.f147l;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            jVar2.x(new C0003d(obj2, iHashCode, oVar2.f337e));
        }
        return p041x0.g.f3419a;
    }
}
