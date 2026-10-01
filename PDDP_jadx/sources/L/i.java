package L;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f400f;

    public /* synthetic */ i(Context context, int i2) {
        this.f399e = i2;
        this.f400f = context;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f399e) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new i(this.f400f, 1));
                break;
            default:
                g.s(this.f400f, new e(), g.f386a, false);
                break;
        }
    }
}
