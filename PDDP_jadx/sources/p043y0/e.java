package p043y0;

import I0.i;
import a1.a;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends a {
    public static List P(Object... objArr) {
        if (objArr.length <= 0) {
            return l.f3483e;
        }
        List listAsList = Arrays.asList(objArr);
        i.d(listAsList, "asList(...)");
        return listAsList;
    }
}
