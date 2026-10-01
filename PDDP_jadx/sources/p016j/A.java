package p016j;

import D.b;
import D.g;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.deeprf.pddp.R;
import java.lang.reflect.Field;
import p033s.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class A extends ListView {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f2523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f2529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0128z f2530l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2531m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g f2534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f2535q;

    public A(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f2523e = new Rect();
        this.f2524f = 0;
        this.f2525g = 0;
        this.f2526h = 0;
        this.f2527i = 0;
        this.f2532n = z2;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f2529k = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    public final int a(int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i4 = 0;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i2, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i3) {
                return i3;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x012e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0144  */
    /* JADX WARN: Code duplicated, block: B:73:0x0149  */
    /* JADX WARN: Code duplicated, block: B:75:0x014d  */
    /* JADX WARN: Code duplicated, block: B:77:0x015e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0162  */
    /* JADX WARN: Code duplicated, block: B:81:0x0166  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public final boolean b(int i2, MotionEvent motionEvent) {
        boolean z2;
        View childAt;
        View childAt2;
        g gVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = false;
        if (actionMasked == 1) {
            z2 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 || z3) {
                    this.f2533o = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f2528j - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z2) {
                    if (this.f2534p == null) {
                        this.f2534p = new g(this);
                    }
                    g gVar2 = this.f2534p;
                    boolean z4 = gVar2.f41p;
                    gVar2.f41p = true;
                    gVar2.onTouch(this, motionEvent);
                } else {
                    gVar = this.f2534p;
                    if (gVar != null) {
                        if (gVar.f41p) {
                            gVar.d();
                        }
                        gVar.f41p = false;
                    }
                }
                return z2;
            }
            z2 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i2);
        if (iFindPointerIndex < 0) {
            z2 = false;
        } else {
            int x2 = (int) motionEvent.getX(iFindPointerIndex);
            int y2 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x2, y2);
            if (iPointToPosition == -1) {
                z3 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f2 = x2;
                float f3 = y2;
                this.f2533o = true;
                drawableHotspotChanged(f2, f3);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.f2528j;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f2528j = iPointToPosition;
                childAt3.drawableHotspotChanged(f2 - childAt3.getLeft(), f3 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z5 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z5) {
                    selector.setVisible(false, false);
                }
                Field field = this.f2529k;
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f2523e;
                rect.set(left, top, right, bottom);
                rect.left -= this.f2524f;
                rect.top -= this.f2525g;
                rect.right += this.f2526h;
                rect.bottom += this.f2527i;
                try {
                    boolean z6 = field.getBoolean(this);
                    if (childAt3.isEnabled() != z6) {
                        field.set(this, Boolean.valueOf(!z6));
                        if (iPointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                }
                if (z5) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    a.e(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    a.e(selector2, f2, f3);
                }
                C0128z c0128z = this.f2530l;
                if (c0128z != null) {
                    c0128z.f2788f = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z3 = false;
                z2 = true;
            }
        }
        if (z2) {
            this.f2533o = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f2528j - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f2533o = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f2528j - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z2) {
            if (this.f2534p == null) {
                this.f2534p = new g(this);
            }
            g gVar3 = this.f2534p;
            boolean z7 = gVar3.f41p;
            gVar3.f41p = true;
            gVar3.onTouch(this, motionEvent);
        } else {
            gVar = this.f2534p;
            if (gVar != null) {
                if (gVar.f41p) {
                    gVar.d();
                }
                gVar.f41p = false;
            }
        }
        return z2;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f2523e;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f2535q != null) {
            return;
        }
        super.drawableStateChanged();
        C0128z c0128z = this.f2530l;
        if (c0128z != null) {
            c0128z.f2788f = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f2533o && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f2532n || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f2532n || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f2532n || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f2532n && this.f2531m) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f2535q = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2535q == null) {
            b bVar = new b(5, this);
            this.f2535q = bVar;
            post(bVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
                Drawable selector = getSelector();
                if (selector != null && this.f2533o && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2528j = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f2535q;
        if (bVar != null) {
            A a2 = (A) bVar.f23f;
            a2.f2535q = null;
            a2.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f2531m = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0128z c0128z = null;
        if (drawable != null) {
            C0128z c0128z2 = new C0128z();
            Drawable drawable2 = c0128z2.f2787e;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0128z2.f2787e = drawable;
            drawable.setCallback(c0128z2);
            c0128z2.f2788f = true;
            c0128z = c0128z2;
        }
        this.f2530l = c0128z;
        super.setSelector(c0128z);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2524f = rect.left;
        this.f2525g = rect.top;
        this.f2526h = rect.right;
        this.f2527i = rect.bottom;
    }
}
