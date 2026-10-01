package V0;

import Q0.c0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class v extends d implements c0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1013h = AtomicIntegerFieldUpdater.newUpdater(v.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f1014g;

    public v(long j2, v vVar, int i2) {
        super(vVar);
        this.f1014g = j2;
        this.cleanedAndPointers = i2 << 16;
    }

    @Override // V0.d
    public final boolean c() {
        return f1013h.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f1013h.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i2, z0.i iVar);

    public final void h() {
        if (f1013h.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f1013h;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
