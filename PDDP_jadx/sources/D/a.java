package D;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f16d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f19g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f20h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21i;

    public final float a(long j2) {
        long j3 = this.f17e;
        if (j2 < j3) {
            return 0.0f;
        }
        long j4 = this.f19g;
        if (j4 < 0 || j2 < j4) {
            return g.b((j2 - j3) / this.f13a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f20h;
        return (g.b((j2 - j4) / this.f21i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
