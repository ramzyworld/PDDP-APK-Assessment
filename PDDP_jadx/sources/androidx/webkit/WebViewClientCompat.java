package androidx.webkit;

import D.j;
import N.Q;
import T.b;
import T.e;
import T.i;
import T.m;
import T.n;
import a1.a;
import android.os.Build;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p039v0.W;
import p039v0.b0;

/* JADX INFO: loaded from: classes.dex */
public abstract class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f1710a = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    public static void a(Q q2) {
        if (!a.r("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            throw m.a();
        }
        b bVar = m.f833c;
        if (bVar.a()) {
            if (((SafeBrowsingResponse) q2.f471f) == null) {
                j jVar = n.f836a;
                q2.f471f = e.a(((WebkitToCompatConverterBoundaryInterface) jVar.f44f).convertSafeBrowsingResponse(Proxy.getInvocationHandler((SafeBrowsingResponseBoundaryInterface) q2.f472g)));
            }
            ((SafeBrowsingResponse) q2.f471f).showInterstitial(true);
            return;
        }
        if (!bVar.b()) {
            throw m.a();
        }
        if (((SafeBrowsingResponseBoundaryInterface) q2.f472g) == null) {
            j jVar2 = n.f836a;
            q2.f472g = (SafeBrowsingResponseBoundaryInterface) a.d(SafeBrowsingResponseBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) jVar2.f44f).convertSafeBrowsingResponse((SafeBrowsingResponse) q2.f471f));
        }
        ((SafeBrowsingResponseBoundaryInterface) q2.f472g).showInterstitial(true);
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return f1710a;
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        i iVar = new i();
        iVar.f828b = (WebResourceErrorBoundaryInterface) a.d(WebResourceErrorBoundaryInterface.class, invocationHandler);
        b0 b0Var = (b0) this;
        b0Var.f3324b.f3364a.c(new W(b0Var, webView, webResourceRequest, iVar, 0));
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i2, InvocationHandler invocationHandler) {
        Q q2 = new Q(1, false);
        q2.f472g = (SafeBrowsingResponseBoundaryInterface) a.d(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
        a(q2);
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i2, SafeBrowsingResponse safeBrowsingResponse) {
        Q q2 = new Q(1, false);
        q2.f471f = safeBrowsingResponse;
        a(q2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        i iVar = new i();
        iVar.f827a = webResourceError;
        b0 b0Var = (b0) this;
        b0Var.f3324b.f3364a.c(new W(b0Var, webView, webResourceRequest, iVar, 0));
    }
}
