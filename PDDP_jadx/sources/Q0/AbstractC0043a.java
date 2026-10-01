package Q0;

import V0.AbstractC0068a;

/* JADX INFO: renamed from: Q0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0043a extends Z implements z0.d, InterfaceC0062u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z0.i f708g;

    public AbstractC0043a(z0.i iVar, boolean z2) {
        super(z2);
        H((P) iVar.f(C0061t.f743f));
        this.f708g = iVar.c(this);
    }

    @Override // Q0.Z
    public final void G(O.c cVar) {
        AbstractC0063v.d(cVar, this.f708g);
    }

    @Override // Q0.Z
    public final void O(Object obj) {
        if (!(obj instanceof C0056n)) {
            V(obj);
        } else {
            C0056n c0056n = (C0056n) obj;
            U(c0056n.f732a, C0056n.f731b.get(c0056n) != 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W(int i2, AbstractC0043a abstractC0043a, H0.p pVar) {
        int iB = I.j.b(i2);
        if (iB == 0) {
            a1.a.H(pVar, abstractC0043a, this);
            return;
        }
        if (iB != 1) {
            if (iB == 2) {
                p000a.a.x(((B0.b) pVar).b(abstractC0043a, this)).m(p041x0.g.f3419a);
                return;
            }
            if (iB != 3) {
                throw new O.c();
            }
            try {
                z0.i iVar = this.f708g;
                Object objM = AbstractC0068a.m(iVar, null);
                try {
                    I0.s.a(2, pVar);
                    Object objH = pVar.h(abstractC0043a, this);
                    AbstractC0068a.g(iVar, objM);
                    if (objH != A0.a.f0e) {
                        m(objH);
                    }
                } catch (Throwable th) {
                    AbstractC0068a.g(iVar, objM);
                    throw th;
                }
            } catch (Throwable th2) {
                m(p000a.a.l(th2));
            }
        }
    }

    @Override // z0.d
    public final z0.i i() {
        return this.f708g;
    }

    @Override // Q0.InterfaceC0062u
    public final z0.i k() {
        return this.f708g;
    }

    @Override // z0.d
    public final void m(Object obj) {
        Throwable thA = p041x0.d.a(obj);
        if (thA != null) {
            obj = new C0056n(thA, false);
        }
        Object objL = L(obj);
        if (objL == AbstractC0063v.f747d) {
            return;
        }
        r(objL);
    }

    @Override // Q0.Z
    public final String v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void V(Object obj) {
    }

    public void U(Throwable th, boolean z2) {
    }
}
