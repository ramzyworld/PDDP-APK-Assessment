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
public final class B extends g implements p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f3083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ J f3084k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f3085l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(String str, J j2, boolean z2, d dVar) {
        super(2, dVar);
        this.f3083j = str;
        this.f3084k = j2;
        this.f3085l = z2;
    }

    @Override // B0.b
    public final d b(Object obj, d dVar) {
        return new B(this.f3083j, this.f3084k, this.f3085l, dVar);
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((B) b((InterfaceC0062u) obj, (d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        a aVar = a.f0e;
        int i2 = this.f3082i;
        if (i2 == 0) {
            p000a.a.O(obj);
            J.d dVar = new J.d(this.f3083j);
            Context context = this.f3084k.f3112e;
            if (context == null) {
                i.g("context");
                throw null;
            }
            j jVarA = K.a(context);
            A a2 = new A(dVar, this.f3085l, null);
            this.f3082i = 1;
            if (jVarA.c(new h(a2, null), this) == aVar) {
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
