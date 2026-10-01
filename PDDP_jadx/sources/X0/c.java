package X0;

import Q0.AbstractC0060s;
import Q0.I;
import V0.AbstractC0068a;
import V0.x;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c extends I implements Executor {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f1045g = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC0060s f1046h;

    static {
        AbstractC0060s jVar;
        l lVar = l.f1062g;
        int i2 = x.f1016a;
        if (64 >= i2) {
            i2 = 64;
        }
        int iK = AbstractC0068a.k("kotlinx.coroutines.io.parallelism", i2, 0, 0, 12);
        lVar.getClass();
        if (iK < 1) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but got " + iK).toString());
        }
        if (iK < k.f1057d) {
            if (iK < 1) {
                throw new IllegalArgumentException(("Expected positive parallelism level, but got " + iK).toString());
            }
            jVar = new V0.j(lVar, iK);
        }
        jVar = lVar;
        f1046h = jVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // Q0.AbstractC0060s
    public final void e(z0.i iVar, Runnable runnable) {
        f1046h.e(iVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(z0.j.f3504e, runnable);
    }

    @Override // Q0.AbstractC0060s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
