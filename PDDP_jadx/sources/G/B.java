package G;

import Q0.C0054l;
import Q0.InterfaceC0062u;

/* JADX INFO: loaded from: classes.dex */
public final class B extends B0.g implements H0.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f73i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f74j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(S s2, z0.d dVar) {
        super(2, dVar);
        this.f74j = s2;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        return new B(this.f74j, dVar);
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((B) b((InterfaceC0062u) obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) throws Throwable {
        A0.a aVar = A0.a.f0e;
        int i2 = this.f73i;
        p041x0.g gVar = p041x0.g.f3419a;
        S s2 = this.f74j;
        if (i2 != 0) {
            if (i2 == 1) {
                p000a.a.O(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p000a.a.O(obj);
            }
        }
        p000a.a.O(obj);
        this.f73i = 1;
        Object objU = ((C0054l) s2.f148m.f259b).U(this);
        if (objU != aVar) {
            objU = gVar;
        }
        if (objU == aVar) {
            return aVar;
        }
        T0.d dVar = s2.g().f247c;
        T0.d dVarA = dVar instanceof U0.j ? U0.l.a((U0.j) dVar, null, 0, 2, 1) : new U0.h(dVar, z0.j.f3504e, 0, 2);
        A a2 = new A(0, s2);
        this.f73i = 2;
        return dVarA.g(a2, this) == aVar ? aVar : gVar;
    }
}
