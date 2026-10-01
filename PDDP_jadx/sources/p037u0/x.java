package p037u0;

import A0.a;
import B0.g;
import G.InterfaceC0008i;
import H0.p;
import I0.i;
import Q0.InterfaceC0062u;
import T0.r;
import android.content.Context;
import z0.d;

/* JADX INFO: loaded from: classes.dex */
public final class x extends g implements p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public I0.p f3193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f3195k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J f3196l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I0.p f3197m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str, J j2, I0.p pVar, d dVar) {
        super(2, dVar);
        this.f3195k = str;
        this.f3196l = j2;
        this.f3197m = pVar;
    }

    @Override // B0.b
    public final d b(Object obj, d dVar) {
        return new x(this.f3195k, this.f3196l, this.f3197m, dVar);
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((x) b((InterfaceC0062u) obj, (d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        I0.p pVar;
        a aVar = a.f0e;
        int i2 = this.f3194j;
        if (i2 == 0) {
            p000a.a.O(obj);
            J.d dVar = new J.d(this.f3195k);
            Context context = this.f3196l.f3112e;
            if (context == null) {
                i.g("context");
                throw null;
            }
            o oVar = new o(((InterfaceC0008i) K.a(context).f44f).getData(), dVar, 2);
            I0.p pVar2 = this.f3197m;
            this.f3193i = pVar2;
            this.f3194j = 1;
            Object objC = r.c(oVar, this);
            if (objC == aVar) {
                return aVar;
            }
            pVar = pVar2;
            obj = objC;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.f3193i;
            p000a.a.O(obj);
        }
        pVar.f338e = obj;
        return p041x0.g.f3419a;
    }
}
