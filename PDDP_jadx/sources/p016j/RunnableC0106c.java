package p016j;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: j.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0106c implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2619f;

    public /* synthetic */ RunnableC0106c(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f2618e = i2;
        this.f2619f = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2618e) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2619f;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1221x = actionBarOverlayLayout.f1205g.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1222y);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2619f;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1221x = actionBarOverlayLayout2.f1205g.animate().translationY(-actionBarOverlayLayout2.f1205g.getHeight()).setListener(actionBarOverlayLayout2.f1222y);
                break;
        }
    }
}
