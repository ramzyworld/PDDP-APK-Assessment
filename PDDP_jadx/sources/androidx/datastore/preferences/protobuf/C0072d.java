package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0072d implements Iterator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1489e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0075g f1491g;

    public C0072d(C0075g c0075g) {
        this.f1491g = c0075g;
        this.f1490f = c0075g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1489e < this.f1490f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f1489e;
        if (i2 >= this.f1490f) {
            throw new NoSuchElementException();
        }
        this.f1489e = i2 + 1;
        return Byte.valueOf(this.f1491g.f(i2));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
