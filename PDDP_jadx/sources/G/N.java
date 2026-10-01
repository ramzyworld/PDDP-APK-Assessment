package G;

import Q0.C0056n;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class N extends I0.j implements H0.p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final N f125f = new N(2);

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        Throwable cancellationException = (Throwable) obj2;
        I0.i.e(e0Var, "msg");
        if (cancellationException == null) {
            cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        e0Var.f196b.K(new C0056n(cancellationException, false));
        return p041x0.g.f3419a;
    }
}
