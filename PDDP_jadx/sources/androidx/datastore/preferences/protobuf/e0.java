package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static d0 a(Object obj) {
        AbstractC0090w abstractC0090w = (AbstractC0090w) obj;
        d0 d0Var = abstractC0090w.unknownFields;
        if (d0Var != d0.f1492f) {
            return d0Var;
        }
        d0 d0Var2 = new d0(0, new int[8], new Object[8], true);
        abstractC0090w.unknownFields = d0Var2;
        return d0Var2;
    }

    public static void b(Object obj) {
        d0 d0Var = ((AbstractC0090w) obj).unknownFields;
        if (d0Var.f1497e) {
            d0Var.f1497e = false;
        }
    }

    public static boolean c(int i2, C0079k c0079k, Object obj) throws A {
        int i3 = c0079k.f1532b;
        int i4 = i3 >>> 3;
        int i5 = i3 & 7;
        AbstractC0078j abstractC0078j = c0079k.f1531a;
        if (i5 == 0) {
            c0079k.w(0);
            ((d0) obj).c(i4 << 3, Long.valueOf(abstractC0078j.n()));
            return true;
        }
        if (i5 == 1) {
            c0079k.w(1);
            ((d0) obj).c((i4 << 3) | 1, Long.valueOf(abstractC0078j.k()));
            return true;
        }
        if (i5 == 2) {
            ((d0) obj).c((i4 << 3) | 2, c0079k.e());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                return false;
            }
            if (i5 != 5) {
                throw A.b();
            }
            c0079k.w(5);
            ((d0) obj).c(5 | (i4 << 3), Integer.valueOf(abstractC0078j.j()));
            return true;
        }
        d0 d0Var = new d0(0, new int[8], new Object[8], true);
        int i6 = i4 << 3;
        int i7 = i6 | 4;
        int i8 = i2 + 1;
        if (i8 >= 100) {
            throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0079k.a() != Integer.MAX_VALUE && c(i8, c0079k, d0Var)) {
        }
        if (i7 != c0079k.f1532b) {
            throw new A("Protocol message end-group tag did not match expected tag.");
        }
        if (d0Var.f1497e) {
            d0Var.f1497e = false;
        }
        ((d0) obj).c(i6 | 3, d0Var);
        return true;
    }
}
