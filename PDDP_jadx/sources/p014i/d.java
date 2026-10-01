package p014i;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class d implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f2037b;

    public /* synthetic */ d(l lVar, int i2) {
        this.f2036a = i2;
        this.f2037b = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i2 = this.f2036a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f2036a) {
            case 0:
                g gVar = (g) this.f2037b;
                ViewTreeObserver viewTreeObserver = gVar.f2046B;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.f2046B = view.getViewTreeObserver();
                    }
                    gVar.f2046B.removeGlobalOnLayoutListener(gVar.f2056m);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                s sVar = (s) this.f2037b;
                ViewTreeObserver viewTreeObserver2 = sVar.f2148s;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sVar.f2148s = view.getViewTreeObserver();
                    }
                    sVar.f2148s.removeGlobalOnLayoutListener(sVar.f2142m);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
