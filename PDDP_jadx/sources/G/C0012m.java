package G;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: G.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0012m extends B0.g implements H0.l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Serializable f249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Iterator f252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f253n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f254o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ S f255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0013n f256q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0012m(S s2, C0013n c0013n, z0.d dVar) {
        super(1, dVar);
        this.f255p = s2;
        this.f256q = c0013n;
    }

    @Override // H0.l
    public final Object j(Object obj) {
        return new C0012m(this.f255p, this.f256q, (z0.d) obj).k(p041x0.g.f3419a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:38:0x0100 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0101  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:21:0x009f->B:50:?, LOOP_END, SYNTHETIC] */
    @Override // B0.b
    public final Object k(Object obj) {
        Y0.a aVarA;
        I0.n nVar;
        I0.p pVar;
        I0.p pVar2;
        Iterator it;
        Y0.a aVar;
        I0.n nVar2;
        I0.p pVar3;
        C0011l c0011l;
        Y0.d dVar;
        I0.p pVar4;
        I0.n nVar3;
        H0.p pVar5;
        Y0.a aVar2;
        Object obj2;
        int iHashCode;
        Integer numA;
        int i2;
        A0.a aVar3 = A0.a.f0e;
        int i3 = this.f254o;
        C0013n c0013n = this.f256q;
        S s2 = this.f255p;
        if (i3 != 0) {
            if (i3 == 1) {
                pVar = (I0.p) this.f251l;
                pVar2 = (I0.p) this.f250k;
                nVar = (I0.n) this.f249j;
                aVarA = (Y0.a) this.f248i;
                p000a.a.O(obj);
            } else if (i3 == 2) {
                it = this.f252m;
                c0011l = (C0011l) this.f251l;
                pVar3 = (I0.p) this.f250k;
                nVar2 = (I0.n) this.f249j;
                aVar = (Y0.a) this.f248i;
                p000a.a.O(obj);
                while (it.hasNext()) {
                    pVar5 = (H0.p) it.next();
                    this.f248i = aVar;
                    this.f249j = nVar2;
                    this.f250k = pVar3;
                    this.f251l = c0011l;
                    this.f252m = it;
                    this.f254o = 2;
                    if (pVar5.h(c0011l, this) == aVar3) {
                        return aVar3;
                    }
                }
                pVar2 = pVar3;
                nVar = nVar2;
                aVarA = aVar;
                c0013n.f260c = null;
                this.f248i = nVar;
                this.f249j = pVar2;
                this.f250k = aVarA;
                this.f251l = null;
                this.f252m = null;
                this.f254o = 3;
                dVar = (Y0.d) aVarA;
                if (dVar.c(this) == aVar3) {
                    return aVar3;
                }
                pVar4 = pVar2;
                nVar3 = nVar;
                aVar2 = dVar;
                nVar3.f336e = true;
                ((Y0.d) aVar2).e(null);
                obj2 = pVar4.f338e;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                l0 l0VarG = s2.g();
                this.f248i = obj2;
                this.f249j = null;
                this.f250k = null;
                this.f253n = iHashCode;
                this.f254o = 4;
                numA = l0VarG.a();
                if (numA == aVar3) {
                    return aVar3;
                }
                i2 = iHashCode;
                obj = numA;
            } else if (i3 == 3) {
                Y0.a aVar4 = (Y0.a) this.f250k;
                pVar4 = (I0.p) this.f249j;
                nVar3 = (I0.n) this.f248i;
                p000a.a.O(obj);
                aVar2 = aVar4;
                try {
                    nVar3.f336e = true;
                    ((Y0.d) aVar2).e(null);
                    obj2 = pVar4.f338e;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    l0 l0VarG2 = s2.g();
                    this.f248i = obj2;
                    this.f249j = null;
                    this.f250k = null;
                    this.f253n = iHashCode;
                    this.f254o = 4;
                    numA = l0VarG2.a();
                    if (numA == aVar3) {
                        return aVar3;
                    }
                    i2 = iHashCode;
                    obj = numA;
                } catch (Throwable th) {
                    ((Y0.d) aVar2).e(null);
                    throw th;
                }
            } else {
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.f253n;
                obj2 = this.f248i;
                p000a.a.O(obj);
            }
            return new C0003d(obj2, i2, ((Number) obj).intValue());
        }
        p000a.a.O(obj);
        aVarA = Y0.e.a();
        nVar = new I0.n();
        pVar = new I0.p();
        this.f248i = aVarA;
        this.f249j = nVar;
        this.f250k = pVar;
        this.f251l = pVar;
        this.f254o = 1;
        obj = S.f(s2, true, this);
        if (obj == aVar3) {
            return aVar3;
        }
        pVar2 = pVar;
        pVar.f338e = ((C0003d) obj).f189b;
        C0011l c0011l2 = new C0011l(aVarA, nVar, pVar2, s2);
        List list = (List) c0013n.f260c;
        if (list != null) {
            it = list.iterator();
            aVar = aVarA;
            nVar2 = nVar;
            pVar3 = pVar2;
            c0011l = c0011l2;
            while (it.hasNext()) {
                pVar5 = (H0.p) it.next();
                this.f248i = aVar;
                this.f249j = nVar2;
                this.f250k = pVar3;
                this.f251l = c0011l;
                this.f252m = it;
                this.f254o = 2;
                if (pVar5.h(c0011l, this) == aVar3) {
                    return aVar3;
                }
            }
            pVar2 = pVar3;
            nVar = nVar2;
            aVarA = aVar;
        }
        c0013n.f260c = null;
        this.f248i = nVar;
        this.f249j = pVar2;
        this.f250k = aVarA;
        this.f251l = null;
        this.f252m = null;
        this.f254o = 3;
        dVar = (Y0.d) aVarA;
        if (dVar.c(this) == aVar3) {
            return aVar3;
        }
        pVar4 = pVar2;
        nVar3 = nVar;
        aVar2 = dVar;
        nVar3.f336e = true;
        ((Y0.d) aVar2).e(null);
        obj2 = pVar4.f338e;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        l0 l0VarG3 = s2.g();
        this.f248i = obj2;
        this.f249j = null;
        this.f250k = null;
        this.f253n = iHashCode;
        this.f254o = 4;
        numA = l0VarG3.a();
        if (numA == aVar3) {
            return aVar3;
        }
        i2 = iHashCode;
        obj = numA;
        return new C0003d(obj2, i2, ((Number) obj).intValue());
    }
}
