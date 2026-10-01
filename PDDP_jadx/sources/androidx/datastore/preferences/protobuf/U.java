package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class U extends AbstractC0070b implements RandomAccess {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final U f1462h = new U(new Object[0], 0, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object[] f1463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1464g;

    public U(Object[] objArr, int i2, boolean z2) {
        this.f1485e = z2;
        this.f1463f = objArr;
        this.f1464g = i2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i2 = this.f1464g;
        Object[] objArr = this.f1463f;
        if (i2 == objArr.length) {
            this.f1463f = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f1463f;
        int i3 = this.f1464g;
        this.f1464g = i3 + 1;
        objArr2[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i2) {
        if (i2 < 0 || i2 >= this.f1464g) {
            throw new IndexOutOfBoundsException("Index:" + i2 + ", Size:" + this.f1464g);
        }
    }

    public final U c(int i2) {
        if (i2 >= this.f1464g) {
            return new U(Arrays.copyOf(this.f1463f, i2), this.f1464g, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        b(i2);
        return this.f1463f[i2];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0070b, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        b(i2);
        Object[] objArr = this.f1463f;
        Object obj = objArr[i2];
        int i3 = this.f1464g;
        if (i2 < i3 - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (i3 - i2) - 1);
        }
        this.f1464g--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        a();
        b(i2);
        Object[] objArr = this.f1463f;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1464g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f1464g)) {
            Object[] objArr = this.f1463f;
            if (i3 < objArr.length) {
                System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
            } else {
                Object[] objArr2 = new Object[((i3 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i2);
                System.arraycopy(this.f1463f, i2, objArr2, i2 + 1, this.f1464g - i2);
                this.f1463f = objArr2;
            }
            this.f1463f[i2] = obj;
            this.f1464g++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + i2 + ", Size:" + this.f1464g);
    }
}
