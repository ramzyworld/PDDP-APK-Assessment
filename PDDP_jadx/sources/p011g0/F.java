package p011g0;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f1838b;

    public /* synthetic */ F(int i2, Object[] objArr) {
        this.f1837a = i2;
        this.f1838b = objArr;
    }

    public F(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f1838b = new Object[i2];
    }
}
