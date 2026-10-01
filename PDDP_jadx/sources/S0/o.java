package S0;

import G.M;
import Q0.AbstractC0043a;
import Q0.AbstractC0063v;
import Q0.C0056n;
import Q0.Q;
import Q0.X;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC0043a implements p, f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f818h;

    public o(z0.i iVar, b bVar) {
        super(iVar, true);
        this.f818h = bVar;
    }

    @Override // Q0.AbstractC0043a
    public final void U(Throwable th, boolean z2) {
        if (this.f818h.f(th, false) || z2) {
            return;
        }
        AbstractC0063v.d(th, this.f708g);
    }

    @Override // Q0.AbstractC0043a
    public final void V(Object obj) {
        this.f818h.f(null, false);
    }

    public final void X(M m2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b bVar = this.f818h;
        bVar.getClass();
        do {
            atomicReferenceFieldUpdater = b.f784o;
            if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, m2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(bVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(bVar);
            D.j jVar = d.f804q;
            if (obj != jVar) {
                if (obj == d.f805r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            D.j jVar2 = d.f805r;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(bVar, jVar, jVar2)) {
                    m2.j(bVar.l());
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(bVar) == jVar);
        }
    }

    @Override // Q0.Z, Q0.P
    public final void a(CancellationException cancellationException) {
        Object objE = E();
        if (objE instanceof C0056n) {
            return;
        }
        if ((objE instanceof X) && ((X) objE).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new Q(v(), null, this);
        }
        t(cancellationException);
    }

    @Override // S0.r
    public final Object j(Object obj) {
        return this.f818h.j(obj);
    }

    @Override // S0.r
    public final Object n(Object obj, z0.d dVar) {
        return this.f818h.n(obj, dVar);
    }

    @Override // Q0.Z
    public final void t(CancellationException cancellationException) {
        this.f818h.f(cancellationException, true);
        s(cancellationException);
    }
}
