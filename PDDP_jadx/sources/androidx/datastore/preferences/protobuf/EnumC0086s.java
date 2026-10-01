package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF6' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0086s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC0086s f1558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC0086s f1559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC0086s[] f1560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC0086s[] f1561i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1562e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0086s EF6;

    static {
        B b2 = B.DOUBLE;
        EnumC0086s enumC0086s = new EnumC0086s("DOUBLE", 0, 0, 1, b2);
        B b3 = B.FLOAT;
        EnumC0086s enumC0086s2 = new EnumC0086s("FLOAT", 1, 1, 1, b3);
        B b4 = B.LONG;
        EnumC0086s enumC0086s3 = new EnumC0086s("INT64", 2, 2, 1, b4);
        EnumC0086s enumC0086s4 = new EnumC0086s("UINT64", 3, 3, 1, b4);
        B b5 = B.INT;
        EnumC0086s enumC0086s5 = new EnumC0086s("INT32", 4, 4, 1, b5);
        EnumC0086s enumC0086s6 = new EnumC0086s("FIXED64", 5, 5, 1, b4);
        EnumC0086s enumC0086s7 = new EnumC0086s("FIXED32", 6, 6, 1, b5);
        B b6 = B.BOOLEAN;
        EnumC0086s enumC0086s8 = new EnumC0086s("BOOL", 7, 7, 1, b6);
        B b7 = B.STRING;
        EnumC0086s enumC0086s9 = new EnumC0086s("STRING", 8, 8, 1, b7);
        B b8 = B.MESSAGE;
        EnumC0086s enumC0086s10 = new EnumC0086s("MESSAGE", 9, 9, 1, b8);
        B b9 = B.BYTE_STRING;
        EnumC0086s enumC0086s11 = new EnumC0086s("BYTES", 10, 10, 1, b9);
        EnumC0086s enumC0086s12 = new EnumC0086s("UINT32", 11, 11, 1, b5);
        B b10 = B.ENUM;
        EnumC0086s enumC0086s13 = new EnumC0086s("ENUM", 12, 12, 1, b10);
        EnumC0086s enumC0086s14 = new EnumC0086s("SFIXED32", 13, 13, 1, b5);
        EnumC0086s enumC0086s15 = new EnumC0086s("SFIXED64", 14, 14, 1, b4);
        EnumC0086s enumC0086s16 = new EnumC0086s("SINT32", 15, 15, 1, b5);
        EnumC0086s enumC0086s17 = new EnumC0086s("SINT64", 16, 16, 1, b4);
        EnumC0086s enumC0086s18 = new EnumC0086s("GROUP", 17, 17, 1, b8);
        EnumC0086s enumC0086s19 = new EnumC0086s("DOUBLE_LIST", 18, 18, 2, b2);
        EnumC0086s enumC0086s20 = new EnumC0086s("FLOAT_LIST", 19, 19, 2, b3);
        EnumC0086s enumC0086s21 = new EnumC0086s("INT64_LIST", 20, 20, 2, b4);
        EnumC0086s enumC0086s22 = new EnumC0086s("UINT64_LIST", 21, 21, 2, b4);
        EnumC0086s enumC0086s23 = new EnumC0086s("INT32_LIST", 22, 22, 2, b5);
        EnumC0086s enumC0086s24 = new EnumC0086s("FIXED64_LIST", 23, 23, 2, b4);
        EnumC0086s enumC0086s25 = new EnumC0086s("FIXED32_LIST", 24, 24, 2, b5);
        EnumC0086s enumC0086s26 = new EnumC0086s("BOOL_LIST", 25, 25, 2, b6);
        EnumC0086s enumC0086s27 = new EnumC0086s("STRING_LIST", 26, 26, 2, b7);
        EnumC0086s enumC0086s28 = new EnumC0086s("MESSAGE_LIST", 27, 27, 2, b8);
        EnumC0086s enumC0086s29 = new EnumC0086s("BYTES_LIST", 28, 28, 2, b9);
        EnumC0086s enumC0086s30 = new EnumC0086s("UINT32_LIST", 29, 29, 2, b5);
        EnumC0086s enumC0086s31 = new EnumC0086s("ENUM_LIST", 30, 30, 2, b10);
        EnumC0086s enumC0086s32 = new EnumC0086s("SFIXED32_LIST", 31, 31, 2, b5);
        EnumC0086s enumC0086s33 = new EnumC0086s("SFIXED64_LIST", 32, 32, 2, b4);
        EnumC0086s enumC0086s34 = new EnumC0086s("SINT32_LIST", 33, 33, 2, b5);
        EnumC0086s enumC0086s35 = new EnumC0086s("SINT64_LIST", 34, 34, 2, b4);
        EnumC0086s enumC0086s36 = new EnumC0086s("DOUBLE_LIST_PACKED", 35, 35, 3, b2);
        f1558f = enumC0086s36;
        EnumC0086s enumC0086s37 = new EnumC0086s("FLOAT_LIST_PACKED", 36, 36, 3, b3);
        EnumC0086s enumC0086s38 = new EnumC0086s("INT64_LIST_PACKED", 37, 37, 3, b4);
        EnumC0086s enumC0086s39 = new EnumC0086s("UINT64_LIST_PACKED", 38, 38, 3, b4);
        EnumC0086s enumC0086s40 = new EnumC0086s("INT32_LIST_PACKED", 39, 39, 3, b5);
        EnumC0086s enumC0086s41 = new EnumC0086s("FIXED64_LIST_PACKED", 40, 40, 3, b4);
        EnumC0086s enumC0086s42 = new EnumC0086s("FIXED32_LIST_PACKED", 41, 41, 3, b5);
        EnumC0086s enumC0086s43 = new EnumC0086s("BOOL_LIST_PACKED", 42, 42, 3, b6);
        EnumC0086s enumC0086s44 = new EnumC0086s("UINT32_LIST_PACKED", 43, 43, 3, b5);
        EnumC0086s enumC0086s45 = new EnumC0086s("ENUM_LIST_PACKED", 44, 44, 3, b10);
        EnumC0086s enumC0086s46 = new EnumC0086s("SFIXED32_LIST_PACKED", 45, 45, 3, b5);
        EnumC0086s enumC0086s47 = new EnumC0086s("SFIXED64_LIST_PACKED", 46, 46, 3, b4);
        EnumC0086s enumC0086s48 = new EnumC0086s("SINT32_LIST_PACKED", 47, 47, 3, b5);
        EnumC0086s enumC0086s49 = new EnumC0086s("SINT64_LIST_PACKED", 48, 48, 3, b4);
        f1559g = enumC0086s49;
        f1561i = new EnumC0086s[]{enumC0086s, enumC0086s2, enumC0086s3, enumC0086s4, enumC0086s5, enumC0086s6, enumC0086s7, enumC0086s8, enumC0086s9, enumC0086s10, enumC0086s11, enumC0086s12, enumC0086s13, enumC0086s14, enumC0086s15, enumC0086s16, enumC0086s17, enumC0086s18, enumC0086s19, enumC0086s20, enumC0086s21, enumC0086s22, enumC0086s23, enumC0086s24, enumC0086s25, enumC0086s26, enumC0086s27, enumC0086s28, enumC0086s29, enumC0086s30, enumC0086s31, enumC0086s32, enumC0086s33, enumC0086s34, enumC0086s35, enumC0086s36, enumC0086s37, enumC0086s38, enumC0086s39, enumC0086s40, enumC0086s41, enumC0086s42, enumC0086s43, enumC0086s44, enumC0086s45, enumC0086s46, enumC0086s47, enumC0086s48, enumC0086s49, new EnumC0086s("GROUP_LIST", 49, 49, 2, b8), new EnumC0086s("MAP", 50, 50, 4, B.VOID)};
        EnumC0086s[] enumC0086sArrValues = values();
        f1560h = new EnumC0086s[enumC0086sArrValues.length];
        for (EnumC0086s enumC0086s50 : enumC0086sArrValues) {
            f1560h[enumC0086s50.f1562e] = enumC0086s50;
        }
    }

    public EnumC0086s(String str, int i2, int i3, int i4, B b2) {
        super(str, i2);
        this.f1562e = i3;
        int iB = I.j.b(i4);
        if (iB == 1 || iB == 3) {
            b2.getClass();
        }
        if (i4 == 1) {
            b2.ordinal();
        }
    }

    public static EnumC0086s valueOf(String str) {
        return (EnumC0086s) Enum.valueOf(EnumC0086s.class, str);
    }

    public static EnumC0086s[] values() {
        return (EnumC0086s[]) f1561i.clone();
    }

    public final int a() {
        return this.f1562e;
    }
}
