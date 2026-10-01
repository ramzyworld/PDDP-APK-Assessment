package D;

import G.C0003d;
import G.C0013n;
import G.C0019u;
import G.InterfaceC0008i;
import G.d0;
import G.f0;
import G.m0;
import G.n0;
import N.C0026b;
import N.C0038n;
import N.Q;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p016j.C0112i;
import p016j.InterfaceC0115l;
import p016j.K;

/* JADX INFO: loaded from: classes.dex */
public class j implements T0.d, InterfaceC0008i, L.f, T.p, K, p030q0.d, p030q0.f, p014i.o, InterfaceC0115l, p030q0.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f43e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f44f;

    public /* synthetic */ j(int i2, Object obj) {
        this.f43e = i2;
        this.f44f = obj;
    }

    public static int r(int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i4++;
            if (i4 == i3) {
                i5++;
                i4 = 0;
            } else if (i4 > i3) {
                i5++;
                i4 = 1;
            }
        }
        return i4 + 1 > i3 ? i5 + 1 : i5;
    }

    public static boolean s(int i2) {
        return (48 <= i2 && i2 <= 57) || i2 == 35 || i2 == 42;
    }

    @Override // p014i.o
    public void a(p014i.j jVar, boolean z2) {
        if (jVar instanceof p014i.t) {
            ((p014i.t) jVar).f2153v.j().c(false);
        }
        p014i.o oVar = ((C0112i) this.f44f).f2663i;
        if (oVar != null) {
            oVar.a(jVar, z2);
        }
    }

    @Override // p014i.o
    public boolean b(p014i.t tVar) {
        if (tVar == null) {
            return false;
        }
        tVar.f2154w.getClass();
        C0112i c0112i = (C0112i) this.f44f;
        c0112i.getClass();
        p014i.o oVar = c0112i.f2663i;
        if (oVar != null) {
            return oVar.b(tVar);
        }
        return false;
    }

    @Override // G.InterfaceC0008i
    public Object c(H0.p pVar, B0.g gVar) {
        return ((InterfaceC0008i) this.f44f).c(new J.c(pVar, null), gVar);
    }

    @Override // p016j.K
    public void d(p014i.j jVar, p014i.k kVar) {
        p014i.g gVar = (p014i.g) this.f44f;
        gVar.f2053j.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f2055l;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (jVar == ((p014i.f) arrayList.get(i2)).f2043b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        gVar.f2053j.postAtTime(new p014i.e(this, i3 < arrayList.size() ? (p014i.f) arrayList.get(i3) : null, kVar, jVar), jVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // p030q0.f
    public void e(String str, p030q0.d dVar, H.a aVar) {
        ((p015i0.j) this.f44f).e(str, dVar, aVar);
    }

    @Override // p030q0.f
    public void f(String str, p030q0.d dVar) {
        ((p015i0.j) this.f44f).e(str, dVar, null);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r7v8, types: [B0.g, H0.p] */
    @Override // T0.d
    public Object g(T0.e eVar, z0.d dVar) throws Throwable {
        T0.a aVar;
        Throwable th;
        U0.n nVar;
        switch (this.f43e) {
            case 2:
                Object objG = ((Q) this.f44f).g(new C0019u(eVar, 0), dVar);
                return objG == A0.a.f0e ? objG : p041x0.g.f3419a;
            default:
                if (dVar instanceof T0.a) {
                    aVar = (T0.a) dVar;
                    int i2 = aVar.f841k;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        aVar.f841k = i2 - Integer.MIN_VALUE;
                    } else {
                        aVar = new T0.a(this, dVar);
                    }
                } else {
                    aVar = new T0.a(this, dVar);
                }
                Object obj = aVar.f839i;
                A0.a aVar2 = A0.a.f0e;
                int i3 = aVar.f841k;
                p041x0.g gVar = p041x0.g.f3419a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = aVar.f838h;
                    try {
                        p000a.a.O(obj);
                        nVar.n();
                        return gVar;
                    } catch (Throwable th2) {
                        th = th2;
                        nVar.n();
                        throw th;
                    }
                }
                p000a.a.O(obj);
                z0.i iVar = aVar.f4f;
                I0.i.b(iVar);
                U0.n nVar2 = new U0.n(eVar, iVar);
                try {
                    aVar.f838h = nVar2;
                    aVar.f841k = 1;
                    Object objH = ((B0.g) this.f44f).h(nVar2, aVar);
                    if (objH != aVar2) {
                        objH = gVar;
                    }
                    if (objH == aVar2) {
                        return aVar2;
                    }
                    nVar = nVar2;
                    nVar.n();
                    return gVar;
                } catch (Throwable th3) {
                    th = th3;
                    nVar = nVar2;
                    nVar.n();
                    throw th;
                }
        }
    }

    @Override // G.InterfaceC0008i
    public T0.d getData() {
        return ((InterfaceC0008i) this.f44f).getData();
    }

    @Override // T.p
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) a1.a.d(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f44f).getStatics());
    }

    @Override // T.p
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) a1.a.d(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f44f).getWebkitToCompatConverter());
    }

    @Override // L.f
    public void h(int i2, Serializable serializable) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case I.k.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case I.k.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case I.k.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f44f).setResultCode(i2);
    }

    @Override // p016j.K
    public void i(p014i.j jVar, p014i.k kVar) {
        ((p014i.g) this.f44f).f2053j.removeCallbacksAndMessages(jVar);
    }

    @Override // L.f
    public void j() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // T.p
    public String[] k() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f44f).getSupportedFeatures();
    }

    @Override // p030q0.d
    public void l(ByteBuffer byteBuffer, p015i0.g gVar) {
        p030q0.p.f3033b.getClass();
        p030q0.p.c(byteBuffer);
        ((p015i0.b) this.f44f).getClass();
    }

    @Override // p030q0.f
    public H.a m() {
        return ((p015i0.j) this.f44f).b(new p030q0.i());
    }

    @Override // p030q0.f
    public void n(String str, ByteBuffer byteBuffer, p030q0.e eVar) {
        ((p015i0.j) this.f44f).n(str, byteBuffer, eVar);
    }

    @Override // p030q0.b
    public void o(Object obj, Q q2) {
        C0026b c0026b = (C0026b) this.f44f;
        if (((io.flutter.view.b) c0026b.f478h) == null) {
            q2.b(null);
            return;
        }
        HashMap map = (HashMap) obj;
        String str = (String) map.get("type");
        HashMap map2 = (HashMap) map.get("data");
        str.getClass();
        switch (str) {
            case "tooltip":
                String str2 = (String) map2.get("message");
                if (str2 != null) {
                    io.flutter.view.b bVar = (io.flutter.view.b) c0026b.f478h;
                    if (Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.k kVar = (io.flutter.view.k) bVar.f2394a;
                        AccessibilityEvent accessibilityEventD = kVar.d(0, 32);
                        accessibilityEventD.getText().add(str2);
                        kVar.h(accessibilityEventD);
                    } else {
                        bVar.getClass();
                    }
                    break;
                }
                break;
            case "announce":
                String str3 = (String) map2.get("message");
                if (str3 != null) {
                    ((io.flutter.view.k) ((io.flutter.view.b) c0026b.f478h).f2394a).f2480a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) map.get("nodeId");
                if (num != null) {
                    io.flutter.view.b bVar2 = (io.flutter.view.b) c0026b.f478h;
                    ((io.flutter.view.k) bVar2.f2394a).g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) map.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.b bVar3 = (io.flutter.view.b) c0026b.f478h;
                    ((io.flutter.view.k) bVar3.f2394a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) map.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.b bVar4 = (io.flutter.view.b) c0026b.f478h;
                    ((io.flutter.view.k) bVar4.f2394a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        q2.b(null);
    }

    public m0 p() {
        T0.q qVar = (T0.q) this.f44f;
        qVar.getClass();
        j jVar = U0.l.f928a;
        Object obj = T0.q.f900i.get(qVar);
        if (obj == jVar) {
            obj = null;
        }
        return (m0) obj;
    }

    public void t(int i2, p028p0.o oVar) {
        io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) this.f44f;
        jVar.d();
        jVar.f2297f = oVar;
        jVar.f2296e = new C0038n(2, i2);
        jVar.f2299h.e(jVar);
        C0013n c0013n = oVar.f2966j;
        jVar.f2299h = new io.flutter.plugin.editing.e(c0013n != null ? (p028p0.q) c0013n.f260c : null, jVar.f2292a);
        jVar.e(oVar);
        jVar.f2300i = true;
        if (jVar.f2296e.f534b == 3) {
            jVar.f2306o = false;
        }
        jVar.f2303l = null;
        jVar.f2299h.a(jVar);
    }

    public String toString() {
        switch (this.f43e) {
            case 14:
                return "<" + ((String) this.f44f) + '>';
            default:
                return super.toString();
        }
    }

    public void u(double d2, double d3, double[] dArr) {
        io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) this.f44f;
        jVar.getClass();
        double[] dArr2 = new double[4];
        boolean z2 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d4 = dArr[12];
        double d5 = dArr[15];
        double d6 = d4 / d5;
        dArr2[1] = d6;
        dArr2[0] = d6;
        double d7 = dArr[13] / d5;
        dArr2[3] = d7;
        dArr2[2] = d7;
        io.flutter.plugin.editing.i iVar = new io.flutter.plugin.editing.i(z2, dArr, dArr2);
        iVar.a(d2, 0.0d);
        iVar.a(d2, d3);
        iVar.a(0.0d, d3);
        double d8 = jVar.f2292a.getContext().getResources().getDisplayMetrics().density;
        jVar.f2303l = new Rect((int) (dArr2[0] * d8), (int) (dArr2[2] * d8), (int) Math.ceil(dArr2[1] * d8), (int) Math.ceil(dArr2[3] * d8));
    }

    public void v(p028p0.q qVar) {
        p028p0.q qVar2;
        int i2;
        int i3;
        io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) this.f44f;
        View view = jVar.f2292a;
        if (!jVar.f2300i && (qVar2 = jVar.f2305n) != null && (i2 = qVar2.f2975d) >= 0 && (i3 = qVar2.f2976e) > i2) {
            int i4 = i3 - i2;
            int i5 = qVar.f2976e;
            int i6 = qVar.f2975d;
            boolean z2 = true;
            if (i4 == i5 - i6) {
                int i7 = 0;
                while (true) {
                    if (i7 >= i4) {
                        z2 = false;
                        break;
                    } else if (qVar2.f2972a.charAt(i7 + i2) != qVar.f2972a.charAt(i7 + i6)) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            jVar.f2300i = z2;
        }
        jVar.f2305n = qVar;
        jVar.f2299h.f(qVar);
        if (jVar.f2300i) {
            jVar.f2293b.restartInput(view);
            jVar.f2300i = false;
        }
    }

    public void w(boolean z2) {
        ((WebSettingsBoundaryInterface) this.f44f).setPaymentRequestEnabled(z2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    public void x(m0 m0Var) {
        T0.q qVar;
        Object obj;
        Object obj2;
        I0.i.e(m0Var, "newState");
        do {
            qVar = (T0.q) this.f44f;
            qVar.getClass();
            obj = U0.l.f928a;
            obj2 = T0.q.f900i.get(qVar);
            if (obj2 == obj) {
                obj2 = null;
            }
            m0 m0Var2 = (m0) obj2;
            if (m0Var2 instanceof f0 ? true : I0.i.a(m0Var2, n0.f262b)) {
                m0Var2 = m0Var;
            } else if (m0Var2 instanceof C0003d) {
                if (m0Var.f257a > m0Var2.f257a) {
                    m0Var2 = m0Var;
                }
            } else if (!(m0Var2 instanceof d0)) {
                throw new O.c();
            }
            if (obj2 == null) {
                obj2 = obj;
            }
            if (m0Var2 != null) {
                obj = m0Var2;
            }
        } while (!qVar.c(obj2, obj));
    }

    public /* synthetic */ j(int i2, boolean z2) {
        this.f43e = i2;
    }

    public j(int i2) {
        this.f43e = i2;
        switch (i2) {
            case 3:
                this.f44f = new T0.q(n0.f262b);
                break;
            case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f44f = new SparseIntArray();
                break;
            default:
                this.f44f = new AtomicInteger(0);
                break;
        }
    }

    public j(boolean z2) {
        this.f43e = 4;
        this.f44f = new AtomicBoolean(z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(H0.p pVar) {
        this.f43e = 13;
        this.f44f = (B0.g) pVar;
    }
}
