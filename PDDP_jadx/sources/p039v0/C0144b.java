package p039v0;

import I0.i;
import java.nio.ByteBuffer;
import p030q0.m;
import p030q0.n;

/* JADX INFO: renamed from: v0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0144b extends n {
    @Override // p030q0.n
    public Object f(byte b2, ByteBuffer byteBuffer) {
        i.e(byteBuffer, "buffer");
        int i2 = 0;
        if (b2 == -127) {
            Long l2 = (Long) e(byteBuffer);
            if (l2 == null) {
                return null;
            }
            int iLongValue = (int) l2.longValue();
            EnumC0158p[] enumC0158pArrValues = EnumC0158p.values();
            int length = enumC0158pArrValues.length;
            while (i2 < length) {
                EnumC0158p enumC0158p = enumC0158pArrValues[i2];
                if (enumC0158p.f3389e == iLongValue) {
                    return enumC0158p;
                }
                i2++;
            }
            return null;
        }
        if (b2 == -126) {
            Long l3 = (Long) e(byteBuffer);
            if (l3 == null) {
                return null;
            }
            int iLongValue2 = (int) l3.longValue();
            EnumC0152j[] enumC0152jArrValues = EnumC0152j.values();
            int length2 = enumC0152jArrValues.length;
            while (i2 < length2) {
                EnumC0152j enumC0152j = enumC0152jArrValues[i2];
                if (enumC0152j.f3372e == iLongValue2) {
                    return enumC0152j;
                }
                i2++;
            }
            return null;
        }
        if (b2 == -125) {
            Long l4 = (Long) e(byteBuffer);
            if (l4 == null) {
                return null;
            }
            int iLongValue3 = (int) l4.longValue();
            EnumC0163v[] enumC0163vArrValues = EnumC0163v.values();
            int length3 = enumC0163vArrValues.length;
            while (i2 < length3) {
                EnumC0163v enumC0163v = enumC0163vArrValues[i2];
                if (enumC0163v.f3401e == iLongValue3) {
                    return enumC0163v;
                }
                i2++;
            }
            return null;
        }
        if (b2 == -124) {
            Long l5 = (Long) e(byteBuffer);
            if (l5 == null) {
                return null;
            }
            int iLongValue4 = (int) l5.longValue();
            O[] oArrValues = O.values();
            int length4 = oArrValues.length;
            while (i2 < length4) {
                O o2 = oArrValues[i2];
                if (o2.f3272e == iLongValue4) {
                    return o2;
                }
                i2++;
            }
            return null;
        }
        if (b2 != -123) {
            return super.f(b2, byteBuffer);
        }
        Long l6 = (Long) e(byteBuffer);
        if (l6 == null) {
            return null;
        }
        int iLongValue5 = (int) l6.longValue();
        EnumC0162u[] enumC0162uArrValues = EnumC0162u.values();
        int length5 = enumC0162uArrValues.length;
        while (i2 < length5) {
            EnumC0162u enumC0162u = enumC0162uArrValues[i2];
            if (enumC0162u.f3398e == iLongValue5) {
                return enumC0162u;
            }
            i2++;
        }
        return null;
    }

    @Override // p030q0.n
    public void k(m mVar, Object obj) {
        if (obj instanceof EnumC0158p) {
            mVar.write(129);
            k(mVar, Integer.valueOf(((EnumC0158p) obj).f3389e));
            return;
        }
        if (obj instanceof EnumC0152j) {
            mVar.write(130);
            k(mVar, Integer.valueOf(((EnumC0152j) obj).f3372e));
            return;
        }
        if (obj instanceof EnumC0163v) {
            mVar.write(131);
            k(mVar, Integer.valueOf(((EnumC0163v) obj).f3401e));
        } else if (obj instanceof O) {
            mVar.write(132);
            k(mVar, Integer.valueOf(((O) obj).f3272e));
        } else if (!(obj instanceof EnumC0162u)) {
            super.k(mVar, obj);
        } else {
            mVar.write(133);
            k(mVar, Integer.valueOf(((EnumC0162u) obj).f3398e));
        }
    }
}
