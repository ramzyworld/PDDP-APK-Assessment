package io.flutter.view;

import N.C0026b;
import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: loaded from: classes.dex */
public final class c implements AccessibilityManager.AccessibilityStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f2395a;

    public c(k kVar) {
        this.f2395a = kVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z2) {
        k kVar = this.f2395a;
        if (kVar.f2499u) {
            return;
        }
        boolean z3 = false;
        C0026b c0026b = kVar.f2481b;
        if (z2) {
            b bVar = kVar.f2500v;
            c0026b.f478h = bVar;
            ((FlutterJNI) c0026b.f476f).setAccessibilityDelegate(bVar);
            ((FlutterJNI) c0026b.f476f).setSemanticsEnabled(true);
        } else {
            kVar.i(false);
            c0026b.f478h = null;
            ((FlutterJNI) c0026b.f476f).setAccessibilityDelegate(null);
            ((FlutterJNI) c0026b.f476f).setSemanticsEnabled(false);
        }
        D.j jVar = kVar.f2498s;
        if (jVar != null) {
            boolean zIsTouchExplorationEnabled = kVar.f2482c.isTouchExplorationEnabled();
            p011g0.q qVar = (p011g0.q) jVar.f44f;
            if (qVar.f1901l.f1979b.f2233a.getIsSoftwareRenderingEnabled()) {
                qVar.setWillNotDraw(false);
                return;
            }
            if (!z2 && !zIsTouchExplorationEnabled) {
                z3 = true;
            }
            qVar.setWillNotDraw(z3);
        }
    }
}
