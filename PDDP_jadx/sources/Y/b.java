package Y;

/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f1070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f1071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f1072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f1073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f1074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f1075l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f1077f;

    static {
        int i2 = 0;
        f1070g = new b("NONE", i2);
        f1071h = new b("FULL", i2);
        int i3 = 1;
        f1072i = new b("FLAT", i3);
        f1073j = new b("HALF_OPENED", i3);
        int i4 = 2;
        f1074k = new b("FOLD", i4);
        f1075l = new b("HINGE", i4);
    }

    public /* synthetic */ b(String str, int i2) {
        this.f1076e = i2;
        this.f1077f = str;
    }

    public String toString() {
        switch (this.f1076e) {
            case 0:
                return (String) this.f1077f;
            case 1:
                return (String) this.f1077f;
            case 2:
                return (String) this.f1077f;
            default:
                return super.toString();
        }
    }

    public b(Z.a aVar) {
        this.f1076e = 3;
        int i2 = o.f1102b;
        this.f1077f = aVar;
    }
}
