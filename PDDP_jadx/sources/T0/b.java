package T0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public S0.p f842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f844j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f845k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, B0.b bVar) {
        super(bVar);
        this.f844j = cVar;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f843i = obj;
        this.f845k |= Integer.MIN_VALUE;
        return this.f844j.a(null, this);
    }
}
