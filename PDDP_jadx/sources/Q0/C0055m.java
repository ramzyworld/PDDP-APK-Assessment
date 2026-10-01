package Q0;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Q0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0055m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H0.l f728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f730e;

    public C0055m(Object obj, D d2, H0.l lVar, Object obj2, Throwable th) {
        this.f726a = obj;
        this.f727b = d2;
        this.f728c = lVar;
        this.f729d = obj2;
        this.f730e = th;
    }

    public static C0055m a(C0055m c0055m, D d2, CancellationException cancellationException, int i2) {
        Object obj = c0055m.f726a;
        if ((i2 & 2) != 0) {
            d2 = c0055m.f727b;
        }
        D d3 = d2;
        H0.l lVar = c0055m.f728c;
        Object obj2 = c0055m.f729d;
        Throwable th = cancellationException;
        if ((i2 & 16) != 0) {
            th = c0055m.f730e;
        }
        c0055m.getClass();
        return new C0055m(obj, d3, lVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0055m)) {
            return false;
        }
        C0055m c0055m = (C0055m) obj;
        return I0.i.a(this.f726a, c0055m.f726a) && I0.i.a(this.f727b, c0055m.f727b) && I0.i.a(this.f728c, c0055m.f728c) && I0.i.a(this.f729d, c0055m.f729d) && I0.i.a(this.f730e, c0055m.f730e);
    }

    public final int hashCode() {
        Object obj = this.f726a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        D d2 = this.f727b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        H0.l lVar = this.f728c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f729d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f730e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f726a + ", cancelHandler=" + this.f727b + ", onCancellation=" + this.f728c + ", idempotentResume=" + this.f729d + ", cancelCause=" + this.f730e + ')';
    }

    public /* synthetic */ C0055m(Object obj, D d2, H0.l lVar, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 2) != 0 ? null : d2, (i2 & 4) != 0 ? null : lVar, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
