package p015i0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2157c;

    public a(String str, String str2) {
        this.f2155a = str;
        this.f2156b = null;
        this.f2157c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2155a.equals(aVar.f2155a)) {
            return this.f2157c.equals(aVar.f2157c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2157c.hashCode() + (this.f2155a.hashCode() * 31);
    }

    public final String toString() {
        return "DartEntrypoint( bundle path: " + this.f2155a + ", function: " + this.f2157c + " )";
    }

    public a(String str, String str2, String str3) {
        this.f2155a = str;
        this.f2156b = str2;
        this.f2157c = str3;
    }
}
