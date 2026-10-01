package Q0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Q0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0056n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f731b = AtomicIntegerFieldUpdater.newUpdater(C0056n.class, "_handled");
    private volatile int _handled;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f732a;

    public C0056n(Throwable th, boolean z2) {
        this.f732a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f732a + ']';
    }
}
