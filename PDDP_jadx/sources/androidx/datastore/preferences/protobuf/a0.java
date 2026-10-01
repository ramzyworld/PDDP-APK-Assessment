package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Iterator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1481e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Iterator f1483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y f1484h;

    public a0(Y y2) {
        this.f1484h = y2;
    }

    public final Iterator a() {
        if (this.f1483g == null) {
            this.f1483g = this.f1484h.f1474f.entrySet().iterator();
        }
        return this.f1483g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f1481e + 1;
        Y y2 = this.f1484h;
        if (i2 >= y2.f1473e.size()) {
            return !y2.f1474f.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f1482f = true;
        int i2 = this.f1481e + 1;
        this.f1481e = i2;
        Y y2 = this.f1484h;
        return i2 < y2.f1473e.size() ? (Map.Entry) y2.f1473e.get(this.f1481e) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1482f) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f1482f = false;
        int i2 = Y.f1472j;
        Y y2 = this.f1484h;
        y2.b();
        if (this.f1481e >= y2.f1473e.size()) {
            a().remove();
            return;
        }
        int i3 = this.f1481e;
        this.f1481e = i3 - 1;
        y2.h(i3);
    }
}
