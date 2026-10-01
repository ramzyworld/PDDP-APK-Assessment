package Y;

import H0.p;
import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class j extends B0.g implements p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b f1095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Activity f1096l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, Activity activity, z0.d dVar) {
        super(2, dVar);
        this.f1095k = bVar;
        this.f1096l = activity;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        j jVar = new j(this.f1095k, this.f1096l, dVar);
        jVar.f1094j = obj;
        return jVar;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((j) b((S0.p) obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        A0.a aVar = A0.a.f0e;
        int i2 = this.f1093i;
        if (i2 == 0) {
            p000a.a.O(obj);
            S0.p pVar = (S0.p) this.f1094j;
            i iVar = new i(0, pVar);
            b bVar = this.f1095k;
            ((Z.a) bVar.f1077f).b(this.f1096l, new L.e(), iVar);
            I.b bVar2 = new I.b(1, bVar, iVar);
            this.f1093i = 1;
            if (S0.i.b(pVar, bVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p000a.a.O(obj);
        }
        return p041x0.g.f3419a;
    }
}
