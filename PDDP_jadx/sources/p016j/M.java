package p016j;

import D.j;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p014i.k;

/* JADX INFO: loaded from: classes.dex */
public final class M extends J implements K {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Method f2588E;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public j f2589D;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2588E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p016j.K
    public final void d(p014i.j jVar, k kVar) {
        j jVar2 = this.f2589D;
        if (jVar2 != null) {
            jVar2.d(jVar, kVar);
        }
    }

    @Override // p016j.K
    public final void i(p014i.j jVar, k kVar) {
        j jVar2 = this.f2589D;
        if (jVar2 != null) {
            jVar2.i(jVar, kVar);
        }
    }
}
