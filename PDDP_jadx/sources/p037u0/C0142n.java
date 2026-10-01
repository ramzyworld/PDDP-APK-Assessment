package p037u0;

import A0.a;
import G.C0016q;
import J.b;
import J.d;
import T0.e;
import T0.n;
import p041x0.g;

/* JADX INFO: renamed from: u0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0142n implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f3153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3154g;

    public /* synthetic */ C0142n(e eVar, d dVar, int i2) {
        this.f3152e = i2;
        this.f3153f = eVar;
        this.f3154g = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x0127  */
    /* JADX WARN: Code duplicated, block: B:89:0x0171  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // T0.e
    public final Object a(Object obj, z0.d dVar) {
        C0141m c0141m;
        s sVar;
        w wVar;
        y yVar;
        n nVar;
        Object obj2;
        Object obj3;
        C0142n c0142n;
        switch (this.f3152e) {
            case 0:
                if (dVar instanceof C0141m) {
                    c0141m = (C0141m) dVar;
                    int i2 = c0141m.f3150i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0141m.f3150i = i2 - Integer.MIN_VALUE;
                    } else {
                        c0141m = new C0141m(this, dVar);
                    }
                } else {
                    c0141m = new C0141m(this, dVar);
                }
                Object obj4 = c0141m.f3149h;
                a aVar = a.f0e;
                int i3 = c0141m.f3150i;
                if (i3 == 0) {
                    p000a.a.O(obj4);
                    Object objC = ((b) obj).c((d) this.f3154g);
                    c0141m.f3150i = 1;
                    if (this.f3153f.a(objC, c0141m) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p000a.a.O(obj4);
                }
                return g.f3419a;
            case 1:
                if (dVar instanceof s) {
                    sVar = (s) dVar;
                    int i4 = sVar.f3172i;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        sVar.f3172i = i4 - Integer.MIN_VALUE;
                    } else {
                        sVar = new s(this, dVar);
                    }
                } else {
                    sVar = new s(this, dVar);
                }
                Object obj5 = sVar.f3171h;
                a aVar2 = a.f0e;
                int i5 = sVar.f3172i;
                if (i5 == 0) {
                    p000a.a.O(obj5);
                    Object objC2 = ((b) obj).c((d) this.f3154g);
                    sVar.f3172i = 1;
                    if (this.f3153f.a(objC2, sVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p000a.a.O(obj5);
                }
                return g.f3419a;
            case 2:
                if (dVar instanceof w) {
                    wVar = (w) dVar;
                    int i6 = wVar.f3191i;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        wVar.f3191i = i6 - Integer.MIN_VALUE;
                    } else {
                        wVar = new w(this, dVar);
                    }
                } else {
                    wVar = new w(this, dVar);
                }
                Object obj6 = wVar.f3190h;
                a aVar3 = a.f0e;
                int i7 = wVar.f3191i;
                if (i7 == 0) {
                    p000a.a.O(obj6);
                    Object objC3 = ((b) obj).c((d) this.f3154g);
                    wVar.f3191i = 1;
                    if (this.f3153f.a(objC3, wVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p000a.a.O(obj6);
                }
                return g.f3419a;
            case 3:
                if (dVar instanceof y) {
                    yVar = (y) dVar;
                    int i8 = yVar.f3199i;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        yVar.f3199i = i8 - Integer.MIN_VALUE;
                    } else {
                        yVar = new y(this, dVar);
                    }
                } else {
                    yVar = new y(this, dVar);
                }
                Object obj7 = yVar.f3198h;
                a aVar4 = a.f0e;
                int i9 = yVar.f3199i;
                if (i9 == 0) {
                    p000a.a.O(obj7);
                    Object objC4 = ((b) obj).c((d) this.f3154g);
                    yVar.f3199i = 1;
                    if (this.f3153f.a(objC4, yVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p000a.a.O(obj7);
                }
                return g.f3419a;
            default:
                if (dVar instanceof n) {
                    nVar = (n) dVar;
                    int i10 = nVar.f885j;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        nVar.f885j = i10 - Integer.MIN_VALUE;
                    } else {
                        nVar = new n(this, dVar);
                    }
                } else {
                    nVar = new n(this, dVar);
                }
                Object obj8 = nVar.f884i;
                a aVar5 = a.f0e;
                int i11 = nVar.f885j;
                boolean z2 = true;
                if (i11 != 0) {
                    if (i11 == 1) {
                        Object obj9 = nVar.f887l;
                        C0142n c0142n2 = nVar.f883h;
                        p000a.a.O(obj8);
                        obj3 = obj9;
                        c0142n = c0142n2;
                        obj2 = obj8;
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0142n = nVar.f883h;
                        p000a.a.O(obj8);
                    }
                    if (z2) {
                        return g.f3419a;
                    }
                    throw new U0.a(c0142n);
                }
                p000a.a.O(obj8);
                nVar.f883h = this;
                nVar.f887l = obj;
                nVar.f885j = 1;
                Object objH = ((C0016q) this.f3154g).h(obj, nVar);
                if (objH == aVar5) {
                    return aVar5;
                }
                obj2 = objH;
                obj3 = obj;
                c0142n = this;
                if (((Boolean) obj2).booleanValue()) {
                    e eVar = c0142n.f3153f;
                    nVar.f883h = c0142n;
                    nVar.f887l = null;
                    nVar.f885j = 2;
                    if (eVar.a(obj3, nVar) == aVar5) {
                        return aVar5;
                    }
                } else {
                    z2 = false;
                }
                if (z2) {
                    return g.f3419a;
                }
                throw new U0.a(c0142n);
        }
    }

    public C0142n(C0016q c0016q, e eVar) {
        this.f3152e = 4;
        this.f3154g = c0016q;
        this.f3153f = eVar;
    }
}
