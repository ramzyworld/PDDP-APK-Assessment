package T0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public U0.n f838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ D.j f840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f841k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(D.j jVar, z0.d dVar) {
        super(dVar);
        this.f840j = jVar;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f839i = obj;
        this.f841k |= Integer.MIN_VALUE;
        return this.f840j.g(null, this);
    }
}
