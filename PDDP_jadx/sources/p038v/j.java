package p038v;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Thread {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3231e;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f3231e = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f3231e);
        super.run();
    }
}
