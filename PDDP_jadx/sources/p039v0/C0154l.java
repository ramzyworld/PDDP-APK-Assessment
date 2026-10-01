package p039v0;

import I0.j;
import I0.s;
import N.Q;
import a1.a;
import android.webkit.ValueCallback;
import p041x0.d;

/* JADX INFO: renamed from: v0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0154l implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f3375b;

    public /* synthetic */ C0154l(j jVar, int i2) {
        this.f3374a = i2;
        this.f3375b = jVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.f3374a) {
            case 0:
                Boolean bool = (Boolean) obj;
                A a2 = (A) this.f3375b;
                s.a(1, a2);
                Throwable thA = d.a(bool);
                Q q2 = a2.f3236g;
                if (thA == null) {
                    q2.b(a.t(bool));
                } else {
                    q2.b(a.N(thA));
                }
                break;
            default:
                String str = (String) obj;
                A a3 = (A) this.f3375b;
                s.a(1, a3);
                Throwable thA2 = d.a(str);
                Q q3 = a3.f3236g;
                if (thA2 == null) {
                    q3.b(a.t(str));
                } else {
                    q3.b(a.N(thA2));
                }
                break;
        }
    }
}
