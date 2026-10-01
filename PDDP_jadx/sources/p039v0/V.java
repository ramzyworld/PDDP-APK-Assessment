package p039v0;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class V implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WebView f3290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f3292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f3293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WebViewClient f3294j;

    public /* synthetic */ V(WebViewClient webViewClient, WebView webView, int i2, String str, String str2, int i3) {
        this.f3289e = i3;
        this.f3294j = webViewClient;
        this.f3290f = webView;
        this.f3291g = i2;
        this.f3292h = str;
        this.f3293i = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3289e) {
            case 0:
                long j2 = this.f3291g;
                C0156n c0156n = new C0156n(2);
                b0 b0Var = (b0) this.f3294j;
                b0Var.f3324b.h(b0Var, this.f3290f, j2, this.f3292h, this.f3293i, c0156n);
                break;
            default:
                long j3 = this.f3291g;
                C0156n c0156n2 = new C0156n(3);
                d0 d0Var = (d0) this.f3294j;
                d0Var.f3344a.h(d0Var, this.f3290f, j3, this.f3292h, this.f3293i, c0156n2);
                break;
        }
    }
}
