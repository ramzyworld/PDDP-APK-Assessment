package Q0;

import V0.AbstractC0068a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Q0.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0067z extends V0.u {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f756i = AtomicIntegerFieldUpdater.newUpdater(C0067z.class, "_decision");
    private volatile int _decision;

    @Override // V0.u, Q0.Z
    public final void q(Object obj) {
        r(obj);
    }

    @Override // V0.u, Q0.Z
    public final void r(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f756i;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC0068a.h(p000a.a.x(this.f1012h), AbstractC0063v.h(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
