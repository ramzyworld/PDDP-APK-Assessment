package J;

import I0.i;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f346a;

    public d(String str) {
        i.e(str, "name");
        this.f346a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return i.a(this.f346a, ((d) obj).f346a);
    }

    public final int hashCode() {
        return this.f346a.hashCode();
    }

    public final String toString() {
        return this.f346a;
    }
}
