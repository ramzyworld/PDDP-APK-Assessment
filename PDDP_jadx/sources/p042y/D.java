package p042y;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f3421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f3422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f3423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f3424d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f3421a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f3422b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f3423c = declaredField3;
            declaredField3.setAccessible(true);
            f3424d = true;
        } catch (ReflectiveOperationException e2) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
        }
    }
}
