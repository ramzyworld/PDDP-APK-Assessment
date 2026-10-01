package p016j;

import V0.i;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.deeprf.pddp.R;
import java.util.ArrayList;
import p014i.j;
import p014i.k;
import p014i.l;
import p014i.o;
import p014i.p;
import p014i.q;
import p014i.t;

/* JADX INFO: renamed from: j.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0112i implements p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f2659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f2660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f2661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LayoutInflater f2662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o f2663i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ActionMenuView f2665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0111h f2666l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f2667m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2668n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2669o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2670p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2671q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2672r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2673s;
    public boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0109f f2675v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0109f f2676w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i f2677x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0110g f2678y;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2664j = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SparseBooleanArray f2674u = new SparseBooleanArray();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final D.j f2679z = new D.j(26, this);

    public C0112i(Context context) {
        this.f2659e = context;
        this.f2662h = LayoutInflater.from(context);
    }

    @Override // p014i.p
    public final void a(j jVar, boolean z2) {
        j();
        C0109f c0109f = this.f2676w;
        if (c0109f != null && c0109f.b()) {
            c0109f.f2132i.dismiss();
        }
        o oVar = this.f2663i;
        if (oVar != null) {
            oVar.a(jVar, z2);
        }
    }

    @Override // p014i.p
    public final boolean b(k kVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View c(k kVar, View view, ActionMenuView actionMenuView) {
        q qVar;
        View view2 = kVar.f2121z;
        if (view2 == null) {
            view2 = null;
        }
        if (view2 == null || kVar.c()) {
            if (view instanceof q) {
                qVar = (q) view;
            } else {
                qVar = (q) this.f2662h.inflate(this.f2664j, (ViewGroup) actionMenuView, false);
            }
            qVar.c(kVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) qVar;
            actionMenuItemView.setItemInvoker(this.f2665k);
            if (this.f2678y == null) {
                this.f2678y = new C0110g(this);
            }
            actionMenuItemView.setPopupCallback(this.f2678y);
            view2 = (View) qVar;
        }
        view2.setVisibility(kVar.f2096B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C0114k)) {
            view2.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view2;
    }

    @Override // p014i.p
    public final boolean d() {
        ArrayList arrayListK;
        int size;
        int i2;
        boolean z2;
        j jVar = this.f2661g;
        if (jVar != null) {
            arrayListK = jVar.k();
            size = arrayListK.size();
        } else {
            arrayListK = null;
            size = 0;
        }
        int i3 = this.f2673s;
        int i4 = this.f2672r;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = this.f2665k;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z2 = true;
            if (i5 >= size) {
                break;
            }
            k kVar = (k) arrayListK.get(i5);
            int i8 = kVar.f2120y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.t && kVar.f2096B) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f2669o && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f2674u;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            k kVar2 = (k) arrayListK.get(i10);
            int i12 = kVar2.f2120y;
            boolean z4 = (i12 & 2) == i2;
            int i13 = kVar2.f2098b;
            if (z4) {
                View viewC = c(kVar2, null, actionMenuView);
                viewC.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewC.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                kVar2.f(z2);
            } else {
                if ((i12 & 1) == z2) {
                    boolean z5 = sparseBooleanArray.get(i13);
                    boolean z6 = (i9 > 0 || z5) && i4 > 0;
                    if (z6) {
                        View viewC2 = c(kVar2, null, actionMenuView);
                        viewC2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewC2.getMeasuredWidth();
                        i4 -= measuredWidth2;
                        if (i11 == 0) {
                            i11 = measuredWidth2;
                        }
                        z6 &= i4 + i11 > 0;
                    }
                    if (z6 && i13 != 0) {
                        sparseBooleanArray.put(i13, true);
                    } else if (z5) {
                        sparseBooleanArray.put(i13, false);
                        for (int i14 = 0; i14 < i10; i14++) {
                            k kVar3 = (k) arrayListK.get(i14);
                            if (kVar3.f2098b == i13) {
                                if (kVar3.d()) {
                                    i9++;
                                }
                                kVar3.f(false);
                            }
                        }
                    }
                    if (z6) {
                        i9--;
                    }
                    kVar2.f(z6);
                } else {
                    kVar2.f(false);
                }
                i10++;
                i2 = 2;
                z2 = true;
            }
            i10++;
            i2 = 2;
            z2 = true;
        }
        return true;
    }

    @Override // p014i.p
    public final void e(Context context, j jVar) {
        this.f2660f = context;
        LayoutInflater.from(context);
        this.f2661g = jVar;
        Resources resources = context.getResources();
        if (!this.f2670p) {
            this.f2669o = true;
        }
        int i2 = 2;
        this.f2671q = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.f2673s = i2;
        int measuredWidth = this.f2671q;
        if (this.f2669o) {
            if (this.f2666l == null) {
                C0111h c0111h = new C0111h(this, this.f2659e);
                this.f2666l = c0111h;
                if (this.f2668n) {
                    c0111h.setImageDrawable(this.f2667m);
                    this.f2667m = null;
                    this.f2668n = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2666l.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f2666l.getMeasuredWidth();
        } else {
            this.f2666l = null;
        }
        this.f2672r = measuredWidth;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // p014i.p
    public final void f(o oVar) {
        throw null;
    }

    @Override // p014i.p
    public final boolean g(k kVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p014i.p
    public final void h() {
        int i2;
        ActionMenuView actionMenuView = this.f2665k;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (actionMenuView != null) {
            j jVar = this.f2661g;
            if (jVar != null) {
                jVar.i();
                ArrayList arrayListK = this.f2661g.k();
                int size = arrayListK.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    k kVar = (k) arrayListK.get(i3);
                    if (kVar.d()) {
                        View childAt = actionMenuView.getChildAt(i2);
                        k itemData = childAt instanceof q ? ((q) childAt).getItemData() : null;
                        View viewC = c(kVar, childAt, actionMenuView);
                        if (kVar != itemData) {
                            viewC.setPressed(false);
                            viewC.jumpDrawablesToCurrentState();
                        }
                        if (viewC != childAt) {
                            ViewGroup viewGroup = (ViewGroup) viewC.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(viewC);
                            }
                            this.f2665k.addView(viewC, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i2) == this.f2666l) {
                    i2++;
                } else {
                    actionMenuView.removeViewAt(i2);
                }
            }
        }
        this.f2665k.requestLayout();
        j jVar2 = this.f2661g;
        if (jVar2 != null) {
            jVar2.i();
            ArrayList arrayList2 = jVar2.f2084i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((k) arrayList2.get(i4)).getClass();
            }
        }
        j jVar3 = this.f2661g;
        if (jVar3 != null) {
            jVar3.i();
            arrayList = jVar3.f2085j;
        }
        if (this.f2669o && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((k) arrayList.get(0)).f2096B;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f2666l == null) {
                this.f2666l = new C0111h(this, this.f2659e);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f2666l.getParent();
            if (viewGroup2 != this.f2665k) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f2666l);
                }
                ActionMenuView actionMenuView2 = this.f2665k;
                C0111h c0111h = this.f2666l;
                actionMenuView2.getClass();
                C0114k c0114kH = ActionMenuView.h();
                c0114kH.f2685c = true;
                actionMenuView2.addView(c0111h, c0114kH);
            }
        } else {
            C0111h c0111h2 = this.f2666l;
            if (c0111h2 != null) {
                ViewParent parent = c0111h2.getParent();
                ActionMenuView actionMenuView3 = this.f2665k;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f2666l);
                }
            }
        }
        this.f2665k.setOverflowReserved(this.f2669o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p014i.p
    public final boolean i(t tVar) {
        boolean z2;
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        t tVar2 = tVar;
        while (true) {
            j jVar = tVar2.f2153v;
            if (jVar == this.f2661g) {
                break;
            }
            tVar2 = (t) jVar;
        }
        ActionMenuView actionMenuView = this.f2665k;
        View view = null;
        view = null;
        if (actionMenuView != null) {
            int childCount = actionMenuView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = actionMenuView.getChildAt(i2);
                if ((childAt instanceof q) && ((q) childAt).getItemData() == tVar2.f2154w) {
                    view = childAt;
                    break;
                }
            }
        }
        if (view == null) {
            return false;
        }
        tVar.f2154w.getClass();
        int size = tVar.f2081f.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = tVar.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i3++;
        }
        C0109f c0109f = new C0109f(this, this.f2660f, tVar, view);
        this.f2676w = c0109f;
        c0109f.f2130g = z2;
        l lVar = c0109f.f2132i;
        if (lVar != null) {
            lVar.o(z2);
        }
        C0109f c0109f2 = this.f2676w;
        if (!c0109f2.b()) {
            if (c0109f2.f2128e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0109f2.d(0, 0, false, false);
        }
        o oVar = this.f2663i;
        if (oVar != null) {
            oVar.b(tVar);
        }
        return true;
    }

    public final boolean j() {
        ActionMenuView actionMenuView;
        i iVar = this.f2677x;
        if (iVar != null && (actionMenuView = this.f2665k) != null) {
            actionMenuView.removeCallbacks(iVar);
            this.f2677x = null;
            return true;
        }
        C0109f c0109f = this.f2675v;
        if (c0109f == null) {
            return false;
        }
        if (c0109f.b()) {
            c0109f.f2132i.dismiss();
        }
        return true;
    }

    public final boolean k() {
        j jVar;
        if (!this.f2669o) {
            return false;
        }
        C0109f c0109f = this.f2675v;
        if ((c0109f != null && c0109f.b()) || (jVar = this.f2661g) == null || this.f2665k == null || this.f2677x != null) {
            return false;
        }
        jVar.i();
        if (jVar.f2085j.isEmpty()) {
            return false;
        }
        i iVar = new i(1, this, new C0109f(this, this.f2660f, this.f2661g, this.f2666l));
        this.f2677x = iVar;
        this.f2665k.post(iVar);
        o oVar = this.f2663i;
        if (oVar == null) {
            return true;
        }
        oVar.b(null);
        return true;
    }
}
