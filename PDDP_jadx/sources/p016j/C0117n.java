package p016j;

import N.C0026b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Field;
import p004c.a;
import p042y.AbstractC0183p;
import p042y.x;

/* JADX INFO: renamed from: j.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0117n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f2699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0118o f2700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2701c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j0 f2702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j0 f2703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j0 f2704f;

    public C0117n(View view) {
        C0118o c0118o;
        this.f2699a = view;
        PorterDuff.Mode mode = C0118o.f2707b;
        synchronized (C0118o.class) {
            try {
                if (C0118o.f2708c == null) {
                    C0118o.b();
                }
                c0118o = C0118o.f2708c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2700b = c0118o;
    }

    public final void a() {
        View view = this.f2699a;
        Drawable background = view.getBackground();
        if (background != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 <= 21 ? i2 == 21 : this.f2702d != null) {
                if (this.f2704f == null) {
                    this.f2704f = new j0();
                }
                j0 j0Var = this.f2704f;
                j0Var.f2681a = null;
                j0Var.f2684d = false;
                j0Var.f2682b = null;
                j0Var.f2683c = false;
                Field field = x.f3474a;
                ColorStateList colorStateListG = AbstractC0183p.g(view);
                if (colorStateListG != null) {
                    j0Var.f2684d = true;
                    j0Var.f2681a = colorStateListG;
                }
                PorterDuff.Mode modeH = AbstractC0183p.h(view);
                if (modeH != null) {
                    j0Var.f2683c = true;
                    j0Var.f2682b = modeH;
                }
                if (j0Var.f2684d || j0Var.f2683c) {
                    C0118o.c(background, j0Var, view.getDrawableState());
                    return;
                }
            }
            j0 j0Var2 = this.f2703e;
            if (j0Var2 != null) {
                C0118o.c(background, j0Var2, view.getDrawableState());
                return;
            }
            j0 j0Var3 = this.f2702d;
            if (j0Var3 != null) {
                C0118o.c(background, j0Var3, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i2) {
        ColorStateList colorStateListI;
        View view = this.f2699a;
        C0026b c0026bI = C0026b.I(view.getContext(), attributeSet, a.f1756u, i2);
        TypedArray typedArray = (TypedArray) c0026bI.f476f;
        try {
            if (typedArray.hasValue(0)) {
                this.f2701c = typedArray.getResourceId(0, -1);
                C0118o c0118o = this.f2700b;
                Context context = view.getContext();
                int i3 = this.f2701c;
                synchronized (c0118o) {
                    colorStateListI = c0118o.f2709a.i(context, i3);
                }
                if (colorStateListI != null) {
                    d(colorStateListI);
                }
            }
            if (typedArray.hasValue(1)) {
                ColorStateList colorStateListX = c0026bI.x(1);
                Field field = x.f3474a;
                int i4 = Build.VERSION.SDK_INT;
                AbstractC0183p.q(view, colorStateListX);
                if (i4 == 21) {
                    Drawable background = view.getBackground();
                    boolean z2 = (AbstractC0183p.g(view) == null && AbstractC0183p.h(view) == null) ? false : true;
                    if (background != null && z2) {
                        if (background.isStateful()) {
                            background.setState(view.getDrawableState());
                        }
                        view.setBackground(background);
                    }
                }
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode modeD = AbstractC0127y.d(typedArray.getInt(2, -1), null);
                Field field2 = x.f3474a;
                int i5 = Build.VERSION.SDK_INT;
                AbstractC0183p.r(view, modeD);
                if (i5 == 21) {
                    Drawable background2 = view.getBackground();
                    boolean z3 = (AbstractC0183p.g(view) == null && AbstractC0183p.h(view) == null) ? false : true;
                    if (background2 != null && z3) {
                        if (background2.isStateful()) {
                            background2.setState(view.getDrawableState());
                        }
                        view.setBackground(background2);
                    }
                }
            }
            c0026bI.L();
        } catch (Throwable th) {
            c0026bI.L();
            throw th;
        }
    }

    public final void c(int i2) {
        ColorStateList colorStateListI;
        this.f2701c = i2;
        C0118o c0118o = this.f2700b;
        if (c0118o != null) {
            Context context = this.f2699a.getContext();
            synchronized (c0118o) {
                colorStateListI = c0118o.f2709a.i(context, i2);
            }
        } else {
            colorStateListI = null;
        }
        d(colorStateListI);
        a();
    }

    public final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2702d == null) {
                this.f2702d = new j0();
            }
            j0 j0Var = this.f2702d;
            j0Var.f2681a = colorStateList;
            j0Var.f2684d = true;
        } else {
            this.f2702d = null;
        }
        a();
    }

    public final void e(ColorStateList colorStateList) {
        if (this.f2703e == null) {
            this.f2703e = new j0();
        }
        j0 j0Var = this.f2703e;
        j0Var.f2681a = colorStateList;
        j0Var.f2684d = true;
        a();
    }

    public final void f(PorterDuff.Mode mode) {
        if (this.f2703e == null) {
            this.f2703e = new j0();
        }
        j0 j0Var = this.f2703e;
        j0Var.f2682b = mode;
        j0Var.f2683c = true;
        a();
    }
}
