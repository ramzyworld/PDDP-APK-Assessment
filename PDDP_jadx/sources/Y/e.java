package Y;

import G.W;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f1083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U.a f1084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U.a f1085c;

    public e(ClassLoader classLoader, U.a aVar) {
        this.f1083a = classLoader;
        this.f1084b = aVar;
        this.f1085c = new U.a(classLoader);
    }

    public final WindowLayoutComponent a() {
        U.a aVar = this.f1085c;
        aVar.getClass();
        boolean zB = false;
        try {
            I0.i.d(aVar.f906a.loadClass("androidx.window.extensions.WindowExtensionsProvider"), "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            if (a1.a.J("WindowExtensionsProvider#getWindowExtensions is not valid", new W(2, aVar)) && a1.a.J("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && a1.a.J("FoldingFeature class is not valid", new d(this, 0))) {
                int iA = V.e.a();
                if (iA == 1) {
                    zB = b();
                } else if (2 <= iA && iA <= Integer.MAX_VALUE && b()) {
                    if (a1.a.J("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
                        zB = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zB) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return a1.a.J("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
