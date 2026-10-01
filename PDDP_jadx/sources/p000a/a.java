package p000a;

import D.n;
import G.C0013n;
import H0.p;
import I.k;
import I0.i;
import I0.s;
import N.Q;
import Q0.AbstractC0060s;
import Q0.AbstractC0063v;
import Q0.C0056n;
import V0.u;
import Y.m;
import Y.o;
import a1.a;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.PopupWindow;
import androidx.datastore.preferences.protobuf.C0075g;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p016j.r;
import p029q.l;
import p030q0.b;
import p030q0.f;
import p030q0.j;
import p038v.d;
import p039v0.C0144b;
import p039v0.C0145c;
import p039v0.C0148f;
import p039v0.C0151i;
import p041x0.c;
import p041x0.e;
import p042y.E;
import p042y.F;
import p042y.G;
import p042y.H;
import p042y.O;
import z0.g;
import z0.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f1125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f1126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Field f1127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f1128d;

    public static MappedByteBuffer A(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static void E(r rVar, boolean z2) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.c(rVar, z2);
            return;
        }
        if (!f1128d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f1127c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
            }
            f1128d = true;
        }
        Field field = f1127c;
        if (field != null) {
            try {
                field.set(rVar, Boolean.valueOf(z2));
            } catch (IllegalAccessException e3) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
            }
        }
    }

    public static void F(f fVar, final C0145c c0145c) {
        i.e(fVar, "binaryMessenger");
        e eVar = C0148f.f3349b;
        Object obj = null;
        C0013n c0013n = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (j) eVar.a(), obj);
        if (c0145c != null) {
            final int i2 = 0;
            c0013n.g(new b() { // from class: v0.d
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    switch (i2) {
                        case 0:
                            C0145c c0145c2 = c0145c;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            Long l2 = (Long) obj3;
                            long jLongValue = l2.longValue();
                            try {
                                c0145c2.f();
                                Object objE = c0145c2.e(jLongValue);
                                if (objE instanceof h0) {
                                    ((h0) objE).destroy();
                                }
                                c0145c2.f3329d.remove(l2);
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        default:
                            C0145c c0145c3 = c0145c;
                            try {
                                c0145c3.f3327b.clear();
                                c0145c3.f3328c.clear();
                                c0145c3.f3329d.clear();
                                c0145c3.f3331f.clear();
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                    }
                }
            });
        } else {
            c0013n.g(null);
        }
        C0013n c0013n2 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear", (j) eVar.a(), obj);
        if (c0145c == null) {
            c0013n2.g(null);
        } else {
            final int i3 = 1;
            c0013n2.g(new b() { // from class: v0.d
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    switch (i3) {
                        case 0:
                            C0145c c0145c2 = c0145c;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            Long l2 = (Long) obj3;
                            long jLongValue = l2.longValue();
                            try {
                                c0145c2.f();
                                Object objE = c0145c2.e(jLongValue);
                                if (objE instanceof h0) {
                                    ((h0) objE).destroy();
                                }
                                c0145c2.f3329d.remove(l2);
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        default:
                            C0145c c0145c3 = c0145c;
                            try {
                                c0145c3.f3327b.clear();
                                c0145c3.f3328c.clear();
                                c0145c3.f3329d.clear();
                                c0145c3.f3331f.clear();
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
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
        C0013n c0013n = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.instance", c0144b, obj);
        if (c0151i != null) {
            final int i2 = 0;
            c0013n.g(new b() { // from class: v0.z
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
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0151i3.getClass();
                                cookieManager.setCookie(str, str2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            A a2 = new A(q2, 0);
                            c0151i.getClass();
                            ((CookieManager) obj7).removeAllCookies(new C0154l(a2, 0));
                            break;
                        default:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            i.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            i.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0151i4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
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
        C0013n c0013n2 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setCookie", c0144b, obj);
        if (c0151i != null) {
            final int i3 = 1;
            c0013n2.g(new b() { // from class: v0.z
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
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0151i3.getClass();
                                cookieManager.setCookie(str, str2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            A a2 = new A(q2, 0);
                            c0151i.getClass();
                            ((CookieManager) obj7).removeAllCookies(new C0154l(a2, 0));
                            break;
                        default:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            i.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            i.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0151i4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
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
        C0013n c0013n3 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.removeAllCookies", c0144b, obj);
        if (c0151i != null) {
            final int i4 = 2;
            c0013n3.g(new b() { // from class: v0.z
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
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0151i3.getClass();
                                cookieManager.setCookie(str, str2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            A a2 = new A(q2, 0);
                            c0151i.getClass();
                            ((CookieManager) obj7).removeAllCookies(new C0154l(a2, 0));
                            break;
                        default:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            i.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            i.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0151i4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
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
            c0013n3.g(null);
        }
        C0013n c0013n4 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setAcceptThirdPartyCookies", c0144b, obj);
        if (c0151i == null) {
            c0013n4.g(null);
        } else {
            final int i5 = 3;
            c0013n4.g(new b() { // from class: v0.z
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    switch (i5) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0151i3.getClass();
                                cookieManager.setCookie(str, str2);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            A a2 = new A(q2, 0);
                            c0151i.getClass();
                            ((CookieManager) obj7).removeAllCookies(new C0154l(a2, 0));
                            break;
                        default:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            i.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            i.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0151i4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
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

    public static void H(f fVar, final C0151i c0151i) {
        d dVar;
        i.e(fVar, "binaryMessenger");
        j c0144b = (c0151i == null || (dVar = c0151i.f3364a) == null) ? new C0144b() : dVar.a();
        Object obj = null;
        C0013n c0013n = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.useHttpAuthUsernamePassword", c0144b, obj);
        if (c0151i != null) {
            final int i2 = 0;
            c0013n.g(new b() { // from class: v0.C
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
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                c0151i2.getClass();
                                listN = a.t(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                c0151i3.getClass();
                                httpAuthHandler2.cancel();
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
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0151i4.getClass();
                                httpAuthHandler3.proceed(str, str2);
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
        C0013n c0013n2 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.cancel", c0144b, obj);
        if (c0151i != null) {
            final int i3 = 1;
            c0013n2.g(new b() { // from class: v0.C
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
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                c0151i2.getClass();
                                listN = a.t(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                c0151i3.getClass();
                                httpAuthHandler2.cancel();
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
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0151i4.getClass();
                                httpAuthHandler3.proceed(str, str2);
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
        C0013n c0013n3 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.proceed", c0144b, obj);
        if (c0151i == null) {
            c0013n3.g(null);
        } else {
            final int i4 = 2;
            c0013n3.g(new b() { // from class: v0.C
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
                            i.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                c0151i2.getClass();
                                listN = a.t(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                c0151i3.getClass();
                                httpAuthHandler2.cancel();
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
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0151i4.getClass();
                                httpAuthHandler3.proceed(str, str2);
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

    public static void I(f fVar, final C0151i c0151i) {
        d dVar;
        i.e(fVar, "binaryMessenger");
        j c0144b = (c0151i == null || (dVar = c0151i.f3364a) == null) ? new C0144b() : dVar.a();
        Object obj = null;
        C0013n c0013n = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getCName", c0144b, obj);
        if (c0151i != null) {
            final int i2 = 0;
            c0013n.g(new b() { // from class: v0.E
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    switch (i2) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                c0151i2.getClass();
                                listN = a.t(dName.getCName());
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                c0151i3.getClass();
                                listN2 = a.t(dName2.getDName());
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                c0151i4.getClass();
                                listN3 = a.t(dName3.getOName());
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        default:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            i.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                c0151i5.getClass();
                                listN4 = a.t(dName4.getUName());
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                    }
                }
            });
        } else {
            c0013n.g(null);
        }
        C0013n c0013n2 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getDName", c0144b, obj);
        if (c0151i != null) {
            final int i3 = 1;
            c0013n2.g(new b() { // from class: v0.E
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    switch (i3) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                c0151i2.getClass();
                                listN = a.t(dName.getCName());
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                c0151i3.getClass();
                                listN2 = a.t(dName2.getDName());
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                c0151i4.getClass();
                                listN3 = a.t(dName3.getOName());
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        default:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            i.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                c0151i5.getClass();
                                listN4 = a.t(dName4.getUName());
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                    }
                }
            });
        } else {
            c0013n2.g(null);
        }
        C0013n c0013n3 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getOName", c0144b, obj);
        if (c0151i != null) {
            final int i4 = 2;
            c0013n3.g(new b() { // from class: v0.E
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    switch (i4) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                c0151i2.getClass();
                                listN = a.t(dName.getCName());
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                c0151i3.getClass();
                                listN2 = a.t(dName2.getDName());
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                c0151i4.getClass();
                                listN3 = a.t(dName3.getOName());
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        default:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            i.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                c0151i5.getClass();
                                listN4 = a.t(dName4.getUName());
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                    }
                }
            });
        } else {
            c0013n3.g(null);
        }
        C0013n c0013n4 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getUName", c0144b, obj);
        if (c0151i == null) {
            c0013n4.g(null);
        } else {
            final int i5 = 3;
            c0013n4.g(new b() { // from class: v0.E
                @Override // p030q0.b
                public final void o(Object obj2, Q q2) {
                    List listN;
                    List listN2;
                    List listN3;
                    List listN4;
                    switch (i5) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                c0151i2.getClass();
                                listN = a.t(dName.getCName());
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                c0151i3.getClass();
                                listN2 = a.t(dName2.getDName());
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                c0151i4.getClass();
                                listN3 = a.t(dName3.getOName());
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        default:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            i.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                c0151i5.getClass();
                                listN4 = a.t(dName4.getUName());
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                    }
                }
            });
        }
    }

    public static void J(f fVar, final C0151i c0151i) {
        d dVar;
        i.e(fVar, "binaryMessenger");
        j c0144b = (c0151i == null || (dVar = c0151i.f3364a) == null) ? new C0144b() : dVar.a();
        Object obj = null;
        C0013n c0013n = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor", c0144b, obj);
        if (c0151i != null) {
            final int i2 = 0;
            c0013n.g(new b() { // from class: v0.I
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
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), new U(c0151i2));
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u2 = (U) obj4;
                            Object obj5 = list.get(1);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0151i3.getClass();
                                u2.f3284c = zBooleanValue;
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            i.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u3 = (U) obj6;
                            Object obj7 = list2.get(1);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0151i4.getClass();
                                u3.f3285d = zBooleanValue2;
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            i.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u4 = (U) obj8;
                            Object obj9 = list3.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                u4.f3286e = zBooleanValue3;
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            i.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u5 = (U) obj10;
                            Object obj11 = list4.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                u5.f3287f = zBooleanValue4;
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        default:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            i.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u6 = (U) obj12;
                            Object obj13 = list5.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                u6.f3288g = zBooleanValue5;
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                    }
                }
            });
        } else {
            c0013n.g(null);
        }
        C0013n c0013n2 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser", c0144b, obj);
        if (c0151i != null) {
            final int i3 = 1;
            c0013n2.g(new b() { // from class: v0.I
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
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), new U(c0151i2));
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u2 = (U) obj4;
                            Object obj5 = list.get(1);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0151i3.getClass();
                                u2.f3284c = zBooleanValue;
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            i.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u3 = (U) obj6;
                            Object obj7 = list2.get(1);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0151i4.getClass();
                                u3.f3285d = zBooleanValue2;
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            i.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u4 = (U) obj8;
                            Object obj9 = list3.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                u4.f3286e = zBooleanValue3;
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            i.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u5 = (U) obj10;
                            Object obj11 = list4.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                u5.f3287f = zBooleanValue4;
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        default:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            i.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u6 = (U) obj12;
                            Object obj13 = list5.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                u6.f3288g = zBooleanValue5;
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                    }
                }
            });
        } else {
            c0013n2.g(null);
        }
        C0013n c0013n3 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage", c0144b, obj);
        if (c0151i != null) {
            final int i4 = 2;
            c0013n3.g(new b() { // from class: v0.I
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
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), new U(c0151i2));
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u2 = (U) obj4;
                            Object obj5 = list.get(1);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0151i3.getClass();
                                u2.f3284c = zBooleanValue;
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            i.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u3 = (U) obj6;
                            Object obj7 = list2.get(1);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0151i4.getClass();
                                u3.f3285d = zBooleanValue2;
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            i.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u4 = (U) obj8;
                            Object obj9 = list3.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                u4.f3286e = zBooleanValue3;
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            i.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u5 = (U) obj10;
                            Object obj11 = list4.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                u5.f3287f = zBooleanValue4;
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        default:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            i.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u6 = (U) obj12;
                            Object obj13 = list5.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                u6.f3288g = zBooleanValue5;
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                    }
                }
            });
        } else {
            c0013n3.g(null);
        }
        C0013n c0013n4 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert", c0144b, obj);
        if (c0151i != null) {
            final int i5 = 3;
            c0013n4.g(new b() { // from class: v0.I
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
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), new U(c0151i2));
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u2 = (U) obj4;
                            Object obj5 = list.get(1);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0151i3.getClass();
                                u2.f3284c = zBooleanValue;
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            i.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u3 = (U) obj6;
                            Object obj7 = list2.get(1);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0151i4.getClass();
                                u3.f3285d = zBooleanValue2;
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            i.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u4 = (U) obj8;
                            Object obj9 = list3.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                u4.f3286e = zBooleanValue3;
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            i.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u5 = (U) obj10;
                            Object obj11 = list4.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                u5.f3287f = zBooleanValue4;
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        default:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            i.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u6 = (U) obj12;
                            Object obj13 = list5.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                u6.f3288g = zBooleanValue5;
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                    }
                }
            });
        } else {
            c0013n4.g(null);
        }
        C0013n c0013n5 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm", c0144b, obj);
        if (c0151i != null) {
            final int i6 = 4;
            c0013n5.g(new b() { // from class: v0.I
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
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), new U(c0151i2));
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u2 = (U) obj4;
                            Object obj5 = list.get(1);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0151i3.getClass();
                                u2.f3284c = zBooleanValue;
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            i.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u3 = (U) obj6;
                            Object obj7 = list2.get(1);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0151i4.getClass();
                                u3.f3285d = zBooleanValue2;
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            i.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u4 = (U) obj8;
                            Object obj9 = list3.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                u4.f3286e = zBooleanValue3;
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            i.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u5 = (U) obj10;
                            Object obj11 = list4.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                u5.f3287f = zBooleanValue4;
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        default:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            i.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u6 = (U) obj12;
                            Object obj13 = list5.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                u6.f3288g = zBooleanValue5;
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                    }
                }
            });
        } else {
            c0013n5.g(null);
        }
        C0013n c0013n6 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt", c0144b, obj);
        if (c0151i == null) {
            c0013n6.g(null);
        } else {
            final int i7 = 5;
            c0013n6.g(new b() { // from class: v0.I
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
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), new U(c0151i2));
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u2 = (U) obj4;
                            Object obj5 = list.get(1);
                            i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0151i3.getClass();
                                u2.f3284c = zBooleanValue;
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            i.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u3 = (U) obj6;
                            Object obj7 = list2.get(1);
                            i.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0151i4.getClass();
                                u3.f3285d = zBooleanValue2;
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            i.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u4 = (U) obj8;
                            Object obj9 = list3.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0151i5.getClass();
                                u4.f3286e = zBooleanValue3;
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            i.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u5 = (U) obj10;
                            Object obj11 = list4.get(1);
                            i.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0151i6.getClass();
                                u5.f3287f = zBooleanValue4;
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        default:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            i.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            U u6 = (U) obj12;
                            Object obj13 = list5.get(1);
                            i.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0151i7.getClass();
                                u6.f3288g = zBooleanValue5;
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                    }
                }
            });
        }
    }

    public static void K(f fVar, final C0151i c0151i) {
        d dVar;
        i.e(fVar, "binaryMessenger");
        j c0144b = (c0151i == null || (dVar = c0151i.f3364a) == null) ? new C0144b() : dVar.a();
        Object obj = null;
        C0013n c0013n = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_defaultConstructor", c0144b, obj);
        if (c0151i != null) {
            final int i2 = 0;
            c0013n.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i2) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n.g(null);
        }
        C0013n c0013n2 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.settings", c0144b, obj);
        if (c0151i != null) {
            final int i3 = 2;
            c0013n2.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i3) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n2.g(null);
        }
        C0013n c0013n3 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.loadData", c0144b, obj);
        if (c0151i != null) {
            final int i4 = 6;
            c0013n3.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i4) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n3.g(null);
        }
        C0013n c0013n4 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.loadDataWithBaseUrl", c0144b, obj);
        if (c0151i != null) {
            final int i5 = 7;
            c0013n4.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i5) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n4.g(null);
        }
        C0013n c0013n5 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl", c0144b, obj);
        if (c0151i != null) {
            final int i6 = 8;
            c0013n5.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i6) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n5.g(null);
        }
        C0013n c0013n6 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.postUrl", c0144b, obj);
        if (c0151i != null) {
            final int i7 = 9;
            c0013n6.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i7) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n6.g(null);
        }
        C0013n c0013n7 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.getUrl", c0144b, obj);
        if (c0151i != null) {
            final int i8 = 10;
            c0013n7.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i8) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n7.g(null);
        }
        C0013n c0013n8 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoBack", c0144b, obj);
        if (c0151i != null) {
            final int i9 = 12;
            c0013n8.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i9) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n8.g(null);
        }
        C0013n c0013n9 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoForward", c0144b, obj);
        if (c0151i != null) {
            final int i10 = 13;
            c0013n9.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i10) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n9.g(null);
        }
        C0013n c0013n10 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.goBack", c0144b, obj);
        if (c0151i != null) {
            final int i11 = 14;
            c0013n10.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i11) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n10.g(null);
        }
        C0013n c0013n11 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.goForward", c0144b, obj);
        if (c0151i != null) {
            final int i12 = 11;
            c0013n11.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i12) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n11.g(null);
        }
        C0013n c0013n12 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.reload", c0144b, obj);
        if (c0151i != null) {
            final int i13 = 15;
            c0013n12.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i13) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n12.g(null);
        }
        C0013n c0013n13 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.clearCache", c0144b, obj);
        if (c0151i != null) {
            final int i14 = 16;
            c0013n13.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i14) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n13.g(null);
        }
        C0013n c0013n14 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.evaluateJavascript", c0144b, obj);
        if (c0151i != null) {
            final int i15 = 17;
            c0013n14.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i15) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n14.g(null);
        }
        C0013n c0013n15 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.getTitle", c0144b, obj);
        if (c0151i != null) {
            final int i16 = 18;
            c0013n15.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i16) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n15.g(null);
        }
        C0013n c0013n16 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebContentsDebuggingEnabled", c0144b, obj);
        if (c0151i != null) {
            final int i17 = 19;
            c0013n16.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i17) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n16.g(null);
        }
        C0013n c0013n17 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebViewClient", c0144b, obj);
        if (c0151i != null) {
            final int i18 = 20;
            c0013n17.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i18) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n17.g(null);
        }
        C0013n c0013n18 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.addJavaScriptChannel", c0144b, obj);
        if (c0151i != null) {
            final int i19 = 21;
            c0013n18.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i19) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n18.g(null);
        }
        C0013n c0013n19 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.removeJavaScriptChannel", c0144b, obj);
        if (c0151i != null) {
            final int i20 = 22;
            c0013n19.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i20) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n19.g(null);
        }
        C0013n c0013n20 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setDownloadListener", c0144b, obj);
        if (c0151i != null) {
            final int i21 = 1;
            c0013n20.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i21) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n20.g(null);
        }
        C0013n c0013n21 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebChromeClient", c0144b, obj);
        if (c0151i != null) {
            final int i22 = 3;
            c0013n21.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i22) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n21.g(null);
        }
        C0013n c0013n22 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setBackgroundColor", c0144b, obj);
        if (c0151i != null) {
            final int i23 = 4;
            c0013n22.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i23) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        } else {
            c0013n22.g(null);
        }
        C0013n c0013n23 = new C0013n(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.destroy", c0144b, obj);
        if (c0151i == null) {
            c0013n23.g(null);
        } else {
            final int i24 = 5;
            c0013n23.g(new b() { // from class: v0.K
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
                    List listN18;
                    List listN19;
                    List listN20;
                    List listN21;
                    List listN22;
                    switch (i24) {
                        case 0:
                            C0151i c0151i2 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i2.f3364a.f3209c).a(((Long) obj3).longValue(), c0151i2.n());
                                listN = a.t(null);
                            } catch (Throwable th) {
                                listN = a.N(th);
                            }
                            q2.b(listN);
                            break;
                        case 1:
                            C0151i c0151i3 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            i.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0151i3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listN2 = a.t(null);
                            } catch (Throwable th2) {
                                listN2 = a.N(th2);
                            }
                            q2.b(listN2);
                            break;
                        case 2:
                            C0151i c0151i4 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            i.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            i.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0145c) c0151i4.f3364a.f3209c).a(((Long) obj6).longValue(), webView2.getSettings());
                                listN3 = a.t(null);
                            } catch (Throwable th3) {
                                listN3 = a.N(th3);
                            }
                            q2.b(listN3);
                            break;
                        case 3:
                            C0151i c0151i5 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            i.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            U u2 = (U) list3.get(1);
                            try {
                                c0151i5.getClass();
                                webView3.setWebChromeClient(u2);
                                listN4 = a.t(null);
                            } catch (Throwable th4) {
                                listN4 = a.N(th4);
                            }
                            q2.b(listN4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0151i c0151i6 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            i.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c0151i6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listN5 = a.t(null);
                            } catch (Throwable th5) {
                                listN5 = a.N(th5);
                            }
                            q2.b(listN5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0151i c0151i7 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            i.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0151i7.getClass();
                                webView5.destroy();
                                listN6 = a.t(null);
                            } catch (Throwable th6) {
                                listN6 = a.N(th6);
                            }
                            q2.b(listN6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0151i c0151i8 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            i.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0151i8.getClass();
                                webView6.loadData(str, str2, str3);
                                listN7 = a.t(null);
                            } catch (Throwable th7) {
                                listN7 = a.N(th7);
                            }
                            q2.b(listN7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0151i c0151i9 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            i.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0151i9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listN8 = a.t(null);
                            } catch (Throwable th8) {
                                listN8 = a.N(th8);
                            }
                            q2.b(listN8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            C0151i c0151i10 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            i.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            i.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0151i10.getClass();
                                webView8.loadUrl(str9, map);
                                listN9 = a.t(null);
                            } catch (Throwable th9) {
                                listN9 = a.N(th9);
                            }
                            q2.b(listN9);
                            break;
                        case 9:
                            C0151i c0151i11 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            i.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            i.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0151i11.getClass();
                                webView9.postUrl(str10, bArr);
                                listN10 = a.t(null);
                            } catch (Throwable th10) {
                                listN10 = a.N(th10);
                            }
                            q2.b(listN10);
                            break;
                        case 10:
                            C0151i c0151i12 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            i.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0151i12.getClass();
                                listN11 = a.t(webView10.getUrl());
                            } catch (Throwable th11) {
                                listN11 = a.N(th11);
                            }
                            q2.b(listN11);
                            break;
                        case 11:
                            C0151i c0151i13 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            i.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0151i13.getClass();
                                webView11.goForward();
                                listN12 = a.t(null);
                            } catch (Throwable th12) {
                                listN12 = a.N(th12);
                            }
                            q2.b(listN12);
                            break;
                        case 12:
                            C0151i c0151i14 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            i.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0151i14.getClass();
                                listN13 = a.t(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listN13 = a.N(th13);
                            }
                            q2.b(listN13);
                            break;
                        case 13:
                            C0151i c0151i15 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            i.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0151i15.getClass();
                                listN14 = a.t(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listN14 = a.N(th14);
                            }
                            q2.b(listN14);
                            break;
                        case 14:
                            C0151i c0151i16 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            i.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0151i16.getClass();
                                webView14.goBack();
                                listN15 = a.t(null);
                            } catch (Throwable th15) {
                                listN15 = a.N(th15);
                            }
                            q2.b(listN15);
                            break;
                        case 15:
                            C0151i c0151i17 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            i.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0151i17.getClass();
                                webView15.reload();
                                listN16 = a.t(null);
                            } catch (Throwable th16) {
                                listN16 = a.N(th16);
                            }
                            q2.b(listN16);
                            break;
                        case 16:
                            C0151i c0151i18 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            i.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            i.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0151i18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listN17 = a.t(null);
                            } catch (Throwable th17) {
                                listN17 = a.N(th17);
                            }
                            q2.b(listN17);
                            break;
                        case 17:
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            i.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            i.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            A a2 = new A(q2, 1);
                            c0151i.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0154l(a2, 1));
                            break;
                        case 18:
                            C0151i c0151i19 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            i.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0151i19.getClass();
                                listN18 = a.t(webView17.getTitle());
                            } catch (Throwable th18) {
                                listN18 = a.N(th18);
                            }
                            q2.b(listN18);
                            break;
                        case 19:
                            C0151i c0151i20 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            i.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0151i20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listN19 = a.t(null);
                            } catch (Throwable th19) {
                                listN19 = a.N(th19);
                            }
                            q2.b(listN19);
                            break;
                        case 20:
                            C0151i c0151i21 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            i.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0151i21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listN20 = a.t(null);
                            } catch (Throwable th20) {
                                listN20 = a.N(th20);
                            }
                            q2.b(listN20);
                            break;
                        case 21:
                            C0151i c0151i22 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            i.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            i.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0161t c0161t = (C0161t) obj35;
                            try {
                                c0151i22.getClass();
                                webView19.addJavascriptInterface(c0161t, c0161t.f3395a);
                                listN21 = a.t(null);
                            } catch (Throwable th21) {
                                listN21 = a.N(th21);
                            }
                            q2.b(listN21);
                            break;
                        default:
                            C0151i c0151i23 = c0151i;
                            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            i.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            i.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0151i23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listN22 = a.t(null);
                            } catch (Throwable th22) {
                                listN22 = a.N(th22);
                            }
                            q2.b(listN22);
                            break;
                    }
                }
            });
        }
    }

    public static final Object M(u uVar, u uVar2, p pVar) throws Throwable {
        Object c0056n;
        Object objL;
        try {
            s.a(2, pVar);
            c0056n = pVar.h(uVar2, uVar);
        } catch (Throwable th) {
            c0056n = new C0056n(th, false);
        }
        A0.a aVar = A0.a.f0e;
        if (c0056n == aVar || (objL = uVar.L(c0056n)) == AbstractC0063v.f747d) {
            return aVar;
        }
        if (objL instanceof C0056n) {
            throw ((C0056n) objL).f732a;
        }
        return AbstractC0063v.l(objL);
    }

    public static final void O(Object obj) {
        if (obj instanceof c) {
            throw ((c) obj).f3413e;
        }
    }

    public static boolean P(View view, w0.b bVar) {
        if (view == null) {
            return false;
        }
        if (bVar.a(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                if (P(viewGroup.getChildAt(i2), bVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ArrayList Q(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static ArrayList R(DisplayManager displayManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new ArrayList();
        }
        try {
            Field declaredField = DisplayManager.class.getDeclaredField("mGlobal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(displayManager);
            Field declaredField2 = obj.getClass().getDeclaredField("mDisplayListeners");
            declaredField2.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField2.get(obj);
            ArrayList arrayList2 = new ArrayList();
            Field field = null;
            for (Object obj2 : arrayList) {
                if (field == null) {
                    field = obj2.getClass().getField("mListener");
                    field.setAccessible(true);
                }
                arrayList2.add((DisplayManager.DisplayListener) field.get(obj2));
            }
            return arrayList2;
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e);
            return new ArrayList();
        } catch (NoSuchFieldException e3) {
            e = e3;
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e);
            return new ArrayList();
        }
    }

    public static void a(Context context, p013h0.c cVar) {
        Rect rect;
        H f2;
        O oB;
        Activity activityT = t(context);
        if (activityT != null) {
            int i2 = m.f1100a;
            Y.n.f1101a.getClass();
            int i3 = o.f1102b;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                rect = ((WindowManager) activityT.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
                i.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = activityT.getSystemService("window");
                i.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                i.d(defaultDisplay, "display");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i4 < 30) {
                if (i4 >= 30) {
                    f2 = new G();
                } else {
                    f2 = i4 >= 29 ? new F() : new E();
                }
                oB = f2.b();
                i.d(oB, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i4 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                oB = p005c0.b.f1758a.a(activityT);
            }
            int i5 = rect.left;
            int i6 = rect.top;
            int i7 = rect.right;
            int i8 = rect.bottom;
            if (i5 > i7) {
                throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i5 + ", right: " + i7).toString());
            }
            if (i6 <= i8) {
                i.e(oB, "_windowInsetsCompat");
                cVar.f1978a.updateDisplayMetrics(0, new Rect(i5, i6, i7, i8).width(), new Rect(i5, i6, i7, i8).height(), context.getResources().getDisplayMetrics().density);
            } else {
                throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i6 + ", bottom: " + i8).toString());
            }
        }
    }

    public static boolean b(p031r.d[] dVarArr, p031r.d[] dVarArr2) {
        if (dVarArr == null || dVarArr2 == null || dVarArr.length != dVarArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            p031r.d dVar = dVarArr[i2];
            char c2 = dVar.f3040a;
            p031r.d dVar2 = dVarArr2[i2];
            if (c2 != dVar2.f3040a || dVar.f3041b.length != dVar2.f3041b.length) {
                return false;
            }
        }
        return true;
    }

    public static final void g(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                a1.a.c(th, th2);
            }
        }
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float[] i(float[] fArr, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i2, length);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static boolean j(File file, Resources resources, int i2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i2);
            try {
                boolean zK = k(file, inputStreamOpenRawResource);
                h(inputStreamOpenRawResource);
                return zK;
            } catch (Throwable th) {
                th = th;
                h(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean k(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = inputStream.read(bArr);
                        if (i2 == -1) {
                            h(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i2);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    h(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    h(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final c l(Throwable th) {
        i.e(th, "exception");
        return new c(th);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3 A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e4 A[SYNTHETIC] */
    public static p031r.d[] m(String str) {
        int i2;
        String strTrim;
        float[] fArrI;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i5, i4).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i3) != 'z' || strTrim.charAt(i3) == 'Z') {
                                fArrI = new float[i3];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i6 = 1;
                                    int i7 = 0;
                                    while (i6 < length) {
                                        boolean z2 = false;
                                        boolean z3 = false;
                                        boolean z4 = false;
                                        boolean z5 = false;
                                        for (int i8 = i6; i8 < strTrim.length(); i8++) {
                                            char cCharAt2 = strTrim.charAt(i8);
                                            if (cCharAt2 == ' ') {
                                                z2 = false;
                                                z4 = true;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        z2 = false;
                                                        z4 = true;
                                                        break;
                                                    case '-':
                                                        if (i8 == i6 || z2) {
                                                            z2 = false;
                                                        } else {
                                                            z2 = false;
                                                            z4 = true;
                                                            z5 = true;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (z3) {
                                                            z2 = false;
                                                            z4 = true;
                                                            z5 = true;
                                                        } else {
                                                            z2 = false;
                                                            z3 = true;
                                                        }
                                                        break;
                                                    default:
                                                        z2 = false;
                                                        break;
                                                }
                                            } else {
                                                z2 = true;
                                            }
                                            if (z4) {
                                                if (i6 < i8) {
                                                    fArr[i7] = Float.parseFloat(strTrim.substring(i6, i8));
                                                    i7++;
                                                }
                                                if (z5) {
                                                    i6 = i8;
                                                } else {
                                                    i6 = i8 + 1;
                                                }
                                            }
                                        }
                                        if (i6 < i8) {
                                            fArr[i7] = Float.parseFloat(strTrim.substring(i6, i8));
                                            i7++;
                                        }
                                        if (z5) {
                                            i6 = i8;
                                        } else {
                                            i6 = i8 + 1;
                                        }
                                    }
                                    fArrI = i(fArr, i7);
                                    i3 = 0;
                                } catch (NumberFormatException e2) {
                                    throw new RuntimeException("error in parsing \"" + strTrim + "\"", e2);
                                }
                            }
                            arrayList.add(new p031r.d(strTrim.charAt(i3), fArrI));
                        }
                        i5 = i4;
                        i4++;
                        i3 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i4++;
            }
            strTrim = str.substring(i5, i4).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i3) != 'z') {
                    fArrI = new float[i3];
                } else {
                    fArrI = new float[i3];
                }
                arrayList.add(new p031r.d(strTrim.charAt(i3), fArrI));
            }
            i5 = i4;
            i4++;
            i3 = 0;
        }
        if (i4 - i5 != 1 || i5 >= str.length()) {
            i2 = 0;
        } else {
            i2 = 0;
            arrayList.add(new p031r.d(str.charAt(i5), new float[0]));
        }
        return (p031r.d[]) arrayList.toArray(new p031r.d[i2]);
    }

    public static p031r.d[] o(p031r.d[] dVarArr) {
        p031r.d[] dVarArr2 = new p031r.d[dVarArr.length];
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            dVarArr2[i2] = new p031r.d(dVarArr[i2]);
        }
        return dVarArr2;
    }

    public static String q(C0075g c0075g) {
        StringBuilder sb = new StringBuilder(c0075g.size());
        for (int i2 = 0; i2 < c0075g.size(); i2++) {
            byte bA = c0075g.a(i2);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case k.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case k.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static InvocationHandler r() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static g s(g gVar, h hVar) {
        i.e(hVar, "key");
        if (i.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static Activity t(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return t(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static ColorStateList u(Context context, int i2) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        l lVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        p029q.m mVar = new p029q.m(resources, theme);
        synchronized (p029q.n.f3009c) {
            try {
                SparseArray sparseArray = (SparseArray) p029q.n.f3008b.get(mVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (lVar = (l) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (lVar.f3003b.equals(resources.getConfiguration())) {
                        if (theme != null || lVar.f3004c != 0) {
                            if (theme == null || lVar.f3004c != theme.hashCode()) {
                            }
                        }
                        colorStateList = lVar.f3002a;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = p029q.n.f3007a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListA = p029q.c.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListA == null) {
            return Build.VERSION.SDK_INT >= 23 ? p029q.k.b(resources, i2, theme) : resources.getColorStateList(i2);
        }
        p029q.n.a(mVar, i2, colorStateListA, theme);
        return colorStateListA;
    }

    public static final Class v(N0.b bVar) {
        i.e(bVar, "<this>");
        Class clsA = ((I0.d) bVar).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? clsA : Double.class;
            case 104431:
                return !name.equals("int") ? clsA : Integer.class;
            case 3039496:
                return !name.equals("byte") ? clsA : Byte.class;
            case 3052374:
                return !name.equals("char") ? clsA : Character.class;
            case 3327612:
                return !name.equals("long") ? clsA : Long.class;
            case 3625364:
                return !name.equals("void") ? clsA : Void.class;
            case 64711720:
                return !name.equals("boolean") ? clsA : Boolean.class;
            case 97526364:
                return !name.equals("float") ? clsA : Float.class;
            case 109413500:
                return !name.equals("short") ? clsA : Short.class;
            default:
                return clsA;
        }
    }

    public static File w(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static z0.d x(z0.d dVar) {
        i.e(dVar, "<this>");
        B0.b bVar = dVar instanceof B0.b ? (B0.b) dVar : null;
        if (bVar == null) {
            return dVar;
        }
        z0.d dVar2 = bVar.f5g;
        if (dVar2 != null) {
            return dVar2;
        }
        z0.f fVar = (z0.f) bVar.i().f(z0.e.f3503e);
        z0.d hVar = fVar != null ? new V0.h((AbstractC0060s) fVar, bVar) : bVar;
        bVar.f5g = hVar;
        return hVar;
    }

    public static int y(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static z0.i z(g gVar, h hVar) {
        i.e(hVar, "key");
        return i.a(gVar.getKey(), hVar) ? z0.j.f3504e : gVar;
    }

    public abstract void B(p024n.f fVar, p024n.f fVar2);

    public abstract void C(p024n.f fVar, Thread thread);

    public abstract void L();

    public abstract void N();

    public boolean c() {
        return false;
    }

    public abstract boolean d(p024n.g gVar, p024n.c cVar);

    public abstract boolean e(p024n.g gVar, Object obj, Object obj2);

    public abstract boolean f(p024n.g gVar, p024n.f fVar, p024n.f fVar2);

    public abstract String n(byte[] bArr, int i2, int i3);

    public abstract int p(String str, byte[] bArr, int i2, int i3);

    public void D() {
    }
}
