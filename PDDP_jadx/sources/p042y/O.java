package p042y;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f3444a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            int i2 = M.f3441l;
        } else {
            int i3 = N.f3442b;
        }
    }

    public O(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f3444a = new M(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f3444a = new L(this, windowInsets);
        } else if (i2 >= 28) {
            this.f3444a = new K(this, windowInsets);
        } else {
            this.f3444a = new J(this, windowInsets);
        }
    }

    public static O a(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        O o2 = new O(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = x.f3474a;
            O oA = Build.VERSION.SDK_INT >= 23 ? AbstractC0184q.a(view) : AbstractC0183p.j(view);
            N n2 = o2.f3444a;
            n2.k(oA);
            n2.d(view.getRootView());
        }
        return o2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        return Objects.equals(this.f3444a, ((O) obj).f3444a);
    }

    public final int hashCode() {
        N n2 = this.f3444a;
        if (n2 == null) {
            return 0;
        }
        return n2.hashCode();
    }

    public O() {
        this.f3444a = new N(this);
    }
}
