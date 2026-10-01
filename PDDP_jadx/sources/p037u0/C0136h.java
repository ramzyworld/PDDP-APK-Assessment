package p037u0;

import I0.i;

/* JADX INFO: renamed from: u0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0136h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3137b;

    public C0136h(String str, boolean z2) {
        this.f3136a = str;
        this.f3137b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0136h)) {
            return false;
        }
        C0136h c0136h = (C0136h) obj;
        return i.a(this.f3136a, c0136h.f3136a) && this.f3137b == c0136h.f3137b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        String str = this.f3136a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z2 = this.f3137b;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f3136a + ", useDataStore=" + this.f3137b + ")";
    }
}
