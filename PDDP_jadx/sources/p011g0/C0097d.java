package p011g0;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p013h0.c;
import p028p0.a;

/* JADX INFO: renamed from: g0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0097d implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0098e f1852a;

    public C0097d(AbstractActivityC0098e abstractActivityC0098e) {
        this.f1852a = abstractActivityC0098e;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        AbstractActivityC0098e abstractActivityC0098e = this.f1852a;
        if (abstractActivityC0098e.k("cancelBackGesture")) {
            C0101h c0101h = abstractActivityC0098e.f1855f;
            c0101h.c();
            c cVar = c0101h.f1863b;
            if (cVar != null) {
                cVar.f1987j.f2894a.F("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        AbstractActivityC0098e abstractActivityC0098e = this.f1852a;
        if (abstractActivityC0098e.k("commitBackGesture")) {
            C0101h c0101h = abstractActivityC0098e.f1855f;
            c0101h.c();
            c cVar = c0101h.f1863b;
            if (cVar != null) {
                cVar.f1987j.f2894a.F("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC0098e abstractActivityC0098e = this.f1852a;
        if (abstractActivityC0098e.k("updateBackGestureProgress")) {
            C0101h c0101h = abstractActivityC0098e.f1855f;
            c0101h.c();
            c cVar = c0101h.f1863b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                return;
            }
            a aVar = cVar.f1987j;
            aVar.getClass();
            aVar.f2894a.F("updateBackGestureProgress", a.a(backEvent), null);
        }
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC0098e abstractActivityC0098e = this.f1852a;
        if (abstractActivityC0098e.k("startBackGesture")) {
            C0101h c0101h = abstractActivityC0098e.f1855f;
            c0101h.c();
            c cVar = c0101h.f1863b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                return;
            }
            a aVar = cVar.f1987j;
            aVar.getClass();
            aVar.f2894a.F("startBackGesture", a.a(backEvent), null);
        }
    }
}
