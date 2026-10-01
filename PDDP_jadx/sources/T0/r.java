package T0;

import G.A;
import G.C0017s;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D.j f902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D.j f903b;

    static {
        int i2 = 14;
        f902a = new D.j(i2, "NONE");
        f903b = new D.j(i2, "PENDING");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(t tVar, C0017s c0017s, Throwable th, B0.b bVar) {
        g gVar;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i2 = gVar.f856j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.f856j = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        Object obj = gVar.f855i;
        Object obj2 = A0.a.f0e;
        int i3 = gVar.f856j;
        try {
            if (i3 == 0) {
                p000a.a.O(obj);
                gVar.f854h = th;
                gVar.f856j = 1;
                if (c0017s.p(tVar, th, gVar) == obj2) {
                    return obj2;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = gVar.f854h;
                p000a.a.O(obj);
            }
            return p041x0.g.f3419a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                a1.a.c(th2, th);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0080 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0086 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0097 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0094 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object b(T0.e r8, S0.o r9, boolean r10, B0.b r11) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.r.b(T0.e, S0.o, boolean, B0.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(d dVar, B0.b bVar) {
        o oVar;
        I0.p pVar;
        U0.a e2;
        A a2;
        if (bVar instanceof o) {
            oVar = (o) bVar;
            int i2 = oVar.f891k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.f891k = i2 - Integer.MIN_VALUE;
            } else {
                oVar = new o(bVar);
            }
        } else {
            oVar = new o(bVar);
        }
        Object obj = oVar.f890j;
        Object obj2 = A0.a.f0e;
        int i3 = oVar.f891k;
        if (i3 == 0) {
            p000a.a.O(obj);
            I0.p pVar2 = new I0.p();
            A a3 = new A(1, pVar2);
            try {
                oVar.f888h = pVar2;
                oVar.f889i = a3;
                oVar.f891k = 1;
                if (dVar.g(a3, oVar) == obj2) {
                    return obj2;
                }
                pVar = pVar2;
            } catch (U0.a e3) {
                pVar = pVar2;
                e2 = e3;
                a2 = a3;
                if (e2.f907e != a2) {
                    throw e2;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a2 = oVar.f889i;
            pVar = oVar.f888h;
            try {
                p000a.a.O(obj);
            } catch (U0.a e4) {
                e2 = e4;
                if (e2.f907e != a2) {
                    throw e2;
                }
            }
        }
        return pVar.f338e;
    }
}
