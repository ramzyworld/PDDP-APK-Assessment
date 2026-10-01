package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J f1436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J f1437b;

    static {
        T t = T.f1459c;
        J j2 = null;
        try {
            j2 = (J) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1436a = j2;
        f1437b = new J();
    }
}
