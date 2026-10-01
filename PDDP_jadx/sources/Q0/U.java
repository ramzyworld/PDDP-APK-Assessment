package Q0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class U extends V0.l implements C, L, H0.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Z f692h;

    @Override // Q0.C
    public final void a() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        Z zN = n();
        while (true) {
            Object objE = zN.E();
            if (objE instanceof U) {
                if (objE != this) {
                    return;
                }
                E e2 = AbstractC0063v.f752i;
                do {
                    atomicReferenceFieldUpdater2 = Z.f706e;
                    if (atomicReferenceFieldUpdater2.compareAndSet(zN, objE, e2)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(zN) == objE);
            } else {
                if (!(objE instanceof L) || ((L) objE).e() == null) {
                    return;
                }
                while (true) {
                    Object objK = k();
                    if (objK instanceof V0.s) {
                        V0.l lVar = ((V0.s) objK).f1011a;
                        return;
                    }
                    if (objK == this) {
                        return;
                    }
                    I0.i.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    V0.l lVar2 = (V0.l) objK;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = V0.l.f997g;
                    V0.s sVar = (V0.s) atomicReferenceFieldUpdater3.get(lVar2);
                    if (sVar == null) {
                        sVar = new V0.s(lVar2);
                        atomicReferenceFieldUpdater3.lazySet(lVar2, sVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = V0.l.f995e;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, objK, sVar)) {
                            lVar2.g();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == objK);
                }
            }
        }
    }

    @Override // Q0.L
    public final boolean b() {
        return true;
    }

    @Override // Q0.L
    public final a0 e() {
        return null;
    }

    public P getParent() {
        return n();
    }

    public final Z n() {
        Z z2 = this.f692h;
        if (z2 != null) {
            return z2;
        }
        I0.i.g("job");
        throw null;
    }

    public abstract void o(Throwable th);

    @Override // V0.l
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0063v.b(this) + "[job@" + AbstractC0063v.b(n()) + ']';
    }
}
