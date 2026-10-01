package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0071c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f1487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f1488b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f1487a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f1488b = cls2 != null;
    }

    public static boolean a() {
        return (f1487a == null || f1488b) ? false : true;
    }
}
