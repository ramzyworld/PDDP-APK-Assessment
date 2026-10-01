package N;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import p042y.C0169b;

/* JADX INFO: loaded from: classes.dex */
public final class K extends C0169b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f443d;

    public K(RecyclerView recyclerView) {
        this.f443d = recyclerView;
        new J(this);
    }

    @Override // p042y.C0169b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || this.f443d.l()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().A(accessibilityEvent);
        }
    }

    @Override // p042y.C0169b
    public final void b(View view, p044z.j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f3450a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f3496a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f443d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return;
        }
        x layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f553b;
        D d2 = recyclerView2.f1669e;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f553b.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f553b.canScrollVertically(1) || layoutManager.f553b.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        G g2 = recyclerView2.f1667b0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(d2, g2), layoutManager.q(d2, g2), false, 0));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[PHI: r0
      0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p042y.C0169b
    public final boolean c(View view, int i2, Bundle bundle) {
        int iU;
        int iS;
        if (super.c(view, i2, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f443d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        x layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f553b;
        D d2 = recyclerView2.f1669e;
        if (i2 == 4096) {
            iU = recyclerView2.canScrollVertically(1) ? (layoutManager.f558g - layoutManager.u()) - layoutManager.r() : 0;
            if (layoutManager.f553b.canScrollHorizontally(1)) {
                iS = (layoutManager.f557f - layoutManager.s()) - layoutManager.t();
            } else {
                iS = 0;
            }
        } else if (i2 != 8192) {
            iS = 0;
            iU = 0;
        } else {
            iU = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f558g - layoutManager.u()) - layoutManager.r()) : 0;
            if (layoutManager.f553b.canScrollHorizontally(-1)) {
                iS = -((layoutManager.f557f - layoutManager.s()) - layoutManager.t());
            } else {
                iS = 0;
            }
        }
        if (iU == 0 && iS == 0) {
            return false;
        }
        layoutManager.f553b.r(iS, iU);
        return true;
    }
}
