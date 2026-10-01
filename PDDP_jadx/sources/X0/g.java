package X0;

import Q0.I;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends I {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f1049g;

    @Override // Q0.AbstractC0060s
    public final void e(z0.i iVar, Runnable runnable) {
        b bVar = this.f1049g;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1034l;
        bVar.b(runnable, k.f1060g, false);
    }
}
