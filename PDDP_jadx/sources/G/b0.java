package G;

import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends B0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileOutputStream f184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FileOutputStream f185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c0 f187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f188l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, B0.b bVar) {
        super(bVar);
        this.f187k = c0Var;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f186j = obj;
        this.f188l |= Integer.MIN_VALUE;
        return this.f187k.b(null, this);
    }
}
