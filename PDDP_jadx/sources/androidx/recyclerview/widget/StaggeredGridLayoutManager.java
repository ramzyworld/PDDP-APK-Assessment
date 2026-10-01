package androidx.recyclerview.widget;

import D.b;
import D.j;
import H.a;
import N.C0038n;
import N.C0039o;
import N.C0041q;
import N.D;
import N.G;
import N.L;
import N.N;
import N.O;
import N.x;
import N.y;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final O[] f1698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0041q f1699j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0041q f1700k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f1702m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f1703n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j f1704o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1705p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public N f1706q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f1707r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f1708s;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1697h = -1;
        this.f1702m = false;
        j jVar = new j(9, false);
        this.f1704o = jVar;
        this.f1705p = 2;
        new Rect();
        new a(11, this);
        this.f1707r = true;
        this.f1708s = new b(3, this);
        C0039o c0039oW = x.w(context, attributeSet, i2, i3);
        int i4 = c0039oW.f537b;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i4 != this.f1701l) {
            this.f1701l = i4;
            C0041q c0041q = this.f1699j;
            this.f1699j = this.f1700k;
            this.f1700k = c0041q;
            H();
        }
        int i5 = c0039oW.f538c;
        a(null);
        if (i5 != this.f1697h) {
            jVar.f44f = null;
            H();
            this.f1697h = i5;
            new BitSet(this.f1697h);
            this.f1698i = new O[this.f1697h];
            for (int i6 = 0; i6 < this.f1697h; i6++) {
                this.f1698i[i6] = new O(this, i6);
            }
            H();
        }
        boolean z2 = c0039oW.f539d;
        a(null);
        N n2 = this.f1706q;
        if (n2 != null && n2.f455h != z2) {
            n2.f455h = z2;
        }
        this.f1702m = z2;
        H();
        C0038n c0038n = new C0038n(0);
        c0038n.f534b = 0;
        c0038n.f535c = 0;
        this.f1699j = C0041q.a(this, this.f1701l);
        this.f1700k = C0041q.a(this, 1 - this.f1701l);
    }

    @Override // N.x
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View viewO = O(false);
            View viewN = N(false);
            if (viewO == null || viewN == null) {
                return;
            }
            ((y) viewO.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // N.x
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof N) {
            this.f1706q = (N) parcelable;
            H();
        }
    }

    @Override // N.x
    public final Parcelable C() {
        N n2 = this.f1706q;
        if (n2 != null) {
            N n3 = new N();
            n3.f450c = n2.f450c;
            n3.f448a = n2.f448a;
            n3.f449b = n2.f449b;
            n3.f451d = n2.f451d;
            n3.f452e = n2.f452e;
            n3.f453f = n2.f453f;
            n3.f455h = n2.f455h;
            n3.f456i = n2.f456i;
            n3.f457j = n2.f457j;
            n3.f454g = n2.f454g;
            return n3;
        }
        N n4 = new N();
        n4.f455h = this.f1702m;
        n4.f456i = false;
        n4.f457j = false;
        n4.f452e = 0;
        if (p() > 0) {
            P();
            n4.f448a = 0;
            View viewN = this.f1703n ? N(true) : O(true);
            if (viewN != null) {
                ((y) viewN.getLayoutParams()).getClass();
                throw null;
            }
            n4.f449b = -1;
            int i2 = this.f1697h;
            n4.f450c = i2;
            n4.f451d = new int[i2];
            for (int i3 = 0; i3 < this.f1697h; i3++) {
                O o2 = this.f1698i[i3];
                int iE = o2.f459b;
                if (iE == Integer.MIN_VALUE) {
                    if (o2.f458a.size() == 0) {
                        iE = Integer.MIN_VALUE;
                    } else {
                        View view = (View) o2.f458a.get(0);
                        L l2 = (L) view.getLayoutParams();
                        o2.f459b = o2.f462e.f1699j.c(view);
                        l2.getClass();
                        iE = o2.f459b;
                    }
                }
                if (iE != Integer.MIN_VALUE) {
                    iE -= this.f1699j.e();
                }
                n4.f451d[i3] = iE;
            }
        } else {
            n4.f448a = -1;
            n4.f449b = -1;
            n4.f450c = 0;
        }
        return n4;
    }

    @Override // N.x
    public final void D(int i2) {
        if (i2 == 0) {
            J();
        }
    }

    public final boolean J() {
        int i2 = this.f1697h;
        boolean z2 = this.f1703n;
        if (p() == 0 || this.f1705p == 0 || !this.f556e) {
            return false;
        }
        if (z2) {
            Q();
            P();
        } else {
            P();
            Q();
        }
        int iP = p();
        int i3 = iP - 1;
        new BitSet(i2).set(0, i2, true);
        if (this.f1701l == 1) {
            RecyclerView recyclerView = this.f553b;
            Field field = p042y.x.f3474a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z2) {
            iP = -1;
        } else {
            i3 = 0;
        }
        if (i3 == iP) {
            return false;
        }
        ((L) o(i3).getLayoutParams()).getClass();
        throw null;
    }

    public final int K(G g2) {
        if (p() == 0) {
            return 0;
        }
        C0041q c0041q = this.f1699j;
        boolean z2 = !this.f1707r;
        return a1.a.e(g2, c0041q, O(z2), N(z2), this, this.f1707r);
    }

    public final void L(G g2) {
        if (p() == 0) {
            return;
        }
        boolean z2 = !this.f1707r;
        View viewO = O(z2);
        View viewN = N(z2);
        if (p() == 0 || g2.a() == 0 || viewO == null || viewN == null) {
            return;
        }
        ((y) viewO.getLayoutParams()).getClass();
        throw null;
    }

    public final int M(G g2) {
        if (p() == 0) {
            return 0;
        }
        C0041q c0041q = this.f1699j;
        boolean z2 = !this.f1707r;
        return a1.a.f(g2, c0041q, O(z2), N(z2), this, this.f1707r);
    }

    public final View N(boolean z2) {
        int iE = this.f1699j.e();
        int iD = this.f1699j.d();
        View view = null;
        for (int iP = p() - 1; iP >= 0; iP--) {
            View viewO = o(iP);
            int iC = this.f1699j.c(viewO);
            int iB = this.f1699j.b(viewO);
            if (iB > iE && iC < iD) {
                if (iB <= iD || !z2) {
                    return viewO;
                }
                if (view == null) {
                    view = viewO;
                }
            }
        }
        return view;
    }

    public final View O(boolean z2) {
        int iE = this.f1699j.e();
        int iD = this.f1699j.d();
        int iP = p();
        View view = null;
        for (int i2 = 0; i2 < iP; i2++) {
            View viewO = o(i2);
            int iC = this.f1699j.c(viewO);
            if (this.f1699j.b(viewO) > iE && iC < iD) {
                if (iC >= iE || !z2) {
                    return viewO;
                }
                if (view == null) {
                    view = viewO;
                }
            }
        }
        return view;
    }

    public final void P() {
        if (p() == 0) {
            return;
        }
        x.v(o(0));
        throw null;
    }

    public final void Q() {
        int iP = p();
        if (iP == 0) {
            return;
        }
        x.v(o(iP - 1));
        throw null;
    }

    @Override // N.x
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f1706q != null || (recyclerView = this.f553b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // N.x
    public final boolean b() {
        return this.f1701l == 0;
    }

    @Override // N.x
    public final boolean c() {
        return this.f1701l == 1;
    }

    @Override // N.x
    public final boolean d(y yVar) {
        return yVar instanceof L;
    }

    @Override // N.x
    public final int f(G g2) {
        return K(g2);
    }

    @Override // N.x
    public final void g(G g2) {
        L(g2);
    }

    @Override // N.x
    public final int h(G g2) {
        return M(g2);
    }

    @Override // N.x
    public final int i(G g2) {
        return K(g2);
    }

    @Override // N.x
    public final void j(G g2) {
        L(g2);
    }

    @Override // N.x
    public final int k(G g2) {
        return M(g2);
    }

    @Override // N.x
    public final y l() {
        return this.f1701l == 0 ? new L(-2, -1) : new L(-1, -2);
    }

    @Override // N.x
    public final y m(Context context, AttributeSet attributeSet) {
        return new L(context, attributeSet);
    }

    @Override // N.x
    public final y n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new L((ViewGroup.MarginLayoutParams) layoutParams) : new L(layoutParams);
    }

    @Override // N.x
    public final int q(D d2, G g2) {
        if (this.f1701l == 1) {
            return this.f1697h;
        }
        super.q(d2, g2);
        return 1;
    }

    @Override // N.x
    public final int x(D d2, G g2) {
        if (this.f1701l == 0) {
            return this.f1697h;
        }
        super.x(d2, g2);
        return 1;
    }

    @Override // N.x
    public final boolean y() {
        return this.f1705p != 0;
    }

    @Override // N.x
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f553b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f1708s);
        }
        for (int i2 = 0; i2 < this.f1697h; i2++) {
            O o2 = this.f1698i[i2];
            o2.f458a.clear();
            o2.f459b = Integer.MIN_VALUE;
            o2.f460c = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}
