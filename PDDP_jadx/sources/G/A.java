package G;

/* JADX INFO: loaded from: classes.dex */
public final class A implements T0.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f71e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f72f;

    public /* synthetic */ A(int i2, Object obj) {
        this.f71e = i2;
        this.f72f = obj;
    }

    @Override // T0.e
    public final Object a(Object obj, z0.d dVar) {
        Object objE;
        switch (this.f71e) {
            case 0:
                S s2 = (S) this.f72f;
                boolean z2 = s2.f147l.p() instanceof d0;
                p041x0.g gVar = p041x0.g.f3419a;
                return (z2 || (objE = S.e(s2, true, dVar)) != A0.a.f0e) ? gVar : objE;
            case 1:
                ((I0.p) this.f72f).f338e = obj;
                throw new U0.a(this);
            default:
                ((Y.i) this.f72f).accept(obj);
                return p041x0.g.f3419a;
        }
    }
}
