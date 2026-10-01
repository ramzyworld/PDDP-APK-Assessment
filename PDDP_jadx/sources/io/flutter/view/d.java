package io.flutter.view;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public final class d implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f2396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f2397b;

    public d(k kVar, AccessibilityManager accessibilityManager) {
        this.f2397b = kVar;
        this.f2396a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        k kVar = this.f2397b;
        if (kVar.f2499u) {
            return;
        }
        boolean z3 = false;
        if (!z2) {
            kVar.i(false);
            h hVar = kVar.f2494o;
            if (hVar != null) {
                kVar.g(hVar.f2452b, 256);
                kVar.f2494o = null;
            }
        }
        D.j jVar = kVar.f2498s;
        if (jVar != null) {
            boolean zIsEnabled = this.f2396a.isEnabled();
            p011g0.q qVar = (p011g0.q) jVar.f44f;
            if (qVar.f1901l.f1979b.f2233a.getIsSoftwareRenderingEnabled()) {
                qVar.setWillNotDraw(false);
                return;
            }
            if (!zIsEnabled && !z2) {
                z3 = true;
            }
            qVar.setWillNotDraw(z3);
        }
    }
}
