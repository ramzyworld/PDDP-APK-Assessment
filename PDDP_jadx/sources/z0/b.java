package z0;

import H0.p;

/* JADX INFO: loaded from: classes.dex */
public final class b extends I0.j implements p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f3498g = new b(2, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f3499h = new b(2, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3500f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, int i3) {
        super(i2);
        this.f3500f = i3;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        c cVar;
        switch (this.f3500f) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                I0.i.e(str, "acc");
                I0.i.e(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                I0.i.e(iVar, "acc");
                I0.i.e(gVar2, "element");
                i iVarH = iVar.h(gVar2.getKey());
                j jVar = j.f3504e;
                if (iVarH == jVar) {
                    return gVar2;
                }
                e eVar = e.f3503e;
                f fVar = (f) iVarH.f(eVar);
                if (fVar == null) {
                    cVar = new c(iVarH, gVar2);
                } else {
                    i iVarH2 = iVarH.h(eVar);
                    if (iVarH2 == jVar) {
                        return new c(gVar2, fVar);
                    }
                    cVar = new c(new c(iVarH2, gVar2), fVar);
                }
                return cVar;
        }
    }
}
