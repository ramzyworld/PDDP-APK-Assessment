package G;

/* JADX INFO: renamed from: G.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0009j extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0013n f224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0013n f226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f227k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0009j(C0013n c0013n, B0.b bVar) {
        super(bVar);
        this.f226j = c0013n;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f225i = obj;
        this.f227k |= Integer.MIN_VALUE;
        return this.f226j.c(this);
    }
}
