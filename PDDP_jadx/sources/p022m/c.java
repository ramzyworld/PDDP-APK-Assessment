package p022m;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Cloneable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f2833i = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2834e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long[] f2835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f2836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2837h;

    public c() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 80;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (80 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f2835f = new long[i5];
        this.f2836g = new Object[i5];
    }

    public final void a(long j2, Long l2) {
        int i2 = this.f2837h;
        if (i2 != 0 && j2 <= this.f2835f[i2 - 1]) {
            e(j2, l2);
            return;
        }
        if (this.f2834e && i2 >= this.f2835f.length) {
            c();
        }
        int i3 = this.f2837h;
        if (i3 >= this.f2835f.length) {
            int i4 = (i3 + 1) * 8;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr = new Object[i7];
            long[] jArr2 = this.f2835f;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f2836g;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2835f = jArr;
            this.f2836g = objArr;
        }
        this.f2835f[i3] = j2;
        this.f2836g[i3] = l2;
        this.f2837h = i3 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f2835f = (long[]) this.f2835f.clone();
            cVar.f2836g = (Object[]) this.f2836g.clone();
            return cVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void c() {
        int i2 = this.f2837h;
        long[] jArr = this.f2835f;
        Object[] objArr = this.f2836g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f2833i) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f2834e = false;
        this.f2837h = i3;
    }

    public final Object d(long j2, Long l2) {
        Object obj;
        int iB = b.b(this.f2835f, this.f2837h, j2);
        return (iB < 0 || (obj = this.f2836g[iB]) == f2833i) ? l2 : obj;
    }

    public final void e(long j2, Object obj) {
        int iB = b.b(this.f2835f, this.f2837h, j2);
        if (iB >= 0) {
            this.f2836g[iB] = obj;
            return;
        }
        int i2 = ~iB;
        int i3 = this.f2837h;
        if (i2 < i3) {
            Object[] objArr = this.f2836g;
            if (objArr[i2] == f2833i) {
                this.f2835f[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f2834e && i3 >= this.f2835f.length) {
            c();
            i2 = ~b.b(this.f2835f, this.f2837h, j2);
        }
        int i4 = this.f2837h;
        if (i4 >= this.f2835f.length) {
            int i5 = (i4 + 1) * 8;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 8;
            long[] jArr = new long[i8];
            Object[] objArr2 = new Object[i8];
            long[] jArr2 = this.f2835f;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2836g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2835f = jArr;
            this.f2836g = objArr2;
        }
        int i9 = this.f2837h - i2;
        if (i9 != 0) {
            long[] jArr3 = this.f2835f;
            int i10 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i10, i9);
            Object[] objArr4 = this.f2836g;
            System.arraycopy(objArr4, i2, objArr4, i10, this.f2837h - i2);
        }
        this.f2835f[i2] = j2;
        this.f2836g[i2] = obj;
        this.f2837h++;
    }

    public final String toString() {
        if (this.f2834e) {
            c();
        }
        int i2 = this.f2837h;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f2837h; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            if (this.f2834e) {
                c();
            }
            sb.append(this.f2835f[i3]);
            sb.append('=');
            if (this.f2834e) {
                c();
            }
            Object obj = this.f2836g[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
