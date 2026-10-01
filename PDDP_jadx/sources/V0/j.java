package V0;

import Q0.AbstractC0060s;
import Q0.AbstractC0065x;
import Q0.InterfaceC0066y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC0060s implements InterfaceC0066y {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f990k = AtomicIntegerFieldUpdater.newUpdater(j.class, "runningWorkers");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final X0.l f991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f994j;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public j(X0.l lVar, int i2) {
        this.f991g = lVar;
        this.f992h = i2;
        if ((lVar instanceof InterfaceC0066y ? (InterfaceC0066y) lVar : null) == null) {
            int i3 = AbstractC0065x.f755a;
        }
        this.f993i = new m();
        this.f994j = new Object();
    }

    @Override // Q0.AbstractC0060s
    public final void e(z0.i iVar, Runnable runnable) {
        this.f993i.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f990k;
        if (atomicIntegerFieldUpdater.get(this) < this.f992h) {
            synchronized (this.f994j) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f992h) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableI = i();
                if (runnableI == null) {
                    return;
                }
                this.f991g.e(this, new i(0, this, runnableI));
            }
        }
    }

    public final Runnable i() {
        while (true) {
            Runnable runnable = (Runnable) this.f993i.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f994j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f990k;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f993i.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
