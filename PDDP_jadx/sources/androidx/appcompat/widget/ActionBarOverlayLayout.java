package androidx.appcompat.widget;

import N.C0038n;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.deeprf.pddp.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p016j.C0105b;
import p016j.C0108e;
import p016j.InterfaceC0107d;
import p016j.InterfaceC0126x;
import p016j.RunnableC0106c;
import p016j.q0;
import p016j.w0;
import p042y.AbstractC0181n;
import p042y.InterfaceC0175h;
import p042y.InterfaceC0176i;
import p042y.x;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0175h, InterfaceC0176i {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f1200C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final RunnableC0106c f1201A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0038n f1202B;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ContentFrameLayout f1204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ActionBarContainer f1205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC0126x f1206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f1207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1212n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1213o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f1214p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f1215q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f1216r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f1217s;
    public final Rect t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f1218u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f1219v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public OverScroller f1220w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ViewPropertyAnimator f1221x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0105b f1222y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RunnableC0106c f1223z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1214p = new Rect();
        this.f1215q = new Rect();
        this.f1216r = new Rect();
        this.f1217s = new Rect();
        this.t = new Rect();
        this.f1218u = new Rect();
        this.f1219v = new Rect();
        this.f1222y = new C0105b(this);
        this.f1223z = new RunnableC0106c(this, 0);
        this.f1201A = new RunnableC0106c(this, 1);
        i(context);
        this.f1202B = new C0038n(2);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0108e c0108e = (C0108e) view.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) c0108e).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((ViewGroup.MarginLayoutParams) c0108e).leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = ((ViewGroup.MarginLayoutParams) c0108e).topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) c0108e).topMargin = i5;
            z3 = true;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c0108e).rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c0108e).rightMargin = i7;
            z3 = true;
        }
        if (z2) {
            int i8 = ((ViewGroup.MarginLayoutParams) c0108e).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) c0108e).bottomMargin = i9;
                return true;
            }
        }
        return z3;
    }

    @Override // p042y.InterfaceC0175h
    public final void a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // p042y.InterfaceC0175h
    public final void b(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(viewGroup, i2, i3, i4, i5);
        }
    }

    @Override // p042y.InterfaceC0175h
    public final void c(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0108e;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f1207i == null || this.f1208j) {
            return;
        }
        if (this.f1205g.getVisibility() == 0) {
            translationY = (int) (this.f1205g.getTranslationY() + this.f1205g.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f1207i.setBounds(0, translationY, getWidth(), this.f1207i.getIntrinsicHeight() + translationY);
        this.f1207i.draw(canvas);
    }

    @Override // p042y.InterfaceC0176i
    public final void e(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        b(viewGroup, i2, i3, i4, i5, i6);
    }

    @Override // p042y.InterfaceC0175h
    public final boolean f(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        j();
        Field field = x.f3474a;
        getWindowSystemUiVisibility();
        boolean zG = g(this.f1205g, rect, false);
        Rect rect2 = this.f1217s;
        rect2.set(rect);
        Method method = w0.f2782a;
        Rect rect3 = this.f1214p;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
        Rect rect4 = this.t;
        if (!rect4.equals(rect2)) {
            rect4.set(rect2);
            zG = true;
        }
        Rect rect5 = this.f1215q;
        if (!rect5.equals(rect3)) {
            rect5.set(rect3);
            zG = true;
        }
        if (zG) {
            requestLayout();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0108e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0108e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1205g;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0038n c0038n = this.f1202B;
        return c0038n.f535c | c0038n.f534b;
    }

    public CharSequence getTitle() {
        j();
        return ((q0) this.f1206h).f2716a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1223z);
        removeCallbacks(this.f1201A);
        ViewPropertyAnimator viewPropertyAnimator = this.f1221x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1200C);
        this.f1203e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f1207i = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f1208j = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1220w = new OverScroller(context);
    }

    public final void j() {
        InterfaceC0126x wrapper;
        if (this.f1204f == null) {
            this.f1204f = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1205g = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0126x) {
                wrapper = (InterfaceC0126x) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f1206h = wrapper;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = x.f3474a;
        AbstractC0181n.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0108e c0108e = (C0108e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) c0108e).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) c0108e).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        j();
        measureChildWithMargins(this.f1205g, i2, 0, i3, 0);
        C0108e c0108e = (C0108e) this.f1205g.getLayoutParams();
        int measuredHeight = 0;
        int iMax = Math.max(0, this.f1205g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0108e).leftMargin + ((ViewGroup.MarginLayoutParams) c0108e).rightMargin);
        int iMax2 = Math.max(0, this.f1205g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0108e).topMargin + ((ViewGroup.MarginLayoutParams) c0108e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1205g.getMeasuredState());
        Field field = x.f3474a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1203e;
            if (this.f1210l && this.f1205g.getTabContainer() != null) {
                measuredHeight += this.f1203e;
            }
        } else if (this.f1205g.getVisibility() != 8) {
            measuredHeight = this.f1205g.getMeasuredHeight();
        }
        Rect rect = this.f1214p;
        Rect rect2 = this.f1216r;
        rect2.set(rect);
        Rect rect3 = this.f1218u;
        rect3.set(this.f1217s);
        if (this.f1209k || z2) {
            rect3.top += measuredHeight;
            rect3.bottom = rect3.bottom;
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
        }
        g(this.f1204f, rect2, true);
        Rect rect4 = this.f1219v;
        if (!rect4.equals(rect3)) {
            rect4.set(rect3);
            this.f1204f.a(rect3);
        }
        measureChildWithMargins(this.f1204f, i2, 0, i3, 0);
        C0108e c0108e2 = (C0108e) this.f1204f.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f1204f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0108e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0108e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f1204f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0108e2).topMargin + ((ViewGroup.MarginLayoutParams) c0108e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1204f.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i2, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f1211m || !z2) {
            return false;
        }
        this.f1220w.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1220w.getFinalY() > this.f1205g.getHeight()) {
            h();
            this.f1201A.run();
        } else {
            h();
            this.f1223z.run();
        }
        this.f1212n = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f1213o + i3;
        this.f1213o = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f1202B.f534b = i2;
        this.f1213o = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f1205g.getVisibility() != 0) {
            return false;
        }
        return this.f1211m;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1211m || this.f1212n) {
            return;
        }
        if (this.f1213o <= this.f1205g.getHeight()) {
            h();
            postDelayed(this.f1223z, 600L);
        } else {
            h();
            postDelayed(this.f1201A, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.f1205g.setTranslationY(-Math.max(0, Math.min(i2, this.f1205g.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0107d interfaceC0107d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f1210l = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f1211m) {
            this.f1211m = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        j();
        q0 q0Var = (q0) this.f1206h;
        q0Var.f2719d = i2 != 0 ? p006d.b.c(q0Var.f2716a.getContext(), i2) : null;
        q0Var.c();
    }

    public void setLogo(int i2) {
        j();
        q0 q0Var = (q0) this.f1206h;
        q0Var.f2720e = i2 != 0 ? p006d.b.c(q0Var.f2716a.getContext(), i2) : null;
        q0Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1209k = z2;
        this.f1208j = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((q0) this.f1206h).f2726k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        q0 q0Var = (q0) this.f1206h;
        if (q0Var.f2722g) {
            return;
        }
        q0Var.f2723h = charSequence;
        if ((q0Var.f2717b & 8) != 0) {
            q0Var.f2716a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0108e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        q0 q0Var = (q0) this.f1206h;
        q0Var.f2719d = drawable;
        q0Var.c();
    }

    @Override // p042y.InterfaceC0175h
    public final void d(int i2, int i3, int[] iArr, int i4) {
    }
}
