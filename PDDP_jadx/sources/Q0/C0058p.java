package Q0;

/* JADX INFO: renamed from: Q0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0058p extends I0.j implements H0.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0058p f735g = new C0058p(2, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0058p f736h = new C0058p(2, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f737f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0058p(int i2, int i3) {
        super(i2);
        this.f737f = i3;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        switch (this.f737f) {
            case 0:
                return ((z0.i) obj).c((z0.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((z0.i) obj).c((z0.g) obj2);
        }
    }
}
