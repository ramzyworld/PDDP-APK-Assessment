package Q0;

/* JADX INFO: loaded from: classes.dex */
public final class E implements L {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f675e;

    public E(boolean z2) {
        this.f675e = z2;
    }

    @Override // Q0.L
    public final boolean b() {
        return this.f675e;
    }

    @Override // Q0.L
    public final a0 e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f675e ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
