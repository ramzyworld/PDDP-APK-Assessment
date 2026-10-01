package z0;

import H0.p;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class j implements i, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f3504e = new j();

    @Override // z0.i
    public final i c(i iVar) {
        I0.i.e(iVar, "context");
        return iVar;
    }

    @Override // z0.i
    public final g f(h hVar) {
        I0.i.e(hVar, "key");
        return null;
    }

    @Override // z0.i
    public final i h(h hVar) {
        I0.i.e(hVar, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // z0.i
    public final Object d(Object obj, p pVar) {
        return obj;
    }
}
