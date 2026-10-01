package p022m;

import G.C0013n;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Iterator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2846h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0013n f2847i;

    public e(C0013n c0013n, int i2) {
        this.f2847i = c0013n;
        this.f2843e = i2;
        this.f2844f = ((a) c0013n.f261d).f2861g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2845g < this.f2844f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = this.f2847i.a(this.f2845g, this.f2843e);
        this.f2845g++;
        this.f2846h = true;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2846h) {
            throw new IllegalStateException();
        }
        int i2 = this.f2845g - 1;
        this.f2845g = i2;
        this.f2844f--;
        this.f2846h = false;
        this.f2847i.b(i2);
    }
}
