package G;

import java.util.Set;

/* JADX INFO: renamed from: G.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0019u implements T0.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ T0.e f281f;

    public /* synthetic */ C0019u(T0.e eVar, int i2) {
        this.f280e = i2;
        this.f281f = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // T0.e
    public final Object a(Object obj, z0.d dVar) throws Throwable {
        C0018t c0018t;
        p037u0.z zVar;
        switch (this.f280e) {
            case 0:
                if (dVar instanceof C0018t) {
                    c0018t = (C0018t) dVar;
                    int i2 = c0018t.f278i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0018t.f278i = i2 - Integer.MIN_VALUE;
                    } else {
                        c0018t = new C0018t(this, dVar);
                    }
                } else {
                    c0018t = new C0018t(this, dVar);
                }
                Object obj2 = c0018t.f277h;
                A0.a aVar = A0.a.f0e;
                int i3 = c0018t.f278i;
                if (i3 == 0) {
                    p000a.a.O(obj2);
                    m0 m0Var = (m0) obj;
                    if (m0Var instanceof f0) {
                        throw ((f0) m0Var).f203b;
                    }
                    if (!(m0Var instanceof C0003d)) {
                        if (m0Var instanceof d0 ? true : m0Var instanceof n0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new O.c();
                    }
                    Object obj3 = ((C0003d) m0Var).f189b;
                    c0018t.f278i = 1;
                    if (this.f281f.a(obj3, c0018t) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p000a.a.O(obj2);
                }
                return p041x0.g.f3419a;
            default:
                if (dVar instanceof p037u0.z) {
                    zVar = (p037u0.z) dVar;
                    int i4 = zVar.f3202i;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        zVar.f3202i = i4 - Integer.MIN_VALUE;
                    } else {
                        zVar = new p037u0.z(this, dVar);
                    }
                } else {
                    zVar = new p037u0.z(this, dVar);
                }
                Object obj4 = zVar.f3201h;
                A0.a aVar2 = A0.a.f0e;
                int i5 = zVar.f3202i;
                if (i5 == 0) {
                    p000a.a.O(obj4);
                    Set setKeySet = ((J.b) obj).a().keySet();
                    zVar.f3202i = 1;
                    if (this.f281f.a(setKeySet, zVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p000a.a.O(obj4);
                }
                return p041x0.g.f3419a;
        }
    }
}
