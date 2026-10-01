package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0085q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0084p f1547a = new C0084p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0084p f1548b;

    static {
        T t = T.f1459c;
        C0084p c0084p = null;
        try {
            c0084p = (C0084p) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1548b = c0084p;
    }
}
