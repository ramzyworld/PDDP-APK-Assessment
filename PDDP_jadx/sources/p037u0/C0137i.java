package p037u0;

import B0.g;
import H0.p;
import I0.i;
import J.b;
import java.util.List;
import p000a.a;
import z0.d;

/* JADX INFO: renamed from: u0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0137i extends g implements p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f3139j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0137i(List list, d dVar) {
        super(2, dVar);
        this.f3139j = list;
    }

    @Override // B0.b
    public final d b(Object obj, d dVar) {
        C0137i c0137i = new C0137i(this.f3139j, dVar);
        c0137i.f3138i = obj;
        return c0137i;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        C0137i c0137i = (C0137i) b((b) obj, (d) obj2);
        p041x0.g gVar = p041x0.g.f3419a;
        c0137i.k(gVar);
        return gVar;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        p041x0.g gVar;
        a.O(obj);
        b bVar = (b) this.f3138i;
        p041x0.g gVar2 = p041x0.g.f3419a;
        List<String> list = this.f3139j;
        if (list != null) {
            for (String str : list) {
                i.e(str, "name");
                J.d dVar = new J.d(str);
                bVar.b();
                bVar.f341a.remove(dVar);
            }
            gVar = gVar2;
        } else {
            gVar = null;
        }
        if (gVar == null) {
            bVar.b();
            bVar.f341a.clear();
        }
        return gVar2;
    }
}
