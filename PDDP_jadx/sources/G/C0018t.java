package G;

/* JADX INFO: renamed from: G.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0018t extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0019u f279j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0018t(C0019u c0019u, z0.d dVar) {
        super(dVar);
        this.f279j = c0019u;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f277h = obj;
        this.f278i |= Integer.MIN_VALUE;
        return this.f279j.a(null, this);
    }
}
