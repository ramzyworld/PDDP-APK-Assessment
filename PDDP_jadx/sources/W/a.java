package W;

import B0.g;
import G.A;
import H0.p;
import Q0.InterfaceC0062u;
import T0.d;
import Y.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g implements p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f1023j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f1024k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, i iVar, z0.d dVar2) {
        super(2, dVar2);
        this.f1023j = dVar;
        this.f1024k = iVar;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        return new a(this.f1023j, this.f1024k, dVar);
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((a) b((InterfaceC0062u) obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        A0.a aVar = A0.a.f0e;
        int i2 = this.f1022i;
        if (i2 == 0) {
            p000a.a.O(obj);
            A a2 = new A(2, this.f1024k);
            this.f1022i = 1;
            if (this.f1023j.g(a2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p000a.a.O(obj);
        }
        return p041x0.g.f3419a;
    }
}
