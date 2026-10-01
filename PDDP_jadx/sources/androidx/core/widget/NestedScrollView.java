package androidx.core.widget;

import D.e;
import D.h;
import D.i;
import D.j;
import D.k;
import D.m;
import N.C0038n;
import a1.a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import p042y.A;
import p042y.AbstractC0178k;
import p042y.AbstractC0179l;
import p042y.AbstractC0183p;
import p042y.B;
import p042y.C0170c;
import p042y.C0174g;
import p042y.C0180m;
import p042y.InterfaceC0176i;
import p042y.x;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0176i {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final float f1384F = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final h f1385G = new h();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int[] f1386H = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public m f1387A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0038n f1388B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0174g f1389C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f1390D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C0170c f1391E;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f1394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final OverScroller f1395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final EdgeEffect f1396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final EdgeEffect f1397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1398k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1400m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f1401n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public VelocityTracker f1403p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1404q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1405r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1406s;
    public final int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f1407u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1408v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f1409w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f1410x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1411y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1412z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.deeprf.pddp.R.attr.nestedScrollViewStyle);
        this.f1394g = new Rect();
        this.f1399l = true;
        this.f1400m = false;
        this.f1401n = null;
        this.f1402o = false;
        this.f1405r = true;
        this.f1408v = -1;
        this.f1409w = new int[2];
        this.f1410x = new int[2];
        this.f1391E = new C0170c(getContext(), new j(0, this));
        int i2 = Build.VERSION.SDK_INT;
        this.f1396i = i2 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f1397j = i2 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f1392e = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1395h = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1406s = viewConfiguration.getScaledTouchSlop();
        this.t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1407u = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1386H, com.deeprf.pddp.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f1388B = new C0038n(2);
        this.f1389C = new C0174g(this);
        setNestedScrollingEnabled(true);
        x.a(this, f1385G);
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    @Override // p042y.InterfaceC0175h
    public final void a(View view, View view2, int i2, int i3) {
        C0038n c0038n = this.f1388B;
        if (i3 == 1) {
            c0038n.f535c = i2;
        } else {
            c0038n.f534b = i2;
        }
        u(2, i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // p042y.InterfaceC0175h
    public final void b(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6) {
        m(i5, i6, null);
    }

    @Override // p042y.InterfaceC0175h
    public final void c(View view, int i2) {
        C0038n c0038n = this.f1388B;
        if (i2 == 1) {
            c0038n.f535c = 0;
        } else {
            c0038n.f534b = 0;
        }
        w(i2);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0084  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i2;
        int scrollRange;
        int overScrollMode;
        if (this.f1395h.isFinished()) {
            return;
        }
        this.f1395h.computeScrollOffset();
        int currY = this.f1395h.getCurrY();
        int i3 = currY - this.f1412z;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f1397j;
        EdgeEffect edgeEffect2 = this.f1396i;
        if (i3 <= 0 || a.n(edgeEffect2) == 0.0f) {
            if (i3 < 0 && a.n(edgeEffect) != 0.0f) {
                float f2 = height;
                iRound = Math.round(a.u(edgeEffect, (i3 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
                if (iRound != i3) {
                    edgeEffect.finish();
                }
            }
            this.f1412z = currY;
            iArr = this.f1410x;
            iArr[1] = 0;
            this.f1389C.c(0, i3, iArr, null, 1);
            i2 = i3 - iArr[1];
            scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                o(i2, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i2 - scrollY2;
                iArr[1] = 0;
                this.f1389C.d(0, scrollY2, 0, i4, this.f1409w, 1, iArr);
                i2 = i4 - iArr[1];
            }
            if (i2 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i2 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f1395h.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f1395h.getCurrVelocity());
                    }
                }
                this.f1395h.abortAnimation();
                w(1);
            }
            if (this.f1395h.isFinished()) {
                w(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(a.u(edgeEffect2, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i3) {
            edgeEffect2.finish();
        }
        i3 -= iRound;
        this.f1412z = currY;
        iArr = this.f1410x;
        iArr[1] = 0;
        this.f1389C.c(0, i3, iArr, null, 1);
        i2 = i3 - iArr[1];
        scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY3 = getScrollY();
            o(i2, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i5 = i2 - scrollY4;
            iArr[1] = 0;
            this.f1389C.d(0, scrollY4, 0, i5, this.f1409w, 1, iArr);
            i2 = i5 - iArr[1];
        }
        if (i2 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i2 < 0) {
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f1395h.getCurrVelocity());
                    }
                } else if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f1395h.getCurrVelocity());
                }
            } else if (i2 < 0) {
                if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f1395h.getCurrVelocity());
                }
            } else if (edgeEffect.isFinished()) {
                edgeEffect.onAbsorb((int) this.f1395h.getCurrVelocity());
            }
            this.f1395h.abortAnimation();
            w(1);
        }
        if (this.f1395h.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            w(1);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // p042y.InterfaceC0175h
    public final void d(int i2, int i3, int[] iArr, int i4) {
        this.f1389C.c(i2, i3, iArr, null, i4);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zJ;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        this.f1394g.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    zJ = false;
                } else {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        zJ = keyEvent.isAltPressed() ? j(33) : g(33);
                    } else if (keyCode != 20) {
                        if (keyCode == 62) {
                            p(keyEvent.isShiftPressed() ? 33 : 130);
                        } else if (keyCode == 92) {
                            zJ = j(33);
                        } else if (keyCode == 93) {
                            zJ = j(130);
                        } else if (keyCode == 122) {
                            p(33);
                        } else if (keyCode == 123) {
                            p(130);
                        }
                        zJ = false;
                    } else {
                        zJ = keyEvent.isAltPressed() ? j(130) : g(130);
                    }
                }
            } else if (isFocused() || keyEvent.getKeyCode() == 4) {
                zJ = false;
            } else {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) {
                    zJ = false;
                } else {
                    zJ = true;
                }
            }
        } else if (isFocused()) {
            zJ = false;
        } else {
            zJ = false;
        }
        return zJ;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f1389C.a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f1389C.b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f1389C.c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f1389C.d(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1396i;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (i.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (i.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f1397j;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (i.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (i.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // p042y.InterfaceC0176i
    public final void e(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        m(i5, i6, iArr);
    }

    @Override // p042y.InterfaceC0175h
    public final boolean f(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public final boolean g(int i2) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !l(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f1394g;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            r(h(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i2);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !l(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0038n c0038n = this.f1388B;
        return c0038n.f535c | c0038n.f534b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f1390D == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1390D = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1390D;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1389C.f(0);
    }

    public final void i(int i2) {
        if (getChildCount() > 0) {
            this.f1395h.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.f1412z = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1389C.f3464d;
    }

    public final boolean j(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1394g;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i2, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i2, int i3) {
        Rect rect = this.f1394g;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i2 >= getScrollY() && rect.top - i2 <= getScrollY() + i3;
    }

    public final void m(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1389C.d(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1408v) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f1398k = (int) motionEvent.getY(i2);
            this.f1408v = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f1403p;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i2, int i3, int i4, int i5) {
        boolean z2;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i6 = i4 + i2;
        if (i3 <= 0 && i3 >= 0) {
            z2 = false;
        } else {
            i3 = 0;
            z2 = true;
        }
        if (i6 > i5) {
            z3 = true;
        } else if (i6 < 0) {
            z3 = true;
            i5 = 0;
        } else {
            i5 = i6;
            z3 = false;
        }
        if (z3 && !this.f1389C.f(1)) {
            this.f1395h.springBack(i3, i5, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i3, i5);
        return z2 || z3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1400m = false;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x0107  */
    /* JADX WARN: Code duplicated, block: B:69:0x010c  */
    /* JADX WARN: Code duplicated, block: B:70:0x010f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0122  */
    /* JADX WARN: Code duplicated, block: B:78:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x012a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0131  */
    /* JADX WARN: Code duplicated, block: B:84:0x0134  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i2;
        float axisValue;
        int width;
        char c2;
        int iB;
        int scaledMinimumFlingVelocity;
        int deviceId;
        int source;
        InputDevice device;
        boolean z2;
        Resources resources;
        int identifier;
        int scaledMaximumFlingVelocity;
        char c3;
        boolean z3;
        VelocityTracker velocityTracker;
        float yVelocity;
        float f2;
        long j2;
        float fSqrt;
        int i3;
        if (motionEvent.getAction() != 8 || this.f1402o) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i2 = 9;
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            axisValue = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            i2 = 26;
        } else {
            i2 = 0;
            axisValue = 0.0f;
            width = 0;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        r(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i2 == 0) {
            return true;
        }
        C0170c c0170c = this.f1391E;
        c0170c.getClass();
        int source2 = motionEvent.getSource();
        int deviceId2 = motionEvent.getDeviceId();
        int i4 = c0170c.f3457f;
        int[] iArr = c0170c.f3459h;
        if (i4 == source2 && c0170c.f3458g == deviceId2 && c0170c.f3456e == i2) {
            c3 = 0;
            z3 = false;
        } else {
            Context context = c0170c.f3452a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 34) {
                Method method = B.f3420a;
                iB = A.b(viewConfiguration, deviceId3, i2, source3);
            } else {
                Method method2 = B.f3420a;
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i2, source3) == null) {
                    c2 = 0;
                    iB = Integer.MAX_VALUE;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i2 == 26) ? resources2.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier2 != 0) {
                        scaledMinimumFlingVelocity = resources2.getDimensionPixelSize(identifier2);
                        if (scaledMinimumFlingVelocity < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    } else {
                        iB = Integer.MAX_VALUE;
                    }
                    iB = scaledMinimumFlingVelocity;
                }
                iArr[c2] = iB;
                deviceId = motionEvent.getDeviceId();
                source = motionEvent.getSource();
                if (i5 >= 34) {
                    scaledMaximumFlingVelocity = A.a(viewConfiguration, deviceId, i2, source);
                } else {
                    device = InputDevice.getDevice(deviceId);
                    if (device != null || device.getMotionRange(i2, source) == null) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        resources = context.getResources();
                        if (source == 4194304 || i2 != 26) {
                            identifier = -1;
                        } else {
                            identifier = resources.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
                        }
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier != -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier != 0) {
                            int dimensionPixelSize = resources.getDimensionPixelSize(identifier);
                            scaledMaximumFlingVelocity = dimensionPixelSize >= 0 ? dimensionPixelSize : Integer.MIN_VALUE;
                        } else {
                            scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                        }
                    } else {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                c0170c.f3457f = source2;
                c0170c.f3458g = deviceId2;
                c0170c.f3456e = i2;
                c3 = 0;
                z3 = true;
            }
            c2 = 0;
            iArr[c2] = iB;
            deviceId = motionEvent.getDeviceId();
            source = motionEvent.getSource();
            if (i5 >= 34) {
                scaledMaximumFlingVelocity = A.a(viewConfiguration, deviceId, i2, source);
            } else {
                device = InputDevice.getDevice(deviceId);
                if (device != null) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z2) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                } else {
                    resources = context.getResources();
                    if (source == 4194304) {
                        identifier = -1;
                    } else {
                        identifier = -1;
                    }
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier != -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier != 0) {
                        int dimensionPixelSize2 = resources.getDimensionPixelSize(identifier);
                        scaledMaximumFlingVelocity = dimensionPixelSize2 >= 0 ? dimensionPixelSize2 : Integer.MIN_VALUE;
                    } else {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c0170c.f3457f = source2;
            c0170c.f3458g = deviceId2;
            c0170c.f3456e = i2;
            c3 = 0;
            z3 = true;
        }
        if (iArr[c3] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker2 = c0170c.f3454c;
            if (velocityTracker2 == null) {
                return true;
            }
            velocityTracker2.recycle();
            c0170c.f3454c = null;
            return true;
        }
        if (c0170c.f3454c == null) {
            c0170c.f3454c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker3 = c0170c.f3454c;
        Map map = AbstractC0179l.f3466a;
        velocityTracker3.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC0179l.f3466a;
            if (!map2.containsKey(velocityTracker3)) {
                map2.put(velocityTracker3, new C0180m());
            }
            C0180m c0180m = (C0180m) map2.get(velocityTracker3);
            c0180m.getClass();
            long eventTime = motionEvent.getEventTime();
            int i6 = c0180m.f3470d;
            long[] jArr = c0180m.f3468b;
            if (i6 != 0 && eventTime - jArr[c0180m.f3471e] > 40) {
                c0180m.f3470d = 0;
                c0180m.f3469c = 0.0f;
            }
            int i7 = (c0180m.f3471e + 1) % 20;
            c0180m.f3471e = i7;
            int i8 = c0180m.f3470d;
            if (i8 != 20) {
                c0180m.f3470d = i8 + 1;
            }
            c0180m.f3467a[i7] = motionEvent.getAxisValue(26);
            jArr[c0180m.f3471e] = eventTime;
        }
        velocityTracker3.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C0180m c0180m2 = (C0180m) AbstractC0179l.f3466a.get(velocityTracker3);
        if (c0180m2 != null) {
            int i9 = c0180m2.f3470d;
            if (i9 < 2) {
                velocityTracker = velocityTracker3;
                fSqrt = 0.0f;
            } else {
                int i10 = c0180m2.f3471e;
                int i11 = ((i10 + 20) - (i9 - 1)) % 20;
                long[] jArr2 = c0180m2.f3468b;
                long j3 = jArr2[i10];
                while (true) {
                    j2 = jArr2[i11];
                    if (j3 - j2 <= 100) {
                        break;
                    }
                    c0180m2.f3470d--;
                    i11 = (i11 + 1) % 20;
                }
                int i12 = c0180m2.f3470d;
                if (i12 < 2) {
                    velocityTracker = velocityTracker3;
                    fSqrt = 0.0f;
                } else {
                    float[] fArr = c0180m2.f3467a;
                    if (i12 == 2) {
                        int i13 = (i11 + 1) % 20;
                        long j4 = jArr2[i13];
                        if (j2 == j4) {
                            velocityTracker = velocityTracker3;
                            fSqrt = 0.0f;
                        } else {
                            velocityTracker = velocityTracker3;
                            fSqrt = fArr[i13] / (j4 - j2);
                        }
                    } else {
                        float f3 = 0.0f;
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            if (i14 >= c0180m2.f3470d - 1) {
                                break;
                            }
                            int i16 = i14 + i11;
                            long j5 = jArr2[i16 % 20];
                            int i17 = (i16 + 1) % 20;
                            if (jArr2[i17] == j5) {
                                i3 = 1;
                            } else {
                                i15++;
                                float fSqrt2 = (f3 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f3) * 2.0f));
                                float f4 = fArr[i17] / (jArr2[i17] - j5);
                                float fAbs = (Math.abs(f4) * (f4 - fSqrt2)) + f3;
                                i3 = 1;
                                if (i15 == 1) {
                                    fAbs *= 0.5f;
                                }
                                f3 = fAbs;
                            }
                            i14 += i3;
                            fArr = fArr;
                            velocityTracker3 = velocityTracker3;
                        }
                        velocityTracker = velocityTracker3;
                        fSqrt = ((float) Math.sqrt(Math.abs(f3) * 2.0f)) * (f3 < 0.0f ? -1.0f : 1.0f);
                    }
                }
            }
            float f5 = fSqrt * 1000;
            c0180m2.f3469c = f5;
            if (f5 < (-Math.abs(Float.MAX_VALUE))) {
                c0180m2.f3469c = -Math.abs(Float.MAX_VALUE);
            } else if (c0180m2.f3469c > Math.abs(Float.MAX_VALUE)) {
                c0180m2.f3469c = Math.abs(Float.MAX_VALUE);
            }
        } else {
            velocityTracker = velocityTracker3;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = AbstractC0178k.a(velocityTracker, i2);
        } else {
            VelocityTracker velocityTracker4 = velocityTracker;
            if (i2 == 0) {
                yVelocity = velocityTracker4.getXVelocity();
            } else if (i2 == 1) {
                yVelocity = velocityTracker4.getYVelocity();
            } else {
                C0180m c0180m3 = (C0180m) AbstractC0179l.f3466a.get(velocityTracker4);
                yVelocity = (c0180m3 == null || i2 != 26) ? 0.0f : c0180m3.f3469c;
            }
        }
        NestedScrollView nestedScrollView = (NestedScrollView) c0170c.f3453b.f44f;
        float f6 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
        float fSignum = Math.signum(f6);
        if (z3 || (fSignum != Math.signum(c0170c.f3455d) && fSignum != 0.0f)) {
            nestedScrollView.f1395h.abortAnimation();
        }
        if (Math.abs(f6) < iArr[0]) {
            return true;
        }
        int i18 = iArr[1];
        float fMax = Math.max(-i18, Math.min(f6, i18));
        if (fMax == 0.0f) {
            f2 = 0.0f;
        } else {
            nestedScrollView.f1395h.abortAnimation();
            nestedScrollView.i((int) fMax);
            f2 = fMax;
        }
        c0170c.f3455d = f2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:70:0x012d  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f1402o) {
            return true;
        }
        int i2 = action & 255;
        if (i2 == 0) {
            int y2 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 < childAt.getTop() - scrollY || y2 >= childAt.getBottom() - scrollY || x2 < childAt.getLeft() || x2 >= childAt.getRight()) {
                    if (!v(motionEvent) && this.f1395h.isFinished()) {
                        z2 = false;
                    }
                    this.f1402o = z2;
                    velocityTracker = this.f1403p;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f1403p = null;
                    }
                } else {
                    this.f1398k = y2;
                    this.f1408v = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f1403p;
                    if (velocityTracker3 == null) {
                        this.f1403p = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f1403p.addMovement(motionEvent);
                    this.f1395h.computeScrollOffset();
                    if (!v(motionEvent) && this.f1395h.isFinished()) {
                        z2 = false;
                    }
                    this.f1402o = z2;
                    u(2, 0);
                }
            } else {
                if (!v(motionEvent)) {
                    z2 = false;
                }
                this.f1402o = z2;
                velocityTracker = this.f1403p;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f1403p = null;
                }
            }
        } else if (i2 == 1) {
            this.f1402o = false;
            this.f1408v = -1;
            velocityTracker2 = this.f1403p;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f1403p = null;
            }
            if (this.f1395h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i2 == 2) {
            int i3 = this.f1408v;
            if (i3 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y3 - this.f1398k) > this.f1406s && (2 & getNestedScrollAxes()) == 0) {
                        this.f1402o = true;
                        this.f1398k = y3;
                        if (this.f1403p == null) {
                            this.f1403p = VelocityTracker.obtain();
                        }
                        this.f1403p.addMovement(motionEvent);
                        this.f1411y = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i2 == 3) {
            this.f1402o = false;
            this.f1408v = -1;
            velocityTracker2 = this.f1403p;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f1403p = null;
            }
            if (this.f1395h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i2 == 6) {
            n(motionEvent);
        }
        return this.f1402o;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredHeight;
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.f1399l = false;
        View view = this.f1401n;
        if (view != null && k(view, this)) {
            View view2 = this.f1401n;
            Rect rect = this.f1394g;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        this.f1401n = null;
        if (!this.f1400m) {
            if (this.f1387A != null) {
                scrollTo(getScrollX(), this.f1387A.f46a);
                this.f1387A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i6 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1400m = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1404q && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        i((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.f1389C.b(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        this.f1389C.c(i2, i3, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        m(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (viewFindNextFocus != null && l(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i2, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.getSuperState());
        this.f1387A = mVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f46a = getScrollY();
        return mVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !l(viewFindFocus, 0, i5)) {
            return;
        }
        Rect rect = this.f1394g;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iH = h(rect);
        if (iH != 0) {
            if (this.f1405r) {
                t(0, iH, false);
            } else {
                scrollBy(0, iH);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f1403p == null) {
            this.f1403p = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1411y = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f2 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f1411y);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f1397j;
            EdgeEffect edgeEffect2 = this.f1396i;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1403p;
                velocityTracker.computeCurrentVelocity(1000, this.f1407u);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1408v);
                if (Math.abs(yVelocity) >= this.t) {
                    if (a.n(edgeEffect2) != 0.0f) {
                        if (s(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (a.n(edgeEffect) != 0.0f) {
                        int i2 = -yVelocity;
                        if (s(edgeEffect, i2)) {
                            edgeEffect.onAbsorb(i2);
                        } else {
                            i(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f3 = i3;
                        if (!this.f1389C.b(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            i(i3);
                        }
                    }
                } else if (this.f1395h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1408v = -1;
                this.f1402o = false;
                VelocityTracker velocityTracker2 = this.f1403p;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1403p = null;
                }
                w(0);
                this.f1396i.onRelease();
                this.f1397j.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1408v);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1408v + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int i4 = this.f1398k - y2;
                    float x2 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i4 / getHeight();
                    if (a.n(edgeEffect2) != 0.0f) {
                        float f4 = -a.u(edgeEffect2, -height, x2);
                        if (a.n(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f2 = f4;
                    } else if (a.n(edgeEffect) != 0.0f) {
                        float fU = a.u(edgeEffect, height, 1.0f - x2);
                        if (a.n(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f2 = fU;
                    }
                    int iRound = Math.round(f2 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i5 = i4 - iRound;
                    if (!this.f1402o && Math.abs(i5) > this.f1406s) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1402o = true;
                        i5 = i5 > 0 ? i5 - this.f1406s : i5 + this.f1406s;
                    }
                    if (this.f1402o) {
                        int iR = r(i5, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f1398k = y2 - iR;
                        this.f1411y += iR;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1402o && getChildCount() > 0 && this.f1395h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1408v = -1;
                this.f1402o = false;
                VelocityTracker velocityTracker3 = this.f1403p;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1403p = null;
                }
                w(0);
                this.f1396i.onRelease();
                this.f1397j.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1398k = (int) motionEvent.getY(actionIndex);
                this.f1408v = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f1398k = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1408v));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1402o && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1395h.isFinished()) {
                this.f1395h.abortAnimation();
                w(1);
            }
            int y3 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f1398k = y3;
            this.f1408v = pointerId;
            u(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1403p;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1394g;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i3 = rect.top;
        int i4 = height + i3;
        rect.bottom = i4;
        q(i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean q(int i2, int i3, int i4) {
        boolean z2;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z3 = i2 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i3 < bottom && top < i4) {
                boolean z5 = i3 < top && bottom < i4;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5 && z6) {
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else if (z6) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i3 < scrollY || i4 > i5) {
            r(z3 ? i3 - scrollY : i4 - i5, 0, 1, true);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i2);
        }
        return z2;
    }

    public final int r(int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        boolean z3;
        VelocityTracker velocityTracker;
        if (i4 == 1) {
            u(2, i4);
        }
        boolean zC = this.f1389C.c(0, i2, this.f1410x, this.f1409w, i4);
        int[] iArr = this.f1410x;
        int[] iArr2 = this.f1409w;
        if (zC) {
            i5 = i2 - iArr[1];
            i6 = iArr2[1];
        } else {
            i5 = i2;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2;
        boolean z5 = o(i5, 0, scrollY, scrollRange) && !this.f1389C.f(i4);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f1389C.d(0, scrollY2, 0, i5 - scrollY2, this.f1409w, i4, iArr);
        int i7 = i6 + iArr2[1];
        int i8 = i5 - iArr[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.f1397j;
        EdgeEffect edgeEffect2 = this.f1396i;
        if (i9 < 0) {
            if (z4) {
                a.u(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z4) {
            a.u(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z3 = z5;
        } else {
            postInvalidateOnAnimation();
            z3 = false;
        }
        if (z3 && i4 == 0 && (velocityTracker = this.f1403p) != null) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            w(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f1399l) {
            this.f1401n = view2;
        } else {
            Rect rect = this.f1394g;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iH = h(rect);
        boolean z3 = iH != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, iH);
            } else {
                t(0, iH, false);
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f1403p) != null) {
            velocityTracker.recycle();
            this.f1403p = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1399l = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float fN = a.n(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i2) * 0.35f;
        float f2 = this.f1392e * 0.015f;
        double dLog = Math.log(fAbs / f2);
        double d2 = f1384F;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * dLog) * ((double) f2))) < fN;
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i2 < 0) {
                i2 = 0;
            } else if (width + i2 > width2) {
                i2 = width2 - width;
            }
            if (height >= height2 || i3 < 0) {
                i3 = 0;
            } else if (height + i3 > height2) {
                i3 = height2 - height;
            }
            if (i2 == getScrollX() && i3 == getScrollY()) {
                return;
            }
            super.scrollTo(i2, i3);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f1404q) {
            this.f1404q = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0174g c0174g = this.f1389C;
        if (c0174g.f3464d) {
            Field field = x.f3474a;
            AbstractC0183p.z(c0174g.f3463c);
        }
        c0174g.f3464d = z2;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f1405r = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return this.f1389C.g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i2, int i3, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1393f > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1395h.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                u(2, 1);
            } else {
                w(1);
            }
            this.f1412z = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f1395h.isFinished()) {
                this.f1395h.abortAnimation();
                w(1);
            }
            scrollBy(i2, i3);
        }
        this.f1393f = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void u(int i2, int i3) {
        this.f1389C.g(2, i3);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1396i;
        if (a.n(edgeEffect) != 0.0f) {
            a.u(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f1397j;
        if (a.n(edgeEffect2) == 0.0f) {
            return z2;
        }
        a.u(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i2) {
        this.f1389C.h(i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(k kVar) {
    }
}
