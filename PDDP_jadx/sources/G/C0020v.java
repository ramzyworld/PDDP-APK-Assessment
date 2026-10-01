package G;

import Q0.AbstractC0063v;

/* JADX INFO: renamed from: G.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0020v extends B0.g implements H0.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0003d f282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f285l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0020v(S s2, z0.d dVar) {
        super(2, dVar);
        this.f285l = s2;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        C0020v c0020v = new C0020v(this.f285l, dVar);
        c0020v.f284k = obj;
        return c0020v;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((C0020v) b((T0.e) obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    @Override // B0.b
    public final Object k(Object obj) throws Throwable {
        T0.e eVar;
        m0 m0Var;
        T0.i iVar;
        Object objG;
        A0.a aVar = A0.a.f0e;
        int i2 = this.f283j;
        p041x0.g gVar = p041x0.g.f3419a;
        S s2 = this.f285l;
        if (i2 != 0) {
            if (i2 == 1) {
                T0.e eVar2 = (T0.e) this.f284k;
                p000a.a.O(obj);
                eVar = eVar2;
            } else if (i2 == 2) {
                m0Var = this.f282i;
                eVar = (T0.e) this.f284k;
                p000a.a.O(obj);
                iVar = new T0.i(new D.j(2, new N.Q(3, new N.Q(4, new N.Q(2, new C0015p(s2, null), (T0.q) s2.f147l.f44f), new C0016q(2, null)), new r(m0Var, null))), new C0017s(s2, (z0.d) null));
                this.f284k = null;
                this.f282i = null;
                this.f283j = 3;
                if (!(eVar instanceof T0.t)) {
                    throw ((T0.t) eVar).f905e;
                }
                objG = iVar.g(eVar, this);
                if (objG != aVar) {
                    objG = gVar;
                }
                if (objG == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p000a.a.O(obj);
            }
            return gVar;
        }
        p000a.a.O(obj);
        T0.e eVar3 = (T0.e) this.f284k;
        this.f284k = eVar3;
        this.f283j = 1;
        Object objN = AbstractC0063v.n(s2.f142g.k(), new J(s2, null), this);
        if (objN == aVar) {
            return aVar;
        }
        eVar = eVar3;
        obj = objN;
        m0Var = (m0) obj;
        if (m0Var instanceof C0003d) {
            Object obj2 = ((C0003d) m0Var).f189b;
            this.f284k = eVar;
            this.f282i = (C0003d) m0Var;
            this.f283j = 2;
            if (eVar.a(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (m0Var instanceof n0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (m0Var instanceof f0) {
                throw ((f0) m0Var).f203b;
            }
            if (m0Var instanceof d0) {
                return gVar;
            }
        }
        iVar = new T0.i(new D.j(2, new N.Q(3, new N.Q(4, new N.Q(2, new C0015p(s2, null), (T0.q) s2.f147l.f44f), new C0016q(2, null)), new r(m0Var, null))), new C0017s(s2, (z0.d) null));
        this.f284k = null;
        this.f282i = null;
        this.f283j = 3;
        if (!(eVar instanceof T0.t)) {
            throw ((T0.t) eVar).f905e;
        }
        objG = iVar.g(eVar, this);
        if (objG != aVar) {
            objG = gVar;
        }
        if (objG == aVar) {
            return aVar;
        }
        return gVar;
    }
}
