package p016j;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2608h;

    public final void a(int i2, int i3) {
        this.f2603c = i2;
        this.f2604d = i3;
        this.f2608h = true;
        if (this.f2607g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f2601a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f2602b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2601a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f2602b = i3;
        }
    }
}
