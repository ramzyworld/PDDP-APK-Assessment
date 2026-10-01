package G;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a0 f166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public U f167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f168j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f169k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a0 f170l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f171m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(a0 a0Var, B0.b bVar) {
        super(bVar);
        this.f170l = a0Var;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f169k = obj;
        this.f171m |= Integer.MIN_VALUE;
        return this.f170l.a(null, this);
    }
}
