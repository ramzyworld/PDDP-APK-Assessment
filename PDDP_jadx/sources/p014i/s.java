package p014i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.deeprf.pddp.R;
import java.lang.reflect.Field;
import p016j.L;
import p016j.M;
import p042y.x;

/* JADX INFO: loaded from: classes.dex */
public final class s extends l implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f2135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f2136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f2137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2139j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final M f2141l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f2142m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f2143n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f2144o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f2145p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f2146q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public o f2147r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ViewTreeObserver f2148s;
    public boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2149u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2150v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2151w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2152x;

    public s(int i2, Context context, View view, j jVar, boolean z2) {
        int i3 = 1;
        this.f2142m = new c(this, i3);
        this.f2143n = new d(this, i3);
        this.f2135f = context;
        this.f2136g = jVar;
        this.f2138i = z2;
        this.f2137h = new h(jVar, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2140k = i2;
        Resources resources = context.getResources();
        this.f2139j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2145p = view;
        this.f2141l = new M(context, i2);
        jVar.b(this, context);
    }

    @Override // p014i.p
    public final void a(j jVar, boolean z2) {
        if (jVar != this.f2136g) {
            return;
        }
        dismiss();
        o oVar = this.f2147r;
        if (oVar != null) {
            oVar.a(jVar, z2);
        }
    }

    @Override // p014i.r
    public final void c() {
        View view;
        if (j()) {
            return;
        }
        if (this.t || (view = this.f2145p) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2146q = view;
        M m2 = this.f2141l;
        m2.f2584z.setOnDismissListener(this);
        m2.f2576q = this;
        m2.f2583y = true;
        m2.f2584z.setFocusable(true);
        View view2 = this.f2146q;
        boolean z2 = this.f2148s == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2148s = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2142m);
        }
        view2.addOnAttachStateChangeListener(this.f2143n);
        m2.f2575p = view2;
        m2.f2573n = this.f2151w;
        boolean z3 = this.f2149u;
        Context context = this.f2135f;
        h hVar = this.f2137h;
        if (!z3) {
            this.f2150v = l.m(hVar, context, this.f2139j);
            this.f2149u = true;
        }
        int i2 = this.f2150v;
        Drawable background = m2.f2584z.getBackground();
        if (background != null) {
            Rect rect = m2.f2581w;
            background.getPadding(rect);
            m2.f2567h = rect.left + rect.right + i2;
        } else {
            m2.f2567h = i2;
        }
        m2.f2584z.setInputMethodMode(2);
        Rect rect2 = this.f2122e;
        m2.f2582x = rect2 != null ? new Rect(rect2) : null;
        m2.c();
        L l2 = m2.f2566g;
        l2.setOnKeyListener(this);
        if (this.f2152x) {
            j jVar = this.f2136g;
            if (jVar.f2087l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) l2, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(jVar.f2087l);
                }
                frameLayout.setEnabled(false);
                l2.addHeaderView(frameLayout, null, false);
            }
        }
        m2.a(hVar);
        m2.c();
    }

    @Override // p014i.p
    public final boolean d() {
        return false;
    }

    @Override // p014i.r
    public final void dismiss() {
        if (j()) {
            this.f2141l.dismiss();
        }
    }

    @Override // p014i.p
    public final void f(o oVar) {
        this.f2147r = oVar;
    }

    @Override // p014i.p
    public final void h() {
        this.f2149u = false;
        h hVar = this.f2137h;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // p014i.p
    public final boolean i(t tVar) {
        if (tVar.hasVisibleItems()) {
            n nVar = new n(this.f2140k, this.f2135f, this.f2146q, tVar, this.f2138i);
            o oVar = this.f2147r;
            nVar.f2131h = oVar;
            l lVar = nVar.f2132i;
            if (lVar != null) {
                lVar.f(oVar);
            }
            boolean zU = l.u(tVar);
            nVar.f2130g = zU;
            l lVar2 = nVar.f2132i;
            if (lVar2 != null) {
                lVar2.o(zU);
            }
            nVar.f2133j = this.f2144o;
            this.f2144o = null;
            this.f2136g.c(false);
            M m2 = this.f2141l;
            int width = m2.f2568i;
            int i2 = !m2.f2570k ? 0 : m2.f2569j;
            int i3 = this.f2151w;
            View view = this.f2145p;
            Field field = x.f3474a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                width += this.f2145p.getWidth();
            }
            if (!nVar.b()) {
                if (nVar.f2128e != null) {
                    nVar.d(width, i2, true, true);
                }
            }
            o oVar2 = this.f2147r;
            if (oVar2 != null) {
                oVar2.b(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // p014i.r
    public final boolean j() {
        return !this.t && this.f2141l.f2584z.isShowing();
    }

    @Override // p014i.r
    public final ListView k() {
        return this.f2141l.f2566g;
    }

    @Override // p014i.l
    public final void n(View view) {
        this.f2145p = view;
    }

    @Override // p014i.l
    public final void o(boolean z2) {
        this.f2137h.f2071g = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.t = true;
        this.f2136g.c(true);
        ViewTreeObserver viewTreeObserver = this.f2148s;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2148s = this.f2146q.getViewTreeObserver();
            }
            this.f2148s.removeGlobalOnLayoutListener(this.f2142m);
            this.f2148s = null;
        }
        this.f2146q.removeOnAttachStateChangeListener(this.f2143n);
        m mVar = this.f2144o;
        if (mVar != null) {
            mVar.onDismiss();
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
        this.f2151w = i2;
    }

    @Override // p014i.l
    public final void q(int i2) {
        this.f2141l.f2568i = i2;
    }

    @Override // p014i.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2144o = (m) onDismissListener;
    }

    @Override // p014i.l
    public final void s(boolean z2) {
        this.f2152x = z2;
    }

    @Override // p014i.l
    public final void t(int i2) {
        M m2 = this.f2141l;
        m2.f2569j = i2;
        m2.f2570k = true;
    }

    @Override // p014i.l
    public final void l(j jVar) {
    }
}
