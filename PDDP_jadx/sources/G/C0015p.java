package G;

/* JADX INFO: renamed from: G.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0015p extends B0.g implements H0.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f266i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f267j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0015p(S s2, z0.d dVar) {
        super(2, dVar);
        this.f267j = s2;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        return new C0015p(this.f267j, dVar);
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((C0015p) b((T0.e) obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        A0.a aVar = A0.a.f0e;
        int i2 = this.f266i;
        if (i2 == 0) {
            p000a.a.O(obj);
            this.f266i = 1;
            if (S.d(this.f267j, this) == aVar) {
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
