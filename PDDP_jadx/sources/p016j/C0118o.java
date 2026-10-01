package p016j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import p013h0.d;

/* JADX INFO: renamed from: j.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0118o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f2707b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0118o f2708c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public P f2709a;

    public static synchronized void b() {
        if (f2708c == null) {
            C0118o c0118o = new C0118o();
            f2708c = c0118o;
            c0118o.f2709a = P.d();
            f2708c.f2709a.k(new d());
        }
    }

    public static void c(Drawable drawable, j0 j0Var, int[] iArr) {
        PorterDuff.Mode mode = P.f2591h;
        if (AbstractC0127y.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z2 = j0Var.f2684d;
        if (z2 || j0Var.f2683c) {
            PorterDuffColorFilter porterDuffColorFilterH = null;
            ColorStateList colorStateList = z2 ? j0Var.f2681a : null;
            PorterDuff.Mode mode2 = j0Var.f2683c ? j0Var.f2682b : P.f2591h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterH = P.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterH);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable a(Context context, int i2) {
        return this.f2709a.f(context, i2);
    }
}
