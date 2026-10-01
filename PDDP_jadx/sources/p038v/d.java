package p038v;

import I0.i;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import java.util.List;
import p028p0.b;
import p030q0.f;
import p030q0.j;
import p039v0.C0145c;
import p039v0.C0148f;
import p039v0.C0149g;
import p039v0.C0159q;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3207a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3212f;

    public d(f fVar, Context context, C0159q c0159q) {
        i.e(fVar, "binaryMessenger");
        this.f3208b = fVar;
        this.f3209c = new C0145c(new b(18, new C0148f(fVar)));
        this.f3211e = context;
        this.f3212f = c0159q;
    }

    public static void b(Throwable th) {
        Log.e("WebChromeClientImpl", th.getClass().getSimpleName() + ", Message: " + th.getMessage() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public j a() {
        if (((C0149g) this.f3210d) == null) {
            this.f3210d = new C0149g(this);
        }
        C0149g c0149g = (C0149g) this.f3210d;
        i.b(c0149g);
        return c0149g;
    }

    public void c(Runnable runnable) {
        Context context = (Context) this.f3211e;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public String toString() {
        switch (this.f3207a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f3208b) + ", mProviderPackage: " + ((String) this.f3209c) + ", mQuery: " + ((String) this.f3210d) + ", mCertificates:");
                int i2 = 0;
                while (true) {
                    List list = (List) this.f3212f;
                    if (i2 >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i2);
                    for (int i3 = 0; i3 < list2.size(); i3++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i3), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i2++;
                }
                break;
            default:
                return super.toString();
        }
    }

    public d(String str, String str2, String str3, List list) {
        this.f3208b = str;
        this.f3209c = str2;
        this.f3210d = str3;
        list.getClass();
        this.f3212f = list;
        this.f3211e = str + "-" + str2 + "-" + str3;
    }
}
