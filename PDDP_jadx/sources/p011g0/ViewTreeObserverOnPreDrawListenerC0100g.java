package p011g0;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: g0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0100g implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f1860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0101h f1861f;

    public ViewTreeObserverOnPreDrawListenerC0100g(C0101h c0101h, q qVar) {
        this.f1861f = c0101h;
        this.f1860e = qVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0101h c0101h = this.f1861f;
        if (c0101h.f1868g && c0101h.f1866e != null) {
            this.f1860e.getViewTreeObserver().removeOnPreDrawListener(this);
            c0101h.f1866e = null;
        }
        return c0101h.f1868g;
    }
}
