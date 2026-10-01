package G;

import Q0.InterfaceC0062u;

/* JADX INFO: loaded from: classes.dex */
public final class J extends B0.g implements H0.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f115j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(S s2, z0.d dVar) {
        super(2, dVar);
        this.f115j = s2;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        return new J(this.f115j, dVar);
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((J) b((InterfaceC0062u) obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) throws Throwable {
        A0.a aVar = A0.a.f0e;
        int i2 = this.f114i;
        S s2 = this.f115j;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    p000a.a.O(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p000a.a.O(obj);
                }
                return (m0) obj;
            }
            p000a.a.O(obj);
            if (s2.f147l.p() instanceof d0) {
                return s2.f147l.p();
            }
            this.f114i = 1;
            if (s2.h(this) == aVar) {
                return aVar;
            }
            this.f114i = 2;
            obj = S.e(s2, false, this);
            if (obj == aVar) {
                return aVar;
            }
            return (m0) obj;
        } catch (Throwable th) {
            return new f0(th, -1);
        }
    }
}
