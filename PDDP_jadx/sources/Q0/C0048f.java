package Q0;

import V0.AbstractC0068a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Q0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0048f extends A implements InterfaceC0047e, B0.c, l0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f714j = AtomicIntegerFieldUpdater.newUpdater(C0048f.class, "_decisionAndIndex");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f715k = AtomicReferenceFieldUpdater.newUpdater(C0048f.class, Object.class, "_state");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f716l = AtomicReferenceFieldUpdater.newUpdater(C0048f.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z0.d f717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z0.i f718i;

    public C0048f(int i2, z0.d dVar) {
        super(i2);
        this.f717h = dVar;
        this.f718i = dVar.i();
        this._decisionAndIndex = 536870911;
        this._state = C0044b.f709e;
    }

    public static Object D(c0 c0Var, Object obj, int i2, H0.l lVar) {
        if ((obj instanceof C0056n) || !AbstractC0063v.f(i2)) {
            return obj;
        }
        if (lVar != null || (c0Var instanceof D)) {
            return new C0055m(obj, c0Var instanceof D ? (D) c0Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void z(c0 c0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + c0Var + ", already has " + obj).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        z0.d dVar = this.f717h;
        Throwable th = null;
        V0.h hVar = dVar instanceof V0.h ? (V0.h) dVar : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V0.h.f982l;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                D.j jVar = AbstractC0068a.f972d;
                if (obj != jVar) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(hVar, jVar, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(hVar) == jVar);
            }
            if (th == null) {
                return;
            }
            r();
            q(th);
        }
    }

    public final void C(Object obj, int i2, H0.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f715k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof c0)) {
                if (obj2 instanceof C0049g) {
                    C0049g c0049g = (C0049g) obj2;
                    c0049g.getClass();
                    if (C0049g.f719c.compareAndSet(c0049g, 0, 1)) {
                        if (lVar != null) {
                            n(lVar, c0049g.f732a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objD = D((c0) obj2, obj, i2, lVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                    if (!y()) {
                        r();
                    }
                    s(i2);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // Q0.l0
    public final void a(V0.v vVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f714j;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        x(vVar);
    }

    @Override // Q0.A
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f715k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof c0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0056n) {
                return;
            }
            if (!(obj2 instanceof C0055m)) {
                C0055m c0055m = new C0055m(obj2, (D) null, (H0.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0055m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            C0055m c0055m2 = (C0055m) obj2;
            if (c0055m2.f730e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0055m c0055mA = C0055m.a(c0055m2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0055mA)) {
                    D d2 = c0055m2.f727b;
                    if (d2 != null) {
                        k(d2, cancellationException);
                    }
                    H0.l lVar = c0055m2.f728c;
                    if (lVar != null) {
                        n(lVar, cancellationException);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // Q0.A
    public final z0.d c() {
        return this.f717h;
    }

    @Override // Q0.A
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // Q0.InterfaceC0047e
    public final D.j e(Object obj, H0.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f715k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z2 = obj2 instanceof c0;
            D.j jVar = AbstractC0063v.f744a;
            if (!z2) {
                boolean z3 = obj2 instanceof C0055m;
                return null;
            }
            Object objD = D((c0) obj2, obj, this.f671g, lVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                    if (y()) {
                        return jVar;
                    }
                    r();
                    return jVar;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // Q0.A
    public final Object f(Object obj) {
        return obj instanceof C0055m ? ((C0055m) obj).f726a : obj;
    }

    @Override // B0.c
    public final B0.c g() {
        z0.d dVar = this.f717h;
        if (dVar instanceof B0.c) {
            return (B0.c) dVar;
        }
        return null;
    }

    @Override // z0.d
    public final z0.i i() {
        return this.f718i;
    }

    @Override // Q0.A
    public final Object j() {
        return f715k.get(this);
    }

    public final void k(D d2, Throwable th) {
        try {
            d2.a(th);
        } catch (Throwable th2) {
            AbstractC0063v.d(new O.c("Exception in invokeOnCancellation handler for " + this, th2), this.f718i);
        }
    }

    @Override // Q0.InterfaceC0047e
    public final void l(Object obj, H0.l lVar) {
        C(obj, this.f671g, lVar);
    }

    @Override // z0.d
    public final void m(Object obj) {
        Throwable thA = p041x0.d.a(obj);
        if (thA != null) {
            obj = new C0056n(thA, false);
        }
        C(obj, this.f671g, null);
    }

    public final void n(H0.l lVar, Throwable th) {
        try {
            lVar.j(th);
        } catch (Throwable th2) {
            AbstractC0063v.d(new O.c("Exception in resume onCancellation handler for " + this, th2), this.f718i);
        }
    }

    @Override // Q0.InterfaceC0047e
    public final void o(Object obj) {
        s(this.f671g);
    }

    public final void p(V0.v vVar, Throwable th) {
        z0.i iVar = this.f718i;
        int i2 = f714j.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            vVar.g(i2, iVar);
        } catch (Throwable th2) {
            AbstractC0063v.d(new O.c("Exception in invokeOnCancellation handler for " + this, th2), iVar);
        }
    }

    public final void q(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f715k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof c0)) {
                return;
            }
            C0049g c0049g = new C0049g(this, th, (obj instanceof D) || (obj instanceof V0.v));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0049g)) {
                    c0 c0Var = (c0) obj;
                    if (c0Var instanceof D) {
                        k((D) obj, th);
                    } else if (c0Var instanceof V0.v) {
                        p((V0.v) obj, th);
                    }
                    if (!y()) {
                        r();
                    }
                    s(this.f671g);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public final void r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f716l;
        C c2 = (C) atomicReferenceFieldUpdater.get(this);
        if (c2 == null) {
            return;
        }
        c2.a();
        atomicReferenceFieldUpdater.set(this, b0.f710e);
    }

    public final void s(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f714j;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i2 == 4;
                z0.d dVar = this.f717h;
                if (z2 || !(dVar instanceof V0.h) || AbstractC0063v.f(i2) != AbstractC0063v.f(this.f671g)) {
                    AbstractC0063v.i(this, dVar, z2);
                    return;
                }
                AbstractC0060s abstractC0060s = ((V0.h) dVar).f983h;
                z0.i iVarI = ((V0.h) dVar).f984i.i();
                if (abstractC0060s.g()) {
                    abstractC0060s.e(iVarI, this);
                    return;
                }
                H hA = h0.a();
                if (hA.f680g >= 4294967296L) {
                    p043y0.b bVar = hA.f682i;
                    if (bVar == null) {
                        bVar = new p043y0.b();
                        hA.f682i = bVar;
                    }
                    bVar.addLast(this);
                    return;
                }
                hA.k(true);
                try {
                    AbstractC0063v.i(this, dVar, true);
                    do {
                    } while (hA.m());
                } catch (Throwable th) {
                    try {
                        h(th, null);
                    } finally {
                        hA.i(true);
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public Throwable t(Z z2) {
        return z2.A();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(AbstractC0063v.k(this.f717h));
        sb.append("){");
        Object obj = f715k.get(this);
        if (obj instanceof c0) {
            str = "Active";
        } else {
            str = obj instanceof C0049g ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC0063v.b(this));
        return sb.toString();
    }

    public final Object u() throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean zY = y();
        do {
            atomicIntegerFieldUpdater = f714j;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zY) {
                    B();
                }
                Object obj = f715k.get(this);
                if (obj instanceof C0056n) {
                    throw ((C0056n) obj).f732a;
                }
                if (AbstractC0063v.f(this.f671g)) {
                    P p2 = (P) this.f718i.f(C0061t.f743f);
                    if (p2 != null && !p2.b()) {
                        CancellationException cancellationExceptionA = ((Z) p2).A();
                        b(obj, cancellationExceptionA);
                        throw cancellationExceptionA;
                    }
                }
                return f(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((C) f716l.get(this)) == null) {
            w();
        }
        if (zY) {
            B();
        }
        return A0.a.f0e;
    }

    public final void v() {
        C cW = w();
        if (cW == null || (f715k.get(this) instanceof c0)) {
            return;
        }
        cW.a();
        f716l.set(this, b0.f710e);
    }

    public final C w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        P p2 = (P) this.f718i.f(C0061t.f743f);
        if (p2 == null) {
            return null;
        }
        C cE = AbstractC0063v.e(p2, true, new C0050h(this), 2);
        do {
            atomicReferenceFieldUpdater = f716l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, cE)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return cE;
    }

    public final void x(c0 c0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f715k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0044b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if (obj instanceof D ? true : obj instanceof V0.v) {
                z(c0Var, obj);
                throw null;
            }
            if (obj instanceof C0056n) {
                C0056n c0056n = (C0056n) obj;
                c0056n.getClass();
                if (!C0056n.f731b.compareAndSet(c0056n, 0, 1)) {
                    z(c0Var, obj);
                    throw null;
                }
                if (obj instanceof C0049g) {
                    if (!(obj instanceof C0056n)) {
                        c0056n = null;
                    }
                    Throwable th = c0056n != null ? c0056n.f732a : null;
                    if (c0Var instanceof D) {
                        k((D) c0Var, th);
                        return;
                    } else {
                        I0.i.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        p((V0.v) c0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0055m)) {
                if (c0Var instanceof V0.v) {
                    return;
                }
                I0.i.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0055m c0055m = new C0055m(obj, (D) c0Var, (H0.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0055m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C0055m c0055m2 = (C0055m) obj;
            if (c0055m2.f727b != null) {
                z(c0Var, obj);
                throw null;
            }
            if (c0Var instanceof V0.v) {
                return;
            }
            I0.i.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            D d2 = (D) c0Var;
            Throwable th2 = c0055m2.f730e;
            if (th2 != null) {
                k(d2, th2);
                return;
            }
            C0055m c0055mA = C0055m.a(c0055m2, d2, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0055mA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    public final boolean y() {
        if (this.f671g == 2) {
            z0.d dVar = this.f717h;
            I0.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (V0.h.f982l.get((V0.h) dVar) != null) {
                return true;
            }
        }
        return false;
    }
}
