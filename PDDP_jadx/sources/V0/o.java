package V0;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1000e = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_next");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1001f = AtomicLongFieldUpdater.newUpdater(o.class, "_state");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final D.j f1002g = new D.j(14, "REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f1006d;

    public o(int i2, boolean z2) {
        this.f1003a = i2;
        this.f1004b = z2;
        int i3 = i2 - 1;
        this.f1005c = i3;
        this.f1006d = new AtomicReferenceArray(i2);
        if (i3 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i2 & i3) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1001f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j2) != 0) {
                return (2305843009213693952L & j2) != 0 ? 2 : 1;
            }
            int i2 = (int) (1073741823 & j2);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            int i4 = this.f1005c;
            if (((i3 + 2) & i4) == (i2 & i4)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f1006d;
            if (!this.f1004b && atomicReferenceArray.get(i3 & i4) != null) {
                int i5 = this.f1003a;
                if (i5 < 1024 || ((i3 - i2) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j2, ((-1152921503533105153L) & j2) | (((long) ((i3 + 1) & 1073741823)) << 30))) {
                atomicReferenceArray.set(i3 & i4, runnable);
                o oVarC = this;
                while ((atomicLongFieldUpdater.get(oVarC) & 1152921504606846976L) != 0) {
                    oVarC = oVarC.c();
                    AtomicReferenceArray atomicReferenceArray2 = oVarC.f1006d;
                    int i6 = oVarC.f1005c & i3;
                    Object obj = atomicReferenceArray2.get(i6);
                    if ((obj instanceof n) && ((n) obj).f999a == i3) {
                        atomicReferenceArray2.set(i6, runnable);
                    } else {
                        oVarC = null;
                    }
                    if (oVarC == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        do {
            atomicLongFieldUpdater = f1001f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, 2305843009213693952L | j2));
        return true;
    }

    public final o c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        while (true) {
            atomicLongFieldUpdater = f1001f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                break;
            }
            long j3 = j2 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j3)) {
                j2 = j3;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1000e;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            if (oVar != null) {
                return oVar;
            }
            o oVar2 = new o(this.f1003a * 2, this.f1004b);
            int i2 = (int) (1073741823 & j2);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i4 = this.f1005c;
                int i5 = i2 & i4;
                if (i5 == (i4 & i3)) {
                    break;
                }
                Object nVar = this.f1006d.get(i5);
                if (nVar == null) {
                    nVar = new n(i2);
                }
                oVar2.f1006d.set(oVar2.f1005c & i2, nVar);
                i2++;
            }
            atomicLongFieldUpdater.set(oVar2, (-1152921504606846977L) & j2);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, oVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1001f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                return f1002g;
            }
            int i2 = (int) (j2 & 1073741823);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            int i4 = this.f1005c;
            int i5 = i2 & i4;
            if ((i3 & i4) == i5) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f1006d;
            Object obj = atomicReferenceArray.get(i5);
            boolean z2 = this.f1004b;
            if (obj == null) {
                if (z2) {
                    return null;
                }
            } else {
                if (obj instanceof n) {
                    return null;
                }
                long j3 = (i2 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j2, (j2 & (-1073741824)) | j3)) {
                    atomicReferenceArray.set(i5, null);
                    return obj;
                }
                if (z2) {
                    o oVarC = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1001f;
                        long j4 = atomicLongFieldUpdater2.get(oVarC);
                        int i6 = (int) (j4 & 1073741823);
                        if ((j4 & 1152921504606846976L) != 0) {
                            oVarC = oVarC.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(oVarC, j4, (j4 & (-1073741824)) | j3)) {
                                oVarC.f1006d.set(oVarC.f1005c & i6, null);
                                oVarC = null;
                            } else {
                                continue;
                            }
                        }
                        if (oVarC == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
