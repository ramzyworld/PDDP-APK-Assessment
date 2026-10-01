package U0;

import Q0.C0061t;
import Q0.InterfaceC0051i;
import Q0.P;
import Q0.Z;
import V0.u;

/* JADX INFO: loaded from: classes.dex */
public final class q extends I0.j implements H0.p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f937f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar) {
        super(2);
        this.f937f = nVar;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        z0.g gVar = (z0.g) obj2;
        z0.h key = gVar.getKey();
        z0.g gVarF = this.f937f.f931i.f(key);
        if (key != C0061t.f743f) {
            return Integer.valueOf(gVar != gVarF ? Integer.MIN_VALUE : iIntValue + 1);
        }
        P p2 = (P) gVarF;
        P parent = (P) gVar;
        while (true) {
            if (parent != null) {
                if (parent == p2 || !(parent instanceof u)) {
                    break;
                }
                InterfaceC0051i interfaceC0051i = (InterfaceC0051i) Z.f707f.get((Z) parent);
                parent = interfaceC0051i != null ? interfaceC0051i.getParent() : null;
            } else {
                parent = null;
                break;
            }
        }
        if (parent == p2) {
            if (p2 != null) {
                iIntValue++;
            }
            return Integer.valueOf(iIntValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + p2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
