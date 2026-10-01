package G;

import Q0.AbstractC0063v;
import Q0.C0054l;
import Q0.C0056n;
import Q0.InterfaceC0053k;
import Q0.InterfaceC0062u;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class S implements InterfaceC0008i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X f140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H.a f141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC0062u f142g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Q0.e0 f146k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0013n f148m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0013n f151p;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D.j f143h = new D.j(new C0020v(this, null));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Y0.d f144i = Y0.e.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final D.j f147l = new D.j(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p041x0.e f149n = new p041x0.e(new C0014o(this, 1));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p041x0.e f150o = new p041x0.e(new C0014o(this, 0));

    public S(X x2, List list, H.a aVar, InterfaceC0062u interfaceC0062u) {
        this.f140e = x2;
        this.f141f = aVar;
        this.f142g = interfaceC0062u;
        this.f148m = new C0013n(this, list);
        this.f151p = new C0013n(interfaceC0062u, new M(0, this), new O(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(S s2, B0.b bVar) {
        C0021w c0021w;
        Y0.d dVar;
        s2.getClass();
        if (bVar instanceof C0021w) {
            c0021w = (C0021w) bVar;
            int i2 = c0021w.f290l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0021w.f290l = i2 - Integer.MIN_VALUE;
            } else {
                c0021w = new C0021w(s2, bVar);
            }
        } else {
            c0021w = new C0021w(s2, bVar);
        }
        Object obj = c0021w.f288j;
        A0.a aVar = A0.a.f0e;
        int i3 = c0021w.f290l;
        if (i3 == 0) {
            p000a.a.O(obj);
            c0021w.f286h = s2;
            dVar = s2.f144i;
            c0021w.f287i = dVar;
            c0021w.f290l = 1;
            if (dVar.c(c0021w) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Y0.d dVar2 = c0021w.f287i;
            S s3 = c0021w.f286h;
            p000a.a.O(obj);
            dVar = dVar2;
            s2 = s3;
        }
        try {
            int i4 = s2.f145j - 1;
            s2.f145j = i4;
            if (i4 == 0) {
                Q0.e0 e0Var = s2.f146k;
                if (e0Var != null) {
                    e0Var.a(null);
                }
                s2.f146k = null;
            }
            return p041x0.g.f3419a;
        } finally {
            dVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [B0.g, H0.p] */
    /* JADX WARN: Type inference failed for: r2v9, types: [B0.g, H0.p] */
    /* JADX WARN: Type inference failed for: r9v0, types: [G.S, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v9, types: [G.S] */
    public static final Object b(S s2, e0 e0Var, B0.b bVar) {
        C0023y c0023y;
        InterfaceC0053k interfaceC0053k;
        C0054l c0054l;
        ?? r9;
        ?? r2;
        z0.i iVar;
        Object objB;
        ?? r10;
        Throwable thA;
        C0054l c0054l2;
        s2.getClass();
        if (bVar instanceof C0023y) {
            c0023y = (C0023y) bVar;
            int i2 = c0023y.f298m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0023y.f298m = i2 - Integer.MIN_VALUE;
            } else {
                c0023y = new C0023y(s2, bVar);
            }
        } else {
            c0023y = new C0023y(s2, bVar);
        }
        Object objL = c0023y.f296k;
        A0.a aVar = A0.a.f0e;
        int i3 = c0023y.f298m;
        boolean z2 = true;
        try {
            if (i3 != 0) {
                try {
                    if (i3 == 1) {
                        interfaceC0053k = (InterfaceC0053k) c0023y.f293h;
                    } else if (i3 == 2) {
                        C0054l c0054l3 = c0023y.f295j;
                        S s3 = c0023y.f294i;
                        e0 e0Var2 = (e0) c0023y.f293h;
                        p000a.a.O(objL);
                        c0054l = c0054l3;
                        r9 = s3;
                        e0Var = e0Var2;
                    } else {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC0053k = (InterfaceC0053k) c0023y.f293h;
                    }
                    p000a.a.O(objL);
                    r10 = interfaceC0053k;
                } catch (Throwable th) {
                    th = th;
                    objL = p000a.a.l(th);
                    r10 = s2;
                }
                thA = p041x0.d.a(objL);
                c0054l2 = (C0054l) r10;
                if (thA == null) {
                    c0054l2.K(objL);
                } else {
                    c0054l2.getClass();
                    c0054l2.K(new C0056n(thA, false));
                }
                return p041x0.g.f3419a;
            }
            p000a.a.O(objL);
            c0054l = e0Var.f196b;
            try {
                m0 m0VarP = s2.f147l.p();
                if (m0VarP instanceof C0003d) {
                    ?? r3 = e0Var.f195a;
                    z0.i iVar2 = e0Var.f198d;
                    c0023y.f293h = c0054l;
                    c0023y.f298m = 1;
                    try {
                        objB = s2.g().b(new I((S) s2, iVar2, (H0.p) r3, (z0.d) null), c0023y);
                        if (objB == aVar) {
                            return aVar;
                        }
                        C0054l c0054l4 = c0054l;
                        objL = objB;
                        r10 = c0054l4;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        s2 = c0054l;
                        objL = p000a.a.l(th);
                        r10 = s2;
                    }
                    thA = p041x0.d.a(objL);
                    c0054l2 = (C0054l) r10;
                    if (thA == null) {
                        c0054l2.K(objL);
                    } else {
                        c0054l2.getClass();
                        c0054l2.K(new C0056n(thA, false));
                    }
                    return p041x0.g.f3419a;
                }
                if (!(m0VarP instanceof f0)) {
                    z2 = m0VarP instanceof n0;
                }
                if (!z2) {
                    if (m0VarP instanceof d0) {
                        throw ((d0) m0VarP).f191b;
                    }
                    throw new O.c();
                }
                if (m0VarP != e0Var.f197c) {
                    I0.i.c(m0VarP, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                    throw ((f0) m0VarP).f203b;
                }
                c0023y.f293h = e0Var;
                c0023y.f294i = s2;
                c0023y.f295j = c0054l;
                c0023y.f298m = 2;
                if (s2.h(c0023y) == aVar) {
                    r9 = s2;
                    return aVar;
                }
            } catch (Throwable th3) {
                th = th3;
                s2 = c0054l;
                objL = p000a.a.l(th);
                r10 = s2;
            }
            objB = r9.g().b(new I((S) r9, iVar, (H0.p) r2, (z0.d) null), c0023y);
            if (objB == aVar) {
                return aVar;
            }
            C0054l c0054l5 = c0054l;
            objL = objB;
            r10 = c0054l5;
        } catch (Throwable th4) {
            th = th4;
            th = th;
            s2 = c0054l;
            objL = p000a.a.l(th);
            r10 = s2;
        }
        r9 = s2;
        r2 = e0Var.f195a;
        iVar = e0Var.f198d;
        c0023y.f293h = c0054l;
        c0023y.f294i = null;
        c0023y.f295j = null;
        c0023y.f298m = 3;
        thA = p041x0.d.a(objL);
        c0054l2 = (C0054l) r10;
        if (thA == null) {
            c0054l2.K(objL);
        } else {
            c0054l2.getClass();
            c0054l2.K(new C0056n(thA, false));
        }
        return p041x0.g.f3419a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(S s2, B0.b bVar) {
        C0024z c0024z;
        Y0.d dVar;
        s2.getClass();
        if (bVar instanceof C0024z) {
            c0024z = (C0024z) bVar;
            int i2 = c0024z.f303l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0024z.f303l = i2 - Integer.MIN_VALUE;
            } else {
                c0024z = new C0024z(s2, bVar);
            }
        } else {
            c0024z = new C0024z(s2, bVar);
        }
        Object obj = c0024z.f301j;
        A0.a aVar = A0.a.f0e;
        int i3 = c0024z.f303l;
        if (i3 == 0) {
            p000a.a.O(obj);
            c0024z.f299h = s2;
            dVar = s2.f144i;
            c0024z.f300i = dVar;
            c0024z.f303l = 1;
            if (dVar.c(c0024z) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Y0.d dVar2 = c0024z.f300i;
            S s3 = c0024z.f299h;
            p000a.a.O(obj);
            dVar = dVar2;
            s2 = s3;
        }
        try {
            int i4 = s2.f145j + 1;
            s2.f145j = i4;
            if (i4 == 1) {
                s2.f146k = AbstractC0063v.g(s2.f142g, new B(s2, null));
            }
            return p041x0.g.f3419a;
        } finally {
            dVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object e(S s2, boolean z2, z0.d dVar) throws Throwable {
        D d2;
        S s3;
        m0 m0Var;
        S s4;
        p041x0.b bVar;
        m0 m0Var2;
        s2.getClass();
        if (dVar instanceof D) {
            d2 = (D) dVar;
            int i2 = d2.f85m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d2.f85m = i2 - Integer.MIN_VALUE;
            } else {
                d2 = new D(s2, dVar);
            }
        } else {
            d2 = new D(s2, dVar);
        }
        Object objC = d2.f83k;
        A0.a aVar = A0.a.f0e;
        int i3 = d2.f85m;
        if (i3 == 0) {
            p000a.a.O(objC);
            m0 m0VarP = s2.f147l.p();
            if (m0VarP instanceof n0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            l0 l0VarG = s2.g();
            d2.f80h = s2;
            d2.f81i = m0VarP;
            d2.f82j = z2;
            d2.f85m = 1;
            Integer numA = l0VarG.a();
            if (numA == aVar) {
                return aVar;
            }
            s3 = s2;
            m0Var = m0VarP;
            objC = numA;
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    s4 = d2.f80h;
                    p000a.a.O(objC);
                    bVar = (p041x0.b) objC;
                    m0Var2 = (m0) bVar.f3411e;
                    if (((Boolean) bVar.f3412f).booleanValue()) {
                        return m0Var2;
                    }
                    s4.f147l.x(m0Var2);
                    return m0Var2;
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s4 = d2.f80h;
                p000a.a.O(objC);
                bVar = (p041x0.b) objC;
                m0Var2 = (m0) bVar.f3411e;
                if (((Boolean) bVar.f3412f).booleanValue()) {
                    return m0Var2;
                }
                s4.f147l.x(m0Var2);
                return m0Var2;
            }
            z2 = d2.f82j;
            m0Var = d2.f81i;
            s3 = d2.f80h;
            p000a.a.O(objC);
        }
        int iIntValue = ((Number) objC).intValue();
        boolean z3 = m0Var instanceof C0003d;
        int i4 = z3 ? m0Var.f257a : -1;
        if (z3 && iIntValue == i4) {
            return m0Var;
        }
        if (z2) {
            l0 l0VarG2 = s3.g();
            E e2 = new E(s3, null);
            d2.f80h = s3;
            d2.f81i = null;
            d2.f85m = 2;
            objC = l0VarG2.b(e2, d2);
            if (objC == aVar) {
                return aVar;
            }
            s4 = s3;
            bVar = (p041x0.b) objC;
            m0Var2 = (m0) bVar.f3411e;
            if (((Boolean) bVar.f3412f).booleanValue()) {
                return m0Var2;
            }
            s4.f147l.x(m0Var2);
            return m0Var2;
        }
        l0 l0VarG3 = s3.g();
        F f2 = new F(s3, i4, null);
        d2.f80h = s3;
        d2.f81i = null;
        d2.f85m = 3;
        objC = l0VarG3.c(f2, d2);
        if (objC == aVar) {
            return aVar;
        }
        s4 = s3;
        bVar = (p041x0.b) objC;
        m0Var2 = (m0) bVar.f3411e;
        if (((Boolean) bVar.f3412f).booleanValue()) {
            return m0Var2;
        }
        s4.f147l.x(m0Var2);
        return m0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea A[Catch: c -> 0x00ab, TryCatch #0 {c -> 0x00ab, blocks: (B:35:0x00a6, B:69:0x0144, B:40:0x00b4, B:66:0x0127, B:48:0x00d1, B:56:0x00ea, B:57:0x00ee, B:52:0x00da, B:63:0x0115), top: B:74:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0104  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final Object f(S s2, boolean z2, B0.b bVar) {
        G g2;
        int iHashCode;
        Integer numA;
        Object obj;
        S s3;
        int i2;
        C0002c c0002c;
        Object objB;
        I0.o oVar;
        I0.p pVar;
        s2.getClass();
        if (bVar instanceof G) {
            g2 = (G) bVar;
            int i3 = g2.f102p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g2.f102p = i3 - Integer.MIN_VALUE;
            } else {
                g2 = new G(s2, bVar);
            }
        } else {
            g2 = new G(s2, bVar);
        }
        Object objA = g2.f100n;
        A0.a aVar = A0.a.f0e;
        try {
            switch (g2.f102p) {
                case 0:
                    p000a.a.O(objA);
                    if (!z2) {
                        l0 l0VarG = s2.g();
                        g2.f94h = s2;
                        g2.f98l = z2;
                        g2.f102p = 3;
                        objA = l0VarG.a();
                        if (objA == aVar) {
                            return aVar;
                        }
                        int iIntValue = ((Number) objA).intValue();
                        l0 l0VarG2 = s2.g();
                        H h2 = new H(s2, iIntValue, null);
                        g2.f94h = s2;
                        g2.f98l = z2;
                        g2.f102p = 4;
                        objA = l0VarG2.c(h2, g2);
                        if (objA == aVar) {
                            return aVar;
                        }
                        return (C0003d) objA;
                    }
                    g2.f94h = s2;
                    g2.f98l = z2;
                    g2.f102p = 1;
                    objA = s2.i(g2);
                    if (objA == aVar) {
                        return aVar;
                    }
                    iHashCode = objA != null ? objA.hashCode() : 0;
                    l0 l0VarG3 = s2.g();
                    g2.f94h = s2;
                    g2.f95i = objA;
                    g2.f98l = z2;
                    g2.f99m = iHashCode;
                    g2.f102p = 2;
                    numA = l0VarG3.a();
                    if (numA == aVar) {
                        return aVar;
                    }
                    obj = objA;
                    objA = numA;
                    s3 = s2;
                    i2 = iHashCode;
                    return new C0003d(obj, i2, ((Number) objA).intValue());
                case 1:
                    z2 = g2.f98l;
                    s2 = (S) g2.f94h;
                    p000a.a.O(objA);
                    if (objA != null) {
                    }
                    l0 l0VarG4 = s2.g();
                    g2.f94h = s2;
                    g2.f95i = objA;
                    g2.f98l = z2;
                    g2.f99m = iHashCode;
                    g2.f102p = 2;
                    numA = l0VarG4.a();
                    if (numA == aVar) {
                        return aVar;
                    }
                    obj = objA;
                    objA = numA;
                    s3 = s2;
                    i2 = iHashCode;
                    return new C0003d(obj, i2, ((Number) objA).intValue());
                case 2:
                    i2 = g2.f99m;
                    z2 = g2.f98l;
                    obj = g2.f95i;
                    s3 = (S) g2.f94h;
                    try {
                        p000a.a.O(objA);
                        return new C0003d(obj, i2, ((Number) objA).intValue());
                    } catch (C0002c e2) {
                        e = e2;
                        s2 = s3;
                        I0.p pVar2 = new I0.p();
                        H.a aVar2 = s2.f141f;
                        g2.f94h = s2;
                        g2.f95i = e;
                        g2.f96j = pVar2;
                        g2.f97k = pVar2;
                        g2.f98l = z2;
                        g2.f102p = 5;
                        throw e;
                    }
                case 3:
                    z2 = g2.f98l;
                    s2 = (S) g2.f94h;
                    p000a.a.O(objA);
                    int iIntValue2 = ((Number) objA).intValue();
                    l0 l0VarG5 = s2.g();
                    H h3 = new H(s2, iIntValue2, null);
                    g2.f94h = s2;
                    g2.f98l = z2;
                    g2.f102p = 4;
                    objA = l0VarG5.c(h3, g2);
                    if (objA == aVar) {
                        return aVar;
                    }
                    return (C0003d) objA;
                case I.k.LONG_FIELD_NUMBER /* 4 */:
                    boolean z3 = g2.f98l;
                    p000a.a.O(objA);
                    return (C0003d) objA;
                case I.k.STRING_FIELD_NUMBER /* 5 */:
                    boolean z4 = g2.f98l;
                    I0.p pVar3 = g2.f97k;
                    I0.p pVar4 = (I0.p) g2.f96j;
                    C0002c c0002c2 = (C0002c) g2.f95i;
                    S s4 = (S) g2.f94h;
                    p000a.a.O(objA);
                    pVar3.f338e = objA;
                    I0.o oVar2 = new I0.o();
                    try {
                        I i4 = new I(pVar4, s4, oVar2, (z0.d) null);
                        g2.f94h = c0002c2;
                        g2.f95i = pVar4;
                        g2.f96j = oVar2;
                        g2.f97k = null;
                        g2.f102p = 6;
                        if (z4) {
                            s4.getClass();
                            objB = i4.j(g2);
                        } else {
                            objB = s4.g().b(new C0022x(i4, null), g2);
                        }
                        if (objB == aVar) {
                            return aVar;
                        }
                        oVar = oVar2;
                        pVar = pVar4;
                        Object obj2 = pVar.f338e;
                        return new C0003d(obj2, obj2 != null ? obj2.hashCode() : 0, oVar.f337e);
                    } catch (Throwable th) {
                        th = th;
                        c0002c = c0002c2;
                        a1.a.c(c0002c, th);
                        throw c0002c;
                    }
                case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    oVar = (I0.o) g2.f96j;
                    pVar = (I0.p) g2.f95i;
                    c0002c = (C0002c) g2.f94h;
                    try {
                        p000a.a.O(objA);
                        Object obj3 = pVar.f338e;
                        return new C0003d(obj3, obj3 != null ? obj3.hashCode() : 0, oVar.f337e);
                    } catch (Throwable th2) {
                        th = th2;
                        a1.a.c(c0002c, th);
                        throw c0002c;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (C0002c e3) {
            e = e3;
        }
    }

    @Override // G.InterfaceC0008i
    public final Object c(H0.p pVar, B0.g gVar) {
        z0.i iVar = gVar.f4f;
        I0.i.b(iVar);
        q0 q0Var = (q0) iVar.f(p0.f268e);
        if (q0Var != null) {
            q0Var.e(this);
        }
        return AbstractC0063v.n(new q0(q0Var, this), new L(this, pVar, null), gVar);
    }

    public final l0 g() {
        return (l0) this.f150o.a();
    }

    @Override // G.InterfaceC0008i
    public final T0.d getData() {
        return this.f143h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(B0.b bVar) throws Throwable {
        C c2;
        S s2;
        int iIntValue;
        int i2;
        Throwable th;
        S s3;
        if (bVar instanceof C) {
            c2 = (C) bVar;
            int i3 = c2.f79l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2.f79l = i3 - Integer.MIN_VALUE;
            } else {
                c2 = new C(this, bVar);
            }
        } else {
            c2 = new C(this, bVar);
        }
        Object objA = c2.f77j;
        Object obj = A0.a.f0e;
        int i4 = c2.f79l;
        try {
            if (i4 == 0) {
                p000a.a.O(objA);
                l0 l0VarG = g();
                c2.f75h = this;
                c2.f79l = 1;
                objA = l0VarG.a();
                if (objA == obj) {
                    return obj;
                }
                s2 = this;
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = c2.f76i;
                    s3 = c2.f75h;
                    try {
                        p000a.a.O(objA);
                        return p041x0.g.f3419a;
                    } catch (Throwable th2) {
                        th = th2;
                        s3.f147l.x(new f0(th, i2));
                        throw th;
                    }
                }
                s2 = c2.f75h;
                p000a.a.O(objA);
            }
            C0013n c0013n = s2.f148m;
            c2.f75h = s2;
            c2.f76i = iIntValue;
            c2.f79l = 2;
            if (c0013n.e(c2) == obj) {
                return obj;
            }
            return p041x0.g.f3419a;
        } catch (Throwable th3) {
            i2 = iIntValue;
            th = th3;
            s3 = s2;
            s3.f147l.x(new f0(th, i2));
            throw th;
        }
        iIntValue = ((Number) objA).intValue();
    }

    public final Object i(B0.b bVar) {
        return ((a0) this.f149n.a()).a(new C0017s(3, (z0.d) null), bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(Object obj, boolean z2, B0.b bVar) {
        P p2;
        I0.o oVar;
        if (bVar instanceof P) {
            p2 = (P) bVar;
            int i2 = p2.f132k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p2.f132k = i2 - Integer.MIN_VALUE;
            } else {
                p2 = new P(this, bVar);
            }
        } else {
            p2 = new P(this, bVar);
        }
        Object obj2 = p2.f130i;
        A0.a aVar = A0.a.f0e;
        int i3 = p2.f132k;
        if (i3 == 0) {
            p000a.a.O(obj2);
            I0.o oVar2 = new I0.o();
            a0 a0Var = (a0) this.f149n.a();
            Q q2 = new Q(oVar2, this, obj, z2, null);
            p2.f129h = oVar2;
            p2.f132k = 1;
            if (a0Var.b(q2, p2) == aVar) {
                return aVar;
            }
            oVar = oVar2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = p2.f129h;
            p000a.a.O(obj2);
        }
        return new Integer(oVar.f337e);
    }
}
