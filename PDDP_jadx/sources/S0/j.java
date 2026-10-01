package S0;

import Q0.AbstractC0063v;
import Q0.l0;
import V0.AbstractC0068a;
import V0.v;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class j extends v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReferenceArray f813j;

    public j(long j2, j jVar, b bVar, int i2) {
        super(j2, jVar, i2);
        this.f812i = bVar;
        this.f813j = new AtomicReferenceArray(d.f789b * 2);
    }

    @Override // V0.v
    public final int f() {
        return d.f789b;
    }

    @Override // V0.v
    public final void g(int i2, z0.i iVar) {
        b bVar;
        O.c cVarA;
        O.c cVarA2;
        int i3 = d.f789b;
        boolean z2 = i2 >= i3;
        if (z2) {
            i2 -= i3;
        }
        Object obj = this.f813j.get(i2 * 2);
        while (true) {
            Object objK = k(i2);
            boolean z3 = objK instanceof l0;
            bVar = this.f812i;
            if (z3 || (objK instanceof s)) {
                if (j(i2, objK, z2 ? d.f797j : d.f798k)) {
                    m(i2, null);
                    l(i2, !z2);
                    if (z2) {
                        I0.i.b(bVar);
                        H0.l lVar = bVar.f786f;
                        if (lVar == null || (cVarA = AbstractC0068a.a(lVar, obj, null)) == null) {
                            return;
                        }
                        AbstractC0063v.d(cVarA, iVar);
                        return;
                    }
                    return;
                }
            } else {
                if (objK == d.f797j || objK == d.f798k) {
                    break;
                }
                if (objK != d.f794g && objK != d.f793f) {
                    if (objK == d.f796i || objK == d.f791d || objK == d.f799l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objK).toString());
                }
            }
        }
        m(i2, null);
        if (z2) {
            I0.i.b(bVar);
            H0.l lVar2 = bVar.f786f;
            if (lVar2 == null || (cVarA2 = AbstractC0068a.a(lVar2, obj, null)) == null) {
                return;
            }
            AbstractC0063v.d(cVarA2, iVar);
        }
    }

    public final boolean j(int i2, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f813j;
        int i3 = (i2 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
            if (atomicReferenceArray.get(i3) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i2) {
        return this.f813j.get((i2 * 2) + 1);
    }

    public final void l(int i2, boolean z2) {
        if (z2) {
            b bVar = this.f812i;
            I0.i.b(bVar);
            bVar.C((this.f1014g * ((long) d.f789b)) + ((long) i2));
        }
        h();
    }

    public final void m(int i2, Object obj) {
        this.f813j.lazySet(i2 * 2, obj);
    }

    public final void n(int i2, D.j jVar) {
        this.f813j.set((i2 * 2) + 1, jVar);
    }
}
