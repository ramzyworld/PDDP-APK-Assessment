package p013h0;

import N.C0026b;
import N.Q;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.l;
import io.flutter.plugin.platform.o;
import java.util.HashSet;
import p011g0.AbstractActivityC0098e;
import p015i0.b;
import p015i0.j;
import p028p0.a;
import p028p0.d;
import p028p0.n;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f1978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f1979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f1980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f1981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p032r0.b f1982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0026b f1983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f1984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p028p0.b f1985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f1986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f1987j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p028p0.l f1988k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Q f1989l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p028p0.b f1990m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n f1991n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p028p0.b f1992o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p028p0.c f1993p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Q f1994q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f1995r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashSet f1996s = new HashSet();
    public final a t = new a(this);

    public c(AbstractActivityC0098e abstractActivityC0098e, FlutterJNI flutterJNI, o oVar, boolean z2, boolean z3) {
        AssetManager assets;
        try {
            assets = abstractActivityC0098e.createPackageContext(abstractActivityC0098e.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = abstractActivityC0098e.getAssets();
        }
        C0026b c0026bE = C0026b.E();
        if (flutterJNI == null) {
            Object obj = c0026bE.f476f;
            flutterJNI = new FlutterJNI();
        }
        this.f1978a = flutterJNI;
        b bVar = new b(flutterJNI, assets);
        this.f1980c = bVar;
        flutterJNI.setPlatformMessageHandler((j) bVar.f2161h);
        C0026b.E().getClass();
        this.f1983f = new C0026b(bVar, flutterJNI);
        new H.a(bVar);
        this.f1984g = new d(bVar);
        Q q2 = new Q(bVar, 13);
        this.f1985h = new p028p0.b(bVar, 4);
        this.f1986i = new a(bVar, 1);
        this.f1987j = new a(bVar, 0);
        this.f1989l = new Q(bVar, 14);
        Q q3 = new Q(bVar, abstractActivityC0098e.getPackageManager());
        this.f1988k = new p028p0.l(bVar, z3);
        this.f1990m = new p028p0.b(bVar, 10);
        this.f1991n = new n(bVar);
        this.f1992o = new p028p0.b(bVar, 12);
        this.f1993p = new p028p0.c(bVar);
        this.f1994q = new Q(bVar, 18);
        p032r0.b bVar2 = new p032r0.b(abstractActivityC0098e, q2);
        this.f1982e = bVar2;
        p019k0.d dVar = (p019k0.d) c0026bE.f477g;
        if (!flutterJNI.isAttached()) {
            dVar.b(abstractActivityC0098e.getApplicationContext());
            dVar.a(abstractActivityC0098e, null);
        }
        flutterJNI.addEngineLifecycleListener(this.t);
        flutterJNI.setPlatformViewsController(oVar);
        flutterJNI.setLocalizationPlugin(bVar2);
        c0026bE.getClass();
        flutterJNI.setDeferredComponentManager(null);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f1979b = new l(flutterJNI);
        this.f1995r = oVar;
        e eVar = new e(abstractActivityC0098e.getApplicationContext(), this, dVar);
        this.f1981d = eVar;
        bVar2.b(abstractActivityC0098e.getResources().getConfiguration());
        if (z2 && dVar.f2803d.f2158e) {
            a1.a.v(this);
        }
        p000a.a.a(abstractActivityC0098e, this);
        eVar.a(new p035t0.a(q3));
    }
}
