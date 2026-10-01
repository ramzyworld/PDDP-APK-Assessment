package G;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: G.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0007h extends B0.g implements H0.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Iterator f210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f215n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0007h(List list, ArrayList arrayList, z0.d dVar) {
        super(2, dVar);
        this.f214m = list;
        this.f215n = arrayList;
    }

    @Override // B0.b
    public final z0.d b(Object obj, z0.d dVar) {
        C0007h c0007h = new C0007h(this.f214m, this.f215n, dVar);
        c0007h.f213l = obj;
        return c0007h;
    }

    @Override // H0.p
    public final Object h(Object obj, Object obj2) {
        return ((C0007h) b(obj, (z0.d) obj2)).k(p041x0.g.f3419a);
    }

    @Override // B0.b
    public final Object k(Object obj) {
        Iterator it;
        List list;
        int i2 = this.f212k;
        if (i2 == 0) {
            p000a.a.O(obj);
            obj = this.f213l;
            it = this.f214m.iterator();
            list = this.f215n;
        } else if (i2 == 1) {
            Object obj2 = this.f211j;
            Iterator it2 = this.f210i;
            List list2 = (List) this.f213l;
            p000a.a.O(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0006g(1, null));
                this.f213l = list2;
                this.f210i = it2;
                this.f211j = null;
                this.f212k = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f210i;
            list = (List) this.f213l;
            p000a.a.O(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f213l = list;
        this.f210i = it;
        this.f211j = obj;
        this.f212k = 1;
        throw null;
    }
}
