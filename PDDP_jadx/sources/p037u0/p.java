package p037u0;

import A0.a;
import B0.g;
import G.InterfaceC0008i;
import I0.i;
import Q0.InterfaceC0062u;
import T0.r;
import android.content.Context;
import z0.d;

/* JADX INFO: loaded from: classes.dex */
public final class p extends g implements H0.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public I0.p f3158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f3160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J f3161l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I0.p f3162m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, J j2, I0.p pVar, d dVar) {
        super(2, dVar);
        this.f3160k = str;
        this.f3161l = j2;
        this.f3162m = pVar;
    }

    @Override // B0.b
    public final d b(Object obj, d dVar) {
        return new p(this.f3160k, this.f3161l, this.f3162m, dVar);
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((p) b((InterfaceC0062u) obj, (d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        I0.p pVar;
        a aVar = a.f0e;
        int i2 = this.f3159j;
        if (i2 == 0) {
            p000a.a.O(obj);
            J.d dVar = new J.d(this.f3160k);
            Context context = this.f3161l.f3112e;
            if (context == null) {
                i.g("context");
                throw null;
            }
            o oVar = new o(((InterfaceC0008i) K.a(context).f44f).getData(), dVar, 0);
            I0.p pVar2 = this.f3162m;
            this.f3158i = pVar2;
            this.f3159j = 1;
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
            pVar = this.f3158i;
            p000a.a.O(obj);
        }
        pVar.f338e = obj;
        return p041x0.g.f3419a;
    }
}
