package p043y0;

import H0.l;
import I0.i;
import a1.a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends j {
    public static final void Q(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar) {
        i.e(collection, "<this>");
        i.e(charSequence, "separator");
        i.e(charSequence2, "prefix");
        i.e(charSequence3, "postfix");
        i.e(charSequence4, "truncated");
        sb.append(charSequence2);
        Iterator it = collection.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i3++;
            if (i3 > 1) {
                sb.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (lVar != null) {
                sb.append((CharSequence) lVar.j(next));
            } else {
                if (next != null ? next instanceof CharSequence : true) {
                    sb.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb.append(((Character) next).charValue());
                } else {
                    sb.append((CharSequence) String.valueOf(next));
                }
            }
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String R(Collection collection, String str, String str2, String str3, l lVar, int i2) {
        String str4 = (i2 & 2) != 0 ? "" : str2;
        String str5 = (i2 & 4) != 0 ? "" : str3;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        i.e(collection, "<this>");
        i.e(str4, "prefix");
        i.e(str5, "postfix");
        StringBuilder sb = new StringBuilder();
        Q(collection, sb, str, str4, str5, -1, "...", lVar);
        String string = sb.toString();
        i.d(string, "toString(...)");
        return string;
    }

    public static final void S(Iterable iterable, AbstractCollection abstractCollection) {
        i.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List T(Iterable iterable) {
        ArrayList arrayList;
        i.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        l lVar = l.f3483e;
        if (z2) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return lVar;
            }
            if (size != 1) {
                return new ArrayList(collection);
            }
            return a.t(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        if (z2) {
            arrayList = new ArrayList((Collection) iterable);
        } else {
            arrayList = new ArrayList();
            S(iterable, arrayList);
        }
        int size2 = arrayList.size();
        if (size2 != 0) {
            return size2 != 1 ? arrayList : a.t(arrayList.get(0));
        }
        return lVar;
    }

    public static Set U(Collection collection) {
        i.e(collection, "<this>");
        n nVar = n.f3485e;
        int size = collection.size();
        if (size == 0) {
            return nVar;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(p000a.a.y(collection.size()));
            S(collection, linkedHashSet);
            return linkedHashSet;
        }
        Set setSingleton = Collections.singleton(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
        i.d(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
