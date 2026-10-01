package p039v0;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WebView f3319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f3320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f3321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ WebViewClient f3322i;

    public /* synthetic */ a0(WebViewClient webViewClient, WebView webView, float f2, float f3, int i2) {
        this.f3318e = i2;
        this.f3322i = webViewClient;
        this.f3319f = webView;
        this.f3320g = f2;
        this.f3321h = f3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3318e) {
            case 0:
                double d2 = this.f3320g;
                double d3 = this.f3321h;
                C0156n c0156n = new C0156n(2);
                b0 b0Var = (b0) this.f3322i;
                b0Var.f3324b.m(b0Var, this.f3319f, d2, d3, c0156n);
                break;
            default:
                double d4 = this.f3320g;
                double d5 = this.f3321h;
                C0156n c0156n2 = new C0156n(3);
                d0 d0Var = (d0) this.f3322i;
                d0Var.f3344a.m(d0Var, this.f3319f, d4, d5, c0156n2);
                break;
        }
    }
}
