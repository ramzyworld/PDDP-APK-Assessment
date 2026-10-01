package Q0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class Z implements P, d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f706e = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_state");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f707f = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public Z(boolean z2) {
        this._state = z2 ? AbstractC0063v.f752i : AbstractC0063v.f751h;
    }

    public static C0052j M(V0.l lVar) {
        while (lVar.m()) {
            V0.l lVarG = lVar.g();
            if (lVarG == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V0.l.f996f;
                Object obj = atomicReferenceFieldUpdater.get(lVar);
                while (true) {
                    lVar = (V0.l) obj;
                    if (!lVar.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lVar);
                }
            } else {
                lVar = lVarG;
            }
        }
        while (true) {
            lVar = lVar.l();
            if (!lVar.m()) {
                if (lVar instanceof C0052j) {
                    return (C0052j) lVar;
                }
                if (lVar instanceof a0) {
                    return null;
                }
            }
        }
    }

    public static String S(Object obj) {
        if (!(obj instanceof X)) {
            if (obj instanceof L) {
                return ((L) obj).b() ? "Active" : "New";
            }
            return obj instanceof C0056n ? "Cancelled" : "Completed";
        }
        X x2 = (X) obj;
        if (x2.d()) {
            return "Cancelling";
        }
        return x2.f() ? "Completing" : "Active";
    }

    public final CancellationException A() {
        CancellationException cancellationException;
        Object objE = E();
        if (!(objE instanceof X)) {
            if (objE instanceof L) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objE instanceof C0056n)) {
                return new Q(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0056n) objE).f732a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new Q(v(), th, this) : cancellationException;
        }
        Throwable thC = ((X) objE).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = v();
        }
        return new Q(strConcat, thC, this);
    }

    public boolean B() {
        return true;
    }

    public boolean C() {
        return this instanceof C0054l;
    }

    public final a0 D(L l2) {
        a0 a0VarE = l2.e();
        if (a0VarE != null) {
            return a0VarE;
        }
        if (l2 instanceof E) {
            return new a0();
        }
        if (l2 instanceof U) {
            Q((U) l2);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + l2).toString());
    }

    public final Object E() {
        while (true) {
            Object obj = f706e.get(this);
            if (!(obj instanceof V0.r)) {
                return obj;
            }
            ((V0.r) obj).a(this);
        }
    }

    public boolean F(Throwable th) {
        return false;
    }

    public final void H(P p2) {
        int iR;
        b0 b0Var = b0.f710e;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f707f;
        if (p2 == null) {
            atomicReferenceFieldUpdater.set(this, b0Var);
            return;
        }
        Z z2 = (Z) p2;
        do {
            iR = z2.R(z2.E());
            if (iR == 0) {
                break;
            }
        } while (iR != 1);
        InterfaceC0051i interfaceC0051i = (InterfaceC0051i) AbstractC0063v.e(z2, true, new C0052j(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0051i);
        if (E() instanceof L) {
            return;
        }
        interfaceC0051i.a();
        atomicReferenceFieldUpdater.set(this, b0Var);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:97:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00c7 A[SYNTHETIC] */
    public final C I(boolean z2, boolean z3, H0.l lVar) {
        U o2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable thC;
        if (z2) {
            o2 = lVar instanceof S ? (S) lVar : null;
            if (o2 == null) {
                o2 = new N(lVar);
            }
        } else {
            o2 = lVar instanceof U ? (U) lVar : null;
            if (o2 == null) {
                o2 = new O(0, lVar);
            }
        }
        o2.f692h = this;
        while (true) {
            Object objE = E();
            if (objE instanceof E) {
                E e2 = (E) objE;
                if (e2.f675e) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f706e;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, objE, o2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != objE) {
                        }
                    }
                    return o2;
                }
                a0 a0Var = new a0();
                L k2 = e2.f675e ? a0Var : new K(a0Var);
                do {
                    atomicReferenceFieldUpdater = f706e;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, e2, k2)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == e2);
            } else {
                if (!(objE instanceof L)) {
                    if (z3) {
                        C0056n c0056n = objE instanceof C0056n ? (C0056n) objE : null;
                        lVar.j(c0056n != null ? c0056n.f732a : null);
                    }
                    return b0.f710e;
                }
                a0 a0VarE = ((L) objE).e();
                if (a0VarE == null) {
                    I0.i.c(objE, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Q((U) objE);
                } else {
                    C c2 = b0.f710e;
                    if (z2 && (objE instanceof X)) {
                        synchronized (objE) {
                            try {
                                thC = ((X) objE).c();
                                if (thC == null || ((lVar instanceof C0052j) && !((X) objE).f())) {
                                    if (p((L) objE, a0VarE, o2)) {
                                        if (thC == null) {
                                            return o2;
                                        }
                                        c2 = o2;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (thC != null) {
                            if (z3) {
                                lVar.j(thC);
                            }
                            return c2;
                        }
                        if (p((L) objE, a0VarE, o2)) {
                            return o2;
                        }
                    } else {
                        thC = null;
                        if (thC != null) {
                            if (z3) {
                                lVar.j(thC);
                            }
                            return c2;
                        }
                        if (p((L) objE, a0VarE, o2)) {
                            return o2;
                        }
                    }
                }
            }
        }
    }

    public boolean J() {
        return this instanceof C0045c;
    }

    public final boolean K(Object obj) {
        Object objT;
        do {
            objT = T(E(), obj);
            if (objT == AbstractC0063v.f746c) {
                return false;
            }
            if (objT == AbstractC0063v.f747d) {
                return true;
            }
        } while (objT == AbstractC0063v.f748e);
        q(objT);
        return true;
    }

    public final Object L(Object obj) {
        Object objT;
        do {
            objT = T(E(), obj);
            if (objT == AbstractC0063v.f746c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0056n c0056n = obj instanceof C0056n ? (C0056n) obj : null;
                throw new IllegalStateException(str, c0056n != null ? c0056n.f732a : null);
            }
        } while (objT == AbstractC0063v.f748e);
        return objT;
    }

    public final void N(a0 a0Var, Throwable th) {
        Object objK = a0Var.k();
        I0.i.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        O.c cVar = null;
        for (V0.l lVarL = (V0.l) objK; !lVarL.equals(a0Var); lVarL = lVarL.l()) {
            if (lVarL instanceof S) {
                U u2 = (U) lVarL;
                try {
                    u2.o(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        a1.a.c(cVar, th2);
                    } else {
                        cVar = new O.c("Exception in completion handler " + u2 + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar != null) {
            G(cVar);
        }
        u(th);
    }

    public final void Q(U u2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a0 a0Var = new a0();
        u2.getClass();
        V0.l.f996f.lazySet(a0Var, u2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = V0.l.f995e;
        atomicReferenceFieldUpdater2.lazySet(a0Var, u2);
        loop0: while (u2.k() == u2) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(u2, u2, a0Var)) {
                    a0Var.i(u2);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(u2) == u2);
        }
        V0.l lVarL = u2.l();
        do {
            atomicReferenceFieldUpdater = f706e;
            if (atomicReferenceFieldUpdater.compareAndSet(this, u2, lVarL)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == u2);
    }

    public final int R(Object obj) {
        boolean z2 = obj instanceof E;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f706e;
        if (z2) {
            if (((E) obj).f675e) {
                return 0;
            }
            E e2 = AbstractC0063v.f752i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof K)) {
            return 0;
        }
        a0 a0Var = ((K) obj).f684e;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object T(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof L)) {
            return AbstractC0063v.f746c;
        }
        if (((obj instanceof E) || (obj instanceof U)) && !(obj instanceof C0052j) && !(obj2 instanceof C0056n)) {
            L l2 = (L) obj;
            Object m2 = obj2 instanceof L ? new M((L) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f706e;
                if (atomicReferenceFieldUpdater.compareAndSet(this, l2, m2)) {
                    O(obj2);
                    x(l2, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == l2);
            return AbstractC0063v.f748e;
        }
        L l3 = (L) obj;
        a0 a0VarD = D(l3);
        if (a0VarD == null) {
            return AbstractC0063v.f748e;
        }
        C0052j c0052jM = null;
        X x2 = l3 instanceof X ? (X) l3 : null;
        if (x2 == null) {
            x2 = new X(a0VarD, null);
        }
        synchronized (x2) {
            if (x2.f()) {
                return AbstractC0063v.f746c;
            }
            X.f698f.set(x2, 1);
            if (x2 != l3) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f706e;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, l3, x2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != l3) {
                        return AbstractC0063v.f748e;
                    }
                }
            }
            boolean zD = x2.d();
            C0056n c0056n = obj2 instanceof C0056n ? (C0056n) obj2 : null;
            if (c0056n != null) {
                x2.a(c0056n.f732a);
            }
            Throwable thC = x2.c();
            if (zD) {
                thC = null;
            }
            if (thC != null) {
                N(a0VarD, thC);
            }
            C0052j c0052j = l3 instanceof C0052j ? (C0052j) l3 : null;
            if (c0052j == null) {
                a0 a0VarE = l3.e();
                if (a0VarE != null) {
                    c0052jM = M(a0VarE);
                }
            } else {
                c0052jM = c0052j;
            }
            if (c0052jM != null) {
                while (AbstractC0063v.e(c0052jM.f723i, false, new W(this, x2, c0052jM, obj2), 1) == b0.f710e) {
                    c0052jM = M(c0052jM);
                    if (c0052jM == null) {
                    }
                }
                return AbstractC0063v.f747d;
            }
            return z(x2, obj2);
        }
    }

    @Override // Q0.P
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new Q(v(), null, this);
        }
        t(cancellationException);
    }

    @Override // Q0.P
    public boolean b() {
        Object objE = E();
        return (objE instanceof L) && ((L) objE).b();
    }

    @Override // z0.i
    public final z0.i c(z0.i iVar) {
        I0.i.e(iVar, "context");
        return iVar == z0.j.f3504e ? this : (z0.i) iVar.d(this, z0.b.f3499h);
    }

    @Override // z0.i
    public final Object d(Object obj, H0.p pVar) {
        return pVar.h(obj, this);
    }

    @Override // z0.i
    public final z0.g f(z0.h hVar) {
        return p000a.a.s(this, hVar);
    }

    @Override // z0.g
    public final z0.h getKey() {
        return C0061t.f743f;
    }

    @Override // z0.i
    public final z0.i h(z0.h hVar) {
        return p000a.a.z(this, hVar);
    }

    public final boolean p(L l2, a0 a0Var, U u2) {
        char c2;
        Y y2 = new Y(u2, this, l2);
        do {
            V0.l lVarG = a0Var.g();
            if (lVarG == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V0.l.f996f;
                Object obj = atomicReferenceFieldUpdater.get(a0Var);
                while (true) {
                    lVarG = (V0.l) obj;
                    if (!lVarG.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lVarG);
                }
            }
            V0.l.f996f.lazySet(u2, lVarG);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = V0.l.f995e;
            atomicReferenceFieldUpdater2.lazySet(u2, a0Var);
            y2.f703c = a0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(lVarG, a0Var, y2)) {
                    if (y2.a(lVarG) != null) {
                        c2 = 2;
                        break;
                    }
                    c2 = 1;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(lVarG) != a0Var) {
                    c2 = 0;
                    break;
                }
            }
            if (c2 == 1) {
                return true;
            }
        } while (c2 != 2);
        return false;
    }

    public void r(Object obj) {
        q(obj);
    }

    public final boolean s(Object obj) {
        D.j jVar;
        Object objT = AbstractC0063v.f746c;
        if (C()) {
            do {
                Object objE = E();
                if (!(objE instanceof L) || ((objE instanceof X) && ((X) objE).f())) {
                    objT = AbstractC0063v.f746c;
                    break;
                }
                objT = T(objE, new C0056n(y(obj), false));
            } while (objT == AbstractC0063v.f748e);
            if (objT == AbstractC0063v.f747d) {
                return true;
            }
        }
        if (objT == AbstractC0063v.f746c) {
            Throwable thY = null;
            loop1: while (true) {
                Object objE2 = E();
                if (objE2 instanceof X) {
                    synchronized (objE2) {
                        try {
                            X x2 = (X) objE2;
                            x2.getClass();
                            if (X.f700h.get(x2) == AbstractC0063v.f750g) {
                                jVar = AbstractC0063v.f749f;
                            } else {
                                boolean zD = ((X) objE2).d();
                                if (thY == null) {
                                    thY = y(obj);
                                }
                                ((X) objE2).a(thY);
                                Throwable thC = zD ? null : ((X) objE2).c();
                                if (thC != null) {
                                    N(((X) objE2).f701e, thC);
                                }
                                jVar = AbstractC0063v.f746c;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else if (objE2 instanceof L) {
                    if (thY == null) {
                        thY = y(obj);
                    }
                    L l2 = (L) objE2;
                    if (l2.b()) {
                        a0 a0VarD = D(l2);
                        if (a0VarD == null) {
                            continue;
                        } else {
                            X x3 = new X(a0VarD, thY);
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f706e;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, l2, x3)) {
                                    N(a0VarD, thY);
                                    jVar = AbstractC0063v.f746c;
                                } else if (atomicReferenceFieldUpdater.get(this) != l2) {
                                }
                            }
                        }
                    } else {
                        Object objT2 = T(objE2, new C0056n(thY, false));
                        if (objT2 == AbstractC0063v.f746c) {
                            throw new IllegalStateException(("Cannot happen in " + objE2).toString());
                        }
                        if (objT2 != AbstractC0063v.f748e) {
                            objT = objT2;
                            break;
                        }
                    }
                } else {
                    jVar = AbstractC0063v.f749f;
                }
                objT = jVar;
                break;
            }
        }
        if (objT != AbstractC0063v.f746c && objT != AbstractC0063v.f747d) {
            if (objT == AbstractC0063v.f749f) {
                return false;
            }
            q(objT);
        }
        return true;
    }

    public void t(CancellationException cancellationException) {
        s(cancellationException);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + S(E()) + '}');
        sb.append('@');
        sb.append(AbstractC0063v.b(this));
        return sb.toString();
    }

    public final boolean u(Throwable th) {
        if (J()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC0051i interfaceC0051i = (InterfaceC0051i) f707f.get(this);
        if (interfaceC0051i == null || interfaceC0051i == b0.f710e) {
            return z2;
        }
        return interfaceC0051i.d(th) || z2;
    }

    public String v() {
        return "Job was cancelled";
    }

    public boolean w(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return s(th) && B();
    }

    public final void x(L l2, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f707f;
        InterfaceC0051i interfaceC0051i = (InterfaceC0051i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0051i != null) {
            interfaceC0051i.a();
            atomicReferenceFieldUpdater.set(this, b0.f710e);
        }
        O.c cVar = null;
        C0056n c0056n = obj instanceof C0056n ? (C0056n) obj : null;
        Throwable th = c0056n != null ? c0056n.f732a : null;
        if (l2 instanceof U) {
            try {
                ((U) l2).o(th);
                return;
            } catch (Throwable th2) {
                G(new O.c("Exception in completion handler " + l2 + " for " + this, th2));
                return;
            }
        }
        a0 a0VarE = l2.e();
        if (a0VarE != null) {
            Object objK = a0VarE.k();
            I0.i.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (V0.l lVarL = (V0.l) objK; !lVarL.equals(a0VarE); lVarL = lVarL.l()) {
                if (lVarL instanceof U) {
                    U u2 = (U) lVarL;
                    try {
                        u2.o(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            a1.a.c(cVar, th3);
                        } else {
                            cVar = new O.c("Exception in completion handler " + u2 + " for " + this, th3);
                        }
                    }
                }
            }
            if (cVar != null) {
                G(cVar);
            }
        }
    }

    public final Throwable y(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        Z z2 = (Z) ((d0) obj);
        Object objE = z2.E();
        if (objE instanceof X) {
            thC = ((X) objE).c();
        } else if (objE instanceof C0056n) {
            thC = ((C0056n) objE).f732a;
        } else {
            if (objE instanceof L) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objE).toString());
            }
            thC = null;
        }
        CancellationException q2 = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (q2 == null) {
            q2 = new Q("Parent job is ".concat(S(objE)), thC, z2);
        }
        return q2;
    }

    public final Object z(X x2, Object obj) {
        Object obj2 = null;
        Throwable q2 = null;
        C0056n c0056n = obj instanceof C0056n ? (C0056n) obj : null;
        Throwable th = c0056n != null ? c0056n.f732a : null;
        synchronized (x2) {
            x2.d();
            ArrayList<Throwable> arrayListG = x2.g(th);
            if (!arrayListG.isEmpty()) {
                for (Object obj3 : arrayListG) {
                    if (!(((Throwable) obj3) instanceof CancellationException)) {
                        obj2 = obj3;
                        break;
                    }
                }
                q2 = (Throwable) obj2;
                if (q2 == null) {
                    q2 = (Throwable) arrayListG.get(0);
                }
            } else if (x2.d()) {
                q2 = new Q(v(), null, this);
            }
            if (q2 != null && arrayListG.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                for (Throwable th2 : arrayListG) {
                    if (th2 != q2 && th2 != q2 && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        a1.a.c(q2, th2);
                    }
                }
            }
        }
        if (q2 != null && q2 != th) {
            obj = new C0056n(q2, false);
        }
        if (q2 != null && (u(q2) || F(q2))) {
            I0.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0056n.f731b.compareAndSet((C0056n) obj, 0, 1);
        }
        O(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f706e;
        Object m2 = obj instanceof L ? new M((L) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, x2, m2) && atomicReferenceFieldUpdater.get(this) == x2) {
        }
        x(x2, obj);
        return obj;
    }

    public void P() {
    }

    public void G(O.c cVar) {
        throw cVar;
    }

    public void O(Object obj) {
    }

    public void q(Object obj) {
    }
}
