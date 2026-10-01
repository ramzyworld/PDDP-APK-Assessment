package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1549c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f1550a = Y.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1551b;

    static {
        new r(0);
    }

    public r() {
    }

    public static void b(C0081m c0081m, r0 r0Var, int i2, Object obj) {
        if (r0Var == r0.f1553h) {
            c0081m.E0(i2, 3);
            ((AbstractC0069a) obj).b(c0081m);
            c0081m.E0(i2, 4);
            return;
        }
        c0081m.E0(i2, r0Var.f1557f);
        switch (r0Var.ordinal()) {
            case 0:
                c0081m.z0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0081m.x0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0081m.I0(((Long) obj).longValue());
                break;
            case 3:
                c0081m.I0(((Long) obj).longValue());
                break;
            case I.k.LONG_FIELD_NUMBER /* 4 */:
                c0081m.B0(((Integer) obj).intValue());
                break;
            case I.k.STRING_FIELD_NUMBER /* 5 */:
                c0081m.z0(((Long) obj).longValue());
                break;
            case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                c0081m.x0(((Integer) obj).intValue());
                break;
            case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                c0081m.r0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case I.k.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof C0075g)) {
                    c0081m.D0((String) obj);
                } else {
                    c0081m.v0((C0075g) obj);
                }
                break;
            case 9:
                ((AbstractC0069a) obj).b(c0081m);
                break;
            case 10:
                AbstractC0069a abstractC0069a = (AbstractC0069a) obj;
                c0081m.getClass();
                c0081m.G0(((AbstractC0090w) abstractC0069a).a(null));
                abstractC0069a.b(c0081m);
                break;
            case 11:
                if (!(obj instanceof C0075g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0081m.G0(length);
                    c0081m.s0(bArr, 0, length);
                } else {
                    c0081m.v0((C0075g) obj);
                }
                break;
            case 12:
                c0081m.G0(((Integer) obj).intValue());
                break;
            case 13:
                c0081m.B0(((Integer) obj).intValue());
                break;
            case 14:
                c0081m.x0(((Integer) obj).intValue());
                break;
            case 15:
                c0081m.z0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c0081m.G0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c0081m.I0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f1551b) {
            return;
        }
        Y y2 = this.f1550a;
        int size = y2.f1473e.size();
        for (int i2 = 0; i2 < size; i2++) {
            Map.Entry entryC = y2.c(i2);
            if (entryC.getValue() instanceof AbstractC0090w) {
                AbstractC0090w abstractC0090w = (AbstractC0090w) entryC.getValue();
                abstractC0090w.getClass();
                T t = T.f1459c;
                t.getClass();
                t.a(abstractC0090w.getClass()).h(abstractC0090w);
                abstractC0090w.j();
            }
        }
        if (!y2.f1475g) {
            if (y2.f1473e.size() > 0) {
                y2.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = y2.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!y2.f1475g) {
            y2.f1474f = y2.f1474f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(y2.f1474f);
            y2.f1477i = y2.f1477i.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(y2.f1477i);
            y2.f1475g = true;
        }
        this.f1551b = true;
    }

    public final Object clone() {
        r rVar = new r();
        Y y2 = this.f1550a;
        if (y2.f1473e.size() > 0) {
            Map.Entry entryC = y2.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = y2.d().iterator();
        if (!it.hasNext()) {
            return rVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f1550a.equals(((r) obj).f1550a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1550a.hashCode();
    }

    public r(int i2) {
        a();
        a();
    }
}
