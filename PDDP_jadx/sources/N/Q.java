package N;

import G.C0013n;
import G.C0015p;
import G.C0016q;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p037u0.C0142n;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements T0.d, Y.h, p011g0.B, p030q0.k, p030q0.c, p030q0.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Q f468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static p011g0.D f469i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f472g;

    public /* synthetic */ Q(int i2, Object obj, Object obj2) {
        this.f470e = i2;
        this.f471f = obj;
        this.f472g = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x007d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x008c A[RETURN, SYNTHETIC] */
    public static int d(Q q2, JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        int i2;
        String str;
        q2.getClass();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            String string = jSONArray.getString(i5);
            int[] iArrC = I.j.c(4);
            int length = iArrC.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    throw new NoSuchFieldException(I0.h.e("No such DeviceOrientation: ", string));
                }
                i2 = iArrC[i6];
                if (i2 == 1) {
                    str = "DeviceOrientation.portraitUp";
                } else if (i2 == 2) {
                    str = "DeviceOrientation.portraitDown";
                } else if (i2 == 3) {
                    str = "DeviceOrientation.landscapeLeft";
                } else {
                    if (i2 != 4) {
                        throw null;
                    }
                    str = "DeviceOrientation.landscapeRight";
                }
                if (str.equals(string)) {
                    break;
                }
                i6++;
            }
            int iB = I.j.b(i2);
            if (iB == 0) {
                i3 |= 1;
            } else if (iB == 1) {
                i3 |= 4;
            } else if (iB == 2) {
                i3 |= 2;
            } else if (iB == 3) {
                i3 |= 8;
            }
            if (i4 == 0) {
                i4 = i3;
            }
        }
        if (i3 == 0) {
            return -1;
        }
        switch (i3) {
            case 2:
                return 0;
            case 3:
            case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
            case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i4 == 2) {
                    return 0;
                }
                if (i4 != 4) {
                    if (i4 != 8) {
                        return 1;
                    }
                    return 8;
                }
                return 9;
            case I.k.LONG_FIELD_NUMBER /* 4 */:
                return 9;
            case I.k.STRING_FIELD_NUMBER /* 5 */:
                return 12;
            case I.k.BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
            default:
                return 1;
        }
    }

    public static ArrayList e(Q q2, JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        p028p0.g gVar;
        q2.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            p028p0.g[] gVarArrValues = p028p0.g.values();
            int length = gVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    throw new NoSuchFieldException(I0.h.e("No such SystemUiOverlay: ", string));
                }
                gVar = gVarArrValues[i3];
                if (gVar.f2914e.equals(string)) {
                    break;
                }
                i3++;
            }
            int iOrdinal = gVar.ordinal();
            if (iOrdinal == 0) {
                arrayList.add(p028p0.g.f2911f);
            } else if (iOrdinal == 1) {
                arrayList.add(p028p0.g.f2912g);
            }
        }
        return arrayList;
    }

    public static int f(Q q2, String str) throws NoSuchFieldException {
        String str2;
        q2.getClass();
        for (int i2 : I.j.c(4)) {
            if (i2 == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i2 == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i2 == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else {
                if (i2 != 4) {
                    throw null;
                }
                str2 = "SystemUiMode.edgeToEdge";
            }
            if (str2.equals(str)) {
                int iB = I.j.b(i2);
                if (iB == 0) {
                    return 1;
                }
                if (iB != 1) {
                    return iB != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(I0.h.e("No such SystemUiMode: ", str));
    }

    public static p028p0.f h(Q q2, JSONObject jSONObject) {
        q2.getClass();
        return new p028p0.f(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? I0.h.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? I0.h.a(jSONObject.getString("systemNavigationBarIconBrightness")) : 0, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static HashMap i(String str, int i2, int i3, int i4, int i5) {
        HashMap map = new HashMap();
        map.put("text", str);
        map.put("selectionBase", Integer.valueOf(i2));
        map.put("selectionExtent", Integer.valueOf(i3));
        map.put("composingBase", Integer.valueOf(i4));
        map.put("composingExtent", Integer.valueOf(i5));
        return map;
    }

    @Override // p011g0.B
    public void a(KeyEvent keyEvent, p011g0.z zVar) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            zVar.a(false);
            return;
        }
        Character chA = ((X0.i) this.f472g).a(keyEvent.getUnicodeChar());
        boolean z2 = action != 0;
        p011g0.t tVar = new p011g0.t(0, zVar);
        p028p0.c cVar = (p028p0.c) this.f471f;
        HashMap map = new HashMap();
        map.put("type", z2 ? "keyup" : "keydown");
        map.put("keymap", "android");
        map.put("flags", Integer.valueOf(keyEvent.getFlags()));
        map.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        map.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        map.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        map.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        map.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        map.put("character", chA.toString());
        map.put("source", Integer.valueOf(keyEvent.getSource()));
        map.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        map.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        cVar.f2897a.f(map, new p011g0.t(1, tVar));
    }

    @Override // p030q0.c
    public void b(Object obj) {
        switch (this.f470e) {
            case 17:
                C0026b c0026b = (C0026b) this.f472g;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c0026b.f477g;
                p028p0.m mVar = (p028p0.m) this.f471f;
                concurrentLinkedQueue.remove(mVar);
                if (!((ConcurrentLinkedQueue) c0026b.f477g).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(mVar.f2953a));
                }
                break;
            default:
                ((p015i0.g) this.f471f).a(((p030q0.j) ((C0013n) ((Q) this.f472g).f472g).f260c).b(obj));
                break;
        }
    }

    @Override // p030q0.k
    public void c(Q q2, p028p0.k kVar) {
        p028p0.b bVar = (p028p0.b) this.f472g;
        if (((C0026b) bVar.f2896f) == null) {
            kVar.c((Map) this.f471f);
            return;
        }
        String str = (String) q2.f471f;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            kVar.b();
            return;
        }
        try {
            this.f471f = Collections.unmodifiableMap(((p011g0.y) ((p011g0.B[]) ((C0026b) bVar.f2896f).f477g)[0]).f1934f);
        } catch (IllegalStateException e2) {
            kVar.a("error", e2.getMessage(), null);
        }
        kVar.c((Map) this.f471f);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // T0.d
    public Object g(T0.e eVar, z0.d dVar) throws Throwable {
        T0.j jVar;
        Throwable th;
        U0.n nVar;
        Q q2;
        T0.e eVar2;
        T0.m mVar;
        C0142n c0142n;
        switch (this.f470e) {
            case 2:
                if (dVar instanceof T0.j) {
                    jVar = (T0.j) dVar;
                    int i2 = jVar.f865i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        jVar.f865i = i2 - Integer.MIN_VALUE;
                    } else {
                        jVar = new T0.j(this, dVar);
                    }
                } else {
                    jVar = new T0.j(this, dVar);
                }
                Object obj = jVar.f864h;
                A0.a aVar = A0.a.f0e;
                int i3 = jVar.f865i;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p000a.a.O(obj);
                        return p041x0.g.f3419a;
                    }
                    nVar = jVar.f869m;
                    eVar2 = jVar.f868l;
                    q2 = jVar.f867k;
                    try {
                        p000a.a.O(obj);
                        nVar.n();
                        T0.q qVar = (T0.q) q2.f472g;
                        jVar.f867k = null;
                        jVar.f868l = null;
                        jVar.f869m = null;
                        jVar.f865i = 2;
                        qVar.g(eVar2, jVar);
                        return aVar;
                    } catch (Throwable th2) {
                        th = th2;
                        nVar.n();
                        throw th;
                    }
                }
                p000a.a.O(obj);
                z0.i iVar = jVar.f4f;
                I0.i.b(iVar);
                U0.n nVar2 = new U0.n(eVar, iVar);
                try {
                    C0015p c0015p = (C0015p) this.f471f;
                    jVar.f867k = this;
                    jVar.f868l = eVar;
                    jVar.f869m = nVar2;
                    jVar.f865i = 1;
                    if (c0015p.h(nVar2, jVar) == aVar) {
                        return aVar;
                    }
                    q2 = this;
                    eVar2 = eVar;
                    nVar = nVar2;
                    nVar.n();
                    T0.q qVar2 = (T0.q) q2.f472g;
                    jVar.f867k = null;
                    jVar.f868l = null;
                    jVar.f869m = null;
                    jVar.f865i = 2;
                    qVar2.g(eVar2, jVar);
                    return aVar;
                } catch (Throwable th3) {
                    th = th3;
                    nVar = nVar2;
                    nVar.n();
                    throw th;
                }
            case 3:
                Object objG = ((Q) this.f471f).g(new T0.l(new I0.n(), eVar, (G.r) this.f472g), dVar);
                return objG == A0.a.f0e ? objG : p041x0.g.f3419a;
            default:
                if (dVar instanceof T0.m) {
                    mVar = (T0.m) dVar;
                    int i4 = mVar.f880i;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        mVar.f880i = i4 - Integer.MIN_VALUE;
                    } else {
                        mVar = new T0.m(this, dVar);
                    }
                } else {
                    mVar = new T0.m(this, dVar);
                }
                Object obj2 = mVar.f879h;
                A0.a aVar2 = A0.a.f0e;
                int i5 = mVar.f880i;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0142n = mVar.f882k;
                    try {
                        p000a.a.O(obj2);
                    } catch (U0.a e2) {
                        e = e2;
                        if (e.f907e != c0142n) {
                            throw e;
                        }
                    }
                    break;
                } else {
                    p000a.a.O(obj2);
                    Q q3 = (Q) this.f471f;
                    C0142n c0142n2 = new C0142n((C0016q) this.f472g, eVar);
                    try {
                        mVar.f882k = c0142n2;
                        mVar.f880i = 1;
                        if (q3.g(c0142n2, mVar) == aVar2) {
                            return aVar2;
                        }
                    } catch (U0.a e3) {
                        e = e3;
                        c0142n = c0142n2;
                        if (e.f907e != c0142n) {
                            throw e;
                        }
                    }
                }
                return p041x0.g.f3419a;
        }
    }

    public View j(int i2, int i3, int i4, int i5) {
        int iS;
        int i6;
        int iT;
        View viewO;
        int left;
        int i7;
        int right;
        int i8;
        w wVar = (w) this.f471f;
        switch (wVar.f550a) {
            case 0:
                iS = wVar.f551b.s();
                break;
            default:
                iS = wVar.f551b.u();
                break;
        }
        switch (wVar.f550a) {
            case 0:
                x xVar = wVar.f551b;
                i6 = xVar.f557f;
                iT = xVar.t();
                break;
            default:
                x xVar2 = wVar.f551b;
                i6 = xVar2.f558g;
                iT = xVar2.r();
                break;
        }
        int i9 = i6 - iT;
        int i10 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            switch (wVar.f550a) {
                case 0:
                    viewO = wVar.f551b.o(i2);
                    break;
                default:
                    viewO = wVar.f551b.o(i2);
                    break;
            }
            switch (wVar.f550a) {
                case 0:
                    y yVar = (y) viewO.getLayoutParams();
                    wVar.f551b.getClass();
                    left = viewO.getLeft() - ((y) viewO.getLayoutParams()).f559a.left;
                    i7 = ((ViewGroup.MarginLayoutParams) yVar).leftMargin;
                    break;
                default:
                    y yVar2 = (y) viewO.getLayoutParams();
                    wVar.f551b.getClass();
                    left = viewO.getTop() - ((y) viewO.getLayoutParams()).f559a.top;
                    i7 = ((ViewGroup.MarginLayoutParams) yVar2).topMargin;
                    break;
            }
            int i11 = left - i7;
            switch (wVar.f550a) {
                case 0:
                    y yVar3 = (y) viewO.getLayoutParams();
                    wVar.f551b.getClass();
                    right = viewO.getRight() + ((y) viewO.getLayoutParams()).f559a.right;
                    i8 = ((ViewGroup.MarginLayoutParams) yVar3).rightMargin;
                    break;
                default:
                    y yVar4 = (y) viewO.getLayoutParams();
                    wVar.f551b.getClass();
                    right = viewO.getBottom() + ((y) viewO.getLayoutParams()).f559a.bottom;
                    i8 = ((ViewGroup.MarginLayoutParams) yVar4).bottomMargin;
                    break;
            }
            int i12 = right + i8;
            P p2 = (P) this.f472g;
            p2.f464b = iS;
            p2.f465c = i9;
            p2.f466d = i11;
            p2.f467e = i12;
            if (i4 != 0) {
                p2.f463a = i4;
                if (p2.a()) {
                    return viewO;
                }
            }
            if (i5 != 0) {
                p2.f463a = i5;
                if (p2.a()) {
                    view = viewO;
                }
            }
            i2 += i10;
        }
        return view;
    }

    public void k(p038v.g gVar) {
        int i2 = gVar.f3221b;
        Handler handler = (Handler) this.f472g;
        p028p0.b bVar = (p028p0.b) this.f471f;
        if (i2 == 0) {
            handler.post(new V0.i(bVar, gVar.f3220a, 3, false));
        } else {
            handler.post(new D.b(bVar, i2));
        }
    }

    @Override // p030q0.d
    public void l(ByteBuffer byteBuffer, p015i0.g gVar) {
        switch (this.f470e) {
            case 21:
                C0013n c0013n = (C0013n) this.f472g;
                try {
                    ((p030q0.b) this.f471f).o(((p030q0.j) c0013n.f260c).a(byteBuffer), new Q(this, gVar, 20, false));
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) c0013n.f259b), "Failed to handle message", e2);
                    gVar.a(null);
                    return;
                }
                break;
            default:
                C0026b c0026b = (C0026b) this.f472g;
                try {
                    ((p030q0.k) this.f471f).c(((p030q0.l) c0026b.f478h).b(byteBuffer), new p028p0.k(1, this, gVar));
                } catch (RuntimeException e3) {
                    Log.e("MethodChannel#".concat((String) c0026b.f476f), "Failed to handle method call", e3);
                    gVar.a(((p030q0.l) c0026b.f478h).d(e3.getMessage(), Log.getStackTraceString(e3)));
                }
                break;
        }
    }

    public /* synthetic */ Q(int i2, boolean z2) {
        this.f470e = i2;
    }

    public /* synthetic */ Q(Object obj, Object obj2, int i2, boolean z2) {
        this.f470e = i2;
        this.f472g = obj;
        this.f471f = obj2;
    }

    public Q(p034s0.a aVar, p028p0.b bVar) {
        this.f470e = 24;
        this.f471f = aVar;
        this.f472g = bVar;
        bVar.f2896f = new p028p0.b(16, this);
    }

    public Q(p028p0.c cVar) {
        this.f470e = 8;
        this.f472g = new X0.i();
        this.f471f = cVar;
    }

    public Q(p028p0.b bVar) {
        this.f470e = 12;
        this.f472g = bVar;
        this.f471f = new HashMap();
    }

    public Q(int i2) {
        this.f470e = i2;
        switch (i2) {
            case 9:
                this.f471f = new LongSparseArray();
                this.f472g = new PriorityQueue();
                break;
            default:
                this.f471f = new ReentrantLock();
                this.f472g = new LinkedHashMap();
                break;
        }
    }

    public Q(View view, InputMethodManager inputMethodManager, p028p0.b bVar) {
        this.f470e = 10;
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f472g = view;
        this.f471f = inputMethodManager;
        bVar.f2896f = this;
    }

    public Q(Y.b bVar) {
        this.f470e = 6;
        Q q2 = new Q(5);
        this.f471f = bVar;
        this.f472g = q2;
    }

    public Q(p015i0.b bVar, int i2) {
        this.f470e = i2;
        switch (i2) {
            case 14:
                p028p0.b bVar2 = new p028p0.b(5, this);
                C0026b c0026b = new C0026b(bVar, "flutter/platform", p030q0.i.f3027a, 10);
                this.f471f = c0026b;
                c0026b.N(bVar2);
                break;
            case 15:
                p028p0.b bVar3 = new p028p0.b(6, this);
                C0026b c0026b2 = new C0026b(bVar, "flutter/platform_views", p030q0.o.f3031a, 10);
                this.f471f = c0026b2;
                c0026b2.N(bVar3);
                break;
            case 16:
            case 17:
            default:
                p028p0.b bVar4 = new p028p0.b(2, this);
                C0026b c0026b3 = new C0026b(bVar, "flutter/localization", p030q0.i.f3027a, 10);
                this.f471f = c0026b3;
                c0026b3.N(bVar4);
                break;
            case 18:
                p028p0.b bVar5 = new p028p0.b(13, this);
                C0026b c0026b4 = new C0026b(bVar, "flutter/textinput", p030q0.i.f3027a, 10);
                this.f471f = c0026b4;
                c0026b4.N(bVar5);
                break;
        }
    }

    public Q(p015i0.b bVar, PackageManager packageManager) {
        this.f470e = 16;
        p028p0.b bVar2 = new p028p0.b(7, this);
        this.f471f = packageManager;
        new C0026b(bVar, "flutter/processtext", p030q0.o.f3031a, 10).N(bVar2);
    }

    public Q(w wVar) {
        this.f470e = 0;
        this.f471f = wVar;
        P p2 = new P();
        p2.f463a = 0;
        this.f472g = p2;
    }

    public Q(ArrayList arrayList, ArrayList arrayList2) {
        this.f470e = 19;
        int size = arrayList.size();
        this.f471f = new int[size];
        this.f472g = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            ((int[]) this.f471f)[i2] = ((Integer) arrayList.get(i2)).intValue();
            ((float[]) this.f472g)[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    public Q(int i2, int i3) {
        this.f470e = 19;
        this.f471f = new int[]{i2, i3};
        this.f472g = new float[]{0.0f, 1.0f};
    }

    public Q(int i2, int i3, int i4) {
        this.f470e = 19;
        this.f471f = new int[]{i2, i3, i4};
        this.f472g = new float[]{0.0f, 0.5f, 1.0f};
    }
}
