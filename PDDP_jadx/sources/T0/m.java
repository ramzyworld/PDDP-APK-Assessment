package T0;

import N.Q;
import p037u0.C0142n;

/* JADX INFO: loaded from: classes.dex */
public final class m extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q f881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0142n f882k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Q q2, z0.d dVar) {
        super(dVar);
        this.f881j = q2;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f879h = obj;
        this.f880i |= Integer.MIN_VALUE;
        return this.f881j.g(null, this);
    }
}
