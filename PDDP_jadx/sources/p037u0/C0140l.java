package p037u0;

import A0.a;
import B0.g;
import H0.p;
import Q0.InterfaceC0062u;
import java.util.List;
import z0.d;

/* JADX INFO: renamed from: u0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0140l extends g implements p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J f3147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f3148k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0140l(J j2, List list, d dVar) {
        super(2, dVar);
        this.f3147j = j2;
        this.f3148k = list;
    }

    @Override // B0.b
    public final d b(Object obj, d dVar) {
        return new C0140l(this.f3147j, this.f3148k, dVar);
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((C0140l) b((InterfaceC0062u) obj, (d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        a aVar = a.f0e;
        int i2 = this.f3146i;
        if (i2 == 0) {
            p000a.a.O(obj);
            this.f3146i = 1;
            obj = J.s(this.f3147j, this.f3148k, this);
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
