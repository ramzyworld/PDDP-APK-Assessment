package Q0;

import V0.AbstractC0068a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: Q0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0063v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D.j f746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D.j f747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D.j f748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D.j f749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final D.j f750g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D.j f744a = new D.j(14, "RESUME_TOKEN");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D.j f745b = new D.j(14, "CLOSED_EMPTY");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final E f751h = new E(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final E f752i = new E(true);

    static {
        int i2 = 14;
        f746c = new D.j(i2, "COMPLETING_ALREADY");
        f747d = new D.j(i2, "COMPLETING_WAITING_CHILDREN");
        f748e = new D.j(i2, "COMPLETING_RETRY");
        f749f = new D.j(i2, "TOO_LATE_TO_CANCEL");
        f750g = new D.j(i2, "SEALED");
    }

    public static final z0.i a(z0.i iVar, z0.i iVar2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        C0058p c0058p = C0058p.f736h;
        boolean zBooleanValue = ((Boolean) iVar.d(bool, c0058p)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) iVar2.d(bool, c0058p)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return iVar.c(iVar2);
        }
        z0.j jVar = z0.j.f3504e;
        z0.i iVar3 = (z0.i) iVar.d(jVar, new C0058p(2, 2));
        Object objD = iVar2;
        if (zBooleanValue2) {
            objD = iVar2.d(jVar, C0058p.f735g);
        }
        return iVar3.c((z0.i) objD);
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0048f c(z0.d dVar) {
        C0048f c0048f;
        C0048f c0048f2;
        if (!(dVar instanceof V0.h)) {
            return new C0048f(1, dVar);
        }
        V0.h hVar = (V0.h) dVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V0.h.f982l;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            D.j jVar = AbstractC0068a.f972d;
            c0048f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, jVar);
                c0048f2 = null;
                break;
            }
            if (obj instanceof C0048f) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, jVar)) {
                        c0048f2 = (C0048f) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(hVar) == obj);
            } else if (obj != jVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0048f2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0048f.f715k;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0048f2);
            if (!(obj2 instanceof C0055m) || ((C0055m) obj2).f729d == null) {
                C0048f.f714j.set(c0048f2, 536870911);
                atomicReferenceFieldUpdater2.set(c0048f2, C0044b.f709e);
                c0048f = c0048f2;
            } else {
                c0048f2.r();
            }
            if (c0048f != null) {
                return c0048f;
            }
        }
        return new C0048f(2, dVar);
    }

    public static final void d(Throwable th, z0.i iVar) {
        try {
            R0.b bVar = (R0.b) iVar.f(C0061t.f742e);
            if (bVar != null) {
                bVar.e(th, iVar);
            } else {
                AbstractC0068a.d(th, iVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                a1.a.c(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0068a.d(th, iVar);
        }
    }

    public static /* synthetic */ C e(P p2, boolean z2, U u2, int i2) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return ((Z) p2).I(z2, (i2 & 2) != 0, u2);
    }

    public static final boolean f(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static e0 g(InterfaceC0062u interfaceC0062u, H0.p pVar) {
        z0.i iVarA = a(interfaceC0062u.k(), z0.j.f3504e, true);
        X0.d dVar = B.f672a;
        if (iVarA != dVar && iVarA.f(z0.e.f3503e) == null) {
            iVarA = iVarA.c(dVar);
        }
        e0 e0Var = new e0(iVarA, true);
        e0Var.W(1, e0Var, pVar);
        return e0Var;
    }

    public static final Object h(Object obj) {
        return obj instanceof C0056n ? p000a.a.l(((C0056n) obj).f732a) : obj;
    }

    public static final void i(C0048f c0048f, z0.d dVar, boolean z2) {
        Object obj = C0048f.f715k.get(c0048f);
        Throwable thD = c0048f.d(obj);
        Object objL = thD != null ? p000a.a.l(thD) : c0048f.f(obj);
        if (!z2) {
            dVar.m(objL);
            return;
        }
        I0.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        V0.h hVar = (V0.h) dVar;
        B0.b bVar = hVar.f984i;
        z0.i iVarI = bVar.i();
        Object objM = AbstractC0068a.m(iVarI, hVar.f986k);
        j0 j0VarM = objM != AbstractC0068a.f974f ? m(bVar, iVarI, objM) : null;
        try {
            bVar.m(objL);
        } finally {
            if (j0VarM == null || j0VarM.X()) {
                AbstractC0068a.g(iVarI, objM);
            }
        }
    }

    public static Object j(H0.p pVar) throws Throwable {
        z0.j jVar = z0.j.f3504e;
        Thread threadCurrentThread = Thread.currentThread();
        z0.e eVar = z0.e.f3503e;
        H hA = h0.a();
        z0.i iVarA = a(jVar, hA, true);
        X0.d dVar = B.f672a;
        if (iVarA != dVar && iVarA.f(eVar) == null) {
            iVarA = iVarA.c(dVar);
        }
        C0045c c0045c = new C0045c(iVarA, threadCurrentThread, hA);
        c0045c.W(1, c0045c, pVar);
        H h2 = c0045c.f712i;
        if (h2 != null) {
            int i2 = H.f679j;
            h2.k(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jL = h2 != null ? h2.l() : Long.MAX_VALUE;
                if (!(c0045c.E() instanceof L)) {
                    if (h2 != null) {
                        int i3 = H.f679j;
                        h2.i(false);
                    }
                    Object objL = l(c0045c.E());
                    C0056n c0056n = objL instanceof C0056n ? (C0056n) objL : null;
                    if (c0056n == null) {
                        return objL;
                    }
                    throw c0056n.f732a;
                }
                LockSupport.parkNanos(c0045c, jL);
            } catch (Throwable th) {
                if (h2 != null) {
                    int i4 = H.f679j;
                    h2.i(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0045c.s(interruptedException);
        throw interruptedException;
    }

    public static final String k(z0.d dVar) {
        Object objL;
        if (dVar instanceof V0.h) {
            return dVar.toString();
        }
        try {
            objL = dVar + '@' + b(dVar);
        } catch (Throwable th) {
            objL = p000a.a.l(th);
        }
        if (p041x0.d.a(objL) != null) {
            objL = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) objL;
    }

    public static final Object l(Object obj) {
        L l2;
        M m2 = obj instanceof M ? (M) obj : null;
        return (m2 == null || (l2 = m2.f685a) == null) ? obj : l2;
    }

    public static final j0 m(z0.d dVar, z0.i iVar, Object obj) {
        j0 j0Var = null;
        if (!(dVar instanceof B0.c)) {
            return null;
        }
        if (iVar.f(k0.f725e) != null) {
            B0.c cVarG = (B0.c) dVar;
            while (!(cVarG instanceof C0067z) && (cVarG = cVarG.g()) != null) {
                if (cVarG instanceof j0) {
                    j0Var = (j0) cVarG;
                    break;
                }
            }
            if (j0Var != null) {
                j0Var.Y(iVar, obj);
            }
        }
        return j0Var;
    }

    public static final Object n(z0.i iVar, H0.p pVar, B0.g gVar) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        z0.i iVar2 = gVar.f4f;
        I0.i.b(iVar2);
        z0.i iVarC = !((Boolean) iVar.d(Boolean.FALSE, C0058p.f736h)).booleanValue() ? iVar2.c(iVar) : a(iVar2, iVar, false);
        P p2 = (P) iVarC.f(C0061t.f743f);
        if (p2 != null && !p2.b()) {
            throw ((Z) p2).A();
        }
        if (iVarC == iVar2) {
            V0.u uVar = new V0.u(gVar, iVarC);
            return p000a.a.M(uVar, uVar, pVar);
        }
        z0.e eVar = z0.e.f3503e;
        if (I0.i.a(iVarC.f(eVar), iVar2.f(eVar))) {
            j0 j0Var = new j0(iVarC, gVar);
            z0.i iVar3 = j0Var.f708g;
            Object objM = AbstractC0068a.m(iVar3, null);
            try {
                return p000a.a.M(j0Var, j0Var, pVar);
            } finally {
                AbstractC0068a.g(iVar3, objM);
            }
        }
        C0067z c0067z = new C0067z(gVar, iVarC);
        a1.a.H(pVar, c0067z, c0067z);
        do {
            atomicIntegerFieldUpdater = C0067z.f756i;
            int i2 = atomicIntegerFieldUpdater.get(c0067z);
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object objL = l(c0067z.E());
                if (objL instanceof C0056n) {
                    throw ((C0056n) objL).f732a;
                }
                return objL;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c0067z, 0, 1));
        return A0.a.f0e;
    }
}
