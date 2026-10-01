package p007e;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import p000a.a;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ObjectAnimator f1801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1802f;

    public c(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i2 = z2 ? numberOfFrames - 1 : 0;
        int i3 = z2 ? 0 : numberOfFrames - 1;
        d dVar = new d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        dVar.f1804b = numberOfFrames2;
        int[] iArr = dVar.f1803a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            dVar.f1803a = new int[numberOfFrames2];
        }
        int[] iArr2 = dVar.f1803a;
        int i4 = 0;
        for (int i5 = 0; i5 < numberOfFrames2; i5++) {
            int duration = animationDrawable.getDuration(z2 ? (numberOfFrames2 - i5) - 1 : i5);
            iArr2[i5] = duration;
            i4 += duration;
        }
        dVar.f1805c = i4;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i2, i3);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(dVar.f1805c);
        objectAnimatorOfInt.setInterpolator(dVar);
        this.f1802f = z3;
        this.f1801e = objectAnimatorOfInt;
    }

    @Override // p000a.a
    public final void D() {
        this.f1801e.reverse();
    }

    @Override // p000a.a
    public final void L() {
        this.f1801e.start();
    }

    @Override // p000a.a
    public final void N() {
        this.f1801e.cancel();
    }

    @Override // p000a.a
    public final boolean c() {
        return this.f1802f;
    }
}
