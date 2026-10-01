package p016j;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import p014i.a;

/* JADX INFO: loaded from: classes.dex */
public final class C implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f2537f;

    public /* synthetic */ C(a aVar, int i2) {
        this.f2536e = i2;
        this.f2537f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2536e) {
            case 0:
                ViewParent parent = this.f2537f.f2026d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                a aVar = this.f2537f;
                aVar.a();
                View view = aVar.f2026d;
                if (view.isEnabled() && !view.isLongClickable() && aVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    aVar.f2029g = true;
                    break;
                }
                break;
        }
    }
}
