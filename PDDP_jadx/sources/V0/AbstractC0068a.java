package V0;

import Q0.AbstractC0060s;
import Q0.AbstractC0063v;
import Q0.C0056n;
import Q0.C0057o;
import Q0.C0061t;
import Q0.H;
import Q0.P;
import Q0.Z;
import Q0.g0;
import Q0.h0;
import Q0.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: V0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0068a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D.j f971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D.j f972d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D.j f969a = new D.j(14, "NO_DECISION");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D.j f970b = new D.j(14, "CLOSED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D.j f973e = new D.j(14, "CONDITION_FALSE");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D.j f974f = new D.j(14, "NO_THREAD_ELEMENTS");

    static {
        int i2 = 14;
        f971c = new D.j(i2, "UNDEFINED");
        f972d = new D.j(i2, "REUSABLE_CLAIMED");
    }

    public static final O.c a(H0.l lVar, Object obj, O.c cVar) {
        try {
            lVar.j(obj);
        } catch (Throwable th) {
            if (cVar == null || cVar.getCause() == th) {
                return new O.c("Exception in undelivered element handler for " + obj, th);
            }
            a1.a.c(cVar, th);
        }
        return cVar;
    }

    public static final Object b(v vVar, long j2, H0.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (vVar.f1014g >= j2 && !vVar.c()) {
                return vVar;
            }
            Object obj = d.f977e.get(vVar);
            D.j jVar = f970b;
            if (obj == jVar) {
                return jVar;
            }
            v vVar2 = (v) ((d) obj);
            if (vVar2 == null) {
                vVar2 = (v) pVar.h(Long.valueOf(vVar.f1014g + 1), vVar);
                do {
                    atomicReferenceFieldUpdater = d.f977e;
                    if (atomicReferenceFieldUpdater.compareAndSet(vVar, null, vVar2)) {
                        if (vVar.c()) {
                            vVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(vVar) == null);
            }
            vVar = vVar2;
        }
    }

    public static final v c(Object obj) {
        if (obj != f970b) {
            return (v) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Throwable th, z0.i iVar) {
        Throwable runtimeException;
        Iterator it = f.f980a.iterator();
        while (it.hasNext()) {
            try {
                ((R0.b) it.next()).e(th, iVar);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    a1.a.c(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            a1.a.c(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f970b;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(z0.i iVar, Object obj) {
        if (obj == f974f) {
            return;
        }
        if (!(obj instanceof A)) {
            Object objD = iVar.d(null, y.f1018h);
            I0.i.c(objD, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            I0.h.g(objD);
            throw null;
        }
        A a2 = (A) obj;
        g0[] g0VarArr = a2.f968b;
        int length = g0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        g0 g0Var = g0VarArr[length];
        I0.i.b(null);
        Object obj2 = a2.f967a[length];
        throw null;
    }

    public static final void h(z0.d dVar, Object obj, H0.l lVar) {
        Object c0056n;
        if (!(dVar instanceof h)) {
            dVar.m(obj);
            return;
        }
        h hVar = (h) dVar;
        Throwable thA = p041x0.d.a(obj);
        if (thA == null) {
            c0056n = lVar != null ? new C0057o(obj, lVar) : obj;
        } else {
            c0056n = new C0056n(thA, false);
        }
        B0.b bVar = hVar.f984i;
        bVar.i();
        AbstractC0060s abstractC0060s = hVar.f983h;
        if (abstractC0060s.g()) {
            hVar.f985j = c0056n;
            hVar.f671g = 1;
            abstractC0060s.e(bVar.i(), hVar);
            return;
        }
        H hA = h0.a();
        if (hA.f680g >= 4294967296L) {
            hVar.f985j = c0056n;
            hVar.f671g = 1;
            p043y0.b bVar2 = hA.f682i;
            if (bVar2 == null) {
                bVar2 = new p043y0.b();
                hA.f682i = bVar2;
            }
            bVar2.addLast(hVar);
            return;
        }
        hA.k(true);
        try {
            P p2 = (P) bVar.i().f(C0061t.f743f);
            if (p2 == null || p2.b()) {
                Object obj2 = hVar.f986k;
                z0.i iVarI = bVar.i();
                Object objM = m(iVarI, obj2);
                j0 j0VarM = objM != f974f ? AbstractC0063v.m(bVar, iVarI, objM) : null;
                try {
                    bVar.m(obj);
                    if (j0VarM == null || j0VarM.X()) {
                        g(iVarI, objM);
                    }
                } catch (Throwable th) {
                    if (j0VarM == null || j0VarM.X()) {
                        g(iVarI, objM);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionA = ((Z) p2).A();
                hVar.b(c0056n, cancellationExceptionA);
                hVar.m(p000a.a.l(cancellationExceptionA));
            }
            while (hA.m()) {
            }
        } catch (Throwable th2) {
            try {
                hVar.h(th2, null);
            } finally {
                hA.i(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a A[LOOP:0: B:26:0x005a->B:41:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x002a A[SYNTHETIC] */
    public static final long j(String str, long j2, long j3, long j4) {
        String property;
        boolean z2;
        long j5;
        long j6;
        String str2;
        Long lValueOf;
        int iDigit;
        long j7;
        long j8;
        int i2 = x.f1016a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j2;
        }
        if (10 > new M0.c(2, 36, 1).f414f) {
            throw new IllegalArgumentException("radix 10 was not in valid range " + new M0.c(2, 36, 1));
        }
        int length = property.length();
        if (length == 0) {
            str2 = property;
            lValueOf = null;
        } else {
            int i3 = 0;
            char cCharAt = property.charAt(0);
            long j9 = -9223372036854775807L;
            if (cCharAt >= '0') {
                z2 = false;
                j5 = 0;
                j6 = -256204778801521550L;
                while (true) {
                    if (i3 >= length) {
                        str2 = property;
                        if (!z2) {
                            j5 = -j5;
                        }
                        lValueOf = Long.valueOf(j5);
                    } else {
                        iDigit = Character.digit((int) property.charAt(i3), 10);
                        if (iDigit >= 0) {
                            if (j5 >= j6) {
                                if (j6 == -256204778801521550L) {
                                    str2 = property;
                                    j6 = j9 / ((long) 10);
                                    if (j5 < j6) {
                                    }
                                }
                                lValueOf = null;
                            } else {
                                str2 = property;
                            }
                            j7 = j5 * ((long) 10);
                            j8 = iDigit;
                            if (j7 >= j9 + j8) {
                                lValueOf = null;
                            } else {
                                j5 = j7 - j8;
                                i3++;
                                length = length;
                                property = str2;
                            }
                        }
                    }
                }
            } else if (length != 1) {
                if (cCharAt == '-') {
                    j9 = Long.MIN_VALUE;
                    i3 = 1;
                    z2 = true;
                    j5 = 0;
                    j6 = -256204778801521550L;
                    while (true) {
                        if (i3 >= length) {
                            str2 = property;
                            if (!z2) {
                                j5 = -j5;
                            }
                            lValueOf = Long.valueOf(j5);
                        } else {
                            iDigit = Character.digit((int) property.charAt(i3), 10);
                            if (iDigit >= 0) {
                                if (j5 >= j6) {
                                    if (j6 == -256204778801521550L) {
                                        str2 = property;
                                        j6 = j9 / ((long) 10);
                                        if (j5 < j6) {
                                        }
                                    }
                                    lValueOf = null;
                                } else {
                                    str2 = property;
                                }
                                j7 = j5 * ((long) 10);
                                j8 = iDigit;
                                if (j7 >= j9 + j8) {
                                    lValueOf = null;
                                } else {
                                    j5 = j7 - j8;
                                    i3++;
                                    length = length;
                                    property = str2;
                                }
                            }
                        }
                    }
                } else {
                    if (cCharAt == '+') {
                        i3 = 1;
                        z2 = false;
                        j5 = 0;
                        j6 = -256204778801521550L;
                        while (true) {
                            if (i3 >= length) {
                                str2 = property;
                                if (!z2) {
                                    j5 = -j5;
                                }
                                lValueOf = Long.valueOf(j5);
                            } else {
                                iDigit = Character.digit((int) property.charAt(i3), 10);
                                if (iDigit >= 0) {
                                    if (j5 >= j6) {
                                        str2 = property;
                                    } else if (j6 == -256204778801521550L) {
                                        str2 = property;
                                        j6 = j9 / ((long) 10);
                                        if (j5 < j6) {
                                        }
                                    }
                                    j7 = j5 * ((long) 10);
                                    j8 = iDigit;
                                    if (j7 >= j9 + j8) {
                                        j5 = j7 - j8;
                                        i3++;
                                        length = length;
                                        property = str2;
                                    }
                                }
                            }
                        }
                    }
                    lValueOf = null;
                }
            }
            str2 = property;
            lValueOf = null;
        }
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j3 <= jLongValue && jLongValue <= j4) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int k(String str, int i2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return (int) j(str, i2, i3, i4);
    }

    public static final Object l(z0.i iVar) {
        Object objD = iVar.d(0, y.f1017g);
        I0.i.b(objD);
        return objD;
    }

    public static final Object m(z0.i iVar, Object obj) {
        if (obj == null) {
            obj = l(iVar);
        }
        if (obj == 0) {
            return f974f;
        }
        if (obj instanceof Integer) {
            return iVar.d(new A(((Number) obj).intValue(), iVar), y.f1019i);
        }
        I0.h.g(obj);
        throw null;
    }
}
