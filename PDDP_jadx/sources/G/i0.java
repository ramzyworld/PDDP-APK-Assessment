package G;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Y0.d f220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f221j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l0 f222k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f223l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, B0.b bVar) {
        super(bVar);
        this.f222k = l0Var;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f221j = obj;
        this.f223l |= Integer.MIN_VALUE;
        return this.f222k.b(null, this);
    }
}
