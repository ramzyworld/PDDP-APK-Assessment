package p039v0;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Y implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f3307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WebView f3308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f3309h;

    public /* synthetic */ Y(b0 b0Var, WebView webView, String str, int i2) {
        this.f3306e = i2;
        this.f3307f = b0Var;
        this.f3308g = webView;
        this.f3309h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3306e) {
            case 0:
                C0156n c0156n = new C0156n(2);
                b0 b0Var = this.f3307f;
                b0Var.f3324b.p(b0Var, this.f3308g, this.f3309h, c0156n);
                break;
            case 1:
                C0156n c0156n2 = new C0156n(2);
                b0 b0Var2 = this.f3307f;
                b0Var2.f3324b.d(b0Var2, this.f3308g, this.f3309h, c0156n2);
                break;
            case 2:
                C0156n c0156n3 = new C0156n(2);
                b0 b0Var3 = this.f3307f;
                b0Var3.f3324b.c(b0Var3, this.f3308g, this.f3309h, c0156n3);
                break;
            case 3:
                C0156n c0156n4 = new C0156n(2);
                b0 b0Var4 = this.f3307f;
                b0Var4.f3324b.e(b0Var4, this.f3308g, this.f3309h, c0156n4);
                break;
            default:
                C0156n c0156n5 = new C0156n(2);
                b0 b0Var5 = this.f3307f;
                b0Var5.f3324b.f(b0Var5, this.f3308g, this.f3309h, c0156n5);
                break;
        }
    }
}
