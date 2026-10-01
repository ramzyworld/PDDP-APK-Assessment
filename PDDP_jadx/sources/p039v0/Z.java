package p039v0;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Z implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WebView f3311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f3312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f3313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ WebViewClient f3314i;

    public /* synthetic */ Z(WebViewClient webViewClient, WebView webView, String str, boolean z2, int i2) {
        this.f3310e = i2;
        this.f3314i = webViewClient;
        this.f3311f = webView;
        this.f3312g = str;
        this.f3313h = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3310e) {
            case 0:
                C0156n c0156n = new C0156n(2);
                b0 b0Var = (b0) this.f3314i;
                b0Var.f3324b.a(b0Var, this.f3311f, this.f3312g, this.f3313h, c0156n);
                break;
            default:
                C0156n c0156n2 = new C0156n(3);
                d0 d0Var = (d0) this.f3314i;
                d0Var.f3344a.a(d0Var, this.f3311f, this.f3312g, this.f3313h, c0156n2);
                break;
        }
    }
}
