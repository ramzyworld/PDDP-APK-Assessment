package a1;

import D.o;
import D.q;
import D.s;
import G.C0005f;
import G.C0007h;
import G.C0011l;
import G.C0013n;
import H0.l;
import H0.p;
import I.k;
import I0.i;
import N.C0041q;
import N.G;
import N.Q;
import N.x;
import N.y;
import Q0.AbstractC0043a;
import T.c;
import T.m;
import V0.AbstractC0068a;
import a1.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.http.SslCertificate;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.WebSettings;
import android.widget.EdgeEffect;
import android.widget.TextView;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p016j.C0123u;
import p016j.s0;
import p030q0.b;
import p030q0.f;
import p030q0.j;
import p038v.d;
import p039v0.C0143a;
import p039v0.C0144b;
import p039v0.C0151i;
import p041x0.g;
import p043y0.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f1143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f1144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Method f1145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Method f1146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Method f1147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f1148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Method f1149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f1150l;

    public a() {
        new ConcurrentHashMap();
    }

    public static void A(Drawable drawable, int i2) {
        p033s.a.g(drawable, i2);
    }

    public static void B(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        s0 s0Var = s0.f2734j;
        if (s0Var != null && s0Var.f2736a == view) {
            s0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new s0(view, charSequence);
            return;
        }
        s0 s0Var2 = s0.f2735k;
        if (s0Var2 != null && s0Var2.f2736a == view) {
            s0Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void C(f fVar, final C0151i c0151i) {
        d dVar;
        i.e(fVar, "binaryMessenger");
        j c0144b = (c0151i == null || (dVar = c0151i.f3364a) == null) ? new C0144b() : dVar.a();
        Object obj = null;
        C0013n c0013n = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.cancel", c0144b, obj);
        if (c0151i != null) {
            final int i2 = 0;
            c0013n.g(new b() { // from class: v0.y
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    switch (i2) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                c0151i2.getClass();
                                clientCertRequest.cancel();
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                c0151i3.getClass();
                                clientCertRequest2.ignore();
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        default:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            i.c(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                c0151i4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                    }
                }
            });
        } else {
            c0013n.g(null);
        }
        C0013n c0013n2 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.ignore", c0144b, obj);
        if (c0151i != null) {
            final int i3 = 1;
            c0013n2.g(new b() { // from class: v0.y
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    switch (i3) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                c0151i2.getClass();
                                clientCertRequest.cancel();
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                c0151i3.getClass();
                                clientCertRequest2.ignore();
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        default:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            i.c(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                c0151i4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                    }
                }
            });
        } else {
            c0013n2.g(null);
        }
        C0013n c0013n3 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.proceed", c0144b, obj);
        if (c0151i == null) {
            c0013n3.g(null);
        } else {
            final int i4 = 2;
            c0013n3.g(new b() { // from class: v0.y
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    switch (i4) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                c0151i2.getClass();
                                clientCertRequest.cancel();
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                c0151i3.getClass();
                                clientCertRequest2.ignore();
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        default:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            i.c(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                c0151i4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                    }
                }
            });
        }
    }

    public static void D(f fVar, final C0151i c0151i) {
        d dVar;
        i.e(fVar, "binaryMessenger");
        j c0144b = (c0151i == null || (dVar = c0151i.f3364a) == null) ? new C0144b() : dVar.a();
        Object obj = null;
        C0013n c0013n = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.instance", c0144b, obj);
        if (c0151i != null) {
            final int i2 = 0;
            c0013n.g(new b() { // from class: v0.B
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    switch (i2) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            try {
                                d dVar2 = c0151i2.f3364a;
                                ((C0145c) dVar2.f3209c).a(jLongValue, (C0159q) dVar2.f3212f);
                                listN = a.t(null);
                                break;
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            return;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0159q c0159q = (C0159q) obj4;
                            Object obj5 = list.get(1);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                c0151i3.getClass();
                                try {
                                    String[] list2 = c0159q.f3390a.list(str);
                                    listN2 = a.t(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2.getMessage());
                                }
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            return;
                        default:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            i.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0159q c0159q2 = (C0159q) obj6;
                            Object obj7 = list3.get(1);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0151i4.getClass();
                                listN3 = a.t(((String) ((p019k0.d) c0159q2.f3391b.f44f).f2803d.f2160g) + File.separator + str2);
                                break;
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            return;
                    }
                }
            });
        } else {
            c0013n.g(null);
        }
        C0013n c0013n2 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.list", c0144b, obj);
        if (c0151i != null) {
            final int i3 = 1;
            c0013n2.g(new b() { // from class: v0.B
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    switch (i3) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            try {
                                d dVar2 = c0151i2.f3364a;
                                ((C0145c) dVar2.f3209c).a(jLongValue, (C0159q) dVar2.f3212f);
                                listN = a.t(null);
                                break;
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            return;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0159q c0159q = (C0159q) obj4;
                            Object obj5 = list.get(1);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                c0151i3.getClass();
                                try {
                                    String[] list2 = c0159q.f3390a.list(str);
                                    listN2 = a.t(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2.getMessage());
                                }
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            return;
                        default:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            i.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0159q c0159q2 = (C0159q) obj6;
                            Object obj7 = list3.get(1);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0151i4.getClass();
                                listN3 = a.t(((String) ((p019k0.d) c0159q2.f3391b.f44f).f2803d.f2160g) + File.separator + str2);
                                break;
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            return;
                    }
                }
            });
        } else {
            c0013n2.g(null);
        }
        C0013n c0013n3 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.getAssetFilePathByName", c0144b, obj);
        if (c0151i == null) {
            c0013n3.g(null);
        } else {
            final int i4 = 2;
            c0013n3.g(new b() { // from class: v0.B
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    switch (i4) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            try {
                                d dVar2 = c0151i2.f3364a;
                                ((C0145c) dVar2.f3209c).a(jLongValue, (C0159q) dVar2.f3212f);
                                listN = a.t(null);
                                break;
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            return;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0159q c0159q = (C0159q) obj4;
                            Object obj5 = list.get(1);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                c0151i3.getClass();
                                try {
                                    String[] list2 = c0159q.f3390a.list(str);
                                    listN2 = a.t(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2.getMessage());
                                }
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            return;
                        default:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            i.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0159q c0159q2 = (C0159q) obj6;
                            Object obj7 = list3.get(1);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0151i4.getClass();
                                listN3 = a.t(((String) ((p019k0.d) c0159q2.f3391b.f44f).f2803d.f2160g) + File.separator + str2);
                                break;
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            return;
                    }
                }
            });
        }
    }

    public static void E(f fVar, final C0151i c0151i) {
        d dVar;
        i.e(fVar, "binaryMessenger");
        j c0144b = (c0151i == null || (dVar = c0151i.f3364a) == null) ? new C0144b() : dVar.a();
        Object obj = null;
        C0013n c0013n = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedBy", c0144b, obj);
        if (c0151i != null) {
            final int i2 = 0;
            c0013n.g(new b() { // from class: v0.D
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    X509Certificate x509Certificate;
                    switch (i2) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0151i2.getClass();
                                listN = a.t(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0151i3.getClass();
                                listN2 = a.t(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0151i4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listN3 = a.t(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            i.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0151i5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listN4 = a.t(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        default:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0151i6.f3364a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listN5 = a.t(x509Certificate);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                    }
                }
            });
        } else {
            c0013n.g(null);
        }
        C0013n c0013n2 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedTo", c0144b, obj);
        if (c0151i != null) {
            final int i3 = 1;
            c0013n2.g(new b() { // from class: v0.D
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    X509Certificate x509Certificate;
                    switch (i3) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0151i2.getClass();
                                listN = a.t(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0151i3.getClass();
                                listN2 = a.t(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0151i4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listN3 = a.t(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            i.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0151i5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listN4 = a.t(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        default:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0151i6.f3364a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listN5 = a.t(x509Certificate);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                    }
                }
            });
        } else {
            c0013n2.g(null);
        }
        C0013n c0013n3 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotAfterMsSinceEpoch", c0144b, obj);
        if (c0151i != null) {
            final int i4 = 2;
            c0013n3.g(new b() { // from class: v0.D
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    X509Certificate x509Certificate;
                    switch (i4) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0151i2.getClass();
                                listN = a.t(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0151i3.getClass();
                                listN2 = a.t(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0151i4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listN3 = a.t(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            i.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0151i5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listN4 = a.t(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        default:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0151i6.f3364a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listN5 = a.t(x509Certificate);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                    }
                }
            });
        } else {
            c0013n3.g(null);
        }
        C0013n c0013n4 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotBeforeMsSinceEpoch", c0144b, obj);
        if (c0151i != null) {
            final int i5 = 3;
            c0013n4.g(new b() { // from class: v0.D
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    X509Certificate x509Certificate;
                    switch (i5) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0151i2.getClass();
                                listN = a.t(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0151i3.getClass();
                                listN2 = a.t(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0151i4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listN3 = a.t(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            i.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0151i5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listN4 = a.t(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        default:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0151i6.f3364a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listN5 = a.t(x509Certificate);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                    }
                }
            });
        } else {
            c0013n4.g(null);
        }
        C0013n c0013n5 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getX509Certificate", c0144b, obj);
        if (c0151i == null) {
            c0013n5.g(null);
        } else {
            final int i6 = 4;
            c0013n5.g(new b() { // from class: v0.D
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    X509Certificate x509Certificate;
                    switch (i6) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0151i2.getClass();
                                listN = a.t(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0151i3.getClass();
                                listN2 = a.t(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0151i4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listN3 = a.t(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            i.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0151i5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listN4 = a.t(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        default:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0151i6.f3364a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listN5 = a.t(x509Certificate);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                    }
                }
            });
        }
    }

    public static void F(f fVar, final C0151i c0151i) {
        d dVar;
        i.e(fVar, "binaryMessenger");
        j c0144b = (c0151i == null || (dVar = c0151i.f3364a) == null) ? new C0144b() : dVar.a();
        Object obj = null;
        C0013n c0013n = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.View.scrollTo", c0144b, obj);
        if (c0151i != null) {
            final int i2 = 0;
            c0013n.g(new b() { // from class: v0.F
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    switch (i2) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                c0151i2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
                                listN = a.t(null);
                                break;
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            return;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            i.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                c0151i3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
                                listN2 = a.t(null);
                                break;
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            return;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            i.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0151i4.getClass();
                                listN3 = a.t(new f0(view3.getScrollX(), view3.getScrollY()));
                                break;
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            return;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i5.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
                                listN4 = a.t(null);
                                break;
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i6.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
                                listN5 = a.t(null);
                                break;
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            return;
                        default:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0163v enumC0163v = (EnumC0163v) obj15;
                            try {
                                c0151i7.getClass();
                                int iOrdinal = enumC0163v.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC0163v enumC0163v2 = EnumC0163v.f3399f;
                                    c0151i7.f3364a.getClass();
                                    throw new IllegalArgumentException(enumC0163v2 + " doesn't represent a native value.");
                                }
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            return;
                    }
                }
            });
        } else {
            c0013n.g(null);
        }
        C0013n c0013n2 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.View.scrollBy", c0144b, obj);
        if (c0151i != null) {
            final int i3 = 1;
            c0013n2.g(new b() { // from class: v0.F
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    switch (i3) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                c0151i2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
                                listN = a.t(null);
                                break;
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            return;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            i.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                c0151i3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
                                listN2 = a.t(null);
                                break;
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            return;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            i.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0151i4.getClass();
                                listN3 = a.t(new f0(view3.getScrollX(), view3.getScrollY()));
                                break;
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            return;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i5.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
                                listN4 = a.t(null);
                                break;
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i6.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
                                listN5 = a.t(null);
                                break;
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            return;
                        default:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0163v enumC0163v = (EnumC0163v) obj15;
                            try {
                                c0151i7.getClass();
                                int iOrdinal = enumC0163v.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC0163v enumC0163v2 = EnumC0163v.f3399f;
                                    c0151i7.f3364a.getClass();
                                    throw new IllegalArgumentException(enumC0163v2 + " doesn't represent a native value.");
                                }
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            return;
                    }
                }
            });
        } else {
            c0013n2.g(null);
        }
        C0013n c0013n3 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.View.getScrollPosition", c0144b, obj);
        if (c0151i != null) {
            final int i4 = 2;
            c0013n3.g(new b() { // from class: v0.F
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    switch (i4) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                c0151i2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
                                listN = a.t(null);
                                break;
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            return;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            i.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                c0151i3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
                                listN2 = a.t(null);
                                break;
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            return;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            i.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0151i4.getClass();
                                listN3 = a.t(new f0(view3.getScrollX(), view3.getScrollY()));
                                break;
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            return;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i5.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
                                listN4 = a.t(null);
                                break;
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i6.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
                                listN5 = a.t(null);
                                break;
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            return;
                        default:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0163v enumC0163v = (EnumC0163v) obj15;
                            try {
                                c0151i7.getClass();
                                int iOrdinal = enumC0163v.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC0163v enumC0163v2 = EnumC0163v.f3399f;
                                    c0151i7.f3364a.getClass();
                                    throw new IllegalArgumentException(enumC0163v2 + " doesn't represent a native value.");
                                }
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            return;
                    }
                }
            });
        } else {
            c0013n3.g(null);
        }
        C0013n c0013n4 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.View.setVerticalScrollBarEnabled", c0144b, obj);
        if (c0151i != null) {
            final int i5 = 3;
            c0013n4.g(new b() { // from class: v0.F
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    switch (i5) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                c0151i2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
                                listN = a.t(null);
                                break;
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            return;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            i.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                c0151i3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
                                listN2 = a.t(null);
                                break;
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            return;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            i.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0151i4.getClass();
                                listN3 = a.t(new f0(view3.getScrollX(), view3.getScrollY()));
                                break;
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            return;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i5.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
                                listN4 = a.t(null);
                                break;
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i6.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
                                listN5 = a.t(null);
                                break;
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            return;
                        default:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0163v enumC0163v = (EnumC0163v) obj15;
                            try {
                                c0151i7.getClass();
                                int iOrdinal = enumC0163v.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC0163v enumC0163v2 = EnumC0163v.f3399f;
                                    c0151i7.f3364a.getClass();
                                    throw new IllegalArgumentException(enumC0163v2 + " doesn't represent a native value.");
                                }
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            return;
                    }
                }
            });
        } else {
            c0013n4.g(null);
        }
        C0013n c0013n5 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.View.setHorizontalScrollBarEnabled", c0144b, obj);
        if (c0151i != null) {
            final int i6 = 4;
            c0013n5.g(new b() { // from class: v0.F
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    switch (i6) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                c0151i2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
                                listN = a.t(null);
                                break;
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            return;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            i.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                c0151i3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
                                listN2 = a.t(null);
                                break;
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            return;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            i.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0151i4.getClass();
                                listN3 = a.t(new f0(view3.getScrollX(), view3.getScrollY()));
                                break;
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            return;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i5.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
                                listN4 = a.t(null);
                                break;
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i6.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
                                listN5 = a.t(null);
                                break;
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            return;
                        default:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0163v enumC0163v = (EnumC0163v) obj15;
                            try {
                                c0151i7.getClass();
                                int iOrdinal = enumC0163v.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC0163v enumC0163v2 = EnumC0163v.f3399f;
                                    c0151i7.f3364a.getClass();
                                    throw new IllegalArgumentException(enumC0163v2 + " doesn't represent a native value.");
                                }
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            return;
                    }
                }
            });
        } else {
            c0013n5.g(null);
        }
        C0013n c0013n6 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.View.setOverScrollMode", c0144b, obj);
        if (c0151i == null) {
            c0013n6.g(null);
        } else {
            final int i7 = 5;
            c0013n6.g(new b() { // from class: v0.F
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    switch (i7) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                c0151i2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
                                listN = a.t(null);
                                break;
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            return;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            i.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            i.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                c0151i3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
                                listN2 = a.t(null);
                                break;
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            return;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            i.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0151i4.getClass();
                                listN3 = a.t(new f0(view3.getScrollX(), view3.getScrollY()));
                                break;
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            return;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i5.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
                                listN4 = a.t(null);
                                break;
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i6.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
                                listN5 = a.t(null);
                                break;
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            return;
                        default:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0163v enumC0163v = (EnumC0163v) obj15;
                            try {
                                c0151i7.getClass();
                                int iOrdinal = enumC0163v.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC0163v enumC0163v2 = EnumC0163v.f3399f;
                                    c0151i7.f3364a.getClass();
                                    throw new IllegalArgumentException(enumC0163v2 + " doesn't represent a native value.");
                                }
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            return;
                    }
                }
            });
        }
    }

    public static void G(f fVar, final C0151i c0151i) {
        d dVar;
        i.e(fVar, "binaryMessenger");
        j c0144b = (c0151i == null || (dVar = c0151i.f3364a) == null) ? new C0144b() : dVar.a();
        Object obj = null;
        C0013n c0013n = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDomStorageEnabled", c0144b, obj);
        if (c0151i != null) {
            final int i2 = 0;
            c0013n.g(new b() { // from class: v0.J
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    List listN7;
                    List listN8;
                    List listN9;
                    List listN10;
                    List listN11;
                    List listN12;
                    List listN13;
                    List listN14;
                    List listN15;
                    List listN16;
                    List listN17;
                    switch (i2) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0151i2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0151i3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0151i4.getClass();
                                webSettings3.setUserAgentString(str);
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0151i8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0151i9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0151i10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            i.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            i.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0151i11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0151i12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listN11 = a.t(null);
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            i.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0151i13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0151i14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listN13 = a.t(null);
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            i.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            i.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0162u enumC0162u = (EnumC0162u) obj30;
                            try {
                                c0151i16.getClass();
                                int iOrdinal = enumC0162u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        default:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            i.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0151i18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                    }
                }
            });
        } else {
            c0013n.g(null);
        }
        C0013n c0013n2 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptCanOpenWindowsAutomatically", c0144b, obj);
        if (c0151i != null) {
            final int i3 = 15;
            c0013n2.g(new b() { // from class: v0.J
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    List listN7;
                    List listN8;
                    List listN9;
                    List listN10;
                    List listN11;
                    List listN12;
                    List listN13;
                    List listN14;
                    List listN15;
                    List listN16;
                    List listN17;
                    switch (i3) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0151i2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0151i3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0151i4.getClass();
                                webSettings3.setUserAgentString(str);
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0151i8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0151i9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0151i10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            i.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            i.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0151i11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0151i12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listN11 = a.t(null);
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            i.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0151i13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0151i14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listN13 = a.t(null);
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            i.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            i.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0162u enumC0162u = (EnumC0162u) obj30;
                            try {
                                c0151i16.getClass();
                                int iOrdinal = enumC0162u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        default:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            i.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0151i18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                    }
                }
            });
        } else {
            c0013n2.g(null);
        }
        C0013n c0013n3 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportMultipleWindows", c0144b, obj);
        if (c0151i != null) {
            final int i4 = 16;
            c0013n3.g(new b() { // from class: v0.J
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    List listN7;
                    List listN8;
                    List listN9;
                    List listN10;
                    List listN11;
                    List listN12;
                    List listN13;
                    List listN14;
                    List listN15;
                    List listN16;
                    List listN17;
                    switch (i4) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0151i2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0151i3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0151i4.getClass();
                                webSettings3.setUserAgentString(str);
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0151i8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0151i9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0151i10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            i.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            i.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0151i11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0151i12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listN11 = a.t(null);
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            i.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0151i13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0151i14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listN13 = a.t(null);
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            i.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            i.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0162u enumC0162u = (EnumC0162u) obj30;
                            try {
                                c0151i16.getClass();
                                int iOrdinal = enumC0162u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        default:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            i.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0151i18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                    }
                }
            });
        } else {
            c0013n3.g(null);
        }
        C0013n c0013n4 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptEnabled", c0144b, obj);
        if (c0151i != null) {
            final int i5 = 1;
            c0013n4.g(new b() { // from class: v0.J
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    List listN7;
                    List listN8;
                    List listN9;
                    List listN10;
                    List listN11;
                    List listN12;
                    List listN13;
                    List listN14;
                    List listN15;
                    List listN16;
                    List listN17;
                    switch (i5) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0151i2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0151i3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0151i4.getClass();
                                webSettings3.setUserAgentString(str);
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0151i8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0151i9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0151i10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            i.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            i.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0151i11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0151i12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listN11 = a.t(null);
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            i.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0151i13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0151i14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listN13 = a.t(null);
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            i.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            i.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0162u enumC0162u = (EnumC0162u) obj30;
                            try {
                                c0151i16.getClass();
                                int iOrdinal = enumC0162u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        default:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            i.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0151i18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                    }
                }
            });
        } else {
            c0013n4.g(null);
        }
        C0013n c0013n5 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUserAgentString", c0144b, obj);
        if (c0151i != null) {
            final int i6 = 2;
            c0013n5.g(new b() { // from class: v0.J
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    List listN7;
                    List listN8;
                    List listN9;
                    List listN10;
                    List listN11;
                    List listN12;
                    List listN13;
                    List listN14;
                    List listN15;
                    List listN16;
                    List listN17;
                    switch (i6) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0151i2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0151i3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0151i4.getClass();
                                webSettings3.setUserAgentString(str);
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0151i8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0151i9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0151i10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            i.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            i.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0151i11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0151i12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listN11 = a.t(null);
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            i.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0151i13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0151i14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listN13 = a.t(null);
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            i.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            i.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0162u enumC0162u = (EnumC0162u) obj30;
                            try {
                                c0151i16.getClass();
                                int iOrdinal = enumC0162u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        default:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            i.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0151i18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                    }
                }
            });
        } else {
            c0013n5.g(null);
        }
        C0013n c0013n6 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMediaPlaybackRequiresUserGesture", c0144b, obj);
        if (c0151i != null) {
            final int i7 = 3;
            c0013n6.g(new b() { // from class: v0.J
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    List listN7;
                    List listN8;
                    List listN9;
                    List listN10;
                    List listN11;
                    List listN12;
                    List listN13;
                    List listN14;
                    List listN15;
                    List listN16;
                    List listN17;
                    switch (i7) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0151i2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0151i3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0151i4.getClass();
                                webSettings3.setUserAgentString(str);
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0151i8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0151i9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0151i10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            i.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            i.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0151i11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0151i12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listN11 = a.t(null);
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            i.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0151i13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0151i14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listN13 = a.t(null);
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            i.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            i.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0162u enumC0162u = (EnumC0162u) obj30;
                            try {
                                c0151i16.getClass();
                                int iOrdinal = enumC0162u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        default:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            i.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0151i18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                    }
                }
            });
        } else {
            c0013n6.g(null);
        }
        C0013n c0013n7 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportZoom", c0144b, obj);
        if (c0151i != null) {
            final int i8 = 4;
            c0013n7.g(new b() { // from class: v0.J
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    List listN7;
                    List listN8;
                    List listN9;
                    List listN10;
                    List listN11;
                    List listN12;
                    List listN13;
                    List listN14;
                    List listN15;
                    List listN16;
                    List listN17;
                    switch (i8) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0151i2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0151i3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0151i4.getClass();
                                webSettings3.setUserAgentString(str);
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0151i8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0151i9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0151i10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            i.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            i.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0151i11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0151i12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listN11 = a.t(null);
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            i.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0151i13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0151i14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listN13 = a.t(null);
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            i.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            i.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0162u enumC0162u = (EnumC0162u) obj30;
                            try {
                                c0151i16.getClass();
                                int iOrdinal = enumC0162u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        default:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            i.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0151i18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                    }
                }
            });
        } else {
            c0013n7.g(null);
        }
        C0013n c0013n8 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setLoadWithOverviewMode", c0144b, obj);
        if (c0151i != null) {
            final int i9 = 5;
            c0013n8.g(new b() { // from class: v0.J
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    List listN7;
                    List listN8;
                    List listN9;
                    List listN10;
                    List listN11;
                    List listN12;
                    List listN13;
                    List listN14;
                    List listN15;
                    List listN16;
                    List listN17;
                    switch (i9) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0151i2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0151i3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0151i4.getClass();
                                webSettings3.setUserAgentString(str);
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0151i8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0151i9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0151i10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            i.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            i.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0151i11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0151i12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listN11 = a.t(null);
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            i.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0151i13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0151i14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listN13 = a.t(null);
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            i.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            i.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0162u enumC0162u = (EnumC0162u) obj30;
                            try {
                                c0151i16.getClass();
                                int iOrdinal = enumC0162u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        default:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            i.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0151i18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                    }
                }
            });
        } else {
            c0013n8.g(null);
        }
        C0013n c0013n9 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUseWideViewPort", c0144b, obj);
        if (c0151i != null) {
            final int i10 = 6;
            c0013n9.g(new b() { // from class: v0.J
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    List listN7;
                    List listN8;
                    List listN9;
                    List listN10;
                    List listN11;
                    List listN12;
                    List listN13;
                    List listN14;
                    List listN15;
                    List listN16;
                    List listN17;
                    switch (i10) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0151i2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0151i3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0151i4.getClass();
                                webSettings3.setUserAgentString(str);
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0151i8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0151i9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0151i10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            i.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            i.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0151i11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0151i12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listN11 = a.t(null);
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            i.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0151i13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0151i14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listN13 = a.t(null);
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            i.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            i.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0162u enumC0162u = (EnumC0162u) obj30;
                            try {
                                c0151i16.getClass();
                                int iOrdinal = enumC0162u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        default:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            i.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0151i18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                    }
                }
            });
        } else {
            c0013n9.g(null);
        }
        C0013n c0013n10 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDisplayZoomControls", c0144b, obj);
        if (c0151i != null) {
            final int i11 = 7;
            c0013n10.g(new b() { // from class: v0.J
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    List listN7;
                    List listN8;
                    List listN9;
                    List listN10;
                    List listN11;
                    List listN12;
                    List listN13;
                    List listN14;
                    List listN15;
                    List listN16;
                    List listN17;
                    switch (i11) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0151i2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0151i3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0151i4.getClass();
                                webSettings3.setUserAgentString(str);
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0151i8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0151i9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0151i10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            i.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            i.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0151i11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0151i12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listN11 = a.t(null);
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            i.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0151i13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0151i14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listN13 = a.t(null);
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            i.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            i.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0162u enumC0162u = (EnumC0162u) obj30;
                            try {
                                c0151i16.getClass();
                                int iOrdinal = enumC0162u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        default:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            i.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0151i18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                    }
                }
            });
        } else {
            c0013n10.g(null);
        }
        C0013n c0013n11 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setBuiltInZoomControls", c0144b, obj);
        if (c0151i != null) {
            final int i12 = 8;
            c0013n11.g(new b() { // from class: v0.J
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    List listN7;
                    List listN8;
                    List listN9;
                    List listN10;
                    List listN11;
                    List listN12;
                    List listN13;
                    List listN14;
                    List listN15;
                    List listN16;
                    List listN17;
                    switch (i12) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0151i2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0151i3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0151i4.getClass();
                                webSettings3.setUserAgentString(str);
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0151i8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0151i9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0151i10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            i.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            i.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0151i11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0151i12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listN11 = a.t(null);
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            i.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0151i13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0151i14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listN13 = a.t(null);
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            i.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            i.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0162u enumC0162u = (EnumC0162u) obj30;
                            try {
                                c0151i16.getClass();
                                int iOrdinal = enumC0162u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        default:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            i.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0151i18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                    }
                }
            });
        } else {
            c0013n11.g(null);
        }
        C0013n c0013n12 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowFileAccess", c0144b, obj);
        if (c0151i != null) {
            final int i13 = 9;
            c0013n12.g(new b() { // from class: v0.J
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    List listN7;
                    List listN8;
                    List listN9;
                    List listN10;
                    List listN11;
                    List listN12;
                    List listN13;
                    List listN14;
                    List listN15;
                    List listN16;
                    List listN17;
                    switch (i13) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0151i2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0151i3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0151i4.getClass();
                                webSettings3.setUserAgentString(str);
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0151i8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0151i9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0151i10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            i.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            i.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0151i11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0151i12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listN11 = a.t(null);
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            i.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0151i13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0151i14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listN13 = a.t(null);
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            i.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            i.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0162u enumC0162u = (EnumC0162u) obj30;
                            try {
                                c0151i16.getClass();
                                int iOrdinal = enumC0162u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        default:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            i.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0151i18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                    }
                }
            });
        } else {
            c0013n12.g(null);
        }
        C0013n c0013n13 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowContentAccess", c0144b, obj);
        if (c0151i != null) {
            final int i14 = 10;
            c0013n13.g(new b() { // from class: v0.J
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    List listN7;
                    List listN8;
                    List listN9;
                    List listN10;
                    List listN11;
                    List listN12;
                    List listN13;
                    List listN14;
                    List listN15;
                    List listN16;
                    List listN17;
                    switch (i14) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0151i2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0151i3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0151i4.getClass();
                                webSettings3.setUserAgentString(str);
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0151i8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0151i9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0151i10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            i.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            i.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0151i11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0151i12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listN11 = a.t(null);
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            i.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0151i13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0151i14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listN13 = a.t(null);
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            i.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            i.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0162u enumC0162u = (EnumC0162u) obj30;
                            try {
                                c0151i16.getClass();
                                int iOrdinal = enumC0162u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        default:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            i.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0151i18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                    }
                }
            });
        } else {
            c0013n13.g(null);
        }
        C0013n c0013n14 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setGeolocationEnabled", c0144b, obj);
        if (c0151i != null) {
            final int i15 = 11;
            c0013n14.g(new b() { // from class: v0.J
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    List listN7;
                    List listN8;
                    List listN9;
                    List listN10;
                    List listN11;
                    List listN12;
                    List listN13;
                    List listN14;
                    List listN15;
                    List listN16;
                    List listN17;
                    switch (i15) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0151i2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0151i3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0151i4.getClass();
                                webSettings3.setUserAgentString(str);
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0151i8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0151i9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0151i10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            i.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            i.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0151i11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0151i12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listN11 = a.t(null);
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            i.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0151i13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0151i14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listN13 = a.t(null);
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            i.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            i.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0162u enumC0162u = (EnumC0162u) obj30;
                            try {
                                c0151i16.getClass();
                                int iOrdinal = enumC0162u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        default:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            i.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0151i18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                    }
                }
            });
        } else {
            c0013n14.g(null);
        }
        C0013n c0013n15 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setTextZoom", c0144b, obj);
        if (c0151i != null) {
            final int i16 = 12;
            c0013n15.g(new b() { // from class: v0.J
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    List listN7;
                    List listN8;
                    List listN9;
                    List listN10;
                    List listN11;
                    List listN12;
                    List listN13;
                    List listN14;
                    List listN15;
                    List listN16;
                    List listN17;
                    switch (i16) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0151i2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0151i3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0151i4.getClass();
                                webSettings3.setUserAgentString(str);
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0151i8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0151i9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0151i10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            i.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            i.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0151i11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0151i12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listN11 = a.t(null);
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            i.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0151i13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0151i14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listN13 = a.t(null);
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            i.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            i.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0162u enumC0162u = (EnumC0162u) obj30;
                            try {
                                c0151i16.getClass();
                                int iOrdinal = enumC0162u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        default:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            i.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0151i18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                    }
                }
            });
        } else {
            c0013n15.g(null);
        }
        C0013n c0013n16 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.getUserAgentString", c0144b, obj);
        if (c0151i != null) {
            final int i17 = 13;
            c0013n16.g(new b() { // from class: v0.J
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    List listN7;
                    List listN8;
                    List listN9;
                    List listN10;
                    List listN11;
                    List listN12;
                    List listN13;
                    List listN14;
                    List listN15;
                    List listN16;
                    List listN17;
                    switch (i17) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0151i2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0151i3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0151i4.getClass();
                                webSettings3.setUserAgentString(str);
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0151i8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0151i9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0151i10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            i.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            i.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0151i11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0151i12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listN11 = a.t(null);
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            i.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0151i13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0151i14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listN13 = a.t(null);
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            i.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            i.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0162u enumC0162u = (EnumC0162u) obj30;
                            try {
                                c0151i16.getClass();
                                int iOrdinal = enumC0162u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        default:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            i.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0151i18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                    }
                }
            });
        } else {
            c0013n16.g(null);
        }
        C0013n c0013n17 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMixedContentMode", c0144b, obj);
        if (c0151i == null) {
            c0013n17.g(null);
        } else {
            final int i18 = 14;
            c0013n17.g(new b() { // from class: v0.J
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    List listN5;
                    List listN6;
                    List listN7;
                    List listN8;
                    List listN9;
                    List listN10;
                    List listN11;
                    List listN12;
                    List listN13;
                    List listN14;
                    List listN15;
                    List listN16;
                    List listN17;
                    switch (i18) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            i.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0151i2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0151i3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0151i4.getClass();
                                webSettings3.setUserAgentString(str);
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            i.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            i.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            i.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0151i8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            i.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0151i9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0151i10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            i.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            i.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0151i11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            i.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0151i12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listN11 = a.t(null);
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            i.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0151i13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            i.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0151i14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listN13 = a.t(null);
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            i.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            i.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0162u enumC0162u = (EnumC0162u) obj30;
                            try {
                                c0151i16.getClass();
                                int iOrdinal = enumC0162u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        default:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            i.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0151i18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void H(p pVar, AbstractC0043a abstractC0043a, AbstractC0043a abstractC0043a2) {
        try {
            AbstractC0068a.h(p000a.a.x(((B0.b) pVar).b(abstractC0043a, abstractC0043a2)), g.f3419a, null);
        } catch (Throwable th) {
            abstractC0043a2.m(p000a.a.l(th));
            throw th;
        }
    }

    public static String I(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static final boolean J(String str, H0.a aVar) {
        try {
            boolean zBooleanValue = ((Boolean) aVar.f()).booleanValue();
            if (!zBooleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static Drawable K(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 || (drawable instanceof p033s.d)) {
            return drawable;
        }
        p033s.f fVar = new p033s.f();
        fVar.f3066h = fVar.c();
        fVar.h(drawable);
        p033s.f.a();
        return fVar;
    }

    public static Object L(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(L(it.next()));
                }
                return jSONArray;
            }
            if (obj.getClass().isArray()) {
                JSONArray jSONArray2 = new JSONArray();
                int length = Array.getLength(obj);
                for (int i2 = 0; i2 < length; i2++) {
                    jSONArray2.put(L(Array.get(obj, i2)));
                }
                return jSONArray2;
            }
            if (obj instanceof Map) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    jSONObject.put((String) entry.getKey(), L(entry.getValue()));
                }
                return jSONObject;
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
                if (obj.getClass().getPackage().getName().startsWith("java.")) {
                    return obj.toString();
                }
                return null;
            }
            return obj;
        } catch (Exception unused) {
        }
    }

    public static ActionMode.Callback M(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof s) || callback == null) ? callback : new s(callback, textView);
    }

    public static List N(Throwable th) {
        if (th instanceof C0143a) {
            C0143a c0143a = (C0143a) th;
            return e.P(c0143a.f3315e, ((C0143a) th).f3316f, c0143a.f3317g);
        }
        return e.P(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0065->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    public static final Object a(List list, C0011l c0011l, B0.b bVar) throws Throwable {
        C0005f c0005f;
        List list2;
        I0.p pVar;
        Iterator it;
        Throwable th;
        l lVar;
        if (bVar instanceof C0005f) {
            c0005f = (C0005f) bVar;
            int i2 = c0005f.f202k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0005f.f202k = i2 - Integer.MIN_VALUE;
            } else {
                c0005f = new C0005f(bVar);
            }
        } else {
            c0005f = new C0005f(bVar);
        }
        Object obj = c0005f.f201j;
        Object obj2 = A0.a.f0e;
        int i3 = c0005f.f202k;
        if (i3 != 0) {
            if (i3 == 1) {
                list2 = (List) c0005f.f199h;
                p000a.a.O(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c0005f.f200i;
                pVar = (I0.p) c0005f.f199h;
                try {
                    p000a.a.O(obj);
                } catch (Throwable th2) {
                    Object obj3 = pVar.f338e;
                    if (obj3 == null) {
                        pVar.f338e = th2;
                    } else {
                        c((Throwable) obj3, th2);
                    }
                }
            }
            while (it.hasNext()) {
                lVar = (l) it.next();
                c0005f.f199h = pVar;
                c0005f.f200i = it;
                c0005f.f202k = 2;
                if (lVar.j(c0005f) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) pVar.f338e;
            if (th == null) {
                return g.f3419a;
            }
            throw th;
        }
        p000a.a.O(obj);
        ArrayList arrayList = new ArrayList();
        C0007h c0007h = new C0007h(list, arrayList, null);
        c0005f.f199h = arrayList;
        c0005f.f202k = 1;
        if (c0011l.a(c0007h, c0005f) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        pVar = new I0.p();
        it = list2.iterator();
        while (it.hasNext()) {
            lVar = (l) it.next();
            c0005f.f199h = pVar;
            c0005f.f200i = it;
            c0005f.f202k = 2;
            if (lVar.j(c0005f) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) pVar.f338e;
        if (th == null) {
            return g.f3419a;
        }
        throw th;
    }

    public static final List b(Throwable th) {
        return e.P(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public static void c(Throwable th, Throwable th2) {
        i.e(th, "<this>");
        i.e(th2, "exception");
        if (th != th2) {
            Integer num = D0.a.f53a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = C0.a.f12a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static Object d(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static int e(G g2, C0041q c0041q, View view, View view2, x xVar, boolean z2) {
        int iS;
        int iT;
        if (xVar.p() == 0 || g2.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            ((y) view.getLayoutParams()).getClass();
            throw null;
        }
        int iB = c0041q.b(view2) - c0041q.c(view);
        switch (c0041q.f545b) {
            case 0:
                x xVar2 = c0041q.f544a;
                iS = xVar2.f557f - xVar2.s();
                iT = xVar2.t();
                break;
            default:
                x xVar3 = c0041q.f544a;
                iS = xVar3.f558g - xVar3.u();
                iT = xVar3.r();
                break;
        }
        return Math.min(iS - iT, iB);
    }

    public static int f(G g2, C0041q c0041q, View view, View view2, x xVar, boolean z2) {
        if (xVar.p() == 0 || g2.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return g2.a();
        }
        c0041q.b(view2);
        c0041q.c(view);
        ((y) view.getLayoutParams()).getClass();
        throw null;
    }

    public static boolean k(Method method, I0.e eVar) {
        Class clsA = eVar.a();
        i.c(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(clsA);
    }

    public static String m(Context context) {
        return Build.VERSION.SDK_INT >= 24 ? context.getDataDir().getPath() : context.getApplicationInfo().dataDir;
    }

    public static float n(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return D.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static int o(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return p033s.b.a(drawable);
        }
        if (!f1150l) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                f1149k = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e2);
            }
            f1150l = true;
        }
        Method method = f1149k;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, null)).intValue();
        } catch (Exception e3) {
            Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e3);
            f1149k = null;
            return 0;
        }
    }

    public static p040w.a p(C0123u c0123u) {
        int iA;
        int iD;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new p040w.a(q.c(c0123u));
        }
        TextPaint textPaint = new TextPaint(c0123u.getPaint());
        if (i2 >= 23) {
            iA = 1;
            iD = 1;
        } else {
            iA = 0;
            iD = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i2 >= 23) {
            iA = o.a(c0123u);
            iD = o.d(c0123u);
        }
        if (c0123u.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i2 < 28 || (c0123u.getInputType() & 15) != 3) {
            boolean z2 = c0123u.getLayoutDirection() == 1;
            switch (c0123u.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case k.LONG_FIELD_NUMBER /* 4 */:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case k.STRING_FIELD_NUMBER /* 5 */:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case k.STRING_SET_FIELD_NUMBER /* 6 */:
                    break;
                case k.DOUBLE_FIELD_NUMBER /* 7 */:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z2) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(q.b(D.p.a(c0123u.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new p040w.a(textPaint, textDirectionHeuristic, iA, iD);
    }

    public static void q(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean r(String str) {
        T.b bVar = m.f831a;
        Set<T.f> setUnmodifiableSet = Collections.unmodifiableSet(c.f822c);
        HashSet hashSet = new HashSet();
        for (T.f fVar : setUnmodifiableSet) {
            if (((c) fVar).f823a.equals(str)) {
                hashSet.add(fVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c cVar = (c) ((T.f) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(byte b2) {
        return b2 > -65;
    }

    public static List t(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        i.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static float u(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return D.e.c(edgeEffect, f2, f3);
        }
        D.d.a(edgeEffect, f2, f3);
        return f2;
    }

    public static void v(p013h0.c cVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", p013h0.c.class).invoke(null, cVar);
        } catch (Exception e2) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + cVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e2);
        }
    }

    public static void y(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            q.d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void z(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public abstract void O(byte[] bArr, int i2, int i3);

    public abstract Typeface g(Context context, p029q.g gVar, Resources resources, int i2);

    public abstract Typeface h(Context context, p038v.i[] iVarArr, int i2);

    public Typeface i(Context context, InputStream inputStream) {
        File fileW = p000a.a.w(context);
        if (fileW == null) {
            return null;
        }
        try {
            if (p000a.a.k(fileW, inputStream)) {
                return Typeface.createFromFile(fileW.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileW.delete();
        }
    }

    public Typeface j(Context context, Resources resources, int i2, String str, int i3) {
        File fileW = p000a.a.w(context);
        if (fileW == null) {
            return null;
        }
        try {
            if (p000a.a.j(fileW, resources, i2)) {
                return Typeface.createFromFile(fileW.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileW.delete();
        }
    }

    public p038v.i l(p038v.i[] iVarArr, int i2) {
        new H.a(23);
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        p038v.i iVar = null;
        int i4 = Integer.MAX_VALUE;
        for (p038v.i iVar2 : iVarArr) {
            int iAbs = (Math.abs(iVar2.f3228c - i3) * 2) + (iVar2.f3229d == z2 ? 0 : 1);
            if (iVar == null || i4 > iAbs) {
                iVar = iVar2;
                i4 = iAbs;
            }
        }
        return iVar;
    }

    public void w(boolean z2) {
    }

    public void x(boolean z2) {
    }
}
