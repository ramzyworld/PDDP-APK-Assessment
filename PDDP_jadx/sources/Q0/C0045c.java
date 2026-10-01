package Q0;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: Q0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0045c extends AbstractC0043a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Thread f711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final H f712i;

    public C0045c(z0.i iVar, Thread thread, H h2) {
        super(iVar, true);
        this.f711h = thread;
        this.f712i = h2;
    }

    @Override // Q0.Z
    public final void q(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f711h;
        if (I0.i.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
