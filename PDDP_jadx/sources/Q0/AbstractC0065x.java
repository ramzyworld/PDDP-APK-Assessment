package Q0;

/* JADX INFO: renamed from: Q0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0065x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f755a = 0;

    static {
        String property;
        int i2 = V0.x.f1016a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (!(property != null ? Boolean.parseBoolean(property) : false)) {
            RunnableC0064w runnableC0064w = RunnableC0064w.f753n;
            return;
        }
        X0.d dVar = B.f672a;
        R0.c cVar = V0.p.f1007a;
        R0.c cVar2 = cVar.f771j;
        if (cVar instanceof InterfaceC0066y) {
            return;
        }
        RunnableC0064w runnableC0064w2 = RunnableC0064w.f753n;
    }
}
