package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0088u implements Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0090w f1575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AbstractC0090w f1576f;

    public AbstractC0088u(AbstractC0090w abstractC0090w) {
        this.f1575e = abstractC0090w;
        if (abstractC0090w.i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f1576f = abstractC0090w.k();
    }

    public final AbstractC0090w a() {
        AbstractC0090w abstractC0090wB = b();
        abstractC0090wB.getClass();
        if (AbstractC0090w.h(abstractC0090wB, true)) {
            return abstractC0090wB;
        }
        throw new c0();
    }

    public final AbstractC0090w b() {
        if (!this.f1576f.i()) {
            return this.f1576f;
        }
        AbstractC0090w abstractC0090w = this.f1576f;
        abstractC0090w.getClass();
        T t = T.f1459c;
        t.getClass();
        t.a(abstractC0090w.getClass()).h(abstractC0090w);
        abstractC0090w.j();
        return this.f1576f;
    }

    public final void c() {
        if (this.f1576f.i()) {
            return;
        }
        AbstractC0090w abstractC0090wK = this.f1575e.k();
        AbstractC0090w abstractC0090w = this.f1576f;
        T t = T.f1459c;
        t.getClass();
        t.a(abstractC0090wK.getClass()).c(abstractC0090wK, abstractC0090w);
        this.f1576f = abstractC0090wK;
    }

    public final Object clone() {
        AbstractC0088u abstractC0088u = (AbstractC0088u) this.f1575e.e(5);
        abstractC0088u.f1576f = b();
        return abstractC0088u;
    }
}
