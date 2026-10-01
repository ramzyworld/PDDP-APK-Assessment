package U0;

import Q0.AbstractC0063v;
import Q0.B;
import Q0.InterfaceC0062u;

/* JADX INFO: loaded from: classes.dex */
public final class d extends B0.g implements H0.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T0.e f913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f914l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(T0.e eVar, f fVar, z0.d dVar) {
        super(2, dVar);
        this.f913k = eVar;
        this.f914l = fVar;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        d dVar2 = new d(this.f913k, this.f914l, dVar);
        dVar2.f912j = obj;
        return dVar2;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((d) b((InterfaceC0062u) obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) throws Throwable {
        A0.a aVar = A0.a.f0e;
        int i2 = this.f911i;
        p041x0.g gVar = p041x0.g.f3419a;
        if (i2 == 0) {
            p000a.a.O(obj);
            InterfaceC0062u interfaceC0062u = (InterfaceC0062u) this.f912j;
            f fVar = this.f914l;
            int i3 = fVar.f919f;
            if (i3 == -3) {
                i3 = -2;
            }
            H0.p eVar = new e(fVar, null);
            S0.b bVarA = S0.i.a(i3, fVar.f920g, 4);
            z0.i iVarA = AbstractC0063v.a(interfaceC0062u.k(), fVar.f918e, true);
            X0.d dVar = B.f672a;
            if (iVarA != dVar && iVarA.f(z0.e.f3503e) == null) {
                iVarA = iVarA.c(dVar);
            }
            S0.o oVar = new S0.o(iVarA, bVarA);
            oVar.W(3, oVar, eVar);
            this.f911i = 1;
            Object objB = T0.r.b(this.f913k, oVar, true, this);
            if (objB != aVar) {
                objB = gVar;
            }
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p000a.a.O(obj);
        }
        return gVar;
    }
}
