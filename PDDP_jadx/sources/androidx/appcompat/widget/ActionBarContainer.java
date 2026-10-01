package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.deeprf.pddp.R;
import java.lang.reflect.Field;
import p016j.C0104a;
import p016j.S;
import p042y.x;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f1180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f1181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f1182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f1183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f1184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1187m;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0104a c0104a = new C0104a(this);
        Field field = x.f3474a;
        setBackground(c0104a);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p004c.a.f1737a);
        boolean z2 = false;
        this.f1182h = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f1183i = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f1187m = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1185k = true;
            this.f1184j = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f1185k ? !(this.f1182h != null || this.f1183i != null) : this.f1184j == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1182h;
        if (drawable != null && drawable.isStateful()) {
            this.f1182h.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1183i;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1183i.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1184j;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1184j.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1182h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1183i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1184j;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1180f = findViewById(R.id.action_bar);
        this.f1181g = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1179e || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        boolean z3 = true;
        if (this.f1185k) {
            Drawable drawable = this.f1184j;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f1182h == null) {
                z3 = false;
            } else if (this.f1180f.getVisibility() == 0) {
                this.f1182h.setBounds(this.f1180f.getLeft(), this.f1180f.getTop(), this.f1180f.getRight(), this.f1180f.getBottom());
            } else {
                View view = this.f1181g;
                if (view == null || view.getVisibility() != 0) {
                    this.f1182h.setBounds(0, 0, 0, 0);
                } else {
                    this.f1182h.setBounds(this.f1181g.getLeft(), this.f1181g.getTop(), this.f1181g.getRight(), this.f1181g.getBottom());
                }
            }
            this.f1186l = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f1180f == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f1187m) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f1180f == null) {
            return;
        }
        View.MeasureSpec.getMode(i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1182h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1182h);
        }
        this.f1182h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1180f;
            if (view != null) {
                this.f1182h.setBounds(view.getLeft(), this.f1180f.getTop(), this.f1180f.getRight(), this.f1180f.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f1185k ? !(this.f1182h != null || this.f1183i != null) : this.f1184j == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1184j;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1184j);
        }
        this.f1184j = drawable;
        boolean z2 = this.f1185k;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f1184j) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f1182h != null || this.f1183i != null) : this.f1184j == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1183i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1183i);
        }
        this.f1183i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1186l && this.f1183i != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f1185k ? !(this.f1182h != null || this.f1183i != null) : this.f1184j == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z2) {
        this.f1179e = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f1182h;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f1183i;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f1184j;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1182h;
        boolean z2 = this.f1185k;
        return (drawable == drawable2 && !z2) || (drawable == this.f1183i && this.f1186l) || ((drawable == this.f1184j && z2) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public void setTabContainer(S s2) {
    }
}
