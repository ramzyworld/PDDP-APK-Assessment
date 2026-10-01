package N;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: N.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0031g implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0032h f494a;

    public C0031g(C0032h c0032h) {
        this.f494a = c0032h;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0032h c0032h = this.f494a;
        c0032h.f498b.setAlpha(iFloatValue);
        c0032h.f499c.setAlpha(iFloatValue);
        c0032h.f510n.invalidate();
    }
}
