package p039v0;

import G.C0013n;
import G.M;
import H0.l;
import I0.i;
import a1.a;
import android.net.Uri;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.List;
import java.util.Objects;
import p030q0.f;
import p038v.d;
import p043y0.e;

/* JADX INFO: loaded from: classes.dex */
public final class U extends Q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f3282h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0151i f3283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3284c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3285d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3286e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3287f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3288g = false;

    public U(C0151i c0151i) {
        this.f3283b = c0151i;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C0156n c0156n = new C0156n(1);
        C0151i c0151i = this.f3283b;
        c0151i.getClass();
        i.e(consoleMessage, "messageArg");
        d dVar = c0151i.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage", dVar.a(), (Object) null).f(e.P(this, consoleMessage), new H(2, c0156n));
        return this.f3285d;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        C0156n c0156n = new C0156n(1);
        C0151i c0151i = this.f3283b;
        c0151i.getClass();
        d dVar = c0151i.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt", dVar.a(), (Object) null).f(a.t(this), new H(4, c0156n));
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        C0156n c0156n = new C0156n(1);
        C0151i c0151i = this.f3283b;
        c0151i.getClass();
        i.e(str, "originArg");
        i.e(callback, "callbackArg");
        d dVar = c0151i.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt", dVar.a(), (Object) null).f(e.P(this, str, callback), new H(3, c0156n));
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        C0156n c0156n = new C0156n(1);
        C0151i c0151i = this.f3283b;
        c0151i.getClass();
        d dVar = c0151i.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView", dVar.a(), (Object) null).f(a.t(this), new C0165x(28, c0156n));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (!this.f3286e) {
            return false;
        }
        M m2 = new M(4, new S(this, jsResult, 1));
        C0151i c0151i = this.f3283b;
        c0151i.getClass();
        i.e(webView, "webViewArg");
        i.e(str, "urlArg");
        i.e(str2, "messageArg");
        d dVar = c0151i.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert", dVar.a(), (Object) null).f(e.P(this, webView, str, str2), new G(m2, 1));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (!this.f3287f) {
            return false;
        }
        M m2 = new M(4, new S(this, jsResult, 0));
        C0151i c0151i = this.f3283b;
        c0151i.getClass();
        i.e(webView, "webViewArg");
        i.e(str, "urlArg");
        i.e(str2, "messageArg");
        d dVar = c0151i.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm", dVar.a(), (Object) null).f(e.P(this, webView, str, str2), new G(m2, 3));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (!this.f3288g) {
            return false;
        }
        M m2 = new M(4, new S(this, jsPromptResult, 2));
        C0151i c0151i = this.f3283b;
        c0151i.getClass();
        i.e(webView, "webViewArg");
        i.e(str, "urlArg");
        i.e(str2, "messageArg");
        i.e(str3, "defaultValueArg");
        d dVar = c0151i.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt", dVar.a(), (Object) null).f(e.P(this, webView, str, str2, str3), new G(m2, 0));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        C0156n c0156n = new C0156n(1);
        C0151i c0151i = this.f3283b;
        c0151i.getClass();
        i.e(permissionRequest, "requestArg");
        d dVar = c0151i.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest", dVar.a(), (Object) null).f(e.P(this, permissionRequest), new H(0, c0156n));
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i2) {
        long j2 = i2;
        C0156n c0156n = new C0156n(1);
        C0151i c0151i = this.f3283b;
        c0151i.getClass();
        i.e(webView, "webViewArg");
        d dVar = c0151i.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged", dVar.a(), (Object) null).f(e.P(this, webView, Long.valueOf(j2)), new C0165x(29, c0156n));
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        C0156n c0156n = new C0156n(1);
        C0151i c0151i = this.f3283b;
        c0151i.getClass();
        i.e(view, "viewArg");
        i.e(customViewCallback, "callbackArg");
        d dVar = c0151i.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView", dVar.a(), (Object) null).f(e.P(this, view, customViewCallback), new H(1, c0156n));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, final ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        final boolean z2 = this.f3284c;
        M m2 = new M(4, new l() { // from class: v0.T
            @Override // H0.l
            public final Object j(Object obj) {
                N n2 = (N) obj;
                U u2 = this.f3279e;
                u2.getClass();
                if (n2.f3263d) {
                    d dVar = u2.f3283b.f3364a;
                    Throwable th = n2.f3262c;
                    Objects.requireNonNull(th);
                    dVar.getClass();
                    d.b(th);
                    return null;
                }
                List list = (List) n2.f3261b;
                Objects.requireNonNull(list);
                if (!z2) {
                    return null;
                }
                Uri[] uriArr = new Uri[list.size()];
                for (int i2 = 0; i2 < list.size(); i2++) {
                    uriArr[i2] = Uri.parse((String) list.get(i2));
                }
                valueCallback.onReceiveValue(uriArr);
                return null;
            }
        });
        C0151i c0151i = this.f3283b;
        c0151i.getClass();
        i.e(webView, "webViewArg");
        i.e(fileChooserParams, "paramsArg");
        d dVar = c0151i.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser", dVar.a(), (Object) null).f(e.P(this, webView, fileChooserParams), new G(m2, 2));
        return z2;
    }
}
