package p042y;

import android.view.WindowInsets;
import p031r.c;

/* JADX INFO: loaded from: classes.dex */
public class J extends I {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f3440k;

    public J(O o2, WindowInsets windowInsets) {
        super(o2, windowInsets);
        this.f3440k = null;
    }

    @Override // p042y.N
    public O b() {
        return O.a(this.f3437c.consumeStableInsets(), null);
    }

    @Override // p042y.N
    public O c() {
        return O.a(this.f3437c.consumeSystemWindowInsets(), null);
    }

    @Override // p042y.N
    public final c f() {
        if (this.f3440k == null) {
            WindowInsets windowInsets = this.f3437c;
            this.f3440k = c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f3440k;
    }

    @Override // p042y.N
    public boolean h() {
        return this.f3437c.isConsumed();
    }

    @Override // p042y.N
    public void l(c cVar) {
        this.f3440k = cVar;
    }
}
