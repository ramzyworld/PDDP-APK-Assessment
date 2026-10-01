package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f1433a;

    public H(n0 n0Var, p0 p0Var, I.k kVar) {
        this.f1433a = new G(n0Var, p0Var, kVar);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0107  */
    /* JADX WARN: Code duplicated, block: B:41:0x0110  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    /* JADX WARN: Code duplicated, block: B:44:0x0127  */
    /* JADX WARN: Code duplicated, block: B:45:0x0139  */
    /* JADX WARN: Code duplicated, block: B:47:0x0143  */
    /* JADX WARN: Code duplicated, block: B:49:0x014c  */
    /* JADX WARN: Code duplicated, block: B:50:0x015a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0167  */
    /* JADX WARN: Code duplicated, block: B:53:0x016b  */
    /* JADX WARN: Code duplicated, block: B:55:0x017a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0183  */
    /* JADX WARN: Code duplicated, block: B:57:0x0191  */
    /* JADX WARN: Code duplicated, block: B:58:0x019b  */
    /* JADX WARN: Code duplicated, block: B:60:0x019f  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f6  */
    public static int a(G g2, Object obj, Object obj2) {
        int iO0;
        int size;
        int iM0;
        int i2;
        int iK0;
        p0 p0Var;
        int size2;
        int iM1;
        int iO1 = 1;
        int i3 = r.f1549c;
        int iK1 = C0081m.k0(1);
        o0 o0Var = r0.f1553h;
        n0 n0Var = g2.f1430a;
        if (n0Var == o0Var) {
            iK1 *= 2;
        }
        switch (n0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iO0 = 8;
                i2 = iO0 + iK1;
                iK0 = C0081m.k0(2);
                p0Var = g2.f1431b;
                if (p0Var == o0Var) {
                    iK0 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 2:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case 3:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case I.k.LONG_FIELD_NUMBER /* 4 */:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case I.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i2;
                    case I.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0081m.j0((String) obj2);
                        }
                        return iO1 + iK0 + i2;
                    case 9:
                        iO1 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        return iO1 + iK0 + i2;
                    case 10:
                        size2 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        iM1 = C0081m.m0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 11:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0081m.m0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 12:
                        iO1 = C0081m.m0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 13:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iO1 = C0081m.m0((iIntValue >> 31) ^ (iIntValue << 1));
                        return iO1 + iK0 + i2;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iO1 = C0081m.o0((jLongValue >> 63) ^ (jLongValue << 1));
                        return iO1 + iK0 + i2;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                iO0 = 4;
                i2 = iO0 + iK1;
                iK0 = C0081m.k0(2);
                p0Var = g2.f1431b;
                if (p0Var == o0Var) {
                    iK0 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 2:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case 3:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case I.k.LONG_FIELD_NUMBER /* 4 */:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case I.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i2;
                    case I.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0081m.j0((String) obj2);
                        }
                        return iO1 + iK0 + i2;
                    case 9:
                        iO1 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        return iO1 + iK0 + i2;
                    case 10:
                        size2 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        iM1 = C0081m.m0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 11:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0081m.m0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 12:
                        iO1 = C0081m.m0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 13:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iO1 = C0081m.m0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                        return iO1 + iK0 + i2;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iO1 = C0081m.o0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                        return iO1 + iK0 + i2;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 2:
                iO0 = C0081m.o0(((Long) obj).longValue());
                i2 = iO0 + iK1;
                iK0 = C0081m.k0(2);
                p0Var = g2.f1431b;
                if (p0Var == o0Var) {
                    iK0 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 2:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case 3:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case I.k.LONG_FIELD_NUMBER /* 4 */:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case I.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i2;
                    case I.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0081m.j0((String) obj2);
                        }
                        return iO1 + iK0 + i2;
                    case 9:
                        iO1 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        return iO1 + iK0 + i2;
                    case 10:
                        size2 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        iM1 = C0081m.m0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 11:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0081m.m0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 12:
                        iO1 = C0081m.m0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 13:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iO1 = C0081m.m0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                        return iO1 + iK0 + i2;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iO1 = C0081m.o0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                        return iO1 + iK0 + i2;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 3:
                iO0 = C0081m.o0(((Long) obj).longValue());
                i2 = iO0 + iK1;
                iK0 = C0081m.k0(2);
                p0Var = g2.f1431b;
                if (p0Var == o0Var) {
                    iK0 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 2:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case 3:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case I.k.LONG_FIELD_NUMBER /* 4 */:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case I.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i2;
                    case I.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0081m.j0((String) obj2);
                        }
                        return iO1 + iK0 + i2;
                    case 9:
                        iO1 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        return iO1 + iK0 + i2;
                    case 10:
                        size2 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        iM1 = C0081m.m0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 11:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0081m.m0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 12:
                        iO1 = C0081m.m0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 13:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iO1 = C0081m.m0((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                        return iO1 + iK0 + i2;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iO1 = C0081m.o0((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                        return iO1 + iK0 + i2;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case I.k.LONG_FIELD_NUMBER /* 4 */:
                iO0 = C0081m.o0(((Integer) obj).intValue());
                i2 = iO0 + iK1;
                iK0 = C0081m.k0(2);
                p0Var = g2.f1431b;
                if (p0Var == o0Var) {
                    iK0 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 2:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case 3:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case I.k.LONG_FIELD_NUMBER /* 4 */:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case I.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i2;
                    case I.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0081m.j0((String) obj2);
                        }
                        return iO1 + iK0 + i2;
                    case 9:
                        iO1 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        return iO1 + iK0 + i2;
                    case 10:
                        size2 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        iM1 = C0081m.m0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 11:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0081m.m0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 12:
                        iO1 = C0081m.m0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 13:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iO1 = C0081m.m0((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                        return iO1 + iK0 + i2;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iO1 = C0081m.o0((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                        return iO1 + iK0 + i2;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case I.k.STRING_FIELD_NUMBER /* 5 */:
                ((Long) obj).getClass();
                iO0 = 8;
                i2 = iO0 + iK1;
                iK0 = C0081m.k0(2);
                p0Var = g2.f1431b;
                if (p0Var == o0Var) {
                    iK0 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 2:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case 3:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case I.k.LONG_FIELD_NUMBER /* 4 */:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case I.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i2;
                    case I.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0081m.j0((String) obj2);
                        }
                        return iO1 + iK0 + i2;
                    case 9:
                        iO1 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        return iO1 + iK0 + i2;
                    case 10:
                        size2 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        iM1 = C0081m.m0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 11:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0081m.m0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 12:
                        iO1 = C0081m.m0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 13:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iO1 = C0081m.m0((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                        return iO1 + iK0 + i2;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iO1 = C0081m.o0((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                        return iO1 + iK0 + i2;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj).getClass();
                iO0 = 4;
                i2 = iO0 + iK1;
                iK0 = C0081m.k0(2);
                p0Var = g2.f1431b;
                if (p0Var == o0Var) {
                    iK0 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 2:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case 3:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case I.k.LONG_FIELD_NUMBER /* 4 */:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case I.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i2;
                    case I.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0081m.j0((String) obj2);
                        }
                        return iO1 + iK0 + i2;
                    case 9:
                        iO1 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        return iO1 + iK0 + i2;
                    case 10:
                        size2 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        iM1 = C0081m.m0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 11:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0081m.m0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 12:
                        iO1 = C0081m.m0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 13:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iO1 = C0081m.m0((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                        return iO1 + iK0 + i2;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iO1 = C0081m.o0((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                        return iO1 + iK0 + i2;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).getClass();
                iO0 = 1;
                i2 = iO0 + iK1;
                iK0 = C0081m.k0(2);
                p0Var = g2.f1431b;
                if (p0Var == o0Var) {
                    iK0 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 2:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case 3:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case I.k.LONG_FIELD_NUMBER /* 4 */:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case I.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i2;
                    case I.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0081m.j0((String) obj2);
                        }
                        return iO1 + iK0 + i2;
                    case 9:
                        iO1 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        return iO1 + iK0 + i2;
                    case 10:
                        size2 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        iM1 = C0081m.m0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 11:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0081m.m0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 12:
                        iO1 = C0081m.m0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 13:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iO1 = C0081m.m0((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                        return iO1 + iK0 + i2;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iO1 = C0081m.o0((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                        return iO1 + iK0 + i2;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case I.k.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof C0075g) {
                    size = ((C0075g) obj).size();
                    iM0 = C0081m.m0(size);
                    iO0 = size + iM0;
                } else {
                    iO0 = C0081m.j0((String) obj);
                }
                i2 = iO0 + iK1;
                iK0 = C0081m.k0(2);
                p0Var = g2.f1431b;
                if (p0Var == o0Var) {
                    iK0 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 2:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case 3:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case I.k.LONG_FIELD_NUMBER /* 4 */:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case I.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i2;
                    case I.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0081m.j0((String) obj2);
                        }
                        return iO1 + iK0 + i2;
                    case 9:
                        iO1 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        return iO1 + iK0 + i2;
                    case 10:
                        size2 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        iM1 = C0081m.m0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 11:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0081m.m0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 12:
                        iO1 = C0081m.m0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 13:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iO1 = C0081m.m0((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                        return iO1 + iK0 + i2;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iO1 = C0081m.o0((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                        return iO1 + iK0 + i2;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 9:
                iO0 = ((AbstractC0090w) ((AbstractC0069a) obj)).a(null);
                i2 = iO0 + iK1;
                iK0 = C0081m.k0(2);
                p0Var = g2.f1431b;
                if (p0Var == o0Var) {
                    iK0 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 2:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case 3:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case I.k.LONG_FIELD_NUMBER /* 4 */:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case I.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i2;
                    case I.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0081m.j0((String) obj2);
                        }
                        return iO1 + iK0 + i2;
                    case 9:
                        iO1 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        return iO1 + iK0 + i2;
                    case 10:
                        size2 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        iM1 = C0081m.m0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 11:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0081m.m0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 12:
                        iO1 = C0081m.m0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 13:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iO1 = C0081m.m0((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                        return iO1 + iK0 + i2;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iO1 = C0081m.o0((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                        return iO1 + iK0 + i2;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 10:
                size = ((AbstractC0090w) ((AbstractC0069a) obj)).a(null);
                iM0 = C0081m.m0(size);
                iO0 = size + iM0;
                i2 = iO0 + iK1;
                iK0 = C0081m.k0(2);
                p0Var = g2.f1431b;
                if (p0Var == o0Var) {
                    iK0 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 2:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case 3:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case I.k.LONG_FIELD_NUMBER /* 4 */:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case I.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i2;
                    case I.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0081m.j0((String) obj2);
                        }
                        return iO1 + iK0 + i2;
                    case 9:
                        iO1 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        return iO1 + iK0 + i2;
                    case 10:
                        size2 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        iM1 = C0081m.m0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 11:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0081m.m0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 12:
                        iO1 = C0081m.m0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 13:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iO1 = C0081m.m0((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                        return iO1 + iK0 + i2;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iO1 = C0081m.o0((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                        return iO1 + iK0 + i2;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 11:
                if (obj instanceof C0075g) {
                    size = ((C0075g) obj).size();
                    iM0 = C0081m.m0(size);
                } else {
                    size = ((byte[]) obj).length;
                    iM0 = C0081m.m0(size);
                }
                iO0 = size + iM0;
                i2 = iO0 + iK1;
                iK0 = C0081m.k0(2);
                p0Var = g2.f1431b;
                if (p0Var == o0Var) {
                    iK0 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 2:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case 3:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case I.k.LONG_FIELD_NUMBER /* 4 */:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case I.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i2;
                    case I.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0081m.j0((String) obj2);
                        }
                        return iO1 + iK0 + i2;
                    case 9:
                        iO1 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        return iO1 + iK0 + i2;
                    case 10:
                        size2 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        iM1 = C0081m.m0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 11:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0081m.m0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 12:
                        iO1 = C0081m.m0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 13:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iO1 = C0081m.m0((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                        return iO1 + iK0 + i2;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iO1 = C0081m.o0((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                        return iO1 + iK0 + i2;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 12:
                iO0 = C0081m.m0(((Integer) obj).intValue());
                i2 = iO0 + iK1;
                iK0 = C0081m.k0(2);
                p0Var = g2.f1431b;
                if (p0Var == o0Var) {
                    iK0 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 2:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case 3:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case I.k.LONG_FIELD_NUMBER /* 4 */:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case I.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i2;
                    case I.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0081m.j0((String) obj2);
                        }
                        return iO1 + iK0 + i2;
                    case 9:
                        iO1 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        return iO1 + iK0 + i2;
                    case 10:
                        size2 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        iM1 = C0081m.m0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 11:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0081m.m0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 12:
                        iO1 = C0081m.m0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 13:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iO1 = C0081m.m0((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                        return iO1 + iK0 + i2;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iO1 = C0081m.o0((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                        return iO1 + iK0 + i2;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 13:
                iO0 = C0081m.o0(((Integer) obj).intValue());
                i2 = iO0 + iK1;
                iK0 = C0081m.k0(2);
                p0Var = g2.f1431b;
                if (p0Var == o0Var) {
                    iK0 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 2:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case 3:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case I.k.LONG_FIELD_NUMBER /* 4 */:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case I.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i2;
                    case I.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0081m.j0((String) obj2);
                        }
                        return iO1 + iK0 + i2;
                    case 9:
                        iO1 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        return iO1 + iK0 + i2;
                    case 10:
                        size2 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        iM1 = C0081m.m0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 11:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0081m.m0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 12:
                        iO1 = C0081m.m0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 13:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iO1 = C0081m.m0((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                        return iO1 + iK0 + i2;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iO1 = C0081m.o0((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                        return iO1 + iK0 + i2;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 14:
                ((Integer) obj).getClass();
                iO0 = 4;
                i2 = iO0 + iK1;
                iK0 = C0081m.k0(2);
                p0Var = g2.f1431b;
                if (p0Var == o0Var) {
                    iK0 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 2:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case 3:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case I.k.LONG_FIELD_NUMBER /* 4 */:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case I.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i2;
                    case I.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0081m.j0((String) obj2);
                        }
                        return iO1 + iK0 + i2;
                    case 9:
                        iO1 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        return iO1 + iK0 + i2;
                    case 10:
                        size2 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        iM1 = C0081m.m0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 11:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0081m.m0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 12:
                        iO1 = C0081m.m0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 13:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iO1 = C0081m.m0((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                        return iO1 + iK0 + i2;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iO1 = C0081m.o0((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                        return iO1 + iK0 + i2;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 15:
                ((Long) obj).getClass();
                iO0 = 8;
                i2 = iO0 + iK1;
                iK0 = C0081m.k0(2);
                p0Var = g2.f1431b;
                if (p0Var == o0Var) {
                    iK0 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 2:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case 3:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case I.k.LONG_FIELD_NUMBER /* 4 */:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case I.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i2;
                    case I.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0081m.j0((String) obj2);
                        }
                        return iO1 + iK0 + i2;
                    case 9:
                        iO1 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        return iO1 + iK0 + i2;
                    case 10:
                        size2 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        iM1 = C0081m.m0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 11:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0081m.m0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 12:
                        iO1 = C0081m.m0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 13:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iO1 = C0081m.m0((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                        return iO1 + iK0 + i2;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iO1 = C0081m.o0((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                        return iO1 + iK0 + i2;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iO0 = C0081m.m0((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                i2 = iO0 + iK1;
                iK0 = C0081m.k0(2);
                p0Var = g2.f1431b;
                if (p0Var == o0Var) {
                    iK0 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 2:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case 3:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case I.k.LONG_FIELD_NUMBER /* 4 */:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case I.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i2;
                    case I.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0081m.j0((String) obj2);
                        }
                        return iO1 + iK0 + i2;
                    case 9:
                        iO1 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        return iO1 + iK0 + i2;
                    case 10:
                        size2 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        iM1 = C0081m.m0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 11:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0081m.m0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 12:
                        iO1 = C0081m.m0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 13:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iO1 = C0081m.m0((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                        return iO1 + iK0 + i2;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iO1 = C0081m.o0((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                        return iO1 + iK0 + i2;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iO0 = C0081m.o0((jLongValue18 >> 63) ^ (jLongValue18 << 1));
                i2 = iO0 + iK1;
                iK0 = C0081m.k0(2);
                p0Var = g2.f1431b;
                if (p0Var == o0Var) {
                    iK0 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 2:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case 3:
                        iO1 = C0081m.o0(((Long) obj2).longValue());
                        return iO1 + iK0 + i2;
                    case I.k.LONG_FIELD_NUMBER /* 4 */:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case I.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i2;
                    case I.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0081m.j0((String) obj2);
                        }
                        return iO1 + iK0 + i2;
                    case 9:
                        iO1 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        return iO1 + iK0 + i2;
                    case 10:
                        size2 = ((AbstractC0090w) ((AbstractC0069a) obj2)).a(null);
                        iM1 = C0081m.m0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 11:
                        if (obj2 instanceof C0075g) {
                            size2 = ((C0075g) obj2).size();
                            iM1 = C0081m.m0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0081m.m0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i2;
                    case 12:
                        iO1 = C0081m.m0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 13:
                        iO1 = C0081m.o0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i2;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iO1 = C0081m.m0((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                        return iO1 + iK0 + i2;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iO1 = C0081m.o0((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                        return iO1 + iK0 + i2;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
