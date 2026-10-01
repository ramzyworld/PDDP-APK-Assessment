package S0;

import G.M;
import Q0.C0048f;
import Q0.C0061t;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f811a = new h();

    public static b a(int i2, int i3, int i4) {
        b mVar;
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if (i2 != -2) {
            if (i2 == -1) {
                if (i3 == 1) {
                    return new m(1, 2, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i2 != 0) {
                if (i2 != Integer.MAX_VALUE) {
                    return i3 == 1 ? new b(i2, null) : new m(i2, i3, null);
                }
                return new b(Integer.MAX_VALUE, null);
            }
            mVar = i3 == 1 ? new b(0, null) : new m(1, i3, null);
        } else if (i3 == 1) {
            f.f809b.getClass();
            mVar = new b(e.f808b, null);
        } else {
            mVar = new m(1, i3, null);
        }
        return mVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [H0.a, I.b] */
    /* JADX WARN: Type inference failed for: r5v1, types: [H0.a] */
    /* JADX WARN: Type inference failed for: r5v3, types: [H0.a] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public static final Object b(p pVar, I.b bVar, B0.b bVar2) {
        n nVar;
        if (bVar2 instanceof n) {
            nVar = (n) bVar2;
            int i2 = nVar.f817j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f817j = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(bVar2);
            }
        } else {
            nVar = new n(bVar2);
        }
        Object obj = nVar.f816i;
        A0.a aVar = A0.a.f0e;
        int i3 = nVar.f817j;
        try {
            if (i3 == 0) {
                p000a.a.O(obj);
                z0.i iVar = nVar.f4f;
                I0.i.b(iVar);
                if (iVar.f(C0061t.f743f) != pVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                nVar.f815h = bVar;
                nVar.f817j = 1;
                C0048f c0048f = new C0048f(1, p000a.a.x(nVar));
                c0048f.v();
                ((o) pVar).X(new M(2, c0048f));
                if (c0048f.u() == aVar) {
                    bVar = bVar;
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                H0.a aVar2 = nVar.f815h;
                p000a.a.O(obj);
                bVar = aVar2;
            }
            bVar = bVar;
            bVar.f();
            return p041x0.g.f3419a;
        } catch (Throwable th) {
            bVar.f();
            throw th;
        }
    }
}
