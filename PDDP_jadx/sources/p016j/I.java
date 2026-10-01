package p016j;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class I implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f2560a;

    public I(J j2) {
        this.f2560a = j2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r rVar;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        J j2 = this.f2560a;
        if (action == 0 && (rVar = j2.f2584z) != null && rVar.isShowing() && x2 >= 0 && x2 < j2.f2584z.getWidth() && y2 >= 0 && y2 < j2.f2584z.getHeight()) {
            j2.f2580v.postDelayed(j2.f2577r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        j2.f2580v.removeCallbacks(j2.f2577r);
        return false;
    }
}
