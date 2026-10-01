package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class O implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0090w f1454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f1455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0084p f1456c;

    public O(e0 e0Var, C0084p c0084p, AbstractC0090w abstractC0090w) {
        this.f1455b = e0Var;
        c0084p.getClass();
        this.f1456c = c0084p;
        this.f1454a = abstractC0090w;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean a(Object obj) {
        this.f1456c.getClass();
        I0.h.g(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void b(Object obj, C0079k c0079k, C0083o c0083o) {
        this.f1455b.getClass();
        e0.a(obj);
        this.f1456c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void c(Object obj, Object obj2) {
        X.A(this.f1455b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void d(Object obj, F f2) {
        this.f1456c.getClass();
        I0.h.g(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int e(AbstractC0090w abstractC0090w) {
        this.f1455b.getClass();
        return abstractC0090w.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int f(AbstractC0090w abstractC0090w) {
        this.f1455b.getClass();
        d0 d0Var = abstractC0090w.unknownFields;
        int i2 = d0Var.f1496d;
        if (i2 != -1) {
            return i2;
        }
        int iV = 0;
        for (int i3 = 0; i3 < d0Var.f1493a; i3++) {
            int i4 = d0Var.f1494b[i3] >>> 3;
            C0075g c0075g = (C0075g) d0Var.f1495c[i3];
            iV += C0081m.V(3, c0075g) + C0081m.l0(2, i4) + (C0081m.k0(1) * 2);
        }
        d0Var.f1496d = iV;
        return iV;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final AbstractC0090w g() {
        AbstractC0090w abstractC0090w = this.f1454a;
        return abstractC0090w instanceof AbstractC0090w ? abstractC0090w.k() : ((AbstractC0088u) abstractC0090w.e(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void h(Object obj) {
        this.f1455b.getClass();
        e0.b(obj);
        this.f1456c.getClass();
        I0.h.g(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean i(AbstractC0090w abstractC0090w, Object obj) {
        this.f1455b.getClass();
        return abstractC0090w.unknownFields.equals(((AbstractC0090w) obj).unknownFields);
    }
}
