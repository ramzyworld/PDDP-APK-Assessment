package G;

import Q0.AbstractC0063v;
import Q0.C0054l;
import Q0.InterfaceC0062u;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class L extends B0.g implements H0.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f119i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f121k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B0.g f122l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L(S s2, H0.p pVar, z0.d dVar) {
        super(2, dVar);
        this.f121k = s2;
        this.f122l = (B0.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [B0.g, H0.p] */
    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        L l2 = new L(this.f121k, this.f122l, dVar);
        l2.f120j = obj;
        return l2;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((L) b((InterfaceC0062u) obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [B0.g, H0.p] */
    @Override // B0.b
    public final Object k(Object obj) throws Throwable {
        A0.a aVar = A0.a.f0e;
        int i2 = this.f119i;
        if (i2 == 0) {
            p000a.a.O(obj);
            InterfaceC0062u interfaceC0062u = (InterfaceC0062u) this.f120j;
            C0054l c0054l = new C0054l(true);
            c0054l.H(null);
            S s2 = this.f121k;
            e0 e0Var = new e0(this.f122l, c0054l, s2.f147l.p(), interfaceC0062u.k());
            C0013n c0013n = s2.f151p;
            Object objJ = ((S0.b) c0013n.f260c).j(e0Var);
            if (objJ instanceof S0.g) {
                S0.g gVar = objJ instanceof S0.g ? (S0.g) objJ : null;
                Throwable th = gVar != null ? gVar.f810a : null;
                if (th == null) {
                    throw new S0.l("Channel was closed normally");
                }
                throw th;
            }
            if (objJ instanceof S0.h) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) ((D.j) c0013n.f261d).f44f).getAndIncrement() == 0) {
                AbstractC0063v.g((InterfaceC0062u) c0013n.f258a, new h0(c0013n, null));
            }
            this.f119i = 1;
            obj = c0054l.U(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p000a.a.O(obj);
        }
        return obj;
    }
}
