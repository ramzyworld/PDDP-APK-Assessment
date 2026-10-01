package p024n;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f2867c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellationException f2868a;

    static {
        if (g.f2879d) {
            f2867c = null;
            f2866b = null;
        } else {
            f2867c = new a(false, null);
            f2866b = new a(true, null);
        }
    }

    public a(boolean z2, CancellationException cancellationException) {
        this.f2868a = cancellationException;
    }
}
