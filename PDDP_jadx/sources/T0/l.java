package T0;

import V0.AbstractC0068a;
import p037u0.J;
import p037u0.K;

/* JADX INFO: loaded from: classes.dex */
public final class l implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f875e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f878h;

    public l(I0.n nVar, e eVar, G.r rVar) {
        this.f876f = nVar;
        this.f877g = eVar;
        this.f878h = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // T0.e
    public final Object a(Object obj, z0.d dVar) {
        k kVar;
        l lVar;
        p037u0.q qVar;
        switch (this.f875e) {
            case 0:
                if (dVar instanceof k) {
                    kVar = (k) dVar;
                    int i2 = kVar.f874l;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        kVar.f874l = i2 - Integer.MIN_VALUE;
                    } else {
                        kVar = new k(this, dVar);
                    }
                } else {
                    kVar = new k(this, dVar);
                }
                Object objH = kVar.f872j;
                A0.a aVar = A0.a.f0e;
                int i3 = kVar.f874l;
                p041x0.g gVar = p041x0.g.f3419a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            obj = kVar.f871i;
                            lVar = kVar.f870h;
                            p000a.a.O(objH);
                            if (!((Boolean) objH).booleanValue()) {
                                ((I0.n) lVar.f876f).f336e = true;
                                kVar.f870h = null;
                                kVar.f871i = null;
                                kVar.f874l = 3;
                                if (((e) lVar.f877g).a(obj, kVar) == aVar) {
                                    return aVar;
                                }
                            }
                        } else if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    p000a.a.O(objH);
                } else {
                    p000a.a.O(objH);
                    if (((I0.n) this.f876f).f336e) {
                        kVar.f874l = 1;
                        if (((e) this.f877g).a(obj, kVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        kVar.f870h = this;
                        kVar.f871i = obj;
                        kVar.f874l = 2;
                        objH = ((G.r) this.f878h).h(obj, kVar);
                        if (objH == aVar) {
                            return aVar;
                        }
                        lVar = this;
                        if (!((Boolean) objH).booleanValue()) {
                            ((I0.n) lVar.f876f).f336e = true;
                            kVar.f870h = null;
                            kVar.f871i = null;
                            kVar.f874l = 3;
                            if (((e) lVar.f877g).a(obj, kVar) == aVar) {
                                return aVar;
                            }
                        }
                    }
                }
                return gVar;
            case 1:
                Object objB = U0.l.b((z0.i) this.f876f, obj, this.f877g, (U0.t) this.f878h, dVar);
                return objB == A0.a.f0e ? objB : p041x0.g.f3419a;
            default:
                if (dVar instanceof p037u0.q) {
                    qVar = (p037u0.q) dVar;
                    int i4 = qVar.f3164i;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        qVar.f3164i = i4 - Integer.MIN_VALUE;
                    } else {
                        qVar = new p037u0.q(this, dVar);
                    }
                } else {
                    qVar = new p037u0.q(this, dVar);
                }
                Object obj2 = qVar.f3163h;
                A0.a aVar2 = A0.a.f0e;
                int i5 = qVar.f3164i;
                if (i5 == 0) {
                    p000a.a.O(obj2);
                    Double d2 = (Double) K.c(((J.b) obj).c((J.d) this.f876f), ((J) this.f878h).f3114g);
                    qVar.f3164i = 1;
                    if (((e) this.f877g).a(d2, qVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p000a.a.O(obj2);
                }
                return p041x0.g.f3419a;
        }
    }

    public l(e eVar, J.d dVar, J j2) {
        this.f877g = eVar;
        this.f876f = dVar;
        this.f878h = j2;
    }

    public l(e eVar, z0.i iVar) {
        this.f876f = iVar;
        this.f877g = AbstractC0068a.l(iVar);
        this.f878h = new U0.t(eVar, null);
    }
}
