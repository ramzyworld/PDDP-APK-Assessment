package p011g0;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1937a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f1938b;

    public z(A a2) {
        this.f1938b = a2;
    }

    public final void a(boolean z2) {
        if (this.f1937a) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f1937a = true;
        A a2 = this.f1938b;
        int i2 = a2.f1832b - 1;
        a2.f1832b = i2;
        boolean z3 = z2 | a2.f1833c;
        a2.f1833c = z3;
        if (i2 != 0 || z3) {
            return;
        }
        a2.f1834d.J(a2.f1831a);
    }
}
