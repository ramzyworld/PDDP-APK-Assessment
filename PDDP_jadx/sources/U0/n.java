package U0;

import G.M;
import Q0.C0061t;
import Q0.P;
import Q0.Z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n extends B0.b implements T0.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final T0.e f930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z0.i f931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z0.i f933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public z0.d f934l;

    public n(T0.e eVar, z0.i iVar) {
        super(k.f927e, z0.j.f3504e);
        this.f930h = eVar;
        this.f931i = iVar;
        this.f932j = ((Number) iVar.d(0, m.f929f)).intValue();
    }

    @Override // T0.e
    public final Object a(Object obj, z0.d dVar) {
        try {
            Object objP = p(dVar, obj);
            return objP == A0.a.f0e ? objP : p041x0.g.f3419a;
        } catch (Throwable th) {
            this.f933k = new i(th, dVar.i());
            throw th;
        }
    }

    @Override // B0.b
    public final StackTraceElement d() {
        return null;
    }

    @Override // B0.b, B0.c
    public final B0.c g() {
        z0.d dVar = this.f934l;
        if (dVar instanceof B0.c) {
            return (B0.c) dVar;
        }
        return null;
    }

    @Override // B0.b, z0.d
    public final z0.i i() {
        z0.i iVar = this.f933k;
        return iVar == null ? z0.j.f3504e : iVar;
    }

    @Override // B0.b
    public final Object k(Object obj) {
        Throwable thA = p041x0.d.a(obj);
        if (thA != null) {
            this.f933k = new i(thA, i());
        }
        z0.d dVar = this.f934l;
        if (dVar != null) {
            dVar.m(obj);
        }
        return A0.a.f0e;
    }

    public final Object p(z0.d dVar, Object obj) {
        Comparable comparable;
        String strSubstring;
        z0.i iVarI = dVar.i();
        P p2 = (P) iVarI.f(C0061t.f743f);
        if (p2 != null && !p2.b()) {
            throw ((Z) p2).A();
        }
        z0.i iVar = this.f933k;
        if (iVar != iVarI) {
            int i2 = 0;
            if (iVar instanceof i) {
                String str = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((i) iVar).f925e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                I0.i.e(str, "<this>");
                List listAsList = Arrays.asList("\r\n", "\n", "\r");
                I0.i.d(listAsList, "asList(...)");
                List listS = O0.c.S(new O0.g(new P0.b(str, 0, 0, new P0.i(listAsList, false)), new M(1, str)));
                ArrayList<String> arrayList = new ArrayList();
                for (Object obj2 : listS) {
                    if (!P0.j.U((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str2 : arrayList) {
                    int length = str2.length();
                    int length2 = 0;
                    while (true) {
                        if (length2 >= length) {
                            length2 = -1;
                            break;
                        }
                        char cCharAt = str2.charAt(length2);
                        if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                            break;
                        }
                        length2++;
                    }
                    if (length2 == -1) {
                        length2 = str2.length();
                    }
                    arrayList2.add(Integer.valueOf(length2));
                }
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int iIntValue = num != null ? num.intValue() : 0;
                int length3 = str.length();
                listS.size();
                int size = listS.size() - 1;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : listS) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str3 = (String) obj3;
                    if ((i2 == 0 || i2 == size) && P0.j.U(str3)) {
                        strSubstring = null;
                    } else {
                        I0.i.e(str3, "<this>");
                        if (iIntValue < 0) {
                            throw new IllegalArgumentException(("Requested character count " + iIntValue + " is less than zero.").toString());
                        }
                        int length4 = str3.length();
                        if (iIntValue <= length4) {
                            length4 = iIntValue;
                        }
                        strSubstring = str3.substring(length4);
                        I0.i.d(strSubstring, "substring(...)");
                    }
                    if (strSubstring != null) {
                        arrayList3.add(strSubstring);
                    }
                    i2 = i3;
                }
                StringBuilder sb = new StringBuilder(length3);
                p043y0.d.Q(arrayList3, sb, "\n", "", "", -1, "...", null);
                String string = sb.toString();
                I0.i.d(string, "toString(...)");
                throw new IllegalStateException(string.toString());
            }
            if (((Number) iVarI.d(0, new q(this))).intValue() != this.f932j) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f931i + ",\n\t\tbut emission happened in " + iVarI + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f933k = iVarI;
        }
        this.f934l = dVar;
        o oVar = p.f936a;
        T0.e eVar = this.f930h;
        I0.i.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        oVar.getClass();
        Object objA = eVar.a(obj, this);
        if (!I0.i.a(objA, A0.a.f0e)) {
            this.f934l = null;
        }
        return objA;
    }
}
