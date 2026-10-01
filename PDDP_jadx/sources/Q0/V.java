package Q0;

/* JADX INFO: loaded from: classes.dex */
public final class V extends C0048f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0054l f693m;

    public V(z0.d dVar, C0054l c0054l) {
        super(1, dVar);
        this.f693m = c0054l;
    }

    @Override // Q0.C0048f
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // Q0.C0048f
    public final Throwable t(Z z2) {
        Throwable thC;
        Object objE = this.f693m.E();
        if (!(objE instanceof X) || (thC = ((X) objE).c()) == null) {
            return objE instanceof C0056n ? ((C0056n) objE).f732a : z2.A();
        }
        return thC;
    }
}
