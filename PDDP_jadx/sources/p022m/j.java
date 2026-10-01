package p022m;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f2862h = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f2863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object[] f2864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2865g;

    public j() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f2863e = new int[i5];
        this.f2864f = new Object[i5];
    }

    public final void a(int i2, Object obj) {
        int i3 = this.f2865g;
        if (i3 != 0 && i2 <= this.f2863e[i3 - 1]) {
            d(i2, obj);
            return;
        }
        if (i3 >= this.f2863e.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr = new Object[i7];
            int[] iArr2 = this.f2863e;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f2864f;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2863e = iArr;
            this.f2864f = objArr;
        }
        this.f2863e[i3] = i2;
        this.f2864f[i3] = obj;
        this.f2865g = i3 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j clone() {
        try {
            j jVar = (j) super.clone();
            jVar.f2863e = (int[]) this.f2863e.clone();
            jVar.f2864f = (Object[]) this.f2864f.clone();
            return jVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final Object c(int i2, Integer num) {
        Object obj;
        int iA = b.a(this.f2865g, i2, this.f2863e);
        return (iA < 0 || (obj = this.f2864f[iA]) == f2862h) ? num : obj;
    }

    public final void d(int i2, Object obj) {
        int iA = b.a(this.f2865g, i2, this.f2863e);
        if (iA >= 0) {
            this.f2864f[iA] = obj;
            return;
        }
        int i3 = ~iA;
        int i4 = this.f2865g;
        if (i3 < i4) {
            Object[] objArr = this.f2864f;
            if (objArr[i3] == f2862h) {
                this.f2863e[i3] = i2;
                objArr[i3] = obj;
                return;
            }
        }
        if (i4 >= this.f2863e.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.f2863e;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2864f;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2863e = iArr;
            this.f2864f = objArr2;
        }
        int i9 = this.f2865g - i3;
        if (i9 != 0) {
            int[] iArr3 = this.f2863e;
            int i10 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i10, i9);
            Object[] objArr4 = this.f2864f;
            System.arraycopy(objArr4, i3, objArr4, i10, this.f2865g - i3);
        }
        this.f2863e[i3] = i2;
        this.f2864f[i3] = obj;
        this.f2865g++;
    }

    public final String toString() {
        int i2 = this.f2865g;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f2865g; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f2863e[i3]);
            sb.append('=');
            Object obj = this.f2864f[i3];
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
