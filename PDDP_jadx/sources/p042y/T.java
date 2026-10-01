package p042y;

import a1.a;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class T extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WindowInsetsController f3446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Window f3447n;

    public T(Window window) {
        this.f3446m = window.getInsetsController();
        this.f3447n = window;
    }

    @Override // a1.a
    public final void w(boolean z2) {
        Window window = this.f3447n;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f3446m.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f3446m.setSystemBarsAppearance(0, 16);
    }

    @Override // a1.a
    public final void x(boolean z2) {
        Window window = this.f3447n;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f3446m.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f3446m.setSystemBarsAppearance(0, 8);
    }
}
