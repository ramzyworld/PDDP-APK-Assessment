package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Comparable f1478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y f1480g;

    public Z(Y y2, Comparable comparable, Object obj) {
        this.f1480g = y2;
        this.f1478e = comparable;
        this.f1479f = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1478e.compareTo(((Z) obj).f1478e);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f1478e;
        if (comparable == null) {
            zEquals = key == null;
        } else {
            zEquals = comparable.equals(key);
        }
        if (zEquals) {
            Object obj2 = this.f1479f;
            Object value = entry.getValue();
            if (obj2 == null) {
                zEquals2 = value == null;
            } else {
                zEquals2 = obj2.equals(value);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1478e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1479f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f1478e;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f1479f;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f1480g.b();
        Object obj2 = this.f1479f;
        this.f1479f = obj;
        return obj2;
    }

    public final String toString() {
        return this.f1478e + "=" + this.f1479f;
    }
}
