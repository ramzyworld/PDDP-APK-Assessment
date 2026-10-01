package p039v0;

import D.j;
import T.m;
import T.n;
import a1.a;
import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: renamed from: v0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0164w {
    public static void a(WebSettings webSettings, boolean z2) {
        j jVar;
        if (!m.f835e.b()) {
            throw m.a();
        }
        try {
            jVar = new j(10, (WebSettingsBoundaryInterface) a.d(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) n.f836a.f44f).convertSettings(webSettings)));
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e2;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e2);
            jVar = new T.j(10, null);
        }
        jVar.w(z2);
    }
}
