package U0;

import V0.AbstractC0068a;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D.j f928a = new D.j(14, "NULL");

    public static /* synthetic */ T0.d a(j jVar, R0.c cVar, int i2, int i3, int i4) {
        z0.i iVar = cVar;
        if ((i4 & 1) != 0) {
            iVar = z0.j.f3504e;
        }
        if ((i4 & 2) != 0) {
            i2 = -3;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return jVar.q(iVar, i2, i3);
    }

    public static final Object b(z0.i iVar, Object obj, Object obj2, H0.p pVar, z0.d dVar) {
        Object objM = AbstractC0068a.m(iVar, obj2);
        try {
            s sVar = new s(dVar, iVar);
            I0.s.a(2, pVar);
            Object objH = pVar.h(obj, sVar);
            AbstractC0068a.g(iVar, objM);
            if (objH == A0.a.f0e) {
                I0.i.e(dVar, "frame");
            }
            return objH;
        } catch (Throwable th) {
            AbstractC0068a.g(iVar, objM);
            throw th;
        }
    }
}
