package G;

/* JADX INFO: renamed from: G.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0024z extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public S f299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Y0.d f300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f303l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0024z(S s2, B0.b bVar) {
        super(bVar);
        this.f302k = s2;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f301j = obj;
        this.f303l |= Integer.MIN_VALUE;
        return S.d(this.f302k, this);
    }
}
