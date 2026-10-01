package p039v0;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p011g0.x;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends WebViewClient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f3343c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0151i f3344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3345b = false;

    public d0(C0151i c0151i) {
        this.f3344a = c0151i;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z2) {
        this.f3344a.f3364a.c(new Z(this, webView, str, z2, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f3344a.f3364a.c(new W(this, webView, message, message2, 4));
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        this.f3344a.f3364a.c(new c0(this, webView, str, 2));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        this.f3344a.f3364a.c(new c0(this, webView, str, 4));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f3344a.f3364a.c(new c0(this, webView, str, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f3344a.f3364a.c(new c0(this, webView, str, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.f3344a.f3364a.c(new x(this, webView, clientCertRequest, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        this.f3344a.f3364a.c(new V(this, webView, i2, str, str2, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f3344a.f3364a.c(new X(this, webView, httpAuthHandler, str, str2, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f3344a.f3364a.c(new W(this, webView, webResourceRequest, webResourceResponse, 7));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f3344a.f3364a.c(new X(this, webView, str, str2, str3, 2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f3344a.f3364a.c(new W(this, webView, sslErrorHandler, sslError, 5));
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f2, float f3) {
        this.f3344a.f3364a.c(new a0(this, webView, f2, f3, 1));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f3344a.f3364a.c(new x(this, webView, webResourceRequest, 4));
        return webResourceRequest.isForMainFrame() && this.f3345b;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f3344a.f3364a.c(new W(this, webView, webResourceRequest, webResourceError, 6));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f3344a.f3364a.c(new c0(this, webView, str, 1));
        return this.f3345b;
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }
}
