package p041x0;

import I0.i;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f3413e;

    public c(Throwable th) {
        i.e(th, "exception");
        this.f3413e = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (i.a(this.f3413e, ((c) obj).f3413e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3413e.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f3413e + ')';
    }
}
