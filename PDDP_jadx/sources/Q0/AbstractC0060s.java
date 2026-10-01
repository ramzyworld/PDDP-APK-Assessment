package Q0;

/* JADX INFO: renamed from: Q0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0060s extends z0.a implements z0.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f741f = new r(z0.e.f3503e, C0059q.f738f);

    public AbstractC0060s() {
        super(z0.e.f3503e);
    }

    public abstract void e(z0.i iVar, Runnable runnable);

    /* JADX WARN: Type inference failed for: r4v2, types: [H0.l, I0.j] */
    @Override // z0.a, z0.i
    public final z0.g f(z0.h hVar) {
        I0.i.e(hVar, "key");
        if (!(hVar instanceof r)) {
            if (z0.e.f3503e == hVar) {
                return this;
            }
            return null;
        }
        r rVar = (r) hVar;
        z0.h hVar2 = this.f3497e;
        if (hVar2 != rVar && rVar.f740f != hVar2) {
            return null;
        }
        z0.g gVar = (z0.g) rVar.f739e.j(this);
        if (gVar instanceof z0.g) {
            return gVar;
        }
        return null;
    }

    public boolean g() {
        return !(this instanceof i0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [H0.l, I0.j] */
    @Override // z0.a, z0.i
    public final z0.i h(z0.h hVar) {
        I0.i.e(hVar, "key");
        boolean z2 = hVar instanceof r;
        z0.j jVar = z0.j.f3504e;
        if (z2) {
            r rVar = (r) hVar;
            z0.h hVar2 = this.f3497e;
            if ((hVar2 == rVar || rVar.f740f == hVar2) && ((z0.g) rVar.f739e.j(this)) != null) {
                return jVar;
            }
        } else if (z0.e.f3503e == hVar) {
            return jVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0063v.b(this);
    }
}
