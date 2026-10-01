package p016j;

import D.c;
import D.o;
import D.t;
import N.Q;
import a1.a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p031r.e;
import p040w.b;

/* JADX INFO: renamed from: j.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0123u extends TextView implements t, c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0117n f2765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0122t f2766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Q f2767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Future f2768h;

    public C0123u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public final void d() {
        Future future = this.f2768h;
        if (future == null) {
            return;
        }
        try {
            this.f2768h = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            a.p(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0117n c0117n = this.f2765e;
        if (c0117n != null) {
            c0117n.a();
        }
        C0122t c0122t = this.f2766f;
        if (c0122t != null) {
            c0122t.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (c.f24a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0122t c0122t = this.f2766f;
        if (c0122t != null) {
            return Math.round(c0122t.f2753i.f2776e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (c.f24a) {
            return super.getAutoSizeMinTextSize();
        }
        C0122t c0122t = this.f2766f;
        if (c0122t != null) {
            return Math.round(c0122t.f2753i.f2775d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (c.f24a) {
            return super.getAutoSizeStepGranularity();
        }
        C0122t c0122t = this.f2766f;
        if (c0122t != null) {
            return Math.round(c0122t.f2753i.f2774c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (c.f24a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0122t c0122t = this.f2766f;
        return c0122t != null ? c0122t.f2753i.f2777f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (c.f24a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0122t c0122t = this.f2766f;
        if (c0122t != null) {
            return c0122t.f2753i.f2772a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        j0 j0Var;
        C0117n c0117n = this.f2765e;
        if (c0117n == null || (j0Var = c0117n.f2703e) == null) {
            return null;
        }
        return j0Var.f2681a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        j0 j0Var;
        C0117n c0117n = this.f2765e;
        if (c0117n == null || (j0Var = c0117n.f2703e) == null) {
            return null;
        }
        return j0Var.f2682b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        j0 j0Var = this.f2766f.f2752h;
        if (j0Var != null) {
            return j0Var.f2681a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        j0 j0Var = this.f2766f.f2752h;
        if (j0Var != null) {
            return j0Var.f2682b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        d();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        Q q2;
        if (Build.VERSION.SDK_INT >= 28 || (q2 = this.f2767g) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) q2.f472g;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((C0123u) q2.f471f).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public p040w.a getTextMetricsParamsCompat() {
        return a.p(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C0122t c0122t = this.f2766f;
        if (c0122t == null || c.f24a) {
            return;
        }
        c0122t.f2753i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        d();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0122t c0122t = this.f2766f;
        if (c0122t == null || c.f24a) {
            return;
        }
        C0124v c0124v = c0122t.f2753i;
        if (c0124v.f2772a != 0) {
            c0124v.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (c.f24a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        C0122t c0122t = this.f2766f;
        if (c0122t != null) {
            C0124v c0124v = c0122t.f2753i;
            DisplayMetrics displayMetrics = c0124v.f2781j.getResources().getDisplayMetrics();
            c0124v.i(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (c0124v.g()) {
                c0124v.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (c.f24a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        C0122t c0122t = this.f2766f;
        if (c0122t != null) {
            C0124v c0124v = c0122t.f2753i;
            c0124v.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i2 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0124v.f2781j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArrCopyOf[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                c0124v.f2777f = C0124v.b(iArrCopyOf);
                if (!c0124v.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0124v.f2778g = false;
            }
            if (c0124v.g()) {
                c0124v.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (c.f24a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C0122t c0122t = this.f2766f;
        if (c0122t != null) {
            C0124v c0124v = c0122t.f2753i;
            if (i2 == 0) {
                c0124v.f2772a = 0;
                c0124v.f2775d = -1.0f;
                c0124v.f2776e = -1.0f;
                c0124v.f2774c = -1.0f;
                c0124v.f2777f = new int[0];
                c0124v.f2773b = false;
                return;
            }
            if (i2 != 1) {
                c0124v.getClass();
                throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
            }
            DisplayMetrics displayMetrics = c0124v.f2781j.getResources().getDisplayMetrics();
            c0124v.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0124v.g()) {
                c0124v.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0117n c0117n = this.f2765e;
        if (c0117n != null) {
            c0117n.f2701c = -1;
            c0117n.d(null);
            c0117n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0117n c0117n = this.f2765e;
        if (c0117n != null) {
            c0117n.c(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0122t c0122t = this.f2766f;
        if (c0122t != null) {
            c0122t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0122t c0122t = this.f2766f;
        if (c0122t != null) {
            c0122t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0122t c0122t = this.f2766f;
        if (c0122t != null) {
            c0122t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0122t c0122t = this.f2766f;
        if (c0122t != null) {
            c0122t.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.M(callback, this));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            a.y(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            a.z(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i2 != fontMetricsInt) {
            setLineSpacing(i2 - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        a.p(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0117n c0117n = this.f2765e;
        if (c0117n != null) {
            c0117n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0117n c0117n = this.f2765e;
        if (c0117n != null) {
            c0117n.f(mode);
        }
    }

    @Override // D.t
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0122t c0122t = this.f2766f;
        if (c0122t.f2752h == null) {
            c0122t.f2752h = new j0();
        }
        j0 j0Var = c0122t.f2752h;
        j0Var.f2681a = colorStateList;
        j0Var.f2684d = colorStateList != null;
        c0122t.f2746b = j0Var;
        c0122t.f2747c = j0Var;
        c0122t.f2748d = j0Var;
        c0122t.f2749e = j0Var;
        c0122t.f2750f = j0Var;
        c0122t.f2751g = j0Var;
        c0122t.b();
    }

    @Override // D.t
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0122t c0122t = this.f2766f;
        if (c0122t.f2752h == null) {
            c0122t.f2752h = new j0();
        }
        j0 j0Var = c0122t.f2752h;
        j0Var.f2682b = mode;
        j0Var.f2683c = mode != null;
        c0122t.f2746b = j0Var;
        c0122t.f2747c = j0Var;
        c0122t.f2748d = j0Var;
        c0122t.f2749e = j0Var;
        c0122t.f2750f = j0Var;
        c0122t.f2751g = j0Var;
        c0122t.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0122t c0122t = this.f2766f;
        if (c0122t != null) {
            c0122t.e(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        Q q2;
        if (Build.VERSION.SDK_INT >= 28 || (q2 = this.f2767g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            q2.f472g = textClassifier;
        }
    }

    public void setTextFuture(Future<b> future) {
        this.f2768h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(p040w.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.f3408b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i2 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i2 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        int i3 = Build.VERSION.SDK_INT;
        TextPaint textPaint = aVar.f3407a;
        if (i3 >= 23) {
            getPaint().set(textPaint);
            o.e(this, aVar.f3409c);
            o.h(this, aVar.f3410d);
        } else {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f2) {
        boolean z2 = c.f24a;
        if (z2) {
            super.setTextSize(i2, f2);
            return;
        }
        C0122t c0122t = this.f2766f;
        if (c0122t == null || z2) {
            return;
        }
        C0124v c0124v = c0122t.f2753i;
        if (c0124v.f2772a != 0) {
            return;
        }
        c0124v.f(i2, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typefaceCreate;
        if (typeface == null || i2 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            a aVar = e.f3042a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i2);
        }
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        super.setTypeface(typeface, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0123u(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        i0.a(context);
        C0117n c0117n = new C0117n(this);
        this.f2765e = c0117n;
        c0117n.b(attributeSet, i2);
        C0122t c0122t = new C0122t(this);
        this.f2766f = c0122t;
        c0122t.d(attributeSet, i2);
        c0122t.b();
        Q q2 = new Q(11, false);
        q2.f471f = this;
        this.f2767g = q2;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? p006d.b.c(context, i2) : null, i3 != 0 ? p006d.b.c(context, i3) : null, i4 != 0 ? p006d.b.c(context, i4) : null, i5 != 0 ? p006d.b.c(context, i5) : null);
        C0122t c0122t = this.f2766f;
        if (c0122t != null) {
            c0122t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? p006d.b.c(context, i2) : null, i3 != 0 ? p006d.b.c(context, i3) : null, i4 != 0 ? p006d.b.c(context, i4) : null, i5 != 0 ? p006d.b.c(context, i5) : null);
        C0122t c0122t = this.f2766f;
        if (c0122t != null) {
            c0122t.b();
        }
    }
}
