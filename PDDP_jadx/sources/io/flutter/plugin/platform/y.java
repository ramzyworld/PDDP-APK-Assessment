package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class y implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f2383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f2384b;

    public y(View view, x xVar) {
        this.f2383a = view;
        this.f2384b = xVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        x xVar = this.f2384b;
        if (xVar == null) {
            return;
        }
        xVar.run();
        this.f2384b = null;
        this.f2383a.post(new x(1, this));
    }
}
