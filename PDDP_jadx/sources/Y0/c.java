package Y0;

import H0.l;
import Q0.C0048f;
import Q0.InterfaceC0047e;
import Q0.l0;
import V0.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0047e, l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0048f f1106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f1107f;

    public c(d dVar, C0048f c0048f) {
        this.f1107f = dVar;
        this.f1106e = c0048f;
    }

    @Override // Q0.l0
    public final void a(v vVar, int i2) {
        this.f1106e.a(vVar, i2);
    }

    @Override // Q0.InterfaceC0047e
    public final D.j e(Object obj, l lVar) {
        d dVar = this.f1107f;
        b bVar = new b(1, dVar, this);
        D.j jVarE = this.f1106e.e((p041x0.g) obj, bVar);
        if (jVarE != null) {
            d.f1108g.set(dVar, null);
        }
        return jVarE;
    }

    @Override // z0.d
    public final z0.i i() {
        return this.f1106e.f718i;
    }

    @Override // Q0.InterfaceC0047e
    public final void l(Object obj, l lVar) {
        p041x0.g gVar = p041x0.g.f3419a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1108g;
        d dVar = this.f1107f;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f1106e.l(gVar, new b(0, dVar, this));
    }

    @Override // z0.d
    public final void m(Object obj) {
        this.f1106e.m(obj);
    }

    @Override // Q0.InterfaceC0047e
    public final void o(Object obj) {
        this.f1106e.o(obj);
    }
}
