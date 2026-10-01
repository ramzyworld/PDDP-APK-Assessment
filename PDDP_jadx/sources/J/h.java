package J;

import H0.p;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h extends B0.g implements p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ B0.g f351k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(p pVar, z0.d dVar) {
        super(2, dVar);
        this.f351k = (B0.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [B0.g, H0.p] */
    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        h hVar = new h(this.f351k, dVar);
        hVar.f350j = obj;
        return hVar;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((h) b((b) obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [B0.g, H0.p] */
    @Override // B0.b
    public final Object k(Object obj) {
        A0.a aVar = A0.a.f0e;
        int i2 = this.f349i;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f350j;
            p000a.a.O(obj);
            return bVar;
        }
        p000a.a.O(obj);
        b bVar2 = new b(new LinkedHashMap(((b) this.f350j).a()), false);
        this.f350j = bVar2;
        this.f349i = 1;
        return this.f351k.h(bVar2, this) == aVar ? aVar : bVar2;
    }
}
