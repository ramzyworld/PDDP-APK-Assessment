package G;

import Q0.C0054l;

/* JADX INFO: renamed from: G.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0023y extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public S f294i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0054l f295j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f296k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f297l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f298m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0023y(S s2, B0.b bVar) {
        super(bVar);
        this.f297l = s2;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f296k = obj;
        this.f298m |= Integer.MIN_VALUE;
        return S.b(this.f297l, null, this);
    }
}
