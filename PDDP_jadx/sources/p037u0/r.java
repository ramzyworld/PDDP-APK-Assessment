package p037u0;

import A0.a;
import B0.g;
import G.InterfaceC0008i;
import H0.p;
import I0.i;
import N.C0026b;
import Q0.InterfaceC0062u;
import android.content.Context;
import z0.d;

/* JADX INFO: loaded from: classes.dex */
public final class r extends g implements p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public I0.p f3166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f3168k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J f3169l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I0.p f3170m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, J j2, I0.p pVar, d dVar) {
        super(2, dVar);
        this.f3168k = str;
        this.f3169l = j2;
        this.f3170m = pVar;
    }

    @Override // B0.b
    public final d b(Object obj, d dVar) {
        return new r(this.f3168k, this.f3169l, this.f3170m, dVar);
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((r) b((InterfaceC0062u) obj, (d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        I0.p pVar;
        a aVar = a.f0e;
        int i2 = this.f3167j;
        if (i2 == 0) {
            p000a.a.O(obj);
            J.d dVar = new J.d(this.f3168k);
            J j2 = this.f3169l;
            Context context = j2.f3112e;
            if (context == null) {
                i.g("context");
                throw null;
            }
            C0026b c0026b = new C0026b(((InterfaceC0008i) K.a(context).f44f).getData(), dVar, j2, 12);
            I0.p pVar2 = this.f3170m;
            this.f3166i = pVar2;
            this.f3167j = 1;
            Object objC = T0.r.c(c0026b, this);
            if (objC == aVar) {
                return aVar;
            }
            pVar = pVar2;
            obj = objC;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.f3166i;
            p000a.a.O(obj);
        }
        pVar.f338e = obj;
        return p041x0.g.f3419a;
    }
}
