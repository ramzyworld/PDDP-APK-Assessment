package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class N implements W {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f1439n = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Unsafe f1440o = j0.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f1441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f1442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0069a f1445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f1447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final P f1450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C f1451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e0 f1452l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final J f1453m;

    public N(int[] iArr, Object[] objArr, int i2, int i3, AbstractC0069a abstractC0069a, int[] iArr2, int i4, int i5, P p2, C c2, e0 e0Var, C0084p c0084p, J j2) {
        this.f1441a = iArr;
        this.f1442b = objArr;
        this.f1443c = i2;
        this.f1444d = i3;
        this.f1446f = abstractC0069a instanceof AbstractC0090w;
        this.f1447g = iArr2;
        this.f1448h = i4;
        this.f1449i = i5;
        this.f1450j = p2;
        this.f1451k = c2;
        this.f1452l = e0Var;
        this.f1445e = abstractC0069a;
        this.f1453m = j2;
    }

    public static long A(long j2, Object obj) {
        return ((Long) j0.f1526c.h(j2, obj)).longValue();
    }

    public static Field G(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int L(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0090w) {
            return ((AbstractC0090w) obj).i();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x024c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0250  */
    /* JADX WARN: Code duplicated, block: B:126:0x0268  */
    /* JADX WARN: Code duplicated, block: B:128:0x026c  */
    public static N x(V v2, P p2, C c2, e0 e0Var, C0084p c0084p, J j2) {
        int i2;
        int iCharAt;
        int iCharAt2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int iObjectFieldOffset;
        int i23;
        int i24;
        int iObjectFieldOffset2;
        Field fieldG;
        int i25;
        char cCharAt9;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field fieldG2;
        int i29;
        Object obj2;
        Field fieldG3;
        int i30;
        char cCharAt10;
        int i31;
        char cCharAt11;
        int i32;
        char cCharAt12;
        int i33;
        char cCharAt13;
        String strC = v2.c();
        int length = strC.length();
        char c3 = 55296;
        if (strC.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i2 = i34 + 1;
                if (strC.charAt(i34) < 55296) {
                    break;
                }
                i34 = i2;
            }
        } else {
            i2 = 1;
        }
        int i35 = i2 + 1;
        int iCharAt3 = strC.charAt(i2);
        if (iCharAt3 >= 55296) {
            int i36 = iCharAt3 & 8191;
            int i37 = 13;
            while (true) {
                i33 = i35 + 1;
                cCharAt13 = strC.charAt(i35);
                if (cCharAt13 < 55296) {
                    break;
                }
                i36 |= (cCharAt13 & 8191) << i37;
                i37 += 13;
                i35 = i33;
            }
            iCharAt3 = i36 | (cCharAt13 << i37);
            i35 = i33;
        }
        if (iCharAt3 == 0) {
            iArr = f1439n;
            i3 = 0;
            i5 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i4 = 0;
            i7 = 0;
            i6 = 0;
        } else {
            int i38 = i35 + 1;
            int iCharAt4 = strC.charAt(i35);
            if (iCharAt4 >= 55296) {
                int i39 = iCharAt4 & 8191;
                int i40 = 13;
                while (true) {
                    i15 = i38 + 1;
                    cCharAt8 = strC.charAt(i38);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt8 & 8191) << i40;
                    i40 += 13;
                    i38 = i15;
                }
                iCharAt4 = i39 | (cCharAt8 << i40);
                i38 = i15;
            }
            int i41 = i38 + 1;
            int iCharAt5 = strC.charAt(i38);
            if (iCharAt5 >= 55296) {
                int i42 = iCharAt5 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    cCharAt7 = strC.charAt(i41);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt7 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                iCharAt5 = i42 | (cCharAt7 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int iCharAt6 = strC.charAt(i41);
            if (iCharAt6 >= 55296) {
                int i45 = iCharAt6 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    cCharAt6 = strC.charAt(i44);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt6 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                iCharAt6 = i45 | (cCharAt6 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int iCharAt7 = strC.charAt(i44);
            if (iCharAt7 >= 55296) {
                int i48 = iCharAt7 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    cCharAt5 = strC.charAt(i47);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt5 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                iCharAt7 = i48 | (cCharAt5 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            iCharAt = strC.charAt(i47);
            if (iCharAt >= 55296) {
                int i51 = iCharAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    cCharAt4 = strC.charAt(i50);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt4 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                iCharAt = i51 | (cCharAt4 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            iCharAt2 = strC.charAt(i50);
            if (iCharAt2 >= 55296) {
                int i54 = iCharAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    cCharAt3 = strC.charAt(i53);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt3 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                iCharAt2 = i54 | (cCharAt3 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            int iCharAt8 = strC.charAt(i53);
            if (iCharAt8 >= 55296) {
                int i57 = iCharAt8 & 8191;
                int i58 = 13;
                while (true) {
                    i9 = i56 + 1;
                    cCharAt2 = strC.charAt(i56);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt2 & 8191) << i58;
                    i58 += 13;
                    i56 = i9;
                }
                iCharAt8 = i57 | (cCharAt2 << i58);
                i56 = i9;
            }
            int i59 = i56 + 1;
            int iCharAt9 = strC.charAt(i56);
            if (iCharAt9 >= 55296) {
                int i60 = iCharAt9 & 8191;
                int i61 = 13;
                while (true) {
                    i8 = i59 + 1;
                    cCharAt = strC.charAt(i59);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i60 |= (cCharAt & 8191) << i61;
                    i61 += 13;
                    i59 = i8;
                }
                iCharAt9 = i60 | (cCharAt << i61);
                i59 = i8;
            }
            int i62 = (iCharAt4 * 2) + iCharAt5;
            i3 = iCharAt4;
            i35 = i59;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i4 = iCharAt6;
            i5 = i62;
            i6 = iCharAt9;
            i7 = iCharAt7;
        }
        Unsafe unsafe = f1440o;
        Object[] objArrB = v2.b();
        Class<?> cls = v2.a().getClass();
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i63 = i6 + iCharAt2;
        int i64 = i6;
        int i65 = i63;
        int i66 = 0;
        int i67 = 0;
        while (i35 < length) {
            int i68 = i35 + 1;
            int iCharAt10 = strC.charAt(i35);
            if (iCharAt10 >= c3) {
                int i69 = iCharAt10 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i32 = i70 + 1;
                    cCharAt12 = strC.charAt(i70);
                    if (cCharAt12 < c3) {
                        break;
                    }
                    i69 |= (cCharAt12 & 8191) << i71;
                    i71 += 13;
                    i70 = i32;
                }
                iCharAt10 = i69 | (cCharAt12 << i71);
                i16 = i32;
            } else {
                i16 = i68;
            }
            int i72 = i16 + 1;
            int iCharAt11 = strC.charAt(i16);
            if (iCharAt11 >= c3) {
                int i73 = iCharAt11 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i31 = i74 + 1;
                    cCharAt11 = strC.charAt(i74);
                    i17 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i73 |= (cCharAt11 & 8191) << i75;
                    i75 += 13;
                    i74 = i31;
                    length = i17;
                }
                iCharAt11 = i73 | (cCharAt11 << i75);
                i18 = i31;
            } else {
                i17 = length;
                i18 = i72;
            }
            int i76 = iCharAt11 & 255;
            int i77 = i6;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            if (i76 >= 51) {
                int i78 = i18 + 1;
                int iCharAt12 = strC.charAt(i18);
                i19 = i66;
                char c4 = 55296;
                if (iCharAt12 >= 55296) {
                    int i79 = iCharAt12 & 8191;
                    int i80 = 13;
                    while (true) {
                        i30 = i78 + 1;
                        cCharAt10 = strC.charAt(i78);
                        if (cCharAt10 < c4) {
                            break;
                        }
                        i79 |= (cCharAt10 & 8191) << i80;
                        i80 += 13;
                        i78 = i30;
                        c4 = 55296;
                    }
                    iCharAt12 = i79 | (cCharAt10 << i80);
                    i78 = i30;
                }
                int i81 = i76 - 51;
                int i82 = i78;
                if (i81 == 9 || i81 == 17) {
                    i27 = i5 + 1;
                    objArr[((i67 / 3) * 2) + 1] = objArrB[i5];
                } else {
                    if (i81 == 12 && (I.j.a(v2.d(), 1) || (iCharAt11 & 2048) != 0)) {
                        i27 = i5 + 1;
                        objArr[((i67 / 3) * 2) + 1] = objArrB[i5];
                    }
                    i28 = iCharAt12 * 2;
                    obj = objArrB[i28];
                    if (obj instanceof Field) {
                        fieldG2 = (Field) obj;
                    } else {
                        fieldG2 = G(cls, (String) obj);
                        objArrB[i28] = fieldG2;
                    }
                    int i83 = i4;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldG2);
                    i29 = i28 + 1;
                    obj2 = objArrB[i29];
                    int i84 = i5;
                    if (obj2 instanceof Field) {
                        fieldG3 = (Field) obj2;
                    } else {
                        fieldG3 = G(cls, (String) obj2);
                        objArrB[i29] = fieldG3;
                    }
                    iObjectFieldOffset = iObjectFieldOffset3;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldG3);
                    i20 = i84;
                    i23 = i82;
                    i24 = 0;
                    i21 = i7;
                    i22 = i83;
                    objArr = objArr;
                }
                i5 = i27;
                i28 = iCharAt12 * 2;
                obj = objArrB[i28];
                if (obj instanceof Field) {
                    fieldG2 = (Field) obj;
                } else {
                    fieldG2 = G(cls, (String) obj);
                    objArrB[i28] = fieldG2;
                }
                int i85 = i4;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldG2);
                i29 = i28 + 1;
                obj2 = objArrB[i29];
                int i86 = i5;
                if (obj2 instanceof Field) {
                    fieldG3 = (Field) obj2;
                } else {
                    fieldG3 = G(cls, (String) obj2);
                    objArrB[i29] = fieldG3;
                }
                iObjectFieldOffset = iObjectFieldOffset4;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldG3);
                i20 = i86;
                i23 = i82;
                i24 = 0;
                i21 = i7;
                i22 = i85;
                objArr = objArr;
            } else {
                i19 = i66;
                int i87 = i4;
                i20 = i5 + 1;
                Field fieldG4 = G(cls, (String) objArrB[i5]);
                i21 = i7;
                if (i76 == 9 || i76 == 17) {
                    i22 = i87;
                    objArr[((i67 / 3) * 2) + 1] = fieldG4.getType();
                } else {
                    if (i76 == 27 || i76 == 49) {
                        i22 = i87;
                        i26 = i5 + 2;
                        objArr[((i67 / 3) * 2) + 1] = objArrB[i20];
                    } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                        i22 = i87;
                        if (v2.d() == 1 || (iCharAt11 & 2048) != 0) {
                            i26 = i5 + 2;
                            objArr[((i67 / 3) * 2) + 1] = objArrB[i20];
                        }
                    } else {
                        if (i76 == 50) {
                            int i88 = i64 + 1;
                            iArr[i64] = i67;
                            int i89 = (i67 / 3) * 2;
                            int i90 = i5 + 2;
                            objArr[i89] = objArrB[i20];
                            if ((iCharAt11 & 2048) != 0) {
                                i20 = i5 + 3;
                                objArr[i89 + 1] = objArrB[i90];
                                i64 = i88;
                            } else {
                                i64 = i88;
                                i20 = i90;
                            }
                        }
                        i22 = i87;
                    }
                    i20 = i26;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldG4);
                if ((iCharAt11 & 4096) == 0 || i76 > 17) {
                    i23 = i18;
                    i24 = 0;
                    iObjectFieldOffset2 = 1048575;
                } else {
                    i23 = i18 + 1;
                    int iCharAt13 = strC.charAt(i18);
                    if (iCharAt13 >= 55296) {
                        int i91 = iCharAt13 & 8191;
                        int i92 = 13;
                        while (true) {
                            i25 = i23 + 1;
                            cCharAt9 = strC.charAt(i23);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i91 |= (cCharAt9 & 8191) << i92;
                            i92 += 13;
                            i23 = i25;
                        }
                        iCharAt13 = i91 | (cCharAt9 << i92);
                        i23 = i25;
                    }
                    int i93 = (iCharAt13 / 32) + (i3 * 2);
                    Object obj3 = objArrB[i93];
                    if (obj3 instanceof Field) {
                        fieldG = (Field) obj3;
                    } else {
                        fieldG = G(cls, (String) obj3);
                        objArrB[i93] = fieldG;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldG);
                    i24 = iCharAt13 % 32;
                }
                if (i76 >= 18 && i76 <= 49) {
                    iArr[i65] = iObjectFieldOffset;
                    i65++;
                }
            }
            int i94 = i67 + 1;
            iArr2[i67] = iCharAt10;
            int i95 = i67 + 2;
            String str = strC;
            iArr2[i94] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i76 << 20) | iObjectFieldOffset;
            i67 += 3;
            iArr2[i95] = (i24 << 20) | iObjectFieldOffset2;
            i35 = i23;
            objArr = objArr;
            i6 = i77;
            i5 = i20;
            i66 = i19;
            length = i17;
            i4 = i22;
            strC = str;
            i7 = i21;
            c3 = 55296;
        }
        return new N(iArr2, objArr, i4, i7, v2.a(), iArr, i6, i63, p2, c2, e0Var, c0084p, j2);
    }

    public static long y(int i2) {
        return i2 & 1048575;
    }

    public static int z(long j2, Object obj) {
        return ((Integer) j0.f1526c.h(j2, obj)).intValue();
    }

    public final int B(int i2) {
        if (i2 < this.f1443c || i2 > this.f1444d) {
            return -1;
        }
        int[] iArr = this.f1441a;
        int length = (iArr.length / 3) - 1;
        int i3 = 0;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = iArr[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    public final void C(Object obj, long j2, C0079k c0079k, W w2, C0083o c0083o) throws C0093z {
        int iU;
        this.f1451k.getClass();
        InterfaceC0091x interfaceC0091xB = C.b(j2, obj);
        int i2 = c0079k.f1532b;
        if ((i2 & 7) != 3) {
            throw A.b();
        }
        do {
            AbstractC0090w abstractC0090wG = w2.g();
            c0079k.b(abstractC0090wG, w2, c0083o);
            w2.h(abstractC0090wG);
            ((U) interfaceC0091xB).add(abstractC0090wG);
            AbstractC0078j abstractC0078j = c0079k.f1531a;
            if (abstractC0078j.c() || c0079k.f1534d != 0) {
                return;
            } else {
                iU = abstractC0078j.u();
            }
        } while (iU == i2);
        c0079k.f1534d = iU;
    }

    public final void D(Object obj, int i2, C0079k c0079k, W w2, C0083o c0083o) throws A {
        int iU;
        this.f1451k.getClass();
        InterfaceC0091x interfaceC0091xB = C.b(i2 & 1048575, obj);
        int i3 = c0079k.f1532b;
        if ((i3 & 7) != 2) {
            throw A.b();
        }
        do {
            AbstractC0090w abstractC0090wG = w2.g();
            c0079k.c(abstractC0090wG, w2, c0083o);
            w2.h(abstractC0090wG);
            ((U) interfaceC0091xB).add(abstractC0090wG);
            AbstractC0078j abstractC0078j = c0079k.f1531a;
            if (abstractC0078j.c() || c0079k.f1534d != 0) {
                return;
            } else {
                iU = abstractC0078j.u();
            }
        } while (iU == i3);
        c0079k.f1534d = iU;
    }

    public final void E(int i2, C0079k c0079k, Object obj) throws C0093z {
        if ((536870912 & i2) != 0) {
            c0079k.w(2);
            j0.o(obj, i2 & 1048575, c0079k.f1531a.t());
        } else if (!this.f1446f) {
            j0.o(obj, i2 & 1048575, c0079k.e());
        } else {
            c0079k.w(2);
            j0.o(obj, i2 & 1048575, c0079k.f1531a.s());
        }
    }

    public final void F(int i2, C0079k c0079k, Object obj) throws C0093z {
        boolean z2 = (536870912 & i2) != 0;
        C c2 = this.f1451k;
        if (z2) {
            c2.getClass();
            c0079k.s(C.b(i2 & 1048575, obj), true);
        } else {
            c2.getClass();
            c0079k.s(C.b(i2 & 1048575, obj), false);
        }
    }

    public final void H(int i2, Object obj) {
        int i3 = this.f1441a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        j0.m(obj, j2, (1 << (i3 >>> 20)) | j0.f1526c.f(j2, obj));
    }

    public final void I(Object obj, int i2, int i3) {
        j0.m(obj, this.f1441a[i3 + 2] & 1048575, i2);
    }

    public final void J(Object obj, int i2, AbstractC0069a abstractC0069a) {
        f1440o.putObject(obj, M(i2) & 1048575, abstractC0069a);
        H(i2, obj);
    }

    public final void K(Object obj, int i2, int i3, AbstractC0069a abstractC0069a) {
        f1440o.putObject(obj, M(i3) & 1048575, abstractC0069a);
        I(obj, i2, i3);
    }

    public final int M(int i2) {
        return this.f1441a[i2 + 1];
    }

    public final void N(Object obj, F f2) throws IOException {
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.f1441a;
        int length = iArr.length;
        Unsafe unsafe = f1440o;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (i9 < length) {
            int iM = M(i9);
            int i10 = iArr[i9];
            int iL = L(iM);
            if (iL <= 17) {
                int i11 = iArr[i9 + 2];
                int i12 = i11 & i6;
                if (i12 != i7) {
                    i8 = i12 == i6 ? 0 : unsafe.getInt(obj, i12);
                    i7 = i12;
                }
                i2 = i7;
                i3 = i8;
                i4 = 1 << (i11 >>> 20);
            } else {
                i2 = i7;
                i3 = i8;
                i4 = 0;
            }
            long j2 = iM & i6;
            switch (iL) {
                case 0:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.c(i10, j0.f1526c.d(j2, obj));
                        continue;
                    }
                    i9 += 3;
                    i7 = i5;
                    i8 = i3;
                    i6 = 1048575;
                    break;
                case 1:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.g(i10, j0.f1526c.e(j2, obj));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    i7 = i5;
                    i8 = i3;
                    i6 = 1048575;
                    break;
                case 2:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.j(unsafe.getLong(obj, j2), i10);
                    } else {
                        continue;
                    }
                    i9 += 3;
                    i7 = i5;
                    i8 = i3;
                    i6 = 1048575;
                    break;
                case 3:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.q(unsafe.getLong(obj, j2), i10);
                    } else {
                        continue;
                    }
                    i9 += 3;
                    i7 = i5;
                    i8 = i3;
                    i6 = 1048575;
                    break;
                case I.k.LONG_FIELD_NUMBER /* 4 */:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.i(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    i7 = i5;
                    i8 = i3;
                    i6 = 1048575;
                    break;
                case I.k.STRING_FIELD_NUMBER /* 5 */:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.f(unsafe.getLong(obj, j2), i10);
                    } else {
                        continue;
                    }
                    i9 += 3;
                    i7 = i5;
                    i8 = i3;
                    i6 = 1048575;
                    break;
                case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.e(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    i7 = i5;
                    i8 = i3;
                    i6 = 1048575;
                    break;
                case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.a(i10, j0.f1526c.c(j2, obj));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    i7 = i5;
                    i8 = i3;
                    i6 = 1048575;
                    break;
                case I.k.BYTES_FIELD_NUMBER /* 8 */:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            ((C0081m) f2.f1429a).C0((String) object, i10);
                        } else {
                            f2.b(i10, (C0075g) object);
                        }
                    } else {
                        continue;
                    }
                    i9 += 3;
                    i7 = i5;
                    i8 = i3;
                    i6 = 1048575;
                    break;
                case 9:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.k(i10, unsafe.getObject(obj, j2), m(i9));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    i7 = i5;
                    i8 = i3;
                    i6 = 1048575;
                    break;
                case 10:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.b(i10, (C0075g) unsafe.getObject(obj, j2));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    i7 = i5;
                    i8 = i3;
                    i6 = 1048575;
                    break;
                case 11:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.p(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    i7 = i5;
                    i8 = i3;
                    i6 = 1048575;
                    break;
                case 12:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.d(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    i7 = i5;
                    i8 = i3;
                    i6 = 1048575;
                    break;
                case 13:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.l(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    i7 = i5;
                    i8 = i3;
                    i6 = 1048575;
                    break;
                case 14:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.m(unsafe.getLong(obj, j2), i10);
                    } else {
                        continue;
                    }
                    i9 += 3;
                    i7 = i5;
                    i8 = i3;
                    i6 = 1048575;
                    break;
                case 15:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.n(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    i7 = i5;
                    i8 = i3;
                    i6 = 1048575;
                    break;
                case 16:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.o(unsafe.getLong(obj, j2), i10);
                    } else {
                        continue;
                    }
                    i9 += 3;
                    i7 = i5;
                    i8 = i3;
                    i6 = 1048575;
                    break;
                case 17:
                    i5 = i2;
                    if (o(obj, i9, i2, i3, i4)) {
                        f2.h(i10, unsafe.getObject(obj, j2), m(i9));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    i7 = i5;
                    i8 = i3;
                    i6 = 1048575;
                    break;
                case 18:
                    X.E(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 19:
                    X.I(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 20:
                    X.L(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 21:
                    X.T(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 22:
                    X.K(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 23:
                    X.H(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 24:
                    X.G(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 25:
                    X.C(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 26:
                    X.R(iArr[i9], (List) unsafe.getObject(obj, j2), f2);
                    break;
                case 27:
                    X.M(iArr[i9], (List) unsafe.getObject(obj, j2), f2, m(i9));
                    break;
                case 28:
                    X.D(iArr[i9], (List) unsafe.getObject(obj, j2), f2);
                    break;
                case 29:
                    X.S(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 30:
                    X.F(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 31:
                    X.N(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 32:
                    X.O(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 33:
                    X.P(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 34:
                    X.Q(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 35:
                    X.E(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 36:
                    X.I(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 37:
                    X.L(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 38:
                    X.T(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 39:
                    X.K(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 40:
                    X.H(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 41:
                    X.G(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 42:
                    X.C(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 43:
                    X.S(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 44:
                    X.F(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 45:
                    X.N(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 46:
                    X.O(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 47:
                    X.P(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 48:
                    X.Q(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 49:
                    X.J(iArr[i9], (List) unsafe.getObject(obj, j2), f2, m(i9));
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j2);
                    if (object2 != null) {
                        int i13 = 2;
                        Object obj2 = this.f1442b[(i9 / 3) * 2];
                        this.f1453m.getClass();
                        G g2 = ((H) obj2).f1433a;
                        C0081m c0081m = (C0081m) f2.f1429a;
                        c0081m.getClass();
                        for (Map.Entry entry : ((I) object2).entrySet()) {
                            c0081m.E0(i10, i13);
                            c0081m.G0(H.a(g2, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            r.b(c0081m, g2.f1430a, 1, key);
                            r.b(c0081m, g2.f1431b, 2, value);
                            i13 = 2;
                        }
                    }
                    break;
                case 51:
                    if (q(obj, i10, i9)) {
                        f2.c(i10, ((Double) j0.f1526c.h(j2, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (q(obj, i10, i9)) {
                        f2.g(i10, ((Float) j0.f1526c.h(j2, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (q(obj, i10, i9)) {
                        f2.j(A(j2, obj), i10);
                    }
                    break;
                case 54:
                    if (q(obj, i10, i9)) {
                        f2.q(A(j2, obj), i10);
                    }
                    break;
                case 55:
                    if (q(obj, i10, i9)) {
                        f2.i(i10, z(j2, obj));
                    }
                    break;
                case 56:
                    if (q(obj, i10, i9)) {
                        f2.f(A(j2, obj), i10);
                    }
                    break;
                case 57:
                    if (q(obj, i10, i9)) {
                        f2.e(i10, z(j2, obj));
                    }
                    break;
                case 58:
                    if (q(obj, i10, i9)) {
                        f2.a(i10, ((Boolean) j0.f1526c.h(j2, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (q(obj, i10, i9)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            ((C0081m) f2.f1429a).C0((String) object3, i10);
                        } else {
                            f2.b(i10, (C0075g) object3);
                        }
                    }
                    break;
                case 60:
                    if (q(obj, i10, i9)) {
                        f2.k(i10, unsafe.getObject(obj, j2), m(i9));
                    }
                    break;
                case 61:
                    if (q(obj, i10, i9)) {
                        f2.b(i10, (C0075g) unsafe.getObject(obj, j2));
                    }
                    break;
                case 62:
                    if (q(obj, i10, i9)) {
                        f2.p(i10, z(j2, obj));
                    }
                    break;
                case 63:
                    if (q(obj, i10, i9)) {
                        f2.d(i10, z(j2, obj));
                    }
                    break;
                case 64:
                    if (q(obj, i10, i9)) {
                        f2.l(i10, z(j2, obj));
                    }
                    break;
                case 65:
                    if (q(obj, i10, i9)) {
                        f2.m(A(j2, obj), i10);
                    }
                    break;
                case 66:
                    if (q(obj, i10, i9)) {
                        f2.n(i10, z(j2, obj));
                    }
                    break;
                case 67:
                    if (q(obj, i10, i9)) {
                        f2.o(A(j2, obj), i10);
                    }
                    break;
                case 68:
                    if (q(obj, i10, i9)) {
                        f2.h(i10, unsafe.getObject(obj, j2), m(i9));
                    }
                    break;
            }
            i5 = i2;
            i9 += 3;
            i7 = i5;
            i8 = i3;
            i6 = 1048575;
        }
        this.f1452l.getClass();
        ((AbstractC0090w) obj).unknownFields.d(f2);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:60:0x0107 A[LOOP:2: B:55:0x00f6->B:60:0x0107, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x012d A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean a(Object obj) {
        int i2;
        int i3;
        List list;
        W wM;
        int i4;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < this.f1448h) {
            int i8 = this.f1447g[i7];
            int[] iArr = this.f1441a;
            int i9 = iArr[i8];
            int iM = M(i8);
            int i10 = iArr[i8 + 2];
            int i11 = i10 & 1048575;
            int i12 = 1 << (i10 >>> 20);
            if (i11 != i5) {
                if (i11 != 1048575) {
                    i6 = f1440o.getInt(obj, i11);
                }
                i3 = i6;
                i2 = i11;
            } else {
                i2 = i5;
                i3 = i6;
            }
            if ((268435456 & iM) != 0 && !o(obj, i8, i2, i3, i12)) {
                return false;
            }
            int iL = L(iM);
            if (iL == 9 || iL == 17) {
                if (o(obj, i8, i2, i3, i12)) {
                    if (!m(i8).a(j0.f1526c.h(iM & 1048575, obj))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iL == 27) {
                list = (List) j0.f1526c.h(iM & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    wM = m(i8);
                    for (i4 = 0; i4 < list.size(); i4++) {
                        if (!wM.a(list.get(i4))) {
                            return false;
                        }
                    }
                }
            } else if (iL == 60 || iL == 68) {
                if (q(obj, i9, i8)) {
                    if (!m(i8).a(j0.f1526c.h(iM & 1048575, obj))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iL == 49) {
                list = (List) j0.f1526c.h(iM & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    wM = m(i8);
                    while (i4 < list.size()) {
                        if (!wM.a(list.get(i4))) {
                            return false;
                        }
                    }
                }
            } else if (iL != 50) {
                continue;
            } else {
                Object objH = j0.f1526c.h(iM & 1048575, obj);
                this.f1453m.getClass();
                I i13 = (I) objH;
                if (i13.isEmpty()) {
                    continue;
                } else {
                    if (((H) this.f1442b[(i8 / 3) * 2]).f1433a.f1431b.f1556e != s0.MESSAGE) {
                        continue;
                    } else {
                        W wA = null;
                        for (Object obj2 : i13.values()) {
                            if (wA == null) {
                                wA = T.f1459c.a(obj2.getClass());
                            }
                            if (!wA.a(obj2)) {
                                return false;
                            }
                        }
                    }
                }
            }
            i7++;
            i5 = i2;
            i6 = i3;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void b(Object obj, C0079k c0079k, C0083o c0083o) throws Throwable {
        c0083o.getClass();
        if (p(obj)) {
            r(this.f1452l, obj, c0079k, c0083o);
        } else {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void c(Object obj, Object obj2) {
        if (!p(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.f1441a;
            if (i2 >= iArr.length) {
                X.A(this.f1452l, obj, obj2);
                return;
            }
            int iM = M(i2);
            long j2 = 1048575 & iM;
            int i3 = iArr[i2];
            switch (L(iM)) {
                case 0:
                    if (n(i2, obj2)) {
                        i0 i0Var = j0.f1526c;
                        i0Var.l(obj, j2, i0Var.d(j2, obj2));
                        H(i2, obj);
                    }
                    break;
                case 1:
                    if (n(i2, obj2)) {
                        i0 i0Var2 = j0.f1526c;
                        i0Var2.m(obj, j2, i0Var2.e(j2, obj2));
                        H(i2, obj);
                    }
                    break;
                case 2:
                    if (n(i2, obj2)) {
                        j0.n(obj, j2, j0.f1526c.g(j2, obj2));
                        H(i2, obj);
                    }
                    break;
                case 3:
                    if (n(i2, obj2)) {
                        j0.n(obj, j2, j0.f1526c.g(j2, obj2));
                        H(i2, obj);
                    }
                    break;
                case I.k.LONG_FIELD_NUMBER /* 4 */:
                    if (n(i2, obj2)) {
                        j0.m(obj, j2, j0.f1526c.f(j2, obj2));
                        H(i2, obj);
                    }
                    break;
                case I.k.STRING_FIELD_NUMBER /* 5 */:
                    if (n(i2, obj2)) {
                        j0.n(obj, j2, j0.f1526c.g(j2, obj2));
                        H(i2, obj);
                    }
                    break;
                case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (n(i2, obj2)) {
                        j0.m(obj, j2, j0.f1526c.f(j2, obj2));
                        H(i2, obj);
                    }
                    break;
                case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (n(i2, obj2)) {
                        i0 i0Var3 = j0.f1526c;
                        i0Var3.j(obj, j2, i0Var3.c(j2, obj2));
                        H(i2, obj);
                    }
                    break;
                case I.k.BYTES_FIELD_NUMBER /* 8 */:
                    if (n(i2, obj2)) {
                        j0.o(obj, j2, j0.f1526c.h(j2, obj2));
                        H(i2, obj);
                    }
                    break;
                case 9:
                    t(i2, obj, obj2);
                    break;
                case 10:
                    if (n(i2, obj2)) {
                        j0.o(obj, j2, j0.f1526c.h(j2, obj2));
                        H(i2, obj);
                    }
                    break;
                case 11:
                    if (n(i2, obj2)) {
                        j0.m(obj, j2, j0.f1526c.f(j2, obj2));
                        H(i2, obj);
                    }
                    break;
                case 12:
                    if (n(i2, obj2)) {
                        j0.m(obj, j2, j0.f1526c.f(j2, obj2));
                        H(i2, obj);
                    }
                    break;
                case 13:
                    if (n(i2, obj2)) {
                        j0.m(obj, j2, j0.f1526c.f(j2, obj2));
                        H(i2, obj);
                    }
                    break;
                case 14:
                    if (n(i2, obj2)) {
                        j0.n(obj, j2, j0.f1526c.g(j2, obj2));
                        H(i2, obj);
                    }
                    break;
                case 15:
                    if (n(i2, obj2)) {
                        j0.m(obj, j2, j0.f1526c.f(j2, obj2));
                        H(i2, obj);
                    }
                    break;
                case 16:
                    if (n(i2, obj2)) {
                        j0.n(obj, j2, j0.f1526c.g(j2, obj2));
                        H(i2, obj);
                    }
                    break;
                case 17:
                    t(i2, obj, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f1451k.getClass();
                    i0 i0Var4 = j0.f1526c;
                    InterfaceC0091x interfaceC0091xC = (InterfaceC0091x) i0Var4.h(j2, obj);
                    InterfaceC0091x interfaceC0091x = (InterfaceC0091x) i0Var4.h(j2, obj2);
                    U u2 = (U) interfaceC0091xC;
                    int i4 = u2.f1464g;
                    int i5 = ((U) interfaceC0091x).f1464g;
                    if (i4 > 0 && i5 > 0) {
                        if (!((AbstractC0070b) interfaceC0091xC).f1485e) {
                            interfaceC0091xC = u2.c(i5 + i4);
                        }
                        ((AbstractC0070b) interfaceC0091xC).addAll(interfaceC0091x);
                    }
                    if (i4 > 0) {
                        interfaceC0091x = interfaceC0091xC;
                    }
                    j0.o(obj, j2, interfaceC0091x);
                    break;
                case 50:
                    Class cls = X.f1469a;
                    i0 i0Var5 = j0.f1526c;
                    Object objH = i0Var5.h(j2, obj);
                    Object objH2 = i0Var5.h(j2, obj2);
                    this.f1453m.getClass();
                    j0.o(obj, j2, J.b(objH, objH2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (q(obj2, i3, i2)) {
                        j0.o(obj, j2, j0.f1526c.h(j2, obj2));
                        I(obj, i3, i2);
                    }
                    break;
                case 60:
                    u(i2, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(obj2, i3, i2)) {
                        j0.o(obj, j2, j0.f1526c.h(j2, obj2));
                        I(obj, i3, i2);
                    }
                    break;
                case 68:
                    u(i2, obj, obj2);
                    break;
            }
            i2 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void d(Object obj, F f2) throws IOException {
        f2.getClass();
        N(obj, f2);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0217, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.W
    public final int e(AbstractC0090w abstractC0090w) {
        int i2;
        int iB;
        int i3;
        int[] iArr = this.f1441a;
        int length = iArr.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int iM = M(i5);
            int i6 = iArr[i5];
            long j2 = 1048575 & iM;
            int i7 = 1237;
            int iHashCode = 37;
            switch (L(iM)) {
                case 0:
                    i2 = i4 * 53;
                    iB = AbstractC0092y.b(Double.doubleToLongBits(j0.f1526c.d(j2, abstractC0090w)));
                    i4 = iB + i2;
                    break;
                case 1:
                    i2 = i4 * 53;
                    iB = Float.floatToIntBits(j0.f1526c.e(j2, abstractC0090w));
                    i4 = iB + i2;
                    break;
                case 2:
                    i2 = i4 * 53;
                    iB = AbstractC0092y.b(j0.f1526c.g(j2, abstractC0090w));
                    i4 = iB + i2;
                    break;
                case 3:
                    i2 = i4 * 53;
                    iB = AbstractC0092y.b(j0.f1526c.g(j2, abstractC0090w));
                    i4 = iB + i2;
                    break;
                case I.k.LONG_FIELD_NUMBER /* 4 */:
                    i2 = i4 * 53;
                    iB = j0.f1526c.f(j2, abstractC0090w);
                    i4 = iB + i2;
                    break;
                case I.k.STRING_FIELD_NUMBER /* 5 */:
                    i2 = i4 * 53;
                    iB = AbstractC0092y.b(j0.f1526c.g(j2, abstractC0090w));
                    i4 = iB + i2;
                    break;
                case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    i2 = i4 * 53;
                    iB = j0.f1526c.f(j2, abstractC0090w);
                    i4 = iB + i2;
                    break;
                case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    i3 = i4 * 53;
                    boolean zC = j0.f1526c.c(j2, abstractC0090w);
                    Charset charset = AbstractC0092y.f1577a;
                    if (zC) {
                        i7 = 1231;
                    }
                    i4 = i7 + i3;
                    break;
                case I.k.BYTES_FIELD_NUMBER /* 8 */:
                    i2 = i4 * 53;
                    iB = ((String) j0.f1526c.h(j2, abstractC0090w)).hashCode();
                    i4 = iB + i2;
                    break;
                case 9:
                    Object objH = j0.f1526c.h(j2, abstractC0090w);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i4 = (i4 * 53) + iHashCode;
                    break;
                case 10:
                    i2 = i4 * 53;
                    iB = j0.f1526c.h(j2, abstractC0090w).hashCode();
                    i4 = iB + i2;
                    break;
                case 11:
                    i2 = i4 * 53;
                    iB = j0.f1526c.f(j2, abstractC0090w);
                    i4 = iB + i2;
                    break;
                case 12:
                    i2 = i4 * 53;
                    iB = j0.f1526c.f(j2, abstractC0090w);
                    i4 = iB + i2;
                    break;
                case 13:
                    i2 = i4 * 53;
                    iB = j0.f1526c.f(j2, abstractC0090w);
                    i4 = iB + i2;
                    break;
                case 14:
                    i2 = i4 * 53;
                    iB = AbstractC0092y.b(j0.f1526c.g(j2, abstractC0090w));
                    i4 = iB + i2;
                    break;
                case 15:
                    i2 = i4 * 53;
                    iB = j0.f1526c.f(j2, abstractC0090w);
                    i4 = iB + i2;
                    break;
                case 16:
                    i2 = i4 * 53;
                    iB = AbstractC0092y.b(j0.f1526c.g(j2, abstractC0090w));
                    i4 = iB + i2;
                    break;
                case 17:
                    Object objH2 = j0.f1526c.h(j2, abstractC0090w);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
                    }
                    i4 = (i4 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i4 * 53;
                    iB = j0.f1526c.h(j2, abstractC0090w).hashCode();
                    i4 = iB + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    iB = j0.f1526c.h(j2, abstractC0090w).hashCode();
                    i4 = iB + i2;
                    break;
                case 51:
                    if (q(abstractC0090w, i6, i5)) {
                        i2 = i4 * 53;
                        iB = AbstractC0092y.b(Double.doubleToLongBits(((Double) j0.f1526c.h(j2, abstractC0090w)).doubleValue()));
                        i4 = iB + i2;
                    }
                    break;
                case 52:
                    if (q(abstractC0090w, i6, i5)) {
                        i2 = i4 * 53;
                        iB = Float.floatToIntBits(((Float) j0.f1526c.h(j2, abstractC0090w)).floatValue());
                        i4 = iB + i2;
                    }
                    break;
                case 53:
                    if (q(abstractC0090w, i6, i5)) {
                        i2 = i4 * 53;
                        iB = AbstractC0092y.b(A(j2, abstractC0090w));
                        i4 = iB + i2;
                    }
                    break;
                case 54:
                    if (q(abstractC0090w, i6, i5)) {
                        i2 = i4 * 53;
                        iB = AbstractC0092y.b(A(j2, abstractC0090w));
                        i4 = iB + i2;
                    }
                    break;
                case 55:
                    if (q(abstractC0090w, i6, i5)) {
                        i2 = i4 * 53;
                        iB = z(j2, abstractC0090w);
                        i4 = iB + i2;
                    }
                    break;
                case 56:
                    if (q(abstractC0090w, i6, i5)) {
                        i2 = i4 * 53;
                        iB = AbstractC0092y.b(A(j2, abstractC0090w));
                        i4 = iB + i2;
                    }
                    break;
                case 57:
                    if (q(abstractC0090w, i6, i5)) {
                        i2 = i4 * 53;
                        iB = z(j2, abstractC0090w);
                        i4 = iB + i2;
                    }
                    break;
                case 58:
                    if (q(abstractC0090w, i6, i5)) {
                        i3 = i4 * 53;
                        boolean zBooleanValue = ((Boolean) j0.f1526c.h(j2, abstractC0090w)).booleanValue();
                        Charset charset2 = AbstractC0092y.f1577a;
                        if (zBooleanValue) {
                            i7 = 1231;
                        }
                        i4 = i7 + i3;
                    }
                    break;
                case 59:
                    if (q(abstractC0090w, i6, i5)) {
                        i2 = i4 * 53;
                        iB = ((String) j0.f1526c.h(j2, abstractC0090w)).hashCode();
                        i4 = iB + i2;
                    }
                    break;
                case 60:
                    if (q(abstractC0090w, i6, i5)) {
                        i2 = i4 * 53;
                        iB = j0.f1526c.h(j2, abstractC0090w).hashCode();
                        i4 = iB + i2;
                    }
                    break;
                case 61:
                    if (q(abstractC0090w, i6, i5)) {
                        i2 = i4 * 53;
                        iB = j0.f1526c.h(j2, abstractC0090w).hashCode();
                        i4 = iB + i2;
                    }
                    break;
                case 62:
                    if (q(abstractC0090w, i6, i5)) {
                        i2 = i4 * 53;
                        iB = z(j2, abstractC0090w);
                        i4 = iB + i2;
                    }
                    break;
                case 63:
                    if (q(abstractC0090w, i6, i5)) {
                        i2 = i4 * 53;
                        iB = z(j2, abstractC0090w);
                        i4 = iB + i2;
                    }
                    break;
                case 64:
                    if (q(abstractC0090w, i6, i5)) {
                        i2 = i4 * 53;
                        iB = z(j2, abstractC0090w);
                        i4 = iB + i2;
                    }
                    break;
                case 65:
                    if (q(abstractC0090w, i6, i5)) {
                        i2 = i4 * 53;
                        iB = AbstractC0092y.b(A(j2, abstractC0090w));
                        i4 = iB + i2;
                    }
                    break;
                case 66:
                    if (q(abstractC0090w, i6, i5)) {
                        i2 = i4 * 53;
                        iB = z(j2, abstractC0090w);
                        i4 = iB + i2;
                    }
                    break;
                case 67:
                    if (q(abstractC0090w, i6, i5)) {
                        i2 = i4 * 53;
                        iB = AbstractC0092y.b(A(j2, abstractC0090w));
                        i4 = iB + i2;
                    }
                    break;
                case 68:
                    if (q(abstractC0090w, i6, i5)) {
                        i2 = i4 * 53;
                        iB = j0.f1526c.h(j2, abstractC0090w).hashCode();
                        i4 = iB + i2;
                    }
                    break;
            }
        }
        this.f1452l.getClass();
        return abstractC0090w.unknownFields.hashCode() + (i4 * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int f(AbstractC0090w abstractC0090w) {
        int i2;
        int i3;
        int i4;
        int iW;
        int iV;
        int i5;
        int iK0;
        int iM0;
        Unsafe unsafe = f1440o;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f1441a;
            if (i9 >= iArr.length) {
                this.f1452l.getClass();
                return abstractC0090w.unknownFields.b() + i10;
            }
            int iM = M(i9);
            int iL = L(iM);
            int i11 = iArr[i9];
            int i12 = iArr[i9 + 2];
            int i13 = i12 & i6;
            if (iL <= 17) {
                if (i13 != i7) {
                    i8 = i13 == i6 ? 0 : unsafe.getInt(abstractC0090w, i13);
                    i7 = i13;
                }
                i2 = i7;
                i3 = i8;
                i4 = 1 << (i12 >>> 20);
            } else {
                i2 = i7;
                i3 = i8;
                i4 = 0;
            }
            long j2 = iM & i6;
            if (iL >= EnumC0086s.f1558f.a()) {
                EnumC0086s.f1559g.a();
            }
            switch (iL) {
                case 0:
                    if (o(abstractC0090w, i9, i2, i3, i4)) {
                        iW = C0081m.W(i11);
                        i10 += iW;
                    }
                    break;
                case 1:
                    if (o(abstractC0090w, i9, i2, i3, i4)) {
                        iW = C0081m.a0(i11);
                        i10 += iW;
                    }
                    break;
                case 2:
                    if (o(abstractC0090w, i9, i2, i3, i4)) {
                        iW = C0081m.d0(unsafe.getLong(abstractC0090w, j2), i11);
                        i10 += iW;
                    }
                    break;
                case 3:
                    if (o(abstractC0090w, i9, i2, i3, i4)) {
                        iW = C0081m.n0(unsafe.getLong(abstractC0090w, j2), i11);
                        i10 += iW;
                    }
                    break;
                case I.k.LONG_FIELD_NUMBER /* 4 */:
                    if (o(abstractC0090w, i9, i2, i3, i4)) {
                        iW = C0081m.c0(i11, unsafe.getInt(abstractC0090w, j2));
                        i10 += iW;
                    }
                    break;
                case I.k.STRING_FIELD_NUMBER /* 5 */:
                    if (o(abstractC0090w, i9, i2, i3, i4)) {
                        iW = C0081m.Z(i11);
                        i10 += iW;
                    }
                    break;
                case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (o(abstractC0090w, i9, i2, i3, i4)) {
                        iW = C0081m.Y(i11);
                        i10 += iW;
                    }
                    break;
                case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (o(abstractC0090w, i9, i2, i3, i4)) {
                        iW = C0081m.U(i11);
                        i10 += iW;
                    }
                    break;
                case I.k.BYTES_FIELD_NUMBER /* 8 */:
                    if (o(abstractC0090w, i9, i2, i3, i4)) {
                        Object object = unsafe.getObject(abstractC0090w, j2);
                        iV = object instanceof C0075g ? C0081m.V(i11, (C0075g) object) : C0081m.i0((String) object, i11);
                        i10 = iV + i10;
                    }
                    break;
                case 9:
                    if (o(abstractC0090w, i9, i2, i3, i4)) {
                        iW = X.o(i11, unsafe.getObject(abstractC0090w, j2), m(i9));
                        i10 += iW;
                    }
                    break;
                case 10:
                    if (o(abstractC0090w, i9, i2, i3, i4)) {
                        iW = C0081m.V(i11, (C0075g) unsafe.getObject(abstractC0090w, j2));
                        i10 += iW;
                    }
                    break;
                case 11:
                    if (o(abstractC0090w, i9, i2, i3, i4)) {
                        iW = C0081m.l0(i11, unsafe.getInt(abstractC0090w, j2));
                        i10 += iW;
                    }
                    break;
                case 12:
                    if (o(abstractC0090w, i9, i2, i3, i4)) {
                        iW = C0081m.X(i11, unsafe.getInt(abstractC0090w, j2));
                        i10 += iW;
                    }
                    break;
                case 13:
                    if (o(abstractC0090w, i9, i2, i3, i4)) {
                        iW = C0081m.e0(i11);
                        i10 += iW;
                    }
                    break;
                case 14:
                    if (o(abstractC0090w, i9, i2, i3, i4)) {
                        iW = C0081m.f0(i11);
                        i10 += iW;
                    }
                    break;
                case 15:
                    if (o(abstractC0090w, i9, i2, i3, i4)) {
                        iW = C0081m.g0(i11, unsafe.getInt(abstractC0090w, j2));
                        i10 += iW;
                    }
                    break;
                case 16:
                    if (o(abstractC0090w, i9, i2, i3, i4)) {
                        iW = C0081m.h0(unsafe.getLong(abstractC0090w, j2), i11);
                        i10 += iW;
                    }
                    break;
                case 17:
                    if (o(abstractC0090w, i9, i2, i3, i4)) {
                        iW = C0081m.b0(i11, (AbstractC0069a) unsafe.getObject(abstractC0090w, j2), m(i9));
                        i10 += iW;
                    }
                    break;
                case 18:
                    iW = X.h(i11, (List) unsafe.getObject(abstractC0090w, j2));
                    i10 += iW;
                    break;
                case 19:
                    iW = X.f(i11, (List) unsafe.getObject(abstractC0090w, j2));
                    i10 += iW;
                    break;
                case 20:
                    iW = X.m(i11, (List) unsafe.getObject(abstractC0090w, j2));
                    i10 += iW;
                    break;
                case 21:
                    iW = X.x(i11, (List) unsafe.getObject(abstractC0090w, j2));
                    i10 += iW;
                    break;
                case 22:
                    iW = X.k(i11, (List) unsafe.getObject(abstractC0090w, j2));
                    i10 += iW;
                    break;
                case 23:
                    iW = X.h(i11, (List) unsafe.getObject(abstractC0090w, j2));
                    i10 += iW;
                    break;
                case 24:
                    iW = X.f(i11, (List) unsafe.getObject(abstractC0090w, j2));
                    i10 += iW;
                    break;
                case 25:
                    iW = X.a(i11, (List) unsafe.getObject(abstractC0090w, j2));
                    i10 += iW;
                    break;
                case 26:
                    iW = X.u(i11, (List) unsafe.getObject(abstractC0090w, j2));
                    i10 += iW;
                    break;
                case 27:
                    iW = X.p(i11, (List) unsafe.getObject(abstractC0090w, j2), m(i9));
                    i10 += iW;
                    break;
                case 28:
                    iW = X.c(i11, (List) unsafe.getObject(abstractC0090w, j2));
                    i10 += iW;
                    break;
                case 29:
                    iW = X.v(i11, (List) unsafe.getObject(abstractC0090w, j2));
                    i10 += iW;
                    break;
                case 30:
                    iW = X.d(i11, (List) unsafe.getObject(abstractC0090w, j2));
                    i10 += iW;
                    break;
                case 31:
                    iW = X.f(i11, (List) unsafe.getObject(abstractC0090w, j2));
                    i10 += iW;
                    break;
                case 32:
                    iW = X.h(i11, (List) unsafe.getObject(abstractC0090w, j2));
                    i10 += iW;
                    break;
                case 33:
                    iW = X.q(i11, (List) unsafe.getObject(abstractC0090w, j2));
                    i10 += iW;
                    break;
                case 34:
                    iW = X.s(i11, (List) unsafe.getObject(abstractC0090w, j2));
                    i10 += iW;
                    break;
                case 35:
                    i5 = X.i((List) unsafe.getObject(abstractC0090w, j2));
                    if (i5 > 0) {
                        iK0 = C0081m.k0(i11);
                        iM0 = C0081m.m0(i5);
                        i10 += iM0 + iK0 + i5;
                    }
                    break;
                case 36:
                    i5 = X.g((List) unsafe.getObject(abstractC0090w, j2));
                    if (i5 > 0) {
                        iK0 = C0081m.k0(i11);
                        iM0 = C0081m.m0(i5);
                        i10 += iM0 + iK0 + i5;
                    }
                    break;
                case 37:
                    i5 = X.n((List) unsafe.getObject(abstractC0090w, j2));
                    if (i5 > 0) {
                        iK0 = C0081m.k0(i11);
                        iM0 = C0081m.m0(i5);
                        i10 += iM0 + iK0 + i5;
                    }
                    break;
                case 38:
                    i5 = X.y((List) unsafe.getObject(abstractC0090w, j2));
                    if (i5 > 0) {
                        iK0 = C0081m.k0(i11);
                        iM0 = C0081m.m0(i5);
                        i10 += iM0 + iK0 + i5;
                    }
                    break;
                case 39:
                    i5 = X.l((List) unsafe.getObject(abstractC0090w, j2));
                    if (i5 > 0) {
                        iK0 = C0081m.k0(i11);
                        iM0 = C0081m.m0(i5);
                        i10 += iM0 + iK0 + i5;
                    }
                    break;
                case 40:
                    i5 = X.i((List) unsafe.getObject(abstractC0090w, j2));
                    if (i5 > 0) {
                        iK0 = C0081m.k0(i11);
                        iM0 = C0081m.m0(i5);
                        i10 += iM0 + iK0 + i5;
                    }
                    break;
                case 41:
                    i5 = X.g((List) unsafe.getObject(abstractC0090w, j2));
                    if (i5 > 0) {
                        iK0 = C0081m.k0(i11);
                        iM0 = C0081m.m0(i5);
                        i10 += iM0 + iK0 + i5;
                    }
                    break;
                case 42:
                    i5 = X.b((List) unsafe.getObject(abstractC0090w, j2));
                    if (i5 > 0) {
                        iK0 = C0081m.k0(i11);
                        iM0 = C0081m.m0(i5);
                        i10 += iM0 + iK0 + i5;
                    }
                    break;
                case 43:
                    i5 = X.w((List) unsafe.getObject(abstractC0090w, j2));
                    if (i5 > 0) {
                        iK0 = C0081m.k0(i11);
                        iM0 = C0081m.m0(i5);
                        i10 += iM0 + iK0 + i5;
                    }
                    break;
                case 44:
                    i5 = X.e((List) unsafe.getObject(abstractC0090w, j2));
                    if (i5 > 0) {
                        iK0 = C0081m.k0(i11);
                        iM0 = C0081m.m0(i5);
                        i10 += iM0 + iK0 + i5;
                    }
                    break;
                case 45:
                    i5 = X.g((List) unsafe.getObject(abstractC0090w, j2));
                    if (i5 > 0) {
                        iK0 = C0081m.k0(i11);
                        iM0 = C0081m.m0(i5);
                        i10 += iM0 + iK0 + i5;
                    }
                    break;
                case 46:
                    i5 = X.i((List) unsafe.getObject(abstractC0090w, j2));
                    if (i5 > 0) {
                        iK0 = C0081m.k0(i11);
                        iM0 = C0081m.m0(i5);
                        i10 += iM0 + iK0 + i5;
                    }
                    break;
                case 47:
                    i5 = X.r((List) unsafe.getObject(abstractC0090w, j2));
                    if (i5 > 0) {
                        iK0 = C0081m.k0(i11);
                        iM0 = C0081m.m0(i5);
                        i10 += iM0 + iK0 + i5;
                    }
                    break;
                case 48:
                    i5 = X.t((List) unsafe.getObject(abstractC0090w, j2));
                    if (i5 > 0) {
                        iK0 = C0081m.k0(i11);
                        iM0 = C0081m.m0(i5);
                        i10 += iM0 + iK0 + i5;
                    }
                    break;
                case 49:
                    iW = X.j(i11, (List) unsafe.getObject(abstractC0090w, j2), m(i9));
                    i10 += iW;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC0090w, j2);
                    Object obj = this.f1442b[(i9 / 3) * 2];
                    this.f1453m.getClass();
                    iW = J.a(i11, object2, obj);
                    i10 += iW;
                    break;
                case 51:
                    if (q(abstractC0090w, i11, i9)) {
                        iW = C0081m.W(i11);
                        i10 += iW;
                    }
                    break;
                case 52:
                    if (q(abstractC0090w, i11, i9)) {
                        iW = C0081m.a0(i11);
                        i10 += iW;
                    }
                    break;
                case 53:
                    if (q(abstractC0090w, i11, i9)) {
                        iW = C0081m.d0(A(j2, abstractC0090w), i11);
                        i10 += iW;
                    }
                    break;
                case 54:
                    if (q(abstractC0090w, i11, i9)) {
                        iW = C0081m.n0(A(j2, abstractC0090w), i11);
                        i10 += iW;
                    }
                    break;
                case 55:
                    if (q(abstractC0090w, i11, i9)) {
                        iW = C0081m.c0(i11, z(j2, abstractC0090w));
                        i10 += iW;
                    }
                    break;
                case 56:
                    if (q(abstractC0090w, i11, i9)) {
                        iW = C0081m.Z(i11);
                        i10 += iW;
                    }
                    break;
                case 57:
                    if (q(abstractC0090w, i11, i9)) {
                        iW = C0081m.Y(i11);
                        i10 += iW;
                    }
                    break;
                case 58:
                    if (q(abstractC0090w, i11, i9)) {
                        iW = C0081m.U(i11);
                        i10 += iW;
                    }
                    break;
                case 59:
                    if (q(abstractC0090w, i11, i9)) {
                        Object object3 = unsafe.getObject(abstractC0090w, j2);
                        iV = object3 instanceof C0075g ? C0081m.V(i11, (C0075g) object3) : C0081m.i0((String) object3, i11);
                        i10 = iV + i10;
                    }
                    break;
                case 60:
                    if (q(abstractC0090w, i11, i9)) {
                        iW = X.o(i11, unsafe.getObject(abstractC0090w, j2), m(i9));
                        i10 += iW;
                    }
                    break;
                case 61:
                    if (q(abstractC0090w, i11, i9)) {
                        iW = C0081m.V(i11, (C0075g) unsafe.getObject(abstractC0090w, j2));
                        i10 += iW;
                    }
                    break;
                case 62:
                    if (q(abstractC0090w, i11, i9)) {
                        iW = C0081m.l0(i11, z(j2, abstractC0090w));
                        i10 += iW;
                    }
                    break;
                case 63:
                    if (q(abstractC0090w, i11, i9)) {
                        iW = C0081m.X(i11, z(j2, abstractC0090w));
                        i10 += iW;
                    }
                    break;
                case 64:
                    if (q(abstractC0090w, i11, i9)) {
                        iW = C0081m.e0(i11);
                        i10 += iW;
                    }
                    break;
                case 65:
                    if (q(abstractC0090w, i11, i9)) {
                        iW = C0081m.f0(i11);
                        i10 += iW;
                    }
                    break;
                case 66:
                    if (q(abstractC0090w, i11, i9)) {
                        iW = C0081m.g0(i11, z(j2, abstractC0090w));
                        i10 += iW;
                    }
                    break;
                case 67:
                    if (q(abstractC0090w, i11, i9)) {
                        iW = C0081m.h0(A(j2, abstractC0090w), i11);
                        i10 += iW;
                    }
                    break;
                case 68:
                    if (q(abstractC0090w, i11, i9)) {
                        iW = C0081m.b0(i11, (AbstractC0069a) unsafe.getObject(abstractC0090w, j2), m(i9));
                        i10 += iW;
                    }
                    break;
            }
            i9 += 3;
            i7 = i2;
            i8 = i3;
            i6 = 1048575;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final AbstractC0090w g() {
        this.f1450j.getClass();
        return ((AbstractC0090w) this.f1445e).k();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x0080 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.W
    public final void h(Object obj) {
        if (p(obj)) {
            if (obj instanceof AbstractC0090w) {
                AbstractC0090w abstractC0090w = (AbstractC0090w) obj;
                abstractC0090w.d();
                abstractC0090w.c();
                abstractC0090w.j();
            }
            int[] iArr = this.f1441a;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int iM = M(i2);
                long j2 = 1048575 & iM;
                int iL = L(iM);
                if (iL != 9) {
                    if (iL != 60 && iL != 68) {
                        switch (iL) {
                            case 17:
                                if (n(i2, obj)) {
                                    m(i2).h(f1440o.getObject(obj, j2));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f1451k.getClass();
                                C.a(j2, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f1440o;
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    this.f1453m.getClass();
                                    J.c(object);
                                    unsafe.putObject(obj, j2, object);
                                }
                                break;
                        }
                    } else if (q(obj, iArr[i2], i2)) {
                        m(i2).h(f1440o.getObject(obj, j2));
                    }
                } else if (n(i2, obj)) {
                    m(i2).h(f1440o.getObject(obj, j2));
                }
            }
            this.f1452l.getClass();
            e0.b(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean i(AbstractC0090w abstractC0090w, Object obj) {
        int[] iArr = this.f1441a;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            boolean zB = true;
            if (i2 >= length) {
                this.f1452l.getClass();
                return abstractC0090w.unknownFields.equals(((AbstractC0090w) obj).unknownFields);
            }
            int iM = M(i2);
            long j2 = iM & 1048575;
            switch (L(iM)) {
                case 0:
                    if (!j(abstractC0090w, obj, i2)) {
                        zB = false;
                    } else {
                        i0 i0Var = j0.f1526c;
                        if (Double.doubleToLongBits(i0Var.d(j2, abstractC0090w)) != Double.doubleToLongBits(i0Var.d(j2, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 1:
                    if (!j(abstractC0090w, obj, i2)) {
                        zB = false;
                    } else {
                        i0 i0Var2 = j0.f1526c;
                        if (Float.floatToIntBits(i0Var2.e(j2, abstractC0090w)) != Float.floatToIntBits(i0Var2.e(j2, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 2:
                    if (!j(abstractC0090w, obj, i2)) {
                        zB = false;
                    } else {
                        i0 i0Var3 = j0.f1526c;
                        if (i0Var3.g(j2, abstractC0090w) != i0Var3.g(j2, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 3:
                    if (!j(abstractC0090w, obj, i2)) {
                        zB = false;
                    } else {
                        i0 i0Var4 = j0.f1526c;
                        if (i0Var4.g(j2, abstractC0090w) != i0Var4.g(j2, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case I.k.LONG_FIELD_NUMBER /* 4 */:
                    if (!j(abstractC0090w, obj, i2)) {
                        zB = false;
                    } else {
                        i0 i0Var5 = j0.f1526c;
                        if (i0Var5.f(j2, abstractC0090w) != i0Var5.f(j2, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case I.k.STRING_FIELD_NUMBER /* 5 */:
                    if (!j(abstractC0090w, obj, i2)) {
                        zB = false;
                    } else {
                        i0 i0Var6 = j0.f1526c;
                        if (i0Var6.g(j2, abstractC0090w) != i0Var6.g(j2, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!j(abstractC0090w, obj, i2)) {
                        zB = false;
                    } else {
                        i0 i0Var7 = j0.f1526c;
                        if (i0Var7.f(j2, abstractC0090w) != i0Var7.f(j2, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!j(abstractC0090w, obj, i2)) {
                        zB = false;
                    } else {
                        i0 i0Var8 = j0.f1526c;
                        if (i0Var8.c(j2, abstractC0090w) != i0Var8.c(j2, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case I.k.BYTES_FIELD_NUMBER /* 8 */:
                    if (!j(abstractC0090w, obj, i2)) {
                        zB = false;
                    } else {
                        i0 i0Var9 = j0.f1526c;
                        if (!X.B(i0Var9.h(j2, abstractC0090w), i0Var9.h(j2, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 9:
                    if (!j(abstractC0090w, obj, i2)) {
                        zB = false;
                    } else {
                        i0 i0Var10 = j0.f1526c;
                        if (!X.B(i0Var10.h(j2, abstractC0090w), i0Var10.h(j2, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 10:
                    if (!j(abstractC0090w, obj, i2)) {
                        zB = false;
                    } else {
                        i0 i0Var11 = j0.f1526c;
                        if (!X.B(i0Var11.h(j2, abstractC0090w), i0Var11.h(j2, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 11:
                    if (!j(abstractC0090w, obj, i2)) {
                        zB = false;
                    } else {
                        i0 i0Var12 = j0.f1526c;
                        if (i0Var12.f(j2, abstractC0090w) != i0Var12.f(j2, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 12:
                    if (!j(abstractC0090w, obj, i2)) {
                        zB = false;
                    } else {
                        i0 i0Var13 = j0.f1526c;
                        if (i0Var13.f(j2, abstractC0090w) != i0Var13.f(j2, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 13:
                    if (!j(abstractC0090w, obj, i2)) {
                        zB = false;
                    } else {
                        i0 i0Var14 = j0.f1526c;
                        if (i0Var14.f(j2, abstractC0090w) != i0Var14.f(j2, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 14:
                    if (!j(abstractC0090w, obj, i2)) {
                        zB = false;
                    } else {
                        i0 i0Var15 = j0.f1526c;
                        if (i0Var15.g(j2, abstractC0090w) != i0Var15.g(j2, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 15:
                    if (!j(abstractC0090w, obj, i2)) {
                        zB = false;
                    } else {
                        i0 i0Var16 = j0.f1526c;
                        if (i0Var16.f(j2, abstractC0090w) != i0Var16.f(j2, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 16:
                    if (!j(abstractC0090w, obj, i2)) {
                        zB = false;
                    } else {
                        i0 i0Var17 = j0.f1526c;
                        if (i0Var17.g(j2, abstractC0090w) != i0Var17.g(j2, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 17:
                    if (!j(abstractC0090w, obj, i2)) {
                        zB = false;
                    } else {
                        i0 i0Var18 = j0.f1526c;
                        if (!X.B(i0Var18.h(j2, abstractC0090w), i0Var18.h(j2, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i0 i0Var19 = j0.f1526c;
                    zB = X.B(i0Var19.h(j2, abstractC0090w), i0Var19.h(j2, obj));
                    break;
                case 50:
                    i0 i0Var20 = j0.f1526c;
                    zB = X.B(i0Var20.h(j2, abstractC0090w), i0Var20.h(j2, obj));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j3 = iArr[i2 + 2] & 1048575;
                    i0 i0Var21 = j0.f1526c;
                    if (i0Var21.f(j3, abstractC0090w) != i0Var21.f(j3, obj) || !X.B(i0Var21.h(j2, abstractC0090w), i0Var21.h(j2, obj))) {
                        zB = false;
                    }
                    break;
            }
            if (!zB) {
                return false;
            }
            i2 += 3;
        }
    }

    public final boolean j(AbstractC0090w abstractC0090w, Object obj, int i2) {
        return n(i2, abstractC0090w) == n(i2, obj);
    }

    public final void k(int i2, Object obj, Object obj2) {
        int i3 = this.f1441a[i2];
        if (j0.f1526c.h(M(i2) & 1048575, obj) == null) {
            return;
        }
        l(i2);
    }

    public final void l(int i2) {
        if (this.f1442b[((i2 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final W m(int i2) {
        int i3 = (i2 / 3) * 2;
        Object[] objArr = this.f1442b;
        W w2 = (W) objArr[i3];
        if (w2 != null) {
            return w2;
        }
        W wA = T.f1459c.a((Class) objArr[i3 + 1]);
        objArr[i3] = wA;
        return wA;
    }

    public final boolean n(int i2, Object obj) {
        int i3 = this.f1441a[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 != 1048575) {
            return ((1 << (i3 >>> 20)) & j0.f1526c.f(j2, obj)) != 0;
        }
        int iM = M(i2);
        long j3 = iM & 1048575;
        switch (L(iM)) {
            case 0:
                return Double.doubleToRawLongBits(j0.f1526c.d(j3, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(j0.f1526c.e(j3, obj)) != 0;
            case 2:
                return j0.f1526c.g(j3, obj) != 0;
            case 3:
                return j0.f1526c.g(j3, obj) != 0;
            case I.k.LONG_FIELD_NUMBER /* 4 */:
                return j0.f1526c.f(j3, obj) != 0;
            case I.k.STRING_FIELD_NUMBER /* 5 */:
                return j0.f1526c.g(j3, obj) != 0;
            case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return j0.f1526c.f(j3, obj) != 0;
            case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return j0.f1526c.c(j3, obj);
            case I.k.BYTES_FIELD_NUMBER /* 8 */:
                Object objH = j0.f1526c.h(j3, obj);
                if (objH instanceof String) {
                    return !((String) objH).isEmpty();
                }
                if (objH instanceof C0075g) {
                    return !C0075g.f1501g.equals(objH);
                }
                throw new IllegalArgumentException();
            case 9:
                return j0.f1526c.h(j3, obj) != null;
            case 10:
                return !C0075g.f1501g.equals(j0.f1526c.h(j3, obj));
            case 11:
                return j0.f1526c.f(j3, obj) != 0;
            case 12:
                return j0.f1526c.f(j3, obj) != 0;
            case 13:
                return j0.f1526c.f(j3, obj) != 0;
            case 14:
                return j0.f1526c.g(j3, obj) != 0;
            case 15:
                return j0.f1526c.f(j3, obj) != 0;
            case 16:
                return j0.f1526c.g(j3, obj) != 0;
            case 17:
                return j0.f1526c.h(j3, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean o(Object obj, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return n(i2, obj);
        }
        return (i4 & i5) != 0;
    }

    public final boolean q(Object obj, int i2, int i3) {
        return j0.f1526c.f((long) (this.f1441a[i3 + 2] & 1048575), obj) == i2;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0646 A[Catch: all -> 0x025a, TryCatch #3 {all -> 0x025a, blocks: (B:67:0x0255, B:120:0x0641, B:122:0x0646, B:123:0x064b, B:70:0x025d, B:71:0x0270, B:72:0x0283, B:73:0x0296, B:74:0x02a9, B:75:0x02c2, B:76:0x02d5, B:77:0x02e8, B:78:0x02fb, B:79:0x030e, B:80:0x0321, B:81:0x0334, B:82:0x0347, B:83:0x035a, B:84:0x036d, B:85:0x0380, B:86:0x0393, B:87:0x03a6, B:88:0x03b9, B:89:0x03d2, B:90:0x03e5, B:91:0x03f8, B:92:0x040c, B:93:0x0414, B:94:0x0427, B:95:0x043a, B:96:0x044d, B:97:0x0460, B:98:0x0473, B:99:0x0486, B:100:0x0499, B:101:0x04ac, B:102:0x04c5, B:103:0x04db, B:104:0x04f1, B:105:0x0508, B:106:0x051f, B:107:0x0538, B:108:0x054e, B:109:0x0561, B:110:0x057a, B:111:0x0585, B:112:0x059d, B:113:0x05b4, B:114:0x05cb, B:115:0x05e1, B:116:0x05f7, B:117:0x060c, B:118:0x0624), top: B:146:0x0255 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0655 A[LOOP:3: B:126:0x0653->B:127:0x0655, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x065f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0651 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    public final void r(e0 e0Var, Object obj, C0079k c0079k, C0083o c0083o) throws Throwable {
        int i2;
        int i3;
        int i4;
        int[] iArr = this.f1447g;
        int i5 = this.f1449i;
        int i6 = this.f1448h;
        d0 d0VarA = null;
        while (true) {
            try {
                int iA = c0079k.a();
                int iB = B(iA);
                if (iB >= 0) {
                    int iM = M(iB);
                    try {
                        int iL = L(iM);
                        AbstractC0078j abstractC0078j = c0079k.f1531a;
                        C c2 = this.f1451k;
                        switch (iL) {
                            case 0:
                                i2 = i6;
                                long jY = y(iM);
                                c0079k.w(1);
                                j0.f1526c.l(obj, jY, abstractC0078j.h());
                                H(iB, obj);
                                i6 = i2;
                                break;
                            case 1:
                                i2 = i6;
                                long jY2 = y(iM);
                                c0079k.w(5);
                                j0.f1526c.m(obj, jY2, abstractC0078j.l());
                                H(iB, obj);
                                i6 = i2;
                                break;
                            case 2:
                                i2 = i6;
                                long jY3 = y(iM);
                                c0079k.w(0);
                                j0.n(obj, jY3, abstractC0078j.n());
                                H(iB, obj);
                                i6 = i2;
                                break;
                            case 3:
                                i2 = i6;
                                long jY4 = y(iM);
                                c0079k.w(0);
                                j0.n(obj, jY4, abstractC0078j.w());
                                H(iB, obj);
                                i6 = i2;
                                break;
                            case I.k.LONG_FIELD_NUMBER /* 4 */:
                                i2 = i6;
                                long jY5 = y(iM);
                                c0079k.w(0);
                                j0.m(obj, jY5, abstractC0078j.m());
                                H(iB, obj);
                                i6 = i2;
                                break;
                            case I.k.STRING_FIELD_NUMBER /* 5 */:
                                i2 = i6;
                                long jY6 = y(iM);
                                c0079k.w(1);
                                j0.n(obj, jY6, abstractC0078j.k());
                                H(iB, obj);
                                i6 = i2;
                                break;
                            case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                i2 = i6;
                                long jY7 = y(iM);
                                c0079k.w(5);
                                j0.m(obj, jY7, abstractC0078j.j());
                                H(iB, obj);
                                i6 = i2;
                                break;
                            case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                i2 = i6;
                                long jY8 = y(iM);
                                c0079k.w(0);
                                j0.f1526c.j(obj, jY8, abstractC0078j.f());
                                H(iB, obj);
                                i6 = i2;
                                break;
                            case I.k.BYTES_FIELD_NUMBER /* 8 */:
                                i2 = i6;
                                E(iM, c0079k, obj);
                                H(iB, obj);
                                i6 = i2;
                                break;
                            case 9:
                                i2 = i6;
                                AbstractC0069a abstractC0069a = (AbstractC0069a) v(iB, obj);
                                W wM = m(iB);
                                c0079k.w(2);
                                c0079k.c(abstractC0069a, wM, c0083o);
                                J(obj, iB, abstractC0069a);
                                i6 = i2;
                                break;
                            case 10:
                                i2 = i6;
                                j0.o(obj, y(iM), c0079k.e());
                                H(iB, obj);
                                i6 = i2;
                                break;
                            case 11:
                                i2 = i6;
                                long jY9 = y(iM);
                                c0079k.w(0);
                                j0.m(obj, jY9, abstractC0078j.v());
                                H(iB, obj);
                                i6 = i2;
                                break;
                            case 12:
                                i2 = i6;
                                c0079k.w(0);
                                int i7 = abstractC0078j.i();
                                l(iB);
                                j0.m(obj, y(iM), i7);
                                H(iB, obj);
                                i6 = i2;
                                break;
                            case 13:
                                i2 = i6;
                                long jY10 = y(iM);
                                c0079k.w(5);
                                j0.m(obj, jY10, abstractC0078j.o());
                                H(iB, obj);
                                i6 = i2;
                                break;
                            case 14:
                                i2 = i6;
                                long jY11 = y(iM);
                                c0079k.w(1);
                                j0.n(obj, jY11, abstractC0078j.p());
                                H(iB, obj);
                                i6 = i2;
                                break;
                            case 15:
                                i2 = i6;
                                long jY12 = y(iM);
                                c0079k.w(0);
                                j0.m(obj, jY12, abstractC0078j.q());
                                H(iB, obj);
                                i6 = i2;
                                break;
                            case 16:
                                i2 = i6;
                                long jY13 = y(iM);
                                c0079k.w(0);
                                j0.n(obj, jY13, abstractC0078j.r());
                                H(iB, obj);
                                i6 = i2;
                                break;
                            case 17:
                                i2 = i6;
                                AbstractC0069a abstractC0069a2 = (AbstractC0069a) v(iB, obj);
                                W wM2 = m(iB);
                                c0079k.w(3);
                                c0079k.b(abstractC0069a2, wM2, c0083o);
                                J(obj, iB, abstractC0069a2);
                                i6 = i2;
                                break;
                            case 18:
                                i2 = i6;
                                long jY14 = y(iM);
                                c2.getClass();
                                c0079k.g(C.b(jY14, obj));
                                i6 = i2;
                                break;
                            case 19:
                                i2 = i6;
                                long jY15 = y(iM);
                                c2.getClass();
                                c0079k.l(C.b(jY15, obj));
                                i6 = i2;
                                break;
                            case 20:
                                i2 = i6;
                                long jY16 = y(iM);
                                c2.getClass();
                                c0079k.n(C.b(jY16, obj));
                                i6 = i2;
                                break;
                            case 21:
                                i2 = i6;
                                long jY17 = y(iM);
                                c2.getClass();
                                c0079k.u(C.b(jY17, obj));
                                i6 = i2;
                                break;
                            case 22:
                                i2 = i6;
                                long jY18 = y(iM);
                                c2.getClass();
                                c0079k.m(C.b(jY18, obj));
                                i6 = i2;
                                break;
                            case 23:
                                i2 = i6;
                                long jY19 = y(iM);
                                c2.getClass();
                                c0079k.k(C.b(jY19, obj));
                                i6 = i2;
                                break;
                            case 24:
                                i2 = i6;
                                long jY20 = y(iM);
                                c2.getClass();
                                c0079k.j(C.b(jY20, obj));
                                i6 = i2;
                                break;
                            case 25:
                                i2 = i6;
                                long jY21 = y(iM);
                                c2.getClass();
                                c0079k.d(C.b(jY21, obj));
                                i6 = i2;
                                break;
                            case 26:
                                i2 = i6;
                                F(iM, c0079k, obj);
                                i6 = i2;
                                break;
                            case 27:
                                i2 = i6;
                                D(obj, iM, c0079k, m(iB), c0083o);
                                i6 = i2;
                                break;
                            case 28:
                                i2 = i6;
                                long jY22 = y(iM);
                                c2.getClass();
                                c0079k.f(C.b(jY22, obj));
                                i6 = i2;
                                break;
                            case 29:
                                i2 = i6;
                                long jY23 = y(iM);
                                c2.getClass();
                                c0079k.t(C.b(jY23, obj));
                                i6 = i2;
                                break;
                            case 30:
                                i2 = i6;
                                long jY24 = y(iM);
                                c2.getClass();
                                InterfaceC0091x interfaceC0091xB = C.b(jY24, obj);
                                c0079k.h(interfaceC0091xB);
                                l(iB);
                                X.z(obj, iA, interfaceC0091xB, d0VarA, e0Var);
                                i6 = i2;
                                break;
                            case 31:
                                i2 = i6;
                                long jY25 = y(iM);
                                c2.getClass();
                                c0079k.o(C.b(jY25, obj));
                                i6 = i2;
                                break;
                            case 32:
                                i2 = i6;
                                long jY26 = y(iM);
                                c2.getClass();
                                c0079k.p(C.b(jY26, obj));
                                i6 = i2;
                                break;
                            case 33:
                                i2 = i6;
                                long jY27 = y(iM);
                                c2.getClass();
                                c0079k.q(C.b(jY27, obj));
                                i6 = i2;
                                break;
                            case 34:
                                i2 = i6;
                                long jY28 = y(iM);
                                c2.getClass();
                                c0079k.r(C.b(jY28, obj));
                                i6 = i2;
                                break;
                            case 35:
                                i2 = i6;
                                long jY29 = y(iM);
                                c2.getClass();
                                c0079k.g(C.b(jY29, obj));
                                i6 = i2;
                                break;
                            case 36:
                                i2 = i6;
                                long jY30 = y(iM);
                                c2.getClass();
                                c0079k.l(C.b(jY30, obj));
                                i6 = i2;
                                break;
                            case 37:
                                i2 = i6;
                                long jY31 = y(iM);
                                c2.getClass();
                                c0079k.n(C.b(jY31, obj));
                                i6 = i2;
                                break;
                            case 38:
                                i2 = i6;
                                long jY32 = y(iM);
                                c2.getClass();
                                c0079k.u(C.b(jY32, obj));
                                i6 = i2;
                                break;
                            case 39:
                                i2 = i6;
                                long jY33 = y(iM);
                                c2.getClass();
                                c0079k.m(C.b(jY33, obj));
                                i6 = i2;
                                break;
                            case 40:
                                i2 = i6;
                                long jY34 = y(iM);
                                c2.getClass();
                                c0079k.k(C.b(jY34, obj));
                                i6 = i2;
                                break;
                            case 41:
                                i2 = i6;
                                long jY35 = y(iM);
                                c2.getClass();
                                c0079k.j(C.b(jY35, obj));
                                i6 = i2;
                                break;
                            case 42:
                                i2 = i6;
                                long jY36 = y(iM);
                                c2.getClass();
                                c0079k.d(C.b(jY36, obj));
                                i6 = i2;
                                break;
                            case 43:
                                i2 = i6;
                                long jY37 = y(iM);
                                c2.getClass();
                                c0079k.t(C.b(jY37, obj));
                                i6 = i2;
                                break;
                            case 44:
                                i2 = i6;
                                long jY38 = y(iM);
                                c2.getClass();
                                InterfaceC0091x interfaceC0091xB2 = C.b(jY38, obj);
                                c0079k.h(interfaceC0091xB2);
                                l(iB);
                                X.z(obj, iA, interfaceC0091xB2, d0VarA, e0Var);
                                i6 = i2;
                                break;
                            case 45:
                                i2 = i6;
                                long jY39 = y(iM);
                                c2.getClass();
                                c0079k.o(C.b(jY39, obj));
                                i6 = i2;
                                break;
                            case 46:
                                i2 = i6;
                                long jY40 = y(iM);
                                c2.getClass();
                                c0079k.p(C.b(jY40, obj));
                                i6 = i2;
                                break;
                            case 47:
                                i2 = i6;
                                long jY41 = y(iM);
                                c2.getClass();
                                c0079k.q(C.b(jY41, obj));
                                i6 = i2;
                                break;
                            case 48:
                                i2 = i6;
                                long jY42 = y(iM);
                                c2.getClass();
                                c0079k.r(C.b(jY42, obj));
                                i6 = i2;
                                break;
                            case 49:
                                i2 = i6;
                                i3 = 0;
                                try {
                                    try {
                                        C(obj, y(iM), c0079k, m(iB), c0083o);
                                    } catch (Throwable th) {
                                        th = th;
                                        for (int i8 = i2; i8 < i5; i8++) {
                                            k(iArr[i8], obj, d0VarA);
                                        }
                                        if (d0VarA != null) {
                                            e0Var.getClass();
                                            ((AbstractC0090w) obj).unknownFields = d0VarA;
                                        }
                                        throw th;
                                    }
                                } catch (C0093z unused) {
                                    e0Var.getClass();
                                    if (d0VarA == null) {
                                        d0VarA = e0.a(obj);
                                    }
                                    if (!e0.c(i3, c0079k, d0VarA)) {
                                        for (i4 = i2; i4 < i5; i4++) {
                                            k(iArr[i4], obj, d0VarA);
                                        }
                                        if (d0VarA != null) {
                                            ((AbstractC0090w) obj).unknownFields = d0VarA;
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i6 = i2;
                                break;
                            case 50:
                                try {
                                    s(obj, iB, this.f1442b[(iB / 3) * 2], c0083o, c0079k);
                                    i2 = i6;
                                } catch (C0093z unused2) {
                                    i2 = i6;
                                    i3 = 0;
                                    e0Var.getClass();
                                    if (d0VarA == null) {
                                        d0VarA = e0.a(obj);
                                    }
                                    if (!e0.c(i3, c0079k, d0VarA)) {
                                        while (i4 < i5) {
                                            k(iArr[i4], obj, d0VarA);
                                        }
                                        if (d0VarA != null) {
                                            ((AbstractC0090w) obj).unknownFields = d0VarA;
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i6 = i2;
                                break;
                            case 51:
                                long jY43 = y(iM);
                                c0079k.w(1);
                                j0.o(obj, jY43, Double.valueOf(abstractC0078j.h()));
                                I(obj, iA, iB);
                                i2 = i6;
                                i6 = i2;
                                break;
                            case 52:
                                long jY44 = y(iM);
                                c0079k.w(5);
                                j0.o(obj, jY44, Float.valueOf(abstractC0078j.l()));
                                I(obj, iA, iB);
                                i2 = i6;
                                i6 = i2;
                                break;
                            case 53:
                                long jY45 = y(iM);
                                c0079k.w(0);
                                j0.o(obj, jY45, Long.valueOf(abstractC0078j.n()));
                                I(obj, iA, iB);
                                i2 = i6;
                                i6 = i2;
                                break;
                            case 54:
                                long jY46 = y(iM);
                                c0079k.w(0);
                                j0.o(obj, jY46, Long.valueOf(abstractC0078j.w()));
                                I(obj, iA, iB);
                                i2 = i6;
                                i6 = i2;
                                break;
                            case 55:
                                long jY47 = y(iM);
                                c0079k.w(0);
                                j0.o(obj, jY47, Integer.valueOf(abstractC0078j.m()));
                                I(obj, iA, iB);
                                i2 = i6;
                                i6 = i2;
                                break;
                            case 56:
                                long jY48 = y(iM);
                                c0079k.w(1);
                                j0.o(obj, jY48, Long.valueOf(abstractC0078j.k()));
                                I(obj, iA, iB);
                                i2 = i6;
                                i6 = i2;
                                break;
                            case 57:
                                long jY49 = y(iM);
                                c0079k.w(5);
                                j0.o(obj, jY49, Integer.valueOf(abstractC0078j.j()));
                                I(obj, iA, iB);
                                i2 = i6;
                                i6 = i2;
                                break;
                            case 58:
                                long jY50 = y(iM);
                                c0079k.w(0);
                                j0.o(obj, jY50, Boolean.valueOf(abstractC0078j.f()));
                                I(obj, iA, iB);
                                i2 = i6;
                                i6 = i2;
                                break;
                            case 59:
                                E(iM, c0079k, obj);
                                I(obj, iA, iB);
                                i2 = i6;
                                i6 = i2;
                                break;
                            case 60:
                                AbstractC0069a abstractC0069a3 = (AbstractC0069a) w(obj, iA, iB);
                                W wM3 = m(iB);
                                c0079k.w(2);
                                c0079k.c(abstractC0069a3, wM3, c0083o);
                                K(obj, iA, iB, abstractC0069a3);
                                i2 = i6;
                                i6 = i2;
                                break;
                            case 61:
                                j0.o(obj, y(iM), c0079k.e());
                                I(obj, iA, iB);
                                i2 = i6;
                                i6 = i2;
                                break;
                            case 62:
                                long jY51 = y(iM);
                                c0079k.w(0);
                                j0.o(obj, jY51, Integer.valueOf(abstractC0078j.v()));
                                I(obj, iA, iB);
                                i2 = i6;
                                i6 = i2;
                                break;
                            case 63:
                                c0079k.w(0);
                                int i9 = abstractC0078j.i();
                                l(iB);
                                j0.o(obj, y(iM), Integer.valueOf(i9));
                                I(obj, iA, iB);
                                i2 = i6;
                                i6 = i2;
                                break;
                            case 64:
                                long jY52 = y(iM);
                                c0079k.w(5);
                                j0.o(obj, jY52, Integer.valueOf(abstractC0078j.o()));
                                I(obj, iA, iB);
                                i2 = i6;
                                i6 = i2;
                                break;
                            case 65:
                                long jY53 = y(iM);
                                c0079k.w(1);
                                j0.o(obj, jY53, Long.valueOf(abstractC0078j.p()));
                                I(obj, iA, iB);
                                i2 = i6;
                                i6 = i2;
                                break;
                            case 66:
                                long jY54 = y(iM);
                                c0079k.w(0);
                                j0.o(obj, jY54, Integer.valueOf(abstractC0078j.q()));
                                I(obj, iA, iB);
                                i2 = i6;
                                i6 = i2;
                                break;
                            case 67:
                                long jY55 = y(iM);
                                c0079k.w(0);
                                j0.o(obj, jY55, Long.valueOf(abstractC0078j.r()));
                                I(obj, iA, iB);
                                i2 = i6;
                                i6 = i2;
                                break;
                            case 68:
                                AbstractC0069a abstractC0069a4 = (AbstractC0069a) w(obj, iA, iB);
                                W wM4 = m(iB);
                                c0079k.w(3);
                                c0079k.b(abstractC0069a4, wM4, c0083o);
                                K(obj, iA, iB, abstractC0069a4);
                                i2 = i6;
                                i6 = i2;
                                break;
                            default:
                                if (d0VarA == null) {
                                    e0Var.getClass();
                                    d0VarA = e0.a(obj);
                                }
                                e0Var.getClass();
                                if (!e0.c(0, c0079k, d0VarA)) {
                                    while (i6 < i5) {
                                        k(iArr[i6], obj, d0VarA);
                                        i6++;
                                    }
                                    if (d0VarA != null) {
                                        ((AbstractC0090w) obj).unknownFields = d0VarA;
                                        return;
                                    }
                                    return;
                                }
                                i2 = i6;
                                i6 = i2;
                                break;
                        }
                    } catch (C0093z unused3) {
                    }
                } else {
                    if (iA == Integer.MAX_VALUE) {
                        while (i6 < i5) {
                            k(iArr[i6], obj, d0VarA);
                            i6++;
                        }
                        if (d0VarA != null) {
                            e0Var.getClass();
                            ((AbstractC0090w) obj).unknownFields = d0VarA;
                            return;
                        }
                        return;
                    }
                    e0Var.getClass();
                    if (d0VarA == null) {
                        d0VarA = e0.a(obj);
                    }
                    if (!e0.c(0, c0079k, d0VarA)) {
                        while (i6 < i5) {
                            k(iArr[i6], obj, d0VarA);
                            i6++;
                        }
                        if (d0VarA != null) {
                            ((AbstractC0090w) obj).unknownFields = d0VarA;
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                i2 = i6;
            }
        }
    }

    public final void s(Object obj, int i2, Object obj2, C0083o c0083o, C0079k c0079k) throws C0093z {
        long jM = M(i2) & 1048575;
        Object objH = j0.f1526c.h(jM, obj);
        J j2 = this.f1453m;
        if (objH == null) {
            j2.getClass();
            objH = I.f1434f.b();
            j0.o(obj, jM, objH);
        } else {
            j2.getClass();
            if (!((I) objH).f1435e) {
                I iB = I.f1434f.b();
                J.b(iB, objH);
                j0.o(obj, jM, iB);
                objH = iB;
            }
        }
        j2.getClass();
        I i3 = (I) objH;
        G g2 = ((H) obj2).f1433a;
        c0079k.w(2);
        AbstractC0078j abstractC0078j = c0079k.f1531a;
        int iE = abstractC0078j.e(abstractC0078j.v());
        Object objI = "";
        I.k kVar = g2.f1432c;
        Object objI2 = kVar;
        while (true) {
            try {
                int iA = c0079k.a();
                if (iA == Integer.MAX_VALUE || abstractC0078j.c()) {
                    break;
                }
                if (iA == 1) {
                    objI = c0079k.i(g2.f1430a, null, null);
                } else if (iA != 2) {
                    try {
                        if (!c0079k.x()) {
                            throw new A("Unable to parse map entry.");
                        }
                    } catch (C0093z unused) {
                        if (!c0079k.x()) {
                            throw new A("Unable to parse map entry.");
                        }
                    }
                } else {
                    objI2 = c0079k.i(g2.f1431b, kVar.getClass(), c0083o);
                }
            } catch (Throwable th) {
                abstractC0078j.d(iE);
                throw th;
            }
        }
        i3.put(objI, objI2);
        abstractC0078j.d(iE);
    }

    public final void t(int i2, Object obj, Object obj2) {
        if (n(i2, obj2)) {
            long jM = M(i2) & 1048575;
            Unsafe unsafe = f1440o;
            Object object = unsafe.getObject(obj2, jM);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f1441a[i2] + " is present but null: " + obj2);
            }
            W wM = m(i2);
            if (!n(i2, obj)) {
                if (p(object)) {
                    AbstractC0090w abstractC0090wG = wM.g();
                    wM.c(abstractC0090wG, object);
                    unsafe.putObject(obj, jM, abstractC0090wG);
                } else {
                    unsafe.putObject(obj, jM, object);
                }
                H(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM);
            if (!p(object2)) {
                AbstractC0090w abstractC0090wG2 = wM.g();
                wM.c(abstractC0090wG2, object2);
                unsafe.putObject(obj, jM, abstractC0090wG2);
                object2 = abstractC0090wG2;
            }
            wM.c(object2, object);
        }
    }

    public final void u(int i2, Object obj, Object obj2) {
        int[] iArr = this.f1441a;
        int i3 = iArr[i2];
        if (q(obj2, i3, i2)) {
            long jM = M(i2) & 1048575;
            Unsafe unsafe = f1440o;
            Object object = unsafe.getObject(obj2, jM);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i2] + " is present but null: " + obj2);
            }
            W wM = m(i2);
            if (!q(obj, i3, i2)) {
                if (p(object)) {
                    AbstractC0090w abstractC0090wG = wM.g();
                    wM.c(abstractC0090wG, object);
                    unsafe.putObject(obj, jM, abstractC0090wG);
                } else {
                    unsafe.putObject(obj, jM, object);
                }
                I(obj, i3, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM);
            if (!p(object2)) {
                AbstractC0090w abstractC0090wG2 = wM.g();
                wM.c(abstractC0090wG2, object2);
                unsafe.putObject(obj, jM, abstractC0090wG2);
                object2 = abstractC0090wG2;
            }
            wM.c(object2, object);
        }
    }

    public final Object v(int i2, Object obj) {
        W wM = m(i2);
        long jM = M(i2) & 1048575;
        if (!n(i2, obj)) {
            return wM.g();
        }
        Object object = f1440o.getObject(obj, jM);
        if (p(object)) {
            return object;
        }
        AbstractC0090w abstractC0090wG = wM.g();
        if (object != null) {
            wM.c(abstractC0090wG, object);
        }
        return abstractC0090wG;
    }

    public final Object w(Object obj, int i2, int i3) {
        W wM = m(i3);
        if (!q(obj, i2, i3)) {
            return wM.g();
        }
        Object object = f1440o.getObject(obj, M(i3) & 1048575);
        if (p(object)) {
            return object;
        }
        AbstractC0090w abstractC0090wG = wM.g();
        if (object != null) {
            wM.c(abstractC0090wG, object);
        }
        return abstractC0090wG;
    }
}
