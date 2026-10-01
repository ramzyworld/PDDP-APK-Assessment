package U0;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient T0.e f907e;

    public a(T0.e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f907e = eVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
