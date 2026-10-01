package p037u0;

import A0.a;
import B0.g;
import D.j;
import H0.p;
import I0.i;
import J.h;
import Q0.InterfaceC0062u;
import android.content.Context;
import java.util.List;
import z0.d;

/* JADX INFO: renamed from: u0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0138j extends g implements p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J f3141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f3142k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0138j(J j2, List list, d dVar) {
        super(2, dVar);
        this.f3141j = j2;
        this.f3142k = list;
    }

    @Override // B0.b
    public final d b(Object obj, d dVar) {
        return new C0138j(this.f3141j, this.f3142k, dVar);
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((C0138j) b((InterfaceC0062u) obj, (d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        a aVar = a.f0e;
        int i2 = this.f3140i;
        if (i2 == 0) {
            p000a.a.O(obj);
            Context context = this.f3141j.f3112e;
            if (context == null) {
                i.g("context");
                throw null;
            }
            j jVarA = K.a(context);
            C0137i c0137i = new C0137i(this.f3142k, null);
            this.f3140i = 1;
            obj = jVarA.c(new h(c0137i, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p000a.a.O(obj);
        }
        return obj;
    }
}
