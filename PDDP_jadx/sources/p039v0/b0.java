package p039v0;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import p011g0.x;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends WebViewClientCompat {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f3323d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0151i f3324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3325c = false;

    public b0(C0151i c0151i) {
        this.f3324b = c0151i;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z2) {
        this.f3324b.f3364a.c(new Z(this, webView, str, z2, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f3324b.f3364a.c(new W(this, webView, message, message2, 2));
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        this.f3324b.f3364a.c(new Y(this, webView, str, 2));
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onPageCommitVisible(WebView webView, String str) {
        this.f3324b.f3364a.c(new Y(this, webView, str, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f3324b.f3364a.c(new Y(this, webView, str, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f3324b.f3364a.c(new Y(this, webView, str, 4));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.f3324b.f3364a.c(new x(this, webView, clientCertRequest, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        this.f3324b.f3364a.c(new V(this, webView, i2, str, str2, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f3324b.f3364a.c(new X(this, webView, httpAuthHandler, str, str2, 1));
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f3324b.f3364a.c(new W(this, webView, webResourceRequest, webResourceResponse, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f3324b.f3364a.c(new X(this, webView, str, str2, str3, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f3324b.f3364a.c(new W(this, webView, sslErrorHandler, sslError, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f2, float f3) {
        this.f3324b.f3364a.c(new a0(this, webView, f2, f3, 0));
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f3324b.f3364a.c(new x(this, webView, webResourceRequest, 2));
        return webResourceRequest.isForMainFrame() && this.f3325c;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f3324b.f3364a.c(new Y(this, webView, str, 0));
        return this.f3325c;
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }
}
