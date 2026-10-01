package p037u0;

import I0.i;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f3123b;

    public N(String str, L l2) {
        this.f3122a = str;
        this.f3123b = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n2 = (N) obj;
        return i.a(this.f3122a, n2.f3122a) && this.f3123b == n2.f3123b;
    }

    public final int hashCode() {
        String str = this.f3122a;
        return this.f3123b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f3122a + ", type=" + this.f3123b + ")";
    }
}
