package Y;

import S0.p;
import p011g0.q;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1092b;

    public /* synthetic */ i(int i2, Object obj) {
        this.f1091a = i2;
        this.f1092b = obj;
    }

    @Override // x.a
    public final void accept(Object obj) {
        switch (this.f1091a) {
            case 0:
                ((S0.o) ((p) this.f1092b)).j((k) obj);
                break;
            default:
                ((q) this.f1092b).setWindowInfoListenerDisplayFeatures((k) obj);
                break;
        }
    }
}
