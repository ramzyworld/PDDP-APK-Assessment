package Y0;

import G.M;
import H0.l;
import Q0.InterfaceC0047e;
import V0.AbstractC0068a;
import V0.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1112b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1113c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1114d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1115e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1116f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f1117a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public h(int i2) {
        if (i2 < 0 || i2 > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        j jVar = new j(0L, null, 2);
        this.head = jVar;
        this.tail = jVar;
        this._availablePermits = 1 - i2;
        this.f1117a = new M(3, this);
    }

    public final void a(c cVar) {
        Object objB;
        f fVar;
        long j2;
        while (true) {
            int andDecrement = f1116f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = p041x0.g.f3419a;
                l lVar = this.f1117a;
                if (andDecrement > 0) {
                    cVar.l(obj, lVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1114d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f1115e.getAndIncrement(this);
                f fVar2 = f.f1110m;
                long j3 = andIncrement / ((long) i.f1123f);
                while (true) {
                    objB = AbstractC0068a.b(jVar, j3, fVar2);
                    if (AbstractC0068a.e(objB)) {
                        break;
                    }
                    v vVarC = AbstractC0068a.c(objB);
                    while (true) {
                        v vVar = (v) atomicReferenceFieldUpdater.get(this);
                        fVar = fVar2;
                        j2 = j3;
                        if (vVar.f1014g >= vVarC.f1014g) {
                            break;
                        }
                        if (!vVarC.i()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, vVar, vVarC)) {
                                if (!vVar.e()) {
                                    break;
                                }
                                vVar.d();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == vVar);
                        if (vVarC.e()) {
                            vVarC.d();
                        }
                        fVar2 = fVar;
                        j3 = j2;
                    }
                    fVar2 = fVar;
                    j3 = j2;
                }
                j jVar2 = (j) AbstractC0068a.c(objB);
                int i2 = (int) (andIncrement % ((long) i.f1123f));
                AtomicReferenceArray atomicReferenceArray = jVar2.f1124i;
                do {
                    if (atomicReferenceArray.compareAndSet(i2, null, cVar)) {
                        cVar.a(jVar2, i2);
                        return;
                    }
                } while (atomicReferenceArray.get(i2) == null);
                D.j jVar3 = i.f1119b;
                D.j jVar4 = i.f1120c;
                do {
                    if (atomicReferenceArray.compareAndSet(i2, jVar3, jVar4)) {
                        cVar.l(obj, lVar);
                        return;
                    }
                } while (atomicReferenceArray.get(i2) == jVar3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    public final void b() {
        boolean z2;
        int i2;
        Object objB;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1116f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z2 = true;
            if (andIncrement >= 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1112b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f1113c.getAndIncrement(this);
            long j2 = andIncrement2 / ((long) i.f1123f);
            g gVar = g.f1111m;
            while (true) {
                objB = AbstractC0068a.b(jVar, j2, gVar);
                if (!AbstractC0068a.e(objB)) {
                    v vVarC = AbstractC0068a.c(objB);
                    while (true) {
                        v vVar = (v) atomicReferenceFieldUpdater.get(this);
                        if (vVar.f1014g >= vVarC.f1014g) {
                            break;
                        }
                        if (!vVarC.i()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, vVar, vVarC)) {
                                if (!vVar.e()) {
                                    break;
                                }
                                vVar.d();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == vVar);
                        if (vVarC.e()) {
                            vVarC.d();
                        }
                    }
                } else {
                    break;
                }
            }
            j jVar2 = (j) AbstractC0068a.c(objB);
            jVar2.a();
            boolean z3 = false;
            if (jVar2.f1014g > j2) {
                z2 = false;
            } else {
                int i3 = (int) (andIncrement2 % ((long) i.f1123f));
                D.j jVar3 = i.f1119b;
                AtomicReferenceArray atomicReferenceArray = jVar2.f1124i;
                Object andSet = atomicReferenceArray.getAndSet(i3, jVar3);
                if (andSet == null) {
                    int i4 = i.f1118a;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            D.j jVar4 = i.f1119b;
                            D.j jVar5 = i.f1121d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i3, jVar4, jVar5)) {
                                    z3 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i3) == jVar4);
                            z2 = true ^ z3;
                            break;
                        }
                        if (atomicReferenceArray.get(i3) == i.f1120c) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                } else if (andSet == i.f1122e) {
                    z2 = false;
                } else {
                    if (!(andSet instanceof InterfaceC0047e)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0047e interfaceC0047e = (InterfaceC0047e) andSet;
                    D.j jVarE = interfaceC0047e.e(p041x0.g.f3419a, this.f1117a);
                    if (jVarE != null) {
                        interfaceC0047e.o(jVarE);
                    } else {
                        z2 = false;
                    }
                }
            }
        } while (!z2);
    }
}
