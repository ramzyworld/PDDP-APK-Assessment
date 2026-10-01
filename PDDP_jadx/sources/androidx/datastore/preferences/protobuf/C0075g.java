package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0075g implements Iterable, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0075g f1501g = new C0075g(AbstractC0092y.f1578b);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0073e f1502h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1503e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f1504f;

    static {
        f1502h = AbstractC0071c.a() ? new C0073e(1) : new C0073e(0);
    }

    public C0075g(byte[] bArr) {
        bArr.getClass();
        this.f1504f = bArr;
    }

    public static int b(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        }
        throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
    }

    public static C0075g c(byte[] bArr, int i2, int i3) {
        byte[] bArrCopyOfRange;
        b(i2, i2 + i3, bArr.length);
        switch (f1502h.f1498a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i3 + i2);
                break;
            default:
                bArrCopyOfRange = new byte[i3];
                System.arraycopy(bArr, i2, bArrCopyOfRange, 0, i3);
                break;
        }
        return new C0075g(bArrCopyOfRange);
    }

    public byte a(int i2) {
        return this.f1504f[i2];
    }

    public void d(byte[] bArr, int i2) {
        System.arraycopy(this.f1504f, 0, bArr, 0, i2);
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0075g) || size() != ((C0075g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0075g)) {
            return obj.equals(this);
        }
        C0075g c0075g = (C0075g) obj;
        int i2 = this.f1503e;
        int i3 = c0075g.f1503e;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        int size = size();
        if (size > c0075g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0075g.size()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + c0075g.size());
        }
        int iE = e() + size;
        int iE2 = e();
        int iE3 = c0075g.e();
        while (iE2 < iE) {
            if (this.f1504f[iE2] != c0075g.f1504f[iE3]) {
                return false;
            }
            iE2++;
            iE3++;
        }
        return true;
    }

    public byte f(int i2) {
        return this.f1504f[i2];
    }

    public final int hashCode() {
        int i2 = this.f1503e;
        if (i2 == 0) {
            int size = size();
            int iE = e();
            int i3 = size;
            for (int i4 = iE; i4 < iE + size; i4++) {
                i3 = (i3 * 31) + this.f1504f[i4];
            }
            i2 = i3 == 0 ? 1 : i3;
            this.f1503e = i2;
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0072d(this);
    }

    public int size() {
        return this.f1504f.length;
    }

    public final String toString() {
        C0075g c0074f;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = p000a.a.q(this);
        } else {
            StringBuilder sb = new StringBuilder();
            int iB = b(0, 47, size());
            if (iB == 0) {
                c0074f = f1501g;
            } else {
                c0074f = new C0074f(this.f1504f, e(), iB);
            }
            sb.append(p000a.a.q(c0074f));
            sb.append("...");
            string = sb.toString();
        }
        return "<ByteString@" + hexString + " size=" + size + " contents=\"" + string + "\">";
    }
}
