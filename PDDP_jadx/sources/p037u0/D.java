package p037u0;

import B0.g;
import H0.p;
import J.b;
import J.d;
import p000a.a;

/* JADX INFO: loaded from: classes.dex */
public final class D extends g implements p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f3091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ double f3092k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(d dVar, double d2, z0.d dVar2) {
        super(2, dVar2);
        this.f3091j = dVar;
        this.f3092k = d2;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        D d2 = new D(this.f3091j, this.f3092k, dVar);
        d2.f3090i = obj;
        return d2;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        D d2 = (D) b((b) obj, (z0.d) obj2);
        p041x0.g gVar = p041x0.g.f3419a;
        d2.k(gVar);
        return gVar;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        a.O(obj);
        ((b) this.f3090i).d(this.f3091j, new Double(this.f3092k));
        return p041x0.g.f3419a;
    }
}
