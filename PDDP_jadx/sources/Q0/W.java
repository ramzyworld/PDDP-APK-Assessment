package Q0;

/* JADX INFO: loaded from: classes.dex */
public final class W extends U {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Z f694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final X f695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0052j f696k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f697l;

    public W(Z z2, X x2, C0052j c0052j, Object obj) {
        this.f694i = z2;
        this.f695j = x2;
        this.f696k = c0052j;
        this.f697l = obj;
    }

    @Override // H0.l
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        o((Throwable) obj);
        return p041x0.g.f3419a;
    }

    @Override // Q0.U
    public final void o(Throwable th) {
        C0052j c0052j = this.f696k;
        Z z2 = this.f694i;
        z2.getClass();
        C0052j c0052jM = Z.M(c0052j);
        X x2 = this.f695j;
        Object obj = this.f697l;
        if (c0052jM != null) {
            while (AbstractC0063v.e(c0052jM.f723i, false, new W(z2, x2, c0052jM, obj), 1) == b0.f710e) {
                c0052jM = Z.M(c0052jM);
                if (c0052jM == null) {
                }
            }
            return;
        }
        z2.q(z2.z(x2, obj));
    }
}
