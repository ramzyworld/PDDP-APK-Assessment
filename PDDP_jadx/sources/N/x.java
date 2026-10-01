package N;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0026b f552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q f554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q f555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f558g;

    public x() {
        w wVar = new w(this, 0);
        w wVar2 = new w(this, 1);
        this.f554c = new Q(wVar);
        this.f555d = new Q(wVar2);
        this.f556e = false;
    }

    public static int e(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i3, i4) : size;
        }
        return Math.min(size, Math.max(i3, i4));
    }

    public static void v(View view) {
        ((y) view.getLayoutParams()).getClass();
        throw null;
    }

    public static C0039o w(Context context, AttributeSet attributeSet, int i2, int i3) {
        C0039o c0039o = new C0039o(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M.a.f412a, i2, i3);
        c0039o.f537b = typedArrayObtainStyledAttributes.getInt(0, 1);
        c0039o.f538c = typedArrayObtainStyledAttributes.getInt(9, 1);
        c0039o.f539d = typedArrayObtainStyledAttributes.getBoolean(8, false);
        c0039o.f540e = typedArrayObtainStyledAttributes.getBoolean(10, false);
        typedArrayObtainStyledAttributes.recycle();
        return c0039o;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f553b;
        D d2 = recyclerView.f1669e;
        G g2 = recyclerView.f1667b0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f553b.canScrollVertically(-1) && !this.f553b.canScrollHorizontally(-1) && !this.f553b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        this.f553b.getClass();
    }

    public abstract void B(Parcelable parcelable);

    public abstract Parcelable C();

    public final void E() {
        int iP = p() - 1;
        if (iP < 0) {
            return;
        }
        RecyclerView.j(o(iP));
        throw null;
    }

    public final void F(D d2) {
        int size = ((ArrayList) d2.f425c).size();
        int i2 = size - 1;
        ArrayList arrayList = (ArrayList) d2.f425c;
        if (i2 >= 0) {
            arrayList.get(i2).getClass();
            throw new ClassCastException();
        }
        arrayList.clear();
        if (size > 0) {
            this.f553b.invalidate();
        }
    }

    public final boolean G(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int iS = s();
        int iU = u();
        int iT = this.f557f - t();
        int iR = this.f558g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i2 = left - iS;
        int iMin = Math.min(0, i2);
        int i3 = top - iU;
        int iMin2 = Math.min(0, i3);
        int i4 = iWidth - iT;
        int iMax = Math.max(0, i4);
        int iMax2 = Math.max(0, iHeight - iR);
        RecyclerView recyclerView2 = this.f553b;
        Field field = p042y.x.f3474a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i2, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i4);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i3, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i5 = iArr[0];
        int i6 = iArr[1];
        if (z3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iS2 = s();
            int iU2 = u();
            int iT2 = this.f557f - t();
            int iR2 = this.f558g - r();
            Rect rect2 = this.f553b.f1681k;
            int[] iArr2 = RecyclerView.f1639l0;
            y yVar = (y) focusedChild.getLayoutParams();
            Rect rect3 = yVar.f559a;
            rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) yVar).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) yVar).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) yVar).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) yVar).bottomMargin);
            if (rect2.left - i5 >= iT2 || rect2.right - i5 <= iS2 || rect2.top - i6 >= iR2 || rect2.bottom - i6 <= iU2) {
                return false;
            }
        }
        if (i5 == 0 && i6 == 0) {
            return false;
        }
        if (z2) {
            recyclerView.scrollBy(i5, i6);
            return true;
        }
        recyclerView.r(i5, i6);
        return true;
    }

    public final void H() {
        RecyclerView recyclerView = this.f553b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f553b = null;
            this.f552a = null;
            this.f557f = 0;
            this.f558g = 0;
            return;
        }
        this.f553b = recyclerView;
        this.f552a = recyclerView.f1675h;
        this.f557f = recyclerView.getWidth();
        this.f558g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(y yVar) {
        return yVar != null;
    }

    public abstract int f(G g2);

    public abstract void g(G g2);

    public abstract int h(G g2);

    public abstract int i(G g2);

    public abstract void j(G g2);

    public abstract int k(G g2);

    public abstract y l();

    public y m(Context context, AttributeSet attributeSet) {
        return new y(context, attributeSet);
    }

    public y n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof y) {
            return new y((y) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new y((ViewGroup.MarginLayoutParams) layoutParams) : new y(layoutParams);
    }

    public final View o(int i2) {
        C0026b c0026b = this.f552a;
        if (c0026b == null) {
            return null;
        }
        int i3 = -1;
        if (i2 >= 0) {
            int childCount = ((RecyclerView) ((D.j) c0026b.f477g).f44f).getChildCount();
            int i4 = i2;
            while (i4 < childCount) {
                C0027c c0027c = (C0027c) c0026b.f478h;
                int iA = i2 - (i4 - c0027c.a(i4));
                if (iA == 0) {
                    i3 = i4;
                    while (c0027c.b(i3)) {
                        i3++;
                    }
                    break;
                }
                i4 += iA;
            }
        }
        return ((RecyclerView) ((D.j) c0026b.f477g).f44f).getChildAt(i3);
    }

    public final int p() {
        C0026b c0026b = this.f552a;
        if (c0026b != null) {
            return ((RecyclerView) ((D.j) c0026b.f477g).f44f).getChildCount() - ((ArrayList) c0026b.f476f).size();
        }
        return 0;
    }

    public int q(D d2, G g2) {
        RecyclerView recyclerView = this.f553b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f553b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f553b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f553b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f553b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(D d2, G g2) {
        RecyclerView recyclerView = this.f553b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public abstract boolean y();

    public abstract void z(RecyclerView recyclerView);

    public void D(int i2) {
    }
}
