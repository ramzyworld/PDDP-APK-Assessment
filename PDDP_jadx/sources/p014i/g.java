package p014i;

import D.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.deeprf.pddp.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p016j.L;
import p016j.M;
import p016j.r;
import p042y.x;

/* JADX INFO: loaded from: classes.dex */
public final class g extends l implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public o f2045A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ViewTreeObserver f2046B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public m f2047C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f2048D;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f2049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f2053j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f2056m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f2057n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f2061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f2062s;
    public int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2063u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2064v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2066x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f2068z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f2054k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f2055l = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j f2058o = new j(20, this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2059p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2060q = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f2067y = false;

    public g(Context context, View view, int i2, boolean z2) {
        int i3 = 0;
        this.f2056m = new c(this, i3);
        this.f2057n = new d(this, i3);
        this.f2049f = context;
        this.f2061r = view;
        this.f2051h = i2;
        this.f2052i = z2;
        Field field = x.f3474a;
        this.t = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2050g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2053j = new Handler();
    }

    @Override // p014i.p
    public final void a(j jVar, boolean z2) {
        ArrayList arrayList = this.f2055l;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (jVar == ((f) arrayList.get(i2)).f2043b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((f) arrayList.get(i3)).f2043b.c(false);
        }
        f fVar = (f) arrayList.remove(i2);
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = fVar.f2043b.f2093r;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar == null || pVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z3 = this.f2048D;
        M m2 = fVar.f2042a;
        if (z3) {
            if (Build.VERSION.SDK_INT >= 23) {
                m2.f2584z.setExitTransition(null);
            }
            m2.f2584z.setAnimationStyle(0);
        }
        m2.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.t = ((f) arrayList.get(size2 - 1)).f2044c;
        } else {
            View view = this.f2061r;
            Field field = x.f3474a;
            this.t = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((f) arrayList.get(0)).f2043b.c(false);
                return;
            }
            return;
        }
        dismiss();
        o oVar = this.f2045A;
        if (oVar != null) {
            oVar.a(jVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2046B;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2046B.removeGlobalOnLayoutListener(this.f2056m);
            }
            this.f2046B = null;
        }
        this.f2062s.removeOnAttachStateChangeListener(this.f2057n);
        this.f2047C.onDismiss();
    }

    @Override // p014i.r
    public final void c() {
        if (j()) {
            return;
        }
        ArrayList arrayList = this.f2054k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((j) it.next());
        }
        arrayList.clear();
        View view = this.f2061r;
        this.f2062s = view;
        if (view != null) {
            boolean z2 = this.f2046B == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2046B = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2056m);
            }
            this.f2062s.addOnAttachStateChangeListener(this.f2057n);
        }
    }

    @Override // p014i.p
    public final boolean d() {
        return false;
    }

    @Override // p014i.r
    public final void dismiss() {
        ArrayList arrayList = this.f2055l;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                f fVar = fVarArr[i2];
                if (fVar.f2042a.f2584z.isShowing()) {
                    fVar.f2042a.dismiss();
                }
            }
        }
    }

    @Override // p014i.p
    public final void f(o oVar) {
        this.f2045A = oVar;
    }

    @Override // p014i.p
    public final void h() {
        Iterator it = this.f2055l.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((f) it.next()).f2042a.f2566g.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override // p014i.p
    public final boolean i(t tVar) {
        for (f fVar : this.f2055l) {
            if (tVar == fVar.f2043b) {
                fVar.f2042a.f2566g.requestFocus();
                return true;
            }
        }
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        l(tVar);
        o oVar = this.f2045A;
        if (oVar != null) {
            oVar.b(tVar);
        }
        return true;
    }

    @Override // p014i.r
    public final boolean j() {
        ArrayList arrayList = this.f2055l;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).f2042a.f2584z.isShowing();
    }

    @Override // p014i.r
    public final ListView k() {
        ArrayList arrayList = this.f2055l;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) arrayList.get(arrayList.size() - 1)).f2042a.f2566g;
    }

    @Override // p014i.l
    public final void l(j jVar) {
        jVar.b(this, this.f2049f);
        if (j()) {
            v(jVar);
        } else {
            this.f2054k.add(jVar);
        }
    }

    @Override // p014i.l
    public final void n(View view) {
        if (this.f2061r != view) {
            this.f2061r = view;
            int i2 = this.f2059p;
            Field field = x.f3474a;
            this.f2060q = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // p014i.l
    public final void o(boolean z2) {
        this.f2067y = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.f2055l;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                fVar = null;
                break;
            }
            fVar = (f) arrayList.get(i2);
            if (!fVar.f2042a.f2584z.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (fVar != null) {
            fVar.f2043b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p014i.l
    public final void p(int i2) {
        if (this.f2059p != i2) {
            this.f2059p = i2;
            View view = this.f2061r;
            Field field = x.f3474a;
            this.f2060q = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // p014i.l
    public final void q(int i2) {
        this.f2063u = true;
        this.f2065w = i2;
    }

    @Override // p014i.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2047C = (m) onDismissListener;
    }

    @Override // p014i.l
    public final void s(boolean z2) {
        this.f2068z = z2;
    }

    @Override // p014i.l
    public final void t(int i2) {
        this.f2064v = true;
        this.f2066x = i2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a8  */
    public final void v(j jVar) {
        View childAt;
        f fVar;
        char c2;
        int i2;
        int i3;
        int width;
        MenuItem item;
        h hVar;
        int headersCount;
        int i4;
        int firstVisiblePosition;
        Context context = this.f2049f;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        h hVar2 = new h(jVar, layoutInflaterFrom, this.f2052i, R.layout.abc_cascading_menu_item_layout);
        if (!j() && this.f2067y) {
            hVar2.f2071g = true;
        } else if (j()) {
            hVar2.f2071g = l.u(jVar);
        }
        int iM = l.m(hVar2, context, this.f2050g);
        M m2 = new M(context, this.f2051h);
        r rVar = m2.f2584z;
        m2.f2589D = this.f2058o;
        m2.f2576q = this;
        rVar.setOnDismissListener(this);
        m2.f2575p = this.f2061r;
        m2.f2573n = this.f2060q;
        m2.f2583y = true;
        rVar.setFocusable(true);
        rVar.setInputMethodMode(2);
        m2.a(hVar2);
        Drawable background = rVar.getBackground();
        if (background != null) {
            Rect rect = m2.f2581w;
            background.getPadding(rect);
            m2.f2567h = rect.left + rect.right + iM;
        } else {
            m2.f2567h = iM;
        }
        m2.f2573n = this.f2060q;
        ArrayList arrayList = this.f2055l;
        if (arrayList.size() > 0) {
            fVar = (f) arrayList.get(arrayList.size() - 1);
            j jVar2 = fVar.f2043b;
            int size = jVar2.f2081f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    item = null;
                    break;
                }
                item = jVar2.getItem(i5);
                if (item.hasSubMenu() && jVar == item.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (item == null) {
                childAt = null;
            } else {
                L l2 = fVar.f2042a.f2566g;
                ListAdapter adapter = l2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    hVar = (h) headerViewListAdapter.getWrappedAdapter();
                } else {
                    hVar = (h) adapter;
                    headersCount = 0;
                }
                int count = hVar.getCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= count) {
                        i4 = -1;
                        i6 = -1;
                        break;
                    } else {
                        if (item == hVar.getItem(i6)) {
                            i4 = -1;
                            break;
                        }
                        i6++;
                    }
                }
                if (i6 != i4 && (firstVisiblePosition = (i6 + headersCount) - l2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < l2.getChildCount()) {
                    childAt = l2.getChildAt(firstVisiblePosition);
                } else {
                    childAt = null;
                }
            }
        } else {
            childAt = null;
            fVar = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = M.f2588E;
                if (method != null) {
                    try {
                        method.invoke(rVar, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                rVar.setTouchModal(false);
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 23) {
                rVar.setEnterTransition(null);
            }
            L l3 = ((f) arrayList.get(arrayList.size() - 1)).f2042a.f2566g;
            int[] iArr = new int[2];
            l3.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.f2062s.getWindowVisibleDisplayFrame(rect2);
            int i8 = (this.t != 1 ? iArr[0] - iM >= 0 : (l3.getWidth() + iArr[0]) + iM > rect2.right) ? 0 : 1;
            boolean z2 = i8 == 1;
            this.t = i8;
            if (i7 >= 26) {
                m2.f2575p = childAt;
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.f2061r.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f2060q & 7) == 5) {
                    c2 = 0;
                    iArr2[0] = this.f2061r.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                } else {
                    c2 = 0;
                }
                i2 = iArr3[c2] - iArr2[c2];
                i3 = iArr3[1] - iArr2[1];
            }
            if ((this.f2060q & 5) == 5) {
                width = z2 ? i2 + iM : i2 - childAt.getWidth();
            } else {
                width = z2 ? i2 + childAt.getWidth() : i2 - iM;
            }
            m2.f2568i = width;
            m2.f2572m = true;
            m2.f2571l = true;
            m2.f2569j = i3;
            m2.f2570k = true;
        } else {
            if (this.f2063u) {
                m2.f2568i = this.f2065w;
            }
            if (this.f2064v) {
                m2.f2569j = this.f2066x;
                m2.f2570k = true;
            }
            Rect rect3 = this.f2122e;
            m2.f2582x = rect3 != null ? new Rect(rect3) : null;
        }
        arrayList.add(new f(m2, jVar, this.t));
        m2.c();
        L l4 = m2.f2566g;
        l4.setOnKeyListener(this);
        if (fVar == null && this.f2068z && jVar.f2087l != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) l4, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(jVar.f2087l);
            l4.addHeaderView(frameLayout, null, false);
            m2.c();
        }
    }
}
