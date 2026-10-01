package p022m;

import G.C0013n;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2850e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0013n f2853h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2852g = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2851f = -1;

    public g(C0013n c0013n) {
        this.f2853h = c0013n;
        this.f2850e = ((a) c0013n.f261d).f2861g - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f2852g) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f2851f;
        C0013n c0013n = this.f2853h;
        Object objA = c0013n.a(i2, 0);
        if (key != objA && (key == null || !key.equals(objA))) {
            return false;
        }
        Object value = entry.getValue();
        Object objA2 = c0013n.a(this.f2851f, 1);
        return value == objA2 || (value != null && value.equals(objA2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f2852g) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f2853h.a(this.f2851f, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f2852g) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f2853h.a(this.f2851f, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2851f < this.f2850e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f2852g) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f2851f;
        C0013n c0013n = this.f2853h;
        Object objA = c0013n.a(i2, 0);
        Object objA2 = c0013n.a(this.f2851f, 1);
        return (objA == null ? 0 : objA.hashCode()) ^ (objA2 != null ? objA2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f2851f++;
        this.f2852g = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2852g) {
            throw new IllegalStateException();
        }
        this.f2853h.b(this.f2851f);
        this.f2851f--;
        this.f2850e--;
        this.f2852g = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f2852g) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = (this.f2851f << 1) + 1;
        Object[] objArr = ((a) this.f2853h.f261d).f2860f;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
