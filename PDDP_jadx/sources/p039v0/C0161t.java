package p039v0;

import L.h;
import android.webkit.JavascriptInterface;

/* JADX INFO: renamed from: v0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0161t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0151i f3396b;

    public C0161t(String str, C0151i c0151i) {
        this.f3395a = str;
        this.f3396b = c0151i;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        C0151i c0151i = this.f3396b;
        c0151i.f3364a.c(new h(2, this, str));
    }
}
