package T;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class k extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pattern f829d;

    public k() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f829d = Pattern.compile("\\A\\d+");
    }

    @Override // T.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // T.c
    public final boolean b() {
        int i2;
        PackageInfo packageInfoA;
        boolean zB = super.b();
        if (!zB || (i2 = Build.VERSION.SDK_INT) >= 29) {
            return zB;
        }
        int i3 = S.a.f772a;
        if (i2 >= 26) {
            packageInfoA = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfoA = S.a.a();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfoA = null;
            }
        }
        if (packageInfoA == null) {
            return false;
        }
        Matcher matcher = this.f829d.matcher(packageInfoA.versionName);
        return matcher.find() && Integer.parseInt(packageInfoA.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
