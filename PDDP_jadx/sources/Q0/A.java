package Q0;

import V0.AbstractC0068a;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class A extends X0.h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f671g;

    public A(int i2) {
        super(0L, X0.k.f1060g);
        this.f671g = i2;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract z0.d c();

    public Throwable d(Object obj) {
        C0056n c0056n = obj instanceof C0056n ? (C0056n) obj : null;
        if (c0056n != null) {
            return c0056n.f732a;
        }
        return null;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            a1.a.c(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        I0.i.b(th);
        AbstractC0063v.d(new G0.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().i());
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        Object objL = p041x0.g.f3419a;
        X0.i iVar = this.f1051f;
        try {
            z0.d dVarC = c();
            I0.i.c(dVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            V0.h hVar = (V0.h) dVarC;
            B0.b bVar = hVar.f984i;
            Object obj = hVar.f986k;
            z0.i iVarI = bVar.i();
            Object objM = AbstractC0068a.m(iVarI, obj);
            j0 j0VarM = objM != AbstractC0068a.f974f ? AbstractC0063v.m(bVar, iVarI, objM) : null;
            try {
                z0.i iVarI2 = bVar.i();
                Object objJ = j();
                Throwable thD = d(objJ);
                P p2 = (thD == null && AbstractC0063v.f(this.f671g)) ? (P) iVarI2.f(C0061t.f743f) : null;
                if (p2 != null && !p2.b()) {
                    CancellationException cancellationExceptionA = ((Z) p2).A();
                    b(objJ, cancellationExceptionA);
                    bVar.m(p000a.a.l(cancellationExceptionA));
                } else if (thD != null) {
                    bVar.m(p000a.a.l(thD));
                } else {
                    bVar.m(f(objJ));
                }
                if (j0VarM == null || j0VarM.X()) {
                    AbstractC0068a.g(iVarI, objM);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    objL = p000a.a.l(th);
                }
                h(null, p041x0.d.a(objL));
            } catch (Throwable th2) {
                if (j0VarM == null || j0VarM.X()) {
                    AbstractC0068a.g(iVarI, objM);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                objL = p000a.a.l(th4);
            }
            h(th3, p041x0.d.a(objL));
        }
    }

    public Object f(Object obj) {
        return obj;
    }
}
