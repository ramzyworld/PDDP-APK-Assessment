package X0;

import Q0.AbstractC0063v;
import V0.t;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Executor, Closeable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1034l = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1035m = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1036n = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final D.j f1037o = new D.j(14, "NOT_IN_STACK");
    private volatile int _isTerminated;
    private volatile long controlState;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f1040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f1042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f1043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f1044k;
    private volatile long parkedWorkersStack;

    public b(int i2, int i3, long j2, String str) {
        this.f1038e = i2;
        this.f1039f = i3;
        this.f1040g = j2;
        this.f1041h = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f1042i = new e();
        this.f1043j = new e();
        this.f1044k = new t((i2 + 1) * 2);
        this.controlState = ((long) i2) << 42;
        this._isTerminated = 0;
    }

    public final int a() {
        synchronized (this.f1044k) {
            try {
                if (f1036n.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f1035m;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f1038e) {
                    return 0;
                }
                if (i2 >= this.f1039f) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.f1044k.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i4);
                this.f1044k.c(i4, aVar);
                if (i4 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i5 = i3 + 1;
                aVar.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, i iVar, boolean z2) {
        h jVar;
        int i2;
        k.f1059f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof h) {
            jVar = (h) runnable;
            jVar.f1050e = jNanoTime;
            jVar.f1051f = iVar;
        } else {
            jVar = new j(runnable, jNanoTime, iVar);
        }
        boolean z3 = false;
        boolean z4 = jVar.f1051f.f1052a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1035m;
        long jAddAndGet = z4 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !I0.i.a(aVar.f1033l, this)) {
            aVar = null;
        }
        if (aVar != null && (i2 = aVar.f1028g) != 5 && (jVar.f1051f.f1052a != 0 || i2 != 2)) {
            aVar.f1032k = true;
            m mVar = aVar.f1026e;
            if (z2) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                h hVar = (h) m.f1063b.getAndSet(mVar, jVar);
                jVar = hVar == null ? null : mVar.a(hVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f1051f.f1052a == 1 ? this.f1043j.a(jVar) : this.f1042i.a(jVar))) {
                throw new RejectedExecutionException(this.f1041h + " was terminated");
            }
        }
        if (z2 && aVar != null) {
            z3 = true;
        }
        if (z4) {
            if (z3 || e() || d(jAddAndGet)) {
                return;
            }
            e();
            return;
        }
        if (z3 || e() || d(atomicLongFieldUpdater.get(this))) {
            return;
        }
        e();
    }

    public final void c(a aVar, int i2, int i3) {
        while (true) {
            long j2 = f1034l.get(this);
            int iB = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (iB == i2) {
                if (i3 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f1037o) {
                            iB = -1;
                            break;
                        }
                        if (objC == null) {
                            iB = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        iB = aVar2.b();
                        if (iB != 0) {
                            break;
                        } else {
                            objC = aVar2.c();
                        }
                    }
                } else {
                    iB = i3;
                }
            }
            if (iB >= 0) {
                if (f1034l.compareAndSet(this, j2, j3 | ((long) iB))) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i2;
        h hVarA;
        if (f1036n.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !I0.i.a(aVar.f1033l, this)) {
                aVar = null;
            }
            synchronized (this.f1044k) {
                i2 = (int) (f1035m.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    Object objB = this.f1044k.b(i3);
                    I0.i.b(objB);
                    a aVar2 = (a) objB;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f1026e;
                        e eVar = this.f1043j;
                        mVar.getClass();
                        h hVar = (h) m.f1063b.getAndSet(mVar, null);
                        if (hVar != null) {
                            eVar.a(hVar);
                        }
                        while (true) {
                            h hVarB = mVar.b();
                            if (hVarB == null) {
                                break;
                            } else {
                                eVar.a(hVarB);
                            }
                        }
                    }
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f1043j.b();
            this.f1042i.b();
            while (true) {
                if (aVar != null) {
                    hVarA = aVar.a(true);
                    if (hVarA == null) {
                        hVarA = (h) this.f1042i.d();
                        if (hVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    hVarA = (h) this.f1042i.d();
                    if (hVarA == null && (hVarA = (h) this.f1043j.d()) == null) {
                        break;
                    }
                }
                try {
                    hVarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(5);
            }
            f1034l.set(this, 0L);
            f1035m.set(this, 0L);
        }
    }

    public final boolean d(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f1038e;
        if (i2 < i3) {
            int iA = a();
            if (iA == 1 && i3 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        D.j jVar;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1034l;
            long j2 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f1044k.b((int) (2097151 & j2));
            if (aVar == null) {
                aVar = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    jVar = f1037o;
                    if (objC == jVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j2, j3 | ((long) iB))) {
                    aVar.g(jVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f1025m.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, k.f1060g, false);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        t tVar = this.f1044k;
        int iA = tVar.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < iA; i7++) {
            a aVar = (a) tVar.b(i7);
            if (aVar != null) {
                m mVar = aVar.f1026e;
                mVar.getClass();
                int i8 = m.f1063b.get(mVar) != null ? (m.f1064c.get(mVar) - m.f1065d.get(mVar)) + 1 : m.f1064c.get(mVar) - m.f1065d.get(mVar);
                int iB = I.j.b(aVar.f1028g);
                if (iB == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i8);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iB == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i8);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iB == 2) {
                    i4++;
                } else if (iB == 3) {
                    i5++;
                    if (i8 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i8);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iB == 4) {
                    i6++;
                }
            }
        }
        long j2 = f1035m.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f1041h);
        sb4.append('@');
        sb4.append(AbstractC0063v.b(this));
        sb4.append("[Pool Size {core = ");
        int i9 = this.f1038e;
        sb4.append(i9);
        sb4.append(", max = ");
        sb4.append(this.f1039f);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i2);
        sb4.append(", blocking = ");
        sb4.append(i3);
        sb4.append(", parked = ");
        sb4.append(i4);
        sb4.append(", dormant = ");
        sb4.append(i5);
        sb4.append(", terminated = ");
        sb4.append(i6);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f1042i.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f1043j.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i9 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
