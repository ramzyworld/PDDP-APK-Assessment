package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deeprf.pddp.R;
import java.lang.reflect.Field;
import p016j.w0;
import p042y.x;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f1191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f1192i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f1193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f1194k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f1195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f1196m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f1197n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1198o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1199p;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p004c.a.f1740d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : p006d.b.c(context, resourceId);
        Field field = x.f3474a;
        setBackground(drawable);
        this.f1197n = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f1198o = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f1188e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int b(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public final void a() {
        if (this.f1194k == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1194k = linearLayout;
            this.f1195l = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1196m = (TextView) this.f1194k.findViewById(R.id.action_bar_subtitle);
            int i2 = this.f1197n;
            if (i2 != 0) {
                this.f1195l.setTextAppearance(getContext(), i2);
            }
            int i3 = this.f1198o;
            if (i3 != 0) {
                this.f1196m.setTextAppearance(getContext(), i3);
            }
        }
        this.f1195l.setText(this.f1191h);
        this.f1196m.setText(this.f1192i);
        boolean zIsEmpty = TextUtils.isEmpty(this.f1191h);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f1192i);
        this.f1196m.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f1194k.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f1194k.getParent() == null) {
            addView(this.f1194k);
        }
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            super.setVisibility(i2);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1188e;
    }

    public CharSequence getSubtitle() {
        return this.f1192i;
    }

    public CharSequence getTitle() {
        return this.f1191h;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, p004c.a.f1737a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1190g = false;
        }
        if (!this.f1190g) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1190g = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1190g = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f1191h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean zA = w0.a(this);
        int paddingRight = zA ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f1194k;
        if (linearLayout != null && this.f1193j == null && linearLayout.getVisibility() != 8) {
            paddingRight += b(this.f1194k, paddingRight, paddingTop, paddingTop2, zA);
        }
        View view = this.f1193j;
        if (view != null) {
            b(view, paddingRight, paddingTop, paddingTop2, zA);
        }
        if (zA) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.f1188e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i3);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f1194k;
        if (linearLayout != null && this.f1193j == null) {
            if (this.f1199p) {
                this.f1194k.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f1194k.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1194k.setVisibility(z2 ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), iMakeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f1193j;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.f1193j.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.f1188e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1189f = false;
        }
        if (!this.f1189f) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1189f = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1189f = false;
        }
        return true;
    }

    public void setContentHeight(int i2) {
        this.f1188e = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1193j;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1193j = view;
        if (view != null && (linearLayout = this.f1194k) != null) {
            removeView(linearLayout);
            this.f1194k = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1192i = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1191h = charSequence;
        a();
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1199p) {
            requestLayout();
        }
        this.f1199p = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
