package Q0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class N extends S {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f686j = AtomicIntegerFieldUpdater.newUpdater(N.class, "_invoked");
    private volatile int _invoked;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final H0.l f687i;

    public N(H0.l lVar) {
        this.f687i = lVar;
    }

    @Override // H0.l
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        o((Throwable) obj);
        return p041x0.g.f3419a;
    }

    @Override // Q0.U
    public final void o(Throwable th) {
        if (f686j.compareAndSet(this, 0, 1)) {
            this.f687i.j(th);
        }
    }
}
