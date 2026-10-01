package G;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a0 f172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c0 f175k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f176l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0 f177m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f178n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(a0 a0Var, B0.b bVar) {
        super(bVar);
        this.f177m = a0Var;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f176l = obj;
        this.f178n |= Integer.MIN_VALUE;
        return this.f177m.b(null, this);
    }
}
