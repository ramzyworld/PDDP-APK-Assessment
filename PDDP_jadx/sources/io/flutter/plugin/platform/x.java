package io.flutter.plugin.platform;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2382f;

    public /* synthetic */ x(int i2, Object obj) {
        this.f2381e = i2;
        this.f2382f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2381e) {
            case 0:
                p003b0.h hVar = (p003b0.h) this.f2382f;
                ((View) hVar.f1723b).postDelayed((m) hVar.f1724c, 128L);
                break;
            default:
                y yVar = (y) this.f2382f;
                yVar.f2383a.getViewTreeObserver().removeOnDrawListener(yVar);
                break;
        }
    }
}
