package Q0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Q0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0049g extends C0056n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f719c = AtomicIntegerFieldUpdater.newUpdater(C0049g.class, "_resumed");
    private volatile int _resumed;

    public C0049g(C0048f c0048f, Throwable th, boolean z2) {
        if (th == null) {
            th = new CancellationException("Continuation " + c0048f + " was cancelled normally");
        }
        super(th, z2);
        this._resumed = 0;
    }
}
