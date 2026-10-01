package p022m;

import G.C0013n;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Collection {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0013n f2854e;

    public h(C0013n c0013n) {
        this.f2854e = c0013n;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        ((a) this.f2854e.f261d).clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return ((a) this.f2854e.f261d).f(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return ((a) this.f2854e.f261d).f2861g == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new e(this.f2854e, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0013n c0013n = this.f2854e;
        int iF = ((a) c0013n.f261d).f(obj);
        if (iF < 0) {
            return false;
        }
        c0013n.b(iF);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0013n c0013n = this.f2854e;
        int i2 = ((a) c0013n.f261d).f2861g;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            if (collection.contains(c0013n.a(i3, 1))) {
                c0013n.b(i3);
                i3--;
                i2--;
                z2 = true;
            }
            i3++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0013n c0013n = this.f2854e;
        int i2 = ((a) c0013n.f261d).f2861g;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            if (!collection.contains(c0013n.a(i3, 1))) {
                c0013n.b(i3);
                i3--;
                i2--;
                z2 = true;
            }
            i3++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return ((a) this.f2854e.f261d).f2861g;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0013n c0013n = this.f2854e;
        int i2 = ((a) c0013n.f261d).f2861g;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = c0013n.a(i3, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f2854e.h(1, objArr);
    }
}
