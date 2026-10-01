package p022m;

import G.C0013n;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements Map {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0013n f2830l;

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f2830l == null) {
            this.f2830l = new C0013n(this);
        }
        C0013n c0013n = this.f2830l;
        if (((f) c0013n.f258a) == null) {
            c0013n.f258a = new f(c0013n, 0);
        }
        return (f) c0013n.f258a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f2830l == null) {
            this.f2830l = new C0013n(this);
        }
        C0013n c0013n = this.f2830l;
        if (((f) c0013n.f259b) == null) {
            c0013n.f259b = new f(c0013n, 1);
        }
        return (f) c0013n.f259b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f2861g;
        int i2 = this.f2861g;
        int[] iArr = this.f2859e;
        if (iArr.length < size) {
            Object[] objArr = this.f2860f;
            a(size);
            if (this.f2861g > 0) {
                System.arraycopy(iArr, 0, this.f2859e, 0, i2);
                System.arraycopy(objArr, 0, this.f2860f, 0, i2 << 1);
            }
            i.b(iArr, objArr, i2);
        }
        if (this.f2861g != i2) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f2830l == null) {
            this.f2830l = new C0013n(this);
        }
        C0013n c0013n = this.f2830l;
        if (((h) c0013n.f260c) == null) {
            c0013n.f260c = new h(c0013n);
        }
        return (h) c0013n.f260c;
    }
}
