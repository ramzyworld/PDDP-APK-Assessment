package p041x0;

import I0.i;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f3411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3412f;

    public b(Object obj, Object obj2) {
        this.f3411e = obj;
        this.f3412f = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return i.a(this.f3411e, bVar.f3411e) && i.a(this.f3412f, bVar.f3412f);
    }

    public final int hashCode() {
        Object obj = this.f3411e;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f3412f;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f3411e + ", " + this.f3412f + ')';
    }
}
