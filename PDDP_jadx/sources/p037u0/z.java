package p037u0;

import B0.b;
import G.C0019u;
import z0.d;

/* JADX INFO: loaded from: classes.dex */
public final class z extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0019u f3203j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0019u c0019u, d dVar) {
        super(dVar);
        this.f3203j = c0019u;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        this.f3201h = obj;
        this.f3202i |= Integer.MIN_VALUE;
        return this.f3203j.a(null, this);
    }
}
