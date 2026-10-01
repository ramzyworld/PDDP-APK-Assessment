package p042y;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import p031r.c;

/* JADX INFO: loaded from: classes.dex */
public class N {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3442b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f3443a;

    static {
        H f2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            f2 = new G();
        } else {
            f2 = i2 >= 29 ? new F() : new E();
        }
        f2.b().f3444a.a().f3444a.b().f3444a.c();
    }

    public N(O o2) {
        this.f3443a = o2;
    }

    public O a() {
        return this.f3443a;
    }

    public O b() {
        return this.f3443a;
    }

    public O c() {
        return this.f3443a;
    }

    public C0172e e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n2 = (N) obj;
        return i() == n2.i() && h() == n2.h() && Objects.equals(g(), n2.g()) && Objects.equals(f(), n2.f()) && Objects.equals(e(), n2.e());
    }

    public c f() {
        return c.f3035e;
    }

    public c g() {
        return c.f3035e;
    }

    public boolean h() {
        return false;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(i()), Boolean.valueOf(h()), g(), f(), e());
    }

    public boolean i() {
        return false;
    }

    public void d(View view) {
    }

    public void j(c[] cVarArr) {
    }

    public void k(O o2) {
    }

    public void l(c cVar) {
    }
}
