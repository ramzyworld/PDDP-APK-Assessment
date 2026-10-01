package p037u0;

import A0.a;
import B0.g;
import H0.p;
import Q0.InterfaceC0062u;
import z0.d;

/* JADX INFO: loaded from: classes.dex */
public final class I extends g implements p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J f3109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f3110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f3111l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j2, String str, String str2, d dVar) {
        super(2, dVar);
        this.f3109j = j2;
        this.f3110k = str;
        this.f3111l = str2;
    }

    @Override // B0.b
    public final d b(Object obj, d dVar) {
        return new I(this.f3109j, this.f3110k, this.f3111l, dVar);
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((I) b((InterfaceC0062u) obj, (d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        a aVar = a.f0e;
        int i2 = this.f3108i;
        if (i2 == 0) {
            p000a.a.O(obj);
            this.f3108i = 1;
            if (J.q(this.f3109j, this.f3110k, this.f3111l, this) == aVar) {
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
