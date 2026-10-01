package p039v0;

import H0.l;
import I0.j;
import N.Q;
import a1.a;
import p041x0.c;
import p041x0.d;
import p041x0.g;

/* JADX INFO: loaded from: classes.dex */
public final class A extends j implements l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Q f3236g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(Q q2, int i2) {
        super(1);
        this.f3235f = i2;
        this.f3236g = q2;
    }

    @Override // H0.l
    public final Object j(Object obj) {
        switch (this.f3235f) {
            case 0:
                Object obj2 = ((d) obj).f3414e;
                Throwable thA = d.a(obj2);
                Q q2 = this.f3236g;
                if (thA != null) {
                    q2.b(a.N(thA));
                } else {
                    if (obj2 instanceof c) {
                        obj2 = null;
                    }
                    q2.b(a.t((Boolean) obj2));
                }
                break;
            default:
                Object obj3 = ((d) obj).f3414e;
                Throwable thA2 = d.a(obj3);
                Q q3 = this.f3236g;
                if (thA2 != null) {
                    q3.b(a.N(thA2));
                } else {
                    if (obj3 instanceof c) {
                        obj3 = null;
                    }
                    q3.b(a.t((String) obj3));
                }
                break;
        }
        return g.f3419a;
    }
}
