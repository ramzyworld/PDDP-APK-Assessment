package X0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f1047h;

    static {
        int i2 = k.f1056c;
        int i3 = k.f1057d;
        long j2 = k.f1058e;
        String str = k.f1054a;
        d dVar = new d();
        dVar.f1049g = new b(i2, i3, j2, str);
        f1047h = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // Q0.AbstractC0060s
    public final String toString() {
        return "Dispatchers.Default";
    }
}
