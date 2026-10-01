package V0;

import Q0.AbstractC0060s;
import Q0.AbstractC0063v;
import Q0.C0056n;
import Q0.C0057o;
import Q0.H;
import Q0.h0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Q0.A implements B0.c, z0.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f982l = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC0060s f983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final B0.b f984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f985j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f986k;

    public h(AbstractC0060s abstractC0060s, B0.b bVar) {
        super(-1);
        this.f983h = abstractC0060s;
        this.f984i = bVar;
        this.f985j = AbstractC0068a.f971c;
        this.f986k = AbstractC0068a.l(bVar.i());
    }

    @Override // Q0.A
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0057o) {
            ((C0057o) obj).f734b.j(cancellationException);
        }
    }

    @Override // B0.c
    public final B0.c g() {
        B0.b bVar = this.f984i;
        if (bVar instanceof B0.c) {
            return bVar;
        }
        return null;
    }

    @Override // z0.d
    public final z0.i i() {
        return this.f984i.i();
    }

    @Override // Q0.A
    public final Object j() {
        Object obj = this.f985j;
        this.f985j = AbstractC0068a.f971c;
        return obj;
    }

    @Override // z0.d
    public final void m(Object obj) {
        B0.b bVar = this.f984i;
        z0.i iVarI = bVar.i();
        Throwable thA = p041x0.d.a(obj);
        Object c0056n = thA == null ? obj : new C0056n(thA, false);
        AbstractC0060s abstractC0060s = this.f983h;
        if (abstractC0060s.g()) {
            this.f985j = c0056n;
            this.f671g = 0;
            abstractC0060s.e(iVarI, this);
            return;
        }
        H hA = h0.a();
        if (hA.f680g >= 4294967296L) {
            this.f985j = c0056n;
            this.f671g = 0;
            p043y0.b bVar2 = hA.f682i;
            if (bVar2 == null) {
                bVar2 = new p043y0.b();
                hA.f682i = bVar2;
            }
            bVar2.addLast(this);
            return;
        }
        hA.k(true);
        try {
            z0.i iVarI2 = bVar.i();
            Object objM = AbstractC0068a.m(iVarI2, this.f986k);
            try {
                bVar.m(obj);
                AbstractC0068a.g(iVarI2, objM);
                while (hA.m()) {
                }
            } catch (Throwable th) {
                AbstractC0068a.g(iVarI2, objM);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                h(th2, null);
            } finally {
                hA.i(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f983h + ", " + AbstractC0063v.k(this.f984i) + ']';
    }

    @Override // Q0.A
    public final z0.d c() {
        return this;
    }
}
