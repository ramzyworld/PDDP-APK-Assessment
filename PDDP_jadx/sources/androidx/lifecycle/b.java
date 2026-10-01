package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.b f1580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f1581b;

    public b(io.flutter.embedding.engine.renderer.b bVar, b bVar2) {
        this.f1580a = bVar;
        this.f1581b = bVar2;
    }

    public final void a(l lVar, f fVar) {
        int i2 = a.f1579a[fVar.ordinal()];
        io.flutter.embedding.engine.renderer.b bVar = this.f1580a;
        if (i2 == 3) {
            bVar.a();
        } else if (i2 == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        b bVar2 = this.f1581b;
        if (bVar2 != null) {
            bVar2.a(lVar, fVar);
        }
    }
}
