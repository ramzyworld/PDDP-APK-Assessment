package p042y;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p031r.c;

/* JADX INFO: loaded from: classes.dex */
public final class E extends H {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Field f3425c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f3426d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Constructor f3427e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f3428f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WindowInsets f3429a = e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f3430b;

    private static WindowInsets e() {
        if (!f3426d) {
            try {
                f3425c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f3426d = true;
        }
        Field field = f3425c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f3428f) {
            try {
                f3427e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f3428f = true;
        }
        Constructor constructor = f3427e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // p042y.H
    public O b() {
        a();
        O oA = O.a(this.f3429a, null);
        N n2 = oA.f3444a;
        n2.j(null);
        n2.l(this.f3430b);
        return oA;
    }

    @Override // p042y.H
    public void c(c cVar) {
        this.f3430b = cVar;
    }

    @Override // p042y.H
    public void d(c cVar) {
        WindowInsets windowInsets = this.f3429a;
        if (windowInsets != null) {
            this.f3429a = windowInsets.replaceSystemWindowInsets(cVar.f3036a, cVar.f3037b, cVar.f3038c, cVar.f3039d);
        }
    }
}
