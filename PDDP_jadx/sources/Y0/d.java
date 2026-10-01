package Y0;

import Q0.AbstractC0063v;
import Q0.C0048f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h implements a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1108g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z2) {
        super(z2 ? 1 : 0);
        this.owner = z2 ? null : e.f1109a;
    }

    public final Object c(B0.b bVar) throws Throwable {
        boolean zD = d(null);
        p041x0.g gVar = p041x0.g.f3419a;
        if (zD) {
            return gVar;
        }
        C0048f c0048fC = AbstractC0063v.c(p000a.a.x(bVar));
        try {
            a(new c(this, c0048fC));
            Object objU = c0048fC.u();
            A0.a aVar = A0.a.f0e;
            if (objU != aVar) {
                objU = gVar;
            }
            return objU == aVar ? objU : gVar;
        } catch (Throwable th) {
            c0048fC.B();
            throw th;
        }
    }

    public final boolean d(Object obj) {
        int i2;
        char c2;
        char c3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f1116f;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 > 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1108g;
                if (i3 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (Math.max(atomicIntegerFieldUpdater.get(this), 0) != 0) {
                                c3 = 0;
                                break;
                            }
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != e.f1109a) {
                                if (obj2 != obj) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 1;
                                break;
                            }
                        }
                        if (c3 == 1) {
                            c2 = 2;
                            break;
                        }
                        if (c3 != 2) {
                        }
                    }
                    c2 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c2 = 0;
                    break;
                }
            }
        }
        if (c2 == 0) {
            return true;
        }
        if (c2 == 1) {
            return false;
        }
        if (c2 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final void e(Object obj) {
        while (Math.max(h.f1116f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1108g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            D.j jVar = e.f1109a;
            if (obj2 != jVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, jVar)) {
                        b();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC0063v.b(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f1116f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f1108g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
