package Q0;

/* JADX INFO: renamed from: Q0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0057o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H0.l f734b;

    public C0057o(Object obj, H0.l lVar) {
        this.f733a = obj;
        this.f734b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0057o)) {
            return false;
        }
        C0057o c0057o = (C0057o) obj;
        return I0.i.a(this.f733a, c0057o.f733a) && I0.i.a(this.f734b, c0057o.f734b);
    }

    public final int hashCode() {
        Object obj = this.f733a;
        return this.f734b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f733a + ", onCancellation=" + this.f734b + ')';
    }
}
