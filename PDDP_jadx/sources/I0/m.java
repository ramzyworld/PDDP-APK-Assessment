package I0;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends c implements N0.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f335k;

    public m(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, true);
        this.f335k = false;
    }

    public final N0.a d() {
        if (this.f335k) {
            return this;
        }
        N0.a aVar = this.f320e;
        if (aVar != null) {
            return aVar;
        }
        N0.a aVarA = a();
        this.f320e = aVarA;
        return aVarA;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return b().equals(mVar.b()) && this.f323h.equals(mVar.f323h) && this.f324i.equals(mVar.f324i) && this.f321f.equals(mVar.f321f);
        }
        if (obj instanceof N0.c) {
            return obj.equals(d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f324i.hashCode() + ((this.f323h.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        N0.a aVarD = d();
        if (aVarD != this) {
            return aVarD.toString();
        }
        return "property " + this.f323h + " (Kotlin reflection is not available)";
    }
}
