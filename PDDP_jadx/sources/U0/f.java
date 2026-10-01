package U0;

import V0.u;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z0.i f918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f920g;

    public f(z0.i iVar, int i2, int i3) {
        this.f918e = iVar;
        this.f919f = i2;
        this.f920g = i3;
    }

    public abstract Object a(S0.p pVar, z0.d dVar);

    public abstract f b(z0.i iVar, int i2, int i3);

    @Override // T0.d
    public Object g(T0.e eVar, z0.d dVar) {
        d dVar2 = new d(eVar, this, null);
        u uVar = new u(dVar, dVar.i());
        Object objM = p000a.a.M(uVar, uVar, dVar2);
        return objM == A0.a.f0e ? objM : p041x0.g.f3419a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    @Override // U0.j
    public final T0.d q(z0.i iVar, int i2, int i3) {
        z0.i iVar2 = this.f918e;
        z0.i iVarC = iVar.c(iVar2);
        int i4 = this.f920g;
        int i5 = this.f919f;
        if (i3 == 1) {
            if (i5 != -3) {
                if (i2 == -3) {
                    i2 = i5;
                } else if (i5 != -2) {
                    if (i2 == -2) {
                        i2 = i5;
                    } else {
                        i2 += i5;
                        if (i2 < 0) {
                            i2 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            i3 = i4;
        }
        return (I0.i.a(iVarC, iVar2) && i2 == i5 && i3 == i4) ? this : b(iVarC, i2, i3);
    }

    public String toString() {
        String str;
        ArrayList arrayList = new ArrayList(4);
        z0.j jVar = z0.j.f3504e;
        z0.i iVar = this.f918e;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i2 = this.f919f;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        int i3 = this.f920g;
        if (i3 != 1) {
            if (i3 == 1) {
                str = "SUSPEND";
            } else if (i3 != 2) {
                str = i3 != 3 ? "null" : "DROP_LATEST";
            } else {
                str = "DROP_OLDEST";
            }
            arrayList.add("onBufferOverflow=".concat(str));
        }
        return getClass().getSimpleName() + '[' + p043y0.d.R(arrayList, ", ", null, null, null, 62) + ']';
    }
}
