package J;

import D.j;
import I0.i;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f342b;

    public b(Map map, boolean z2) {
        i.e(map, "preferencesMap");
        this.f341a = map;
        this.f342b = new j(z2);
    }

    public final Map a() {
        p041x0.b bVar;
        Set<Map.Entry> setEntrySet = this.f341a.entrySet();
        i.e(setEntrySet, "<this>");
        int iY = p000a.a.y(setEntrySet.size());
        if (iY < 16) {
            iY = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iY);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                i.d(bArrCopyOf, "copyOf(this, size)");
                bVar = new p041x0.b(key, bArrCopyOf);
            } else {
                bVar = new p041x0.b(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(bVar.f3411e, bVar.f3412f);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        i.d(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f342b.f44f).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(d dVar) {
        i.e(dVar, "key");
        Object obj = this.f341a.get(dVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        i.d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void d(d dVar, Object obj) {
        b();
        Map map = this.f341a;
        if (obj == null) {
            b();
            map.remove(dVar);
            return;
        }
        if (obj instanceof Set) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(p043y0.d.U((Set) obj));
            i.d(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            map.put(dVar, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                map.put(dVar, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            i.d(bArrCopyOf, "copyOf(this, size)");
            map.put(dVar, bArrCopyOf);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    public final boolean equals(Object obj) {
        boolean zA;
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        Map map = bVar.f341a;
        Map map2 = this.f341a;
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        Map map3 = bVar.f341a;
        if (!map3.isEmpty()) {
            for (Map.Entry entry : map3.entrySet()) {
                Object obj2 = map2.get(entry.getKey());
                if (obj2 != null) {
                    Object value = entry.getValue();
                    if (!(value instanceof byte[])) {
                        zA = i.a(value, obj2);
                    } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                        zA = true;
                    } else {
                        zA = false;
                    }
                } else {
                    zA = false;
                }
                if (!zA) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.f341a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return p043y0.d.R(this.f341a.entrySet(), ",\n", "{\n", "\n}", a.f340f, 24);
    }

    public /* synthetic */ b(boolean z2) {
        this(new LinkedHashMap(), z2);
    }
}
