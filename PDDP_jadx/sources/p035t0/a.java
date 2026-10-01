package p035t0;

import G.C0013n;
import N.Q;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import p011g0.AbstractActivityC0098e;
import p013h0.d;
import p028p0.k;

/* JADX INFO: loaded from: classes.dex */
public class a implements p023m0.a, p025n0.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PackageManager f3073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f3074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashMap f3075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f3076h = new HashMap();

    public a(Q q2) {
        this.f3073e = (PackageManager) q2.f471f;
        q2.f472g = this;
    }

    @Override // p025n0.a
    public final void b(d dVar) {
        this.f3074f = dVar;
        ((HashSet) dVar.f1999c).add(this);
    }

    @Override // p025n0.a
    public final void c(d dVar) {
        this.f3074f = dVar;
        ((HashSet) dVar.f1999c).add(this);
    }

    @Override // p025n0.a
    public final void d() {
        ((HashSet) this.f3074f.f1999c).remove(this);
        this.f3074f = null;
    }

    @Override // p025n0.a
    public final void e() {
        ((HashSet) this.f3074f.f1999c).remove(this);
        this.f3074f = null;
    }

    public final void f(String str, String str2, boolean z2, k kVar) {
        if (this.f3074f == null) {
            kVar.a("error", "Plugin not bound to an Activity", null);
            return;
        }
        if (Build.VERSION.SDK_INT < 23) {
            kVar.a("error", "Android version not supported", null);
            return;
        }
        HashMap map = this.f3075g;
        if (map == null) {
            kVar.a("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) map.get(str);
        if (resolveInfo == null) {
            kVar.a("error", "Text processing activity not found", null);
            return;
        }
        int iHashCode = kVar.hashCode();
        this.f3076h.put(Integer.valueOf(iHashCode), kVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z2);
        ((AbstractActivityC0098e) this.f3074f.f1997a).startActivityForResult(intent, iHashCode);
    }

    public final HashMap h() {
        HashMap map = this.f3075g;
        PackageManager packageManager = this.f3073e;
        if (map == null) {
            this.f3075g = new HashMap();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                for (ResolveInfo resolveInfo : i2 >= 33 ? packageManager.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(type, 0)) {
                    String str = resolveInfo.activityInfo.name;
                    resolveInfo.loadLabel(packageManager).toString();
                    this.f3075g.put(str, resolveInfo);
                }
            }
        }
        HashMap map2 = new HashMap();
        for (String str2 : this.f3075g.keySet()) {
            map2.put(str2, ((ResolveInfo) this.f3075g.get(str2)).loadLabel(packageManager).toString());
        }
        return map2;
    }

    @Override // p023m0.a
    public final void a(C0013n c0013n) {
    }

    @Override // p023m0.a
    public final void g(C0013n c0013n) {
    }
}
