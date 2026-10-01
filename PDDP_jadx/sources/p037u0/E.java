package p037u0;

import A0.a;
import B0.g;
import D.j;
import H0.p;
import I0.i;
import J.h;
import Q0.InterfaceC0062u;
import android.content.Context;
import z0.d;

/* JADX INFO: loaded from: classes.dex */
public final class E extends g implements p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f3094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ J f3095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ double f3096l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(String str, J j2, double d2, d dVar) {
        super(2, dVar);
        this.f3094j = str;
        this.f3095k = j2;
        this.f3096l = d2;
    }

    @Override // B0.b
    public final d b(Object obj, d dVar) {
        return new E(this.f3094j, this.f3095k, this.f3096l, dVar);
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((E) b((InterfaceC0062u) obj, (d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        a aVar = a.f0e;
        int i2 = this.f3093i;
        if (i2 == 0) {
            p000a.a.O(obj);
            J.d dVar = new J.d(this.f3094j);
            Context context = this.f3095k.f3112e;
            if (context == null) {
                i.g("context");
                throw null;
            }
            j jVarA = K.a(context);
            D d2 = new D(dVar, this.f3096l, null);
            this.f3093i = 1;
            if (jVarA.c(new h(d2, null), this) == aVar) {
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
