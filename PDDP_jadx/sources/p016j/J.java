package p016j;

import D.n;
import E.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p004c.a;
import p014i.l;
import p014i.r;
import p042y.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class J implements r {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Method f2561A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Method f2562B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Method f2563C;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f2564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ListAdapter f2565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public L f2566g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2568i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2569j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2570k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2571l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2572m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f2574o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f2575p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l f2576q;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Handler f2580v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Rect f2582x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f2583y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final r f2584z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2567h = -2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2573n = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final G f2577r = new G(this, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final I f2578s = new I(this);
    public final H t = new H(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final G f2579u = new G(this, 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f2581w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2561A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2563C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f2562B = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public J(Context context, int i2) {
        int resourceId;
        this.f2564e = context;
        this.f2580v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, a.f1747k, i2, 0);
        this.f2568i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2569j = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2570k = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        r rVar = new r(context, null, i2, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, a.f1751o, i2, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            p000a.a.E(rVar, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        rVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : p006d.b.c(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f2584z = rVar;
        rVar.setInputMethodMode(1);
    }

    public final void a(ListAdapter listAdapter) {
        b bVar = this.f2574o;
        if (bVar == null) {
            this.f2574o = new b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f2565f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f2565f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2574o);
        }
        L l2 = this.f2566g;
        if (l2 != null) {
            l2.setAdapter(this.f2565f);
        }
    }

    @Override // p014i.r
    public final void c() {
        int i2;
        int maxAvailableHeight;
        int iMakeMeasureSpec;
        L l2;
        int i3 = 0;
        L l3 = this.f2566g;
        r rVar = this.f2584z;
        Context context = this.f2564e;
        if (l3 == null) {
            L l4 = new L(context, !this.f2583y);
            l4.setHoverListener((M) this);
            this.f2566g = l4;
            l4.setAdapter(this.f2565f);
            this.f2566g.setOnItemClickListener(this.f2576q);
            this.f2566g.setFocusable(true);
            this.f2566g.setFocusableInTouchMode(true);
            this.f2566g.setOnItemSelectedListener(new F(i3, this));
            this.f2566g.setOnScrollListener(this.t);
            rVar.setContentView(this.f2566g);
        }
        Drawable background = rVar.getBackground();
        Rect rect = this.f2581w;
        if (background != null) {
            background.getPadding(rect);
            int i4 = rect.top;
            i2 = rect.bottom + i4;
            if (!this.f2570k) {
                this.f2569j = -i4;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        boolean z2 = rVar.getInputMethodMode() == 2;
        View view = this.f2575p;
        int i5 = this.f2569j;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f2562B;
            if (method != null) {
                try {
                    maxAvailableHeight = ((Integer) method.invoke(rVar, view, Integer.valueOf(i5), Boolean.valueOf(z2))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    maxAvailableHeight = rVar.getMaxAvailableHeight(view, i5);
                }
            } else {
                maxAvailableHeight = rVar.getMaxAvailableHeight(view, i5);
            }
        } else {
            maxAvailableHeight = rVar.getMaxAvailableHeight(view, i5, z2);
        }
        int i6 = this.f2567h;
        if (i6 != -2) {
            iMakeMeasureSpec = i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
        }
        int iA = this.f2566g.a(iMakeMeasureSpec, maxAvailableHeight);
        int paddingBottom = iA + (iA > 0 ? this.f2566g.getPaddingBottom() + this.f2566g.getPaddingTop() + i2 : 0);
        this.f2584z.getInputMethodMode();
        if (Build.VERSION.SDK_INT >= 23) {
            n.d(rVar, 1002);
        } else {
            if (!p000a.a.f1126b) {
                try {
                    Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                    p000a.a.f1125a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused2) {
                }
                p000a.a.f1126b = true;
            }
            Method method2 = p000a.a.f1125a;
            if (method2 != null) {
                try {
                    method2.invoke(rVar, 1002);
                } catch (Exception unused3) {
                }
            }
        }
        if (rVar.isShowing()) {
            View view2 = this.f2575p;
            Field field = x.f3474a;
            if (view2.isAttachedToWindow()) {
                int width = this.f2567h;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f2575p.getWidth();
                }
                rVar.setOutsideTouchable(true);
                rVar.update(this.f2575p, this.f2568i, this.f2569j, width < 0 ? -1 : width, paddingBottom >= 0 ? paddingBottom : -1);
                return;
            }
            return;
        }
        int width2 = this.f2567h;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f2575p.getWidth();
        }
        rVar.setWidth(width2);
        rVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f2561A;
            if (method3 != null) {
                try {
                    method3.invoke(rVar, Boolean.TRUE);
                } catch (Exception unused4) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            rVar.setIsClippedToScreen(true);
        }
        rVar.setOutsideTouchable(true);
        rVar.setTouchInterceptor(this.f2578s);
        if (this.f2572m) {
            p000a.a.E(rVar, this.f2571l);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method4 = f2563C;
            if (method4 != null) {
                try {
                    method4.invoke(rVar, this.f2582x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            rVar.setEpicenterBounds(this.f2582x);
        }
        rVar.showAsDropDown(this.f2575p, this.f2568i, this.f2569j, this.f2573n);
        this.f2566g.setSelection(-1);
        if ((!this.f2583y || this.f2566g.isInTouchMode()) && (l2 = this.f2566g) != null) {
            l2.setListSelectionHidden(true);
            l2.requestLayout();
        }
        if (this.f2583y) {
            return;
        }
        this.f2580v.post(this.f2579u);
    }

    @Override // p014i.r
    public final void dismiss() {
        r rVar = this.f2584z;
        rVar.dismiss();
        rVar.setContentView(null);
        this.f2566g = null;
        this.f2580v.removeCallbacks(this.f2577r);
    }

    @Override // p014i.r
    public final boolean j() {
        return this.f2584z.isShowing();
    }

    @Override // p014i.r
    public final ListView k() {
        return this.f2566g;
    }
}
