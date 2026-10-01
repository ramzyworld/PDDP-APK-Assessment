package T0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f872j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l f873k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f874l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, z0.d dVar) {
        super(dVar);
        this.f873k = lVar;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f872j = obj;
        this.f874l |= Integer.MIN_VALUE;
        return this.f873k.a(null, this);
    }
}
