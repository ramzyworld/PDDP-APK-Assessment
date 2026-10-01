package p037u0;

import A0.a;
import T0.d;
import T0.e;
import p041x0.g;

/* JADX INFO: loaded from: classes.dex */
public final class o implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f3156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ J.d f3157g;

    public /* synthetic */ o(d dVar, J.d dVar2, int i2) {
        this.f3155e = i2;
        this.f3156f = dVar;
        this.f3157g = dVar2;
    }

    @Override // T0.d
    public final Object g(e eVar, z0.d dVar) {
        switch (this.f3155e) {
            case 0:
                Object objG = this.f3156f.g(new C0142n(eVar, this.f3157g, 0), dVar);
                return objG == a.f0e ? objG : g.f3419a;
            case 1:
                Object objG2 = this.f3156f.g(new C0142n(eVar, this.f3157g, 1), dVar);
                return objG2 == a.f0e ? objG2 : g.f3419a;
            case 2:
                Object objG3 = this.f3156f.g(new C0142n(eVar, this.f3157g, 2), dVar);
                return objG3 == a.f0e ? objG3 : g.f3419a;
            default:
                Object objG4 = this.f3156f.g(new C0142n(eVar, this.f3157g, 3), dVar);
                return objG4 == a.f0e ? objG4 : g.f3419a;
        }
    }
}
