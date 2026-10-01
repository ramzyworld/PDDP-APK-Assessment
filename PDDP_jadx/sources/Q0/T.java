package Q0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class T extends Z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f691g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(P p2) {
        super(true);
        boolean z2 = true;
        H(p2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z.f707f;
        InterfaceC0051i interfaceC0051i = (InterfaceC0051i) atomicReferenceFieldUpdater.get(this);
        C0052j c0052j = interfaceC0051i instanceof C0052j ? (C0052j) interfaceC0051i : null;
        if (c0052j == null) {
            z2 = false;
            break;
        }
        Z zN = c0052j.n();
        while (!zN.B()) {
            InterfaceC0051i interfaceC0051i2 = (InterfaceC0051i) atomicReferenceFieldUpdater.get(zN);
            C0052j c0052j2 = interfaceC0051i2 instanceof C0052j ? (C0052j) interfaceC0051i2 : null;
            if (c0052j2 == null) {
                z2 = false;
                break;
            }
            zN = c0052j2.n();
        }
        this.f691g = z2;
    }

    @Override // Q0.Z
    public final boolean B() {
        return this.f691g;
    }

    @Override // Q0.Z
    public final boolean C() {
        return true;
    }
}
