package p037u0;

import B0.b;
import T0.l;
import z0.d;

/* JADX INFO: loaded from: classes.dex */
public final class q extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f3165j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(l lVar, d dVar) {
        super(dVar);
        this.f3165j = lVar;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f3163h = obj;
        this.f3164i |= Integer.MIN_VALUE;
        return this.f3165j.a(null, this);
    }
}
