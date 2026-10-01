package p038v;

import V0.i;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f3232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f3233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Handler f3234g;

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.f3232e.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f3234g.post(new i(this.f3233f, objCall, 4, false));
    }
}
