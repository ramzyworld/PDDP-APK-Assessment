package Y0;

import V0.AbstractC0068a;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D.j f1119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D.j f1120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D.j f1121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D.j f1122e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f1118a = AbstractC0068a.k("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f1123f = AbstractC0068a.k("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12);

    static {
        int i2 = 14;
        f1119b = new D.j(i2, "PERMIT");
        f1120c = new D.j(i2, "TAKEN");
        f1121d = new D.j(i2, "BROKEN");
        f1122e = new D.j(i2, "CANCELLED");
    }
}
