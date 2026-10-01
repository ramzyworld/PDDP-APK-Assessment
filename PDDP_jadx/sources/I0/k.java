package I0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f334a;

    public k(Class cls) {
        this.f334a = cls;
    }

    @Override // I0.d
    public final Class a() {
        return this.f334a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f334a, ((k) obj).f334a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f334a.hashCode();
    }

    public final String toString() {
        return this.f334a.toString() + " (Kotlin reflection is not available)";
    }
}
