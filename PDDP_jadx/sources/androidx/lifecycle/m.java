package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f1590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f1591b;

    public final void a(l lVar, f fVar) {
        g gVarA = fVar.a();
        g gVar = this.f1590a;
        I0.i.e(gVar, "state1");
        if (gVarA.compareTo(gVar) < 0) {
            gVar = gVarA;
        }
        this.f1590a = gVar;
        this.f1591b.a(lVar, fVar);
        this.f1590a = gVarA;
    }
}
