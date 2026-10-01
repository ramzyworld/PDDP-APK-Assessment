package p011g0;

import I.k;
import I0.i;
import N.Q;
import android.net.http.SslError;
import android.util.Log;
import android.view.View;
import android.webkit.WebStorage;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.a;
import p030q0.b;
import p030q0.c;
import p039v0.C0143a;
import p039v0.C0145c;
import p039v0.C0150h;
import p039v0.C0151i;
import p039v0.C0157o;
import p039v0.C0161t;
import p039v0.O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements c, b, w0.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1916f;

    public /* synthetic */ t(int i2, Object obj) {
        this.f1915e = i2;
        this.f1916f = obj;
    }

    @Override // w0.b
    public boolean a(View view) {
        int i2 = 0;
        while (true) {
            Class[] clsArr = (Class[]) this.f1916f;
            if (i2 >= clsArr.length) {
                return false;
            }
            if (clsArr[i2].isInstance(view)) {
                return true;
            }
            i2++;
        }
    }

    @Override // p030q0.c
    public void b(Object obj) {
        switch (this.f1915e) {
            case 1:
                boolean z2 = false;
                if (obj != null) {
                    try {
                        z2 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e2) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
                    }
                }
                ((z) ((t) this.f1916f).f1916f).a(z2);
                break;
            default:
                boolean z3 = obj instanceof List;
                long j2 = ((C0150h) this.f1916f).f3359f;
                if (!z3) {
                    a.l(new C0143a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference'.", ""));
                    Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j2);
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj2 = list.get(0);
                        i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj2, (String) obj3, (String) list.get(2)));
                        Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j2);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p030q0.b
    public void o(Object obj, Q q2) {
        List listN;
        List listN2;
        List listN3;
        List listN4;
        switch (this.f1915e) {
            case k.LONG_FIELD_NUMBER /* 4 */:
                C0151i c0151i = (C0151i) this.f1916f;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                i.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C0145c) c0151i.f3364a.f3209c).a(((Long) obj2).longValue(), new C0157o(c0151i));
                    listN = a1.a.t(null);
                    break;
                } catch (Throwable th) {
                    listN = a1.a.N(th);
                }
                q2.b(listN);
                return;
            case k.STRING_FIELD_NUMBER /* 5 */:
                C0151i c0151i2 = (C0151i) this.f1916f;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj3 = list.get(0);
                i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue = ((Long) obj3).longValue();
                Object obj4 = list.get(1);
                i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                try {
                    ((C0145c) c0151i2.f3364a.f3209c).a(jLongValue, new C0161t((String) obj4, c0151i2));
                    listN2 = a1.a.t(null);
                    break;
                } catch (Throwable th2) {
                    listN2 = a1.a.N(th2);
                }
                q2.b(listN2);
                return;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                C0151i c0151i3 = (C0151i) this.f1916f;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                int i2 = 0;
                Object obj5 = list2.get(0);
                i.c(obj5, "null cannot be cast to non-null type android.net.http.SslError");
                SslError sslError = (SslError) obj5;
                Object obj6 = list2.get(1);
                i.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.SslErrorType");
                O o2 = (O) obj6;
                try {
                    switch (o2.ordinal()) {
                        case 0:
                            i2 = 4;
                            listN3 = a1.a.t(Boolean.valueOf(sslError.hasError(i2)));
                            q2.b(listN3);
                            return;
                        case 1:
                            i2 = 1;
                            listN3 = a1.a.t(Boolean.valueOf(sslError.hasError(i2)));
                            q2.b(listN3);
                            return;
                        case 2:
                            i2 = 2;
                            listN3 = a1.a.t(Boolean.valueOf(sslError.hasError(i2)));
                            q2.b(listN3);
                            return;
                        case 3:
                            i2 = 5;
                            listN3 = a1.a.t(Boolean.valueOf(sslError.hasError(i2)));
                            q2.b(listN3);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            listN3 = a1.a.t(Boolean.valueOf(sslError.hasError(i2)));
                            q2.b(listN3);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            i2 = 3;
                            listN3 = a1.a.t(Boolean.valueOf(sslError.hasError(i2)));
                            q2.b(listN3);
                            return;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            c0151i3.f3364a.getClass();
                            throw new IllegalArgumentException(o2 + " doesn't represent a native value.");
                        default:
                            i2 = -1;
                            listN3 = a1.a.t(Boolean.valueOf(sslError.hasError(i2)));
                            q2.b(listN3);
                            return;
                    }
                } catch (Throwable th3) {
                    listN3 = a1.a.N(th3);
                }
                break;
            default:
                C0151i c0151i4 = (C0151i) this.f1916f;
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj7 = ((List) obj).get(0);
                i.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj7).longValue(), WebStorage.getInstance());
                    listN4 = a1.a.t(null);
                    break;
                } catch (Throwable th4) {
                    listN4 = a1.a.N(th4);
                }
                q2.b(listN4);
                return;
        }
    }
}
