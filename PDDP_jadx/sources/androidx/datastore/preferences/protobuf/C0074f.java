package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0074f extends C0075g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1500j;

    public C0074f(byte[] bArr, int i2, int i3) {
        super(bArr);
        C0075g.b(i2, i2 + i3, bArr.length);
        this.f1499i = i2;
        this.f1500j = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.C0075g
    public final byte a(int i2) {
        int i3 = this.f1500j;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.f1504f[this.f1499i + i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
    }

    @Override // androidx.datastore.preferences.protobuf.C0075g
    public final void d(byte[] bArr, int i2) {
        System.arraycopy(this.f1504f, this.f1499i, bArr, 0, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.C0075g
    public final int e() {
        return this.f1499i;
    }

    @Override // androidx.datastore.preferences.protobuf.C0075g
    public final byte f(int i2) {
        return this.f1504f[this.f1499i + i2];
    }

    @Override // androidx.datastore.preferences.protobuf.C0075g
    public final int size() {
        return this.f1500j;
    }
}
