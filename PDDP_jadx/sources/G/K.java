package G;

import Q0.InterfaceC0062u;

/* JADX INFO: loaded from: classes.dex */
public final class K extends B0.g implements H0.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ B0.g f117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0003d f118k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(H0.p pVar, C0003d c0003d, z0.d dVar) {
        super(2, dVar);
        this.f117j = (B0.g) pVar;
        this.f118k = c0003d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [B0.g, H0.p] */
    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        return new K(this.f117j, this.f118k, dVar);
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((K) b((InterfaceC0062u) obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [B0.g, H0.p] */
    @Override // B0.b
    public final Object k(Object obj) {
        A0.a aVar = A0.a.f0e;
        int i2 = this.f116i;
        if (i2 == 0) {
            p000a.a.O(obj);
            Object obj2 = this.f118k.f189b;
            this.f116i = 1;
            obj = this.f117j.h(obj2, this);
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
