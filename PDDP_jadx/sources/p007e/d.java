package p007e;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f1803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1805c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        int i2 = (int) ((f2 * this.f1805c) + 0.5f);
        int i3 = this.f1804b;
        int[] iArr = this.f1803a;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = iArr[i4];
            if (i2 < i5) {
                break;
            }
            i2 -= i5;
            i4++;
        }
        return (i4 / i3) + (i4 < i3 ? i2 / this.f1805c : 0.0f);
    }
}
