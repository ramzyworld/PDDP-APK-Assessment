package p016j;

/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s0 f2730f;

    public /* synthetic */ r0(s0 s0Var, int i2) {
        this.f2729e = i2;
        this.f2730f = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2729e) {
            case 0:
                this.f2730f.c(false);
                break;
            default:
                this.f2730f.a();
                break;
        }
    }
}
