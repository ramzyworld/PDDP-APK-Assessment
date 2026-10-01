package io.flutter.plugin.platform;

import android.view.MotionEvent;
import p011g0.C0102i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends C0102i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0103a f2311k;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0103a c0103a = this.f2311k;
        if (c0103a != null) {
            io.flutter.view.k kVar = c0103a.f2309a;
            if (kVar == null ? false : kVar.e(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
