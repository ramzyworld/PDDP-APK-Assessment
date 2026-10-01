package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class s implements l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final s f1604m = new s();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1606f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f1609i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1607g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1608h = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f1610j = new n(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f1611k = new p(0, this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final D.j f1612l = new D.j(15, this);

    @Override // androidx.lifecycle.l
    public final n a() {
        return this.f1610j;
    }

    public final void b() {
        int i2 = this.f1606f + 1;
        this.f1606f = i2;
        if (i2 == 1) {
            if (this.f1607g) {
                this.f1610j.c(f.ON_RESUME);
                this.f1607g = false;
            } else {
                Handler handler = this.f1609i;
                I0.i.b(handler);
                handler.removeCallbacks(this.f1611k);
            }
        }
    }
}
