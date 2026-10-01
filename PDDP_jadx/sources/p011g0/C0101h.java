package p011g0;

import N.C0026b;
import N.Q;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p013h0.b;
import p013h0.c;
import p013h0.e;
import p013h0.g;
import p013h0.i;
import p015i0.a;
import p019k0.d;

/* JADX INFO: renamed from: g0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0101h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractActivityC0098e f1862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f1863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f1864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f1865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0100g f1866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1868g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f1871j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0099f f1872k = new C0099f(0, this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1869h = false;

    public C0101h(AbstractActivityC0098e abstractActivityC0098e) {
        this.f1862a = abstractActivityC0098e;
    }

    public final void a(g gVar) {
        String strB = this.f1862a.b();
        if (strB == null || strB.isEmpty()) {
            strB = (String) ((d) C0026b.E().f477g).f2803d.f2160g;
        }
        a aVar = new a(strB, this.f1862a.e());
        String strF = this.f1862a.f();
        if (strF == null) {
            AbstractActivityC0098e abstractActivityC0098e = this.f1862a;
            abstractActivityC0098e.getClass();
            strF = d(abstractActivityC0098e.getIntent());
            if (strF == null) {
                strF = "/";
            }
        }
        gVar.f2013b = aVar;
        gVar.f2014c = strF;
        gVar.f2015d = (List) this.f1862a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f1862a.i()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f1862a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC0098e abstractActivityC0098e = this.f1862a;
        abstractActivityC0098e.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0098e + " connection to the engine " + abstractActivityC0098e.f1855f.f1863b + " evicted by another attaching activity");
        C0101h c0101h = abstractActivityC0098e.f1855f;
        if (c0101h != null) {
            c0101h.e();
            abstractActivityC0098e.f1855f.f();
        }
    }

    public final void c() {
        if (this.f1862a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z2;
        Uri data;
        AbstractActivityC0098e abstractActivityC0098e = this.f1862a;
        abstractActivityC0098e.getClass();
        try {
            Bundle bundleG = abstractActivityC0098e.g();
            z2 = (bundleG == null || !bundleG.containsKey("flutter_deeplinking_enabled")) ? true : bundleG.getBoolean("flutter_deeplinking_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            z2 = false;
        }
        if (!z2 || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void e() {
        c();
        if (this.f1866e != null) {
            this.f1864c.getViewTreeObserver().removeOnPreDrawListener(this.f1866e);
            this.f1866e = null;
        }
        q qVar = this.f1864c;
        if (qVar != null) {
            qVar.a();
            q qVar2 = this.f1864c;
            qVar2.f1899j.remove(this.f1872k);
        }
    }

    public final void f() {
        if (this.f1870i) {
            c();
            this.f1862a.getClass();
            this.f1862a.getClass();
            AbstractActivityC0098e abstractActivityC0098e = this.f1862a;
            abstractActivityC0098e.getClass();
            if (abstractActivityC0098e.isChangingConfigurations()) {
                e eVar = this.f1863b.f1981d;
                if (eVar.e()) {
                    w0.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        eVar.f2009g = true;
                        Iterator it = eVar.f2006d.values().iterator();
                        while (it.hasNext()) {
                            ((p025n0.a) it.next()).e();
                        }
                        o oVar = eVar.f2004b.f1995r;
                        Q q2 = oVar.f2348g;
                        if (q2 != null) {
                            q2.f472g = null;
                        }
                        oVar.c();
                        oVar.f2348g = null;
                        oVar.f2344c = null;
                        oVar.f2346e = null;
                        eVar.f2007e = null;
                        eVar.f2008f = null;
                        Trace.endSection();
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f1863b.f1981d.c();
            }
            f fVar = this.f1865d;
            if (fVar != null) {
                fVar.f2317b.f472g = null;
                this.f1865d = null;
            }
            this.f1862a.getClass();
            c cVar = this.f1863b;
            if (cVar != null) {
                p028p0.d dVar = cVar.f1984g;
                dVar.a(1, dVar.f2900c);
            }
            if (this.f1862a.i()) {
                c cVar2 = this.f1863b;
                Iterator it2 = cVar2.f1996s.iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).b();
                }
                e eVar2 = cVar2.f1981d;
                eVar2.d();
                HashMap map = eVar2.f2003a;
                for (Class cls : new HashSet(map.keySet())) {
                    p023m0.a aVar = (p023m0.a) map.get(cls);
                    if (aVar != null) {
                        w0.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (aVar instanceof p025n0.a) {
                                if (eVar2.e()) {
                                    ((p025n0.a) aVar).d();
                                }
                                eVar2.f2006d.remove(cls);
                            }
                            aVar.a(eVar2.f2005c);
                            map.remove(cls);
                            Trace.endSection();
                        } catch (Throwable th3) {
                            try {
                                Trace.endSection();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                }
                map.clear();
                while (true) {
                    o oVar2 = cVar2.f1995r;
                    SparseArray sparseArray = oVar2.f2352k;
                    if (sparseArray.size() <= 0) {
                        break;
                    }
                    oVar2.f2362v.e(sparseArray.keyAt(0));
                }
                ((FlutterJNI) cVar2.f1980c.f2159f).setPlatformMessageHandler(null);
                FlutterJNI flutterJNI = cVar2.f1978a;
                flutterJNI.removeEngineLifecycleListener(cVar2.t);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                C0026b.E().getClass();
                if (this.f1862a.d() != null) {
                    if (i.f2020c == null) {
                        i.f2020c = new i(1);
                    }
                    i iVar = i.f2020c;
                    iVar.f2021a.remove(this.f1862a.d());
                }
                this.f1863b = null;
            }
            this.f1870i = false;
        }
    }
}
