package p042y;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: y.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0184q {
    public static O a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        O oA = O.a(rootWindowInsets, null);
        N n2 = oA.f3444a;
        n2.k(oA);
        n2.d(view.getRootView());
        return oA;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i2) {
        view.setScrollIndicators(i2);
    }

    public static void d(View view, int i2, int i3) {
        view.setScrollIndicators(i2, i3);
    }
}
