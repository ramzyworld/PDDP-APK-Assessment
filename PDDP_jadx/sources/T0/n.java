package T0;

import p037u0.C0142n;

/* JADX INFO: loaded from: classes.dex */
public final class n extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0142n f883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f885j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0142n f886k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f887l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C0142n c0142n, z0.d dVar) {
        super(dVar);
        this.f886k = c0142n;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f884i = obj;
        this.f885j |= Integer.MIN_VALUE;
        return this.f886k.a(null, this);
    }
}
