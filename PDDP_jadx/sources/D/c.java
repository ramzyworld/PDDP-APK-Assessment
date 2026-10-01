package D;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f24a;

    static {
        f24a = Build.VERSION.SDK_INT >= 27;
    }
}
