package N;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p042y.C0169b;

/* JADX INFO: loaded from: classes.dex */
public final class J extends C0169b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K f442d;

    public J(K k2) {
        this.f442d = k2;
    }

    @Override // p042y.C0169b
    public final void b(View view, p044z.j jVar) {
        this.f3450a.onInitializeAccessibilityNodeInfo(view, jVar.f3496a);
        K k2 = this.f442d;
        if (k2.f443d.l()) {
            return;
        }
        RecyclerView recyclerView = k2.f443d;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().getClass();
            RecyclerView.j(view);
        }
    }

    @Override // p042y.C0169b
    public final boolean c(View view, int i2, Bundle bundle) {
        if (super.c(view, i2, bundle)) {
            return true;
        }
        K k2 = this.f442d;
        if (!k2.f443d.l()) {
            RecyclerView recyclerView = k2.f443d;
            if (recyclerView.getLayoutManager() != null) {
                D d2 = recyclerView.getLayoutManager().f553b.f1669e;
            }
        }
        return false;
    }
}
