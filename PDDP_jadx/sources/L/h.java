package L;

import G.C0013n;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import p016j.C0121s;
import p039v0.C0151i;
import p039v0.C0156n;
import p039v0.C0161t;
import p039v0.C0165x;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f398g;

    public /* synthetic */ h(int i2, Object obj, Object obj2) {
        this.f396e = i2;
        this.f397f = obj;
        this.f398g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f398g;
        Object obj2 = this.f397f;
        switch (this.f396e) {
            case 0:
                ((ProfileInstallerInitializer) obj2).getClass();
                (Build.VERSION.SDK_INT >= 28 ? m.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new i((Context) obj, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 1:
                ((C0121s) obj2).b((Typeface) obj);
                break;
            default:
                C0156n c0156n = new C0156n(0);
                C0161t c0161t = (C0161t) obj2;
                C0151i c0151i = c0161t.f3396b;
                String str = (String) obj;
                I0.i.e(str, "messageArg");
                p038v.d dVar = c0151i.f3364a;
                dVar.getClass();
                new C0013n((p030q0.f) dVar.f3208b, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage", dVar.a(), (Object) null).f(p043y0.e.P(c0161t, str), new C0165x(15, c0156n));
                break;
        }
    }
}
