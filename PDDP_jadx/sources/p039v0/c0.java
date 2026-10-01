package p039v0;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d0 f3338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WebView f3339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f3340h;

    public /* synthetic */ c0(d0 d0Var, WebView webView, String str, int i2) {
        this.f3337e = i2;
        this.f3338f = d0Var;
        this.f3339g = webView;
        this.f3340h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3337e) {
            case 0:
                C0156n c0156n = new C0156n(3);
                d0 d0Var = this.f3338f;
                d0Var.f3344a.f(d0Var, this.f3339g, this.f3340h, c0156n);
                break;
            case 1:
                C0156n c0156n2 = new C0156n(3);
                d0 d0Var2 = this.f3338f;
                d0Var2.f3344a.p(d0Var2, this.f3339g, this.f3340h, c0156n2);
                break;
            case 2:
                C0156n c0156n3 = new C0156n(3);
                d0 d0Var3 = this.f3338f;
                d0Var3.f3344a.c(d0Var3, this.f3339g, this.f3340h, c0156n3);
                break;
            case 3:
                C0156n c0156n4 = new C0156n(3);
                d0 d0Var4 = this.f3338f;
                d0Var4.f3344a.e(d0Var4, this.f3339g, this.f3340h, c0156n4);
                break;
            default:
                C0156n c0156n5 = new C0156n(3);
                d0 d0Var5 = this.f3338f;
                d0Var5.f3344a.d(d0Var5, this.f3339g, this.f3340h, c0156n5);
                break;
        }
    }
}
