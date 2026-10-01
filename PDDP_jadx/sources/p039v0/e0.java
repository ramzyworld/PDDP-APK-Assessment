package p039v0;

import D.j;
import G.C0013n;
import I0.i;
import N.Q;
import android.content.Context;
import android.os.Build;
import android.webkit.WebViewClient;
import io.flutter.plugin.platform.n;
import java.util.HashMap;
import java.util.List;
import p011g0.AbstractActivityC0098e;
import p011g0.t;
import p023m0.a;
import p030q0.b;
import p030q0.f;
import p038v.d;
import p041x0.e;

/* JADX INFO: loaded from: classes.dex */
public class e0 implements a, p025n0.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0013n f3347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f3348f;

    @Override // p023m0.a
    public final void a(C0013n c0013n) {
        d dVar = this.f3348f;
        if (dVar != null) {
            e eVar = C0148f.f3349b;
            f fVar = (f) dVar.f3208b;
            p000a.a.F(fVar, null);
            p000a.a.G(fVar, null);
            p000a.a.K(fVar, null);
            a1.a.G(fVar, null);
            new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", new C0144b(), (Object) null).g(null);
            C0144b c0144b = new C0144b();
            new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", c0144b, (Object) null).g(null);
            new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", c0144b, (Object) null).g(null);
            new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", new C0144b(), (Object) null).g(null);
            p000a.a.J(fVar, null);
            a1.a.D(fVar, null);
            C0144b c0144b2 = new C0144b();
            new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", c0144b2, (Object) null).g(null);
            new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", c0144b2, (Object) null).g(null);
            C0144b c0144b3 = new C0144b();
            new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", c0144b3, (Object) null).g(null);
            new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", c0144b3, (Object) null).g(null);
            new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", new C0144b(), (Object) null).g(null);
            a1.a.F(fVar, null);
            new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", new C0144b(), (Object) null).g(null);
            p000a.a.H(fVar, null);
            new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", new C0144b(), (Object) null).g(null);
            a1.a.C(fVar, null);
            C0144b c0144b4 = new C0144b();
            new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", c0144b4, (Object) null).g(null);
            new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", c0144b4, (Object) null).g(null);
            C0144b c0144b5 = new C0144b();
            new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", c0144b5, (Object) null).g(null);
            new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", c0144b5, (Object) null).g(null);
            p000a.a.I(fVar, null);
            a1.a.E(fVar, null);
            new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", new C0144b(), (Object) null).g(null);
            new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled", new C0144b(), (Object) null).g(null);
            new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported", new C0144b(), (Object) null).g(null);
            C0145c c0145c = (C0145c) this.f3348f.f3209c;
            c0145c.f3332g.removeCallbacks(c0145c.f3333h);
            c0145c.f3335j = true;
            this.f3348f = null;
        }
    }

    @Override // p025n0.a
    public final void b(p013h0.d dVar) {
        d dVar2 = this.f3348f;
        if (dVar2 != null) {
            dVar2.f3211e = (AbstractActivityC0098e) dVar.f1997a;
        }
    }

    @Override // p025n0.a
    public final void c(p013h0.d dVar) {
        this.f3348f.f3211e = (AbstractActivityC0098e) dVar.f1997a;
    }

    @Override // p025n0.a
    public final void d() {
        this.f3348f.f3211e = (Context) this.f3347e.f258a;
    }

    @Override // p025n0.a
    public final void e() {
        this.f3348f.f3211e = (Context) this.f3347e.f258a;
    }

    @Override // p023m0.a
    public final void g(C0013n c0013n) {
        int i2 = 12;
        int i3 = 3;
        int i4 = 10;
        int i5 = 4;
        final int i6 = 0;
        int i7 = 13;
        int i8 = 5;
        final int i9 = 1;
        this.f3347e = c0013n;
        f fVar = (f) c0013n.f259b;
        Context context = (Context) c0013n.f258a;
        d dVar = new d(fVar, context, new C0159q(context.getAssets(), (j) c0013n.f261d));
        this.f3348f = dVar;
        C0160s c0160s = new C0160s((C0145c) dVar.f3209c);
        HashMap map = (HashMap) ((n) c0013n.f260c).f2340a;
        if (!map.containsKey("plugins.flutter.io/webview")) {
            map.put("plugins.flutter.io/webview", c0160s);
        }
        d dVar2 = this.f3348f;
        dVar2.getClass();
        e eVar = C0148f.f3349b;
        C0145c c0145c = (C0145c) dVar2.f3209c;
        f fVar2 = (f) dVar2.f3208b;
        p000a.a.F(fVar2, c0145c);
        p000a.a.G(fVar2, new C0151i(dVar2, 1));
        p000a.a.K(fVar2, new C0151i(dVar2, 14));
        a1.a.G(fVar2, new C0151i(dVar2, 11));
        new C0013n(fVar2, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", dVar2.a(), (Object) null).g(new t(i8, new C0151i(dVar2, 5)));
        final C0151i c0151i = new C0151i(dVar2, 13);
        p030q0.j jVarA = dVar2.a();
        new C0013n(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", jVarA, (Object) null).g(new b() { // from class: v0.M
            @Override // p030q0.b
            public final void o(Object obj, Q q2) {
                List listN;
                List listN2;
                switch (i6) {
                    case 0:
                        C0151i c0151i2 = c0151i;
                        i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        Object obj2 = ((List) obj).get(0);
                        i.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                        try {
                            ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj2).longValue(), Build.VERSION.SDK_INT >= 24 ? new d0(c0151i2) : new b0(c0151i2));
                            listN = a1.a.t(null);
                            break;
                        } catch (Throwable th) {
                            listN = a1.a.N(th);
                        }
                        q2.b(listN);
                        return;
                    default:
                        C0151i c0151i3 = c0151i;
                        i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj3 = list.get(0);
                        i.c(obj3, "null cannot be cast to non-null type android.webkit.WebViewClient");
                        WebViewClient webViewClient = (WebViewClient) obj3;
                        Object obj4 = list.get(1);
                        i.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                        try {
                            if (webViewClient instanceof b0) {
                                ((b0) webViewClient).f3325c = zBooleanValue;
                            } else {
                                c0151i3.f3364a.getClass();
                                if (!(Build.VERSION.SDK_INT >= 24) || !(webViewClient instanceof d0)) {
                                    throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
                                }
                                ((d0) webViewClient).f3345b = zBooleanValue;
                            }
                            listN2 = a1.a.t(null);
                        } catch (Throwable th2) {
                            listN2 = a1.a.N(th2);
                        }
                        q2.b(listN2);
                        return;
                }
            }
        });
        new C0013n(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", jVarA, (Object) null).g(new b() { // from class: v0.M
            @Override // p030q0.b
            public final void o(Object obj, Q q2) {
                List listN;
                List listN2;
                switch (i9) {
                    case 0:
                        C0151i c0151i2 = c0151i;
                        i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        Object obj2 = ((List) obj).get(0);
                        i.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                        try {
                            ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj2).longValue(), Build.VERSION.SDK_INT >= 24 ? new d0(c0151i2) : new b0(c0151i2));
                            listN = a1.a.t(null);
                            break;
                        } catch (Throwable th) {
                            listN = a1.a.N(th);
                        }
                        q2.b(listN);
                        return;
                    default:
                        C0151i c0151i3 = c0151i;
                        i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj3 = list.get(0);
                        i.c(obj3, "null cannot be cast to non-null type android.webkit.WebViewClient");
                        WebViewClient webViewClient = (WebViewClient) obj3;
                        Object obj4 = list.get(1);
                        i.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                        try {
                            if (webViewClient instanceof b0) {
                                ((b0) webViewClient).f3325c = zBooleanValue;
                            } else {
                                c0151i3.f3364a.getClass();
                                if (!(Build.VERSION.SDK_INT >= 24) || !(webViewClient instanceof d0)) {
                                    throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
                                }
                                ((d0) webViewClient).f3345b = zBooleanValue;
                            }
                            listN2 = a1.a.t(null);
                        } catch (Throwable th2) {
                            listN2 = a1.a.N(th2);
                        }
                        q2.b(listN2);
                        return;
                }
            }
        });
        new C0013n(fVar2, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", dVar2.a(), (Object) null).g(new t(i5, new C0151i(dVar2, 2)));
        p000a.a.J(fVar2, new C0151i(dVar2, 10));
        a1.a.D(fVar2, new C0151i(dVar2, 3));
        C0151i c0151i2 = new C0151i(dVar2, 12);
        p030q0.j jVarA2 = dVar2.a();
        new C0013n(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", jVarA2, (Object) null).g(new t(7, c0151i2));
        new C0013n(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", jVarA2, (Object) null).g(new H(i2, c0151i2));
        C0164w c0164w = new C0164w();
        p030q0.j jVarA3 = dVar2.a();
        new C0013n(fVar2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", jVarA3, (Object) null).g(new C0165x(17, c0164w));
        new C0013n(fVar2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", jVarA3, (Object) null).g(new C0165x(18, c0164w));
        new C0013n(fVar2, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", dVar2.a(), (Object) null).g(new C0165x(8, new H.a(27)));
        a1.a.F(fVar2, new C0151i(dVar2, 9));
        new C0013n(fVar2, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", dVar2.a(), (Object) null).g(new C0165x(i7, new H.a(28)));
        p000a.a.H(fVar2, new C0151i(dVar2, 4));
        new C0013n(fVar2, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", dVar2.a(), (Object) null).g(new C0165x(i9, new H.a(29)));
        a1.a.C(fVar2, new C0151i(dVar2, 0));
        C0164w c0164w2 = new C0164w();
        p030q0.j jVarA4 = dVar2.a();
        new C0013n(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", jVarA4, (Object) null).g(new C0165x(25, c0164w2));
        new C0013n(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", jVarA4, (Object) null).g(new C0165x(26, c0164w2));
        C0151i c0151i3 = new C0151i(dVar2, 8);
        p030q0.j jVarA5 = dVar2.a();
        new C0013n(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", jVarA5, (Object) null).g(new C0165x(23, c0151i3));
        new C0013n(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", jVarA5, (Object) null).g(new t(6, c0151i3));
        p000a.a.I(fVar2, new C0151i(dVar2, 6));
        a1.a.E(fVar2, new C0151i(dVar2, 7));
        new C0013n(fVar2, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", dVar2.a(), (Object) null).g(new C0165x(i3, new H.a(26)));
        new C0013n(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled", dVar2.a(), (Object) null).g(new H(i4, new C0164w()));
        new C0013n(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported", dVar2.a(), (Object) null).g(new H(18, new C0164w()));
    }
}
