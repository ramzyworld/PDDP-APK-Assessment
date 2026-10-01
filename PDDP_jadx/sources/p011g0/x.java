package p011g0;

import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import p039v0.C0156n;
import p039v0.b0;
import p039v0.d0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1932h;

    public /* synthetic */ x(Object obj, Object obj2, Object obj3, int i2) {
        this.f1929e = i2;
        this.f1930f = obj;
        this.f1931g = obj2;
        this.f1932h = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1929e) {
            case 0:
                y yVar = (y) this.f1930f;
                yVar.getClass();
                E e2 = (E) this.f1931g;
                yVar.c(false, Long.valueOf(e2.f1836b), Long.valueOf(e2.f1835a), ((KeyEvent) this.f1932h).getEventTime());
                break;
            case 1:
                C0156n c0156n = new C0156n(2);
                b0 b0Var = (b0) this.f1930f;
                b0Var.f3324b.g(b0Var, (WebView) this.f1931g, (ClientCertRequest) this.f1932h, c0156n);
                break;
            case 2:
                C0156n c0156n2 = new C0156n(2);
                b0 b0Var2 = (b0) this.f1930f;
                b0Var2.f3324b.o(b0Var2, (WebView) this.f1931g, (WebResourceRequest) this.f1932h, c0156n2);
                break;
            case 3:
                C0156n c0156n3 = new C0156n(3);
                d0 d0Var = (d0) this.f1930f;
                d0Var.f3344a.g(d0Var, (WebView) this.f1931g, (ClientCertRequest) this.f1932h, c0156n3);
                break;
            default:
                C0156n c0156n4 = new C0156n(3);
                d0 d0Var2 = (d0) this.f1930f;
                d0Var2.f3344a.o(d0Var2, (WebView) this.f1931g, (WebResourceRequest) this.f1932h, c0156n4);
                break;
        }
    }
}
