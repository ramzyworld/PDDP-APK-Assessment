package p016j;

import D.c;
import D.o;
import D.t;
import N.C0026b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.util.Locale;
import p004c.a;
import p006d.b;

/* JADX INFO: renamed from: j.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0122t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f2745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j0 f2746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0 f2747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j0 f2748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j0 f2749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j0 f2750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j0 f2751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j0 f2752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0124v f2753i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2754j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2755k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f2756l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2757m;

    public C0122t(TextView textView) {
        this.f2745a = textView;
        this.f2753i = new C0124v(textView);
    }

    public static j0 c(Context context, C0118o c0118o, int i2) {
        ColorStateList colorStateListI;
        synchronized (c0118o) {
            colorStateListI = c0118o.f2709a.i(context, i2);
        }
        if (colorStateListI == null) {
            return null;
        }
        j0 j0Var = new j0();
        j0Var.f2684d = true;
        j0Var.f2681a = colorStateListI;
        return j0Var;
    }

    public final void a(Drawable drawable, j0 j0Var) {
        if (drawable == null || j0Var == null) {
            return;
        }
        C0118o.c(drawable, j0Var, this.f2745a.getDrawableState());
    }

    public final void b() {
        j0 j0Var = this.f2746b;
        TextView textView = this.f2745a;
        if (j0Var != null || this.f2747c != null || this.f2748d != null || this.f2749e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f2746b);
            a(compoundDrawables[1], this.f2747c);
            a(compoundDrawables[2], this.f2748d);
            a(compoundDrawables[3], this.f2749e);
        }
        if (this.f2750f == null && this.f2751g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f2750f);
        a(compoundDrawablesRelative[2], this.f2751g);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:56:0x010d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0120  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(AttributeSet attributeSet, int i2) {
        C0118o c0118o;
        String string;
        boolean z2;
        boolean z3;
        ColorStateList colorStateListX;
        ColorStateList colorStateListX2;
        ColorStateList colorStateListX3;
        String string2;
        boolean z4;
        int i3;
        int i4;
        float fApplyDimension;
        int i5;
        float fApplyDimension2;
        ColorStateList colorStateList;
        int resourceId;
        int i6;
        int resourceId2;
        int i7;
        int i8;
        int i9;
        TextView textView = this.f2745a;
        Context context = textView.getContext();
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
        C0026b c0026bI = C0026b.I(context, attributeSet, a.f1742f, i2);
        TypedArray typedArray = (TypedArray) c0026bI.f476f;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f2746b = c(context, c0118o, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f2747c = c(context, c0118o, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f2748d = c(context, c0118o, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f2749e = c(context, c0118o, typedArray.getResourceId(2, 0));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f2750f = c(context, c0118o, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f2751g = c(context, c0118o, typedArray.getResourceId(6, 0));
        }
        c0026bI.L();
        boolean z5 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr = a.f1755s;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr);
            C0026b c0026b = new C0026b(context, typedArrayObtainStyledAttributes);
            if (z5 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z3 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            f(context, c0026b);
            if (i10 < 23) {
                colorStateListX = typedArrayObtainStyledAttributes.hasValue(3) ? c0026b.x(3) : null;
                if (typedArrayObtainStyledAttributes.hasValue(4)) {
                    colorStateListX2 = c0026b.x(4);
                    i9 = 5;
                } else {
                    i9 = 5;
                    colorStateListX2 = null;
                }
                if (typedArrayObtainStyledAttributes.hasValue(i9)) {
                    colorStateListX3 = c0026b.x(i9);
                    i7 = 15;
                } else {
                    i7 = 15;
                }
                if (typedArrayObtainStyledAttributes.hasValue(i7)) {
                    string2 = typedArrayObtainStyledAttributes.getString(i7);
                    i8 = 26;
                } else {
                    i8 = 26;
                    string2 = null;
                }
                if (i10 >= i8 || !typedArrayObtainStyledAttributes.hasValue(13)) {
                    string = null;
                } else {
                    string = typedArrayObtainStyledAttributes.getString(13);
                }
                c0026b.L();
            } else {
                i7 = 15;
                colorStateListX = null;
                colorStateListX2 = null;
            }
            colorStateListX3 = null;
            if (typedArrayObtainStyledAttributes.hasValue(i7)) {
                string2 = typedArrayObtainStyledAttributes.getString(i7);
                i8 = 26;
            } else {
                i8 = 26;
                string2 = null;
            }
            if (i10 >= i8) {
                string = null;
            } else {
                string = null;
            }
            c0026b.L();
        } else {
            string = null;
            z2 = false;
            z3 = false;
            colorStateListX = null;
            colorStateListX2 = null;
            colorStateListX3 = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        C0026b c0026b2 = new C0026b(context, typedArrayObtainStyledAttributes2);
        if (z5 || !typedArrayObtainStyledAttributes2.hasValue(14)) {
            z4 = z3;
        } else {
            z4 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        if (i10 < 23) {
            if (typedArrayObtainStyledAttributes2.hasValue(3)) {
                colorStateListX = c0026b2.x(3);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(4)) {
                colorStateListX2 = c0026b2.x(4);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(5)) {
                colorStateListX3 = c0026b2.x(5);
            }
        }
        ColorStateList colorStateList2 = colorStateListX;
        ColorStateList colorStateList3 = colorStateListX2;
        ColorStateList colorStateList4 = colorStateListX3;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        String string3 = string;
        String str = string2;
        if (i10 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string3 = typedArrayObtainStyledAttributes2.getString(13);
        }
        String str2 = string3;
        if (i10 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, c0026b2);
        c0026b2.L();
        if (colorStateList2 != null) {
            textView.setTextColor(colorStateList2);
        }
        if (colorStateList3 != null) {
            textView.setHintTextColor(colorStateList3);
        }
        if (colorStateList4 != null) {
            textView.setLinkTextColor(colorStateList4);
        }
        if (!z5 && z2) {
            this.f2745a.setAllCaps(z4);
        }
        Typeface typeface = this.f2756l;
        if (typeface != null) {
            if (this.f2755k == -1) {
                textView.setTypeface(typeface, this.f2754j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str2 != null) {
            textView.setFontVariationSettings(str2);
        }
        if (str == null) {
            i3 = 0;
        } else if (i10 >= 24) {
            textView.setTextLocales(LocaleList.forLanguageTags(str));
            i3 = 0;
        } else {
            i3 = 0;
            textView.setTextLocale(Locale.forLanguageTag(str.substring(0, str.indexOf(44))));
        }
        int[] iArr2 = a.f1743g;
        C0124v c0124v = this.f2753i;
        Context context2 = c0124v.f2781j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, i2, i3);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c0124v.f2772a = typedArrayObtainStyledAttributes3.getInt(5, i3);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(2)) {
            fApplyDimension = typedArrayObtainStyledAttributes3.getDimension(2, -1.0f);
            i4 = 1;
        } else {
            i4 = 1;
            fApplyDimension = -1.0f;
        }
        if (typedArrayObtainStyledAttributes3.hasValue(i4)) {
            fApplyDimension2 = typedArrayObtainStyledAttributes3.getDimension(i4, -1.0f);
            i5 = 3;
        } else {
            i5 = 3;
            fApplyDimension2 = -1.0f;
        }
        if (typedArrayObtainStyledAttributes3.hasValue(i5) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(i5, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i11 = 0; i11 < length; i11++) {
                    iArr3[i11] = typedArrayObtainTypedArray.getDimensionPixelSize(i11, -1);
                }
                c0124v.f2777f = C0124v.b(iArr3);
                c0124v.h();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (c0124v.f2772a == 1) {
            if (!c0124v.f2778g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (fApplyDimension == -1.0f) {
                    i6 = 2;
                    fApplyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i6 = 2;
                }
                if (fApplyDimension2 == -1.0f) {
                    fApplyDimension2 = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0124v.i(fApplyDimension, fApplyDimension2, dimension);
            }
            c0124v.g();
        }
        if (c.f24a && c0124v.f2772a != 0) {
            int[] iArr4 = c0124v.f2777f;
            if (iArr4.length > 0) {
                if (textView.getAutoSizeStepGranularity() != -1.0f) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(Math.round(c0124v.f2775d), Math.round(c0124v.f2776e), Math.round(c0124v.f2774c), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr2);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableA = resourceId4 != -1 ? c0118o.a(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableA2 = resourceId5 != -1 ? c0118o.a(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableA3 = resourceId6 != -1 ? c0118o.a(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableA4 = resourceId7 != -1 ? c0118o.a(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableA5 = resourceId8 != -1 ? c0118o.a(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableA6 = resourceId9 != -1 ? c0118o.a(context, resourceId9) : null;
        if (drawableA5 != null || drawableA6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableA5 == null) {
                drawableA5 = compoundDrawablesRelative[0];
            }
            if (drawableA2 == null) {
                drawableA2 = compoundDrawablesRelative[1];
            }
            if (drawableA6 == null) {
                drawableA6 = compoundDrawablesRelative[2];
            }
            if (drawableA4 == null) {
                drawableA4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableA5, drawableA2, drawableA6, drawableA4);
        } else if (drawableA != null || drawableA2 != null || drawableA3 != null || drawableA4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableA == null) {
                    drawableA = compoundDrawables[0];
                }
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawables[1];
                }
                if (drawableA3 == null) {
                    drawableA3 = compoundDrawables[2];
                }
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableA, drawableA2, drawableA3, drawableA4);
            } else {
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableA2, drawable2, drawableA4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = b.b(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                o.f(textView, colorStateList);
            } else if (textView instanceof t) {
                ((t) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode modeD = AbstractC0127y.d(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                o.g(textView, modeD);
            } else if (textView instanceof t) {
                ((t) textView).setSupportCompoundDrawablesTintMode(modeD);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(14, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(17, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            a1.a.y(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            a1.a.z(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
            if (dimensionPixelSize3 != fontMetricsInt) {
                textView.setLineSpacing(dimensionPixelSize3 - fontMetricsInt, 1.0f);
            }
        }
    }

    public final void e(Context context, int i2) {
        String string;
        ColorStateList colorStateListX;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, a.f1755s);
        C0026b c0026b = new C0026b(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f2745a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23 && typedArrayObtainStyledAttributes.hasValue(3) && (colorStateListX = c0026b.x(3)) != null) {
            textView.setTextColor(colorStateListX);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, c0026b);
        if (i3 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        c0026b.L();
        Typeface typeface = this.f2756l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f2754j);
        }
    }

    public final void f(Context context, C0026b c0026b) {
        String string;
        int i2 = this.f2754j;
        TypedArray typedArray = (TypedArray) c0026b.f476f;
        this.f2754j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.f2755k = i4;
            if (i4 != -1) {
                this.f2754j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f2757m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 == 1) {
                    this.f2756l = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.f2756l = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.f2756l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f2756l = null;
        int i6 = typedArray.hasValue(12) ? 12 : 10;
        int i7 = this.f2755k;
        int i8 = this.f2754j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceZ = c0026b.z(i6, this.f2754j, new C0121s(this, i7, i8));
                if (typefaceZ != null) {
                    if (i3 < 28 || this.f2755k == -1) {
                        this.f2756l = typefaceZ;
                    } else {
                        this.f2756l = Typeface.create(Typeface.create(typefaceZ, 0), this.f2755k, (this.f2754j & 2) != 0);
                    }
                }
                this.f2757m = this.f2756l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2756l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2755k == -1) {
            this.f2756l = Typeface.create(string, this.f2754j);
        } else {
            this.f2756l = Typeface.create(Typeface.create(string, 0), this.f2755k, (this.f2754j & 2) != 0);
        }
    }
}
