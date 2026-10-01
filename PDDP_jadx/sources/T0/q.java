package T0;

import Q0.C0048f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class q extends U0.b implements d, e, U0.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f900i = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state");
    private volatile Object _state;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f901h;

    public q(Object obj) {
        this._state = obj;
    }

    @Override // T0.e
    public final Object a(Object obj, z0.d dVar) {
        if (obj == null) {
            obj = U0.l.f928a;
        }
        c(null, obj);
        return p041x0.g.f3419a;
    }

    public final boolean c(Object obj, Object obj2) {
        int i2;
        U0.c[] cVarArr;
        D.j jVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f900i;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !I0.i.a(obj3, obj)) {
                return false;
            }
            if (I0.i.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i3 = this.f901h;
            if ((i3 & 1) != 0) {
                this.f901h = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.f901h = i4;
            U0.c[] cVarArr2 = this.f908e;
            while (true) {
                s[] sVarArr = (s[]) cVarArr2;
                if (sVarArr != null) {
                    for (s sVar : sVarArr) {
                        if (sVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s.f904a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(sVar);
                                if (obj4 == null || obj4 == (jVar = r.f903b)) {
                                    break;
                                }
                                D.j jVar2 = r.f902a;
                                if (obj4 != jVar2) {
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(sVar, obj4, jVar2)) {
                                            ((C0048f) obj4).m(p041x0.g.f3419a);
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(sVar) == obj4);
                                } else {
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(sVar, obj4, jVar)) {
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(sVar) == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f901h;
                    if (i2 == i4) {
                        this.f901h = i4 + 1;
                        return true;
                    }
                    cVarArr = this.f908e;
                }
                cVarArr2 = cVarArr;
                i4 = i2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:50:0x00cc, B:52:0x00d4, B:55:0x00db, B:56:0x00e1, B:58:0x00e4, B:68:0x0105, B:71:0x0118, B:72:0x0130, B:78:0x0144, B:75:0x013b, B:77:0x0141, B:60:0x00ea, B:64:0x00f1, B:21:0x0053, B:24:0x005e, B:49:0x00bc), top: B:89:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:50:0x00cc, B:52:0x00d4, B:55:0x00db, B:56:0x00e1, B:58:0x00e4, B:68:0x0105, B:71:0x0118, B:72:0x0130, B:78:0x0144, B:75:0x013b, B:77:0x0141, B:60:0x00ea, B:64:0x00f1, B:21:0x0053, B:24:0x005e, B:49:0x00bc), top: B:89:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x0103 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0117 -> B:50:0x00cc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // T0.d
    public final java.lang.Object g(T0.e r17, z0.d r18) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.q.g(T0.e, z0.d):java.lang.Object");
    }

    @Override // U0.j
    public final d q(z0.i iVar, int i2, int i3) {
        return ((((i2 < 0 || i2 >= 2) && i2 != -2) || i3 != 2) && !((i2 == 0 || i2 == -3) && i3 == 1)) ? new U0.h(this, iVar, i2, i3) : this;
    }
}
