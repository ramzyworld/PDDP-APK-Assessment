package Q0;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class J extends I implements InterfaceC0066y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f683g;

    public J(Executor executor) {
        Method method;
        this.f683g = executor;
        Method method2 = V0.c.f976a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = V0.c.f976a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f683g;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // Q0.AbstractC0060s
    public final void e(z0.i iVar, Runnable runnable) {
        try {
            this.f683g.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            P p2 = (P) iVar.f(C0061t.f743f);
            if (p2 != null) {
                p2.a(cancellationException);
            }
            B.f673b.e(iVar, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof J) && ((J) obj).f683g == this.f683g;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f683g);
    }

    @Override // Q0.AbstractC0060s
    public final String toString() {
        return this.f683g.toString();
    }
}
