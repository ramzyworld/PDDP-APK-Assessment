package p037u0;

import B0.g;
import H0.p;
import J.b;
import J.d;
import p000a.a;

/* JADX INFO: renamed from: u0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0139k extends g implements p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f3144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f3145k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0139k(d dVar, String str, z0.d dVar2) {
        super(2, dVar2);
        this.f3144j = dVar;
        this.f3145k = str;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        C0139k c0139k = new C0139k(this.f3144j, this.f3145k, dVar);
        c0139k.f3143i = obj;
        return c0139k;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        C0139k c0139k = (C0139k) b((b) obj, (z0.d) obj2);
        p041x0.g gVar = p041x0.g.f3419a;
        c0139k.k(gVar);
        return gVar;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        a.O(obj);
        ((b) this.f3143i).d(this.f3144j, this.f3145k);
        return p041x0.g.f3419a;
    }
}
