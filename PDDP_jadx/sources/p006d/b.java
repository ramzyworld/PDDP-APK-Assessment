package p006d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import p000a.a;
import p016j.P;
import p029q.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1761a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f1762b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f1763c = new Object();

    public static void a(Context context, int i2, ColorStateList colorStateList) {
        synchronized (f1763c) {
            try {
                WeakHashMap weakHashMap = f1762b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(context);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(context, sparseArray);
                }
                sparseArray.append(i2, new a(colorStateList, context.getResources().getConfiguration()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ColorStateList b(Context context, int i2) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        a aVar;
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i2);
        }
        synchronized (f1763c) {
            try {
                SparseArray sparseArray = (SparseArray) f1762b.get(context);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (aVar = (a) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else if (aVar.f1760b.equals(context.getResources().getConfiguration())) {
                    colorStateList = aVar.f1759a;
                } else {
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        Resources resources = context.getResources();
        ThreadLocal threadLocal = f1761a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            Resources resources2 = context.getResources();
            try {
                colorStateListA = c.a(resources2, resources2.getXml(i2), context.getTheme());
            } catch (Exception e2) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListA == null) {
            return a.u(context, i2);
        }
        a(context, i2, colorStateListA);
        return colorStateListA;
    }

    public static Drawable c(Context context, int i2) {
        return P.d().f(context, i2);
    }
}
