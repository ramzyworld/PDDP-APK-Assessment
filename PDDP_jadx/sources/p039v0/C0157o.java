package p039v0;

import G.C0013n;
import I0.i;
import android.webkit.DownloadListener;
import p030q0.f;
import p038v.d;
import p043y0.e;

/* JADX INFO: renamed from: v0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0157o implements DownloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0151i f3383a;

    public C0157o(C0151i c0151i) {
        this.f3383a = c0151i;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(final String str, final String str2, final String str3, final String str4, final long j2) {
        C0151i c0151i = this.f3383a;
        c0151i.f3364a.c(new Runnable() { // from class: v0.m
            @Override // java.lang.Runnable
            public final void run() {
                C0156n c0156n = new C0156n(0);
                C0157o c0157o = this.f3376e;
                C0151i c0151i2 = c0157o.f3383a;
                String str5 = str;
                i.e(str5, "urlArg");
                String str6 = str2;
                i.e(str6, "userAgentArg");
                String str7 = str3;
                i.e(str7, "contentDispositionArg");
                String str8 = str4;
                i.e(str8, "mimetypeArg");
                d dVar = c0151i2.f3364a;
                dVar.getClass();
                new C0013n((f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart", dVar.a(), (Object) null).f(e.P(c0157o, str5, str6, str7, str8, Long.valueOf(j2)), new C0165x(9, c0156n));
            }
        });
    }
}
