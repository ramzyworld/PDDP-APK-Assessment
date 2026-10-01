package p042y;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p031r.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class I extends N {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f3432f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Method f3433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Class f3434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Field f3435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Field f3436j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f3437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f3438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f3439e;

    public I(O o2, WindowInsets windowInsets) {
        super(o2);
        this.f3438d = null;
        this.f3437c = windowInsets;
    }

    private c m(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f3432f) {
            n();
        }
        Method method = f3433g;
        if (method != null && f3434h != null && f3435i != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f3435i.get(f3436j.get(objInvoke));
                if (rect != null) {
                    return c.a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void n() {
        try {
            f3433g = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f3434h = cls;
            f3435i = cls.getDeclaredField("mVisibleInsets");
            f3436j = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f3435i.setAccessible(true);
            f3436j.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f3432f = true;
    }

    @Override // p042y.N
    public void d(View view) {
        c cVarM = m(view);
        if (cVarM == null) {
            cVarM = c.f3035e;
        }
        o(cVarM);
    }

    @Override // p042y.N
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f3439e, ((I) obj).f3439e);
        }
        return false;
    }

    @Override // p042y.N
    public final c g() {
        if (this.f3438d == null) {
            WindowInsets windowInsets = this.f3437c;
            this.f3438d = c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f3438d;
    }

    @Override // p042y.N
    public boolean i() {
        return this.f3437c.isRound();
    }

    public void o(c cVar) {
        this.f3439e = cVar;
    }

    @Override // p042y.N
    public void j(c[] cVarArr) {
    }

    @Override // p042y.N
    public void k(O o2) {
    }
}
