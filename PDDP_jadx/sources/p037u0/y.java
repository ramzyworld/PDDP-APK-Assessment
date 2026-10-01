package p037u0;

import B0.b;
import z0.d;

/* JADX INFO: loaded from: classes.dex */
public final class y extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0142n f3200j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C0142n c0142n, d dVar) {
        super(dVar);
        this.f3200j = c0142n;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f3198h = obj;
        this.f3199i |= Integer.MIN_VALUE;
        return this.f3200j.a(null, this);
    }
}
