package I0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator, J0.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object[] f317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f318f;

    public a(Object[] objArr) {
        this.f317e = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f318f < this.f317e.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f317e;
            int i2 = this.f318f;
            this.f318f = i2 + 1;
            return objArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f318f--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
