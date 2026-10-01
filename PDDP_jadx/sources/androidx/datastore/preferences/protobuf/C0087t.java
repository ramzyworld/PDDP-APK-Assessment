package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0087t implements L {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0087t f1573b = new C0087t(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1574a;

    public /* synthetic */ C0087t(int i2) {
        this.f1574a = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final boolean a(Class cls) {
        switch (this.f1574a) {
            case 0:
                return AbstractC0090w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final V b(Class cls) {
        switch (this.f1574a) {
            case 0:
                if (!AbstractC0090w.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (V) AbstractC0090w.f(cls.asSubclass(AbstractC0090w.class)).e(3);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
