package S0;

import Q0.AbstractC0063v;
import Q0.C0048f;
import Q0.InterfaceC0047e;
import Q0.l0;
import V0.AbstractC0068a;
import V0.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class b implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f776g = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f777h = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f778i = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f779j = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f780k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f781l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f782m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f783n = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f784o = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H0.l f786f;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public b(int i2, H0.l lVar) {
        this.f785e = i2;
        this.f786f = lVar;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        j jVar = d.f788a;
        this.bufferEnd = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f778i.get(this);
        j jVar2 = new j(0L, null, this, 3);
        this.sendSegment = jVar2;
        this.receiveSegment = jVar2;
        if (u()) {
            jVar2 = d.f788a;
            I0.i.c(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = jVar2;
        this._closeCause = d.f806s;
    }

    public static final j b(b bVar, long j2, j jVar) {
        Object objB;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        bVar.getClass();
        j jVar2 = d.f788a;
        c cVar = c.f787m;
        loop0: while (true) {
            objB = AbstractC0068a.b(jVar, j2, cVar);
            if (!AbstractC0068a.e(objB)) {
                v vVarC = AbstractC0068a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f780k;
                    v vVar = (v) atomicReferenceFieldUpdater.get(bVar);
                    if (vVar.f1014g >= vVarC.f1014g) {
                        break loop0;
                    }
                    if (!vVarC.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(bVar, vVar, vVarC)) {
                            if (!vVar.e()) {
                                break loop0;
                            }
                            vVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(bVar) == vVar);
                    if (vVarC.e()) {
                        vVarC.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = AbstractC0068a.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f777h;
        if (zE) {
            bVar.s();
            if (jVar.f1014g * ((long) d.f789b) >= atomicLongFieldUpdater2.get(bVar)) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) AbstractC0068a.c(objB);
        long j5 = jVar3.f1014g;
        if (j5 <= j2) {
            return jVar3;
        }
        long j6 = ((long) d.f789b) * j5;
        do {
            atomicLongFieldUpdater = f776g;
            j3 = atomicLongFieldUpdater.get(bVar);
            j4 = 1152921504606846975L & j3;
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j3, j4 + (((long) ((int) (j3 >> 60))) << 60)));
        if (j5 * ((long) d.f789b) >= atomicLongFieldUpdater2.get(bVar)) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public static final void c(b bVar, Object obj, C0048f c0048f) {
        O.c cVarA;
        H0.l lVar = bVar.f786f;
        if (lVar != null && (cVarA = AbstractC0068a.a(lVar, obj, null)) != null) {
            AbstractC0063v.d(cVarA, c0048f.f718i);
        }
        c0048f.m(p000a.a.l(bVar.o()));
    }

    public static final int d(b bVar, j jVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        bVar.getClass();
        jVar.m(i2, obj);
        if (z2) {
            return bVar.B(jVar, i2, obj, j2, obj2, z2);
        }
        Object objK = jVar.k(i2);
        if (objK == null) {
            if (bVar.e(j2)) {
                if (jVar.j(i2, null, d.f791d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.j(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objK instanceof l0) {
            jVar.m(i2, null);
            if (bVar.y(objK, obj)) {
                jVar.n(i2, d.f796i);
                return 0;
            }
            D.j jVar2 = d.f798k;
            if (jVar.f813j.getAndSet((i2 * 2) + 1, jVar2) != jVar2) {
                jVar.l(i2, true);
            }
            return 5;
        }
        return bVar.B(jVar, i2, obj, j2, obj2, z2);
    }

    public static void q(b bVar) {
        bVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f779j;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean z(Object obj) {
        if (obj instanceof InterfaceC0047e) {
            I0.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return d.a((InterfaceC0047e) obj, p041x0.g.f3419a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object A(j jVar, int i2, long j2, Object obj) {
        Object objK = jVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = jVar.f813j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f776g;
        if (objK == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f801n;
                }
                if (jVar.j(i2, objK, obj)) {
                    i();
                    return d.f800m;
                }
            }
        } else if (objK == d.f791d && jVar.j(i2, objK, d.f796i)) {
            i();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            jVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object objK2 = jVar.k(i2);
            if (objK2 == null || objK2 == d.f792e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (jVar.j(i2, objK2, d.f795h)) {
                        i();
                        return d.f802o;
                    }
                } else {
                    if (obj == null) {
                        return d.f801n;
                    }
                    if (jVar.j(i2, objK2, obj)) {
                        i();
                        return d.f800m;
                    }
                }
            } else if (objK2 != d.f791d) {
                D.j jVar2 = d.f797j;
                if (objK2 == jVar2) {
                    return d.f802o;
                }
                if (objK2 == d.f795h) {
                    return d.f802o;
                }
                if (objK2 == d.f799l) {
                    i();
                    return d.f802o;
                }
                if (objK2 != d.f794g && jVar.j(i2, objK2, d.f793f)) {
                    boolean z2 = objK2 instanceof s;
                    if (z2) {
                        objK2 = ((s) objK2).f819a;
                    }
                    if (z(objK2)) {
                        jVar.n(i2, d.f796i);
                        i();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        jVar.m(i2, null);
                        return obj3;
                    }
                    jVar.n(i2, jVar2);
                    jVar.h();
                    if (z2) {
                        i();
                    }
                    return d.f802o;
                }
            } else if (jVar.j(i2, objK2, d.f796i)) {
                i();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                jVar.m(i2, null);
                return obj4;
            }
        }
    }

    public final int B(j jVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        while (true) {
            Object objK = jVar.k(i2);
            if (objK == null) {
                if (!e(j2) || z2) {
                    if (z2) {
                        if (jVar.j(i2, null, d.f797j)) {
                            jVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (jVar.j(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (jVar.j(i2, null, d.f791d)) {
                    return 1;
                }
            } else {
                if (objK != d.f792e) {
                    D.j jVar2 = d.f798k;
                    if (objK == jVar2) {
                        jVar.m(i2, null);
                        return 5;
                    }
                    if (objK == d.f795h) {
                        jVar.m(i2, null);
                        return 5;
                    }
                    if (objK == d.f799l) {
                        jVar.m(i2, null);
                        s();
                        return 4;
                    }
                    jVar.m(i2, null);
                    if (objK instanceof s) {
                        objK = ((s) objK).f819a;
                    }
                    if (y(objK, obj)) {
                        jVar.n(i2, d.f796i);
                        return 0;
                    }
                    if (jVar.f813j.getAndSet((i2 * 2) + 1, jVar2) == jVar2) {
                        return 5;
                    }
                    jVar.l(i2, true);
                    return 5;
                }
                if (jVar.j(i2, objK, d.f791d)) {
                    return 1;
                }
            }
        }
    }

    public final void C(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        if (u()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f778i;
        } while (atomicLongFieldUpdater.get(this) <= j2);
        int i2 = d.f790c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f779j;
            if (i3 >= i2) {
                do {
                    j3 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, 4611686018427387904L + (j3 & 4611686018427387903L)));
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(this);
                    long j6 = atomicLongFieldUpdater2.get(this);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z2 = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z2) {
                        atomicLongFieldUpdater2.compareAndSet(this, j6, j7 + 4611686018427387904L);
                    }
                }
                do {
                    j4 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j4, j4 & 4611686018427387903L));
                return;
            }
            long j8 = atomicLongFieldUpdater.get(this);
            if (j8 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j8 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // S0.q
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(cancellationException, true);
    }

    public final boolean e(long j2) {
        return j2 < f778i.get(this) || j2 < f777h.get(this) + ((long) this.f785e);
    }

    public final boolean f(Throwable th, boolean z2) {
        boolean z3;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f776g;
        if (z2) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) != 0) {
                    break;
                }
                j jVar = d.f788a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (((long) 1) << 60) + (j6 & 1152921504606846975L)));
        }
        D.j jVar2 = d.f806s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f783n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, jVar2, th)) {
                z3 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != jVar2) {
                z3 = false;
                break;
            }
        }
        if (z2) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j5, (((long) 3) << 60) + (j5 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = j2 & 1152921504606846975L;
                    j4 = 2;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = j2 & 1152921504606846975L;
                    j4 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j2, (j4 << 60) + j3));
        }
        s();
        if (z3) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f784o;
                obj = atomicReferenceFieldUpdater2.get(this);
                D.j jVar3 = obj == null ? d.f804q : d.f805r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, jVar3)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                I0.s.a(1, obj);
                ((H0.l) obj).j(l());
            }
        }
        return z3;
    }

    public final j g(long j2) {
        Object objF;
        long j3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj = f782m.get(this);
        j jVar = (j) f780k.get(this);
        if (jVar.f1014g > ((j) obj).f1014g) {
            obj = jVar;
        }
        j jVar2 = (j) f781l.get(this);
        if (jVar2.f1014g > ((j) obj).f1014g) {
            obj = jVar2;
        }
        V0.d dVar = (V0.d) obj;
        loop0: while (true) {
            dVar.getClass();
            Object obj2 = V0.d.f977e.get(dVar);
            D.j jVar3 = AbstractC0068a.f970b;
            objF = null;
            if (obj2 == jVar3) {
                break;
            }
            V0.d dVar2 = (V0.d) obj2;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = V0.d.f977e;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, jVar3)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        j jVar4 = (j) dVar;
        if (t()) {
            j jVar5 = jVar4;
            loop2: while (true) {
                int i2 = d.f789b - 1;
                while (true) {
                    if (-1 < i2) {
                        j3 = (jVar5.f1014g * ((long) d.f789b)) + ((long) i2);
                        if (j3 >= f777h.get(this)) {
                            while (true) {
                                Object objK = jVar5.k(i2);
                                if (objK != null && objK != d.f792e) {
                                    if (objK != d.f791d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (jVar5.j(i2, objK, d.f799l)) {
                                    jVar5.h();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } else {
                        jVar5 = (j) ((V0.d) V0.d.f978f.get(jVar5));
                        if (jVar5 == null) {
                        }
                    }
                    j3 = -1;
                    break;
                }
            }
            if (j3 != -1) {
                h(j3);
            }
        }
        loop5: for (j jVar6 = jVar4; jVar6 != null; jVar6 = (j) ((V0.d) V0.d.f978f.get(jVar6))) {
            for (int i3 = d.f789b - 1; -1 < i3; i3--) {
                if ((jVar6.f1014g * ((long) d.f789b)) + ((long) i3) < j2) {
                    break loop5;
                }
                while (true) {
                    Object objK2 = jVar6.k(i3);
                    if (objK2 != null && objK2 != d.f792e) {
                        if (!(objK2 instanceof s)) {
                            if (!(objK2 instanceof l0)) {
                                break;
                            }
                            if (jVar6.j(i3, objK2, d.f799l)) {
                                objF = AbstractC0068a.f(objF, objK2);
                                jVar6.l(i3, true);
                                break;
                            }
                        } else {
                            if (jVar6.j(i3, objK2, d.f799l)) {
                                objF = AbstractC0068a.f(objF, ((s) objK2).f819a);
                                jVar6.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (jVar6.j(i3, objK2, d.f799l)) {
                            jVar6.h();
                            break;
                        }
                    }
                }
            }
        }
        if (objF != null) {
            if (objF instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objF;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    x((l0) arrayList.get(size), true);
                }
            } else {
                x((l0) objF, true);
            }
        }
        return jVar4;
    }

    public final void h(long j2) {
        O.c cVarA;
        j jVar = (j) f781l.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f777h;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(((long) this.f785e) + j3, f778i.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j4 = d.f789b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (jVar.f1014g != j5) {
                    j jVarK = k(j5, jVar);
                    if (jVarK == null) {
                        continue;
                    } else {
                        jVar = jVarK;
                    }
                }
                Object objA = A(jVar, i2, j3, null);
                if (objA != d.f802o) {
                    jVar.a();
                    H0.l lVar = this.f786f;
                    if (lVar != null && (cVarA = AbstractC0068a.a(lVar, objA, null)) != null) {
                        throw cVarA;
                    }
                } else if (j3 < p()) {
                    jVar.a();
                }
            }
        }
    }

    public final void i() {
        Object objB;
        if (u()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f782m;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f778i.getAndIncrement(this);
            long j2 = andIncrement / ((long) d.f789b);
            if (p() <= andIncrement) {
                if (jVar.f1014g < j2 && jVar.b() != null) {
                    v(j2, jVar);
                }
                q(this);
                return;
            }
            if (jVar.f1014g != j2) {
                c cVar = c.f787m;
                while (true) {
                    objB = AbstractC0068a.b(jVar, j2, cVar);
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
                j jVar2 = null;
                if (AbstractC0068a.e(objB)) {
                    s();
                    v(j2, jVar);
                    q(this);
                } else {
                    j jVar3 = (j) AbstractC0068a.c(objB);
                    long j3 = jVar3.f1014g;
                    if (j3 > j2) {
                        long j4 = j3 * ((long) d.f789b);
                        if (f778i.compareAndSet(this, andIncrement + 1, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f779j;
                            if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            q(this);
                        }
                    } else {
                        jVar2 = jVar3;
                    }
                }
                if (jVar2 == null) {
                    continue;
                } else {
                    jVar = jVar2;
                }
            }
            int i2 = (int) (andIncrement % ((long) d.f789b));
            Object objK = jVar.k(i2);
            boolean z2 = objK instanceof l0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f777h;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !jVar.j(i2, objK, d.f794g)) {
                while (true) {
                    Object objK2 = jVar.k(i2);
                    if (objK2 instanceof l0) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (jVar.j(i2, objK2, new s((l0) objK2))) {
                                q(this);
                                return;
                            }
                        } else if (jVar.j(i2, objK2, d.f794g)) {
                            if (!z(objK2)) {
                                jVar.n(i2, d.f797j);
                                jVar.h();
                                break;
                            } else {
                                jVar.n(i2, d.f791d);
                                q(this);
                                return;
                            }
                        }
                    } else {
                        if (objK2 == d.f797j) {
                            break;
                        }
                        if (objK2 == null) {
                            if (jVar.j(i2, objK2, d.f792e)) {
                                q(this);
                                return;
                            }
                        } else if (objK2 == d.f791d || objK2 == d.f795h || objK2 == d.f796i || objK2 == d.f798k || objK2 == d.f799l) {
                            q(this);
                            return;
                        } else if (objK2 != d.f793f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objK2).toString());
                        }
                    }
                }
                q(this);
            } else if (z(objK)) {
                jVar.n(i2, d.f791d);
                q(this);
                return;
            } else {
                jVar.n(i2, d.f797j);
                jVar.h();
                q(this);
            }
        }
    }

    @Override // S0.r
    public Object j(Object obj) {
        j jVar;
        j jVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f776g;
        long j2 = atomicLongFieldUpdater.get(this);
        boolean z2 = r(j2, false) ? false : !e(j2 & 1152921504606846975L);
        h hVar = i.f811a;
        if (z2) {
            return hVar;
        }
        p030q0.d dVar = d.f797j;
        j jVar3 = (j) f780k.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & 1152921504606846975L;
            boolean zR = r(andIncrement, false);
            int i2 = d.f789b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (jVar3.f1014g != j5) {
                j jVarB = b(this, j5, jVar3);
                if (jVarB != null) {
                    jVar = jVarB;
                } else if (zR) {
                    return new g(o());
                }
            } else {
                jVar = jVar3;
            }
            j jVar4 = jVar;
            int iD = d(this, jVar, i3, obj, j3, dVar, zR);
            p041x0.g gVar = p041x0.g.f3419a;
            if (iD == 0) {
                jVar4.a();
            } else if (iD != 1) {
                if (iD == 2) {
                    if (zR) {
                        jVar4.h();
                        return new g(o());
                    }
                    l0 l0Var = dVar instanceof l0 ? (l0) dVar : null;
                    if (l0Var != null) {
                        jVar2 = jVar4;
                        l0Var.a(jVar2, i3 + i2);
                    } else {
                        jVar2 = jVar4;
                    }
                    jVar2.h();
                    return hVar;
                }
                if (iD == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iD == 4) {
                    if (j3 < f777h.get(this)) {
                        jVar4.a();
                    }
                    return new g(o());
                }
                if (iD == 5) {
                    jVar4.a();
                }
                jVar3 = jVar4;
            }
            return gVar;
        }
    }

    public final j k(long j2, j jVar) {
        Object objB;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        j jVar2 = d.f788a;
        c cVar = c.f787m;
        loop0: while (true) {
            objB = AbstractC0068a.b(jVar, j2, cVar);
            if (!AbstractC0068a.e(objB)) {
                v vVarC = AbstractC0068a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f781l;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f1014g >= vVarC.f1014g) {
                        break loop0;
                    }
                    if (!vVarC.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, vVar, vVarC)) {
                            if (!vVar.e()) {
                                break loop0;
                            }
                            vVar.d();
                            break loop0;
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
        if (AbstractC0068a.e(objB)) {
            s();
            if (jVar.f1014g * ((long) d.f789b) >= p()) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) AbstractC0068a.c(objB);
        boolean zU = u();
        long j4 = jVar3.f1014g;
        if (!zU && j2 <= f778i.get(this) / ((long) d.f789b)) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f782m;
                v vVar2 = (v) atomicReferenceFieldUpdater2.get(this);
                if (vVar2.f1014g >= j4 || !jVar3.i()) {
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, vVar2, jVar3)) {
                        if (!vVar2.e()) {
                            break loop3;
                        }
                        vVar2.d();
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == vVar2);
                if (jVar3.e()) {
                    jVar3.d();
                }
            }
        }
        if (j4 <= j2) {
            return jVar3;
        }
        long j5 = ((long) d.f789b) * j4;
        do {
            atomicLongFieldUpdater = f777h;
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j5));
        if (j4 * ((long) d.f789b) >= p()) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public final Throwable l() {
        return (Throwable) f783n.get(this);
    }

    public final Throwable m() {
        Throwable thL = l();
        return thL == null ? new k("Channel was closed") : thL;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01ba  */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01bb, code lost:
    
        if (r0 == r13) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d0, code lost:
    
        if (r0 == r13) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r0 == r13) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [Q0.f] */
    @Override // S0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.lang.Object r27, z0.d r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.b.n(java.lang.Object, z0.d):java.lang.Object");
    }

    public final Throwable o() {
        Throwable thL = l();
        return thL == null ? new l("Channel was closed") : thL;
    }

    public final long p() {
        return f776g.get(this) & 1152921504606846975L;
    }

    public final boolean r(long j2, boolean z2) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f777h;
        if (i2 == 2) {
            g(j2 & 1152921504606846975L);
            if (z2) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f781l;
                    j jVarK = (j) atomicReferenceFieldUpdater.get(this);
                    long j3 = atomicLongFieldUpdater.get(this);
                    if (p() <= j3) {
                        break;
                    }
                    long j4 = d.f789b;
                    long j5 = j3 / j4;
                    if (jVarK.f1014g != j5 && (jVarK = k(j5, jVarK)) == null) {
                        if (((j) atomicReferenceFieldUpdater.get(this)).f1014g < j5) {
                            break;
                        }
                    } else {
                        jVarK.a();
                        int i3 = (int) (j3 % j4);
                        while (true) {
                            Object objK = jVarK.k(i3);
                            if (objK != null && objK != d.f792e) {
                                if (objK != d.f791d) {
                                    if (objK != d.f797j && objK != d.f799l && objK != d.f796i && objK != d.f795h) {
                                        if (objK != d.f794g) {
                                            if (objK == d.f793f || j3 != atomicLongFieldUpdater.get(this)) {
                                                break;
                                                break;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    break;
                                    break;
                                    break;
                                    break;
                                }
                                return false;
                            }
                            if (jVarK.j(i3, objK, d.f795h)) {
                                i();
                                break;
                            }
                        }
                        f777h.compareAndSet(this, j3, j3 + 1);
                    }
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i2).toString());
            }
            j jVarG = g(j2 & 1152921504606846975L);
            O.c cVarA = null;
            Object objF = null;
            loop0: do {
                for (int i4 = d.f789b - 1; -1 < i4; i4--) {
                    long j6 = (jVarG.f1014g * ((long) d.f789b)) + ((long) i4);
                    while (true) {
                        Object objK2 = jVarG.k(i4);
                        if (objK2 == d.f796i) {
                            break loop0;
                        }
                        D.j jVar = d.f791d;
                        AtomicReferenceArray atomicReferenceArray = jVarG.f813j;
                        H0.l lVar = this.f786f;
                        if (objK2 != jVar) {
                            if (objK2 != d.f792e && objK2 != null) {
                                if (!(objK2 instanceof l0) && !(objK2 instanceof s)) {
                                    D.j jVar2 = d.f794g;
                                    if (objK2 == jVar2 || objK2 == d.f793f) {
                                        break loop0;
                                    }
                                    if (objK2 != jVar2) {
                                        break;
                                    }
                                } else {
                                    if (j6 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    l0 l0Var = objK2 instanceof s ? ((s) objK2).f819a : (l0) objK2;
                                    if (jVarG.j(i4, objK2, d.f799l)) {
                                        if (lVar != null) {
                                            cVarA = AbstractC0068a.a(lVar, atomicReferenceArray.get(i4 * 2), cVarA);
                                        }
                                        objF = AbstractC0068a.f(objF, l0Var);
                                        jVarG.m(i4, null);
                                        jVarG.h();
                                        break;
                                    }
                                }
                            } else if (jVarG.j(i4, objK2, d.f799l)) {
                                jVarG.h();
                                break;
                            }
                        } else {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (jVarG.j(i4, objK2, d.f799l)) {
                                if (lVar != null) {
                                    cVarA = AbstractC0068a.a(lVar, atomicReferenceArray.get(i4 * 2), cVarA);
                                }
                                jVarG.m(i4, null);
                                jVarG.h();
                                break;
                            }
                        }
                    }
                }
                jVarG = (j) ((V0.d) V0.d.f978f.get(jVarG));
            } while (jVarG != null);
            if (objF != null) {
                if (objF instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) objF;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        x((l0) arrayList.get(size), false);
                    }
                } else {
                    x((l0) objF, false);
                }
            }
            if (cVarA != null) {
                throw cVarA;
            }
        }
        return true;
    }

    public final boolean s() {
        return r(f776g.get(this), false);
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (f776g.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f785e + ',');
        sb.append("data=[");
        List listP = p043y0.e.P(f781l.get(this), f780k.get(this), f782m.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (((j) obj) != d.f788a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((j) next).f1014g;
            do {
                Object next2 = it.next();
                long j3 = ((j) next2).f1014g;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        j jVar = (j) next;
        long j4 = f777h.get(this);
        long jP = p();
        loop2: do {
            int i3 = d.f789b;
            for (int i4 = 0; i4 < i3; i4++) {
                long j5 = (jVar.f1014g * ((long) d.f789b)) + ((long) i4);
                if (j5 >= jP && j5 >= j4) {
                    break loop2;
                }
                Object objK = jVar.k(i4);
                Object obj2 = jVar.f813j.get(i4 * 2);
                if (objK instanceof InterfaceC0047e) {
                    string = (j5 >= j4 || j5 < jP) ? (j5 >= jP || j5 < j4) ? "cont" : "send" : "receive";
                } else if (objK instanceof s) {
                    string = "EB(" + objK + ')';
                } else if (I0.i.a(objK, d.f793f) ? true : I0.i.a(objK, d.f794g)) {
                    string = "resuming_sender";
                } else {
                    if (!(objK == null ? true : objK.equals(d.f792e) ? true : I0.i.a(objK, d.f796i) ? true : I0.i.a(objK, d.f795h) ? true : I0.i.a(objK, d.f798k) ? true : I0.i.a(objK, d.f797j) ? true : I0.i.a(objK, d.f799l))) {
                        string = objK.toString();
                    }
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            jVar = (j) jVar.b();
        } while (jVar != null);
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(P0.j.S(sb)) == ',') {
            I0.i.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        long j2 = f778i.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    public final void v(long j2, j jVar) {
        j jVar2;
        j jVar3;
        while (jVar.f1014g < j2 && (jVar3 = (j) jVar.b()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.c() || (jVar2 = (j) jVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f782m;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f1014g >= jVar.f1014g) {
                        return;
                    }
                    if (!jVar.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, vVar, jVar)) {
                            if (vVar.e()) {
                                vVar.d();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == vVar);
                    if (jVar.e()) {
                        jVar.d();
                    }
                }
            } else {
                jVar = jVar2;
            }
        }
    }

    public final Object w(Object obj, z0.d dVar) throws Throwable {
        O.c cVarA;
        C0048f c0048f = new C0048f(1, p000a.a.x(dVar));
        c0048f.v();
        H0.l lVar = this.f786f;
        if (lVar == null || (cVarA = AbstractC0068a.a(lVar, obj, null)) == null) {
            c0048f.m(p000a.a.l(o()));
        } else {
            a1.a.c(cVarA, o());
            c0048f.m(p000a.a.l(cVarA));
        }
        Object objU = c0048f.u();
        return objU == A0.a.f0e ? objU : p041x0.g.f3419a;
    }

    public final void x(l0 l0Var, boolean z2) {
        if (l0Var instanceof InterfaceC0047e) {
            ((z0.d) l0Var).m(p000a.a.l(z2 ? m() : o()));
            return;
        }
        if (!(l0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + l0Var).toString());
        }
        a aVar = (a) l0Var;
        C0048f c0048f = aVar.f774f;
        I0.i.b(c0048f);
        aVar.f774f = null;
        aVar.f773e = d.f799l;
        Throwable thL = aVar.f775g.l();
        if (thL == null) {
            c0048f.m(Boolean.FALSE);
        } else {
            c0048f.m(p000a.a.l(thL));
        }
    }

    public final boolean y(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof InterfaceC0047e)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            I0.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0047e interfaceC0047e = (InterfaceC0047e) obj;
            H0.l lVar = this.f786f;
            return d.a(interfaceC0047e, obj2, lVar != null ? new V0.q(lVar, obj2, interfaceC0047e.i()) : null);
        }
        I0.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0048f c0048f = aVar.f774f;
        I0.i.b(c0048f);
        aVar.f774f = null;
        aVar.f773e = obj2;
        Boolean bool = Boolean.TRUE;
        H0.l lVar2 = aVar.f775g.f786f;
        return d.a(c0048f, bool, lVar2 != null ? new V0.q(lVar2, obj2, c0048f.f718i) : null);
    }
}
