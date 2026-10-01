package p037u0;

import I0.i;
import java.nio.ByteBuffer;
import java.util.List;
import p030q0.m;
import p030q0.n;
import p043y0.e;

/* JADX INFO: renamed from: u0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0130b extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0130b f3126e = new C0130b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3127d;

    public /* synthetic */ C0130b(int i2) {
        this.f3127d = i2;
    }

    @Override // p030q0.n
    public Object f(byte b2, ByteBuffer byteBuffer) {
        switch (this.f3127d) {
            case 1:
                i.e(byteBuffer, "buffer");
                if (b2 == -127) {
                    Long l2 = (Long) e(byteBuffer);
                    if (l2 == null) {
                        return null;
                    }
                    int iLongValue = (int) l2.longValue();
                    for (L l3 : L.values()) {
                        if (l3.f3121e == iLongValue) {
                            return l3;
                        }
                    }
                    return null;
                }
                if (b2 == -126) {
                    Object objE = e(byteBuffer);
                    List list = objE instanceof List ? (List) objE : null;
                    if (list == null) {
                        return null;
                    }
                    String str = (String) list.get(0);
                    Object obj = list.get(1);
                    i.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    return new C0136h(str, ((Boolean) obj).booleanValue());
                }
                if (b2 != -125) {
                    return super.f(b2, byteBuffer);
                }
                Object objE2 = e(byteBuffer);
                List list2 = objE2 instanceof List ? (List) objE2 : null;
                if (list2 == null) {
                    return null;
                }
                String str2 = (String) list2.get(0);
                Object obj2 = list2.get(1);
                i.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                return new N(str2, (L) obj2);
            default:
                return super.f(b2, byteBuffer);
        }
    }

    @Override // p030q0.n
    public void k(m mVar, Object obj) {
        switch (this.f3127d) {
            case 1:
                if (obj instanceof L) {
                    mVar.write(129);
                    k(mVar, Integer.valueOf(((L) obj).f3121e));
                } else if (obj instanceof C0136h) {
                    mVar.write(130);
                    C0136h c0136h = (C0136h) obj;
                    k(mVar, e.P(c0136h.f3136a, Boolean.valueOf(c0136h.f3137b)));
                } else if (!(obj instanceof N)) {
                    super.k(mVar, obj);
                } else {
                    mVar.write(131);
                    N n2 = (N) obj;
                    k(mVar, e.P(n2.f3122a, n2.f3123b));
                }
                break;
            default:
                super.k(mVar, obj);
                break;
        }
    }
}
