package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f1469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f1470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f1471c;

    static {
        Class<?> cls;
        Class<?> cls2;
        T t = T.f1459c;
        e0 e0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f1469a = cls;
        try {
            T t2 = T.f1459c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                e0Var = (e0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f1470b = e0Var;
        f1471c = new e0();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void A(e0 e0Var, Object obj, Object obj2) {
        e0Var.getClass();
        AbstractC0090w abstractC0090w = (AbstractC0090w) obj;
        d0 d0Var = abstractC0090w.unknownFields;
        d0 d0Var2 = ((AbstractC0090w) obj2).unknownFields;
        d0 d0Var3 = d0.f1492f;
        if (!d0Var3.equals(d0Var2)) {
            if (d0Var3.equals(d0Var)) {
                int i2 = d0Var.f1493a + d0Var2.f1493a;
                int[] iArrCopyOf = Arrays.copyOf(d0Var.f1494b, i2);
                System.arraycopy(d0Var2.f1494b, 0, iArrCopyOf, d0Var.f1493a, d0Var2.f1493a);
                Object[] objArrCopyOf = Arrays.copyOf(d0Var.f1495c, i2);
                System.arraycopy(d0Var2.f1495c, 0, objArrCopyOf, d0Var.f1493a, d0Var2.f1493a);
                d0Var = new d0(i2, iArrCopyOf, objArrCopyOf, true);
            } else {
                d0Var.getClass();
                if (!d0Var2.equals(d0Var3)) {
                    if (!d0Var.f1497e) {
                        throw new UnsupportedOperationException();
                    }
                    int i3 = d0Var.f1493a + d0Var2.f1493a;
                    d0Var.a(i3);
                    System.arraycopy(d0Var2.f1494b, 0, d0Var.f1494b, d0Var.f1493a, d0Var2.f1493a);
                    System.arraycopy(d0Var2.f1495c, 0, d0Var.f1495c, d0Var.f1493a, d0Var2.f1493a);
                    d0Var.f1493a = i3;
                }
            }
        }
        abstractC0090w.unknownFields = d0Var;
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void C(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0081m c0081m = (C0081m) f2.f1429a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0081m.t0(i2, ((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        c0081m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Boolean) list.get(i5)).getClass();
            Logger logger = C0081m.f1536r;
            i4++;
        }
        c0081m.G0(i4);
        while (i3 < list.size()) {
            c0081m.r0(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    public static void D(int i2, List list, F f2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f2.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((C0081m) f2.f1429a).u0(i2, (C0075g) list.get(i3));
        }
    }

    public static void E(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0081m c0081m = (C0081m) f2.f1429a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                double dDoubleValue = ((Double) list.get(i3)).doubleValue();
                c0081m.getClass();
                c0081m.y0(Double.doubleToRawLongBits(dDoubleValue), i2);
                i3++;
            }
            return;
        }
        c0081m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Double) list.get(i5)).getClass();
            Logger logger = C0081m.f1536r;
            i4 += 8;
        }
        c0081m.G0(i4);
        while (i3 < list.size()) {
            c0081m.z0(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
            i3++;
        }
    }

    public static void F(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0081m c0081m = (C0081m) f2.f1429a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0081m.A0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0081m.E0(i2, 2);
        int iO0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iO0 += C0081m.o0(((Integer) list.get(i4)).intValue());
        }
        c0081m.G0(iO0);
        while (i3 < list.size()) {
            c0081m.B0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void G(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0081m c0081m = (C0081m) f2.f1429a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0081m.w0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0081m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).getClass();
            Logger logger = C0081m.f1536r;
            i4 += 4;
        }
        c0081m.G0(i4);
        while (i3 < list.size()) {
            c0081m.x0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void H(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0081m c0081m = (C0081m) f2.f1429a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0081m.y0(((Long) list.get(i3)).longValue(), i2);
                i3++;
            }
            return;
        }
        c0081m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).getClass();
            Logger logger = C0081m.f1536r;
            i4 += 8;
        }
        c0081m.G0(i4);
        while (i3 < list.size()) {
            c0081m.z0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void I(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0081m c0081m = (C0081m) f2.f1429a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                float fFloatValue = ((Float) list.get(i3)).floatValue();
                c0081m.getClass();
                c0081m.w0(i2, Float.floatToRawIntBits(fFloatValue));
                i3++;
            }
            return;
        }
        c0081m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Float) list.get(i5)).getClass();
            Logger logger = C0081m.f1536r;
            i4 += 4;
        }
        c0081m.G0(i4);
        while (i3 < list.size()) {
            c0081m.x0(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
            i3++;
        }
    }

    public static void J(int i2, List list, F f2, W w2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f2.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            f2.h(i2, list.get(i3), w2);
        }
    }

    public static void K(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0081m c0081m = (C0081m) f2.f1429a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0081m.A0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0081m.E0(i2, 2);
        int iO0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iO0 += C0081m.o0(((Integer) list.get(i4)).intValue());
        }
        c0081m.G0(iO0);
        while (i3 < list.size()) {
            c0081m.B0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void L(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0081m c0081m = (C0081m) f2.f1429a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0081m.H0(((Long) list.get(i3)).longValue(), i2);
                i3++;
            }
            return;
        }
        c0081m.E0(i2, 2);
        int iO0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iO0 += C0081m.o0(((Long) list.get(i4)).longValue());
        }
        c0081m.G0(iO0);
        while (i3 < list.size()) {
            c0081m.I0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void M(int i2, List list, F f2, W w2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f2.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            f2.k(i2, list.get(i3), w2);
        }
    }

    public static void N(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0081m c0081m = (C0081m) f2.f1429a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0081m.w0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0081m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).getClass();
            Logger logger = C0081m.f1536r;
            i4 += 4;
        }
        c0081m.G0(i4);
        while (i3 < list.size()) {
            c0081m.x0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void O(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0081m c0081m = (C0081m) f2.f1429a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0081m.y0(((Long) list.get(i3)).longValue(), i2);
                i3++;
            }
            return;
        }
        c0081m.E0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).getClass();
            Logger logger = C0081m.f1536r;
            i4 += 8;
        }
        c0081m.G0(i4);
        while (i3 < list.size()) {
            c0081m.z0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void P(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0081m c0081m = (C0081m) f2.f1429a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                c0081m.F0(i2, (iIntValue >> 31) ^ (iIntValue << 1));
                i3++;
            }
            return;
        }
        c0081m.E0(i2, 2);
        int iM0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            iM0 += C0081m.m0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c0081m.G0(iM0);
        while (i3 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i3)).intValue();
            c0081m.G0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i3++;
        }
    }

    public static void Q(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0081m c0081m = (C0081m) f2.f1429a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                long jLongValue = ((Long) list.get(i3)).longValue();
                c0081m.H0((jLongValue >> 63) ^ (jLongValue << 1), i2);
                i3++;
            }
            return;
        }
        c0081m.E0(i2, 2);
        int iO0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long jLongValue2 = ((Long) list.get(i4)).longValue();
            iO0 += C0081m.o0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c0081m.G0(iO0);
        while (i3 < list.size()) {
            long jLongValue3 = ((Long) list.get(i3)).longValue();
            c0081m.I0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i3++;
        }
    }

    public static void R(int i2, List list, F f2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f2.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((C0081m) f2.f1429a).C0((String) list.get(i3), i2);
        }
    }

    public static void S(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0081m c0081m = (C0081m) f2.f1429a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0081m.F0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0081m.E0(i2, 2);
        int iM0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM0 += C0081m.m0(((Integer) list.get(i4)).intValue());
        }
        c0081m.G0(iM0);
        while (i3 < list.size()) {
            c0081m.G0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void T(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0081m c0081m = (C0081m) f2.f1429a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0081m.H0(((Long) list.get(i3)).longValue(), i2);
                i3++;
            }
            return;
        }
        c0081m.E0(i2, 2);
        int iO0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iO0 += C0081m.o0(((Long) list.get(i4)).longValue());
        }
        c0081m.G0(iO0);
        while (i3 < list.size()) {
            c0081m.I0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static int a(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0081m.U(i2) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK0 = C0081m.k0(i2) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int size2 = ((C0075g) list.get(i3)).size();
            iK0 += C0081m.m0(size2) + size2;
        }
        return iK0;
    }

    public static int d(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0081m.k0(i2) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iO0 += C0081m.o0(((Integer) list.get(i2)).intValue());
        }
        return iO0;
    }

    public static int f(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0081m.Y(i2) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0081m.Z(i2) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i2, List list, W w2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iB0 += C0081m.b0(i2, (AbstractC0069a) list.get(i3), w2);
        }
        return iB0;
    }

    public static int k(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0081m.k0(i2) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iO0 += C0081m.o0(((Integer) list.get(i2)).intValue());
        }
        return iO0;
    }

    public static int m(int i2, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0081m.k0(i2) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iO0 += C0081m.o0(((Long) list.get(i2)).longValue());
        }
        return iO0;
    }

    public static int o(int i2, Object obj, W w2) {
        int iK0 = C0081m.k0(i2);
        int iA = ((AbstractC0069a) obj).a(w2);
        return C0081m.m0(iA) + iA + iK0;
    }

    public static int p(int i2, List list, W w2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK0 = C0081m.k0(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            int iA = ((AbstractC0069a) list.get(i3)).a(w2);
            iK0 += C0081m.m0(iA) + iA;
        }
        return iK0;
    }

    public static int q(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0081m.k0(i2) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int iIntValue = ((Integer) list.get(i2)).intValue();
            iM0 += C0081m.m0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iM0;
    }

    public static int s(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0081m.k0(i2) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long jLongValue = ((Long) list.get(i2)).longValue();
            iO0 += C0081m.o0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iO0;
    }

    public static int u(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK0 = C0081m.k0(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C0075g) {
                int size2 = ((C0075g) obj).size();
                iK0 = C0081m.m0(size2) + size2 + iK0;
            } else {
                iK0 = C0081m.j0((String) obj) + iK0;
            }
        }
        return iK0;
    }

    public static int v(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0081m.k0(i2) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM0 += C0081m.m0(((Integer) list.get(i2)).intValue());
        }
        return iM0;
    }

    public static int x(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0081m.k0(i2) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iO0 += C0081m.o0(((Long) list.get(i2)).longValue());
        }
        return iO0;
    }

    public static Object z(Object obj, int i2, InterfaceC0091x interfaceC0091x, Object obj2, e0 e0Var) {
        return obj2;
    }
}
