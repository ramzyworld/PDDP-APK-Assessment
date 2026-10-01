package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class C {
    public static void a(long j2, Object obj) {
        AbstractC0070b abstractC0070b = (AbstractC0070b) ((InterfaceC0091x) j0.f1526c.h(j2, obj));
        if (abstractC0070b.f1485e) {
            abstractC0070b.f1485e = false;
        }
    }

    public static InterfaceC0091x b(long j2, Object obj) {
        InterfaceC0091x interfaceC0091x = (InterfaceC0091x) j0.f1526c.h(j2, obj);
        if (((AbstractC0070b) interfaceC0091x).f1485e) {
            return interfaceC0091x;
        }
        U u2 = (U) interfaceC0091x;
        int i2 = u2.f1464g;
        U uC = u2.c(i2 == 0 ? 10 : i2 * 2);
        j0.o(obj, j2, uC);
        return uC;
    }
}
