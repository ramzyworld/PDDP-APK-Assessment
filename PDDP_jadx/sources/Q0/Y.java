package Q0;

import V0.AbstractC0068a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends V0.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z f704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f705e;

    public Y(U u2, Z z2, L l2) {
        this.f704d = z2;
        this.f705e = l2;
        this.f702b = u2;
    }

    @Override // V0.b
    public final void b(Object obj, Object obj2) {
        V0.l lVar = (V0.l) obj;
        boolean z2 = obj2 == null;
        U u2 = this.f702b;
        L l2 = z2 ? u2 : this.f703c;
        if (l2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V0.l.f995e;
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, this, l2)) {
                if (atomicReferenceFieldUpdater.get(lVar) != this) {
                    return;
                }
            }
            if (z2) {
                a0 a0Var = this.f703c;
                I0.i.b(a0Var);
                u2.i(a0Var);
            }
        }
    }

    @Override // V0.b
    public final D.j c(Object obj) {
        if (this.f704d.E() == this.f705e) {
            return null;
        }
        return AbstractC0068a.f973e;
    }
}
