package Q0;

/* JADX INFO: loaded from: classes.dex */
public abstract class H extends AbstractC0060s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f679j = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p043y0.b f682i;

    public final void i(boolean z2) {
        long j2 = this.f680g - (z2 ? 4294967296L : 1L);
        this.f680g = j2;
        if (j2 <= 0 && this.f681h) {
            n();
        }
    }

    public abstract Thread j();

    public final void k(boolean z2) {
        this.f680g = (z2 ? 4294967296L : 1L) + this.f680g;
        if (z2) {
            return;
        }
        this.f681h = true;
    }

    public abstract long l();

    public final boolean m() {
        p043y0.b bVar = this.f682i;
        if (bVar == null) {
            return false;
        }
        A a2 = (A) (bVar.isEmpty() ? null : bVar.removeFirst());
        if (a2 == null) {
            return false;
        }
        a2.run();
        return true;
    }

    public abstract void n();
}
