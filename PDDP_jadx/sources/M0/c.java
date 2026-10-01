package M0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f420h = new c(1, 0, 1);

    @Override // M0.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f413e == cVar.f413e) {
                    if (this.f414f == cVar.f414f) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // M0.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f413e * 31) + this.f414f;
    }

    @Override // M0.a
    public final boolean isEmpty() {
        return this.f413e > this.f414f;
    }

    @Override // M0.a
    public final String toString() {
        return this.f413e + ".." + this.f414f;
    }
}
