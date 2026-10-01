package androidx.datastore.preferences.protobuf;

import java.util.Collections;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0083o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C0083o f1545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0083o f1546b;

    static {
        C0083o c0083o = new C0083o();
        Collections.emptyMap();
        f1546b = c0083o;
    }

    public static C0083o a() {
        T t = T.f1459c;
        C0083o c0083o = f1545a;
        if (c0083o == null) {
            synchronized (C0083o.class) {
                try {
                    c0083o = f1545a;
                    if (c0083o == null) {
                        Class cls = AbstractC0082n.f1544a;
                        C0083o c0083o2 = null;
                        if (cls != null) {
                            try {
                                c0083o2 = (C0083o) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0083o2 == null) {
                            c0083o2 = f1546b;
                        }
                        f1545a = c0083o2;
                        c0083o = c0083o2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c0083o;
    }
}
