package p039v0;

import G.C0013n;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugin.platform.g;
import p011g0.q;
import p030q0.f;
import p038v.d;
import p043y0.e;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends WebView implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f3360h = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0151i f3361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WebViewClient f3362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Q f3363g;

    public h0(C0151i c0151i) {
        super((Context) c0151i.f3364a.f3211e);
        this.f3361e = c0151i;
        this.f3362f = new WebViewClient();
        this.f3363g = new Q();
        setWebViewClient(this.f3362f);
        setWebChromeClient(this.f3363g);
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.f3363g;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        q qVar;
        super.onAttachedToWindow();
        this.f3361e.f3364a.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            ViewParent parent = this;
            while (true) {
                if (parent.getParent() == null) {
                    qVar = null;
                    break;
                }
                parent = parent.getParent();
                if (parent instanceof q) {
                    qVar = (q) parent;
                    break;
                }
            }
            if (qVar != null) {
                qVar.setImportantForAutofill(1);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(final int i2, final int i3, final int i4, final int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        this.f3361e.f3364a.c(new Runnable() { // from class: v0.g0
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = i2;
                long j3 = i3;
                long j4 = i4;
                long j5 = i5;
                C0156n c0156n = new C0156n(4);
                h0 h0Var = this.f3354e;
                C0151i c0151i = h0Var.f3361e;
                c0151i.getClass();
                d dVar = c0151i.f3364a;
                dVar.getClass();
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged", dVar.a(), (Object) null).f(e.P(h0Var, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5)), new H(14, c0156n));
            }
        });
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
        if (!(webChromeClient instanceof Q)) {
            throw new AssertionError("Client must be a SecureWebChromeClient.");
        }
        Q q2 = (Q) webChromeClient;
        this.f3363g = q2;
        q2.f3275a = this.f3362f;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.f3362f = webViewClient;
        this.f3363g.f3275a = webViewClient;
    }

    @Override // io.flutter.plugin.platform.g
    public View getView() {
        return this;
    }
}
