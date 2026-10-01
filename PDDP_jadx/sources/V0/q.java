package V0;

import Q0.AbstractC0063v;

/* JADX INFO: loaded from: classes.dex */
public final class q extends I0.j implements H0.l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ H0.l f1008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z0.i f1010h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(H0.l lVar, Object obj, z0.i iVar) {
        super(1);
        this.f1008f = lVar;
        this.f1009g = obj;
        this.f1010h = iVar;
    }

    @Override // H0.l
    public final Object j(Object obj) {
        O.c cVarA = AbstractC0068a.a(this.f1008f, this.f1009g, null);
        if (cVarA != null) {
            AbstractC0063v.d(cVarA, this.f1010h);
        }
        return p041x0.g.f3419a;
    }
}
