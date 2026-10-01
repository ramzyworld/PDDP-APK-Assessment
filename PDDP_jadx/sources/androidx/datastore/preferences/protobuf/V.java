package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0090w f1465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f1467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1468d;

    public V(AbstractC0090w abstractC0090w, String str, Object[] objArr) {
        this.f1465a = abstractC0090w;
        this.f1466b = str;
        this.f1467c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f1468d = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 1;
        int i4 = 13;
        while (true) {
            int i5 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f1468d = i2 | (cCharAt2 << i4);
                return;
            } else {
                i2 |= (cCharAt2 & 8191) << i4;
                i4 += 13;
                i3 = i5;
            }
        }
    }

    public final AbstractC0069a a() {
        return this.f1465a;
    }

    public final Object[] b() {
        return this.f1467c;
    }

    public final String c() {
        return this.f1466b;
    }

    public final int d() {
        int i2 = this.f1468d;
        if ((i2 & 1) != 0) {
            return 1;
        }
        return (i2 & 4) == 4 ? 3 : 2;
    }
}
