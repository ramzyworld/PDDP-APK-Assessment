package I0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends c implements f, N0.a, p041x0.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f330k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f331l;

    public g(int i2, Class cls, String str, String str2, int i3) {
        this(i2, b.f319e, cls, str, str2, i3);
    }

    @Override // I0.c
    public final N0.a a() {
        q.f339a.getClass();
        return this;
    }

    @Override // I0.f
    public final int c() {
        return this.f330k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f323h.equals(gVar.f323h) && this.f324i.equals(gVar.f324i) && this.f331l == gVar.f331l && this.f330k == gVar.f330k && this.f321f.equals(gVar.f321f) && b().equals(gVar.b());
        }
        if (!(obj instanceof g)) {
            return false;
        }
        N0.a aVar = this.f320e;
        if (aVar == null) {
            a();
            this.f320e = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    public final int hashCode() {
        b();
        return this.f324i.hashCode() + ((this.f323h.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        N0.a aVar = this.f320e;
        if (aVar == null) {
            a();
            this.f320e = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f323h;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public g(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f330k = i2;
        this.f331l = 0;
    }
}
