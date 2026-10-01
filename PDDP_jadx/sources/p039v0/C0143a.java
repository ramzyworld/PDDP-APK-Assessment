package p039v0;

/* JADX INFO: renamed from: v0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0143a extends Throwable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3317g;

    public C0143a(String str, String str2, String str3) {
        this.f3315e = str;
        this.f3316f = str2;
        this.f3317g = str3;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f3316f;
    }
}
