package S0;

import Q0.l0;
import V0.AbstractC0068a;

/* JADX INFO: loaded from: classes.dex */
public final class m extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f814p;

    public m(int i2, int i3, H0.l lVar) {
        super(i2, lVar);
        this.f814p = i3;
        if (i3 == 1) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + I0.q.a(b.class).b() + " instead").toString());
        }
        if (i2 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i2 + " was specified").toString());
    }

    public final Object D(Object obj, boolean z2) {
        j jVar;
        H0.l lVar;
        O.c cVarA;
        p041x0.g gVar = p041x0.g.f3419a;
        if (this.f814p == 3) {
            Object objJ = super.j(obj);
            if (!(objJ instanceof h) || (objJ instanceof g)) {
                return objJ;
            }
            if (!z2 || (lVar = this.f786f) == null || (cVarA = AbstractC0068a.a(lVar, obj, null)) == null) {
                return gVar;
            }
            throw cVarA;
        }
        p030q0.d dVar = d.f791d;
        j jVar2 = (j) b.f780k.get(this);
        while (true) {
            long andIncrement = b.f776g.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zR = r(andIncrement, false);
            int i2 = d.f789b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (jVar2.f1014g != j4) {
                j jVarB = b.b(this, j4, jVar2);
                if (jVarB != null) {
                    jVar = jVarB;
                } else if (zR) {
                    return new g(o());
                }
            } else {
                jVar = jVar2;
            }
            int iD = b.d(this, jVar, i3, obj, j2, dVar, zR);
            if (iD == 0) {
                jVar.a();
                return gVar;
            }
            if (iD == 1) {
                return gVar;
            }
            if (iD == 2) {
                if (zR) {
                    jVar.h();
                    return new g(o());
                }
                l0 l0Var = dVar instanceof l0 ? (l0) dVar : null;
                if (l0Var != null) {
                    l0Var.a(jVar, i3 + i2);
                }
                h((jVar.f1014g * j3) + ((long) i3));
                return gVar;
            }
            if (iD == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iD == 4) {
                if (j2 < b.f777h.get(this)) {
                    jVar.a();
                }
                return new g(o());
            }
            if (iD == 5) {
                jVar.a();
            }
            jVar2 = jVar;
        }
    }

    @Override // S0.b, S0.r
    public final Object j(Object obj) {
        return D(obj, false);
    }

    @Override // S0.b, S0.r
    public final Object n(Object obj, z0.d dVar) throws Throwable {
        O.c cVarA;
        if (!(D(obj, true) instanceof g)) {
            return p041x0.g.f3419a;
        }
        H0.l lVar = this.f786f;
        if (lVar == null || (cVarA = AbstractC0068a.a(lVar, obj, null)) == null) {
            throw o();
        }
        a1.a.c(cVarA, o());
        throw cVarA;
    }

    @Override // S0.b
    public final boolean t() {
        return this.f814p == 2;
    }
}
