package G;

/* JADX INFO: loaded from: classes.dex */
public final class C extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public S f75h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f76i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f77j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f78k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f79l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(S s2, B0.b bVar) {
        super(bVar);
        this.f78k = s2;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f77j = obj;
        this.f79l |= Integer.MIN_VALUE;
        return this.f78k.h(this);
    }
}
