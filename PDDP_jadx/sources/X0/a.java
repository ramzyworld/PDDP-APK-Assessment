package X0;

import I0.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1025m = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f1026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f1027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f1029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f1030i;
    private volatile int indexInArray;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1031j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1032k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f1033l;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public a(b bVar, int i2) {
        this.f1033l = bVar;
        setDaemon(true);
        this.f1026e = new m();
        this.f1027f = new p();
        this.f1028g = 4;
        this.nextParkedWorker = b.f1037o;
        K0.e.f364e.getClass();
        this.f1031j = K0.e.f365f.a().nextInt();
        f(i2);
    }

    public final h a(boolean z2) {
        h hVarE;
        h hVarE2;
        b bVar;
        long j2;
        int i2 = this.f1028g;
        h hVar = null;
        m mVar = this.f1026e;
        b bVar2 = this.f1033l;
        if (i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1035m;
            do {
                bVar = this.f1033l;
                j2 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f1063b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 == null || hVar2.f1051f.f1052a != 1) {
                            int i3 = m.f1065d.get(mVar);
                            int i4 = m.f1064c.get(mVar);
                            while (i3 != i4 && m.f1066e.get(mVar) != 0) {
                                i4--;
                                h hVarC = mVar.c(i4, true);
                                if (hVarC != null) {
                                    hVar = hVarC;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                                hVar = hVar2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == hVar2);
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar2.f1043j.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f1035m.compareAndSet(bVar, j2, j2 - 4398046511104L));
            this.f1028g = 1;
        }
        if (z2) {
            boolean z3 = d(bVar2.f1038e * 2) == 0;
            if (z3 && (hVarE2 = e()) != null) {
                return hVarE2;
            }
            mVar.getClass();
            h hVarB = (h) m.f1063b.getAndSet(mVar, null);
            if (hVarB == null) {
                hVarB = mVar.b();
            }
            if (hVarB != null) {
                return hVarB;
            }
            if (!z3 && (hVarE = e()) != null) {
                return hVarE;
            }
        } else {
            h hVarE3 = e();
            if (hVarE3 != null) {
                return hVarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i3 = this.f1031j;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f1031j = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
    }

    public final h e() {
        int iD = d(2);
        b bVar = this.f1033l;
        if (iD == 0) {
            h hVar = (h) bVar.f1042i.d();
            return hVar != null ? hVar : (h) bVar.f1043j.d();
        }
        h hVar2 = (h) bVar.f1043j.d();
        return hVar2 != null ? hVar2 : (h) bVar.f1042i.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1033l.f1041h);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.f1028g;
        boolean z2 = i3 == 1;
        if (z2) {
            b.f1035m.addAndGet(this.f1033l, 4398046511104L);
        }
        if (i3 != i2) {
            this.f1028g = i2;
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00df A[SYNTHETIC] */
    public final h i(int i2) {
        int i3;
        h hVarC;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1035m;
        b bVar = this.f1033l;
        int i4 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        h hVar = null;
        if (i4 < 2) {
            return null;
        }
        int iD = d(i4);
        int i5 = 0;
        long jMin = Long.MAX_VALUE;
        while (i5 < i4) {
            int i6 = iD + 1;
            if (i6 > i4) {
                i6 = 1;
            }
            a aVar = (a) bVar.f1044k.b(i6);
            if (aVar == null || aVar == this) {
                i3 = i6;
            } else {
                m mVar = aVar.f1026e;
                if (i2 != 3) {
                    mVar.getClass();
                    int i7 = m.f1065d.get(mVar);
                    int i8 = m.f1064c.get(mVar);
                    boolean z2 = i2 == 1;
                    while (true) {
                        if (i7 != i8 && (!z2 || m.f1066e.get(mVar) != 0)) {
                            int i9 = i7 + 1;
                            hVarC = mVar.c(i7, z2);
                            if (hVarC != null) {
                                break;
                            }
                            i7 = i9;
                        } else {
                            hVarC = hVar;
                            break;
                        }
                    }
                } else {
                    hVarC = mVar.b();
                }
                p pVar = this.f1027f;
                if (hVarC != null) {
                    pVar.f338e = hVarC;
                    i3 = i6;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f1063b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 != null) {
                            if (((hVar2.f1051f.f1052a == 1 ? 1 : 2) & i2) != 0) {
                                k.f1059f.getClass();
                                i3 = i6;
                                long jNanoTime = System.nanoTime() - hVar2.f1050e;
                                long j3 = k.f1055b;
                                if (jNanoTime < j3) {
                                    j2 = j3 - jNanoTime;
                                    hVar = null;
                                    break;
                                }
                                while (true) {
                                    hVar = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                                        pVar.f338e = hVar2;
                                    } else if (atomicReferenceFieldUpdater.get(mVar) != hVar2) {
                                        i6 = i3;
                                        hVar = null;
                                    }
                                }
                            }
                        }
                        i3 = i6;
                        j2 = -2;
                        break;
                    }
                    if (j2 == -1) {
                        h hVar3 = (h) pVar.f338e;
                        pVar.f338e = hVar;
                        return hVar3;
                    }
                    if (j2 > 0) {
                        jMin = Math.min(jMin, j2);
                    }
                }
                j2 = -1;
                if (j2 == -1) {
                    h hVar4 = (h) pVar.f338e;
                    pVar.f338e = hVar;
                    return hVar4;
                }
                if (j2 > 0) {
                    jMin = Math.min(jMin, j2);
                }
            }
            i5++;
            iD = i3;
            hVar = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f1030i = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        int i2;
        loop0: while (true) {
            boolean z2 = false;
            while (true) {
                b bVar = this.f1033l;
                bVar.getClass();
                int i3 = 5;
                if (b.f1036n.get(bVar) != 0 || this.f1028g == 5) {
                    break loop0;
                }
                h hVarA = a(this.f1032k);
                int i4 = 3;
                if (hVarA == null) {
                    this.f1032k = false;
                    if (this.f1030i == 0) {
                        Object obj = this.nextParkedWorker;
                        D.j jVar = b.f1037o;
                        if (obj != jVar) {
                            f1025m.set(this, -1);
                            while (this.nextParkedWorker != b.f1037o) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1025m;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                b bVar2 = this.f1033l;
                                bVar2.getClass();
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f1036n;
                                if (atomicIntegerFieldUpdater2.get(bVar2) != 0 || this.f1028g == i3) {
                                    break;
                                }
                                h(i4);
                                Thread.interrupted();
                                if (this.f1029h == 0) {
                                    this.f1029h = System.nanoTime() + this.f1033l.f1040g;
                                }
                                LockSupport.parkNanos(this.f1033l.f1040g);
                                if (System.nanoTime() - this.f1029h >= 0) {
                                    this.f1029h = 0L;
                                    b bVar3 = this.f1033l;
                                    synchronized (bVar3.f1044k) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(bVar3) != 0)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f1035m;
                                                if (((int) (atomicLongFieldUpdater2.get(bVar3) & 2097151)) > bVar3.f1038e) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i5 = this.indexInArray;
                                                        f(0);
                                                        bVar3.c(this, i5, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar3) & 2097151);
                                                        if (andDecrement != i5) {
                                                            Object objB = bVar3.f1044k.b(andDecrement);
                                                            I0.i.b(objB);
                                                            a aVar = (a) objB;
                                                            bVar3.f1044k.c(i5, aVar);
                                                            aVar.f(i5);
                                                            bVar3.c(aVar, andDecrement, i5);
                                                        }
                                                        bVar3.f1044k.c(andDecrement, null);
                                                        this.f1028g = 5;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                                i3 = 5;
                                i4 = 3;
                            }
                        } else {
                            b bVar4 = this.f1033l;
                            bVar4.getClass();
                            if (this.nextParkedWorker == jVar) {
                                do {
                                    atomicLongFieldUpdater = b.f1034l;
                                    j2 = atomicLongFieldUpdater.get(bVar4);
                                    i2 = this.indexInArray;
                                    this.nextParkedWorker = bVar4.f1044k.b((int) (j2 & 2097151));
                                } while (!atomicLongFieldUpdater.compareAndSet(bVar4, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2)));
                            }
                        }
                    } else {
                        if (z2) {
                            h(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f1030i);
                            this.f1030i = 0L;
                            break;
                        }
                        z2 = true;
                    }
                } else {
                    this.f1030i = 0L;
                    int i6 = hVarA.f1051f.f1052a;
                    this.f1029h = 0L;
                    if (this.f1028g == 3) {
                        this.f1028g = 2;
                    }
                    b bVar5 = this.f1033l;
                    if (i6 != 0 && h(2) && !bVar5.e() && !bVar5.d(b.f1035m.get(bVar5))) {
                        bVar5.e();
                    }
                    bVar5.getClass();
                    try {
                        hVarA.run();
                    } catch (Throwable th2) {
                        Thread threadCurrentThread = Thread.currentThread();
                        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                    }
                    if (i6 != 0) {
                        b.f1035m.addAndGet(bVar5, -2097152L);
                        if (this.f1028g == 5) {
                            break;
                        }
                        this.f1028g = 4;
                        break;
                    }
                    break;
                }
            }
        }
        h(5);
    }
}
