package T0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends U0.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Y.j f846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Y.j f847i;

    public c(Y.j jVar, z0.i iVar, int i2, int i3) {
        super(iVar, i2, i3);
        this.f846h = jVar;
        this.f847i = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // U0.f
    public final Object a(S0.p pVar, z0.d dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i2 = bVar.f845k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.f845k = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, (B0.b) dVar);
            }
        } else {
            bVar = new b(this, (B0.b) dVar);
        }
        Object obj = bVar.f843i;
        A0.a aVar = A0.a.f0e;
        int i3 = bVar.f845k;
        p041x0.g gVar = p041x0.g.f3419a;
        if (i3 == 0) {
            p000a.a.O(obj);
            bVar.f842h = pVar;
            bVar.f845k = 1;
            Object objH = this.f846h.h(pVar, bVar);
            if (objH != aVar) {
                objH = gVar;
            }
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = bVar.f842h;
            p000a.a.O(obj);
        }
        if (((S0.o) pVar).f818h.s()) {
            return gVar;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // U0.f
    public final U0.f b(z0.i iVar, int i2, int i3) {
        return new c(this.f847i, iVar, i2, i3);
    }

    @Override // U0.f
    public final String toString() {
        return "block[" + this.f846h + "] -> " + super.toString();
    }
}
