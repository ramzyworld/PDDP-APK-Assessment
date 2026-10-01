package p016j;

import N.C0026b;
import a1.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import p006d.b;

/* JADX INFO: renamed from: j.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0116m extends AutoCompleteTextView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f2693g = {R.attr.popupBackground};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0117n f2694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0122t f2695f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0116m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.deeprf.pddp.R.attr.autoCompleteTextViewStyle);
        i0.a(context);
        C0026b c0026bI = C0026b.I(getContext(), attributeSet, f2693g, com.deeprf.pddp.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c0026bI.f476f).hasValue(0)) {
            setDropDownBackgroundDrawable(c0026bI.y(0));
        }
        c0026bI.L();
        C0117n c0117n = new C0117n(this);
        this.f2694e = c0117n;
        c0117n.b(attributeSet, com.deeprf.pddp.R.attr.autoCompleteTextViewStyle);
        C0122t c0122t = new C0122t(this);
        this.f2695f = c0122t;
        c0122t.d(attributeSet, com.deeprf.pddp.R.attr.autoCompleteTextViewStyle);
        c0122t.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0117n c0117n = this.f2694e;
        if (c0117n != null) {
            c0117n.a();
        }
        C0122t c0122t = this.f2695f;
        if (c0122t != null) {
            c0122t.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        j0 j0Var;
        C0117n c0117n = this.f2694e;
        if (c0117n == null || (j0Var = c0117n.f2703e) == null) {
            return null;
        }
        return j0Var.f2681a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        j0 j0Var;
        C0117n c0117n = this.f2694e;
        if (c0117n == null || (j0Var = c0117n.f2703e) == null) {
            return null;
        }
        return j0Var.f2682b;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0117n c0117n = this.f2694e;
        if (c0117n != null) {
            c0117n.f2701c = -1;
            c0117n.d(null);
            c0117n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0117n c0117n = this.f2694e;
        if (c0117n != null) {
            c0117n.c(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.M(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(b.c(getContext(), i2));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0117n c0117n = this.f2694e;
        if (c0117n != null) {
            c0117n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0117n c0117n = this.f2694e;
        if (c0117n != null) {
            c0117n.f(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0122t c0122t = this.f2695f;
        if (c0122t != null) {
            c0122t.e(context, i2);
        }
    }
}
