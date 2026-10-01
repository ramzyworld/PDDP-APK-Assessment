package Q0;

/* JADX INFO: loaded from: classes.dex */
public final class O extends U {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f689j;

    public /* synthetic */ O(int i2, Object obj) {
        this.f688i = i2;
        this.f689j = obj;
    }

    @Override // H0.l
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        switch (this.f688i) {
            case 0:
                o((Throwable) obj);
                break;
            default:
                o((Throwable) obj);
                break;
        }
        return p041x0.g.f3419a;
    }

    @Override // Q0.U
    public final void o(Throwable th) {
        switch (this.f688i) {
            case 0:
                ((H0.l) this.f689j).j(th);
                break;
            default:
                Object objE = n().E();
                boolean z2 = objE instanceof C0056n;
                V v2 = (V) this.f689j;
                if (!z2) {
                    v2.m(AbstractC0063v.l(objE));
                } else {
                    v2.m(p000a.a.l(((C0056n) objE).f732a));
                }
                break;
        }
    }
}
