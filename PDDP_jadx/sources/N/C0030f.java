package N;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: N.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0030f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f492a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0032h f493b;

    public C0030f(C0032h c0032h) {
        this.f493b = c0032h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f492a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f492a) {
            this.f492a = false;
            return;
        }
        C0032h c0032h = this.f493b;
        if (((Float) c0032h.f516u.getAnimatedValue()).floatValue() == 0.0f) {
            c0032h.f517v = 0;
            c0032h.e(0);
        } else {
            c0032h.f517v = 2;
            c0032h.f510n.invalidate();
        }
    }
}
