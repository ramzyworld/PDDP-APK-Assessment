package p037u0;

import B0.g;
import H0.p;
import J.b;
import J.d;
import p000a.a;

/* JADX INFO: loaded from: classes.dex */
public final class G extends g implements p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f3102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f3103k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(d dVar, long j2, z0.d dVar2) {
        super(2, dVar2);
        this.f3102j = dVar;
        this.f3103k = j2;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        G g2 = new G(this.f3102j, this.f3103k, dVar);
        g2.f3101i = obj;
        return g2;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        G g2 = (G) b((b) obj, (z0.d) obj2);
        p041x0.g gVar = p041x0.g.f3419a;
        g2.k(gVar);
        return gVar;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        a.O(obj);
        ((b) this.f3101i).d(this.f3102j, new Long(this.f3103k));
        return p041x0.g.f3419a;
    }
}
