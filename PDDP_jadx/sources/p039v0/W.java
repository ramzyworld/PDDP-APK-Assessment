package p039v0;

import G.C0013n;
import I.k;
import I0.i;
import android.net.http.SslError;
import android.os.Message;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p030q0.f;
import p038v.d;
import p043y0.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class W implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WebViewClient f3296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WebView f3297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3299i;

    public /* synthetic */ W(WebViewClient webViewClient, WebView webView, Object obj, Object obj2, int i2) {
        this.f3295e = i2;
        this.f3296f = webViewClient;
        this.f3297g = webView;
        this.f3298h = obj;
        this.f3299i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.f3297g;
        Object obj = this.f3299i;
        Object obj2 = this.f3298h;
        WebViewClient webViewClient = this.f3296f;
        switch (this.f3295e) {
            case 0:
                C0156n c0156n = new C0156n(2);
                b0 b0Var = (b0) webViewClient;
                C0151i c0151i = b0Var.f3324b;
                c0151i.getClass();
                i.e(webView, "webViewArg");
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj2;
                i.e(webResourceRequest, "requestArg");
                d dVar = c0151i.f3364a;
                dVar.getClass();
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat", dVar.a(), (Object) null).f(e.P(b0Var, webView, webResourceRequest, (T.i) obj), new H(16, c0156n));
                break;
            case 1:
                b0 b0Var2 = (b0) webViewClient;
                b0Var2.f3324b.j(b0Var2, this.f3297g, (WebResourceRequest) obj2, (WebResourceResponse) obj, new C0156n(2));
                break;
            case 2:
                b0 b0Var3 = (b0) webViewClient;
                b0Var3.f3324b.b(b0Var3, this.f3297g, (Message) obj2, (Message) obj, new C0156n(2));
                break;
            case 3:
                b0 b0Var4 = (b0) webViewClient;
                b0Var4.f3324b.l(b0Var4, this.f3297g, (SslErrorHandler) obj2, (SslError) obj, new C0156n(2));
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                d0 d0Var = (d0) webViewClient;
                d0Var.f3344a.b(d0Var, this.f3297g, (Message) obj2, (Message) obj, new C0156n(3));
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                d0 d0Var2 = (d0) webViewClient;
                d0Var2.f3344a.l(d0Var2, this.f3297g, (SslErrorHandler) obj2, (SslError) obj, new C0156n(3));
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                WebResourceError webResourceError = (WebResourceError) obj;
                C0156n c0156n2 = new C0156n(3);
                d0 d0Var3 = (d0) webViewClient;
                C0151i c0151i2 = d0Var3.f3344a;
                c0151i2.getClass();
                i.e(webView, "webViewArg");
                WebResourceRequest webResourceRequest2 = (WebResourceRequest) obj2;
                i.e(webResourceRequest2, "requestArg");
                i.e(webResourceError, "errorArg");
                d dVar2 = c0151i2.f3364a;
                dVar2.getClass();
                new C0013n((f) dVar2.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError", dVar2.a(), (Object) null).f(e.P(d0Var3, webView, webResourceRequest2, webResourceError), new H(17, c0156n2));
                break;
            default:
                d0 d0Var4 = (d0) webViewClient;
                d0Var4.f3344a.j(d0Var4, this.f3297g, (WebResourceRequest) obj2, (WebResourceResponse) obj, new C0156n(3));
                break;
        }
    }
}
