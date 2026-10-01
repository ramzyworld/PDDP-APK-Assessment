package androidx.recyclerview.widget;

import H.a;
import N.C0039o;
import N.C0040p;
import N.C0041q;
import N.G;
import N.x;
import N.y;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f1632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0041q f1633j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1634k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f1635l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1636m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f1637n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0040p f1638o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1631h = 1;
        this.f1634k = false;
        C0039o c0039o = new C0039o(0);
        c0039o.f537b = -1;
        c0039o.f538c = Integer.MIN_VALUE;
        c0039o.f539d = false;
        c0039o.f540e = false;
        C0039o c0039oW = x.w(context, attributeSet, i2, i3);
        int i4 = c0039oW.f537b;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i4);
        }
        a(null);
        if (i4 != this.f1631h || this.f1633j == null) {
            this.f1633j = C0041q.a(this, i4);
            this.f1631h = i4;
            H();
        }
        boolean z2 = c0039oW.f539d;
        a(null);
        if (z2 != this.f1634k) {
            this.f1634k = z2;
            H();
        }
        Q(c0039oW.f540e);
    }

    @Override // N.x
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View viewP = P(0, p(), false);
            if (viewP != null) {
                ((y) viewP.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View viewP2 = P(p() - 1, -1, false);
            if (viewP2 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((y) viewP2.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // N.x
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0040p) {
            this.f1638o = (C0040p) parcelable;
            H();
        }
    }

    @Override // N.x
    public final Parcelable C() {
        C0040p c0040p = this.f1638o;
        if (c0040p != null) {
            C0040p c0040p2 = new C0040p();
            c0040p2.f541a = c0040p.f541a;
            c0040p2.f542b = c0040p.f542b;
            c0040p2.f543c = c0040p.f543c;
            return c0040p2;
        }
        C0040p c0040p3 = new C0040p();
        if (p() <= 0) {
            c0040p3.f541a = -1;
            return c0040p3;
        }
        M();
        boolean z2 = this.f1635l;
        c0040p3.f543c = z2;
        if (!z2) {
            x.v(o(z2 ? p() - 1 : 0));
            throw null;
        }
        View viewO = o(z2 ? 0 : p() - 1);
        c0040p3.f542b = this.f1633j.d() - this.f1633j.b(viewO);
        x.v(viewO);
        throw null;
    }

    public final int J(G g2) {
        if (p() == 0) {
            return 0;
        }
        M();
        C0041q c0041q = this.f1633j;
        boolean z2 = !this.f1637n;
        return a1.a.e(g2, c0041q, O(z2), N(z2), this, this.f1637n);
    }

    public final void K(G g2) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z2 = !this.f1637n;
        View viewO = O(z2);
        View viewN = N(z2);
        if (p() == 0 || g2.a() == 0 || viewO == null || viewN == null) {
            return;
        }
        ((y) viewO.getLayoutParams()).getClass();
        throw null;
    }

    public final int L(G g2) {
        if (p() == 0) {
            return 0;
        }
        M();
        C0041q c0041q = this.f1633j;
        boolean z2 = !this.f1637n;
        return a1.a.f(g2, c0041q, O(z2), N(z2), this, this.f1637n);
    }

    public final void M() {
        if (this.f1632i == null) {
            this.f1632i = new a(7);
        }
    }

    public final View N(boolean z2) {
        return this.f1635l ? P(0, p(), z2) : P(p() - 1, -1, z2);
    }

    public final View O(boolean z2) {
        return this.f1635l ? P(p() - 1, -1, z2) : P(0, p(), z2);
    }

    public final View P(int i2, int i3, boolean z2) {
        M();
        int i4 = z2 ? 24579 : 320;
        return this.f1631h == 0 ? this.f554c.j(i2, i3, i4, 320) : this.f555d.j(i2, i3, i4, 320);
    }

    public void Q(boolean z2) {
        a(null);
        if (this.f1636m == z2) {
            return;
        }
        this.f1636m = z2;
        H();
    }

    @Override // N.x
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f1638o != null || (recyclerView = this.f553b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // N.x
    public final boolean b() {
        return this.f1631h == 0;
    }

    @Override // N.x
    public final boolean c() {
        return this.f1631h == 1;
    }

    @Override // N.x
    public final int f(G g2) {
        return J(g2);
    }

    @Override // N.x
    public final void g(G g2) {
        K(g2);
    }

    @Override // N.x
    public final int h(G g2) {
        return L(g2);
    }

    @Override // N.x
    public final int i(G g2) {
        return J(g2);
    }

    @Override // N.x
    public final void j(G g2) {
        K(g2);
    }

    @Override // N.x
    public final int k(G g2) {
        return L(g2);
    }

    @Override // N.x
    public y l() {
        return new y(-2, -2);
    }

    @Override // N.x
    public final boolean y() {
        return true;
    }

    @Override // N.x
    public final void z(RecyclerView recyclerView) {
    }
}
