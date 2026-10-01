package G;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0013n f205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Y0.a f206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0013n f208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f209l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(C0013n c0013n, B0.b bVar) {
        super(bVar);
        this.f208k = c0013n;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f207j = obj;
        this.f209l |= Integer.MIN_VALUE;
        return this.f208k.e(this);
    }
}
