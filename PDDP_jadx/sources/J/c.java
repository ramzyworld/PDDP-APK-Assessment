package J;

import H0.p;
import I0.i;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class c extends B0.g implements p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ B0.g f345k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, z0.d dVar) {
        super(2, dVar);
        this.f345k = (B0.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [B0.g, H0.p] */
    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        c cVar = new c(this.f345k, dVar);
        cVar.f344j = obj;
        return cVar;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((c) b((b) obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [B0.g, H0.p] */
    @Override // B0.b
    public final Object k(Object obj) {
        A0.a aVar = A0.a.f0e;
        int i2 = this.f343i;
        if (i2 == 0) {
            p000a.a.O(obj);
            b bVar = (b) this.f344j;
            this.f343i = 1;
            obj = this.f345k.h(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p000a.a.O(obj);
        }
        b bVar2 = (b) obj;
        i.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) bVar2.f342b.f44f).set(true);
        return bVar2;
    }
}
