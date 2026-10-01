package p011g0;

import N.C0026b;
import N.Q;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.provider.Settings;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.textservice.TextServicesManager;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.j;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.o;
import io.flutter.plugin.platform.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p013h0.c;
import p013h0.e;
import p013h0.g;
import p013h0.h;
import p013h0.i;
import p028p0.d;
import p028p0.k;
import w0.a;

/* JADX INFO: renamed from: g0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0098e extends Activity implements l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f1853i = View.generateViewId();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1854e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0101h f1855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f1856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final OnBackInvokedCallback f1857h;

    public AbstractActivityC0098e() {
        int i2 = Build.VERSION.SDK_INT;
        this.f1857h = i2 < 33 ? null : i2 >= 34 ? new C0097d(this) : new OnBackInvokedCallback() { // from class: g0.c
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                this.f1851a.onBackPressed();
            }
        };
        this.f1856g = new n(this);
    }

    @Override // androidx.lifecycle.l
    public final n a() {
        return this.f1856g;
    }

    public final String b() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public final int c() {
        if (!getIntent().hasExtra("background_mode")) {
            return 1;
        }
        String stringExtra = getIntent().getStringExtra("background_mode");
        if (stringExtra == null) {
            throw new NullPointerException("Name is null");
        }
        if (stringExtra.equals("opaque")) {
            return 1;
        }
        if (stringExtra.equals("transparent")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.".concat(stringExtra));
    }

    public final String d() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String e() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle bundleG = g();
            String string = bundleG != null ? bundleG.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final String f() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle bundleG = g();
            if (bundleG != null) {
                return bundleG.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle g() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void h(boolean z2) {
        if (z2 && !this.f1854e) {
            if (Build.VERSION.SDK_INT >= 33) {
                getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f1857h);
                this.f1854e = true;
                return;
            }
            return;
        }
        if (z2 || !this.f1854e || Build.VERSION.SDK_INT < 33) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f1857h);
        this.f1854e = false;
    }

    public final boolean i() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (d() != null || this.f1855f.f1867f) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean j() {
        if (getIntent().hasExtra("enable_state_restoration")) {
            return getIntent().getBooleanExtra("enable_state_restoration", false);
        }
        return d() == null;
    }

    public final boolean k(String str) {
        C0101h c0101h = this.f1855f;
        if (c0101h == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c0101h.f1870i) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (k("onActivityResult")) {
            C0101h c0101h = this.f1855f;
            c0101h.c();
            if (c0101h.f1863b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            e eVar = c0101h.f1863b.f1981d;
            if (!eVar.e()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            a.b("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                eVar.f2008f.d(i2, i3, intent);
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (k("onBackPressed")) {
            C0101h c0101h = this.f1855f;
            c0101h.c();
            c cVar = c0101h.f1863b;
            if (cVar != null) {
                cVar.f1986i.f2894a.F("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:182:0x0438  */
    /* JADX WARN: Code duplicated, block: B:185:0x0441  */
    /* JADX WARN: Code duplicated, block: B:192:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:195:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:197:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:201:0x0531 A[LOOP:0: B:199:0x0529->B:201:0x0531, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:205:0x0548 A[LOOP:1: B:203:0x0540->B:205:0x0548, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x055e A[LOOP:2: B:206:0x0556->B:208:0x055e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:211:0x0576  */
    /* JADX WARN: Code duplicated, block: B:213:0x057a  */
    /* JADX WARN: Code duplicated, block: B:226:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:246:0x053f A[EDGE_INSN: B:246:0x053f->B:202:0x053f BREAK  A[LOOP:0: B:199:0x0529->B:201:0x0531], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0556 A[EDGE_INSN: B:247:0x0556->B:206:0x0556 BREAK  A[LOOP:1: B:203:0x0540->B:205:0x0548], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x056a A[EDGE_INSN: B:248:0x056a->B:209:0x056a BREAK  A[LOOP:2: B:206:0x0556->B:208:0x055e], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        byte[] byteArray;
        io.flutter.embedding.engine.renderer.l lVar;
        C0099f c0099f;
        boolean zIsEnabled;
        o oVar;
        int i2;
        SparseArray sparseArray;
        int i3;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        Iterator it;
        boolean z2;
        int i4;
        try {
            Bundle bundleG = g();
            if (bundleG != null && (i4 = bundleG.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i4);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            h(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        C0101h c0101h = new C0101h(this);
        this.f1855f = c0101h;
        c0101h.c();
        int i5 = 0;
        if (c0101h.f1863b == null) {
            String strD = c0101h.f1862a.d();
            if (strD != null) {
                if (i.f2020c == null) {
                    i.f2020c = new i(1);
                }
                c cVar = (c) i.f2020c.f2021a.get(strD);
                c0101h.f1863b = cVar;
                c0101h.f1867f = true;
                if (cVar == null) {
                    throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + strD + "'");
                }
            } else {
                c0101h.f1862a.getClass();
                c0101h.f1863b = null;
                String stringExtra = c0101h.f1862a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (i.f2019b == null) {
                        synchronized (i.class) {
                            try {
                                if (i.f2019b == null) {
                                    i.f2019b = new i(0);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    h hVar = (h) i.f2019b.f2021a.get(stringExtra);
                    if (hVar == null) {
                        throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + stringExtra + "'");
                    }
                    AbstractActivityC0098e abstractActivityC0098e = c0101h.f1862a;
                    abstractActivityC0098e.getClass();
                    g gVar = new g(abstractActivityC0098e);
                    c0101h.a(gVar);
                    c0101h.f1863b = hVar.a(gVar);
                    c0101h.f1867f = false;
                } else {
                    AbstractActivityC0098e abstractActivityC0098e2 = c0101h.f1862a;
                    abstractActivityC0098e2.getClass();
                    Intent intent = c0101h.f1862a.getIntent();
                    ArrayList arrayList = new ArrayList();
                    if (intent.getBooleanExtra("trace-startup", false)) {
                        arrayList.add("--trace-startup");
                    }
                    if (intent.getBooleanExtra("start-paused", false)) {
                        arrayList.add("--start-paused");
                    }
                    int intExtra = intent.getIntExtra("vm-service-port", 0);
                    if (intExtra > 0) {
                        arrayList.add("--vm-service-port=" + Integer.toString(intExtra));
                    } else {
                        int intExtra2 = intent.getIntExtra("observatory-port", 0);
                        if (intExtra2 > 0) {
                            arrayList.add("--vm-service-port=" + Integer.toString(intExtra2));
                        }
                    }
                    if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
                        arrayList.add("--disable-service-auth-codes");
                    }
                    if (intent.getBooleanExtra("endless-trace-buffer", false)) {
                        arrayList.add("--endless-trace-buffer");
                    }
                    if (intent.getBooleanExtra("use-test-fonts", false)) {
                        arrayList.add("--use-test-fonts");
                    }
                    if (intent.getBooleanExtra("enable-dart-profiling", false)) {
                        arrayList.add("--enable-dart-profiling");
                    }
                    if (intent.getBooleanExtra("enable-software-rendering", false)) {
                        arrayList.add("--enable-software-rendering");
                    }
                    if (intent.getBooleanExtra("skia-deterministic-rendering", false)) {
                        arrayList.add("--skia-deterministic-rendering");
                    }
                    if (intent.getBooleanExtra("trace-skia", false)) {
                        arrayList.add("--trace-skia");
                    }
                    String stringExtra2 = intent.getStringExtra("trace-skia-allowlist");
                    if (stringExtra2 != null) {
                        arrayList.add("--trace-skia-allowlist=".concat(stringExtra2));
                    }
                    if (intent.getBooleanExtra("trace-systrace", false)) {
                        arrayList.add("--trace-systrace");
                    }
                    if (intent.hasExtra("trace-to-file")) {
                        arrayList.add("--trace-to-file=" + intent.getStringExtra("trace-to-file"));
                    }
                    if (intent.hasExtra("enable-impeller")) {
                        if (intent.getBooleanExtra("enable-impeller", false)) {
                            arrayList.add("--enable-impeller=true");
                        } else {
                            arrayList.add("--enable-impeller=false");
                        }
                    }
                    if (intent.getBooleanExtra("enable-vulkan-validation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (intent.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
                        arrayList.add("--dump-skp-on-shader-compilation");
                    }
                    if (intent.getBooleanExtra("cache-sksl", false)) {
                        arrayList.add("--cache-sksl");
                    }
                    if (intent.getBooleanExtra("purge-persistent-cache", false)) {
                        arrayList.add("--purge-persistent-cache");
                    }
                    if (intent.getBooleanExtra("verbose-logging", false)) {
                        arrayList.add("--verbose-logging");
                    }
                    if (intent.hasExtra("dart-flags")) {
                        arrayList.add("--dart-flags=" + intent.getStringExtra("dart-flags"));
                    }
                    HashSet hashSet = new HashSet(arrayList);
                    h hVar2 = new h(abstractActivityC0098e2, (String[]) hashSet.toArray(new String[hashSet.size()]));
                    AbstractActivityC0098e abstractActivityC0098e3 = c0101h.f1862a;
                    abstractActivityC0098e3.getClass();
                    g gVar2 = new g(abstractActivityC0098e3);
                    gVar2.f2016e = false;
                    gVar2.f2017f = c0101h.f1862a.j();
                    c0101h.a(gVar2);
                    c0101h.f1863b = hVar2.a(gVar2);
                    c0101h.f1867f = false;
                }
            }
        }
        c0101h.f1862a.getClass();
        e eVar = c0101h.f1863b.f1981d;
        n nVar = c0101h.f1862a.f1856g;
        eVar.getClass();
        a.b("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            C0101h c0101h2 = eVar.f2007e;
            if (c0101h2 != null) {
                c0101h2.b();
            }
            eVar.d();
            eVar.f2007e = c0101h;
            AbstractActivityC0098e abstractActivityC0098e4 = c0101h.f1862a;
            abstractActivityC0098e4.getClass();
            eVar.b(abstractActivityC0098e4, nVar);
            Trace.endSection();
            AbstractActivityC0098e abstractActivityC0098e5 = c0101h.f1862a;
            abstractActivityC0098e5.getClass();
            c0101h.f1865d = new f(abstractActivityC0098e5, c0101h.f1863b.f1989l, abstractActivityC0098e5);
            AbstractActivityC0098e abstractActivityC0098e6 = c0101h.f1862a;
            c cVar2 = c0101h.f1863b;
            if (!abstractActivityC0098e6.f1855f.f1867f) {
                a1.a.v(cVar2);
            }
            c0101h.f1870i = true;
            C0101h c0101h3 = this.f1855f;
            c0101h3.c();
            if (bundle != null) {
                bundle.getBundle("plugins");
                byteArray = bundle.getByteArray("framework");
            } else {
                byteArray = null;
            }
            if (c0101h3.f1862a.j()) {
                p028p0.l lVar2 = c0101h3.f1863b.f1988k;
                lVar2.f2950e = true;
                k kVar = lVar2.f2949d;
                if (kVar != null) {
                    kVar.c(p028p0.l.a(byteArray));
                    lVar2.f2949d = null;
                    lVar2.f2947b = byteArray;
                } else if (lVar2.f2951f) {
                    lVar2.f2948c.F("push", p028p0.l.a(byteArray), new k(0, lVar2, byteArray));
                } else {
                    lVar2.f2947b = byteArray;
                }
            }
            c0101h3.f1862a.getClass();
            e eVar2 = c0101h3.f1863b.f1981d;
            if (eVar2.e()) {
                a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it2 = ((HashSet) eVar2.f2008f.f2002f).iterator();
                    if (it2.hasNext()) {
                        if (it2.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th2) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            }
            this.f1856g.c(androidx.lifecycle.f.ON_CREATE);
            if (c() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            C0101h c0101h4 = this.f1855f;
            boolean z3 = (c() == 1 ? (char) 1 : (char) 2) == 1;
            c0101h4.c();
            if (c0101h4.f1862a.c() == 1) {
                AbstractActivityC0098e abstractActivityC0098e7 = c0101h4.f1862a;
                abstractActivityC0098e7.getClass();
                k kVar2 = new k(abstractActivityC0098e7, c0101h4.f1862a.c() != 1);
                c0101h4.f1862a.getClass();
                AbstractActivityC0098e abstractActivityC0098e8 = c0101h4.f1862a;
                abstractActivityC0098e8.getClass();
                c0101h4.f1864c = new q(abstractActivityC0098e8, kVar2);
            } else {
                AbstractActivityC0098e abstractActivityC0098e9 = c0101h4.f1862a;
                abstractActivityC0098e9.getClass();
                m mVar = new m(abstractActivityC0098e9, null);
                mVar.f1885e = false;
                mVar.f1886f = false;
                mVar.setSurfaceTextureListener(new l(mVar));
                mVar.setOpaque(c0101h4.f1862a.c() == 1);
                c0101h4.f1862a.getClass();
                AbstractActivityC0098e abstractActivityC0098e10 = c0101h4.f1862a;
                abstractActivityC0098e10.getClass();
                c0101h4.f1864c = new q(abstractActivityC0098e10, mVar);
            }
            c0101h4.f1864c.f1899j.add(c0101h4.f1872k);
            c0101h4.f1862a.getClass();
            q qVar = c0101h4.f1864c;
            c cVar3 = c0101h4.f1863b;
            qVar.getClass();
            Objects.toString(cVar3);
            if (!qVar.c()) {
                qVar.f1901l = cVar3;
                lVar = cVar3.f1979b;
                qVar.f1900k = lVar.f2236d;
                qVar.f1897h.a(lVar);
                c0099f = qVar.f1914z;
                lVar.f2233a.addIsDisplayingFlutterUiListener(c0099f);
                if (lVar.f2236d) {
                    c0099f.b();
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    qVar.f1903n = new Q(qVar, qVar.f1901l.f1985h);
                }
                c cVar4 = qVar.f1901l;
                qVar.f1904o = new j(qVar, cVar4.f1994q, cVar4.f1990m, cVar4.f1995r);
                try {
                    TextServicesManager textServicesManager = (TextServicesManager) qVar.getContext().getSystemService("textservices");
                    qVar.f1909u = textServicesManager;
                    qVar.f1905p = new io.flutter.plugin.editing.g(textServicesManager, qVar.f1901l.f1992o);
                    while (true) {
                        sparseArray = oVar.f2355n;
                        if (i2 < sparseArray.size()) {
                            break;
                        }
                        oVar.f2345d.addView((io.flutter.plugin.platform.j) sparseArray.valueAt(i2));
                        i2++;
                    }
                    while (true) {
                        sparseArray2 = oVar.f2353l;
                        if (i3 < sparseArray2.size()) {
                            break;
                        }
                        oVar.f2345d.addView((p021l0.a) sparseArray2.valueAt(i3));
                        i3++;
                    }
                    while (true) {
                        sparseArray3 = oVar.f2352k;
                        if (i5 < sparseArray3.size()) {
                            break;
                        }
                        ((io.flutter.plugin.platform.g) sparseArray3.valueAt(i5)).getClass();
                        i5++;
                    }
                } catch (Exception unused2) {
                    Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
                }
                new Q(qVar, qVar.f1904o.f2293b, qVar.f1901l.f1990m);
                qVar.f1906q = qVar.f1901l.f1982e;
                qVar.f1907r = new C0026b(qVar);
                qVar.f1908s = new C0094a(qVar.f1901l.f1979b, false);
                io.flutter.view.k kVar3 = new io.flutter.view.k(qVar, cVar3.f1983f, (AccessibilityManager) qVar.getContext().getSystemService("accessibility"), qVar.getContext().getContentResolver(), qVar.f1901l.f1995r);
                qVar.t = kVar3;
                kVar3.f2498s = qVar.f1912x;
                zIsEnabled = kVar3.f2482c.isEnabled();
                boolean zIsTouchExplorationEnabled = qVar.t.f2482c.isTouchExplorationEnabled();
                if (qVar.f1901l.f1979b.f2233a.getIsSoftwareRenderingEnabled()) {
                    qVar.setWillNotDraw(false);
                } else {
                    if (!zIsEnabled || zIsTouchExplorationEnabled) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    qVar.setWillNotDraw(z2);
                }
                c cVar5 = qVar.f1901l;
                o oVar2 = cVar5.f1995r;
                oVar2.f2349h.f2309a = qVar.t;
                oVar2.f2343b = new C0094a(cVar5.f1979b, true);
                qVar.f1904o.f2293b.restartInput(qVar);
                qVar.d();
                qVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, qVar.f1913y);
                qVar.e();
                oVar = cVar3.f1995r;
                oVar.f2345d = qVar;
                i2 = 0;
                i3 = 0;
                it = qVar.f1902m.iterator();
                if (!it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                if (qVar.f1900k) {
                    c0099f.b();
                }
            } else if (cVar3 != qVar.f1901l) {
                qVar.a();
                qVar.f1901l = cVar3;
                lVar = cVar3.f1979b;
                qVar.f1900k = lVar.f2236d;
                qVar.f1897h.a(lVar);
                c0099f = qVar.f1914z;
                lVar.f2233a.addIsDisplayingFlutterUiListener(c0099f);
                if (lVar.f2236d) {
                    c0099f.b();
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    qVar.f1903n = new Q(qVar, qVar.f1901l.f1985h);
                }
                c cVar6 = qVar.f1901l;
                qVar.f1904o = new j(qVar, cVar6.f1994q, cVar6.f1990m, cVar6.f1995r);
                TextServicesManager textServicesManager2 = (TextServicesManager) qVar.getContext().getSystemService("textservices");
                qVar.f1909u = textServicesManager2;
                qVar.f1905p = new io.flutter.plugin.editing.g(textServicesManager2, qVar.f1901l.f1992o);
                new Q(qVar, qVar.f1904o.f2293b, qVar.f1901l.f1990m);
                qVar.f1906q = qVar.f1901l.f1982e;
                qVar.f1907r = new C0026b(qVar);
                qVar.f1908s = new C0094a(qVar.f1901l.f1979b, false);
                io.flutter.view.k kVar4 = new io.flutter.view.k(qVar, cVar3.f1983f, (AccessibilityManager) qVar.getContext().getSystemService("accessibility"), qVar.getContext().getContentResolver(), qVar.f1901l.f1995r);
                qVar.t = kVar4;
                kVar4.f2498s = qVar.f1912x;
                zIsEnabled = kVar4.f2482c.isEnabled();
                boolean zIsTouchExplorationEnabled2 = qVar.t.f2482c.isTouchExplorationEnabled();
                if (qVar.f1901l.f1979b.f2233a.getIsSoftwareRenderingEnabled()) {
                    if (zIsEnabled) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    qVar.setWillNotDraw(z2);
                } else {
                    qVar.setWillNotDraw(false);
                }
                c cVar7 = qVar.f1901l;
                o oVar3 = cVar7.f1995r;
                oVar3.f2349h.f2309a = qVar.t;
                oVar3.f2343b = new C0094a(cVar7.f1979b, true);
                qVar.f1904o.f2293b.restartInput(qVar);
                qVar.d();
                qVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, qVar.f1913y);
                qVar.e();
                oVar = cVar3.f1995r;
                oVar.f2345d = qVar;
                i2 = 0;
                while (true) {
                    sparseArray = oVar.f2355n;
                    if (i2 < sparseArray.size()) {
                        break;
                        break;
                    } else {
                        oVar.f2345d.addView((io.flutter.plugin.platform.j) sparseArray.valueAt(i2));
                        i2++;
                    }
                }
                i3 = 0;
                while (true) {
                    sparseArray2 = oVar.f2353l;
                    if (i3 < sparseArray2.size()) {
                        break;
                        break;
                    } else {
                        oVar.f2345d.addView((p021l0.a) sparseArray2.valueAt(i3));
                        i3++;
                    }
                }
                while (true) {
                    sparseArray3 = oVar.f2352k;
                    if (i5 < sparseArray3.size()) {
                        break;
                        break;
                    } else {
                        ((io.flutter.plugin.platform.g) sparseArray3.valueAt(i5)).getClass();
                        i5++;
                    }
                }
                it = qVar.f1902m.iterator();
                if (!it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                if (qVar.f1900k) {
                    c0099f.b();
                }
            }
            c0101h4.f1864c.setId(f1853i);
            if (z3) {
                q qVar2 = c0101h4.f1864c;
                if (c0101h4.f1862a.c() != 1) {
                    throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                }
                if (c0101h4.f1866e != null) {
                    qVar2.getViewTreeObserver().removeOnPreDrawListener(c0101h4.f1866e);
                }
                c0101h4.f1866e = new ViewTreeObserverOnPreDrawListenerC0100g(c0101h4, qVar2);
                qVar2.getViewTreeObserver().addOnPreDrawListener(c0101h4.f1866e);
            }
            setContentView(c0101h4.f1864c);
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(1073741824);
            window.getDecorView().setSystemUiVisibility(1280);
        } catch (Throwable th4) {
            try {
                Trace.endSection();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (k("onDestroy")) {
            this.f1855f.e();
            this.f1855f.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f1857h);
            this.f1854e = false;
        }
        C0101h c0101h = this.f1855f;
        if (c0101h != null) {
            c0101h.f1862a = null;
            c0101h.f1863b = null;
            c0101h.f1864c = null;
            c0101h.f1865d = null;
            this.f1855f = null;
        }
        this.f1856g.c(androidx.lifecycle.f.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (k("onNewIntent")) {
            C0101h c0101h = this.f1855f;
            c0101h.c();
            c cVar = c0101h.f1863b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            e eVar = cVar.f1981d;
            if (eVar.e()) {
                a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = ((HashSet) eVar.f2008f.f2000d).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
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
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            }
            String strD = c0101h.d(intent);
            if (strD == null || strD.isEmpty()) {
                return;
            }
            p028p0.a aVar = c0101h.f1863b.f1986i;
            aVar.getClass();
            HashMap map = new HashMap();
            map.put("location", strD);
            aVar.f2894a.F("pushRouteInformation", map, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (k("onPause")) {
            C0101h c0101h = this.f1855f;
            c0101h.c();
            c0101h.f1862a.getClass();
            c cVar = c0101h.f1863b;
            if (cVar != null) {
                d dVar = cVar.f1984g;
                dVar.a(3, dVar.f2900c);
            }
        }
        this.f1856g.c(androidx.lifecycle.f.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (k("onPostResume")) {
            C0101h c0101h = this.f1855f;
            c0101h.c();
            if (c0101h.f1863b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            f fVar = c0101h.f1865d;
            if (fVar != null) {
                fVar.b();
            }
            c0101h.f1863b.f1995r.j();
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (k("onRequestPermissionsResult")) {
            C0101h c0101h = this.f1855f;
            c0101h.c();
            if (c0101h.f1863b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            e eVar = c0101h.f1863b.f1981d;
            if (!eVar.e()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it = ((HashSet) eVar.f2008f.f1998b).iterator();
                if (!it.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f1856g.c(androidx.lifecycle.f.ON_RESUME);
        if (k("onResume")) {
            C0101h c0101h = this.f1855f;
            c0101h.c();
            c0101h.f1862a.getClass();
            c cVar = c0101h.f1863b;
            if (cVar != null) {
                d dVar = cVar.f1984g;
                dVar.a(2, dVar.f2900c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (k("onSaveInstanceState")) {
            C0101h c0101h = this.f1855f;
            c0101h.c();
            if (c0101h.f1862a.j()) {
                bundle.putByteArray("framework", c0101h.f1863b.f1988k.f2947b);
            }
            c0101h.f1862a.getClass();
            Bundle bundle2 = new Bundle();
            e eVar = c0101h.f1863b.f1981d;
            if (eVar.e()) {
                a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) eVar.f2008f.f2002f).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
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
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle("plugins", bundle2);
            if (c0101h.f1862a.d() == null || c0101h.f1862a.i()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", c0101h.f1862a.f1854e);
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        String string;
        super.onStart();
        this.f1856g.c(androidx.lifecycle.f.ON_START);
        if (k("onStart")) {
            C0101h c0101h = this.f1855f;
            c0101h.c();
            if (c0101h.f1862a.d() == null && !c0101h.f1863b.f1980c.f2158e) {
                String strF = c0101h.f1862a.f();
                if (strF == null) {
                    AbstractActivityC0098e abstractActivityC0098e = c0101h.f1862a;
                    abstractActivityC0098e.getClass();
                    strF = c0101h.d(abstractActivityC0098e.getIntent());
                    if (strF == null) {
                        strF = "/";
                    }
                }
                AbstractActivityC0098e abstractActivityC0098e2 = c0101h.f1862a;
                abstractActivityC0098e2.getClass();
                try {
                    Bundle bundleG = abstractActivityC0098e2.g();
                    string = bundleG != null ? bundleG.getString("io.flutter.EntrypointUri") : null;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                c0101h.f1862a.e();
                c0101h.f1863b.f1986i.f2894a.F("setInitialRoute", strF, null);
                String strB = c0101h.f1862a.b();
                if (strB == null || strB.isEmpty()) {
                    strB = (String) ((p019k0.d) C0026b.E().f477g).f2803d.f2160g;
                }
                c0101h.f1863b.f1980c.a(string == null ? new p015i0.a(strB, c0101h.f1862a.e()) : new p015i0.a(strB, string, c0101h.f1862a.e()), (List) c0101h.f1862a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = c0101h.f1871j;
            if (num != null) {
                c0101h.f1864c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (k("onStop")) {
            C0101h c0101h = this.f1855f;
            c0101h.c();
            c0101h.f1862a.getClass();
            c cVar = c0101h.f1863b;
            if (cVar != null) {
                d dVar = cVar.f1984g;
                dVar.a(5, dVar.f2900c);
            }
            c0101h.f1871j = Integer.valueOf(c0101h.f1864c.getVisibility());
            c0101h.f1864c.setVisibility(8);
            c cVar2 = c0101h.f1863b;
            if (cVar2 != null) {
                cVar2.f1979b.e(40);
            }
        }
        this.f1856g.c(androidx.lifecycle.f.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        if (k("onTrimMemory")) {
            C0101h c0101h = this.f1855f;
            c0101h.c();
            c cVar = c0101h.f1863b;
            if (cVar != null) {
                if (c0101h.f1869h && i2 >= 10) {
                    FlutterJNI flutterJNI = (FlutterJNI) cVar.f1980c.f2159f;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    p028p0.c cVar2 = c0101h.f1863b.f1993p;
                    cVar2.getClass();
                    HashMap map = new HashMap(1);
                    map.put("type", "memoryPressure");
                    cVar2.f2897a.f(map, null);
                }
                c0101h.f1863b.f1979b.e(i2);
                o oVar = c0101h.f1863b.f1995r;
                if (i2 < 40) {
                    oVar.getClass();
                    return;
                }
                Iterator it = oVar.f2350i.values().iterator();
                while (it.hasNext()) {
                    ((z) it.next()).f2393h.setSurface(null);
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (k("onUserLeaveHint")) {
            C0101h c0101h = this.f1855f;
            c0101h.c();
            c cVar = c0101h.f1863b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            e eVar = cVar.f1981d;
            if (!eVar.e()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = ((HashSet) eVar.f2008f.f2001e).iterator();
                if (!it.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (k("onWindowFocusChanged")) {
            C0101h c0101h = this.f1855f;
            c0101h.c();
            c0101h.f1862a.getClass();
            c cVar = c0101h.f1863b;
            if (cVar != null) {
                d dVar = cVar.f1984g;
                if (z2) {
                    dVar.a(dVar.f2898a, true);
                } else {
                    dVar.a(dVar.f2898a, false);
                }
            }
        }
    }
}
