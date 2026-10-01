package p043y0;

import I0.i;
import J0.a;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractList implements List, a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object[] f3478h = new Object[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object[] f3480f = f3478h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3481g;

    public final void a(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f3480f.length;
        while (i2 < length && it.hasNext()) {
            this.f3480f[i2] = it.next();
            i2++;
        }
        int i3 = this.f3479e;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f3480f[i4] = it.next();
        }
        this.f3481g = collection.size() + this.f3481g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int length;
        int i3 = this.f3481g;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (i2 == i3) {
            addLast(obj);
            return;
        }
        if (i2 == 0) {
            addFirst(obj);
            return;
        }
        b(i3 + 1);
        int iD = d(this.f3479e + i2);
        int i4 = this.f3481g;
        if (i2 < ((i4 + 1) >> 1)) {
            if (iD == 0) {
                Object[] objArr = this.f3480f;
                i.e(objArr, "<this>");
                iD = objArr.length;
            }
            int i5 = iD - 1;
            int i6 = this.f3479e;
            if (i6 == 0) {
                Object[] objArr2 = this.f3480f;
                i.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i6 - 1;
            }
            int i7 = this.f3479e;
            if (i5 >= i7) {
                Object[] objArr3 = this.f3480f;
                objArr3[length] = objArr3[i7];
                c.S(objArr3, objArr3, i7, i7 + 1, i5 + 1);
            } else {
                Object[] objArr4 = this.f3480f;
                c.S(objArr4, objArr4, i7 - 1, i7, objArr4.length);
                Object[] objArr5 = this.f3480f;
                objArr5[objArr5.length - 1] = objArr5[0];
                c.S(objArr5, objArr5, 0, 1, i5 + 1);
            }
            this.f3480f[i5] = obj;
            this.f3479e = length;
        } else {
            int iD2 = d(this.f3479e + i4);
            if (iD < iD2) {
                Object[] objArr6 = this.f3480f;
                c.S(objArr6, objArr6, iD + 1, iD, iD2);
            } else {
                Object[] objArr7 = this.f3480f;
                c.S(objArr7, objArr7, 1, 0, iD2);
                Object[] objArr8 = this.f3480f;
                objArr8[0] = objArr8[objArr8.length - 1];
                c.S(objArr8, objArr8, iD + 1, iD, objArr8.length - 1);
            }
            this.f3480f[iD] = obj;
        }
        this.f3481g++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        i.e(collection, "elements");
        int i3 = this.f3481g;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i4 = this.f3481g;
        if (i2 == i4) {
            return addAll(collection);
        }
        b(collection.size() + i4);
        int iD = d(this.f3479e + this.f3481g);
        int iD2 = d(this.f3479e + i2);
        int size = collection.size();
        if (i2 < ((this.f3481g + 1) >> 1)) {
            int i5 = this.f3479e;
            int length = i5 - size;
            if (iD2 < i5) {
                Object[] objArr = this.f3480f;
                c.S(objArr, objArr, length, i5, objArr.length);
                if (size >= iD2) {
                    Object[] objArr2 = this.f3480f;
                    c.S(objArr2, objArr2, objArr2.length - size, 0, iD2);
                } else {
                    Object[] objArr3 = this.f3480f;
                    c.S(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f3480f;
                    c.S(objArr4, objArr4, 0, size, iD2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f3480f;
                c.S(objArr5, objArr5, length, i5, iD2);
            } else {
                Object[] objArr6 = this.f3480f;
                length += objArr6.length;
                int i6 = iD2 - i5;
                int length2 = objArr6.length - length;
                if (length2 >= i6) {
                    c.S(objArr6, objArr6, length, i5, iD2);
                } else {
                    c.S(objArr6, objArr6, length, i5, i5 + length2);
                    Object[] objArr7 = this.f3480f;
                    c.S(objArr7, objArr7, 0, this.f3479e + length2, iD2);
                }
            }
            this.f3479e = length;
            int length3 = iD2 - size;
            if (length3 < 0) {
                length3 += this.f3480f.length;
            }
            a(length3, collection);
        } else {
            int i7 = iD2 + size;
            if (iD2 < iD) {
                int i8 = size + iD;
                Object[] objArr8 = this.f3480f;
                if (i8 <= objArr8.length) {
                    c.S(objArr8, objArr8, i7, iD2, iD);
                } else if (i7 >= objArr8.length) {
                    c.S(objArr8, objArr8, i7 - objArr8.length, iD2, iD);
                } else {
                    int length4 = iD - (i8 - objArr8.length);
                    c.S(objArr8, objArr8, 0, length4, iD);
                    Object[] objArr9 = this.f3480f;
                    c.S(objArr9, objArr9, i7, iD2, length4);
                }
            } else {
                Object[] objArr10 = this.f3480f;
                c.S(objArr10, objArr10, size, 0, iD);
                Object[] objArr11 = this.f3480f;
                if (i7 >= objArr11.length) {
                    c.S(objArr11, objArr11, i7 - objArr11.length, iD2, objArr11.length);
                } else {
                    c.S(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f3480f;
                    c.S(objArr12, objArr12, i7, iD2, objArr12.length - size);
                }
            }
            a(iD2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        b(this.f3481g + 1);
        int length = this.f3479e;
        if (length == 0) {
            Object[] objArr = this.f3480f;
            i.e(objArr, "<this>");
            length = objArr.length;
        }
        int i2 = length - 1;
        this.f3479e = i2;
        this.f3480f[i2] = obj;
        this.f3481g++;
    }

    public final void addLast(Object obj) {
        b(this.f3481g + 1);
        this.f3480f[d(this.f3479e + this.f3481g)] = obj;
        this.f3481g++;
    }

    public final void b(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f3480f;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f3478h) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f3480f = new Object[i2];
            return;
        }
        int length = objArr.length;
        int i3 = length + (length >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if (i3 - 2147483639 > 0) {
            i3 = i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i3];
        c.S(objArr, objArr2, 0, this.f3479e, objArr.length);
        Object[] objArr3 = this.f3480f;
        int length2 = objArr3.length;
        int i4 = this.f3479e;
        c.S(objArr3, objArr2, length2 - i4, 0, i4);
        this.f3479e = 0;
        this.f3480f = objArr2;
    }

    public final int c(int i2) {
        Object[] objArr = this.f3480f;
        i.e(objArr, "<this>");
        if (i2 == objArr.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iD = d(this.f3479e + this.f3481g);
        int i2 = this.f3479e;
        if (i2 < iD) {
            Object[] objArr = this.f3480f;
            i.e(objArr, "<this>");
            Arrays.fill(objArr, i2, iD, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f3480f;
            Arrays.fill(objArr2, this.f3479e, objArr2.length, (Object) null);
            Object[] objArr3 = this.f3480f;
            i.e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, iD, (Object) null);
        }
        this.f3479e = 0;
        this.f3481g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i2) {
        Object[] objArr = this.f3480f;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int i3 = this.f3481g;
        if (i2 >= 0 && i2 < i3) {
            return this.f3480f[d(this.f3479e + i2)];
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int iD = d(this.f3479e + this.f3481g);
        int length = this.f3479e;
        if (length < iD) {
            while (length < iD) {
                if (i.a(obj, this.f3480f[length])) {
                    i2 = this.f3479e;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iD) {
            return -1;
        }
        int length2 = this.f3480f.length;
        while (length < length2) {
            if (i.a(obj, this.f3480f[length])) {
                i2 = this.f3479e;
            } else {
                length++;
            }
        }
        for (int i3 = 0; i3 < iD; i3++) {
            if (i.a(obj, this.f3480f[i3])) {
                length = i3 + this.f3480f.length;
                i2 = this.f3479e;
            }
        }
        return -1;
        return length - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f3481g == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int iD = d(this.f3479e + this.f3481g);
        int i3 = this.f3479e;
        if (i3 < iD) {
            length = iD - 1;
            if (i3 <= length) {
                while (!i.a(obj, this.f3480f[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f3479e;
                return length - i2;
            }
            return -1;
        }
        if (i3 > iD) {
            for (int i4 = iD - 1; -1 < i4; i4--) {
                if (i.a(obj, this.f3480f[i4])) {
                    length = i4 + this.f3480f.length;
                    i2 = this.f3479e;
                    return length - i2;
                }
            }
            Object[] objArr = this.f3480f;
            i.e(objArr, "<this>");
            length = objArr.length - 1;
            int i5 = this.f3479e;
            if (i5 <= length) {
                while (!i.a(obj, this.f3480f[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i2 = this.f3479e;
                return length - i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        int i3 = this.f3481g;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (i2 == size() - 1) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        int iD = d(this.f3479e + i2);
        Object[] objArr = this.f3480f;
        Object obj = objArr[iD];
        if (i2 < (this.f3481g >> 1)) {
            int i4 = this.f3479e;
            if (iD >= i4) {
                c.S(objArr, objArr, i4 + 1, i4, iD);
            } else {
                c.S(objArr, objArr, 1, 0, iD);
                Object[] objArr2 = this.f3480f;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f3479e;
                c.S(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.f3480f;
            int i6 = this.f3479e;
            objArr3[i6] = null;
            this.f3479e = c(i6);
        } else {
            int iD2 = d((size() - 1) + this.f3479e);
            if (iD <= iD2) {
                Object[] objArr4 = this.f3480f;
                c.S(objArr4, objArr4, iD, iD + 1, iD2 + 1);
            } else {
                Object[] objArr5 = this.f3480f;
                c.S(objArr5, objArr5, iD, iD + 1, objArr5.length);
                Object[] objArr6 = this.f3480f;
                objArr6[objArr6.length - 1] = objArr6[0];
                c.S(objArr6, objArr6, 0, 1, iD2 + 1);
            }
            this.f3480f[iD2] = null;
        }
        this.f3481g--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iD;
        i.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f3480f.length != 0) {
            int iD2 = d(this.f3479e + this.f3481g);
            int i2 = this.f3479e;
            if (i2 < iD2) {
                iD = i2;
                while (i2 < iD2) {
                    Object obj = this.f3480f[i2];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f3480f[iD] = obj;
                        iD++;
                    }
                    i2++;
                }
                Object[] objArr = this.f3480f;
                i.e(objArr, "<this>");
                Arrays.fill(objArr, iD, iD2, (Object) null);
            } else {
                int length = this.f3480f.length;
                int i3 = i2;
                boolean z3 = false;
                while (i2 < length) {
                    Object[] objArr2 = this.f3480f;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f3480f[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                iD = d(i3);
                for (int i4 = 0; i4 < iD2; i4++) {
                    Object[] objArr3 = this.f3480f;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f3480f[iD] = obj3;
                        iD = c(iD);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int length2 = iD - this.f3479e;
                if (length2 < 0) {
                    length2 += this.f3480f.length;
                }
                this.f3481g = length2;
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f3480f;
        int i2 = this.f3479e;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f3479e = c(i2);
        this.f3481g--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iD = d((size() - 1) + this.f3479e);
        Object[] objArr = this.f3480f;
        Object obj = objArr[iD];
        objArr[iD] = null;
        this.f3481g--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iD;
        i.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f3480f.length != 0) {
            int iD2 = d(this.f3479e + this.f3481g);
            int i2 = this.f3479e;
            if (i2 < iD2) {
                iD = i2;
                while (i2 < iD2) {
                    Object obj = this.f3480f[i2];
                    if (collection.contains(obj)) {
                        this.f3480f[iD] = obj;
                        iD++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                Object[] objArr = this.f3480f;
                i.e(objArr, "<this>");
                Arrays.fill(objArr, iD, iD2, (Object) null);
            } else {
                int length = this.f3480f.length;
                int i3 = i2;
                boolean z3 = false;
                while (i2 < length) {
                    Object[] objArr2 = this.f3480f;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        this.f3480f[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                iD = d(i3);
                for (int i4 = 0; i4 < iD2; i4++) {
                    Object[] objArr3 = this.f3480f;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        this.f3480f[iD] = obj3;
                        iD = c(iD);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int length2 = iD - this.f3479e;
                if (length2 < 0) {
                    length2 += this.f3480f.length;
                }
                this.f3481g = length2;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int i3 = this.f3481g;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        int iD = d(this.f3479e + i2);
        Object[] objArr = this.f3480f;
        Object obj2 = objArr[iD];
        objArr[iD] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3481g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f3481g]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        i.e(objArr, "array");
        int length = objArr.length;
        int i2 = this.f3481g;
        if (length < i2) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            i.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iD = d(this.f3479e + this.f3481g);
        int i3 = this.f3479e;
        if (i3 < iD) {
            c.S(this.f3480f, objArr, 0, i3, iD);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f3480f;
            c.S(objArr2, objArr, 0, this.f3479e, objArr2.length);
            Object[] objArr3 = this.f3480f;
            c.S(objArr3, objArr, objArr3.length - this.f3479e, 0, iD);
        }
        int i4 = this.f3481g;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        b(collection.size() + this.f3481g);
        a(d(this.f3479e + this.f3481g), collection);
        return true;
    }
}
