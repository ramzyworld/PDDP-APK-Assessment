package U0;

import Q0.AbstractC0063v;
import Q0.C0058p;
import V0.AbstractC0068a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final T0.d f924h;

    public h(T0.d dVar, z0.i iVar, int i2, int i3) {
        super(iVar, i2, i3);
        this.f924h = dVar;
    }

    @Override // U0.f
    public final Object a(S0.p pVar, z0.d dVar) {
        Object objG = this.f924h.g(new r(pVar), dVar);
        A0.a aVar = A0.a.f0e;
        p041x0.g gVar = p041x0.g.f3419a;
        if (objG != aVar) {
            objG = gVar;
        }
        return objG == aVar ? objG : gVar;
    }

    @Override // U0.f
    public final f b(z0.i iVar, int i2, int i3) {
        return new h(this.f924h, iVar, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // U0.f, T0.d
    public final Object g(T0.e eVar, z0.d dVar) {
        Object objG;
        A0.a aVar = A0.a.f0e;
        p041x0.g gVar = p041x0.g.f3419a;
        if (this.f919f == -3) {
            z0.i iVarI = dVar.i();
            Boolean bool = Boolean.FALSE;
            C0058p c0058p = C0058p.f736h;
            z0.i iVar = this.f918e;
            z0.i iVarC = !((Boolean) iVar.d(bool, c0058p)).booleanValue() ? iVarI.c(iVar) : AbstractC0063v.a(iVarI, iVar, false);
            if (I0.i.a(iVarC, iVarI)) {
                objG = this.f924h.g(eVar, dVar);
                if (objG != aVar) {
                    objG = gVar;
                }
                if (objG != aVar) {
                    return gVar;
                }
            } else {
                z0.e eVar2 = z0.e.f3503e;
                if (I0.i.a(iVarC.f(eVar2), iVarI.f(eVar2))) {
                    z0.i iVarI2 = dVar.i();
                    if (!(eVar instanceof r)) {
                        eVar = new T0.l(eVar, iVarI2);
                    }
                    objG = l.b(iVarC, eVar, AbstractC0068a.l(iVarC), new g(this, null), dVar);
                    if (objG != aVar) {
                        objG = gVar;
                    }
                    if (objG != aVar) {
                        return gVar;
                    }
                } else {
                    objG = super.g(eVar, dVar);
                    if (objG != aVar) {
                        return gVar;
                    }
                }
            }
        } else {
            objG = super.g(eVar, dVar);
            if (objG != aVar) {
                return gVar;
            }
        }
        return objG;
    }

    @Override // U0.f
    public final String toString() {
        return this.f924h + " -> " + super.toString();
    }
}
