package androidx.recyclerview.widget;

import D.j;
import N.C0037m;
import N.D;
import N.G;
import N.x;
import N.y;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1629p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f1630q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f1629p = -1;
        new SparseIntArray();
        new SparseIntArray();
        j jVar = new j(7);
        this.f1630q = jVar;
        new Rect();
        int i4 = x.w(context, attributeSet, i2, i3).f538c;
        if (i4 == this.f1629p) {
            return;
        }
        if (i4 < 1) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i4);
        }
        this.f1629p = i4;
        ((SparseIntArray) jVar.f44f).clear();
        H();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Q(false);
    }

    public final int R(D d2, G g2, int i2) {
        boolean z2 = g2.f432c;
        j jVar = this.f1630q;
        if (!z2) {
            int i3 = this.f1629p;
            jVar.getClass();
            return j.r(i2, i3);
        }
        RecyclerView recyclerView = (RecyclerView) d2.f428f;
        if (i2 < 0 || i2 >= recyclerView.f1667b0.a()) {
            throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + recyclerView.f1667b0.a() + recyclerView.h());
        }
        int iW = !recyclerView.f1667b0.f432c ? i2 : recyclerView.f1673g.w(i2, 0);
        if (iW != -1) {
            int i4 = this.f1629p;
            jVar.getClass();
            return j.r(iW, i4);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    @Override // N.x
    public final boolean d(y yVar) {
        return yVar instanceof C0037m;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, N.x
    public final y l() {
        return this.f1631h == 0 ? new C0037m(-2, -1) : new C0037m(-1, -2);
    }

    @Override // N.x
    public final y m(Context context, AttributeSet attributeSet) {
        return new C0037m(context, attributeSet);
    }

    @Override // N.x
    public final y n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0037m((ViewGroup.MarginLayoutParams) layoutParams) : new C0037m(layoutParams);
    }

    @Override // N.x
    public final int q(D d2, G g2) {
        if (this.f1631h == 1) {
            return this.f1629p;
        }
        if (g2.a() < 1) {
            return 0;
        }
        return R(d2, g2, g2.a() - 1) + 1;
    }

    @Override // N.x
    public final int x(D d2, G g2) {
        if (this.f1631h == 0) {
            return this.f1629p;
        }
        if (g2.a() < 1) {
            return 0;
        }
        return R(d2, g2, g2.a() - 1) + 1;
    }
}
