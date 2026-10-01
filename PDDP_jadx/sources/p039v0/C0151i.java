package p039v0;

import G.C0013n;
import H0.l;
import I.k;
import I0.i;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.http.SslError;
import android.os.Message;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.view.r;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.a;
import p030q0.f;
import p038v.d;
import p043y0.e;

/* JADX INFO: renamed from: v0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0151i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f3364a;

    public C0151i(d dVar, int i2) {
        switch (i2) {
            case 1:
                i.e(dVar, "pigeonRegistrar");
                this.f3364a = dVar;
                break;
            case 2:
                i.e(dVar, "pigeonRegistrar");
                this.f3364a = dVar;
                break;
            case 3:
                i.e(dVar, "pigeonRegistrar");
                this.f3364a = dVar;
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                i.e(dVar, "pigeonRegistrar");
                this.f3364a = dVar;
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                i.e(dVar, "pigeonRegistrar");
                this.f3364a = dVar;
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                i.e(dVar, "pigeonRegistrar");
                this.f3364a = dVar;
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                i.e(dVar, "pigeonRegistrar");
                this.f3364a = dVar;
                break;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                i.e(dVar, "pigeonRegistrar");
                this.f3364a = dVar;
                break;
            case 9:
                i.e(dVar, "pigeonRegistrar");
                this.f3364a = dVar;
                break;
            case 10:
                i.e(dVar, "pigeonRegistrar");
                this.f3364a = dVar;
                break;
            case 11:
                i.e(dVar, "pigeonRegistrar");
                this.f3364a = dVar;
                break;
            case 12:
                i.e(dVar, "pigeonRegistrar");
                this.f3364a = dVar;
                break;
            case 13:
                i.e(dVar, "pigeonRegistrar");
                this.f3364a = dVar;
                break;
            case 14:
                i.e(dVar, "pigeonRegistrar");
                this.f3364a = dVar;
                break;
            default:
                i.e(dVar, "pigeonRegistrar");
                this.f3364a = dVar;
                break;
        }
    }

    public void a(WebViewClient webViewClient, WebView webView, String str, boolean z2, l lVar) {
        i.e(webViewClient, "pigeon_instanceArg");
        i.e(webView, "webViewArg");
        i.e(str, "urlArg");
        d dVar = this.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory", dVar.a(), (Object) null).f(e.P(webViewClient, webView, str, Boolean.valueOf(z2)), new L(2, lVar));
    }

    public void b(WebViewClient webViewClient, WebView webView, Message message, Message message2, l lVar) {
        i.e(webViewClient, "pigeon_instanceArg");
        i.e(webView, "viewArg");
        i.e(message, "dontResendArg");
        i.e(message2, "resendArg");
        d dVar = this.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission", dVar.a(), (Object) null).f(e.P(webViewClient, webView, message, message2), new L(13, lVar));
    }

    public void c(WebViewClient webViewClient, WebView webView, String str, l lVar) {
        i.e(webViewClient, "pigeon_instanceArg");
        i.e(webView, "viewArg");
        i.e(str, "urlArg");
        d dVar = this.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource", dVar.a(), (Object) null).f(e.P(webViewClient, webView, str), new L(4, lVar));
    }

    public void d(WebViewClient webViewClient, WebView webView, String str, l lVar) {
        i.e(webViewClient, "pigeon_instanceArg");
        i.e(webView, "viewArg");
        i.e(str, "urlArg");
        d dVar = this.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible", dVar.a(), (Object) null).f(e.P(webViewClient, webView, str), new L(9, lVar));
    }

    public void e(WebViewClient webViewClient, WebView webView, String str, l lVar) {
        i.e(webViewClient, "pigeon_instanceArg");
        i.e(webView, "webViewArg");
        i.e(str, "urlArg");
        d dVar = this.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished", dVar.a(), (Object) null).f(e.P(webViewClient, webView, str), new L(10, lVar));
    }

    public void f(WebViewClient webViewClient, WebView webView, String str, l lVar) {
        i.e(webViewClient, "pigeon_instanceArg");
        i.e(webView, "webViewArg");
        i.e(str, "urlArg");
        d dVar = this.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted", dVar.a(), (Object) null).f(e.P(webViewClient, webView, str), new L(6, lVar));
    }

    public void g(WebViewClient webViewClient, WebView webView, ClientCertRequest clientCertRequest, l lVar) {
        i.e(webViewClient, "pigeon_instanceArg");
        i.e(webView, "viewArg");
        i.e(clientCertRequest, "requestArg");
        d dVar = this.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest", dVar.a(), (Object) null).f(e.P(webViewClient, webView, clientCertRequest), new L(7, lVar));
    }

    public void h(WebViewClient webViewClient, WebView webView, long j2, String str, String str2, l lVar) {
        i.e(webViewClient, "pigeon_instanceArg");
        i.e(webView, "webViewArg");
        i.e(str, "descriptionArg");
        i.e(str2, "failingUrlArg");
        d dVar = this.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedError", dVar.a(), (Object) null).f(e.P(webViewClient, webView, Long.valueOf(j2), str, str2), new L(11, lVar));
    }

    public void i(WebViewClient webViewClient, WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2, l lVar) {
        i.e(webViewClient, "pigeon_instanceArg");
        i.e(webView, "webViewArg");
        i.e(httpAuthHandler, "handlerArg");
        i.e(str, "hostArg");
        i.e(str2, "realmArg");
        d dVar = this.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest", dVar.a(), (Object) null).f(e.P(webViewClient, webView, httpAuthHandler, str, str2), new L(12, lVar));
    }

    public void j(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse, l lVar) {
        i.e(webViewClient, "pigeon_instanceArg");
        i.e(webView, "webViewArg");
        i.e(webResourceRequest, "requestArg");
        i.e(webResourceResponse, "responseArg");
        d dVar = this.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError", dVar.a(), (Object) null).f(e.P(webViewClient, webView, webResourceRequest, webResourceResponse), new L(3, lVar));
    }

    public void k(WebViewClient webViewClient, WebView webView, String str, String str2, String str3, l lVar) {
        i.e(webViewClient, "pigeon_instanceArg");
        i.e(webView, "viewArg");
        i.e(str, "realmArg");
        i.e(str3, "argsArg");
        d dVar = this.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest", dVar.a(), (Object) null).f(e.P(webViewClient, webView, str, str2, str3), new L(5, lVar));
    }

    public void l(WebViewClient webViewClient, WebView webView, SslErrorHandler sslErrorHandler, SslError sslError, l lVar) {
        i.e(webViewClient, "pigeon_instanceArg");
        i.e(webView, "viewArg");
        i.e(sslErrorHandler, "handlerArg");
        i.e(sslError, "errorArg");
        d dVar = this.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError", dVar.a(), (Object) null).f(e.P(webViewClient, webView, sslErrorHandler, sslError), new L(14, lVar));
    }

    public void m(WebViewClient webViewClient, WebView webView, double d2, double d3, l lVar) {
        i.e(webViewClient, "pigeon_instanceArg");
        i.e(webView, "viewArg");
        d dVar = this.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged", dVar.a(), (Object) null).f(e.P(webViewClient, webView, Double.valueOf(d2), Double.valueOf(d3)), new L(0, lVar));
    }

    public h0 n() {
        DisplayManager displayManager = (DisplayManager) ((Context) this.f3364a.f3211e).getSystemService("display");
        ArrayList arrayListR = a.R(displayManager);
        h0 h0Var = new h0(this);
        ArrayList arrayListR2 = a.R(displayManager);
        arrayListR2.removeAll(arrayListR);
        if (!arrayListR2.isEmpty()) {
            Iterator it = arrayListR2.iterator();
            while (it.hasNext()) {
                displayManager.unregisterDisplayListener((DisplayManager.DisplayListener) it.next());
                displayManager.registerDisplayListener(new r(arrayListR2, displayManager, 1), null);
            }
        }
        return h0Var;
    }

    public void o(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, l lVar) {
        i.e(webViewClient, "pigeon_instanceArg");
        i.e(webView, "webViewArg");
        i.e(webResourceRequest, "requestArg");
        d dVar = this.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading", dVar.a(), (Object) null).f(e.P(webViewClient, webView, webResourceRequest), new L(8, lVar));
    }

    public void p(WebViewClient webViewClient, WebView webView, String str, l lVar) {
        i.e(webViewClient, "pigeon_instanceArg");
        i.e(webView, "webViewArg");
        i.e(str, "urlArg");
        d dVar = this.f3364a;
        dVar.getClass();
        new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading", dVar.a(), (Object) null).f(e.P(webViewClient, webView, str), new L(1, lVar));
    }
}
