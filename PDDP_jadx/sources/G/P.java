package G;

/* JADX INFO: loaded from: classes.dex */
public final class P extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public I0.o f129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f132k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(S s2, B0.b bVar) {
        super(bVar);
        this.f131j = s2;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f130i = obj;
        this.f132k |= Integer.MIN_VALUE;
        return this.f131j.j(null, false, this);
    }
}
