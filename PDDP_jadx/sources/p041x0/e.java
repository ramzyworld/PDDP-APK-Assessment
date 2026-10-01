package p041x0;

import H0.a;
import I0.i;
import I0.j;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f3415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f3416f = f.f3418a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3417g = this;

    /* JADX WARN: Multi-variable type inference failed */
    public e(a aVar) {
        this.f3415e = (j) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [H0.a, I0.j, java.lang.Object] */
    public final Object a() {
        Object objF;
        Object obj = this.f3416f;
        f fVar = f.f3418a;
        if (obj != fVar) {
            return obj;
        }
        synchronized (this.f3417g) {
            objF = this.f3416f;
            if (objF == fVar) {
                ?? r1 = this.f3415e;
                i.b(r1);
                objF = r1.f();
                this.f3416f = objF;
                this.f3415e = null;
            }
        }
        return objF;
    }

    public final String toString() {
        return this.f3416f != f.f3418a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
