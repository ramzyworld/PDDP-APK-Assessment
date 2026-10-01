package G;

import java.util.List;

/* JADX INFO: renamed from: G.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0004e extends B0.g implements H0.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f192i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f194k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0004e(List list, z0.d dVar) {
        super(2, dVar);
        this.f194k = list;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        C0004e c0004e = new C0004e(this.f194k, dVar);
        c0004e.f193j = obj;
        return c0004e;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((C0004e) b((C0011l) obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        A0.a aVar = A0.a.f0e;
        int i2 = this.f192i;
        if (i2 == 0) {
            p000a.a.O(obj);
            C0011l c0011l = (C0011l) this.f193j;
            this.f192i = 1;
            if (a1.a.a(this.f194k, c0011l, this) == aVar) {
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
