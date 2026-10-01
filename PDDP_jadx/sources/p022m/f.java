package p022m;

import G.C0013n;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Set {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0013n f2849f;

    public /* synthetic */ f(C0013n c0013n, int i2) {
        this.f2848e = i2;
        this.f2849f = c0013n;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f2848e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f2848e) {
            case 0:
                C0013n c0013n = this.f2849f;
                int i2 = ((a) c0013n.f261d).f2861g;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ((a) c0013n.f261d).put(entry.getKey(), entry.getValue());
                }
                return i2 != ((a) c0013n.f261d).f2861g;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f2848e) {
            case 0:
                ((a) this.f2849f.f261d).clear();
                break;
            default:
                ((a) this.f2849f.f261d).clear();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f2848e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C0013n c0013n = this.f2849f;
                int iD = ((a) c0013n.f261d).d(key);
                if (iD < 0) {
                    return false;
                }
                Object objA = c0013n.a(iD, 1);
                Object value = entry.getValue();
                return objA == value || (objA != null && objA.equals(value));
            default:
                return ((a) this.f2849f.f261d).d(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f2848e) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                a aVar = (a) this.f2849f.f261d;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!aVar.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f2848e) {
            case 0:
                break;
        }
        return C0013n.d(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f2848e) {
            case 0:
                C0013n c0013n = this.f2849f;
                int iHashCode = 0;
                for (int i2 = ((a) c0013n.f261d).f2861g - 1; i2 >= 0; i2--) {
                    Object objA = c0013n.a(i2, 0);
                    Object objA2 = c0013n.a(i2, 1);
                    iHashCode += (objA == null ? 0 : objA.hashCode()) ^ (objA2 == null ? 0 : objA2.hashCode());
                }
                return iHashCode;
            default:
                C0013n c0013n2 = this.f2849f;
                int iHashCode2 = 0;
                for (int i3 = ((a) c0013n2.f261d).f2861g - 1; i3 >= 0; i3--) {
                    Object objA3 = c0013n2.a(i3, 0);
                    iHashCode2 += objA3 == null ? 0 : objA3.hashCode();
                }
                return iHashCode2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f2848e) {
            case 0:
                return ((a) this.f2849f.f261d).f2861g == 0;
            default:
                return ((a) this.f2849f.f261d).f2861g == 0;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2848e) {
            case 0:
                return new g(this.f2849f);
            default:
                return new e(this.f2849f, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f2848e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0013n c0013n = this.f2849f;
                int iD = ((a) c0013n.f261d).d(obj);
                if (iD < 0) {
                    return false;
                }
                c0013n.b(iD);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f2848e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                a aVar = (a) this.f2849f.f261d;
                int size = aVar.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    aVar.remove(it.next());
                }
                return size != aVar.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f2848e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                a aVar = (a) this.f2849f.f261d;
                int size = aVar.size();
                Iterator it = aVar.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != aVar.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f2848e) {
            case 0:
                break;
        }
        return ((a) this.f2849f.f261d).f2861g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f2848e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0013n c0013n = this.f2849f;
                int i2 = ((a) c0013n.f261d).f2861g;
                Object[] objArr = new Object[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[i3] = c0013n.a(i3, 0);
                }
                return objArr;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f2848e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f2849f.h(0, objArr);
        }
    }
}
