package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P f1457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P f1458b;

    static {
        T t = T.f1459c;
        P p2 = null;
        try {
            p2 = (P) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1457a = p2;
        f1458b = new P();
    }
}
