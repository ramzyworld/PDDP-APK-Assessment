package G;

/* JADX INFO: renamed from: G.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0011l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y0.a f241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I0.n f242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I0.p f243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S f244d;

    public C0011l(Y0.a aVar, I0.n nVar, I0.p pVar, S s2) {
        this.f241a = aVar;
        this.f242b = nVar;
        this.f243c = pVar;
        this.f244d = s2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ae, B:38:0x00b6), top: B:53:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(C0007h c0007h, B0.b bVar) throws Throwable {
        C0010k c0010k;
        S s2;
        I0.n nVar;
        I0.p pVar;
        Y0.a aVar;
        H0.p pVar2;
        Y0.a aVar2;
        Y0.a aVar3;
        S s3;
        Object obj;
        I0.p pVar3;
        Y0.a aVar4;
        if (bVar instanceof C0010k) {
            c0010k = (C0010k) bVar;
            int i2 = c0010k.f240o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0010k.f240o = i2 - Integer.MIN_VALUE;
            } else {
                c0010k = new C0010k(this, bVar);
            }
        } else {
            c0010k = new C0010k(this, bVar);
        }
        Object obj2 = c0010k.f238m;
        A0.a aVar5 = A0.a.f0e;
        int i3 = c0010k.f240o;
        try {
            if (i3 == 0) {
                p000a.a.O(obj2);
                c0010k.f233h = c0007h;
                Y0.a aVar6 = this.f241a;
                c0010k.f234i = aVar6;
                I0.n nVar2 = this.f242b;
                c0010k.f235j = nVar2;
                I0.p pVar4 = this.f243c;
                c0010k.f236k = pVar4;
                s2 = this.f244d;
                c0010k.f237l = s2;
                c0010k.f240o = 1;
                Y0.d dVar = (Y0.d) aVar6;
                if (dVar.c(c0010k) == aVar5) {
                    return aVar5;
                }
                nVar = nVar2;
                pVar = pVar4;
                pVar2 = c0007h;
                aVar = dVar;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = c0010k.f235j;
                        pVar3 = (I0.p) c0010k.f234i;
                        aVar2 = (Y0.a) c0010k.f233h;
                        try {
                            p000a.a.O(obj2);
                            aVar4 = aVar2;
                            pVar3.f338e = obj;
                            pVar = pVar3;
                            aVar2 = aVar4;
                            Object obj3 = pVar.f338e;
                            ((Y0.d) aVar2).e(null);
                            return obj3;
                        } catch (Throwable th) {
                            th = th;
                            ((Y0.d) aVar2).e(null);
                            throw th;
                        }
                    }
                    s3 = (S) c0010k.f235j;
                    pVar = (I0.p) c0010k.f234i;
                    aVar3 = (Y0.a) c0010k.f233h;
                    try {
                        p000a.a.O(obj2);
                        aVar3 = aVar3;
                        if (I0.i.a(obj2, pVar.f338e)) {
                            aVar2 = aVar3;
                        } else {
                            c0010k.f233h = aVar3;
                            c0010k.f234i = pVar;
                            c0010k.f235j = obj2;
                            c0010k.f240o = 3;
                            if (s3.j(obj2, false, c0010k) == aVar5) {
                                return aVar5;
                            }
                            obj = obj2;
                            pVar3 = pVar;
                            aVar4 = aVar3;
                            pVar3.f338e = obj;
                            pVar = pVar3;
                            aVar2 = aVar4;
                        }
                        Object obj4 = pVar.f338e;
                        ((Y0.d) aVar2).e(null);
                        return obj4;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar3;
                        ((Y0.d) aVar2).e(null);
                        throw th;
                    }
                }
                S s4 = c0010k.f237l;
                pVar = c0010k.f236k;
                nVar = (I0.n) c0010k.f235j;
                Y0.a aVar7 = (Y0.a) c0010k.f234i;
                H0.p pVar5 = (H0.p) c0010k.f233h;
                p000a.a.O(obj2);
                aVar = aVar7;
                s2 = s4;
                pVar2 = pVar5;
            }
            if (nVar.f336e) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = pVar.f338e;
            c0010k.f233h = aVar;
            c0010k.f234i = pVar;
            c0010k.f235j = s2;
            c0010k.f236k = null;
            c0010k.f237l = null;
            c0010k.f240o = 2;
            Object objH = pVar2.h(obj5, c0010k);
            if (objH == aVar5) {
                return aVar5;
            }
            aVar3 = aVar;
            obj2 = objH;
            s3 = s2;
            if (I0.i.a(obj2, pVar.f338e)) {
                c0010k.f233h = aVar3;
                c0010k.f234i = pVar;
                c0010k.f235j = obj2;
                c0010k.f240o = 3;
                if (s3.j(obj2, false, c0010k) == aVar5) {
                    return aVar5;
                }
                obj = obj2;
                pVar3 = pVar;
                aVar4 = aVar3;
                pVar3.f338e = obj;
                pVar = pVar3;
                aVar2 = aVar4;
            } else {
                aVar2 = aVar3;
            }
            Object obj6 = pVar.f338e;
            ((Y0.d) aVar2).e(null);
            return obj6;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            ((Y0.d) aVar2).e(null);
            throw th;
        }
    }
}
