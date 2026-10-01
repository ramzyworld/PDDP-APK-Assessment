package p039v0;

import I.k;
import I0.h;
import I0.i;
import N.Q;
import android.net.http.SslError;
import android.os.Message;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import p000a.a;
import p030q0.b;
import p030q0.c;

/* JADX INFO: renamed from: v0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0165x implements c, b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3402e;

    public /* synthetic */ C0165x(int i2) {
        this.f3402e = i2;
    }

    @Override // p030q0.c
    public void b(Object obj) {
        switch (this.f3402e) {
            case 0:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance'.", "");
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj2 = list.get(0);
                        i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj2, (String) obj3, (String) list.get(2)));
                    }
                }
                break;
            case 1:
            case 3:
            case k.BYTES_FIELD_NUMBER /* 8 */:
            case 13:
            case 17:
            case 18:
            case 23:
            case 25:
            case 26:
            default:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged'.", "");
                    int i2 = U.f3282h;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        int i3 = U.f3282h;
                    } else {
                        Object obj4 = list2.get(0);
                        i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i4 = U.f3282h;
                    }
                }
                break;
            case 2:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance'.", "");
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj6 = list3.get(0);
                        i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj6, (String) obj7, (String) list3.get(2)));
                    }
                }
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance'.", "");
                } else {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        Object obj8 = list4.get(0);
                        i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        i.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj8, (String) obj9, (String) list4.get(2)));
                    }
                }
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance'.", "");
                } else {
                    List list5 = (List) obj;
                    if (list5.size() > 1) {
                        Object obj10 = list5.get(0);
                        i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        i.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj10, (String) obj11, (String) list5.get(2)));
                    }
                }
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance'.", "");
                } else {
                    List list6 = (List) obj;
                    if (list6.size() > 1) {
                        Object obj12 = list6.get(0);
                        i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj12, (String) obj13, (String) list6.get(2)));
                    }
                }
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance'.", "");
                } else {
                    List list7 = (List) obj;
                    if (list7.size() > 1) {
                        Object obj14 = list7.get(0);
                        i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        i.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj14, (String) obj15, (String) list7.get(2)));
                    }
                }
                break;
            case 9:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart'.", "");
                } else {
                    List list8 = (List) obj;
                    if (list8.size() > 1) {
                        Object obj16 = list8.get(0);
                        i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        i.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj16, (String) obj17, (String) list8.get(2)));
                    }
                }
                break;
            case 10:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance'.", "");
                } else {
                    List list9 = (List) obj;
                    if (list9.size() > 1) {
                        Object obj18 = list9.get(0);
                        i.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj18, (String) obj19, (String) list9.get(2)));
                    }
                }
                break;
            case 11:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance'.", "");
                } else {
                    List list10 = (List) obj;
                    if (list10.size() > 1) {
                        Object obj20 = list10.get(0);
                        i.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list10.get(1);
                        i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj20, (String) obj21, (String) list10.get(2)));
                    }
                }
                break;
            case 12:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance'.", "");
                } else {
                    List list11 = (List) obj;
                    if (list11.size() > 1) {
                        Object obj22 = list11.get(0);
                        i.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        Object obj23 = list11.get(1);
                        i.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj22, (String) obj23, (String) list11.get(2)));
                    }
                }
                break;
            case 14:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance'.", "");
                } else {
                    List list12 = (List) obj;
                    if (list12.size() > 1) {
                        Object obj24 = list12.get(0);
                        i.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list12.get(1);
                        i.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj24, (String) obj25, (String) list12.get(2)));
                    }
                }
                break;
            case 15:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage'.", "");
                } else {
                    List list13 = (List) obj;
                    if (list13.size() > 1) {
                        Object obj26 = list13.get(0);
                        i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list13.get(1);
                        i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj26, (String) obj27, (String) list13.get(2)));
                    }
                }
                break;
            case 16:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance'.", "");
                } else {
                    List list14 = (List) obj;
                    if (list14.size() > 1) {
                        Object obj28 = list14.get(0);
                        i.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list14.get(1);
                        i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj28, (String) obj29, (String) list14.get(2)));
                    }
                }
                break;
            case 19:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance'.", "");
                } else {
                    List list15 = (List) obj;
                    if (list15.size() > 1) {
                        Object obj30 = list15.get(0);
                        i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list15.get(1);
                        i.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj30, (String) obj31, (String) list15.get(2)));
                    }
                }
                break;
            case 20:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance'.", "");
                } else {
                    List list16 = (List) obj;
                    if (list16.size() > 1) {
                        Object obj32 = list16.get(0);
                        i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                        Object obj33 = list16.get(1);
                        i.c(obj33, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj32, (String) obj33, (String) list16.get(2)));
                    }
                }
                break;
            case 21:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance'.", "");
                } else {
                    List list17 = (List) obj;
                    if (list17.size() > 1) {
                        Object obj34 = list17.get(0);
                        i.c(obj34, "null cannot be cast to non-null type kotlin.String");
                        Object obj35 = list17.get(1);
                        i.c(obj35, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj34, (String) obj35, (String) list17.get(2)));
                    }
                }
                break;
            case 22:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance'.", "");
                } else {
                    List list18 = (List) obj;
                    if (list18.size() > 1) {
                        Object obj36 = list18.get(0);
                        i.c(obj36, "null cannot be cast to non-null type kotlin.String");
                        Object obj37 = list18.get(1);
                        i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj36, (String) obj37, (String) list18.get(2)));
                    }
                }
                break;
            case 24:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance'.", "");
                } else {
                    List list19 = (List) obj;
                    if (list19.size() > 1) {
                        Object obj38 = list19.get(0);
                        i.c(obj38, "null cannot be cast to non-null type kotlin.String");
                        Object obj39 = list19.get(1);
                        i.c(obj39, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj38, (String) obj39, (String) list19.get(2)));
                    }
                }
                break;
            case 27:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance'.", "");
                } else {
                    List list20 = (List) obj;
                    if (list20.size() > 1) {
                        Object obj40 = list20.get(0);
                        i.c(obj40, "null cannot be cast to non-null type kotlin.String");
                        Object obj41 = list20.get(1);
                        i.c(obj41, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj40, (String) obj41, (String) list20.get(2)));
                    }
                }
                break;
            case 28:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView'.", "");
                    int i5 = U.f3282h;
                } else {
                    List list21 = (List) obj;
                    if (list21.size() <= 1) {
                        int i6 = U.f3282h;
                    } else {
                        Object obj42 = list21.get(0);
                        i.c(obj42, "null cannot be cast to non-null type kotlin.String");
                        Object obj43 = list21.get(1);
                        i.c(obj43, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj42, (String) obj43, (String) list21.get(2)));
                        int i7 = U.f3282h;
                    }
                }
                break;
        }
    }

    @Override // p030q0.b
    public void o(Object obj, Q q2) {
        List listN;
        List listN2;
        List listN3;
        List listN4;
        List listN5;
        List listN6;
        List listN7;
        O o2;
        List listN8;
        List listN9;
        switch (this.f3402e) {
            case 1:
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                i.c(obj2, "null cannot be cast to non-null type android.os.Message");
                try {
                    ((Message) obj2).sendToTarget();
                    listN = a1.a.t(null);
                    break;
                } catch (Throwable th) {
                    listN = a1.a.N(th);
                }
                q2.b(listN);
                return;
            case 3:
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj3 = ((List) obj).get(0);
                i.c(obj3, "null cannot be cast to non-null type java.security.cert.Certificate");
                try {
                    try {
                        listN2 = a1.a.t(((Certificate) obj3).getEncoded());
                    } catch (CertificateEncodingException e2) {
                        throw new RuntimeException(e2);
                    }
                } catch (Throwable th2) {
                    listN2 = a1.a.N(th2);
                }
                q2.b(listN2);
                return;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj4 = ((List) obj).get(0);
                i.c(obj4, "null cannot be cast to non-null type android.webkit.WebChromeClient.CustomViewCallback");
                try {
                    ((WebChromeClient.CustomViewCallback) obj4).onCustomViewHidden();
                    listN3 = a1.a.t(null);
                    break;
                } catch (Throwable th3) {
                    listN3 = a1.a.N(th3);
                }
                q2.b(listN3);
                return;
            case 13:
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj5 = list.get(0);
                i.c(obj5, "null cannot be cast to non-null type android.webkit.GeolocationPermissions.Callback");
                GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj5;
                Object obj6 = list.get(1);
                i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj6;
                Object obj7 = list.get(2);
                i.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                Object obj8 = list.get(3);
                i.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    callback.invoke(str, zBooleanValue, ((Boolean) obj8).booleanValue());
                    listN4 = a1.a.t(null);
                    break;
                } catch (Throwable th4) {
                    listN4 = a1.a.N(th4);
                }
                q2.b(listN4);
                return;
            case 17:
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj9 = list2.get(0);
                i.c(obj9, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                PermissionRequest permissionRequest = (PermissionRequest) obj9;
                Object obj10 = list2.get(1);
                i.c(obj10, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                try {
                    permissionRequest.grant((String[]) ((List) obj10).toArray(new String[0]));
                    listN5 = a1.a.t(null);
                    break;
                } catch (Throwable th5) {
                    listN5 = a1.a.N(th5);
                }
                q2.b(listN5);
                return;
            case 18:
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj11 = ((List) obj).get(0);
                i.c(obj11, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                try {
                    ((PermissionRequest) obj11).deny();
                    listN6 = a1.a.t(null);
                    break;
                } catch (Throwable th6) {
                    listN6 = a1.a.N(th6);
                }
                q2.b(listN6);
                return;
            case 23:
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj12 = ((List) obj).get(0);
                i.c(obj12, "null cannot be cast to non-null type android.net.http.SslError");
                try {
                    int primaryError = ((SslError) obj12).getPrimaryError();
                    if (primaryError == 0) {
                        o2 = O.f3268j;
                    } else if (primaryError == 1) {
                        o2 = O.f3265g;
                    } else if (primaryError == 2) {
                        o2 = O.f3266h;
                    } else if (primaryError == 3) {
                        o2 = O.f3269k;
                    } else if (primaryError != 4) {
                        o2 = primaryError != 5 ? O.f3270l : O.f3267i;
                    } else {
                        o2 = O.f3264f;
                    }
                    listN7 = a1.a.t(o2);
                    break;
                } catch (Throwable th7) {
                    listN7 = a1.a.N(th7);
                }
                q2.b(listN7);
                return;
            case 25:
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj13 = ((List) obj).get(0);
                i.c(obj13, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj13).cancel();
                    listN8 = a1.a.t(null);
                    break;
                } catch (Throwable th8) {
                    listN8 = a1.a.N(th8);
                }
                q2.b(listN8);
                return;
            default:
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj14 = ((List) obj).get(0);
                i.c(obj14, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj14).proceed();
                    listN9 = a1.a.t(null);
                    break;
                } catch (Throwable th9) {
                    listN9 = a1.a.N(th9);
                }
                q2.b(listN9);
                return;
        }
    }

    public /* synthetic */ C0165x(int i2, Object obj) {
        this.f3402e = i2;
    }
}
