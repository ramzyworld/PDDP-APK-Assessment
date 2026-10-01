package G;

import java.io.IOException;

/* JADX INFO: renamed from: G.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0017s extends B0.g implements H0.q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f274i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f276k;

    public /* synthetic */ C0017s(int i2, z0.d dVar) {
        super(i2, dVar);
    }

    @Override // B0.b
    public final Object k(Object obj) throws IOException {
        switch (this.f274i) {
            case 0:
                A0.a aVar = A0.a.f0e;
                int i2 = this.f275j;
                if (i2 == 0) {
                    p000a.a.O(obj);
                    this.f275j = 1;
                    if (S.a((S) this.f276k, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p000a.a.O(obj);
                }
                return p041x0.g.f3419a;
            default:
                A0.a aVar2 = A0.a.f0e;
                int i3 = this.f275j;
                if (i3 == 0) {
                    p000a.a.O(obj);
                    U u2 = (U) this.f276k;
                    this.f275j = 1;
                    u2.getClass();
                    obj = U.a(u2, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p000a.a.O(obj);
                }
                return obj;
        }
    }

    public final Object p(Object obj, Object obj2, B0.b bVar) {
        switch (this.f274i) {
            case 0:
                return new C0017s((S) this.f276k, bVar).k(p041x0.g.f3419a);
            default:
                ((Boolean) obj2).getClass();
                C0017s c0017s = new C0017s(3, bVar);
                c0017s.f276k = (U) obj;
                return c0017s.k(p041x0.g.f3419a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0017s(S s2, z0.d dVar) {
        super(3, dVar);
        this.f276k = s2;
    }
}
