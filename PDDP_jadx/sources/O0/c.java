package O0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p043y0.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends d {
    public static List S(b bVar) {
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return l.f3483e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return a1.a.t(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
