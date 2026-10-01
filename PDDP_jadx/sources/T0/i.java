package T0;

import G.C0017s;

/* JADX INFO: loaded from: classes.dex */
public final class i implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D.j f862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0017s f863f;

    public i(D.j jVar, C0017s c0017s) {
        this.f862e = jVar;
        this.f863f = c0017s;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // T0.d
    public final Object g(e eVar, z0.d dVar) throws Throwable {
        h hVar;
        i iVar;
        t tVar;
        C0017s c0017s;
        U0.n nVar;
        Throwable th;
        U0.n nVar2;
        C0017s c0017s2;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i2 = hVar.f858i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.f858i = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, dVar);
            }
        } else {
            hVar = new h(this, dVar);
        }
        Object obj = hVar.f857h;
        A0.a aVar = A0.a.f0e;
        int i3 = hVar.f858i;
        if (i3 == 0) {
            p000a.a.O(obj);
            try {
                D.j jVar = this.f862e;
                hVar.f860k = this;
                hVar.f861l = eVar;
                hVar.f858i = 1;
                if (jVar.g(eVar, hVar) == aVar) {
                    return aVar;
                }
                iVar = this;
                z0.i iVar2 = hVar.f4f;
                I0.i.b(iVar2);
                nVar = new U0.n(eVar, iVar2);
                c0017s2 = iVar.f863f;
                hVar.f860k = nVar;
                hVar.f861l = null;
                hVar.f858i = 3;
                if (c0017s2.p(nVar, null, hVar) == aVar) {
                    return aVar;
                }
                nVar2 = nVar;
                nVar2.n();
                return p041x0.g.f3419a;
            } catch (Throwable th2) {
                th = th2;
                iVar = this;
                tVar = new t(th);
                c0017s = iVar.f863f;
                hVar.f860k = th;
                hVar.f861l = null;
                hVar.f858i = 2;
                if (r.a(tVar, c0017s, th, hVar) == aVar) {
                    return aVar;
                }
                throw th;
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                Throwable th3 = (Throwable) hVar.f860k;
                p000a.a.O(obj);
                throw th3;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar2 = (U0.n) hVar.f860k;
            try {
                p000a.a.O(obj);
                nVar2.n();
                return p041x0.g.f3419a;
            } catch (Throwable th4) {
                th = th4;
                nVar2.n();
                throw th;
            }
        }
        eVar = hVar.f861l;
        iVar = (i) hVar.f860k;
        try {
            p000a.a.O(obj);
            z0.i iVar3 = hVar.f4f;
            I0.i.b(iVar3);
            nVar = new U0.n(eVar, iVar3);
            try {
                c0017s2 = iVar.f863f;
                hVar.f860k = nVar;
                hVar.f861l = null;
                hVar.f858i = 3;
                if (c0017s2.p(nVar, null, hVar) == aVar) {
                    return aVar;
                }
                nVar2 = nVar;
                nVar2.n();
                return p041x0.g.f3419a;
            } catch (Throwable th5) {
                th = th5;
                nVar2 = nVar;
                nVar2.n();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            tVar = new t(th);
            c0017s = iVar.f863f;
            hVar.f860k = th;
            hVar.f861l = null;
            hVar.f858i = 2;
            if (r.a(tVar, c0017s, th, hVar) == aVar) {
                return aVar;
            }
            throw th;
        }
    }
}
