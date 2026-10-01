package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p014i.i;
import p014i.j;
import p014i.k;
import p016j.C0109f;
import p016j.C0111h;
import p016j.C0112i;
import p016j.C0114k;
import p016j.D;
import p016j.E;
import p016j.InterfaceC0113j;
import p016j.InterfaceC0115l;
import p016j.w0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends E implements i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f1224A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public InterfaceC0115l f1225B;
    public j t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Context f1226u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1227v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0112i f1228w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1229x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1230y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f1231z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1231z = (int) (56.0f * f2);
        this.f1224A = (int) (f2 * 4.0f);
        this.f1226u = context;
        this.f1227v = 0;
    }

    public static C0114k h() {
        C0114k c0114k = new C0114k(-2);
        c0114k.f2685c = false;
        c0114k.f2539b = 16;
        return c0114k;
    }

    public static C0114k i(ViewGroup.LayoutParams layoutParams) {
        C0114k c0114k;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof C0114k) {
            C0114k c0114k2 = (C0114k) layoutParams;
            c0114k = new C0114k(c0114k2);
            c0114k.f2685c = c0114k2.f2685c;
        } else {
            c0114k = new C0114k(layoutParams);
        }
        if (c0114k.f2539b <= 0) {
            c0114k.f2539b = 16;
        }
        return c0114k;
    }

    @Override // p014i.i
    public final boolean a(k kVar) {
        return this.t.p(kVar, null, 0);
    }

    @Override // p016j.E, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0114k;
    }

    @Override // p016j.E
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ D generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p016j.E
    /* JADX INFO: renamed from: e */
    public final D generateLayoutParams(AttributeSet attributeSet) {
        return new C0114k(getContext(), attributeSet);
    }

    @Override // p016j.E
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ D generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // p016j.E, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // p016j.E, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.t == null) {
            Context context = getContext();
            j jVar = new j(context);
            this.t = jVar;
            jVar.f2080e = new D.j(27, this);
            C0112i c0112i = new C0112i(context);
            this.f1228w = c0112i;
            c0112i.f2669o = true;
            c0112i.f2670p = true;
            c0112i.f2663i = new H.a(17);
            this.t.b(c0112i, this.f1226u);
            C0112i c0112i2 = this.f1228w;
            c0112i2.f2665k = this;
            this.t = c0112i2.f2661g;
        }
        return this.t;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0112i c0112i = this.f1228w;
        C0111h c0111h = c0112i.f2666l;
        if (c0111h != null) {
            return c0111h.getDrawable();
        }
        if (c0112i.f2668n) {
            return c0112i.f2667m;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1227v;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i2) {
        boolean zA = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof InterfaceC0113j)) {
            zA = ((InterfaceC0113j) childAt).a();
        }
        return (i2 <= 0 || !(childAt2 instanceof InterfaceC0113j)) ? zA : zA | ((InterfaceC0113j) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0112i c0112i = this.f1228w;
        if (c0112i != null) {
            c0112i.h();
            C0109f c0109f = this.f1228w.f2675v;
            if (c0109f == null || !c0109f.b()) {
                return;
            }
            this.f1228w.j();
            this.f1228w.k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0112i c0112i = this.f1228w;
        if (c0112i != null) {
            c0112i.j();
            C0109f c0109f = c0112i.f2676w;
            if (c0109f == null || !c0109f.b()) {
                return;
            }
            c0109f.f2132i.dismiss();
        }
    }

    @Override // p016j.E, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int paddingLeft;
        if (!this.f1229x) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i4 - i2;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean zA = w0.a(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0114k c0114k = (C0114k) childAt.getLayoutParams();
                if (c0114k.f2685c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0114k).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0114k).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0114k).leftMargin) + ((ViewGroup.MarginLayoutParams) c0114k).rightMargin;
                    j(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int iMax = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C0114k c0114k2 = (C0114k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0114k2.f2685c) {
                    int i16 = width2 - ((ViewGroup.MarginLayoutParams) c0114k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0114k2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0114k c0114k3 = (C0114k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0114k3.f2685c) {
                int i19 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) c0114k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = measuredWidth4 + ((ViewGroup.MarginLayoutParams) c0114k3).rightMargin + iMax + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // p016j.E, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        ?? r4;
        int i7;
        j jVar;
        boolean z4 = this.f1229x;
        boolean z5 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f1229x = z5;
        if (z4 != z5) {
            this.f1230y = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f1229x && (jVar = this.t) != null && size != this.f1230y) {
            this.f1230y = size;
            jVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.f1229x || childCount <= 0) {
            for (int i8 = 0; i8 < childCount; i8++) {
                C0114k c0114k = (C0114k) getChildAt(i8).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) c0114k).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) c0114k).leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.f1231z;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i14 = 0;
        int iMax2 = 0;
        int i15 = 0;
        boolean z6 = false;
        long j2 = 0;
        int i16 = 0;
        while (true) {
            i4 = this.f1224A;
            if (i15 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i15);
            int i17 = size3;
            int i18 = i9;
            if (childAt.getVisibility() != 8) {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i19 = i14 + 1;
                if (z7) {
                    childAt.setPadding(i4, 0, i4, 0);
                }
                C0114k c0114k2 = (C0114k) childAt.getLayoutParams();
                c0114k2.f2690h = false;
                c0114k2.f2687e = 0;
                c0114k2.f2686d = 0;
                c0114k2.f2688f = false;
                ((ViewGroup.MarginLayoutParams) c0114k2).leftMargin = 0;
                ((ViewGroup.MarginLayoutParams) c0114k2).rightMargin = 0;
                c0114k2.f2689g = z7 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i20 = c0114k2.f2685c ? 1 : i11;
                C0114k c0114k3 = (C0114k) childAt.getLayoutParams();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z8 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i20 <= 0 || (z8 && i20 < 2)) {
                    i7 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i20 * i13, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i7 = measuredWidth / i13;
                    if (measuredWidth % i13 != 0) {
                        i7++;
                    }
                    if (z8 && i7 < 2) {
                        i7 = 2;
                    }
                }
                c0114k3.f2688f = !c0114k3.f2685c && z8;
                c0114k3.f2686d = i7;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i13, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i7);
                if (c0114k2.f2688f) {
                    i16++;
                }
                if (c0114k2.f2685c) {
                    z6 = true;
                }
                i11 -= i7;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i7 == 1) {
                    j2 |= (long) (1 << i15);
                }
                i14 = i19;
            }
            i15++;
            size3 = i17;
            i9 = i18;
            paddingBottom = paddingBottom;
            mode = mode;
        }
        int i21 = mode;
        int i22 = i9;
        int i23 = size3;
        boolean z9 = z6 && i14 == 2;
        boolean z10 = false;
        while (true) {
            if (i16 <= 0 || i11 <= 0) {
                z2 = z10;
                break;
            }
            int i24 = Integer.MAX_VALUE;
            int i25 = 0;
            int i26 = 0;
            long j3 = 0;
            while (i26 < childCount2) {
                C0114k c0114k4 = (C0114k) getChildAt(i26).getLayoutParams();
                boolean z11 = z10;
                if (c0114k4.f2688f) {
                    int i27 = c0114k4.f2686d;
                    if (i27 < i24) {
                        j3 = 1 << i26;
                        i24 = i27;
                        i25 = 1;
                    } else if (i27 == i24) {
                        j3 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z10 = z11;
            }
            z2 = z10;
            j2 |= j3;
            if (i25 > i11) {
                break;
            }
            int i28 = i24 + 1;
            int i29 = 0;
            while (i29 < childCount2) {
                View childAt2 = getChildAt(i29);
                C0114k c0114k5 = (C0114k) childAt2.getLayoutParams();
                int i30 = iMax;
                int i31 = childMeasureSpec;
                int i32 = childCount2;
                long j4 = 1 << i29;
                if ((j3 & j4) != 0) {
                    if (z9 && c0114k5.f2689g) {
                        r4 = 1;
                        r4 = 1;
                        if (i11 == 1) {
                            childAt2.setPadding(i4 + i13, 0, i4, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c0114k5.f2686d += r4;
                    c0114k5.f2690h = r4;
                    i11--;
                } else if (c0114k5.f2686d == i28) {
                    j2 |= j4;
                }
                i29++;
                childMeasureSpec = i31;
                iMax = i30;
                childCount2 = i32;
            }
            z10 = true;
        }
        int i33 = iMax;
        int i34 = childMeasureSpec;
        int i35 = childCount2;
        boolean z12 = !z6 && i14 == 1;
        if (i11 <= 0 || j2 == 0 || (i11 >= i14 - 1 && !z12 && iMax2 <= 1)) {
            i5 = i35;
            z3 = z2;
        } else {
            float fBitCount = Long.bitCount(j2);
            if (!z12) {
                if ((j2 & 1) != 0 && !((C0114k) getChildAt(0).getLayoutParams()).f2689g) {
                    fBitCount -= 0.5f;
                }
                int i36 = i35 - 1;
                if ((j2 & ((long) (1 << i36))) != 0 && !((C0114k) getChildAt(i36).getLayoutParams()).f2689g) {
                    fBitCount -= 0.5f;
                }
            }
            int i37 = fBitCount > 0.0f ? (int) ((i11 * i13) / fBitCount) : 0;
            boolean z13 = z2;
            i5 = i35;
            for (int i38 = 0; i38 < i5; i38++) {
                if ((j2 & ((long) (1 << i38))) != 0) {
                    View childAt3 = getChildAt(i38);
                    C0114k c0114k6 = (C0114k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0114k6.f2687e = i37;
                        c0114k6.f2690h = true;
                        if (i38 == 0 && !c0114k6.f2689g) {
                            ((ViewGroup.MarginLayoutParams) c0114k6).leftMargin = (-i37) / 2;
                        }
                        z13 = true;
                    } else if (c0114k6.f2685c) {
                        c0114k6.f2687e = i37;
                        c0114k6.f2690h = true;
                        ((ViewGroup.MarginLayoutParams) c0114k6).rightMargin = (-i37) / 2;
                        z13 = true;
                    } else {
                        if (i38 != 0) {
                            ((ViewGroup.MarginLayoutParams) c0114k6).leftMargin = i37 / 2;
                        }
                        if (i38 != i5 - 1) {
                            ((ViewGroup.MarginLayoutParams) c0114k6).rightMargin = i37 / 2;
                        }
                    }
                }
            }
            z3 = z13;
        }
        if (z3) {
            int i39 = 0;
            while (i39 < i5) {
                View childAt4 = getChildAt(i39);
                C0114k c0114k7 = (C0114k) childAt4.getLayoutParams();
                if (c0114k7.f2690h) {
                    i6 = i34;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0114k7.f2686d * i13) + c0114k7.f2687e, 1073741824), i6);
                } else {
                    i6 = i34;
                }
                i39++;
                i34 = i6;
            }
        }
        setMeasuredDimension(i22, i21 != 1073741824 ? i33 : i23);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f1228w.t = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC0115l interfaceC0115l) {
        this.f1225B = interfaceC0115l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0112i c0112i = this.f1228w;
        C0111h c0111h = c0112i.f2666l;
        if (c0111h != null) {
            c0111h.setImageDrawable(drawable);
        } else {
            c0112i.f2668n = true;
            c0112i.f2667m = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
    }

    public void setPopupTheme(int i2) {
        if (this.f1227v != i2) {
            this.f1227v = i2;
            if (i2 == 0) {
                this.f1226u = getContext();
            } else {
                this.f1226u = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(C0112i c0112i) {
        this.f1228w = c0112i;
        c0112i.f2665k = this;
        this.t = c0112i.f2661g;
    }

    @Override // p016j.E, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0114k(getContext(), attributeSet);
    }
}
