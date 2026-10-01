package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import p039v0.H;

/* JADX INFO: loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2321e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View.OnFocusChangeListener f2322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f2323g;

    public i(View.OnFocusChangeListener onFocusChangeListener, p021l0.a aVar) {
        this.f2322f = onFocusChangeListener;
        this.f2323g = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.f2321e) {
            case 0:
                H h2 = new H(21);
                j jVar = (j) this.f2323g;
                this.f2322f.onFocusChange(jVar, p000a.a.P(jVar, h2));
                break;
            default:
                p021l0.a aVar = (p021l0.a) this.f2323g;
                this.f2322f.onFocusChange(aVar, p000a.a.P(aVar, new H(21)));
                break;
        }
    }

    public i(j jVar, View.OnFocusChangeListener onFocusChangeListener) {
        this.f2323g = jVar;
        this.f2322f = onFocusChangeListener;
    }
}
