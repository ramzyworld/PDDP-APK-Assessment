package p029q;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3007a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f3008b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f3009c = new Object();

    public static void a(m mVar, int i2, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f3009c) {
            try {
                WeakHashMap weakHashMap = f3008b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(mVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(mVar, sparseArray);
                }
                sparseArray.append(i2, new l(colorStateList, mVar.f3005a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
