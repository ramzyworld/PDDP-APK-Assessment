package T;

/* JADX INFO: loaded from: classes.dex */
public final class l extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f830e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i2, String str, String str2) {
        super(2, str, str2);
        this.f830e = i2;
    }

    @Override // T.c
    public final boolean b() {
        switch (this.f830e) {
            case 0:
                if (!super.b() || !a1.a.r("MULTI_PROCESS")) {
                    return false;
                }
                int i2 = S.a.f772a;
                if (m.f834d.b()) {
                    return o.f837a.getStatics().isMultiProcessEnabled();
                }
                throw m.a();
            default:
                if (a1.a.r("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
