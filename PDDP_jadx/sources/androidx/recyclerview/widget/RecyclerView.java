package androidx.recyclerview.widget;

import D.b;
import D.d;
import D.j;
import H.a;
import I0.i;
import N.A;
import N.AbstractC0042s;
import N.C;
import N.C0026b;
import N.C0027c;
import N.C0028d;
import N.C0032h;
import N.C0034j;
import N.D;
import N.E;
import N.F;
import N.G;
import N.H;
import N.I;
import N.K;
import N.RunnableC0036l;
import N.S;
import N.r;
import N.t;
import N.u;
import N.v;
import N.x;
import N.z;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p042y.AbstractC0183p;
import p042y.B;
import p042y.C0174g;
import p042y.y;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int[] f1639l0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int[] f1640m0 = {R.attr.clipToPadding};

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final boolean f1641n0 = true;
    public static final Class[] o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final r f1642p0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f1643A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f1644B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public u f1645C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public EdgeEffect f1646D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public EdgeEffect f1647E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public EdgeEffect f1648F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public EdgeEffect f1649G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public v f1650H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f1651I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f1652J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public VelocityTracker f1653K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f1654L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f1655M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f1656N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f1657O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f1658P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f1659Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final int f1660R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final float f1661S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final float f1662T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f1663U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final I f1664V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public RunnableC0036l f1665W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final C0034j f1666a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final G f1667b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ArrayList f1668c0;
    public final a d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D f1669e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public K f1670e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public F f1671f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public C0174g f1672f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0026b f1673g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final int[] f1674g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0026b f1675h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int[] f1676h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f1677i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final int[] f1678i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1679j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final ArrayList f1680j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Rect f1681k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final b f1682k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f1683l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x f1684m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f1685n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f1686o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0032h f1687p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1688q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1689r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1690s;
    public int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1691u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1692v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1693w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AccessibilityManager f1694x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1695y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1696z;

    static {
        Class cls = Integer.TYPE;
        o0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1642p0 = new r();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public RecyclerView(Context context, AttributeSet attributeSet) throws NoSuchMethodException {
        float fA;
        boolean z2;
        int i2;
        ?? r15;
        char c2;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, 0);
        int i3 = 8;
        int i4 = 2;
        this.f1669e = new D(this);
        this.f1677i = new a();
        this.f1681k = new Rect();
        this.f1683l = new Rect();
        new RectF();
        this.f1685n = new ArrayList();
        this.f1686o = new ArrayList();
        this.t = 0;
        this.f1695y = false;
        this.f1696z = false;
        this.f1643A = 0;
        this.f1644B = 0;
        this.f1645C = new u();
        C0028d c0028d = new C0028d();
        c0028d.f546a = null;
        c0028d.f547b = new ArrayList();
        c0028d.f548c = 250L;
        c0028d.f549d = 250L;
        c0028d.f481e = new ArrayList();
        c0028d.f482f = new ArrayList();
        c0028d.f483g = new ArrayList();
        c0028d.f484h = new ArrayList();
        c0028d.f485i = new ArrayList();
        c0028d.f486j = new ArrayList();
        c0028d.f487k = new ArrayList();
        c0028d.f488l = new ArrayList();
        c0028d.f489m = new ArrayList();
        c0028d.f490n = new ArrayList();
        c0028d.f491o = new ArrayList();
        this.f1650H = c0028d;
        this.f1651I = 0;
        this.f1652J = -1;
        this.f1661S = Float.MIN_VALUE;
        this.f1662T = Float.MIN_VALUE;
        this.f1663U = true;
        this.f1664V = new I(this);
        this.f1666a0 = f1641n0 ? new C0034j() : null;
        G g2 = new G();
        g2.f430a = 0;
        g2.f431b = false;
        g2.f432c = false;
        g2.f433d = false;
        g2.f434e = false;
        this.f1667b0 = g2;
        a aVar = new a(10);
        this.d0 = aVar;
        this.f1674g0 = new int[2];
        this.f1676h0 = new int[2];
        this.f1678i0 = new int[2];
        this.f1680j0 = new ArrayList();
        this.f1682k0 = new b(i4, this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1640m0, 0, 0);
            this.f1679j = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f1679j = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1658P = viewConfiguration.getScaledTouchSlop();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            Method method = B.f3420a;
            fA = y.a(viewConfiguration);
        } else {
            fA = B.a(viewConfiguration, context);
        }
        this.f1661S = fA;
        this.f1662T = i5 >= 26 ? y.b(viewConfiguration) : B.a(viewConfiguration, context);
        this.f1659Q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1660R = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1650H.f546a = aVar;
        this.f1673g = new C0026b(new a(9, this));
        this.f1675h = new C0026b(new j(i3, this));
        Field field = p042y.x.f3474a;
        if ((i5 >= 26 ? p042y.r.c(this) : 0) == 0 && i5 >= 26) {
            p042y.r.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1694x = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new K(this));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, M.a.f412a, 0, 0);
            String string = typedArrayObtainStyledAttributes2.getString(7);
            if (typedArrayObtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (typedArrayObtainStyledAttributes2.getBoolean(2, false)) {
                StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(5);
                Drawable drawable = typedArrayObtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = typedArrayObtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + h());
                }
                Resources resources = getContext().getResources();
                c2 = 3;
                i2 = 4;
                r15 = 1;
                new C0032h(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.deeprf.pddp.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.deeprf.pddp.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.deeprf.pddp.R.dimen.fastscroll_margin));
            } else {
                i2 = 4;
                r15 = 1;
                c2 = 3;
            }
            typedArrayObtainStyledAttributes2.recycle();
            if (string != null) {
                String strTrim = string.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.charAt(0) == '.') {
                        strTrim = context.getPackageName() + strTrim;
                    } else if (!strTrim.contains(".")) {
                        strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                    }
                    try {
                        Class<? extends U> clsAsSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(strTrim).asSubclass(x.class);
                        try {
                            Constructor constructor2 = clsAsSubclass.getConstructor(o0);
                            objArr = new Object[i2];
                            objArr[0] = context;
                            objArr[r15] = attributeSet;
                            objArr[2] = 0;
                            objArr[c2] = 0;
                            constructor = constructor2;
                        } catch (NoSuchMethodException e2) {
                            try {
                                constructor = clsAsSubclass.getConstructor(null);
                                objArr = null;
                            } catch (NoSuchMethodException e3) {
                                e3.initCause(e2);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e3);
                            }
                        }
                        constructor.setAccessible(r15);
                        setLayoutManager((x) constructor.newInstance(objArr));
                    } catch (ClassCastException e4) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e4);
                    } catch (ClassNotFoundException e5) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e5);
                    } catch (IllegalAccessException e6) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e6);
                    } catch (InstantiationException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e7);
                    } catch (InvocationTargetException e8) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e8);
                    }
                }
            }
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f1639l0, 0, 0);
            z2 = typedArrayObtainStyledAttributes3.getBoolean(0, r15);
            typedArrayObtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
            z2 = true;
        }
        setNestedScrollingEnabled(z2);
    }

    private C0174g getScrollingChildHelper() {
        if (this.f1672f0 == null) {
            this.f1672f0 = new C0174g(this);
        }
        return this.f1672f0;
    }

    public static void j(View view) {
        if (view == null) {
            return;
        }
        ((N.y) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        x xVar = this.f1684m;
        if (xVar != null) {
            xVar.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    public final void b(String str) {
        if (this.f1643A > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
        }
        if (this.f1644B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + h()));
        }
    }

    public final void c(int i2, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f1646D;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            zIsFinished = false;
        } else {
            this.f1646D.onRelease();
            zIsFinished = this.f1646D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1648F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.f1648F.onRelease();
            zIsFinished |= this.f1648F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1647E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.f1647E.onRelease();
            zIsFinished |= this.f1647E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1649G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.f1649G.onRelease();
            zIsFinished |= this.f1649G.isFinished();
        }
        if (zIsFinished) {
            Field field = p042y.x.f3474a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof N.y) && this.f1684m.d((N.y) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        x xVar = this.f1684m;
        if (xVar != null && xVar.b()) {
            return this.f1684m.f(this.f1667b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        x xVar = this.f1684m;
        if (xVar != null && xVar.b()) {
            this.f1684m.g(this.f1667b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        x xVar = this.f1684m;
        if (xVar != null && xVar.b()) {
            return this.f1684m.h(this.f1667b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        x xVar = this.f1684m;
        if (xVar != null && xVar.c()) {
            return this.f1684m.i(this.f1667b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        x xVar = this.f1684m;
        if (xVar != null && xVar.c()) {
            this.f1684m.j(this.f1667b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        x xVar = this.f1684m;
        if (xVar != null && xVar.c()) {
            return this.f1684m.k(this.f1667b0);
        }
        return 0;
    }

    public final void d() {
        C0026b c0026b = this.f1673g;
        if (!this.f1690s || this.f1695y) {
            int i2 = p036u.b.f3078a;
            Trace.beginSection("RV FullInvalidate");
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            Trace.endSection();
            return;
        }
        if (((ArrayList) c0026b.f476f).size() > 0) {
            c0026b.getClass();
            if (((ArrayList) c0026b.f476f).size() > 0) {
                int i3 = p036u.b.f3078a;
                Trace.beginSection("RV FullInvalidate");
                Log.e("RecyclerView", "No adapter attached; skipping layout");
                Trace.endSection();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().d(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        ArrayList arrayList = this.f1685n;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0032h c0032h = (C0032h) arrayList.get(i2);
            if (c0032h.f508l != c0032h.f510n.getWidth() || c0032h.f509m != c0032h.f510n.getHeight()) {
                c0032h.f508l = c0032h.f510n.getWidth();
                c0032h.f509m = c0032h.f510n.getHeight();
                c0032h.e(0);
            } else if (c0032h.f517v != 0) {
                if (c0032h.f511o) {
                    int i3 = c0032h.f508l;
                    int i4 = c0032h.f500d;
                    int i5 = i3 - i4;
                    int i6 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable = c0032h.f498b;
                    stateListDrawable.setBounds(0, 0, i4, 0);
                    int i7 = c0032h.f509m;
                    Drawable drawable = c0032h.f499c;
                    drawable.setBounds(0, 0, c0032h.f501e, i7);
                    RecyclerView recyclerView = c0032h.f510n;
                    Field field = p042y.x.f3474a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i4, i6);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate(-i4, -i6);
                    } else {
                        canvas.translate(i5, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i6);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i5, -i6);
                    }
                }
                if (c0032h.f512p) {
                    int i8 = c0032h.f509m;
                    int i9 = c0032h.f504h;
                    int i10 = i8 - i9;
                    int i11 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable2 = c0032h.f502f;
                    stateListDrawable2.setBounds(0, 0, 0, i9);
                    int i12 = c0032h.f508l;
                    Drawable drawable2 = c0032h.f503g;
                    drawable2.setBounds(0, 0, i12, c0032h.f505i);
                    canvas.translate(0.0f, i10);
                    drawable2.draw(canvas);
                    canvas.translate(i11, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i11, -i10);
                }
            }
        }
        EdgeEffect edgeEffect = this.f1646D;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f1679j ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1646D;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f1647E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f1679j) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1647E;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f1648F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1679j ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1648F;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f1649G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1679j) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1649G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.f1650H == null || arrayList.size() <= 0 || !this.f1650H.b()) ? z2 : true) {
            Field field2 = p042y.x.f3474a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = p042y.x.f3474a;
        setMeasuredDimension(x.e(i2, paddingRight, getMinimumWidth()), x.e(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i2) {
        int i3;
        this.f1684m.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i2);
        if (viewFindNextFocus != null && !viewFindNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i2);
            }
            o(viewFindNextFocus, null);
            return view;
        }
        if (viewFindNextFocus != null && viewFindNextFocus != this && i(viewFindNextFocus) != null) {
            if (view == null || i(view) == null) {
                return viewFindNextFocus;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f1681k;
            byte b2 = 0;
            rect.set(0, 0, width, height);
            int width2 = viewFindNextFocus.getWidth();
            int height2 = viewFindNextFocus.getHeight();
            Rect rect2 = this.f1683l;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect2);
            RecyclerView recyclerView = this.f1684m.f553b;
            Field field = p042y.x.f3474a;
            int i4 = recyclerView.getLayoutDirection() == 1 ? -1 : 1;
            int i5 = rect.left;
            int i6 = rect2.left;
            if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
                i3 = 1;
            } else {
                int i7 = rect.right;
                int i8 = rect2.right;
                i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
            }
            int i9 = rect.top;
            int i10 = rect2.top;
            if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
                b2 = 1;
            } else {
                int i11 = rect.bottom;
                int i12 = rect2.bottom;
                if ((i11 > i12 || i9 >= i12) && i9 > i10) {
                    b2 = -1;
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 17) {
                        if (i2 != 33) {
                            if (i2 != 66) {
                                if (i2 != 130) {
                                    throw new IllegalArgumentException("Invalid direction: " + i2 + h());
                                }
                                if (b2 > 0) {
                                    return viewFindNextFocus;
                                }
                            } else if (i3 > 0) {
                                return viewFindNextFocus;
                            }
                        } else if (b2 < 0) {
                            return viewFindNextFocus;
                        }
                    } else if (i3 < 0) {
                        return viewFindNextFocus;
                    }
                } else {
                    if (b2 > 0) {
                        return viewFindNextFocus;
                    }
                    if (b2 == 0 && i3 * i4 >= 0) {
                        return viewFindNextFocus;
                    }
                }
            } else {
                if (b2 < 0) {
                    return viewFindNextFocus;
                }
                if (b2 == 0 && i3 * i4 <= 0) {
                    return viewFindNextFocus;
                }
            }
        }
        return super.focusSearch(view, i2);
    }

    public final boolean g(int[] iArr, int i2) {
        return getScrollingChildHelper().d(0, 0, 0, 0, iArr, i2, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        x xVar = this.f1684m;
        if (xVar != null) {
            return xVar.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        x xVar = this.f1684m;
        if (xVar != null) {
            return xVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public AbstractC0042s getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        x xVar = this.f1684m;
        if (xVar == null) {
            return super.getBaseline();
        }
        xVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1679j;
    }

    public K getCompatAccessibilityDelegate() {
        return this.f1670e0;
    }

    public u getEdgeEffectFactory() {
        return this.f1645C;
    }

    public v getItemAnimator() {
        return this.f1650H;
    }

    public int getItemDecorationCount() {
        return this.f1685n.size();
    }

    public x getLayoutManager() {
        return this.f1684m;
    }

    public int getMaxFlingVelocity() {
        return this.f1660R;
    }

    public int getMinFlingVelocity() {
        return this.f1659Q;
    }

    public long getNanoTime() {
        if (f1641n0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public z getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1663U;
    }

    public C getRecycledViewPool() {
        D d2 = this.f1669e;
        if (((C) d2.f427e) == null) {
            C c2 = new C();
            c2.f421a = new SparseArray();
            c2.f422b = 0;
            d2.f427e = c2;
        }
        return (C) d2.f427e;
    }

    public int getScrollState() {
        return this.f1651I;
    }

    public final String h() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f1684m + ", context:" + getContext();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final View i(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1688q;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f3464d;
    }

    public final boolean k() {
        return getScrollingChildHelper().f(1);
    }

    public final boolean l() {
        return !this.f1690s || this.f1695y || ((ArrayList) this.f1673g.f476f).size() > 0;
    }

    public final void m() {
        int iB = this.f1675h.B();
        for (int i2 = 0; i2 < iB; i2++) {
            ((N.y) this.f1675h.A(i2).getLayoutParams()).f560b = true;
        }
        ArrayList arrayList = (ArrayList) this.f1669e.f426d;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1652J) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f1652J = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.f1656N = x2;
            this.f1654L = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.f1657O = y2;
            this.f1655M = y2;
        }
    }

    public final void o(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f1681k;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof N.y) {
            N.y yVar = (N.y) layoutParams;
            if (!yVar.f560b) {
                int i2 = rect.left;
                Rect rect2 = yVar.f559a;
                rect.left = i2 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f1684m.G(this, view, this.f1681k, !this.f1690s, view2 == null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        boolean z2 = false;
        this.f1643A = 0;
        this.f1688q = true;
        if (this.f1690s && !isLayoutRequested()) {
            z2 = true;
        }
        this.f1690s = z2;
        x xVar = this.f1684m;
        if (xVar != null) {
            xVar.f556e = true;
        }
        if (f1641n0) {
            ThreadLocal threadLocal = RunnableC0036l.f527i;
            RunnableC0036l runnableC0036l = (RunnableC0036l) threadLocal.get();
            this.f1665W = runnableC0036l;
            if (runnableC0036l == null) {
                RunnableC0036l runnableC0036l2 = new RunnableC0036l();
                runnableC0036l2.f529e = new ArrayList();
                runnableC0036l2.f532h = new ArrayList();
                this.f1665W = runnableC0036l2;
                Field field = p042y.x.f3474a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                RunnableC0036l runnableC0036l3 = this.f1665W;
                runnableC0036l3.f531g = (long) (1.0E9f / refreshRate);
                threadLocal.set(runnableC0036l3);
            }
            this.f1665W.f529e.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object obj;
        RunnableC0036l runnableC0036l;
        super.onDetachedFromWindow();
        v vVar = this.f1650H;
        if (vVar != null) {
            vVar.a();
        }
        setScrollState(0);
        I i2 = this.f1664V;
        i2.f441k.removeCallbacks(i2);
        i2.f437g.abortAnimation();
        this.f1688q = false;
        x xVar = this.f1684m;
        if (xVar != null) {
            xVar.f556e = false;
            xVar.z(this);
        }
        this.f1680j0.clear();
        removeCallbacks(this.f1682k0);
        this.f1677i.getClass();
        do {
            p011g0.F f2 = S.f473a;
            int i3 = f2.f1837a;
            obj = null;
            if (i3 > 0) {
                int i4 = i3 - 1;
                Object[] objArr = f2.f1838b;
                Object obj2 = objArr[i4];
                i.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i4] = null;
                f2.f1837a--;
                obj = obj2;
            }
        } while (obj != null);
        if (!f1641n0 || (runnableC0036l = this.f1665W) == null) {
            return;
        }
        runnableC0036l.f529e.remove(this);
        this.f1665W = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1685n;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0032h) arrayList.get(i2)).getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float axisValue;
        if (this.f1684m != null && !this.f1691u && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f1684m.c() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f1684m.b() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f1684m.c()) {
                    f2 = -axisValue2;
                } else if (this.f1684m.b()) {
                    axisValue = axisValue2;
                    f2 = 0.0f;
                } else {
                    f2 = 0.0f;
                }
            } else {
                f2 = 0.0f;
            }
            if (f2 != 0.0f || axisValue != 0.0f) {
                q((int) (axisValue * this.f1661S), (int) (f2 * this.f1662T), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f1691u) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f1687p = null;
        }
        ArrayList arrayList = this.f1686o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0032h c0032h = (C0032h) arrayList.get(i2);
            if (c0032h.c(motionEvent) && action != 3) {
                this.f1687p = c0032h;
                p();
                setScrollState(0);
                return true;
            }
        }
        x xVar = this.f1684m;
        if (xVar == null) {
            return false;
        }
        boolean zB = xVar.b();
        boolean zC = this.f1684m.c();
        if (this.f1653K == null) {
            this.f1653K = VelocityTracker.obtain();
        }
        this.f1653K.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1692v) {
                this.f1692v = false;
            }
            this.f1652J = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f1656N = x2;
            this.f1654L = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f1657O = y2;
            this.f1655M = y2;
            if (this.f1651I == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f1678i0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i3 = zB;
            if (zC) {
                i3 = (zB ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i3, 0);
        } else if (actionMasked == 1) {
            this.f1653K.clear();
            s(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f1652J);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1652J + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f1651I != 1) {
                int i4 = x3 - this.f1654L;
                int i5 = y3 - this.f1655M;
                if (!zB || Math.abs(i4) <= this.f1658P) {
                    z2 = false;
                } else {
                    this.f1656N = x3;
                    z2 = true;
                }
                if (zC && Math.abs(i5) > this.f1658P) {
                    this.f1657O = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            p();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f1652J = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1656N = x4;
            this.f1654L = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1657O = y4;
            this.f1655M = y4;
        } else if (actionMasked == 6) {
            n(motionEvent);
        }
        return this.f1651I == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = p036u.b.f3078a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.f1690s = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        x xVar = this.f1684m;
        if (xVar == null) {
            e(i2, i3);
            return;
        }
        if (xVar.y()) {
            View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getMode(i3);
            this.f1684m.f553b.e(i2, i3);
        } else {
            if (this.f1689r) {
                this.f1684m.f553b.e(i2, i3);
                return;
            }
            G g2 = this.f1667b0;
            if (g2.f434e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g2.getClass();
            this.t++;
            this.f1684m.f553b.e(i2, i3);
            if (this.t < 1) {
                this.t = 1;
            }
            this.t--;
            g2.f432c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (this.f1643A > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof F)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        F f2 = (F) parcelable;
        this.f1671f = f2;
        super.onRestoreInstanceState(f2.f70a);
        x xVar = this.f1684m;
        if (xVar == null || (parcelable2 = this.f1671f.f429c) == null) {
            return;
        }
        xVar.B(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        F f2 = new F(super.onSaveInstanceState());
        F f3 = this.f1671f;
        if (f3 != null) {
            f2.f429c = f3.f429c;
        } else {
            x xVar = this.f1684m;
            if (xVar != null) {
                f2.f429c = xVar.C();
            } else {
                f2.f429c = null;
            }
        }
        return f2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        this.f1649G = null;
        this.f1647E = null;
        this.f1648F = null;
        this.f1646D = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0232  */
    /* JADX WARN: Code duplicated, block: B:101:0x0234  */
    /* JADX WARN: Code duplicated, block: B:103:0x0237  */
    /* JADX WARN: Code duplicated, block: B:105:0x023a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0242 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0244  */
    /* JADX WARN: Code duplicated, block: B:109:0x0247  */
    /* JADX WARN: Code duplicated, block: B:112:0x024c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0255  */
    /* JADX WARN: Code duplicated, block: B:117:0x0261  */
    /* JADX WARN: Code duplicated, block: B:118:0x0263  */
    /* JADX WARN: Code duplicated, block: B:120:0x0266  */
    /* JADX WARN: Code duplicated, block: B:126:0x0277  */
    /* JADX WARN: Code duplicated, block: B:128:0x0288  */
    /* JADX WARN: Code duplicated, block: B:129:0x0292  */
    /* JADX WARN: Code duplicated, block: B:131:0x0295  */
    /* JADX WARN: Code duplicated, block: B:132:0x029f  */
    /* JADX WARN: Code duplicated, block: B:137:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:143:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:145:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:147:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:153:0x02db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x02de  */
    /* JADX WARN: Code duplicated, block: B:157:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:158:0x02e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:169:0x0336  */
    /* JADX WARN: Code duplicated, block: B:171:0x0352  */
    /* JADX WARN: Code duplicated, block: B:178:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:58:0x0130  */
    /* JADX WARN: Code duplicated, block: B:63:0x0145 A[LOOP:0: B:57:0x012e->B:63:0x0145, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x014c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x014d  */
    /* JADX WARN: Code duplicated, block: B:69:0x015b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x0182  */
    /* JADX WARN: Code duplicated, block: B:77:0x0186 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x018a  */
    /* JADX WARN: Code duplicated, block: B:81:0x018d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0192  */
    /* JADX WARN: Code duplicated, block: B:85:0x0197  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0202  */
    /* JADX WARN: Code duplicated, block: B:96:0x0226 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0228  */
    /* JADX WARN: Code duplicated, block: B:99:0x0230 A[DONT_INVERT] */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x01c3, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x xVar;
        boolean zB;
        boolean zC;
        MotionEvent motionEventObtain;
        int actionMasked;
        int actionIndex;
        int[] iArr;
        int i2;
        int i3;
        float f2;
        float f3;
        int i4;
        int i5;
        x xVar2;
        boolean zB2;
        boolean zC2;
        float f4;
        float f5;
        boolean z2;
        int i6;
        int iFindPointerIndex;
        int x2;
        int y2;
        int i7;
        int i8;
        boolean zF;
        int[] iArr2;
        int i9;
        int i10;
        RunnableC0036l runnableC0036l;
        boolean z3;
        int iAbs;
        int i11;
        int iAbs2;
        int i12;
        ArrayList arrayList;
        int size;
        int i13;
        C0032h c0032h;
        if (this.f1691u || this.f1692v) {
            return false;
        }
        int action = motionEvent.getAction();
        C0032h c0032h2 = this.f1687p;
        if (c0032h2 == null) {
            if (action != 0) {
                arrayList = this.f1686o;
                size = arrayList.size();
                for (i13 = 0; i13 < size; i13++) {
                    c0032h = (C0032h) arrayList.get(i13);
                    if (c0032h.c(motionEvent)) {
                        this.f1687p = c0032h;
                    }
                }
            }
            xVar = this.f1684m;
            if (xVar == null) {
                return false;
            }
            zB = xVar.b();
            zC = this.f1684m.c();
            if (this.f1653K == null) {
                this.f1653K = VelocityTracker.obtain();
            }
            motionEventObtain = MotionEvent.obtain(motionEvent);
            actionMasked = motionEvent.getActionMasked();
            actionIndex = motionEvent.getActionIndex();
            iArr = this.f1678i0;
            if (actionMasked == 0) {
                iArr[1] = 0;
                iArr[0] = 0;
            }
            motionEventObtain.offsetLocation(iArr[0], iArr[1]);
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    this.f1653K.addMovement(motionEventObtain);
                    VelocityTracker velocityTracker = this.f1653K;
                    i3 = this.f1660R;
                    velocityTracker.computeCurrentVelocity(1000, i3);
                    if (zB) {
                        f2 = -this.f1653K.getXVelocity(this.f1652J);
                    } else {
                        f2 = 0.0f;
                    }
                    if (zC) {
                        f3 = -this.f1653K.getYVelocity(this.f1652J);
                    } else {
                        f3 = 0.0f;
                    }
                    if (f2 == 0.0f || f3 != 0.0f) {
                        i4 = (int) f2;
                        i5 = (int) f3;
                        xVar2 = this.f1684m;
                        if (xVar2 == null) {
                            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.f1691u) {
                            zB2 = xVar2.b();
                            zC2 = this.f1684m.c();
                            int i14 = this.f1659Q;
                            if (zB2 || Math.abs(i4) < i14) {
                                i4 = 0;
                            }
                            if (zC2 || Math.abs(i5) < i14) {
                                i5 = 0;
                            }
                            if (i4 == 0 || i5 != 0) {
                                f4 = i4;
                                f5 = i5;
                                if (!dispatchNestedPreFling(f4, f5)) {
                                    if (!zB2 || zC2) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    dispatchNestedFling(f4, f5, z2);
                                    i6 = zB2;
                                    if (z2) {
                                        if (zC2) {
                                            i6 = (zB2 ? 1 : 0) | 2;
                                        }
                                        getScrollingChildHelper().g(i6, 1);
                                        int i15 = -i3;
                                        int iMax = Math.max(i15, Math.min(i4, i3));
                                        int iMax2 = Math.max(i15, Math.min(i5, i3));
                                        I i16 = this.f1664V;
                                        i16.f441k.setScrollState(2);
                                        i16.f436f = 0;
                                        i16.f435e = 0;
                                        i16.f437g.fling(0, 0, iMax, iMax2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                        i16.a();
                                    }
                                }
                            }
                        }
                        setScrollState(0);
                    } else {
                        setScrollState(0);
                    }
                    p();
                } else if (actionMasked != 2) {
                    iFindPointerIndex = motionEvent.findPointerIndex(this.f1652J);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1652J + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    i7 = this.f1656N - x2;
                    i8 = this.f1657O - y2;
                    zF = f(i7, i8, this.f1676h0, this.f1674g0, 0);
                    iArr2 = this.f1674g0;
                    if (zF) {
                        int[] iArr3 = this.f1676h0;
                        i7 -= iArr3[0];
                        i8 -= iArr3[1];
                        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
                        iArr[0] = iArr[0] + iArr2[0];
                        iArr[1] = iArr[1] + iArr2[1];
                    }
                    if (this.f1651I != 1) {
                        if (zB) {
                            iAbs2 = Math.abs(i7);
                            i12 = this.f1658P;
                            if (iAbs2 > i12) {
                                if (i7 > 0) {
                                    i7 -= i12;
                                } else {
                                    i7 += i12;
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            z3 = false;
                        }
                        if (zC) {
                            iAbs = Math.abs(i8);
                            i11 = this.f1658P;
                            if (iAbs > i11) {
                                if (i8 > 0) {
                                    i8 -= i11;
                                } else {
                                    i8 += i11;
                                }
                                z3 = true;
                            }
                        }
                        if (z3) {
                            setScrollState(1);
                        }
                    }
                    i9 = i8;
                    if (this.f1651I == 1) {
                        this.f1656N = x2 - iArr2[0];
                        this.f1657O = y2 - iArr2[1];
                        if (zB) {
                            i10 = i7;
                        } else {
                            i10 = 0;
                        }
                        q(i10, zC ? i9 : 0, motionEventObtain);
                        runnableC0036l = this.f1665W;
                        if (runnableC0036l != null && (i7 != 0 || i9 != 0)) {
                            runnableC0036l.a(this, i7, i9);
                        }
                    }
                } else if (actionMasked != 3) {
                    p();
                    setScrollState(0);
                } else if (actionMasked != 5) {
                    this.f1652J = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f1656N = x3;
                    this.f1654L = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f1657O = y3;
                    this.f1655M = y3;
                } else if (actionMasked == 6) {
                    n(motionEvent);
                }
                motionEventObtain.recycle();
                return true;
            }
            this.f1652J = motionEvent.getPointerId(0);
            int x4 = (int) (motionEvent.getX() + 0.5f);
            this.f1656N = x4;
            this.f1654L = x4;
            int y4 = (int) (motionEvent.getY() + 0.5f);
            this.f1657O = y4;
            this.f1655M = y4;
            if (zC) {
                i2 = zB;
                i2 = (zB ? 1 : 0) | 2;
            }
            i2 = zB;
            getScrollingChildHelper().g(i2, 0);
            this.f1653K.addMovement(motionEventObtain);
            motionEventObtain.recycle();
            return true;
        }
        if (action == 0) {
            this.f1687p = null;
            if (action != 0) {
                arrayList = this.f1686o;
                size = arrayList.size();
                while (i13 < size) {
                    c0032h = (C0032h) arrayList.get(i13);
                    if (c0032h.c(motionEvent)) {
                        this.f1687p = c0032h;
                    }
                }
            }
            xVar = this.f1684m;
            if (xVar == null) {
                return false;
            }
            zB = xVar.b();
            zC = this.f1684m.c();
            if (this.f1653K == null) {
                this.f1653K = VelocityTracker.obtain();
            }
            motionEventObtain = MotionEvent.obtain(motionEvent);
            actionMasked = motionEvent.getActionMasked();
            actionIndex = motionEvent.getActionIndex();
            iArr = this.f1678i0;
            if (actionMasked == 0) {
                iArr[1] = 0;
                iArr[0] = 0;
            }
            motionEventObtain.offsetLocation(iArr[0], iArr[1]);
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    this.f1653K.addMovement(motionEventObtain);
                    VelocityTracker velocityTracker2 = this.f1653K;
                    i3 = this.f1660R;
                    velocityTracker2.computeCurrentVelocity(1000, i3);
                    if (zB) {
                        f2 = -this.f1653K.getXVelocity(this.f1652J);
                    } else {
                        f2 = 0.0f;
                    }
                    if (zC) {
                        f3 = -this.f1653K.getYVelocity(this.f1652J);
                    } else {
                        f3 = 0.0f;
                    }
                    if (f2 == 0.0f) {
                        i4 = (int) f2;
                        i5 = (int) f3;
                        xVar2 = this.f1684m;
                        if (xVar2 == null) {
                            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.f1691u) {
                            zB2 = xVar2.b();
                            zC2 = this.f1684m.c();
                            int i17 = this.f1659Q;
                            if (zB2) {
                                i4 = 0;
                            } else {
                                i4 = 0;
                            }
                            if (zC2) {
                                i5 = 0;
                            } else {
                                i5 = 0;
                            }
                            if (i4 == 0) {
                                f4 = i4;
                                f5 = i5;
                                if (!dispatchNestedPreFling(f4, f5)) {
                                    if (zB2) {
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                    }
                                    dispatchNestedFling(f4, f5, z2);
                                    i6 = zB2;
                                    if (z2) {
                                        if (zC2) {
                                            i6 = (zB2 ? 1 : 0) | 2;
                                        }
                                        getScrollingChildHelper().g(i6, 1);
                                        int i18 = -i3;
                                        int iMax3 = Math.max(i18, Math.min(i4, i3));
                                        int iMax4 = Math.max(i18, Math.min(i5, i3));
                                        I i19 = this.f1664V;
                                        i19.f441k.setScrollState(2);
                                        i19.f436f = 0;
                                        i19.f435e = 0;
                                        i19.f437g.fling(0, 0, iMax3, iMax4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                        i19.a();
                                    }
                                }
                            } else {
                                f4 = i4;
                                f5 = i5;
                                if (!dispatchNestedPreFling(f4, f5)) {
                                    if (zB2) {
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                    }
                                    dispatchNestedFling(f4, f5, z2);
                                    i6 = zB2;
                                    if (z2) {
                                        if (zC2) {
                                            i6 = (zB2 ? 1 : 0) | 2;
                                        }
                                        getScrollingChildHelper().g(i6, 1);
                                        int i110 = -i3;
                                        int iMax5 = Math.max(i110, Math.min(i4, i3));
                                        int iMax6 = Math.max(i110, Math.min(i5, i3));
                                        I i111 = this.f1664V;
                                        i111.f441k.setScrollState(2);
                                        i111.f436f = 0;
                                        i111.f435e = 0;
                                        i111.f437g.fling(0, 0, iMax5, iMax6, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                        i111.a();
                                    }
                                }
                            }
                        }
                        setScrollState(0);
                    } else {
                        i4 = (int) f2;
                        i5 = (int) f3;
                        xVar2 = this.f1684m;
                        if (xVar2 == null) {
                            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.f1691u) {
                            zB2 = xVar2.b();
                            zC2 = this.f1684m.c();
                            int i112 = this.f1659Q;
                            if (zB2) {
                                i4 = 0;
                            } else {
                                i4 = 0;
                            }
                            if (zC2) {
                                i5 = 0;
                            } else {
                                i5 = 0;
                            }
                            if (i4 == 0) {
                                f4 = i4;
                                f5 = i5;
                                if (!dispatchNestedPreFling(f4, f5)) {
                                    if (zB2) {
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                    }
                                    dispatchNestedFling(f4, f5, z2);
                                    i6 = zB2;
                                    if (z2) {
                                        if (zC2) {
                                            i6 = (zB2 ? 1 : 0) | 2;
                                        }
                                        getScrollingChildHelper().g(i6, 1);
                                        int i113 = -i3;
                                        int iMax7 = Math.max(i113, Math.min(i4, i3));
                                        int iMax8 = Math.max(i113, Math.min(i5, i3));
                                        I i114 = this.f1664V;
                                        i114.f441k.setScrollState(2);
                                        i114.f436f = 0;
                                        i114.f435e = 0;
                                        i114.f437g.fling(0, 0, iMax7, iMax8, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                        i114.a();
                                    }
                                }
                            } else {
                                f4 = i4;
                                f5 = i5;
                                if (!dispatchNestedPreFling(f4, f5)) {
                                    if (zB2) {
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                    }
                                    dispatchNestedFling(f4, f5, z2);
                                    i6 = zB2;
                                    if (z2) {
                                        if (zC2) {
                                            i6 = (zB2 ? 1 : 0) | 2;
                                        }
                                        getScrollingChildHelper().g(i6, 1);
                                        int i115 = -i3;
                                        int iMax9 = Math.max(i115, Math.min(i4, i3));
                                        int iMax10 = Math.max(i115, Math.min(i5, i3));
                                        I i116 = this.f1664V;
                                        i116.f441k.setScrollState(2);
                                        i116.f436f = 0;
                                        i116.f435e = 0;
                                        i116.f437g.fling(0, 0, iMax9, iMax10, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                        i116.a();
                                    }
                                }
                            }
                        }
                        setScrollState(0);
                    }
                    p();
                } else if (actionMasked != 2) {
                    iFindPointerIndex = motionEvent.findPointerIndex(this.f1652J);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1652J + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    i7 = this.f1656N - x2;
                    i8 = this.f1657O - y2;
                    zF = f(i7, i8, this.f1676h0, this.f1674g0, 0);
                    iArr2 = this.f1674g0;
                    if (zF) {
                        int[] iArr4 = this.f1676h0;
                        i7 -= iArr4[0];
                        i8 -= iArr4[1];
                        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
                        iArr[0] = iArr[0] + iArr2[0];
                        iArr[1] = iArr[1] + iArr2[1];
                    }
                    if (this.f1651I != 1) {
                        if (zB) {
                            iAbs2 = Math.abs(i7);
                            i12 = this.f1658P;
                            if (iAbs2 > i12) {
                                if (i7 > 0) {
                                    i7 -= i12;
                                } else {
                                    i7 += i12;
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            z3 = false;
                        }
                        if (zC) {
                            iAbs = Math.abs(i8);
                            i11 = this.f1658P;
                            if (iAbs > i11) {
                                if (i8 > 0) {
                                    i8 -= i11;
                                } else {
                                    i8 += i11;
                                }
                                z3 = true;
                            }
                        }
                        if (z3) {
                            setScrollState(1);
                        }
                    }
                    i9 = i8;
                    if (this.f1651I == 1) {
                        this.f1656N = x2 - iArr2[0];
                        this.f1657O = y2 - iArr2[1];
                        if (zB) {
                            i10 = i7;
                        } else {
                            i10 = 0;
                        }
                        q(i10, zC ? i9 : 0, motionEventObtain);
                        runnableC0036l = this.f1665W;
                        if (runnableC0036l != null) {
                            runnableC0036l.a(this, i7, i9);
                        }
                    }
                } else if (actionMasked != 3) {
                    p();
                    setScrollState(0);
                } else if (actionMasked != 5) {
                    this.f1652J = motionEvent.getPointerId(actionIndex);
                    int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f1656N = x5;
                    this.f1654L = x5;
                    int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f1657O = y5;
                    this.f1655M = y5;
                } else if (actionMasked == 6) {
                    n(motionEvent);
                }
                motionEventObtain.recycle();
                return true;
            }
            this.f1652J = motionEvent.getPointerId(0);
            int x6 = (int) (motionEvent.getX() + 0.5f);
            this.f1656N = x6;
            this.f1654L = x6;
            int y6 = (int) (motionEvent.getY() + 0.5f);
            this.f1657O = y6;
            this.f1655M = y6;
            if (zC) {
                i2 = zB;
                i2 = (zB ? 1 : 0) | 2;
            }
            i2 = zB;
            getScrollingChildHelper().g(i2, 0);
            this.f1653K.addMovement(motionEventObtain);
            motionEventObtain.recycle();
            return true;
        }
        if (c0032h2.f513q != 0) {
            if (motionEvent.getAction() == 0) {
                boolean zB3 = c0032h2.b(motionEvent.getX(), motionEvent.getY());
                boolean zA = c0032h2.a(motionEvent.getX(), motionEvent.getY());
                if (zB3 || zA) {
                    if (zA) {
                        c0032h2.f514r = 1;
                        c0032h2.f507k = (int) motionEvent.getX();
                    } else if (zB3) {
                        c0032h2.f514r = 2;
                        c0032h2.f506j = (int) motionEvent.getY();
                    }
                    c0032h2.e(2);
                }
            } else if (motionEvent.getAction() == 1 && c0032h2.f513q == 2) {
                c0032h2.f506j = 0.0f;
                c0032h2.f507k = 0.0f;
                c0032h2.e(1);
                c0032h2.f514r = 0;
            } else if (motionEvent.getAction() == 2 && c0032h2.f513q == 2) {
                c0032h2.f();
                int i20 = c0032h2.f514r;
                int i21 = c0032h2.f497a;
                if (i20 == 1) {
                    float x7 = motionEvent.getX();
                    int[] iArr5 = c0032h2.t;
                    iArr5[0] = i21;
                    int i22 = c0032h2.f508l - i21;
                    iArr5[1] = i22;
                    float fMax = Math.max(i21, Math.min(i22, x7));
                    if (Math.abs(0 - fMax) >= 2.0f) {
                        float f6 = c0032h2.f507k;
                        int iComputeHorizontalScrollRange = c0032h2.f510n.computeHorizontalScrollRange();
                        c0032h2.f510n.computeHorizontalScrollOffset();
                        int iD = C0032h.d(f6, fMax, iArr5, iComputeHorizontalScrollRange, 0, c0032h2.f508l);
                        if (iD != 0) {
                            c0032h2.f510n.scrollBy(iD, 0);
                        }
                        c0032h2.f507k = fMax;
                    }
                }
                if (c0032h2.f514r == 2) {
                    float y7 = motionEvent.getY();
                    int[] iArr6 = c0032h2.f515s;
                    iArr6[0] = i21;
                    int i23 = c0032h2.f509m - i21;
                    iArr6[1] = i23;
                    float fMax2 = Math.max(i21, Math.min(i23, y7));
                    if (Math.abs(0 - fMax2) >= 2.0f) {
                        float f7 = c0032h2.f506j;
                        int iComputeVerticalScrollRange = c0032h2.f510n.computeVerticalScrollRange();
                        c0032h2.f510n.computeVerticalScrollOffset();
                        int iD2 = C0032h.d(f7, fMax2, iArr6, iComputeVerticalScrollRange, 0, c0032h2.f509m);
                        if (iD2 != 0) {
                            c0032h2.f510n.scrollBy(0, iD2);
                        }
                        c0032h2.f506j = fMax2;
                    }
                }
            }
        }
        if (action == 3 || action == 1) {
            this.f1687p = null;
        }
        p();
        setScrollState(0);
        return true;
    }

    public final void p() {
        VelocityTracker velocityTracker = this.f1653K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        s(0);
        EdgeEffect edgeEffect = this.f1646D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f1646D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1647E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f1647E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1648F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f1648F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1649G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f1649G.isFinished();
        }
        if (zIsFinished) {
            Field field = p042y.x.f3474a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x011a  */
    /* JADX WARN: Code duplicated, block: B:42:0x011f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0133  */
    /* JADX WARN: Code duplicated, block: B:45:0x0153  */
    /* JADX WARN: Code duplicated, block: B:47:0x0171  */
    /* JADX WARN: Code duplicated, block: B:49:0x0175  */
    /* JADX WARN: Code duplicated, block: B:52:0x017a  */
    /* JADX WARN: Code duplicated, block: B:54:0x018e  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:57:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d6  */
    public final void q(int i2, int i3, MotionEvent motionEvent) {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        d();
        if (!this.f1685n.isEmpty()) {
            invalidate();
        }
        int[] iArr = this.f1674g0;
        boolean z2 = false;
        boolean z3 = true;
        if (g(iArr, 0)) {
            int i4 = this.f1656N;
            int i5 = iArr[0];
            this.f1656N = i4 - i5;
            int i6 = this.f1657O;
            int i7 = iArr[1];
            this.f1657O = i6 - i7;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i5, i7);
            }
            int[] iArr2 = this.f1678i0;
            iArr2[0] = iArr2[0] + iArr[0];
            iArr2[1] = iArr2[1] + iArr[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x2 = motionEvent.getX();
                float f2 = 0;
                float y2 = motionEvent.getY();
                if (f2 < 0.0f) {
                    if (this.f1646D == null) {
                        this.f1645C.getClass();
                        EdgeEffect edgeEffect3 = new EdgeEffect(getContext());
                        this.f1646D = edgeEffect3;
                        if (this.f1679j) {
                            edgeEffect3.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect3.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    d.a(this.f1646D, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else if (f2 <= 0.0f) {
                    if (f2 < 0.0f) {
                        if (this.f1647E == null) {
                            this.f1645C.getClass();
                            edgeEffect2 = new EdgeEffect(getContext());
                            this.f1647E = edgeEffect2;
                            if (this.f1679j) {
                                edgeEffect2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect2.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        d.a(this.f1647E, (-f2) / getHeight(), x2 / getWidth());
                    } else if (f2 > 0.0f) {
                        if (this.f1649G == null) {
                            this.f1645C.getClass();
                            edgeEffect = new EdgeEffect(getContext());
                            this.f1649G = edgeEffect;
                            if (this.f1679j) {
                                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        d.a(this.f1649G, f2 / getHeight(), 1.0f - (x2 / getWidth()));
                    } else {
                        z3 = z2;
                    }
                    if (z3 || f2 != 0.0f || f2 != 0.0f) {
                        Field field = p042y.x.f3474a;
                        postInvalidateOnAnimation();
                    }
                } else {
                    if (this.f1648F == null) {
                        this.f1645C.getClass();
                        EdgeEffect edgeEffect4 = new EdgeEffect(getContext());
                        this.f1648F = edgeEffect4;
                        if (this.f1679j) {
                            edgeEffect4.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect4.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    d.a(this.f1648F, f2 / getWidth(), y2 / getHeight());
                }
                z2 = true;
                if (f2 < 0.0f) {
                    if (this.f1647E == null) {
                        this.f1645C.getClass();
                        edgeEffect2 = new EdgeEffect(getContext());
                        this.f1647E = edgeEffect2;
                        if (this.f1679j) {
                            edgeEffect2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                        } else {
                            edgeEffect2.setSize(getMeasuredWidth(), getMeasuredHeight());
                        }
                    }
                    d.a(this.f1647E, (-f2) / getHeight(), x2 / getWidth());
                } else if (f2 > 0.0f) {
                    if (this.f1649G == null) {
                        this.f1645C.getClass();
                        edgeEffect = new EdgeEffect(getContext());
                        this.f1649G = edgeEffect;
                        if (this.f1679j) {
                            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                        } else {
                            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
                        }
                    }
                    d.a(this.f1649G, f2 / getHeight(), 1.0f - (x2 / getWidth()));
                } else {
                    z3 = z2;
                }
                if (z3) {
                    Field field2 = p042y.x.f3474a;
                    postInvalidateOnAnimation();
                } else {
                    Field field3 = p042y.x.f3474a;
                    postInvalidateOnAnimation();
                }
            }
            c(i2, i3);
        }
        if (awakenScrollBars()) {
            return;
        }
        invalidate();
    }

    public final void r(int i2, int i3) {
        int iRound;
        x xVar = this.f1684m;
        if (xVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1691u) {
            return;
        }
        int i4 = !xVar.b() ? 0 : i2;
        int i5 = !this.f1684m.c() ? 0 : i3;
        if (i4 == 0 && i5 == 0) {
            return;
        }
        I i6 = this.f1664V;
        i6.getClass();
        int iAbs = Math.abs(i4);
        int iAbs2 = Math.abs(i5);
        boolean z2 = iAbs > iAbs2;
        int iSqrt = (int) Math.sqrt(0);
        int iSqrt2 = (int) Math.sqrt((i5 * i5) + (i4 * i4));
        RecyclerView recyclerView = i6.f441k;
        int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
        int i7 = width / 2;
        float f2 = width;
        float f3 = i7;
        float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
        if (iSqrt > 0) {
            iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
        } else {
            if (!z2) {
                iAbs = iAbs2;
            }
            iRound = (int) (((iAbs / f2) + 1.0f) * 300.0f);
        }
        int iMin = Math.min(iRound, 2000);
        Interpolator interpolator = i6.f438h;
        r rVar = f1642p0;
        if (interpolator != rVar) {
            i6.f438h = rVar;
            i6.f437g = new OverScroller(recyclerView.getContext(), rVar);
        }
        recyclerView.setScrollState(2);
        i6.f436f = 0;
        i6.f435e = 0;
        i6.f437g.startScroll(0, 0, i4, i5, iMin);
        if (Build.VERSION.SDK_INT < 23) {
            i6.f437g.computeScrollOffset();
        }
        i6.a();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        j(view);
        view.clearAnimation();
        j(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f1684m.getClass();
        if (this.f1643A <= 0 && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1684m.G(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f1686o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0032h) arrayList.get(i2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.t != 0 || this.f1691u) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i2) {
        getScrollingChildHelper().h(i2);
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        x xVar = this.f1684m;
        if (xVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1691u) {
            return;
        }
        boolean zB = xVar.b();
        boolean zC = this.f1684m.c();
        if (zB || zC) {
            if (!zB) {
                i2 = 0;
            }
            if (!zC) {
                i3 = 0;
            }
            q(i2, i3, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.f1643A <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f1693w |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(K k2) {
        this.f1670e0 = k2;
        p042y.x.a(this, k2);
    }

    public void setAdapter(AbstractC0042s abstractC0042s) {
        setLayoutFrozen(false);
        v vVar = this.f1650H;
        if (vVar != null) {
            vVar.a();
        }
        x xVar = this.f1684m;
        D d2 = this.f1669e;
        if (xVar != null) {
            xVar.E();
            this.f1684m.F(d2);
        }
        ((ArrayList) d2.f425c).clear();
        d2.c();
        C0026b c0026b = this.f1673g;
        c0026b.M((ArrayList) c0026b.f476f);
        c0026b.M((ArrayList) c0026b.f478h);
        ((ArrayList) d2.f425c).clear();
        d2.c();
        if (((C) d2.f427e) == null) {
            C c2 = new C();
            c2.f421a = new SparseArray();
            c2.f422b = 0;
            d2.f427e = c2;
        }
        C c3 = (C) d2.f427e;
        if (c3.f422b == 0) {
            SparseArray sparseArray = c3.f421a;
            if (sparseArray.size() > 0) {
                ((N.B) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f1667b0.f431b = true;
        this.f1696z = this.f1696z;
        this.f1695y = true;
        int iB = this.f1675h.B();
        for (int i2 = 0; i2 < iB; i2++) {
            j(this.f1675h.A(i2));
        }
        m();
        ArrayList arrayList = (ArrayList) d2.f426d;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (arrayList.get(i3) != null) {
                throw new ClassCastException();
            }
        }
        ((RecyclerView) d2.f428f).getClass();
        d2.c();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(t tVar) {
        if (tVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1679j) {
            this.f1649G = null;
            this.f1647E = null;
            this.f1648F = null;
            this.f1646D = null;
        }
        this.f1679j = z2;
        super.setClipToPadding(z2);
        if (this.f1690s) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(u uVar) {
        uVar.getClass();
        this.f1645C = uVar;
        this.f1649G = null;
        this.f1647E = null;
        this.f1648F = null;
        this.f1646D = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f1689r = z2;
    }

    public void setItemAnimator(v vVar) {
        v vVar2 = this.f1650H;
        if (vVar2 != null) {
            vVar2.a();
            this.f1650H.f546a = null;
        }
        this.f1650H = vVar;
        if (vVar != null) {
            vVar.f546a = this.d0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        D d2 = this.f1669e;
        d2.f423a = i2;
        d2.e();
    }

    public void setLayoutFrozen(boolean z2) {
        if (z2 != this.f1691u) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z2) {
                this.f1691u = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1691u = true;
            this.f1692v = true;
            setScrollState(0);
            I i2 = this.f1664V;
            i2.f441k.removeCallbacks(i2);
            i2.f437g.abortAnimation();
        }
    }

    public void setLayoutManager(x xVar) {
        j jVar;
        if (xVar == this.f1684m) {
            return;
        }
        setScrollState(0);
        I i2 = this.f1664V;
        i2.f441k.removeCallbacks(i2);
        i2.f437g.abortAnimation();
        x xVar2 = this.f1684m;
        D d2 = this.f1669e;
        if (xVar2 != null) {
            v vVar = this.f1650H;
            if (vVar != null) {
                vVar.a();
            }
            this.f1684m.E();
            this.f1684m.F(d2);
            ((ArrayList) d2.f425c).clear();
            d2.c();
            if (this.f1688q) {
                x xVar3 = this.f1684m;
                xVar3.f556e = false;
                xVar3.z(this);
            }
            this.f1684m.I(null);
            this.f1684m = null;
        } else {
            ((ArrayList) d2.f425c).clear();
            d2.c();
        }
        C0026b c0026b = this.f1675h;
        ((C0027c) c0026b.f478h).c();
        ArrayList arrayList = (ArrayList) c0026b.f476f;
        int size = arrayList.size() - 1;
        while (true) {
            jVar = (j) c0026b.f477g;
            if (size < 0) {
                break;
            }
            j((View) arrayList.get(size));
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView = (RecyclerView) jVar.f44f;
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f1684m = xVar;
        if (xVar != null) {
            if (xVar.f553b != null) {
                throw new IllegalArgumentException("LayoutManager " + xVar + " is already attached to a RecyclerView:" + xVar.f553b.h());
            }
            xVar.I(this);
            if (this.f1688q) {
                this.f1684m.f556e = true;
            }
        }
        d2.e();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0174g scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f3464d) {
            Field field = p042y.x.f3474a;
            AbstractC0183p.z(scrollingChildHelper.f3463c);
        }
        scrollingChildHelper.f3464d = z2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1663U = z2;
    }

    public void setRecycledViewPool(C c2) {
        D d2 = this.f1669e;
        C c3 = (C) d2.f427e;
        if (c3 != null) {
            c3.f422b--;
        }
        d2.f427e = c2;
        if (c2 != null) {
            ((RecyclerView) d2.f428f).getAdapter();
        }
    }

    public void setScrollState(int i2) {
        if (i2 == this.f1651I) {
            return;
        }
        this.f1651I = i2;
        if (i2 != 2) {
            I i3 = this.f1664V;
            i3.f441k.removeCallbacks(i3);
            i3.f437g.abortAnimation();
        }
        x xVar = this.f1684m;
        if (xVar != null) {
            xVar.D(i2);
        }
        ArrayList arrayList = this.f1668c0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((A) this.f1668c0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.f1658P = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.f1658P = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(H h2) {
        this.f1669e.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        x xVar = this.f1684m;
        if (xVar != null) {
            return xVar.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public void setOnFlingListener(z zVar) {
    }

    @Deprecated
    public void setOnScrollListener(A a2) {
    }

    public void setRecyclerListener(E e2) {
    }
}
