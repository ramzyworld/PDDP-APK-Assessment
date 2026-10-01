package p039v0;

import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class X implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WebViewClient f3301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WebView f3302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f3303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f3304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3305j;

    public /* synthetic */ X(WebViewClient webViewClient, WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2, int i2) {
        this.f3300e = i2;
        this.f3301f = webViewClient;
        this.f3302g = webView;
        this.f3305j = httpAuthHandler;
        this.f3303h = str;
        this.f3304i = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3300e) {
            case 0:
                C0156n c0156n = new C0156n(2);
                b0 b0Var = (b0) this.f3301f;
                b0Var.f3324b.k(b0Var, this.f3302g, this.f3303h, this.f3304i, (String) this.f3305j, c0156n);
                break;
            case 1:
                C0156n c0156n2 = new C0156n(2);
                b0 b0Var2 = (b0) this.f3301f;
                b0Var2.f3324b.i(b0Var2, this.f3302g, (HttpAuthHandler) this.f3305j, this.f3303h, this.f3304i, c0156n2);
                break;
            case 2:
                C0156n c0156n3 = new C0156n(3);
                d0 d0Var = (d0) this.f3301f;
                d0Var.f3344a.k(d0Var, this.f3302g, this.f3303h, this.f3304i, (String) this.f3305j, c0156n3);
                break;
            default:
                C0156n c0156n4 = new C0156n(3);
                d0 d0Var2 = (d0) this.f3301f;
                d0Var2.f3344a.i(d0Var2, this.f3302g, (HttpAuthHandler) this.f3305j, this.f3303h, this.f3304i, c0156n4);
                break;
        }
    }

    public /* synthetic */ X(WebViewClient webViewClient, WebView webView, String str, String str2, String str3, int i2) {
        this.f3300e = i2;
        this.f3301f = webViewClient;
        this.f3302g = webView;
        this.f3303h = str;
        this.f3304i = str2;
        this.f3305j = str3;
    }
}
