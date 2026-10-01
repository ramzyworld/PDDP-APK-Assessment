package p042y;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f3474a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f3475b = false;

    static {
        new WeakHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:15:0x002a, B:17:0x0034), top: B:31:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public static void a(ViewGroup viewGroup, C0169b c0169b) {
        Object obj;
        View.AccessibilityDelegate accessibilityDelegateA;
        if (c0169b == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityDelegateA = u.a(viewGroup);
            } else if (f3475b) {
                accessibilityDelegateA = null;
            } else if (f3474a == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    f3474a = declaredField;
                    declaredField.setAccessible(true);
                    try {
                        obj = f3474a.get(viewGroup);
                        if (obj instanceof View.AccessibilityDelegate) {
                            accessibilityDelegateA = (View.AccessibilityDelegate) obj;
                        } else {
                            accessibilityDelegateA = null;
                        }
                    } catch (Throwable unused) {
                        f3475b = true;
                    }
                } catch (Throwable unused2) {
                    f3475b = true;
                }
            } else {
                obj = f3474a.get(viewGroup);
                if (obj instanceof View.AccessibilityDelegate) {
                    accessibilityDelegateA = (View.AccessibilityDelegate) obj;
                } else {
                    accessibilityDelegateA = null;
                }
            }
            if (accessibilityDelegateA instanceof C0168a) {
                c0169b = new C0169b();
            }
        }
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(c0169b != null ? c0169b.f3451b : null);
    }
}
