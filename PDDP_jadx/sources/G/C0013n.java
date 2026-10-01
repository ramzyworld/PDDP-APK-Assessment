package G;

import Q0.C0054l;
import Q0.C0061t;
import Q0.InterfaceC0062u;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: G.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0013n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f261d;

    public /* synthetic */ C0013n(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f258a = obj;
        this.f259b = obj2;
        this.f260c = obj3;
        this.f261d = obj4;
    }

    public static boolean d(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public Object a(int i2, int i3) {
        return ((p022m.a) this.f261d).f2860f[(i2 << 1) + i3];
    }

    public void b(int i2) {
        ((p022m.a) this.f261d).g(i2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(B0.b bVar) throws Throwable {
        C0009j c0009j;
        C0013n c0013n;
        C0003d c0003d;
        if (bVar instanceof C0009j) {
            c0009j = (C0009j) bVar;
            int i2 = c0009j.f227k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0009j.f227k = i2 - Integer.MIN_VALUE;
            } else {
                c0009j = new C0009j(this, bVar);
            }
        } else {
            c0009j = new C0009j(this, bVar);
        }
        Object objF = c0009j.f225i;
        A0.a aVar = A0.a.f0e;
        int i3 = c0009j.f227k;
        if (i3 == 0) {
            p000a.a.O(objF);
            List list = (List) this.f260c;
            S s2 = (S) this.f261d;
            if (list == null || list.isEmpty()) {
                c0009j.f224h = this;
                c0009j.f227k = 1;
                objF = S.f(s2, false, c0009j);
                if (objF == aVar) {
                    return aVar;
                }
                c0013n = this;
                c0003d = (C0003d) objF;
            } else {
                l0 l0VarG = s2.g();
                C0012m c0012m = new C0012m(s2, this, null);
                c0009j.f224h = this;
                c0009j.f227k = 2;
                objF = l0VarG.b(c0012m, c0009j);
                if (objF == aVar) {
                    return aVar;
                }
                c0013n = this;
                c0003d = (C0003d) objF;
            }
        } else if (i3 == 1) {
            c0013n = c0009j.f224h;
            p000a.a.O(objF);
            c0003d = (C0003d) objF;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0013n = c0009j.f224h;
            p000a.a.O(objF);
            c0003d = (C0003d) objF;
        }
        ((S) c0013n.f261d).f147l.x(c0003d);
        return p041x0.g.f3419a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(B0.b bVar) throws Throwable {
        g0 g0Var;
        C0013n c0013n;
        Y0.a aVar;
        Y0.a aVar2;
        Throwable th;
        C0013n c0013n2;
        if (bVar instanceof g0) {
            g0Var = (g0) bVar;
            int i2 = g0Var.f209l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g0Var.f209l = i2 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, bVar);
            }
        } else {
            g0Var = new g0(this, bVar);
        }
        Object obj = g0Var.f207j;
        A0.a aVar3 = A0.a.f0e;
        int i3 = g0Var.f209l;
        p041x0.g gVar = p041x0.g.f3419a;
        try {
            if (i3 == 0) {
                p000a.a.O(obj);
                if (!(((C0054l) this.f259b).E() instanceof Q0.L)) {
                    return gVar;
                }
                g0Var.f205h = this;
                Y0.d dVar = (Y0.d) this.f258a;
                g0Var.f206i = dVar;
                g0Var.f209l = 1;
                if (dVar.c(g0Var) == aVar3) {
                    return aVar3;
                }
                c0013n = this;
                aVar = dVar;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = g0Var.f206i;
                    c0013n2 = g0Var.f205h;
                    try {
                        p000a.a.O(obj);
                        aVar2 = aVar2;
                        ((C0054l) c0013n2.f259b).K(gVar);
                        ((Y0.d) aVar2).e(null);
                        return gVar;
                    } catch (Throwable th2) {
                        th = th2;
                        ((Y0.d) aVar2).e(null);
                        throw th;
                    }
                }
                Y0.a aVar4 = g0Var.f206i;
                c0013n = g0Var.f205h;
                p000a.a.O(obj);
                aVar = aVar4;
            }
            if (!(((C0054l) c0013n.f259b).E() instanceof Q0.L)) {
                ((Y0.d) aVar).e(null);
                return gVar;
            }
            g0Var.f205h = c0013n;
            g0Var.f206i = aVar;
            g0Var.f209l = 2;
            if (c0013n.c(g0Var) == aVar3) {
                return aVar3;
            }
            aVar2 = aVar;
            c0013n2 = c0013n;
            ((C0054l) c0013n2.f259b).K(gVar);
            ((Y0.d) aVar2).e(null);
            return gVar;
        } catch (Throwable th3) {
            aVar2 = aVar;
            th = th3;
            ((Y0.d) aVar2).e(null);
            throw th;
        }
    }

    public void f(Object obj, p030q0.c cVar) {
        ((p030q0.f) this.f258a).n((String) this.f259b, ((p030q0.j) this.f260c).b(obj), cVar == null ? null : new p030q0.a(0, this, cVar));
    }

    public void g(p030q0.b bVar) {
        String str = (String) this.f259b;
        p030q0.f fVar = (p030q0.f) this.f258a;
        H.a aVar = (H.a) this.f261d;
        if (aVar != null) {
            fVar.e(str, bVar != null ? new N.Q(this, bVar, 21, false) : null, aVar);
        } else {
            fVar.f(str, bVar != null ? new N.Q(this, bVar, 21, false) : null);
        }
    }

    public Object[] h(int i2, Object[] objArr) {
        int i3 = ((p022m.a) this.f261d).f2861g;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = a(i4, i2);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public C0013n(InterfaceC0062u interfaceC0062u, M m2, O o2) {
        this.f258a = interfaceC0062u;
        this.f259b = o2;
        this.f260c = S0.i.a(Integer.MAX_VALUE, 0, 6);
        this.f261d = new D.j(1);
        Q0.P p2 = (Q0.P) interfaceC0062u.k().f(C0061t.f743f);
        if (p2 != null) {
            ((Q0.Z) p2).I(false, true, new Y0.b(2, m2, this));
        }
    }

    public C0013n(p022m.a aVar) {
        this.f261d = aVar;
    }

    public C0013n(S s2, List list) {
        this.f261d = s2;
        this.f258a = Y0.e.a();
        C0054l c0054l = new C0054l(true);
        c0054l.H(null);
        this.f259b = c0054l;
        this.f260c = p043y0.d.T(list);
    }

    public C0013n(String str, String[] strArr, String str2, p028p0.q qVar) {
        this.f258a = str;
        this.f259b = strArr;
        this.f261d = str2;
        this.f260c = qVar;
    }
}
