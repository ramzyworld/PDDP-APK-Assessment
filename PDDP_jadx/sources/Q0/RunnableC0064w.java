package Q0;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: Q0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0064w extends G implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final RunnableC0064w f753n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f754o;

    static {
        Long l2;
        RunnableC0064w runnableC0064w = new RunnableC0064w();
        f753n = runnableC0064w;
        runnableC0064w.k(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f754o = timeUnit.toNanos(l2.longValue());
    }

    @Override // Q0.H
    public final Thread j() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // Q0.G, Q0.H
    public final void n() {
        debugStatus = 4;
        super.n();
    }

    @Override // Q0.G
    public final void o(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.o(runnable);
    }

    public final synchronized void r() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            G.f676k.set(this, null);
            G.f677l.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        h0.f721a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    _thread = null;
                    r();
                    if (q()) {
                        return;
                    }
                    j();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jL = l();
                    if (jL == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f754o + jNanoTime;
                        }
                        long j3 = j2 - jNanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            r();
                            if (q()) {
                                return;
                            }
                            j();
                            return;
                        }
                        if (jL > j3) {
                            jL = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (jL > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            r();
                            if (q()) {
                                return;
                            }
                            j();
                            return;
                        }
                        LockSupport.parkNanos(this, jL);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            r();
            if (!q()) {
                j();
            }
            throw th;
        }
    }
}
