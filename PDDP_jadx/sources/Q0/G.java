package Q0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public abstract class G extends H implements InterfaceC0066y {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f676k = AtomicReferenceFieldUpdater.newUpdater(G.class, Object.class, "_queue");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f677l = AtomicReferenceFieldUpdater.newUpdater(G.class, Object.class, "_delayed");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f678m = AtomicIntegerFieldUpdater.newUpdater(G.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // Q0.AbstractC0060s
    public final void e(z0.i iVar, Runnable runnable) {
        o(runnable);
    }

    @Override // Q0.H
    public final long l() {
        Runnable runnable;
        if (m()) {
            return 0L;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f676k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (obj instanceof V0.o) {
                V0.o oVar = (V0.o) obj;
                Object objD = oVar.d();
                if (objD != V0.o.f1002g) {
                    runnable = (Runnable) objD;
                    break;
                }
                V0.o oVarC = oVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else {
                if (obj == AbstractC0063v.f745b) {
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        if (runnable == null) {
            return p();
        }
        runnable.run();
        return 0L;
    }

    @Override // Q0.H
    public void n() {
        h0.f721a.set(null);
        f678m.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f676k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            D.j jVar = AbstractC0063v.f745b;
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, jVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof V0.o) {
                ((V0.o) obj).b();
                break;
            } else {
                if (obj == jVar) {
                    break;
                }
                V0.o oVar = new V0.o(8, true);
                oVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (l() <= 0) {
        }
        System.nanoTime();
    }

    public void o(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f676k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f678m.get(this) == 0) {
                if (obj == null) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == null);
                } else if (obj instanceof V0.o) {
                    V0.o oVar = (V0.o) obj;
                    int iA = oVar.a(runnable);
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 1) {
                        V0.o oVarC = oVar.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iA != 2) {
                    }
                } else if (obj != AbstractC0063v.f745b) {
                    V0.o oVar2 = new V0.o(8, true);
                    oVar2.a((Runnable) obj);
                    oVar2.a(runnable);
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar2)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                }
            }
            RunnableC0064w.f753n.o(runnable);
            return;
        }
        Thread threadJ = j();
        if (Thread.currentThread() != threadJ) {
            LockSupport.unpark(threadJ);
        }
    }

    public final long p() {
        p043y0.b bVar = this.f682i;
        if (((bVar == null || bVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj = f676k.get(this);
        if (obj != null) {
            if (!(obj instanceof V0.o)) {
                return obj == AbstractC0063v.f745b ? Long.MAX_VALUE : 0L;
            }
            long j2 = V0.o.f1001f.get((V0.o) obj);
            if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    public final boolean q() {
        p043y0.b bVar = this.f682i;
        if (!(bVar != null ? bVar.isEmpty() : true)) {
            return false;
        }
        Object obj = f676k.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof V0.o) {
            long j2 = V0.o.f1001f.get((V0.o) obj);
            if (((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0063v.f745b) {
            return true;
        }
        return false;
    }
}
