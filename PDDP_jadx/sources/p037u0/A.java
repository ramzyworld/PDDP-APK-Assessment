package p037u0;

import B0.g;
import H0.p;
import J.b;
import J.d;
import p000a.a;

/* JADX INFO: loaded from: classes.dex */
public final class A extends g implements p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3079i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f3080j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f3081k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(d dVar, boolean z2, z0.d dVar2) {
        super(2, dVar2);
        this.f3080j = dVar;
        this.f3081k = z2;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        A a2 = new A(this.f3080j, this.f3081k, dVar);
        a2.f3079i = obj;
        return a2;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        A a2 = (A) b((b) obj, (z0.d) obj2);
        p041x0.g gVar = p041x0.g.f3419a;
        a2.k(gVar);
        return gVar;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        a.O(obj);
        ((b) this.f3079i).d(this.f3080j, Boolean.valueOf(this.f3081k));
        return p041x0.g.f3419a;
    }
}
