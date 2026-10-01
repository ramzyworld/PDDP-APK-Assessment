package Y0;

import G.C0013n;
import G.M;
import G.N;
import H0.l;
import Q0.l0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class b extends I0.j implements l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1105h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        super(1);
        this.f1103f = i2;
        this.f1104g = obj;
        this.f1105h = obj2;
    }

    @Override // H0.l
    public final Object j(Object obj) {
        Object gVar;
        S0.j jVar;
        p041x0.g gVar2;
        p041x0.g gVar3;
        switch (this.f1103f) {
            case 0:
                ((c) this.f1105h).getClass();
                ((d) this.f1104g).e(null);
                return p041x0.g.f3419a;
            case 1:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1108g;
                ((c) this.f1105h).getClass();
                d dVar = (d) this.f1104g;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return p041x0.g.f3419a;
            default:
                Throwable th = (Throwable) obj;
                ((M) this.f1104g).j(th);
                C0013n c0013n = (C0013n) this.f1105h;
                ((S0.b) c0013n.f260c).f(th, false);
                do {
                    S0.b bVar = (S0.b) c0013n.f260c;
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = S0.b.f777h;
                    long j2 = atomicLongFieldUpdater.get(bVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = S0.b.f776g;
                    long j3 = atomicLongFieldUpdater2.get(bVar);
                    boolean z2 = true;
                    if (bVar.r(j3, true)) {
                        gVar = new S0.g(bVar.l());
                    } else {
                        long j4 = j3 & 1152921504606846975L;
                        Object obj2 = S0.i.f811a;
                        if (j2 >= j4) {
                            gVar = obj2;
                        } else {
                            Object obj3 = S0.d.f798k;
                            S0.j jVar2 = (S0.j) S0.b.f781l.get(bVar);
                            while (true) {
                                if (bVar.r(atomicLongFieldUpdater2.get(bVar), z2)) {
                                    gVar = new S0.g(bVar.l());
                                } else {
                                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar);
                                    long j5 = S0.d.f789b;
                                    Object obj4 = obj2;
                                    long j6 = andIncrement / j5;
                                    int i2 = (int) (andIncrement % j5);
                                    if (jVar2.f1014g != j6) {
                                        S0.j jVarK = bVar.k(j6, jVar2);
                                        if (jVarK == null) {
                                            continue;
                                        } else {
                                            jVar = jVarK;
                                        }
                                        obj2 = obj4;
                                        z2 = true;
                                    } else {
                                        jVar = jVar2;
                                    }
                                    Object objA = bVar.A(jVar, i2, andIncrement, obj3);
                                    if (objA == S0.d.f800m) {
                                        l0 l0Var = obj3 instanceof l0 ? (l0) obj3 : null;
                                        if (l0Var != null) {
                                            l0Var.a(jVar, i2);
                                        }
                                        bVar.C(andIncrement);
                                        jVar.h();
                                        obj2 = obj4;
                                    } else if (objA == S0.d.f802o) {
                                        if (andIncrement < bVar.p()) {
                                            jVar.a();
                                        }
                                        jVar2 = jVar;
                                        obj2 = obj4;
                                        z2 = true;
                                    } else {
                                        if (objA == S0.d.f801n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar.a();
                                        obj2 = objA;
                                    }
                                    gVar = obj2;
                                }
                            }
                        }
                    }
                    gVar2 = null;
                    if (gVar instanceof S0.h) {
                        gVar = null;
                    }
                    gVar3 = p041x0.g.f3419a;
                    if (gVar != null) {
                        N.f125f.h(gVar, th);
                        gVar2 = gVar3;
                    }
                } while (gVar2 != null);
                return gVar3;
        }
    }
}
