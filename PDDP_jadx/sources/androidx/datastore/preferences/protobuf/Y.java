package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractMap {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f1472j = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f1473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f1474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile b0 f1476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map f1477i;

    public static Y f() {
        Y y2 = new Y();
        y2.f1473e = Collections.emptyList();
        y2.f1474f = Collections.emptyMap();
        y2.f1477i = Collections.emptyMap();
        return y2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i2;
        int i3;
        int i4;
        int iCompareTo;
        int size = this.f1473e.size();
        int i5 = size - 1;
        if (i5 < 0) {
            i2 = 0;
            while (i2 <= i5) {
                i4 = (i2 + i5) / 2;
                iCompareTo = comparable.compareTo(((Z) this.f1473e.get(i4)).f1478e);
                if (iCompareTo < 0) {
                    i5 = i4 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i4;
                    }
                    i2 = i4 + 1;
                }
            }
            i3 = i2 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((Z) this.f1473e.get(i5)).f1478e);
            if (iCompareTo2 > 0) {
                i3 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i5;
                }
                i2 = 0;
                while (i2 <= i5) {
                    i4 = (i2 + i5) / 2;
                    iCompareTo = comparable.compareTo(((Z) this.f1473e.get(i4)).f1478e);
                    if (iCompareTo < 0) {
                        i5 = i4 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i4;
                        }
                        i2 = i4 + 1;
                    }
                }
                i3 = i2 + 1;
            }
        }
        return -i3;
    }

    public final void b() {
        if (this.f1475g) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i2) {
        return (Map.Entry) this.f1473e.get(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f1473e.isEmpty()) {
            this.f1473e.clear();
        }
        if (this.f1474f.isEmpty()) {
            return;
        }
        this.f1474f.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f1474f.containsKey(comparable);
    }

    public final Set d() {
        return this.f1474f.isEmpty() ? Collections.emptySet() : this.f1474f.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f1474f.isEmpty() && !(this.f1474f instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f1474f = treeMap;
            this.f1477i = treeMap.descendingMap();
        }
        return (SortedMap) this.f1474f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f1476h == null) {
            this.f1476h = new b0(this);
        }
        return this.f1476h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return super.equals(obj);
        }
        Y y2 = (Y) obj;
        int size = size();
        if (size != y2.size()) {
            return false;
        }
        int size2 = this.f1473e.size();
        if (size2 != y2.f1473e.size()) {
            return ((AbstractSet) entrySet()).equals(y2.entrySet());
        }
        for (int i2 = 0; i2 < size2; i2++) {
            if (!c(i2).equals(y2.c(i2))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f1474f.equals(y2.f1474f);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((Z) this.f1473e.get(iA)).setValue(obj);
        }
        b();
        if (this.f1473e.isEmpty() && !(this.f1473e instanceof ArrayList)) {
            this.f1473e = new ArrayList(16);
        }
        int i2 = -(iA + 1);
        if (i2 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f1473e.size() == 16) {
            Z z2 = (Z) this.f1473e.remove(15);
            e().put(z2.f1478e, z2.f1479f);
        }
        this.f1473e.add(i2, new Z(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((Z) this.f1473e.get(iA)).f1479f : this.f1474f.get(comparable);
    }

    public final Object h(int i2) {
        b();
        Object obj = ((Z) this.f1473e.remove(i2)).f1479f;
        if (!this.f1474f.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f1473e;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Z(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f1473e.size();
        int iHashCode = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iHashCode += ((Z) this.f1473e.get(i2)).hashCode();
        }
        return this.f1474f.size() > 0 ? iHashCode + this.f1474f.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f1474f.isEmpty()) {
            return null;
        }
        return this.f1474f.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1474f.size() + this.f1473e.size();
    }
}
