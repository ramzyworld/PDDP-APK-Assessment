package M0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, J0.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f419h;

    public b(int i2, int i3, int i4) {
        this.f416e = i4;
        this.f417f = i3;
        boolean z2 = false;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            z2 = true;
        }
        this.f418g = z2;
        this.f419h = z2 ? i2 : i3;
    }

    public final int a() {
        int i2 = this.f419h;
        if (i2 != this.f417f) {
            this.f419h = this.f416e + i2;
        } else {
            if (!this.f418g) {
                throw new NoSuchElementException();
            }
            this.f418g = false;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f418g;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
