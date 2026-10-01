package G;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y0.d f245a = Y0.e.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D.j f246b = new D.j(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D.j f247c = new D.j(new k0(2, null));

    public l0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f246b.f44f).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(H0.l lVar, B0.b bVar) throws Throwable {
        i0 i0Var;
        Y0.d dVar;
        Throwable th;
        Y0.a aVar;
        if (bVar instanceof i0) {
            i0Var = (i0) bVar;
            int i2 = i0Var.f223l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i0Var.f223l = i2 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, bVar);
            }
        } else {
            i0Var = new i0(this, bVar);
        }
        Object obj = i0Var.f221j;
        A0.a aVar2 = A0.a.f0e;
        int i3 = i0Var.f223l;
        try {
            if (i3 == 0) {
                p000a.a.O(obj);
                i0Var.f219h = lVar;
                dVar = this.f245a;
                i0Var.f220i = dVar;
                i0Var.f223l = 1;
                if (dVar.c(i0Var) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (Y0.a) i0Var.f219h;
                    try {
                        p000a.a.O(obj);
                        ((Y0.d) aVar).e(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        ((Y0.d) aVar).e(null);
                        throw th;
                    }
                }
                Y0.d dVar2 = i0Var.f220i;
                H0.l lVar2 = (H0.l) i0Var.f219h;
                p000a.a.O(obj);
                dVar = dVar2;
                lVar = lVar2;
            }
            i0Var.f219h = dVar;
            i0Var.f220i = null;
            i0Var.f223l = 2;
            Object objJ = lVar.j(i0Var);
            if (objJ == aVar2) {
                return aVar2;
            }
            Y0.d dVar3 = dVar;
            obj = objJ;
            aVar = dVar3;
            ((Y0.d) aVar).e(null);
            return obj;
        } catch (Throwable th3) {
            Y0.d dVar4 = dVar;
            th = th3;
            aVar = dVar4;
            ((Y0.d) aVar).e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(H0.p pVar, B0.b bVar) throws Throwable {
        j0 j0Var;
        Y0.d dVar;
        Throwable th;
        boolean z2;
        if (bVar instanceof j0) {
            j0Var = (j0) bVar;
            int i2 = j0Var.f232l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j0Var.f232l = i2 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(this, bVar);
            }
        } else {
            j0Var = new j0(this, bVar);
        }
        Object obj = j0Var.f230j;
        Object obj2 = A0.a.f0e;
        int i3 = j0Var.f232l;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = j0Var.f229i;
            dVar = j0Var.f228h;
            try {
                p000a.a.O(obj);
                if (z2) {
                    dVar.e(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z2) {
                    dVar.e(null);
                }
                throw th;
            }
        }
        p000a.a.O(obj);
        Y0.d dVar2 = this.f245a;
        boolean zD = dVar2.d(null);
        try {
            Object objValueOf = Boolean.valueOf(zD);
            j0Var.f228h = dVar2;
            j0Var.f229i = zD;
            j0Var.f232l = 1;
            Object objH = pVar.h(objValueOf, j0Var);
            if (objH == obj2) {
                return obj2;
            }
            dVar = dVar2;
            obj = objH;
            z2 = zD;
            if (z2) {
                dVar.e(null);
            }
            return obj;
        } catch (Throwable th3) {
            dVar = dVar2;
            th = th3;
            z2 = zD;
            if (z2) {
                dVar.e(null);
            }
            throw th;
        }
    }
}
