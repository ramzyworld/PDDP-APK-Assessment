package Q0;

import V0.AbstractC0068a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Q0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0050h extends S {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0048f f720i;

    public C0050h(C0048f c0048f) {
        this.f720i = c0048f;
    }

    @Override // H0.l
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        o((Throwable) obj);
        return p041x0.g.f3419a;
    }

    @Override // Q0.U
    public final void o(Throwable th) {
        Z zN = n();
        C0048f c0048f = this.f720i;
        Throwable thT = c0048f.t(zN);
        if (c0048f.y()) {
            z0.d dVar = c0048f.f717h;
            I0.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            V0.h hVar = (V0.h) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V0.h.f982l;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                D.j jVar = AbstractC0068a.f972d;
                if (I0.i.a(obj, jVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, jVar, thT)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != jVar) {
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(hVar) == obj);
                }
            }
        }
        c0048f.q(thT);
        if (c0048f.y()) {
            return;
        }
        c0048f.r();
    }
}
