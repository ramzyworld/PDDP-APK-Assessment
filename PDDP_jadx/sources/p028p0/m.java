package p028p0;

import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f2952c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f2954b;

    public m(DisplayMetrics displayMetrics) {
        int i2 = f2952c;
        f2952c = i2 + 1;
        this.f2953a = i2;
        this.f2954b = displayMetrics;
    }
}
