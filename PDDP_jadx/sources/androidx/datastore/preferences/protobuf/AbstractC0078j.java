package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0078j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0079k f1523b;

    public abstract void a(int i2);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i2);

    public abstract int e(int i2);

    public abstract boolean f();

    public abstract C0075g g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i2);

    public final void y() {
        boolean zX;
        do {
            int iU = u();
            if (iU == 0) {
                return;
            }
            int i2 = this.f1522a;
            if (i2 >= 100) {
                throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f1522a = i2 + 1;
            zX = x(iU);
            this.f1522a--;
        } while (zX);
    }
}
