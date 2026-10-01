package N;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class I implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OverScroller f437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Interpolator f438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f440j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f441k;

    public I(RecyclerView recyclerView) {
        this.f441k = recyclerView;
        r rVar = RecyclerView.f1642p0;
        this.f438h = rVar;
        this.f439i = false;
        this.f440j = false;
        this.f437g = new OverScroller(recyclerView.getContext(), rVar);
    }

    public final void a() {
        if (this.f439i) {
            this.f440j = true;
            return;
        }
        RecyclerView recyclerView = this.f441k;
        recyclerView.removeCallbacks(this);
        Field field = p042y.x.f3474a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f441k;
        if (recyclerView.f1684m == null) {
            recyclerView.removeCallbacks(this);
            this.f437g.abortAnimation();
            return;
        }
        this.f440j = false;
        this.f439i = true;
        recyclerView.d();
        OverScroller overScroller = this.f437g;
        recyclerView.f1684m.getClass();
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i2 = currX - this.f435e;
            int i3 = currY - this.f436f;
            this.f435e = currX;
            this.f436f = currY;
            RecyclerView recyclerView2 = this.f441k;
            int[] iArr = recyclerView.f1676h0;
            if (recyclerView2.f(i2, i3, iArr, null, 1)) {
                i2 -= iArr[0];
                i3 -= iArr[1];
            }
            if (!recyclerView.f1685n.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(i2, i3);
            }
            recyclerView.g(null, 1);
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z2 = (i2 == 0 && i3 == 0) || (i2 != 0 && recyclerView.f1684m.b() && i2 == 0) || (i3 != 0 && recyclerView.f1684m.c() && i3 == 0);
            if (overScroller.isFinished() || !(z2 || recyclerView.k())) {
                recyclerView.setScrollState(0);
                if (RecyclerView.f1641n0) {
                    C0034j c0034j = recyclerView.f1666a0;
                    c0034j.getClass();
                    c0034j.f521c = 0;
                }
                recyclerView.s(1);
            } else {
                a();
                RunnableC0036l runnableC0036l = recyclerView.f1665W;
                if (runnableC0036l != null) {
                    runnableC0036l.a(recyclerView, i2, i3);
                }
            }
        }
        this.f439i = false;
        if (this.f440j) {
            a();
        }
    }
}
