package androidx.appcompat.widget;

import D.j;
import N.C0026b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deeprf.pddp.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p012h.d;
import p014i.k;
import p016j.C0109f;
import p016j.C0112i;
import p016j.C0119p;
import p016j.C0120q;
import p016j.C0123u;
import p016j.InterfaceC0126x;
import p016j.Q;
import p016j.l0;
import p016j.m0;
import p016j.n0;
import p016j.o0;
import p016j.p0;
import p016j.q0;
import p016j.w0;
import p042y.x;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f1324A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f1325B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public CharSequence f1326C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ColorStateList f1327D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ColorStateList f1328E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f1329F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f1330G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ArrayList f1331H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final ArrayList f1332I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int[] f1333J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final j f1334K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public q0 f1335L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public m0 f1336M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f1337N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final D.b f1338O;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionMenuView f1339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0123u f1340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0123u f1341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0119p f1342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0120q f1343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Drawable f1344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CharSequence f1345k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0119p f1346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f1347m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f1348n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1349o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1353s;
    public int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1354u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1355v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1356w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Q f1357x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1358y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1359z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1324A = 8388627;
        this.f1331H = new ArrayList();
        this.f1332I = new ArrayList();
        this.f1333J = new int[2];
        this.f1334K = new j(28, this);
        this.f1338O = new D.b(6, this);
        C0026b c0026bI = C0026b.I(getContext(), attributeSet, p004c.a.t, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c0026bI.f476f;
        this.f1350p = typedArray.getResourceId(28, 0);
        this.f1351q = typedArray.getResourceId(19, 0);
        this.f1324A = typedArray.getInteger(0, 8388627);
        this.f1352r = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1356w = dimensionPixelOffset;
        this.f1355v = dimensionPixelOffset;
        this.f1354u = dimensionPixelOffset;
        this.t = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.t = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1354u = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1355v = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1356w = dimensionPixelOffset5;
        }
        this.f1353s = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        Q q2 = this.f1357x;
        q2.f2608h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            q2.f2605e = dimensionPixelSize;
            q2.f2601a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            q2.f2606f = dimensionPixelSize2;
            q2.f2602b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            q2.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1358y = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1359z = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1344j = c0026bI.y(4);
        this.f1345k = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1348n = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableY = c0026bI.y(16);
        if (drawableY != null) {
            setNavigationIcon(drawableY);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableY2 = c0026bI.y(11);
        if (drawableY2 != null) {
            setLogo(drawableY2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c0026bI.x(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c0026bI.x(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        c0026bI.L();
    }

    public static n0 g() {
        n0 n0Var = new n0(-2, -2);
        n0Var.f2706b = 0;
        n0Var.f2705a = 8388627;
        return n0Var;
    }

    private MenuInflater getMenuInflater() {
        return new d(getContext());
    }

    public static n0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof n0;
        if (z2) {
            n0 n0Var = (n0) layoutParams;
            n0 n0Var2 = new n0(n0Var);
            n0Var2.f2706b = 0;
            n0Var2.f2706b = n0Var.f2706b;
            return n0Var2;
        }
        if (z2) {
            n0 n0Var3 = new n0((n0) layoutParams);
            n0Var3.f2706b = 0;
            return n0Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            n0 n0Var4 = new n0(layoutParams);
            n0Var4.f2706b = 0;
            return n0Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        n0 n0Var5 = new n0(marginLayoutParams);
        n0Var5.f2706b = 0;
        ((ViewGroup.MarginLayoutParams) n0Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) n0Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) n0Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) n0Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return n0Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i2) {
        Field field = x.f3474a;
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                n0 n0Var = (n0) childAt.getLayoutParams();
                if (n0Var.f2706b == 0 && r(childAt) && i(n0Var.f2705a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            n0 n0Var2 = (n0) childAt2.getLayoutParams();
            if (n0Var2.f2706b == 0 && r(childAt2) && i(n0Var2.f2705a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z2) {
        n0 n0VarH;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            n0VarH = g();
        } else {
            n0VarH = !checkLayoutParams(layoutParams) ? h(layoutParams) : (n0) layoutParams;
        }
        n0VarH.f2706b = 1;
        if (!z2 || this.f1347m == null) {
            addView(view, n0VarH);
        } else {
            view.setLayoutParams(n0VarH);
            this.f1332I.add(view);
        }
    }

    public final void c() {
        if (this.f1346l == null) {
            C0119p c0119p = new C0119p(getContext());
            this.f1346l = c0119p;
            c0119p.setImageDrawable(this.f1344j);
            this.f1346l.setContentDescription(this.f1345k);
            n0 n0VarG = g();
            n0VarG.f2705a = (this.f1352r & 112) | 8388611;
            n0VarG.f2706b = 2;
            this.f1346l.setLayoutParams(n0VarG);
            this.f1346l.setOnClickListener(new l0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof n0);
    }

    public final void d() {
        if (this.f1357x == null) {
            Q q2 = new Q();
            q2.f2601a = 0;
            q2.f2602b = 0;
            q2.f2603c = Integer.MIN_VALUE;
            q2.f2604d = Integer.MIN_VALUE;
            q2.f2605e = 0;
            q2.f2606f = 0;
            q2.f2607g = false;
            q2.f2608h = false;
            this.f1357x = q2;
        }
    }

    public final void e() {
        if (this.f1339e == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1339e = actionMenuView;
            actionMenuView.setPopupTheme(this.f1349o);
            this.f1339e.setOnMenuItemClickListener(this.f1334K);
            this.f1339e.getClass();
            n0 n0VarG = g();
            n0VarG.f2705a = (this.f1352r & 112) | 8388613;
            this.f1339e.setLayoutParams(n0VarG);
            b(this.f1339e, false);
        }
        ActionMenuView actionMenuView2 = this.f1339e;
        if (actionMenuView2.t == null) {
            p014i.j jVar = (p014i.j) actionMenuView2.getMenu();
            if (this.f1336M == null) {
                this.f1336M = new m0(this);
            }
            this.f1339e.setExpandedActionViewsExclusive(true);
            jVar.b(this.f1336M, this.f1348n);
        }
    }

    public final void f() {
        if (this.f1342h == null) {
            this.f1342h = new C0119p(getContext());
            n0 n0VarG = g();
            n0VarG.f2705a = (this.f1352r & 112) | 8388611;
            this.f1342h.setLayoutParams(n0VarG);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0119p c0119p = this.f1346l;
        if (c0119p != null) {
            return c0119p.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0119p c0119p = this.f1346l;
        if (c0119p != null) {
            return c0119p.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        Q q2 = this.f1357x;
        if (q2 != null) {
            return q2.f2607g ? q2.f2601a : q2.f2602b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f1359z;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        Q q2 = this.f1357x;
        if (q2 != null) {
            return q2.f2601a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        Q q2 = this.f1357x;
        if (q2 != null) {
            return q2.f2602b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        Q q2 = this.f1357x;
        if (q2 != null) {
            return q2.f2607g ? q2.f2602b : q2.f2601a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f1358y;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        p014i.j jVar;
        ActionMenuView actionMenuView = this.f1339e;
        return (actionMenuView == null || (jVar = actionMenuView.t) == null || !jVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1359z, 0));
    }

    public int getCurrentContentInsetLeft() {
        Field field = x.f3474a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = x.f3474a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1358y, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0120q c0120q = this.f1343i;
        if (c0120q != null) {
            return c0120q.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0120q c0120q = this.f1343i;
        if (c0120q != null) {
            return c0120q.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1339e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        C0119p c0119p = this.f1342h;
        if (c0119p != null) {
            return c0119p.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0119p c0119p = this.f1342h;
        if (c0119p != null) {
            return c0119p.getDrawable();
        }
        return null;
    }

    public C0112i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1339e.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1348n;
    }

    public int getPopupTheme() {
        return this.f1349o;
    }

    public CharSequence getSubtitle() {
        return this.f1326C;
    }

    public final TextView getSubtitleTextView() {
        return this.f1341g;
    }

    public CharSequence getTitle() {
        return this.f1325B;
    }

    public int getTitleMarginBottom() {
        return this.f1356w;
    }

    public int getTitleMarginEnd() {
        return this.f1354u;
    }

    public int getTitleMarginStart() {
        return this.t;
    }

    public int getTitleMarginTop() {
        return this.f1355v;
    }

    public final TextView getTitleTextView() {
        return this.f1340f;
    }

    public InterfaceC0126x getWrapper() {
        Drawable drawable;
        if (this.f1335L == null) {
            q0 q0Var = new q0();
            q0Var.f2727l = 0;
            q0Var.f2716a = this;
            q0Var.f2723h = getTitle();
            q0Var.f2724i = getSubtitle();
            q0Var.f2722g = q0Var.f2723h != null;
            q0Var.f2721f = getNavigationIcon();
            C0026b c0026bI = C0026b.I(getContext(), null, p004c.a.f1737a, R.attr.actionBarStyle);
            q0Var.f2728m = c0026bI.y(15);
            TypedArray typedArray = (TypedArray) c0026bI.f476f;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                q0Var.f2722g = true;
                q0Var.f2723h = text;
                if ((q0Var.f2717b & 8) != 0) {
                    q0Var.f2716a.setTitle(text);
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                q0Var.f2724i = text2;
                if ((q0Var.f2717b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableY = c0026bI.y(20);
            if (drawableY != null) {
                q0Var.f2720e = drawableY;
                q0Var.c();
            }
            Drawable drawableY2 = c0026bI.y(17);
            if (drawableY2 != null) {
                q0Var.f2719d = drawableY2;
                q0Var.c();
            }
            if (q0Var.f2721f == null && (drawable = q0Var.f2728m) != null) {
                q0Var.f2721f = drawable;
                int i2 = q0Var.f2717b & 4;
                Toolbar toolbar = q0Var.f2716a;
                if (i2 != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            q0Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = q0Var.f2718c;
                if (view != null && (q0Var.f2717b & 16) != 0) {
                    removeView(view);
                }
                q0Var.f2718c = viewInflate;
                if (viewInflate != null && (q0Var.f2717b & 16) != 0) {
                    addView(viewInflate);
                }
                q0Var.a(q0Var.f2717b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f1357x.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1350p = resourceId2;
                C0123u c0123u = this.f1340f;
                if (c0123u != null) {
                    c0123u.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1351q = resourceId3;
                C0123u c0123u2 = this.f1341g;
                if (c0123u2 != null) {
                    c0123u2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c0026bI.L();
            if (R.string.abc_action_bar_up_description != q0Var.f2727l) {
                q0Var.f2727l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = q0Var.f2727l;
                    q0Var.f2725j = i3 != 0 ? getContext().getString(i3) : null;
                    q0Var.b();
                }
            }
            q0Var.f2725j = getNavigationContentDescription();
            setNavigationOnClickListener(new l0(q0Var));
            this.f1335L = q0Var;
        }
        return this.f1335L;
    }

    public final int i(int i2) {
        Field field = x.f3474a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    public final int j(View view, int i2) {
        n0 n0Var = (n0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = n0Var.f2705a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.f1324A & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) n0Var).topMargin;
        if (iMax < i5) {
            iMax = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin;
            if (i6 < i7) {
                iMax = Math.max(0, iMax - (i7 - i6));
            }
        }
        return paddingTop + iMax;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.f1332I.contains(view);
    }

    public final int n(View view, int i2, int i3, int[] iArr) {
        n0 n0Var = (n0) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) n0Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int iJ = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) n0Var).rightMargin + iMax;
    }

    public final int o(View view, int i2, int i3, int[] iArr) {
        n0 n0Var = (n0) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) n0Var).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int iJ = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) n0Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1338O);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1330G = false;
        }
        if (!this.f1330G) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1330G = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1330G = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0262  */
    /* JADX WARN: Code duplicated, block: B:101:0x0284  */
    /* JADX WARN: Code duplicated, block: B:103:0x0287  */
    /* JADX WARN: Code duplicated, block: B:104:0x028c  */
    /* JADX WARN: Code duplicated, block: B:107:0x029b A[LOOP:0: B:106:0x0299->B:107:0x029b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x02b8 A[LOOP:1: B:109:0x02b6->B:110:0x02b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02d6 A[LOOP:2: B:112:0x02d4->B:113:0x02d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0317 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0319  */
    /* JADX WARN: Code duplicated, block: B:119:0x031d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0325 A[LOOP:3: B:121:0x0323->B:122:0x0325, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0130  */
    /* JADX WARN: Code duplicated, block: B:52:0x0134  */
    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x016a  */
    /* JADX WARN: Code duplicated, block: B:67:0x016e  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x017f  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0196  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x0216  */
    /* JADX WARN: Code duplicated, block: B:89:0x0219  */
    /* JADX WARN: Code duplicated, block: B:91:0x0222 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0224  */
    /* JADX WARN: Code duplicated, block: B:94:0x0228  */
    /* JADX WARN: Code duplicated, block: B:97:0x023c  */
    /* JADX WARN: Code duplicated, block: B:98:0x025f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int iN;
        int iO;
        int iMax;
        int iMin;
        boolean zR;
        boolean zR2;
        int measuredHeight;
        C0123u c0123u;
        C0123u c0123u2;
        n0 n0Var;
        n0 n0Var2;
        boolean z3;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int iMax2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax3;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iN2;
        int i18;
        int i19;
        int size2;
        int i20;
        int size3;
        int i21;
        int i22;
        int i23;
        int measuredWidth;
        int i24;
        int i25;
        int size4;
        int i26;
        Field field = x.f3474a;
        boolean z4 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i27 = width - paddingRight;
        int[] iArr = this.f1333J;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i5 - i3) : 0;
        if (r(this.f1342h)) {
            if (z4) {
                iO = o(this.f1342h, i27, iMin2, iArr);
                iN = paddingLeft;
            } else {
                iN = n(this.f1342h, paddingLeft, iMin2, iArr);
            }
            if (r(this.f1346l)) {
                if (z4) {
                    iO = o(this.f1346l, iO, iMin2, iArr);
                } else {
                    iN = n(this.f1346l, iN, iMin2, iArr);
                }
            }
            if (r(this.f1339e)) {
                if (z4) {
                    iN = n(this.f1339e, iN, iMin2, iArr);
                } else {
                    iO = o(this.f1339e, iO, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iN);
            iArr[1] = Math.max(0, currentContentInsetRight - (i27 - iO));
            iMax = Math.max(iN, currentContentInsetLeft);
            iMin = Math.min(iO, i27 - currentContentInsetRight);
            if (r(this.f1347m)) {
                if (z4) {
                    iMin = o(this.f1347m, iMin, iMin2, iArr);
                } else {
                    iMax = n(this.f1347m, iMax, iMin2, iArr);
                }
            }
            if (r(this.f1343i)) {
                if (z4) {
                    iMin = o(this.f1343i, iMin, iMin2, iArr);
                } else {
                    iMax = n(this.f1343i, iMax, iMin2, iArr);
                }
            }
            zR = r(this.f1340f);
            zR2 = r(this.f1341g);
            if (zR) {
                n0 n0Var3 = (n0) this.f1340f.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) n0Var3).bottomMargin + this.f1340f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) n0Var3).topMargin;
            } else {
                measuredHeight = 0;
            }
            if (zR2) {
                n0 n0Var4 = (n0) this.f1341g.getLayoutParams();
                measuredHeight += this.f1341g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) n0Var4).topMargin + ((ViewGroup.MarginLayoutParams) n0Var4).bottomMargin;
            }
            if (!zR || zR2) {
                if (zR) {
                    c0123u = this.f1340f;
                } else {
                    c0123u = this.f1341g;
                }
                if (zR2) {
                    c0123u2 = this.f1341g;
                } else {
                    c0123u2 = this.f1340f;
                }
                n0Var = (n0) c0123u.getLayoutParams();
                n0Var2 = (n0) c0123u2.getLayoutParams();
                z3 = (!zR && this.f1340f.getMeasuredWidth() > 0) || (zR2 && this.f1341g.getMeasuredWidth() > 0);
                i6 = this.f1324A & 112;
                i7 = iMin2;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) n0Var).topMargin + this.f1355v;
                } else if (i6 != 80) {
                    iMax3 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) n0Var).topMargin + this.f1355v;
                    if (iMax3 < i14) {
                        iMax3 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - measuredHeight) - iMax3) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin;
                        i17 = this.f1356w;
                        if (i15 < i16 + i17) {
                            iMax3 = Math.max(0, iMax3 - ((((ViewGroup.MarginLayoutParams) n0Var2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax3;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) n0Var2).bottomMargin) - this.f1356w) - measuredHeight;
                }
                if (z4) {
                    if (z3) {
                        i11 = this.t;
                    } else {
                        i11 = 0;
                    }
                    int i28 = i11 - iArr[1];
                    iMin -= Math.max(0, i28);
                    iArr[1] = Math.max(0, -i28);
                    if (zR) {
                        n0 n0Var5 = (n0) this.f1340f.getLayoutParams();
                        int measuredWidth2 = iMin - this.f1340f.getMeasuredWidth();
                        int measuredHeight2 = this.f1340f.getMeasuredHeight() + paddingTop;
                        this.f1340f.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.f1354u;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) n0Var5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zR2) {
                        int i29 = paddingTop + ((ViewGroup.MarginLayoutParams) ((n0) this.f1341g.getLayoutParams())).topMargin;
                        this.f1341g.layout(iMin - this.f1341g.getMeasuredWidth(), i29, iMin, this.f1341g.getMeasuredHeight() + i29);
                        i13 = iMin - this.f1354u;
                    } else {
                        i13 = iMin;
                    }
                    if (z3) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = iMax;
                } else {
                    if (z3) {
                        i8 = this.t;
                    } else {
                        i8 = 0;
                    }
                    int i30 = i8 - iArr[0];
                    iMax2 = Math.max(0, i30) + iMax;
                    iArr[0] = Math.max(0, -i30);
                    if (zR) {
                        n0 n0Var6 = (n0) this.f1340f.getLayoutParams();
                        int measuredWidth3 = this.f1340f.getMeasuredWidth() + iMax2;
                        int measuredHeight3 = this.f1340f.getMeasuredHeight() + paddingTop;
                        this.f1340f.layout(iMax2, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.f1354u;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) n0Var6).bottomMargin;
                    } else {
                        i9 = iMax2;
                    }
                    if (zR2) {
                        int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((n0) this.f1341g.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f1341g.getMeasuredWidth() + iMax2;
                        this.f1341g.layout(iMax2, i31, measuredWidth4, this.f1341g.getMeasuredHeight() + i31);
                        i10 = measuredWidth4 + this.f1354u;
                    } else {
                        i10 = iMax2;
                    }
                    if (z3) {
                        iMax = Math.max(i9, i10);
                    } else {
                        iMax = iMax2;
                    }
                }
            } else {
                paddingLeft = paddingLeft;
                i7 = iMin2;
            }
            arrayList = this.f1331H;
            a(arrayList, 3);
            size = arrayList.size();
            iN2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iN2 = n((View) arrayList.get(i18), iN2, i7, iArr);
            }
            i19 = i7;
            a(arrayList, 5);
            size2 = arrayList.size();
            for (i20 = 0; i20 < size2; i20++) {
                iMin = o((View) arrayList.get(i20), iMin, i19, iArr);
            }
            a(arrayList, 1);
            int i32 = iArr[0];
            int i33 = iArr[1];
            size3 = arrayList.size();
            i21 = i33;
            i22 = i32;
            i23 = 0;
            measuredWidth = 0;
            while (i23 < size3) {
                View view = (View) arrayList.get(i23);
                n0 n0Var7 = (n0) view.getLayoutParams();
                int i34 = ((ViewGroup.MarginLayoutParams) n0Var7).leftMargin - i22;
                int i35 = ((ViewGroup.MarginLayoutParams) n0Var7).rightMargin - i21;
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, i35);
                int iMax6 = Math.max(0, -i34);
                int iMax7 = Math.max(0, -i35);
                measuredWidth += view.getMeasuredWidth() + iMax4 + iMax5;
                i23++;
                i21 = iMax7;
                i22 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iN2) {
                if (i25 > iMin) {
                    iN2 = i24 - (i25 - iMin);
                } else {
                    iN2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i26 = 0; i26 < size4; i26++) {
                iN2 = n((View) arrayList.get(i26), iN2, i19, iArr);
            }
            arrayList.clear();
        }
        iN = paddingLeft;
        iO = i27;
        if (r(this.f1346l)) {
            if (z4) {
                iO = o(this.f1346l, iO, iMin2, iArr);
            } else {
                iN = n(this.f1346l, iN, iMin2, iArr);
            }
        }
        if (r(this.f1339e)) {
            if (z4) {
                iN = n(this.f1339e, iN, iMin2, iArr);
            } else {
                iO = o(this.f1339e, iO, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iN);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i27 - iO));
        iMax = Math.max(iN, currentContentInsetLeft2);
        iMin = Math.min(iO, i27 - currentContentInsetRight2);
        if (r(this.f1347m)) {
            if (z4) {
                iMin = o(this.f1347m, iMin, iMin2, iArr);
            } else {
                iMax = n(this.f1347m, iMax, iMin2, iArr);
            }
        }
        if (r(this.f1343i)) {
            if (z4) {
                iMin = o(this.f1343i, iMin, iMin2, iArr);
            } else {
                iMax = n(this.f1343i, iMax, iMin2, iArr);
            }
        }
        zR = r(this.f1340f);
        zR2 = r(this.f1341g);
        if (zR) {
            n0 n0Var8 = (n0) this.f1340f.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) n0Var8).bottomMargin + this.f1340f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) n0Var8).topMargin;
        } else {
            measuredHeight = 0;
        }
        if (zR2) {
            n0 n0Var9 = (n0) this.f1341g.getLayoutParams();
            measuredHeight += this.f1341g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) n0Var9).topMargin + ((ViewGroup.MarginLayoutParams) n0Var9).bottomMargin;
        }
        if (zR) {
            if (zR) {
                c0123u = this.f1340f;
            } else {
                c0123u = this.f1341g;
            }
            if (zR2) {
                c0123u2 = this.f1341g;
            } else {
                c0123u2 = this.f1340f;
            }
            n0Var = (n0) c0123u.getLayoutParams();
            n0Var2 = (n0) c0123u2.getLayoutParams();
            if (zR) {
            }
            i6 = this.f1324A & 112;
            i7 = iMin2;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) n0Var).topMargin + this.f1355v;
            } else if (i6 != 80) {
                iMax3 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) n0Var).topMargin + this.f1355v;
                if (iMax3 < i14) {
                    iMax3 = i14;
                } else {
                    i15 = (((height - paddingBottom) - measuredHeight) - iMax3) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin;
                    i17 = this.f1356w;
                    if (i15 < i16 + i17) {
                        iMax3 = Math.max(0, iMax3 - ((((ViewGroup.MarginLayoutParams) n0Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax3;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) n0Var2).bottomMargin) - this.f1356w) - measuredHeight;
            }
            if (z4) {
                if (z3) {
                    i11 = this.t;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zR) {
                    n0 n0Var10 = (n0) this.f1340f.getLayoutParams();
                    int measuredWidth5 = iMin - this.f1340f.getMeasuredWidth();
                    int measuredHeight4 = this.f1340f.getMeasuredHeight() + paddingTop;
                    this.f1340f.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.f1354u;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) n0Var10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zR2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((n0) this.f1341g.getLayoutParams())).topMargin;
                    this.f1341g.layout(iMin - this.f1341g.getMeasuredWidth(), i211, iMin, this.f1341g.getMeasuredHeight() + i211);
                    i13 = iMin - this.f1354u;
                } else {
                    i13 = iMin;
                }
                if (z3) {
                    iMin = Math.min(i12, i13);
                }
                iMax = iMax;
            } else {
                if (z3) {
                    i8 = this.t;
                } else {
                    i8 = 0;
                }
                int i36 = i8 - iArr[0];
                iMax2 = Math.max(0, i36) + iMax;
                iArr[0] = Math.max(0, -i36);
                if (zR) {
                    n0 n0Var11 = (n0) this.f1340f.getLayoutParams();
                    int measuredWidth6 = this.f1340f.getMeasuredWidth() + iMax2;
                    int measuredHeight5 = this.f1340f.getMeasuredHeight() + paddingTop;
                    this.f1340f.layout(iMax2, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.f1354u;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) n0Var11).bottomMargin;
                } else {
                    i9 = iMax2;
                }
                if (zR2) {
                    int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((n0) this.f1341g.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f1341g.getMeasuredWidth() + iMax2;
                    this.f1341g.layout(iMax2, i37, measuredWidth7, this.f1341g.getMeasuredHeight() + i37);
                    i10 = measuredWidth7 + this.f1354u;
                } else {
                    i10 = iMax2;
                }
                if (z3) {
                    iMax = Math.max(i9, i10);
                } else {
                    iMax = iMax2;
                }
            }
        } else {
            if (zR) {
                c0123u = this.f1340f;
            } else {
                c0123u = this.f1341g;
            }
            if (zR2) {
                c0123u2 = this.f1341g;
            } else {
                c0123u2 = this.f1340f;
            }
            n0Var = (n0) c0123u.getLayoutParams();
            n0Var2 = (n0) c0123u2.getLayoutParams();
            if (zR) {
            }
            i6 = this.f1324A & 112;
            i7 = iMin2;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) n0Var).topMargin + this.f1355v;
            } else if (i6 != 80) {
                iMax3 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) n0Var).topMargin + this.f1355v;
                if (iMax3 < i14) {
                    iMax3 = i14;
                } else {
                    i15 = (((height - paddingBottom) - measuredHeight) - iMax3) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin;
                    i17 = this.f1356w;
                    if (i15 < i16 + i17) {
                        iMax3 = Math.max(0, iMax3 - ((((ViewGroup.MarginLayoutParams) n0Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax3;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) n0Var2).bottomMargin) - this.f1356w) - measuredHeight;
            }
            if (z4) {
                if (z3) {
                    i11 = this.t;
                } else {
                    i11 = 0;
                }
                int i212 = i11 - iArr[1];
                iMin -= Math.max(0, i212);
                iArr[1] = Math.max(0, -i212);
                if (zR) {
                    n0 n0Var12 = (n0) this.f1340f.getLayoutParams();
                    int measuredWidth8 = iMin - this.f1340f.getMeasuredWidth();
                    int measuredHeight6 = this.f1340f.getMeasuredHeight() + paddingTop;
                    this.f1340f.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.f1354u;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) n0Var12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zR2) {
                    int i213 = paddingTop + ((ViewGroup.MarginLayoutParams) ((n0) this.f1341g.getLayoutParams())).topMargin;
                    this.f1341g.layout(iMin - this.f1341g.getMeasuredWidth(), i213, iMin, this.f1341g.getMeasuredHeight() + i213);
                    i13 = iMin - this.f1354u;
                } else {
                    i13 = iMin;
                }
                if (z3) {
                    iMin = Math.min(i12, i13);
                }
                iMax = iMax;
            } else {
                if (z3) {
                    i8 = this.t;
                } else {
                    i8 = 0;
                }
                int i38 = i8 - iArr[0];
                iMax2 = Math.max(0, i38) + iMax;
                iArr[0] = Math.max(0, -i38);
                if (zR) {
                    n0 n0Var13 = (n0) this.f1340f.getLayoutParams();
                    int measuredWidth9 = this.f1340f.getMeasuredWidth() + iMax2;
                    int measuredHeight7 = this.f1340f.getMeasuredHeight() + paddingTop;
                    this.f1340f.layout(iMax2, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.f1354u;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) n0Var13).bottomMargin;
                } else {
                    i9 = iMax2;
                }
                if (zR2) {
                    int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((n0) this.f1341g.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f1341g.getMeasuredWidth() + iMax2;
                    this.f1341g.layout(iMax2, i39, measuredWidth10, this.f1341g.getMeasuredHeight() + i39);
                    i10 = measuredWidth10 + this.f1354u;
                } else {
                    i10 = iMax2;
                }
                if (z3) {
                    iMax = Math.max(i9, i10);
                } else {
                    iMax = iMax2;
                }
            }
        }
        arrayList = this.f1331H;
        a(arrayList, 3);
        size = arrayList.size();
        iN2 = iMax;
        while (i18 < size) {
            iN2 = n((View) arrayList.get(i18), iN2, i7, iArr);
        }
        i19 = i7;
        a(arrayList, 5);
        size2 = arrayList.size();
        while (i20 < size2) {
            iMin = o((View) arrayList.get(i20), iMin, i19, iArr);
        }
        a(arrayList, 1);
        int i310 = iArr[0];
        int i311 = iArr[1];
        size3 = arrayList.size();
        i21 = i311;
        i22 = i310;
        i23 = 0;
        measuredWidth = 0;
        while (i23 < size3) {
            View view2 = (View) arrayList.get(i23);
            n0 n0Var14 = (n0) view2.getLayoutParams();
            int i312 = ((ViewGroup.MarginLayoutParams) n0Var14).leftMargin - i22;
            int i313 = ((ViewGroup.MarginLayoutParams) n0Var14).rightMargin - i21;
            int iMax8 = Math.max(0, i312);
            int iMax9 = Math.max(0, i313);
            int iMax10 = Math.max(0, -i312);
            int iMax11 = Math.max(0, -i313);
            measuredWidth += view2.getMeasuredWidth() + iMax8 + iMax9;
            i23++;
            i21 = iMax11;
            i22 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iN2) {
            if (i25 > iMin) {
                iN2 = i24 - (i25 - iMin);
            } else {
                iN2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i26 < size4) {
            iN2 = n((View) arrayList.get(i26), iN2, i19, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iCombineMeasuredStates2;
        int iMax2;
        int iL;
        boolean zA = w0.a(this);
        int i4 = !zA ? 1 : 0;
        int i5 = 0;
        if (r(this.f1342h)) {
            q(this.f1342h, i2, 0, i3, this.f1353s);
            iK = k(this.f1342h) + this.f1342h.getMeasuredWidth();
            iMax = Math.max(0, l(this.f1342h) + this.f1342h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1342h.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (r(this.f1346l)) {
            q(this.f1346l, i2, 0, i3, this.f1353s);
            iK = k(this.f1346l) + this.f1346l.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f1346l) + this.f1346l.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1346l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        int[] iArr = this.f1333J;
        iArr[zA ? 1 : 0] = iMax4;
        if (r(this.f1339e)) {
            q(this.f1339e, i2, iMax3, i3, this.f1353s);
            iK2 = k(this.f1339e) + this.f1339e.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f1339e) + this.f1339e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1339e.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[i4] = Math.max(0, currentContentInsetEnd - iK2);
        if (r(this.f1347m)) {
            iMax5 += p(this.f1347m, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, l(this.f1347m) + this.f1347m.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1347m.getMeasuredState());
        }
        if (r(this.f1343i)) {
            iMax5 += p(this.f1343i, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, l(this.f1343i) + this.f1343i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1343i.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (((n0) childAt.getLayoutParams()).f2706b == 0 && r(childAt)) {
                iMax5 += p(childAt, i2, iMax5, i3, 0, iArr);
                iMax = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i7 = this.f1355v + this.f1356w;
        int i8 = this.t + this.f1354u;
        if (r(this.f1340f)) {
            p(this.f1340f, i2, iMax5 + i8, i3, i7, iArr);
            int iK3 = k(this.f1340f) + this.f1340f.getMeasuredWidth();
            iL = l(this.f1340f) + this.f1340f.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1340f.getMeasuredState());
            iMax2 = iK3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            iL = 0;
        }
        if (r(this.f1341g)) {
            iMax2 = Math.max(iMax2, p(this.f1341g, i2, iMax5 + i8, i3, iL + i7, iArr));
            iL += l(this.f1341g) + this.f1341g.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1341g.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16);
        if (!this.f1337N) {
            i5 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            View childAt2 = getChildAt(i9);
            if (r(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i5 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i5);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof p0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p0 p0Var = (p0) parcelable;
        super.onRestoreInstanceState(p0Var.f70a);
        ActionMenuView actionMenuView = this.f1339e;
        p014i.j jVar = actionMenuView != null ? actionMenuView.t : null;
        int i2 = p0Var.f2712c;
        if (i2 != 0 && this.f1336M != null && jVar != null && (menuItemFindItem = jVar.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (p0Var.f2713d) {
            D.b bVar = this.f1338O;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        d();
        Q q2 = this.f1357x;
        boolean z2 = i2 == 1;
        if (z2 == q2.f2607g) {
            return;
        }
        q2.f2607g = z2;
        if (!q2.f2608h) {
            q2.f2601a = q2.f2605e;
            q2.f2602b = q2.f2606f;
            return;
        }
        if (z2) {
            int i3 = q2.f2604d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = q2.f2605e;
            }
            q2.f2601a = i3;
            int i4 = q2.f2603c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = q2.f2606f;
            }
            q2.f2602b = i4;
            return;
        }
        int i5 = q2.f2603c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = q2.f2605e;
        }
        q2.f2601a = i5;
        int i6 = q2.f2604d;
        if (i6 == Integer.MIN_VALUE) {
            i6 = q2.f2606f;
        }
        q2.f2602b = i6;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0112i c0112i;
        C0109f c0109f;
        k kVar;
        p0 p0Var = new p0(super.onSaveInstanceState());
        m0 m0Var = this.f1336M;
        if (m0Var != null && (kVar = m0Var.f2697f) != null) {
            p0Var.f2712c = kVar.f2097a;
        }
        ActionMenuView actionMenuView = this.f1339e;
        p0Var.f2713d = (actionMenuView == null || (c0112i = actionMenuView.f1228w) == null || (c0109f = c0112i.f2675v) == null || !c0109f.b()) ? false : true;
        return p0Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1329F = false;
        }
        if (!this.f1329F) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1329F = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1329F = false;
        }
        return true;
    }

    public final int p(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void q(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(p006d.b.c(getContext(), i2));
    }

    public void setCollapsible(boolean z2) {
        this.f1337N = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1359z) {
            this.f1359z = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1358y) {
            this.f1358y = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(p006d.b.c(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(p006d.b.c(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f1342h.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1339e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f1349o != i2) {
            this.f1349o = i2;
            if (i2 == 0) {
                this.f1348n = getContext();
            } else {
                this.f1348n = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.f1356w = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f1354u = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.t = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f1355v = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        n0 n0Var = new n0(context, attributeSet);
        n0Var.f2705a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p004c.a.f1738b);
        n0Var.f2705a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        n0Var.f2706b = 0;
        return n0Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0119p c0119p = this.f1346l;
        if (c0119p != null) {
            c0119p.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1346l.setImageDrawable(drawable);
        } else {
            C0119p c0119p = this.f1346l;
            if (c0119p != null) {
                c0119p.setImageDrawable(this.f1344j);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1343i == null) {
                this.f1343i = new C0120q(getContext(), 0);
            }
            if (!m(this.f1343i)) {
                b(this.f1343i, true);
            }
        } else {
            C0120q c0120q = this.f1343i;
            if (c0120q != null && m(c0120q)) {
                removeView(this.f1343i);
                this.f1332I.remove(this.f1343i);
            }
        }
        C0120q c0120q2 = this.f1343i;
        if (c0120q2 != null) {
            c0120q2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1343i == null) {
            this.f1343i = new C0120q(getContext(), 0);
        }
        C0120q c0120q = this.f1343i;
        if (c0120q != null) {
            c0120q.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C0119p c0119p = this.f1342h;
        if (c0119p != null) {
            c0119p.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f1342h)) {
                b(this.f1342h, true);
            }
        } else {
            C0119p c0119p = this.f1342h;
            if (c0119p != null && m(c0119p)) {
                removeView(this.f1342h);
                this.f1332I.remove(this.f1342h);
            }
        }
        C0119p c0119p2 = this.f1342h;
        if (c0119p2 != null) {
            c0119p2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0123u c0123u = this.f1341g;
            if (c0123u != null && m(c0123u)) {
                removeView(this.f1341g);
                this.f1332I.remove(this.f1341g);
            }
        } else {
            if (this.f1341g == null) {
                Context context = getContext();
                C0123u c0123u2 = new C0123u(context, null);
                this.f1341g = c0123u2;
                c0123u2.setSingleLine();
                this.f1341g.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1351q;
                if (i2 != 0) {
                    this.f1341g.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1328E;
                if (colorStateList != null) {
                    this.f1341g.setTextColor(colorStateList);
                }
            }
            if (!m(this.f1341g)) {
                b(this.f1341g, true);
            }
        }
        C0123u c0123u3 = this.f1341g;
        if (c0123u3 != null) {
            c0123u3.setText(charSequence);
        }
        this.f1326C = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1328E = colorStateList;
        C0123u c0123u = this.f1341g;
        if (c0123u != null) {
            c0123u.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0123u c0123u = this.f1340f;
            if (c0123u != null && m(c0123u)) {
                removeView(this.f1340f);
                this.f1332I.remove(this.f1340f);
            }
        } else {
            if (this.f1340f == null) {
                Context context = getContext();
                C0123u c0123u2 = new C0123u(context, null);
                this.f1340f = c0123u2;
                c0123u2.setSingleLine();
                this.f1340f.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1350p;
                if (i2 != 0) {
                    this.f1340f.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1327D;
                if (colorStateList != null) {
                    this.f1340f.setTextColor(colorStateList);
                }
            }
            if (!m(this.f1340f)) {
                b(this.f1340f, true);
            }
        }
        C0123u c0123u3 = this.f1340f;
        if (c0123u3 != null) {
            c0123u3.setText(charSequence);
        }
        this.f1325B = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1327D = colorStateList;
        C0123u c0123u = this.f1340f;
        if (c0123u != null) {
            c0123u.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(o0 o0Var) {
    }
}
