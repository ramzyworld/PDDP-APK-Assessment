package G;

/* JADX INFO: loaded from: classes.dex */
public final class D extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public S f80h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m0 f81i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f82j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f83k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f84l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f85m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(S s2, z0.d dVar) {
        super(dVar);
        this.f84l = s2;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f83k = obj;
        this.f85m |= Integer.MIN_VALUE;
        return S.e(this.f84l, false, this);
    }
}
