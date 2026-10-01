package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0077i extends AbstractC0078j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FileInputStream f1513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f1514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1520j = Integer.MAX_VALUE;

    public C0077i(FileInputStream fileInputStream) {
        Charset charset = AbstractC0092y.f1577a;
        this.f1513c = fileInputStream;
        this.f1514d = new byte[4096];
        this.f1515e = 0;
        this.f1517g = 0;
        this.f1519i = 0;
    }

    public final byte[] A(int i2) throws IOException {
        if (i2 == 0) {
            return AbstractC0092y.f1578b;
        }
        if (i2 < 0) {
            throw A.d();
        }
        int i3 = this.f1519i;
        int i4 = this.f1517g;
        int i5 = i3 + i4 + i2;
        if (i5 - Integer.MAX_VALUE > 0) {
            throw new A("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i6 = this.f1520j;
        if (i5 > i6) {
            J((i6 - i3) - i4);
            throw A.e();
        }
        int i7 = this.f1515e - i4;
        int i8 = i2 - i7;
        FileInputStream fileInputStream = this.f1513c;
        if (i8 >= 4096) {
            try {
                if (i8 > fileInputStream.available()) {
                    return null;
                }
            } catch (A e2) {
                e2.f1413e = true;
                throw e2;
            }
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f1514d, this.f1517g, bArr, 0, i7);
        this.f1519i += this.f1515e;
        this.f1517g = 0;
        this.f1515e = 0;
        while (i7 < i2) {
            try {
                int i9 = fileInputStream.read(bArr, i7, i2 - i7);
                if (i9 == -1) {
                    throw A.e();
                }
                this.f1519i += i9;
                i7 += i9;
            } catch (A e3) {
                e3.f1413e = true;
                throw e3;
            }
        }
        return bArr;
    }

    public final ArrayList B(int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int iMin = Math.min(i2, 4096);
            byte[] bArr = new byte[iMin];
            int i3 = 0;
            while (i3 < iMin) {
                int i4 = this.f1513c.read(bArr, i3, iMin - i3);
                if (i4 == -1) {
                    throw A.e();
                }
                this.f1519i += i4;
                i3 += i4;
            }
            i2 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() throws A {
        int i2 = this.f1517g;
        if (this.f1515e - i2 < 4) {
            I(4);
            i2 = this.f1517g;
        }
        this.f1517g = i2 + 4;
        byte[] bArr = this.f1514d;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public final long D() throws A {
        int i2 = this.f1517g;
        if (this.f1515e - i2 < 8) {
            I(8);
            i2 = this.f1517g;
        }
        this.f1517g = i2 + 8;
        byte[] bArr = this.f1514d;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public final int E() {
        int i2;
        int i3 = this.f1517g;
        int i4 = this.f1515e;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f1514d;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.f1517g = i5;
                return b2;
            }
            if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                int i7 = (bArr[i5] << 7) ^ b2;
                if (i7 < 0) {
                    i2 = i7 ^ (-128);
                } else {
                    int i8 = i3 + 3;
                    int i9 = (bArr[i6] << 14) ^ i7;
                    if (i9 >= 0) {
                        i2 = i9 ^ 16256;
                    } else {
                        int i10 = i3 + 4;
                        int i11 = i9 ^ (bArr[i8] << 21);
                        if (i11 < 0) {
                            i2 = (-2080896) ^ i11;
                        } else {
                            i8 = i3 + 5;
                            byte b3 = bArr[i10];
                            int i12 = (i11 ^ (b3 << 28)) ^ 266354560;
                            if (b3 < 0) {
                                i10 = i3 + 6;
                                if (bArr[i8] < 0) {
                                    i8 = i3 + 7;
                                    if (bArr[i10] < 0) {
                                        i10 = i3 + 8;
                                        if (bArr[i8] < 0) {
                                            i8 = i3 + 9;
                                            if (bArr[i10] < 0) {
                                                int i13 = i3 + 10;
                                                if (bArr[i8] >= 0) {
                                                    i6 = i13;
                                                    i2 = i12;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = i12;
                            }
                            i2 = i12;
                        }
                        i6 = i10;
                    }
                    i6 = i8;
                }
                this.f1517g = i6;
                return i2;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j2;
        long j3;
        long j4;
        long j5;
        int i2 = this.f1517g;
        int i3 = this.f1515e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f1514d;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.f1517g = i4;
                return b2;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b2;
                if (i6 < 0) {
                    j2 = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        j2 = i8 ^ 16256;
                        i5 = i7;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            j5 = (-2080896) ^ i10;
                        } else {
                            long j6 = i10;
                            i5 = i2 + 5;
                            long j7 = j6 ^ (((long) bArr[i9]) << 28);
                            if (j7 >= 0) {
                                j4 = 266354560;
                            } else {
                                i9 = i2 + 6;
                                long j8 = j7 ^ (((long) bArr[i5]) << 35);
                                if (j8 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i5 = i2 + 7;
                                    j7 = j8 ^ (((long) bArr[i9]) << 42);
                                    if (j7 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i9 = i2 + 8;
                                        j8 = j7 ^ (((long) bArr[i5]) << 49);
                                        if (j8 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i2 + 9;
                                            long j9 = (j8 ^ (((long) bArr[i9]) << 56)) ^ 71499008037633920L;
                                            if (j9 < 0) {
                                                int i11 = i2 + 10;
                                                if (bArr[i5] >= 0) {
                                                    i5 = i11;
                                                }
                                            }
                                            j2 = j9;
                                        }
                                    }
                                }
                                j5 = j3 ^ j8;
                            }
                            j2 = j4 ^ j7;
                        }
                        i5 = i9;
                        j2 = j5;
                    }
                }
                this.f1517g = i5;
                return j2;
            }
        }
        return G();
    }

    public final long G() throws A {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            if (this.f1517g == this.f1515e) {
                I(1);
            }
            int i3 = this.f1517g;
            this.f1517g = i3 + 1;
            byte b2 = this.f1514d[i3];
            j2 |= ((long) (b2 & 127)) << i2;
            if ((b2 & 128) == 0) {
                return j2;
            }
        }
        throw A.c();
    }

    public final void H() {
        int i2 = this.f1515e + this.f1516f;
        this.f1515e = i2;
        int i3 = this.f1519i + i2;
        int i4 = this.f1520j;
        if (i3 <= i4) {
            this.f1516f = 0;
            return;
        }
        int i5 = i3 - i4;
        this.f1516f = i5;
        this.f1515e = i2 - i5;
    }

    public final void I(int i2) throws A {
        if (K(i2)) {
            return;
        }
        if (i2 <= (Integer.MAX_VALUE - this.f1519i) - this.f1517g) {
            throw A.e();
        }
        throw new A("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void J(int i2) throws A {
        int i3 = this.f1515e;
        int i4 = this.f1517g;
        int i5 = i3 - i4;
        if (i2 <= i5 && i2 >= 0) {
            this.f1517g = i4 + i2;
            return;
        }
        FileInputStream fileInputStream = this.f1513c;
        if (i2 < 0) {
            throw A.d();
        }
        int i6 = this.f1519i;
        int i7 = i6 + i4;
        int i8 = i7 + i2;
        int i9 = this.f1520j;
        if (i8 > i9) {
            J((i9 - i6) - i4);
            throw A.e();
        }
        this.f1519i = i7;
        this.f1515e = 0;
        this.f1517g = 0;
        while (i5 < i2) {
            long j2 = i2 - i5;
            try {
                try {
                    long jSkip = fileInputStream.skip(j2);
                    if (jSkip < 0 || jSkip > j2) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i5 += (int) jSkip;
                    }
                } catch (A e2) {
                    e2.f1413e = true;
                    throw e2;
                }
            } catch (Throwable th) {
                this.f1519i += i5;
                H();
                throw th;
            }
        }
        this.f1519i += i5;
        H();
        if (i5 >= i2) {
            return;
        }
        int i10 = this.f1515e;
        int i11 = i10 - this.f1517g;
        this.f1517g = i10;
        I(1);
        while (true) {
            int i12 = i2 - i11;
            int i13 = this.f1515e;
            if (i12 <= i13) {
                this.f1517g = i12;
                return;
            } else {
                i11 += i13;
                this.f1517g = i13;
                I(1);
            }
        }
    }

    public final boolean K(int i2) throws IOException {
        int i3 = this.f1517g;
        int i4 = i3 + i2;
        int i5 = this.f1515e;
        if (i4 <= i5) {
            throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
        }
        int i6 = this.f1519i;
        if (i2 > (Integer.MAX_VALUE - i6) - i3 || i6 + i3 + i2 > this.f1520j) {
            return false;
        }
        byte[] bArr = this.f1514d;
        if (i3 > 0) {
            if (i5 > i3) {
                System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
            }
            this.f1519i += i3;
            this.f1515e -= i3;
            this.f1517g = 0;
        }
        int i7 = this.f1515e;
        int iMin = Math.min(bArr.length - i7, (Integer.MAX_VALUE - this.f1519i) - i7);
        FileInputStream fileInputStream = this.f1513c;
        try {
            int i8 = fileInputStream.read(bArr, i7, iMin);
            if (i8 == 0 || i8 < -1 || i8 > bArr.length) {
                throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i8 + "\nThe InputStream implementation is buggy.");
            }
            if (i8 <= 0) {
                return false;
            }
            this.f1515e += i8;
            H();
            if (this.f1515e >= i2) {
                return true;
            }
            return K(i2);
        } catch (A e2) {
            e2.f1413e = true;
            throw e2;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final void a(int i2) throws A {
        if (this.f1518h != i2) {
            throw new A("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final int b() {
        return this.f1519i + this.f1517g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final boolean c() {
        return this.f1517g == this.f1515e && !K(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final void d(int i2) {
        this.f1520j = i2;
        H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final int e(int i2) throws A {
        if (i2 < 0) {
            throw A.d();
        }
        int i3 = this.f1519i + this.f1517g + i2;
        if (i3 < 0) {
            throw new A("Failed to parse the message.");
        }
        int i4 = this.f1520j;
        if (i3 > i4) {
            throw A.e();
        }
        this.f1520j = i3;
        H();
        return i4;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final boolean f() {
        return F() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final C0075g g() throws IOException {
        int iE = E();
        int i2 = this.f1515e;
        int i3 = this.f1517g;
        int i4 = i2 - i3;
        byte[] bArr = this.f1514d;
        if (iE <= i4 && iE > 0) {
            C0075g c0075gC = C0075g.c(bArr, i3, iE);
            this.f1517g += iE;
            return c0075gC;
        }
        if (iE == 0) {
            return C0075g.f1501g;
        }
        if (iE < 0) {
            throw A.d();
        }
        byte[] bArrA = A(iE);
        if (bArrA != null) {
            return C0075g.c(bArrA, 0, bArrA.length);
        }
        int i5 = this.f1517g;
        int i6 = this.f1515e;
        int length = i6 - i5;
        this.f1519i += i6;
        this.f1517g = 0;
        this.f1515e = 0;
        ArrayList<byte[]> arrayListB = B(iE - length);
        byte[] bArr2 = new byte[iE];
        System.arraycopy(bArr, i5, bArr2, 0, length);
        for (byte[] bArr3 : arrayListB) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0075g c0075g = C0075g.f1501g;
        return new C0075g(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final double h() {
        return Double.longBitsToDouble(D());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final int i() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final int j() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final long k() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final float l() {
        return Float.intBitsToFloat(C());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final int m() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final long n() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final int o() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final long p() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final int q() {
        int iE = E();
        return (-(iE & 1)) ^ (iE >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final long r() {
        long jF = F();
        return (-(jF & 1)) ^ (jF >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final String s() throws A {
        int iE = E();
        byte[] bArr = this.f1514d;
        if (iE > 0) {
            int i2 = this.f1515e;
            int i3 = this.f1517g;
            if (iE <= i2 - i3) {
                String str = new String(bArr, i3, iE, AbstractC0092y.f1577a);
                this.f1517g += iE;
                return str;
            }
        }
        if (iE == 0) {
            return "";
        }
        if (iE < 0) {
            throw A.d();
        }
        if (iE > this.f1515e) {
            return new String(z(iE), AbstractC0092y.f1577a);
        }
        I(iE);
        String str2 = new String(bArr, this.f1517g, iE, AbstractC0092y.f1577a);
        this.f1517g += iE;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final String t() throws IOException {
        int iE = E();
        int i2 = this.f1517g;
        int i3 = this.f1515e;
        int i4 = i3 - i2;
        byte[] bArrZ = this.f1514d;
        if (iE <= i4 && iE > 0) {
            this.f1517g = i2 + iE;
        } else {
            if (iE == 0) {
                return "";
            }
            if (iE < 0) {
                throw A.d();
            }
            i2 = 0;
            if (iE <= i3) {
                I(iE);
                this.f1517g = iE;
            } else {
                bArrZ = z(iE);
            }
        }
        return m0.f1543a.n(bArrZ, i2, iE);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final int u() throws A {
        if (c()) {
            this.f1518h = 0;
            return 0;
        }
        int iE = E();
        this.f1518h = iE;
        if ((iE >>> 3) != 0) {
            return iE;
        }
        throw new A("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final int v() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final long w() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0078j
    public final boolean x(int i2) throws A {
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 != 0) {
            if (i3 == 1) {
                J(8);
                return true;
            }
            if (i3 == 2) {
                J(E());
                return true;
            }
            if (i3 == 3) {
                y();
                a(((i2 >>> 3) << 3) | 4);
                return true;
            }
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw A.b();
            }
            J(4);
            return true;
        }
        int i5 = this.f1515e - this.f1517g;
        byte[] bArr = this.f1514d;
        if (i5 >= 10) {
            while (i4 < 10) {
                int i6 = this.f1517g;
                this.f1517g = i6 + 1;
                if (bArr[i6] < 0) {
                    i4++;
                }
            }
            throw A.c();
        }
        while (i4 < 10) {
            if (this.f1517g == this.f1515e) {
                I(1);
            }
            int i7 = this.f1517g;
            this.f1517g = i7 + 1;
            if (bArr[i7] < 0) {
                i4++;
            }
        }
        throw A.c();
        return true;
    }

    public final byte[] z(int i2) throws IOException {
        byte[] bArrA = A(i2);
        if (bArrA != null) {
            return bArrA;
        }
        int i3 = this.f1517g;
        int i4 = this.f1515e;
        int length = i4 - i3;
        this.f1519i += i4;
        this.f1517g = 0;
        this.f1515e = 0;
        ArrayList<byte[]> arrayListB = B(i2 - length);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f1514d, i3, bArr, 0, length);
        for (byte[] bArr2 : arrayListB) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }
}
