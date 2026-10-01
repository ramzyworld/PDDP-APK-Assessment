package p039v0;

import I.k;
import I0.h;
import I0.i;
import N.Q;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import java.util.List;
import p000a.a;
import p030q0.b;
import p030q0.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H implements c, b, w0.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3249e;

    public /* synthetic */ H(int i2) {
        this.f3249e = i2;
    }

    @Override // w0.b
    public boolean a(View view) {
        return view.hasFocus();
    }

    @Override // p030q0.c
    public void b(Object obj) {
        switch (this.f3249e) {
            case 0:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest'.", "");
                    int i2 = U.f3282h;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        int i3 = U.f3282h;
                    } else {
                        Object obj2 = list.get(0);
                        i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj2, (String) obj3, (String) list.get(2)));
                        int i4 = U.f3282h;
                    }
                }
                break;
            case 1:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView'.", "");
                    int i5 = U.f3282h;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        int i6 = U.f3282h;
                    } else {
                        Object obj4 = list2.get(0);
                        i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i7 = U.f3282h;
                    }
                }
                break;
            case 2:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage'.", "");
                    int i8 = U.f3282h;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        int i9 = U.f3282h;
                    } else {
                        Object obj6 = list3.get(0);
                        i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj6, (String) obj7, (String) list3.get(2)));
                        int i10 = U.f3282h;
                    }
                }
                break;
            case 3:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt'.", "");
                    int i11 = U.f3282h;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        int i12 = U.f3282h;
                    } else {
                        Object obj8 = list4.get(0);
                        i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        i.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj8, (String) obj9, (String) list4.get(2)));
                        int i13 = U.f3282h;
                    }
                }
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt'.", "");
                    int i14 = U.f3282h;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        int i15 = U.f3282h;
                    } else {
                        Object obj10 = list5.get(0);
                        i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        i.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj10, (String) obj11, (String) list5.get(2)));
                        int i16 = U.f3282h;
                    }
                }
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance'.", "");
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
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance'.", "");
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
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance'.", "");
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
            case k.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance'.", "");
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
            case 9:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance'.", "");
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
            case 10:
            case 12:
            case 18:
            default:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance'.", "");
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
            case 11:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance'.", "");
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
            case 13:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance'.", "");
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
            case 14:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged'.", "");
                    int i17 = h0.f3360h;
                } else {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        int i18 = h0.f3360h;
                    } else {
                        Object obj28 = list14.get(0);
                        i.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list14.get(1);
                        i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj28, (String) obj29, (String) list14.get(2)));
                        int i19 = h0.f3360h;
                    }
                }
                break;
            case 15:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance'.", "");
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
            case 16:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat'.", "");
                    int i20 = b0.f3323d;
                } else {
                    List list16 = (List) obj;
                    if (list16.size() <= 1) {
                        int i21 = b0.f3323d;
                    } else {
                        Object obj32 = list16.get(0);
                        i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                        Object obj33 = list16.get(1);
                        i.c(obj33, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj32, (String) obj33, (String) list16.get(2)));
                        int i22 = b0.f3323d;
                    }
                }
                break;
            case 17:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError'.", "");
                    int i23 = d0.f3343c;
                } else {
                    List list17 = (List) obj;
                    if (list17.size() <= 1) {
                        int i24 = d0.f3343c;
                    } else {
                        Object obj34 = list17.get(0);
                        i.c(obj34, "null cannot be cast to non-null type kotlin.String");
                        Object obj35 = list17.get(1);
                        i.c(obj35, "null cannot be cast to non-null type kotlin.String");
                        a.l(new C0143a((String) obj34, (String) obj35, (String) list17.get(2)));
                        int i25 = d0.f3343c;
                    }
                }
                break;
            case 19:
                if (!(obj instanceof List)) {
                    h.i("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance'.", "");
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
        }
    }

    @Override // p030q0.b
    public void o(Object obj, Q q2) {
        List listN;
        List listN2;
        List listN3;
        switch (this.f3249e) {
            case 10:
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                i.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                WebSettings webSettings = (WebSettings) obj2;
                Object obj3 = list.get(1);
                i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    C0164w.a(webSettings, ((Boolean) obj3).booleanValue());
                    listN = a1.a.t(null);
                } catch (Throwable th) {
                    listN = a1.a.N(th);
                }
                q2.b(listN);
                break;
            case 11:
            default:
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj4 = ((List) obj).get(0);
                i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                try {
                    listN3 = a1.a.t(Boolean.valueOf(a1.a.r((String) obj4)));
                } catch (Throwable th2) {
                    listN3 = a1.a.N(th2);
                }
                q2.b(listN3);
                break;
            case 12:
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj5 = ((List) obj).get(0);
                i.c(obj5, "null cannot be cast to non-null type android.webkit.WebStorage");
                try {
                    ((WebStorage) obj5).deleteAllData();
                    listN2 = a1.a.t(null);
                } catch (Throwable th3) {
                    listN2 = a1.a.N(th3);
                }
                q2.b(listN2);
                break;
        }
    }

    public /* synthetic */ H(int i2, Object obj) {
        this.f3249e = i2;
    }
}
