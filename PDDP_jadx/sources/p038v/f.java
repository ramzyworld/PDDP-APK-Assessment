package p038v;

import N.Q;
import java.util.ArrayList;
import p022m.i;
import x.a;

/* JADX INFO: loaded from: classes.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3219b;

    public /* synthetic */ f(int i2, Object obj) {
        this.f3218a = i2;
        this.f3219b = obj;
    }

    @Override // x.a
    public final void accept(Object obj) {
        switch (this.f3218a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((Q) this.f3219b).k(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f3224c) {
                    try {
                        i iVar = h.f3225d;
                        ArrayList arrayList = (ArrayList) iVar.getOrDefault((String) this.f3219b, null);
                        if (arrayList == null) {
                            return;
                        }
                        iVar.remove((String) this.f3219b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((a) arrayList.get(i2)).accept(gVar2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
