package U0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c[] f908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f910g;

    public final void b(T0.s sVar) {
        synchronized (this) {
            try {
                int i2 = this.f909f - 1;
                this.f909f = i2;
                if (i2 == 0) {
                    this.f910g = 0;
                }
                I0.i.c(sVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                T0.s.f904a.set(sVar, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
