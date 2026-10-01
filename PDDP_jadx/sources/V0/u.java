package V0;

import Q0.AbstractC0043a;
import Q0.AbstractC0063v;

/* JADX INFO: loaded from: classes.dex */
public class u extends AbstractC0043a implements B0.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z0.d f1012h;

    public u(z0.d dVar, z0.i iVar) {
        super(iVar, true);
        this.f1012h = dVar;
    }

    @Override // Q0.Z
    public final boolean J() {
        return true;
    }

    @Override // B0.c
    public final B0.c g() {
        z0.d dVar = this.f1012h;
        if (dVar instanceof B0.c) {
            return (B0.c) dVar;
        }
        return null;
    }

    @Override // Q0.Z
    public void q(Object obj) {
        AbstractC0068a.h(p000a.a.x(this.f1012h), AbstractC0063v.h(obj), null);
    }

    @Override // Q0.Z
    public void r(Object obj) {
        this.f1012h.m(AbstractC0063v.h(obj));
    }
}
