package p041x0;

import I0.i;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f3414e;

    public /* synthetic */ d(Object obj) {
        this.f3414e = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof c) {
            return ((c) obj).f3413e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f3414e, ((d) obj).f3414e);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f3414e;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f3414e;
        if (obj instanceof c) {
            return ((c) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
