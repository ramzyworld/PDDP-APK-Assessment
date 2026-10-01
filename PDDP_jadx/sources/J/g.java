package J;

import G.C0002c;
import G.o0;
import I.j;
import I.k;
import I0.i;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0090w;
import androidx.datastore.preferences.protobuf.AbstractC0092y;
import androidx.datastore.preferences.protobuf.C0075g;
import androidx.datastore.preferences.protobuf.C0081m;
import androidx.datastore.preferences.protobuf.InterfaceC0091x;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f348a = new g();

    public final b a(FileInputStream fileInputStream) throws C0002c {
        byte[] bArr;
        try {
            I.f fVarQ = I.f.q(fileInputStream);
            b bVar = new b(false);
            e[] eVarArr = (e[]) Arrays.copyOf(new e[0], 0);
            i.e(eVarArr, "pairs");
            bVar.b();
            if (eVarArr.length > 0) {
                e eVar = eVarArr[0];
                throw null;
            }
            Map mapO = fVarQ.o();
            i.d(mapO, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapO.entrySet()) {
                String str = (String) entry.getKey();
                k kVar = (k) entry.getValue();
                i.d(str, "name");
                i.d(kVar, "value");
                int iE = kVar.E();
                switch (iE == 0 ? -1 : f.f347a[j.b(iE)]) {
                    case -1:
                        throw new C0002c("Value case is null.", null);
                    case 0:
                    default:
                        throw new O.c();
                    case 1:
                        bVar.d(new d(str), Boolean.valueOf(kVar.v()));
                        break;
                    case 2:
                        bVar.d(new d(str), Float.valueOf(kVar.z()));
                        break;
                    case 3:
                        bVar.d(new d(str), Double.valueOf(kVar.y()));
                        break;
                    case k.LONG_FIELD_NUMBER /* 4 */:
                        bVar.d(new d(str), Integer.valueOf(kVar.A()));
                        break;
                    case k.STRING_FIELD_NUMBER /* 5 */:
                        bVar.d(new d(str), Long.valueOf(kVar.B()));
                        break;
                    case k.STRING_SET_FIELD_NUMBER /* 6 */:
                        d dVar = new d(str);
                        String strC = kVar.C();
                        i.d(strC, "value.string");
                        bVar.d(dVar, strC);
                        break;
                    case k.DOUBLE_FIELD_NUMBER /* 7 */:
                        d dVar2 = new d(str);
                        InterfaceC0091x interfaceC0091xP = kVar.D().p();
                        i.d(interfaceC0091xP, "value.stringSet.stringsList");
                        bVar.d(dVar2, p043y0.d.U(interfaceC0091xP));
                        break;
                    case k.BYTES_FIELD_NUMBER /* 8 */:
                        d dVar3 = new d(str);
                        C0075g c0075gW = kVar.w();
                        int size = c0075gW.size();
                        if (size == 0) {
                            bArr = AbstractC0092y.f1578b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            c0075gW.d(bArr2, size);
                            bArr = bArr2;
                        }
                        i.d(bArr, "value.bytes.toByteArray()");
                        bVar.d(dVar3, bArr);
                        break;
                    case 9:
                        throw new C0002c("Value not set.", null);
                }
            }
            return new b(new LinkedHashMap(bVar.a()), true);
        } catch (A e2) {
            throw new C0002c("Unable to parse preferences proto.", e2);
        }
    }

    public final void b(Object obj, o0 o0Var) throws IOException {
        AbstractC0090w abstractC0090wA;
        Map mapA = ((b) obj).a();
        I.d dVarP = I.f.p();
        for (Map.Entry entry : mapA.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f346a;
            if (value instanceof Boolean) {
                I.i iVarF = k.F();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                iVarF.c();
                k.s((k) iVarF.f1576f, zBooleanValue);
                abstractC0090wA = iVarF.a();
            } else if (value instanceof Float) {
                I.i iVarF2 = k.F();
                float fFloatValue = ((Number) value).floatValue();
                iVarF2.c();
                k.t((k) iVarF2.f1576f, fFloatValue);
                abstractC0090wA = iVarF2.a();
            } else if (value instanceof Double) {
                I.i iVarF3 = k.F();
                double dDoubleValue = ((Number) value).doubleValue();
                iVarF3.c();
                k.q((k) iVarF3.f1576f, dDoubleValue);
                abstractC0090wA = iVarF3.a();
            } else if (value instanceof Integer) {
                I.i iVarF4 = k.F();
                int iIntValue = ((Number) value).intValue();
                iVarF4.c();
                k.u((k) iVarF4.f1576f, iIntValue);
                abstractC0090wA = iVarF4.a();
            } else if (value instanceof Long) {
                I.i iVarF5 = k.F();
                long jLongValue = ((Number) value).longValue();
                iVarF5.c();
                k.n((k) iVarF5.f1576f, jLongValue);
                abstractC0090wA = iVarF5.a();
            } else if (value instanceof String) {
                I.i iVarF6 = k.F();
                iVarF6.c();
                k.o((k) iVarF6.f1576f, (String) value);
                abstractC0090wA = iVarF6.a();
            } else if (value instanceof Set) {
                I.i iVarF7 = k.F();
                I.g gVarQ = I.h.q();
                i.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                gVarQ.c();
                I.h.n((I.h) gVarQ.f1576f, (Set) value);
                iVarF7.c();
                k.p((k) iVarF7.f1576f, (I.h) gVarQ.a());
                abstractC0090wA = iVarF7.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                I.i iVarF8 = k.F();
                byte[] bArr = (byte[]) value;
                C0075g c0075g = C0075g.f1501g;
                C0075g c0075gC = C0075g.c(bArr, 0, bArr.length);
                iVarF8.c();
                k.r((k) iVarF8.f1576f, c0075gC);
                abstractC0090wA = iVarF8.a();
            }
            dVarP.getClass();
            str.getClass();
            dVarP.c();
            I.f.n((I.f) dVarP.f1576f).put(str, (k) abstractC0090wA);
        }
        I.f fVar = (I.f) dVarP.a();
        int iA = fVar.a(null);
        Logger logger = C0081m.f1536r;
        if (iA > 4096) {
            iA = 4096;
        }
        C0081m c0081m = new C0081m(o0Var, iA);
        fVar.b(c0081m);
        if (c0081m.f1541p > 0) {
            c0081m.p0();
        }
    }
}
