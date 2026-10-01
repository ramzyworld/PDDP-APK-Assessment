package G;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class G extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f94h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f95i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Serializable f96j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public I0.p f97k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f98l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f99m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f100n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ S f101o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f102p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(S s2, B0.b bVar) {
        super(bVar);
        this.f101o = s2;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f100n = obj;
        this.f102p |= Integer.MIN_VALUE;
        return S.f(this.f101o, false, this);
    }
}
