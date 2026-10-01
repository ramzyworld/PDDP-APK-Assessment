package p039v0;

import D.r;
import G.C0013n;
import I0.h;
import I0.i;
import T.b;
import T.n;
import a1.a;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p030q0.f;
import p030q0.m;
import p038v.d;
import p043y0.e;

/* JADX INFO: renamed from: v0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0149g extends C0144b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f3353d;

    public C0149g(d dVar) {
        i.e(dVar, "registrar");
        this.f3353d = dVar;
    }

    @Override // p039v0.C0144b, p030q0.n
    public final Object f(byte b2, ByteBuffer byteBuffer) {
        i.e(byteBuffer, "buffer");
        if (b2 != -128) {
            return super.f(b2, byteBuffer);
        }
        Object objE = e(byteBuffer);
        i.c(objE, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) objE).longValue();
        Object objE2 = ((C0145c) this.f3353d.f3209c).e(jLongValue);
        if (objE2 == null) {
            Log.e("PigeonProxyApiBaseCodec", "Failed to find instance with identifier: " + jLongValue);
        }
        return objE2;
    }

    @Override // p039v0.C0144b, p030q0.n
    public final void k(m mVar, Object obj) {
        EnumC0158p enumC0158p;
        String str;
        EnumC0152j enumC0152j;
        int errorCode;
        CharSequence description;
        int i2 = 19;
        int i3 = 24;
        int i4 = 7;
        if ((obj instanceof Boolean) || (obj instanceof byte[]) || (obj instanceof Double) || (obj instanceof double[]) || (obj instanceof float[]) || (obj instanceof Integer) || (obj instanceof int[]) || (obj instanceof List) || (obj instanceof Long) || (obj instanceof long[]) || (obj instanceof Map) || (obj instanceof String) || (obj instanceof EnumC0158p) || (obj instanceof EnumC0152j) || (obj instanceof EnumC0163v) || (obj instanceof O) || (obj instanceof EnumC0162u) || obj == null) {
            super.k(mVar, obj);
            return;
        }
        boolean z2 = obj instanceof WebResourceRequest;
        Object obj2 = null;
        d dVar = this.f3353d;
        if (z2) {
            dVar.getClass();
            WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
            C0145c c0145c = (C0145c) dVar.f3209c;
            if (!c0145c.d(webResourceRequest)) {
                long jB = c0145c.b(webResourceRequest);
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance", dVar.a(), obj2).f(e.P(Long.valueOf(jB), webResourceRequest.getUrl().toString(), Boolean.valueOf(webResourceRequest.isForMainFrame()), Build.VERSION.SDK_INT >= 24 ? Boolean.valueOf(webResourceRequest.isRedirect()) : null, Boolean.valueOf(webResourceRequest.hasGesture()), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders() == null ? Collections.emptyMap() : webResourceRequest.getRequestHeaders()), new H(i4));
            }
        } else if (obj instanceof WebResourceResponse) {
            dVar.getClass();
            WebResourceResponse webResourceResponse = (WebResourceResponse) obj;
            C0145c c0145c2 = (C0145c) dVar.f3209c;
            if (!c0145c2.d(webResourceResponse)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance", dVar.a(), obj2).f(e.P(Long.valueOf(c0145c2.b(webResourceResponse)), Long.valueOf(webResourceResponse.getStatusCode())), new H(8));
            }
        } else if (Build.VERSION.SDK_INT >= 23 && r.A(obj)) {
            dVar.getClass();
            WebResourceError webResourceErrorO = r.o(obj);
            i.e(webResourceErrorO, "pigeon_instanceArg");
            C0145c c0145c3 = (C0145c) dVar.f3209c;
            if (!c0145c3.d(webResourceErrorO)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance", dVar.a(), obj2).f(e.P(Long.valueOf(c0145c3.b(webResourceErrorO)), Long.valueOf(webResourceErrorO.getErrorCode()), webResourceErrorO.getDescription().toString()), new H(5));
            }
        } else if (obj instanceof T.i) {
            dVar.getClass();
            T.i iVar = (T.i) obj;
            C0145c c0145c4 = (C0145c) dVar.f3209c;
            if (!c0145c4.d(iVar)) {
                long jB2 = c0145c4.b(iVar);
                b bVar = T.m.f832b;
                if (bVar.a()) {
                    if (iVar.f827a == null) {
                        iVar.f827a = r.o(((WebkitToCompatConverterBoundaryInterface) n.f836a.f44f).convertWebResourceError(Proxy.getInvocationHandler(iVar.f828b)));
                    }
                    errorCode = iVar.f827a.getErrorCode();
                } else {
                    if (!bVar.b()) {
                        throw T.m.a();
                    }
                    if (iVar.f828b == null) {
                        iVar.f828b = (WebResourceErrorBoundaryInterface) a.d(WebResourceErrorBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) n.f836a.f44f).convertWebResourceError(iVar.f827a));
                    }
                    errorCode = iVar.f828b.getErrorCode();
                }
                long j2 = errorCode;
                b bVar2 = T.m.f831a;
                if (bVar2.a()) {
                    if (iVar.f827a == null) {
                        iVar.f827a = r.o(((WebkitToCompatConverterBoundaryInterface) n.f836a.f44f).convertWebResourceError(Proxy.getInvocationHandler(iVar.f828b)));
                    }
                    description = iVar.f827a.getDescription();
                } else {
                    if (!bVar2.b()) {
                        throw T.m.a();
                    }
                    if (iVar.f828b == null) {
                        iVar.f828b = (WebResourceErrorBoundaryInterface) a.d(WebResourceErrorBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) n.f836a.f44f).convertWebResourceError(iVar.f827a));
                    }
                    description = iVar.f828b.getDescription();
                }
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance", dVar.a(), obj2).f(e.P(Long.valueOf(jB2), Long.valueOf(j2), description.toString()), new H(6));
            }
        } else if (obj instanceof f0) {
            dVar.getClass();
            f0 f0Var = (f0) obj;
            C0145c c0145c5 = (C0145c) dVar.f3209c;
            if (!c0145c5.d(f0Var)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance", dVar.a(), obj2).f(e.P(Long.valueOf(c0145c5.b(f0Var)), Long.valueOf(f0Var.f3351a), Long.valueOf(f0Var.f3352b)), new H(i2));
            }
        } else if (obj instanceof ConsoleMessage) {
            dVar.getClass();
            ConsoleMessage consoleMessage = (ConsoleMessage) obj;
            C0145c c0145c6 = (C0145c) dVar.f3209c;
            if (!c0145c6.d(consoleMessage)) {
                long jB3 = c0145c6.b(consoleMessage);
                long jLineNumber = consoleMessage.lineNumber();
                String strMessage = consoleMessage.message();
                int i5 = AbstractC0153k.f3373a[consoleMessage.messageLevel().ordinal()];
                if (i5 == 1) {
                    enumC0152j = EnumC0152j.f3368i;
                } else if (i5 == 2) {
                    enumC0152j = EnumC0152j.f3367h;
                } else if (i5 == 3) {
                    enumC0152j = EnumC0152j.f3369j;
                } else if (i5 != 4) {
                    enumC0152j = i5 != 5 ? EnumC0152j.f3370k : EnumC0152j.f3365f;
                } else {
                    enumC0152j = EnumC0152j.f3366g;
                }
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance", dVar.a(), obj2).f(e.P(Long.valueOf(jB3), Long.valueOf(jLineNumber), strMessage, enumC0152j, consoleMessage.sourceId()), new C0165x(5));
            }
        } else if (obj instanceof CookieManager) {
            dVar.getClass();
            CookieManager cookieManager = (CookieManager) obj;
            C0145c c0145c7 = (C0145c) dVar.f3209c;
            if (!c0145c7.d(cookieManager)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance", dVar.a(), obj2).f(a.t(Long.valueOf(c0145c7.b(cookieManager))), new C0165x(6));
            }
        } else if (obj instanceof WebView) {
            dVar.getClass();
            WebView webView = (WebView) obj;
            C0145c c0145c8 = (C0145c) dVar.f3209c;
            if (!c0145c8.d(webView)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance", dVar.a(), obj2).f(a.t(Long.valueOf(c0145c8.b(webView))), new H(13));
            }
        } else if (obj instanceof WebSettings) {
            dVar.getClass();
            WebSettings webSettings = (WebSettings) obj;
            C0145c c0145c9 = (C0145c) dVar.f3209c;
            if (!c0145c9.d(webSettings)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance", dVar.a(), obj2).f(a.t(Long.valueOf(c0145c9.b(webSettings))), new H(9));
            }
        } else if (obj instanceof C0161t) {
            dVar.getClass();
            if (!((C0145c) dVar.f3209c).d((C0161t) obj)) {
                str = "Attempting to create a new Dart instance of JavaScriptChannel, but the class has a nonnull callback method.";
                h.i("new-instance-error", str, "");
            }
        } else if (obj instanceof WebViewClient) {
            dVar.getClass();
            WebViewClient webViewClient = (WebViewClient) obj;
            C0145c c0145c10 = (C0145c) dVar.f3209c;
            if (!c0145c10.d(webViewClient)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance", dVar.a(), obj2).f(a.t(Long.valueOf(c0145c10.b(webViewClient))), new H(15));
            }
        } else if (obj instanceof DownloadListener) {
            dVar.getClass();
            if (!((C0145c) dVar.f3209c).d((DownloadListener) obj)) {
                str = "Attempting to create a new Dart instance of DownloadListener, but the class has a nonnull callback method.";
                h.i("new-instance-error", str, "");
            }
        } else if (obj instanceof U) {
            dVar.getClass();
            if (!((C0145c) dVar.f3209c).d((U) obj)) {
                str = "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method.";
                h.i("new-instance-error", str, "");
            }
        } else if (obj instanceof C0159q) {
            dVar.getClass();
            C0159q c0159q = (C0159q) obj;
            C0145c c0145c11 = (C0145c) dVar.f3209c;
            if (!c0145c11.d(c0159q)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance", dVar.a(), obj2).f(a.t(Long.valueOf(c0145c11.b(c0159q))), new C0165x(11));
            }
        } else if (obj instanceof WebStorage) {
            dVar.getClass();
            WebStorage webStorage = (WebStorage) obj;
            C0145c c0145c12 = (C0145c) dVar.f3209c;
            if (!c0145c12.d(webStorage)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance", dVar.a(), obj2).f(a.t(Long.valueOf(c0145c12.b(webStorage))), new H(11));
            }
        } else if (obj instanceof WebChromeClient.FileChooserParams) {
            dVar.getClass();
            WebChromeClient.FileChooserParams fileChooserParams = (WebChromeClient.FileChooserParams) obj;
            C0145c c0145c13 = (C0145c) dVar.f3209c;
            if (!c0145c13.d(fileChooserParams)) {
                long jB4 = c0145c13.b(fileChooserParams);
                boolean zIsCaptureEnabled = fileChooserParams.isCaptureEnabled();
                List listAsList = Arrays.asList(fileChooserParams.getAcceptTypes());
                int mode = fileChooserParams.getMode();
                if (mode == 0) {
                    enumC0158p = EnumC0158p.f3384f;
                } else if (mode != 1) {
                    enumC0158p = mode != 3 ? EnumC0158p.f3387i : EnumC0158p.f3386h;
                } else {
                    enumC0158p = EnumC0158p.f3385g;
                }
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance", dVar.a(), obj2).f(e.P(Long.valueOf(jB4), Boolean.valueOf(zIsCaptureEnabled), listAsList, enumC0158p, fileChooserParams.getFilenameHint()), new C0165x(10));
            }
        } else if (obj instanceof PermissionRequest) {
            dVar.getClass();
            PermissionRequest permissionRequest = (PermissionRequest) obj;
            C0145c c0145c14 = (C0145c) dVar.f3209c;
            if (!c0145c14.d(permissionRequest)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance", dVar.a(), obj2).f(e.P(Long.valueOf(c0145c14.b(permissionRequest)), Arrays.asList(permissionRequest.getResources())), new C0165x(16));
            }
        } else if (obj instanceof WebChromeClient.CustomViewCallback) {
            dVar.getClass();
            WebChromeClient.CustomViewCallback customViewCallback = (WebChromeClient.CustomViewCallback) obj;
            C0145c c0145c15 = (C0145c) dVar.f3209c;
            if (!c0145c15.d(customViewCallback)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance", dVar.a(), obj2).f(a.t(Long.valueOf(c0145c15.b(customViewCallback))), new C0165x(i4));
            }
        } else if (obj instanceof View) {
            dVar.getClass();
            View view = (View) obj;
            C0145c c0145c16 = (C0145c) dVar.f3209c;
            if (!c0145c16.d(view)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance", dVar.a(), obj2).f(a.t(Long.valueOf(c0145c16.b(view))), new C0165x(27));
            }
        } else if (obj instanceof GeolocationPermissions.Callback) {
            dVar.getClass();
            GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj;
            C0145c c0145c17 = (C0145c) dVar.f3209c;
            if (!c0145c17.d(callback)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance", dVar.a(), obj2).f(a.t(Long.valueOf(c0145c17.b(callback))), new C0165x(12));
            }
        } else if (obj instanceof HttpAuthHandler) {
            dVar.getClass();
            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj;
            C0145c c0145c18 = (C0145c) dVar.f3209c;
            if (!c0145c18.d(httpAuthHandler)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance", dVar.a(), obj2).f(a.t(Long.valueOf(c0145c18.b(httpAuthHandler))), new C0165x(14));
            }
        } else if (obj instanceof Message) {
            dVar.getClass();
            Message message = (Message) obj;
            C0145c c0145c19 = (C0145c) dVar.f3209c;
            if (!c0145c19.d(message)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance", dVar.a(), obj2).f(a.t(Long.valueOf(c0145c19.b(message))), new C0165x(0));
            }
        } else if (obj instanceof ClientCertRequest) {
            dVar.getClass();
            ClientCertRequest clientCertRequest = (ClientCertRequest) obj;
            C0145c c0145c20 = (C0145c) dVar.f3209c;
            if (!c0145c20.d(clientCertRequest)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance", dVar.a(), obj2).f(a.t(Long.valueOf(c0145c20.b(clientCertRequest))), new C0165x(4));
            }
        } else if (obj instanceof PrivateKey) {
            dVar.getClass();
            PrivateKey privateKey = (PrivateKey) obj;
            C0145c c0145c21 = (C0145c) dVar.f3209c;
            if (!c0145c21.d(privateKey)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance", dVar.a(), obj2).f(a.t(Long.valueOf(c0145c21.b(privateKey))), new C0165x(i2));
            }
        } else if (obj instanceof X509Certificate) {
            dVar.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            C0145c c0145c22 = (C0145c) dVar.f3209c;
            if (!c0145c22.d(x509Certificate)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance", dVar.a(), obj2).f(a.t(Long.valueOf(c0145c22.b(x509Certificate))), new H(20));
            }
        } else if (obj instanceof SslErrorHandler) {
            dVar.getClass();
            SslErrorHandler sslErrorHandler = (SslErrorHandler) obj;
            C0145c c0145c23 = (C0145c) dVar.f3209c;
            if (!c0145c23.d(sslErrorHandler)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance", dVar.a(), obj2).f(a.t(Long.valueOf(c0145c23.b(sslErrorHandler))), new C0165x(i3));
            }
        } else if (obj instanceof SslError) {
            dVar.getClass();
            SslError sslError = (SslError) obj;
            C0145c c0145c24 = (C0145c) dVar.f3209c;
            if (!c0145c24.d(sslError)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance", dVar.a(), obj2).f(e.P(Long.valueOf(c0145c24.b(sslError)), sslError.getCertificate(), sslError.getUrl()), new C0165x(22));
            }
        } else if (obj instanceof SslCertificate.DName) {
            dVar.getClass();
            SslCertificate.DName dName = (SslCertificate.DName) obj;
            C0145c c0145c25 = (C0145c) dVar.f3209c;
            if (!c0145c25.d(dName)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance", dVar.a(), obj2).f(a.t(Long.valueOf(c0145c25.b(dName))), new C0165x(21));
            }
        } else if (obj instanceof SslCertificate) {
            dVar.getClass();
            SslCertificate sslCertificate = (SslCertificate) obj;
            C0145c c0145c26 = (C0145c) dVar.f3209c;
            if (!c0145c26.d(sslCertificate)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance", dVar.a(), obj2).f(a.t(Long.valueOf(c0145c26.b(sslCertificate))), new C0165x(20));
            }
        } else if (obj instanceof Certificate) {
            dVar.getClass();
            Certificate certificate = (Certificate) obj;
            C0145c c0145c27 = (C0145c) dVar.f3209c;
            if (!c0145c27.d(certificate)) {
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance", dVar.a(), obj2).f(a.t(Long.valueOf(c0145c27.b(certificate))), new C0165x(2));
            }
        }
        if (!((C0145c) dVar.f3209c).d(obj)) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass().getName() + "'");
        }
        mVar.write(128);
        C0145c c0145c28 = (C0145c) dVar.f3209c;
        c0145c28.f();
        Long l2 = (Long) c0145c28.f3327b.get(obj);
        if (l2 != null) {
            c0145c28.f3329d.put(l2, obj);
        }
        k(mVar, l2);
    }
}
