package p042y;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class Q extends P {
    @Override // a1.a
    public final void x(boolean z2) {
        Window window = this.f3445m;
        if (!z2) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
