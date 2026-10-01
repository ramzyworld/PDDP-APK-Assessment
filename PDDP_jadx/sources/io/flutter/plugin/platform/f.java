package io.flutter.plugin.platform;

import N.Q;
import android.os.Build;
import android.view.Window;
import p011g0.AbstractActivityC0098e;
import p042y.P;
import p042y.S;
import p042y.T;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0098e f2316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f2317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractActivityC0098e f2318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p028p0.f f2319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2320e;

    public f(AbstractActivityC0098e abstractActivityC0098e, Q q2, AbstractActivityC0098e abstractActivityC0098e2) {
        n nVar = new n(this);
        this.f2316a = abstractActivityC0098e;
        this.f2317b = q2;
        q2.f472g = nVar;
        this.f2318c = abstractActivityC0098e2;
        this.f2320e = 1280;
    }

    public final void a(p028p0.f fVar) {
        a1.a q2;
        Window window = this.f2316a.getWindow();
        window.getDecorView();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            q2 = new T(window);
        } else if (i2 >= 26) {
            q2 = new S(window);
        } else {
            q2 = i2 >= 23 ? new p042y.Q(window) : new P(window);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        if (i3 >= 23) {
            int i4 = fVar.f2905b;
            if (i4 != 0) {
                int iB = I.j.b(i4);
                if (iB == 0) {
                    q2.x(false);
                } else if (iB == 1) {
                    q2.x(true);
                }
            }
            Integer num = fVar.f2904a;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
        }
        Boolean bool = fVar.f2906c;
        if (bool != null && i3 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i3 >= 26) {
            int i5 = fVar.f2908e;
            if (i5 != 0) {
                int iB2 = I.j.b(i5);
                if (iB2 == 0) {
                    q2.w(false);
                } else if (iB2 == 1) {
                    q2.w(true);
                }
            }
            Integer num2 = fVar.f2907d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = fVar.f2909f;
        if (num3 != null && i3 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = fVar.f2910g;
        if (bool2 != null && i3 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f2319d = fVar;
    }

    public final void b() {
        this.f2316a.getWindow().getDecorView().setSystemUiVisibility(this.f2320e);
        p028p0.f fVar = this.f2319d;
        if (fVar != null) {
            a(fVar);
        }
    }
}
