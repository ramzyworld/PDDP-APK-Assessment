package V0;

import Q0.AbstractC0063v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f995e = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f996f = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_prev");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f997g = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public final l g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f996f;
            l lVar = (l) atomicReferenceFieldUpdater2.get(this);
            l lVar2 = lVar;
            while (true) {
                l lVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f995e;
                    obj = atomicReferenceFieldUpdater.get(lVar2);
                    if (obj == this) {
                        if (lVar == lVar2) {
                            return lVar2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, lVar, lVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != lVar) {
                                break;
                            }
                        }
                        return lVar2;
                    }
                    if (m()) {
                        return null;
                    }
                    if (obj == null) {
                        return lVar2;
                    }
                    if (obj instanceof r) {
                        ((r) obj).a(lVar2);
                        break;
                    }
                    if (!(obj instanceof s)) {
                        I0.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        lVar3 = lVar2;
                        lVar2 = (l) obj;
                    } else {
                        if (lVar3 != null) {
                            break;
                        }
                        lVar2 = (l) atomicReferenceFieldUpdater2.get(lVar2);
                    }
                }
                l lVar4 = ((s) obj).f1011a;
                while (!atomicReferenceFieldUpdater.compareAndSet(lVar3, lVar2, lVar4)) {
                    if (atomicReferenceFieldUpdater.get(lVar3) != lVar2) {
                        break;
                    }
                }
                lVar2 = lVar3;
            }
        }
    }

    public final void i(l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f996f;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(lVar);
            if (k() != lVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(lVar, lVar2, this)) {
                    if (m()) {
                        lVar.g();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(lVar) == lVar2);
        }
    }

    public final Object k() {
        while (true) {
            Object obj = f995e.get(this);
            if (!(obj instanceof r)) {
                return obj;
            }
            ((r) obj).a(this);
        }
    }

    public final l l() {
        l lVar;
        Object objK = k();
        s sVar = objK instanceof s ? (s) objK : null;
        if (sVar != null && (lVar = sVar.f1011a) != null) {
            return lVar;
        }
        I0.i.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (l) objK;
    }

    public boolean m() {
        return k() instanceof s;
    }

    public String toString() {
        return new k(this, AbstractC0063v.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC0063v.b(this);
    }
}
