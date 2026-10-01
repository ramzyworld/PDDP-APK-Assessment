package G;

/* JADX INFO: renamed from: G.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0022x extends B0.g implements H0.l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I f292j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0022x(I i2, z0.d dVar) {
        super(1, dVar);
        this.f292j = i2;
    }

    @Override // H0.l
    public final Object j(Object obj) {
        return new C0022x(this.f292j, (z0.d) obj).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        A0.a aVar = A0.a.f0e;
        int i2 = this.f291i;
        if (i2 == 0) {
            p000a.a.O(obj);
            this.f291i = 1;
            obj = this.f292j.j(this);
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
