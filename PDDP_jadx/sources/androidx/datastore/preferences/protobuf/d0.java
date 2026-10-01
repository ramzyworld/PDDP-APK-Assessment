package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d0 f1492f = new d0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f1494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f1495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1496d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1497e;

    public d0(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.f1493a = i2;
        this.f1494b = iArr;
        this.f1495c = objArr;
        this.f1497e = z2;
    }

    public final void a(int i2) {
        int[] iArr = this.f1494b;
        if (i2 > iArr.length) {
            int i3 = this.f1493a;
            int i4 = (i3 / 2) + i3;
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.f1494b = Arrays.copyOf(iArr, i2);
            this.f1495c = Arrays.copyOf(this.f1495c, i2);
        }
    }

    public final int b() {
        int iN0;
        int i2 = this.f1496d;
        if (i2 != -1) {
            return i2;
        }
        int iB = 0;
        for (int i3 = 0; i3 < this.f1493a; i3++) {
            int i4 = this.f1494b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                iN0 = C0081m.n0(((Long) this.f1495c[i3]).longValue(), i5);
            } else if (i6 == 1) {
                ((Long) this.f1495c[i3]).getClass();
                iN0 = C0081m.Z(i5);
            } else if (i6 != 2) {
                if (i6 == 3) {
                    iB = ((d0) this.f1495c[i3]).b() + (C0081m.k0(i5) * 2) + iB;
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(A.b());
                    }
                    ((Integer) this.f1495c[i3]).getClass();
                    iN0 = C0081m.Y(i5);
                }
            } else {
                iN0 = C0081m.V(i5, (C0075g) this.f1495c[i3]);
            }
            iB = iN0 + iB;
        }
        this.f1496d = iB;
        return iB;
    }

    public final void c(int i2, Object obj) {
        if (!this.f1497e) {
            throw new UnsupportedOperationException();
        }
        a(this.f1493a + 1);
        int[] iArr = this.f1494b;
        int i3 = this.f1493a;
        iArr[i3] = i2;
        this.f1495c[i3] = obj;
        this.f1493a = i3 + 1;
    }

    public final void d(F f2) {
        if (this.f1493a == 0) {
            return;
        }
        f2.getClass();
        for (int i2 = 0; i2 < this.f1493a; i2++) {
            int i3 = this.f1494b[i2];
            Object obj = this.f1495c[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                f2.j(((Long) obj).longValue(), i4);
            } else if (i5 == 1) {
                f2.f(((Long) obj).longValue(), i4);
            } else if (i5 == 2) {
                f2.b(i4, (C0075g) obj);
            } else if (i5 == 3) {
                C0081m c0081m = (C0081m) f2.f1429a;
                c0081m.E0(i4, 3);
                ((d0) obj).d(f2);
                c0081m.E0(i4, 4);
            } else {
                if (i5 != 5) {
                    throw new RuntimeException(A.b());
                }
                f2.e(i4, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        int i2 = this.f1493a;
        if (i2 == d0Var.f1493a) {
            int[] iArr = this.f1494b;
            int[] iArr2 = d0Var.f1494b;
            for (int i3 = 0; i3 < i2; i3++) {
                if (iArr[i3] == iArr2[i3]) {
                }
            }
            Object[] objArr = this.f1495c;
            Object[] objArr2 = d0Var.f1495c;
            int i4 = this.f1493a;
            for (int i5 = 0; i5 < i4; i5++) {
                if (objArr[i5].equals(objArr2[i5])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f1493a;
        int i3 = (527 + i2) * 31;
        int[] iArr = this.f1494b;
        int iHashCode = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i3 + i4) * 31;
        Object[] objArr = this.f1495c;
        int i7 = this.f1493a;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return i6 + iHashCode;
    }
}
