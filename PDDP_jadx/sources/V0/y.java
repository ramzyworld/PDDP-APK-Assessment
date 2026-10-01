package V0;

import Q0.g0;

/* JADX INFO: loaded from: classes.dex */
public final class y extends I0.j implements H0.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final y f1017g = new y(2, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y f1018h = new y(2, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y f1019i = new y(2, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1020f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i2, int i3) {
        super(i2);
        this.f1020f = i3;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        switch (this.f1020f) {
            case 0:
                z0.g gVar = (z0.g) obj2;
                if (!(gVar instanceof g0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? gVar : Integer.valueOf(iIntValue + 1);
            case 1:
                g0 g0Var = (g0) obj;
                z0.g gVar2 = (z0.g) obj2;
                if (g0Var != null) {
                    return g0Var;
                }
                if (gVar2 instanceof g0) {
                    return (g0) gVar2;
                }
                return null;
            default:
                return (A) obj;
        }
    }
}
