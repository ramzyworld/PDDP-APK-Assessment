package G;

/* JADX INFO: renamed from: G.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0021w extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public S f286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Y0.d f287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f290l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0021w(S s2, B0.b bVar) {
        super(bVar);
        this.f289k = s2;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f288j = obj;
        this.f290l |= Integer.MIN_VALUE;
        return S.a(this.f289k, this);
    }
}
