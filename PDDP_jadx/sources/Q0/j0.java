package Q0;

import V0.AbstractC0068a;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends V0.u {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ThreadLocal f724i;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public j0(z0.i iVar, B0.g gVar) {
        k0 k0Var = k0.f725e;
        super(gVar, iVar.f(k0Var) == null ? iVar.c(k0Var) : iVar);
        this.f724i = new ThreadLocal();
        z0.i iVar2 = gVar.f4f;
        I0.i.b(iVar2);
        if (iVar2.f(z0.e.f3503e) instanceof AbstractC0060s) {
            return;
        }
        Object objM = AbstractC0068a.m(iVar, null);
        AbstractC0068a.g(iVar, objM);
        Y(iVar, objM);
    }

    public final boolean X() {
        boolean z2 = this.threadLocalIsSet && this.f724i.get() == null;
        this.f724i.remove();
        return !z2;
    }

    public final void Y(z0.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f724i.set(new p041x0.b(iVar, obj));
    }

    @Override // V0.u, Q0.Z
    public final void r(Object obj) {
        if (this.threadLocalIsSet) {
            p041x0.b bVar = (p041x0.b) this.f724i.get();
            if (bVar != null) {
                AbstractC0068a.g((z0.i) bVar.f3411e, bVar.f3412f);
            }
            this.f724i.remove();
        }
        Object objH = AbstractC0063v.h(obj);
        z0.d dVar = this.f1012h;
        z0.i iVarI = dVar.i();
        Object objM = AbstractC0068a.m(iVarI, null);
        j0 j0VarM = objM != AbstractC0068a.f974f ? AbstractC0063v.m(dVar, iVarI, objM) : null;
        try {
            this.f1012h.m(objH);
        } finally {
            if (j0VarM == null || j0VarM.X()) {
                AbstractC0068a.g(iVarI, objM);
            }
        }
    }
}
