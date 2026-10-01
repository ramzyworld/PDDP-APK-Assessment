package p005c0;

import I0.i;
import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import p042y.O;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1758a = new b();

    public final O a(Context context) {
        i.e(context, "context");
        WindowInsets windowInsets = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        i.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return O.a(windowInsets, null);
    }
}
