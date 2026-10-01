package G;

/* JADX INFO: renamed from: G.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0006g extends B0.g implements H0.l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f204i;

    @Override // H0.l
    public final Object j(Object obj) {
        C0006g c0006g = new C0006g(1, (z0.d) obj);
        p041x0.g gVar = p041x0.g.f3419a;
        c0006g.k(gVar);
        return gVar;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        int i2 = this.f204i;
        if (i2 == 0) {
            p000a.a.O(obj);
            this.f204i = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p000a.a.O(obj);
        return p041x0.g.f3419a;
    }
}
