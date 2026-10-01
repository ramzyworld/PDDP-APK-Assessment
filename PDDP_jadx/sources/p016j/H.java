package p016j;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class H implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f2559a;

    public H(J j2) {
        this.f2559a = j2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        if (i2 == 1) {
            J j2 = this.f2559a;
            if (j2.f2584z.getInputMethodMode() == 2 || j2.f2584z.getContentView() == null) {
                return;
            }
            Handler handler = j2.f2580v;
            G g2 = j2.f2577r;
            handler.removeCallbacks(g2);
            g2.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }
}
