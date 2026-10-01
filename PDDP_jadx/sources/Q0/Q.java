package Q0;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends CancellationException {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Z f690e;

    public Q(String str, Throwable th, Z z2) {
        super(str);
        this.f690e = z2;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Q) {
                Q q2 = (Q) obj;
                if (!I0.i.a(q2.getMessage(), getMessage()) || !I0.i.a(q2.f690e, this.f690e) || !I0.i.a(q2.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        I0.i.b(message);
        int iHashCode = (this.f690e.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f690e;
    }
}
