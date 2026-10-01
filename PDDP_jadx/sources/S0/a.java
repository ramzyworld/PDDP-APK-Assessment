package S0;

import Q0.AbstractC0063v;
import Q0.C0048f;
import Q0.l0;
import V0.v;
import V0.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f773e = d.f803p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0048f f774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f775g;

    public a(b bVar) {
        this.f775g = bVar;
    }

    @Override // Q0.l0
    public final void a(v vVar, int i2) {
        C0048f c0048f = this.f774f;
        if (c0048f != null) {
            c0048f.a(vVar, i2);
        }
    }

    public final Object b(T0.f fVar) throws Throwable {
        C0048f c0048f;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f781l;
        b bVar = this.f775g;
        j jVar = (j) atomicReferenceFieldUpdater.get(bVar);
        while (true) {
            bVar.getClass();
            if (bVar.r(b.f776g.get(bVar), true)) {
                this.f773e = d.f799l;
                Throwable thL = bVar.l();
                if (thL == null) {
                    return Boolean.FALSE;
                }
                int i2 = w.f1015a;
                throw thL;
            }
            long andIncrement = b.f777h.getAndIncrement(bVar);
            long j2 = d.f789b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (jVar.f1014g != j3) {
                j jVarK = bVar.k(j3, jVar);
                if (jVarK == null) {
                    continue;
                } else {
                    jVar = jVarK;
                }
            }
            Object objA = bVar.A(jVar, i3, andIncrement, null);
            D.j jVar2 = d.f800m;
            if (objA == jVar2) {
                throw new IllegalStateException("unreachable");
            }
            D.j jVar3 = d.f802o;
            if (objA == jVar3) {
                if (andIncrement < bVar.p()) {
                    jVar.a();
                }
            } else {
                if (objA != d.f801n) {
                    jVar.a();
                    this.f773e = objA;
                    return Boolean.TRUE;
                }
                b bVar2 = this.f775g;
                C0048f c0048fC = AbstractC0063v.c(p000a.a.x(fVar));
                try {
                    this.f774f = c0048fC;
                    c0048f = c0048fC;
                    try {
                        Object objA2 = bVar2.A(jVar, i3, andIncrement, this);
                        if (objA2 != jVar2) {
                            V0.q qVar = null;
                            z0.i iVar = c0048f.f718i;
                            H0.l lVar = bVar2.f786f;
                            if (objA2 == jVar3) {
                                if (andIncrement < bVar2.p()) {
                                    jVar.a();
                                }
                                j jVar4 = (j) b.f781l.get(bVar2);
                                while (true) {
                                    if (bVar2.r(b.f776g.get(bVar2), true)) {
                                        C0048f c0048f2 = this.f774f;
                                        I0.i.b(c0048f2);
                                        this.f774f = null;
                                        this.f773e = d.f799l;
                                        Throwable thL2 = bVar.l();
                                        if (thL2 != null) {
                                            c0048f2.m(p000a.a.l(thL2));
                                            break;
                                        }
                                        c0048f2.m(Boolean.FALSE);
                                        break;
                                    }
                                    long andIncrement2 = b.f777h.getAndIncrement(bVar2);
                                    long j4 = d.f789b;
                                    long j5 = andIncrement2 / j4;
                                    int i4 = (int) (andIncrement2 % j4);
                                    if (jVar4.f1014g != j5) {
                                        j jVarK2 = bVar2.k(j5, jVar4);
                                        if (jVarK2 != null) {
                                            jVar4 = jVarK2;
                                        }
                                    }
                                    H0.l lVar2 = lVar;
                                    Object objA3 = bVar2.A(jVar4, i4, andIncrement2, this);
                                    if (objA3 == d.f800m) {
                                        a(jVar4, i4);
                                        break;
                                    }
                                    if (objA3 == d.f802o) {
                                        if (andIncrement2 < bVar2.p()) {
                                            jVar4.a();
                                        }
                                        lVar = lVar2;
                                    } else {
                                        if (objA3 == d.f801n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar4.a();
                                        this.f773e = objA3;
                                        this.f774f = null;
                                        bool = Boolean.TRUE;
                                        if (lVar2 != null) {
                                            qVar = new V0.q(lVar2, objA3, iVar);
                                        }
                                    }
                                }
                            } else {
                                jVar.a();
                                this.f773e = objA2;
                                this.f774f = null;
                                bool = Boolean.TRUE;
                                if (lVar != null) {
                                    qVar = new V0.q(lVar, objA2, iVar);
                                }
                            }
                            c0048f.l(bool, qVar);
                            break;
                        }
                        a(jVar, i3);
                        return c0048f.u();
                    } catch (Throwable th) {
                        th = th;
                        c0048f.B();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c0048f = c0048fC;
                }
            }
        }
    }
}
