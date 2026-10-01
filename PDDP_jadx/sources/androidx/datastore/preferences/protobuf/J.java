package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class J {
    public static int a(int i2, Object obj, Object obj2) {
        I i3 = (I) obj;
        H h2 = (H) obj2;
        int iM0 = 0;
        if (!i3.isEmpty()) {
            for (Map.Entry entry : i3.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                h2.getClass();
                int iK0 = C0081m.k0(i2);
                int iA = H.a(h2.f1433a, key, value);
                iM0 += C0081m.m0(iA) + iA + iK0;
            }
        }
        return iM0;
    }

    public static I b(Object obj, Object obj2) {
        I iB = (I) obj;
        I i2 = (I) obj2;
        if (!i2.isEmpty()) {
            if (!iB.f1435e) {
                iB = iB.b();
            }
            iB.a();
            if (!i2.isEmpty()) {
                iB.putAll(i2);
            }
        }
        return iB;
    }

    public static void c(Object obj) {
        ((I) obj).f1435e = false;
    }
}
