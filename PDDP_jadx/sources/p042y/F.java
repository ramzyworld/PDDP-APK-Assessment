package p042y;

import android.view.WindowInsets;
import androidx.lifecycle.u;
import p031r.c;

/* JADX INFO: loaded from: classes.dex */
public class F extends H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f3431a = u.h();

    @Override // p042y.H
    public O b() {
        a();
        O oA = O.a(this.f3431a.build(), null);
        oA.f3444a.j(null);
        return oA;
    }

    @Override // p042y.H
    public void c(c cVar) {
        this.f3431a.setStableInsets(cVar.b());
    }

    @Override // p042y.H
    public void d(c cVar) {
        this.f3431a.setSystemWindowInsets(cVar.b());
    }
}
