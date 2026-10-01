package Y;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V.b f1078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f1079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f1080c;

    public c(V.b bVar, b bVar2, b bVar3) {
        this.f1078a = bVar;
        this.f1079b = bVar2;
        this.f1080c = bVar3;
        if (bVar.b() == 0 && bVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (bVar.f945a != 0 && bVar.f946b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        I0.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return I0.i.a(this.f1078a, cVar.f1078a) && I0.i.a(this.f1079b, cVar.f1079b) && I0.i.a(this.f1080c, cVar.f1080c);
    }

    public final int hashCode() {
        return this.f1080c.hashCode() + ((this.f1079b.hashCode() + (this.f1078a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f1078a + ", type=" + this.f1079b + ", state=" + this.f1080c + " }";
    }
}
