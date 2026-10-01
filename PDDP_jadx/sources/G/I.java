package G;

import Q0.AbstractC0063v;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class I extends B0.g implements H0.l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f112m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Serializable f113n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(S s2, z0.i iVar, H0.p pVar, z0.d dVar) {
        super(1, dVar);
        this.f110k = s2;
        this.f112m = iVar;
        this.f113n = (B0.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [B0.g, H0.p] */
    @Override // H0.l
    public final Object j(Object obj) {
        z0.d dVar = (z0.d) obj;
        switch (this.f108i) {
            case 0:
                return new I((I0.p) this.f112m, this.f110k, (I0.o) this.f113n, dVar).k(p041x0.g.f3419a);
            default:
                return new I(this.f110k, (z0.i) this.f112m, (H0.p) this.f113n, dVar).k(p041x0.g.f3419a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v2, types: [B0.g, H0.p] */
    @Override // B0.b
    public final Object k(Object obj) throws Throwable {
        I0.p pVar;
        I0.o oVar;
        C0003d c0003d;
        Object obj2;
        int iHashCode;
        switch (this.f108i) {
            case 0:
                A0.a aVar = A0.a.f0e;
                int i2 = this.f109j;
                I0.o oVar2 = (I0.o) this.f113n;
                I0.p pVar2 = (I0.p) this.f112m;
                S s2 = this.f110k;
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            pVar = (I0.p) ((Serializable) this.f111l);
                            p000a.a.O(obj);
                        } else {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                oVar2 = (I0.o) ((Serializable) this.f111l);
                                p000a.a.O(obj);
                                oVar2.f337e = ((Number) obj).intValue();
                                return p041x0.g.f3419a;
                            }
                            oVar = (I0.o) ((Serializable) this.f111l);
                            p000a.a.O(obj);
                        }
                        oVar.f337e = ((Number) obj).intValue();
                        return p041x0.g.f3419a;
                    }
                    p000a.a.O(obj);
                    this.f111l = pVar2;
                    this.f109j = 1;
                    obj = s2.i(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    pVar = pVar2;
                    pVar.f338e = obj;
                    l0 l0VarG = s2.g();
                    this.f111l = oVar2;
                    this.f109j = 2;
                    obj = l0VarG.a();
                    if (obj == aVar) {
                        return aVar;
                    }
                    oVar = oVar2;
                    oVar.f337e = ((Number) obj).intValue();
                    return p041x0.g.f3419a;
                } catch (C0002c unused) {
                    Object obj3 = pVar2.f338e;
                    this.f111l = oVar2;
                    this.f109j = 3;
                    obj = s2.j(obj3, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            default:
                A0.a aVar2 = A0.a.f0e;
                int i3 = this.f109j;
                S s3 = this.f110k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        p000a.a.O(obj);
                    } else {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.f111l;
                            p000a.a.O(obj);
                            return obj4;
                        }
                        c0003d = (C0003d) this.f111l;
                        p000a.a.O(obj);
                    }
                    obj2 = c0003d.f189b;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    if (iHashCode == c0003d.f190c) {
                        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    }
                    if (!I0.i.a(c0003d.f189b, obj)) {
                        this.f111l = obj;
                        this.f109j = 3;
                        if (s3.j(obj, true, this) == aVar2) {
                            return aVar2;
                        }
                    }
                    return obj;
                }
                p000a.a.O(obj);
                this.f109j = 1;
                obj = S.f(s3, true, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                c0003d = (C0003d) obj;
                K k2 = new K((B0.g) this.f113n, c0003d, null);
                this.f111l = c0003d;
                this.f109j = 2;
                obj = AbstractC0063v.n((z0.i) this.f112m, k2, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                obj2 = c0003d.f189b;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                if (iHashCode == c0003d.f190c) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (!I0.i.a(c0003d.f189b, obj)) {
                    this.f111l = obj;
                    this.f109j = 3;
                    if (s3.j(obj, true, this) == aVar2) {
                        return aVar2;
                    }
                }
                return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(I0.p pVar, S s2, I0.o oVar, z0.d dVar) {
        super(1, dVar);
        this.f112m = pVar;
        this.f110k = s2;
        this.f113n = oVar;
    }
}
