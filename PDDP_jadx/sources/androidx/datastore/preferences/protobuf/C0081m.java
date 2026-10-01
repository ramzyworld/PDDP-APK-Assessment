package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0081m extends a1.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Logger f1536r = Logger.getLogger(C0081m.class.getName());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f1537s = j0.f1528e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public F f1538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f1539n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1540o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1541p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final G.o0 f1542q;

    public C0081m(G.o0 o0Var, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i2, 20);
        this.f1539n = new byte[iMax];
        this.f1540o = iMax;
        this.f1542q = o0Var;
    }

    public static int U(int i2) {
        return k0(i2) + 1;
    }

    public static int V(int i2, C0075g c0075g) {
        int iK0 = k0(i2);
        int size = c0075g.size();
        return m0(size) + size + iK0;
    }

    public static int W(int i2) {
        return k0(i2) + 8;
    }

    public static int X(int i2, int i3) {
        return o0(i3) + k0(i2);
    }

    public static int Y(int i2) {
        return k0(i2) + 4;
    }

    public static int Z(int i2) {
        return k0(i2) + 8;
    }

    public static int a0(int i2) {
        return k0(i2) + 4;
    }

    public static int b0(int i2, AbstractC0069a abstractC0069a, W w2) {
        return abstractC0069a.a(w2) + (k0(i2) * 2);
    }

    public static int c0(int i2, int i3) {
        return o0(i3) + k0(i2);
    }

    public static int d0(long j2, int i2) {
        return o0(j2) + k0(i2);
    }

    public static int e0(int i2) {
        return k0(i2) + 4;
    }

    public static int f0(int i2) {
        return k0(i2) + 8;
    }

    public static int g0(int i2, int i3) {
        return m0((i3 >> 31) ^ (i3 << 1)) + k0(i2);
    }

    public static int h0(long j2, int i2) {
        return o0((j2 >> 63) ^ (j2 << 1)) + k0(i2);
    }

    public static int i0(String str, int i2) {
        return j0(str) + k0(i2);
    }

    public static int j0(String str) {
        int length;
        try {
            length = m0.a(str);
        } catch (l0 unused) {
            length = str.getBytes(AbstractC0092y.f1577a).length;
        }
        return m0(length) + length;
    }

    public static int k0(int i2) {
        return m0(i2 << 3);
    }

    public static int l0(int i2, int i3) {
        return m0(i3) + k0(i2);
    }

    public static int m0(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int n0(long j2, int i2) {
        return o0(j2) + k0(i2);
    }

    public static int o0(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public final void A0(int i2, int i3) {
        q0(20);
        R(i2, 0);
        if (i3 >= 0) {
            S(i3);
        } else {
            T(i3);
        }
    }

    public final void B0(int i2) throws IOException {
        if (i2 >= 0) {
            G0(i2);
        } else {
            I0(i2);
        }
    }

    public final void C0(String str, int i2) throws IOException {
        E0(i2, 2);
        D0(str);
    }

    public final void D0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iM0 = m0(length);
            int i2 = iM0 + length;
            int i3 = this.f1540o;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int iP = m0.f1543a.p(str, bArr, 0, length);
                G0(iP);
                s0(bArr, 0, iP);
                return;
            }
            if (i2 > i3 - this.f1541p) {
                p0();
            }
            int iM1 = m0(str.length());
            int i4 = this.f1541p;
            byte[] bArr2 = this.f1539n;
            try {
                try {
                    if (iM1 == iM0) {
                        int i5 = i4 + iM1;
                        this.f1541p = i5;
                        int iP2 = m0.f1543a.p(str, bArr2, i5, i3 - i5);
                        this.f1541p = i4;
                        S((iP2 - i4) - iM1);
                        this.f1541p = iP2;
                    } else {
                        int iA = m0.a(str);
                        S(iA);
                        this.f1541p = m0.f1543a.p(str, bArr2, this.f1541p, iA);
                    }
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new C0080l(e2);
                }
            } catch (l0 e3) {
                this.f1541p = i4;
                throw e3;
            }
        } catch (l0 e4) {
            f1536r.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
            byte[] bytes = str.getBytes(AbstractC0092y.f1577a);
            try {
                G0(bytes.length);
                O(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e5) {
                throw new C0080l(e5);
            }
        }
    }

    public final void E0(int i2, int i3) {
        G0((i2 << 3) | i3);
    }

    public final void F0(int i2, int i3) {
        q0(20);
        R(i2, 0);
        S(i3);
    }

    public final void G0(int i2) {
        q0(5);
        S(i2);
    }

    public final void H0(long j2, int i2) {
        q0(20);
        R(i2, 0);
        T(j2);
    }

    public final void I0(long j2) throws IOException {
        q0(10);
        T(j2);
    }

    @Override // a1.a
    public final void O(byte[] bArr, int i2, int i3) throws IOException {
        s0(bArr, i2, i3);
    }

    public final void P(int i2) {
        int i3 = this.f1541p;
        int i4 = i3 + 1;
        this.f1541p = i4;
        byte[] bArr = this.f1539n;
        bArr[i3] = (byte) (i2 & 255);
        int i5 = i3 + 2;
        this.f1541p = i5;
        bArr[i4] = (byte) ((i2 >> 8) & 255);
        int i6 = i3 + 3;
        this.f1541p = i6;
        bArr[i5] = (byte) ((i2 >> 16) & 255);
        this.f1541p = i3 + 4;
        bArr[i6] = (byte) ((i2 >> 24) & 255);
    }

    public final void Q(long j2) {
        int i2 = this.f1541p;
        int i3 = i2 + 1;
        this.f1541p = i3;
        byte[] bArr = this.f1539n;
        bArr[i2] = (byte) (j2 & 255);
        int i4 = i2 + 2;
        this.f1541p = i4;
        bArr[i3] = (byte) ((j2 >> 8) & 255);
        int i5 = i2 + 3;
        this.f1541p = i5;
        bArr[i4] = (byte) ((j2 >> 16) & 255);
        int i6 = i2 + 4;
        this.f1541p = i6;
        bArr[i5] = (byte) (255 & (j2 >> 24));
        int i7 = i2 + 5;
        this.f1541p = i7;
        bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
        int i8 = i2 + 6;
        this.f1541p = i8;
        bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
        int i9 = i2 + 7;
        this.f1541p = i9;
        bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
        this.f1541p = i2 + 8;
        bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
    }

    public final void R(int i2, int i3) {
        S((i2 << 3) | i3);
    }

    public final void S(int i2) {
        boolean z2 = f1537s;
        byte[] bArr = this.f1539n;
        if (z2) {
            while ((i2 & (-128)) != 0) {
                int i3 = this.f1541p;
                this.f1541p = i3 + 1;
                j0.j(bArr, i3, (byte) ((i2 | 128) & 255));
                i2 >>>= 7;
            }
            int i4 = this.f1541p;
            this.f1541p = i4 + 1;
            j0.j(bArr, i4, (byte) i2);
            return;
        }
        while ((i2 & (-128)) != 0) {
            int i5 = this.f1541p;
            this.f1541p = i5 + 1;
            bArr[i5] = (byte) ((i2 | 128) & 255);
            i2 >>>= 7;
        }
        int i6 = this.f1541p;
        this.f1541p = i6 + 1;
        bArr[i6] = (byte) i2;
    }

    public final void T(long j2) {
        boolean z2 = f1537s;
        byte[] bArr = this.f1539n;
        if (z2) {
            while ((j2 & (-128)) != 0) {
                int i2 = this.f1541p;
                this.f1541p = i2 + 1;
                j0.j(bArr, i2, (byte) ((((int) j2) | 128) & 255));
                j2 >>>= 7;
            }
            int i3 = this.f1541p;
            this.f1541p = i3 + 1;
            j0.j(bArr, i3, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            int i4 = this.f1541p;
            this.f1541p = i4 + 1;
            bArr[i4] = (byte) ((((int) j2) | 128) & 255);
            j2 >>>= 7;
        }
        int i5 = this.f1541p;
        this.f1541p = i5 + 1;
        bArr[i5] = (byte) j2;
    }

    public final void p0() throws IOException {
        this.f1542q.write(this.f1539n, 0, this.f1541p);
        this.f1541p = 0;
    }

    public final void q0(int i2) throws IOException {
        if (this.f1540o - this.f1541p < i2) {
            p0();
        }
    }

    public final void r0(byte b2) throws IOException {
        if (this.f1541p == this.f1540o) {
            p0();
        }
        int i2 = this.f1541p;
        this.f1541p = i2 + 1;
        this.f1539n[i2] = b2;
    }

    public final void s0(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f1541p;
        int i5 = this.f1540o;
        int i6 = i5 - i4;
        byte[] bArr2 = this.f1539n;
        if (i6 >= i3) {
            System.arraycopy(bArr, i2, bArr2, i4, i3);
            this.f1541p += i3;
            return;
        }
        System.arraycopy(bArr, i2, bArr2, i4, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f1541p = i5;
        p0();
        if (i8 > i5) {
            this.f1542q.write(bArr, i7, i8);
        } else {
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            this.f1541p = i8;
        }
    }

    public final void t0(int i2, boolean z2) {
        q0(11);
        R(i2, 0);
        byte b2 = z2 ? (byte) 1 : (byte) 0;
        int i3 = this.f1541p;
        this.f1541p = i3 + 1;
        this.f1539n[i3] = b2;
    }

    public final void u0(int i2, C0075g c0075g) {
        E0(i2, 2);
        v0(c0075g);
    }

    public final void v0(C0075g c0075g) {
        G0(c0075g.size());
        O(c0075g.f1504f, c0075g.e(), c0075g.size());
    }

    public final void w0(int i2, int i3) {
        q0(14);
        R(i2, 5);
        P(i3);
    }

    public final void x0(int i2) throws IOException {
        q0(4);
        P(i2);
    }

    public final void y0(long j2, int i2) {
        q0(18);
        R(i2, 1);
        Q(j2);
    }

    public final void z0(long j2) throws IOException {
        q0(8);
        Q(j2);
    }
}
