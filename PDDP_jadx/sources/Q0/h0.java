package Q0;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f721a = new ThreadLocal();

    public static H a() {
        ThreadLocal threadLocal = f721a;
        H h2 = (H) threadLocal.get();
        if (h2 != null) {
            return h2;
        }
        C0046d c0046d = new C0046d(Thread.currentThread());
        threadLocal.set(c0046d);
        return c0046d;
    }
}
