package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f1425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C f1426b;

    static {
        T t = T.f1459c;
        C c2 = null;
        try {
            c2 = (C) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1425a = c2;
        f1426b = new C();
    }
}
