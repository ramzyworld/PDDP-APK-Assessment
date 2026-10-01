package G;

import Q0.C0048f;

/* JADX INFO: loaded from: classes.dex */
public final class M extends I0.j implements H0.l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f124g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(int i2, Object obj) {
        super(1);
        this.f123f = i2;
        this.f124g = obj;
    }

    @Override // H0.l
    public final Object j(Object obj) {
        switch (this.f123f) {
            case 0:
                Throwable th = (Throwable) obj;
                S s2 = (S) this.f124g;
                if (th != null) {
                    s2.f147l.x(new d0(th));
                }
                if (s2.f149n.f3416f != p041x0.f.f3418a) {
                    ((a0) s2.f149n.a()).close();
                }
                return p041x0.g.f3419a;
            case 1:
                M0.c cVar = (M0.c) obj;
                I0.i.e(cVar, "it");
                return ((String) this.f124g).subSequence(cVar.f413e, cVar.f414f + 1).toString();
            case 2:
                p041x0.g gVar = p041x0.g.f3419a;
                ((C0048f) this.f124g).m(gVar);
                return gVar;
            case 3:
                ((Y0.h) this.f124g).b();
                return p041x0.g.f3419a;
            default:
                ((H0.l) this.f124g).j(new p039v0.N(((p041x0.d) obj).f3414e));
                return p041x0.g.f3419a;
        }
    }
}
