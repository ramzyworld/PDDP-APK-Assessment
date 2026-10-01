package G;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Y0.d f228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f229i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f230j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l0 f231k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f232l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, B0.b bVar) {
        super(bVar);
        this.f231k = l0Var;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f230j = obj;
        this.f232l |= Integer.MIN_VALUE;
        return this.f231k.c(null, this);
    }
}
