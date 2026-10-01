package p013h0;

import D.j;
import G.C0013n;
import N.Q;
import android.content.Context;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.n;
import io.flutter.plugin.platform.o;
import java.util.HashMap;
import java.util.Iterator;
import p011g0.AbstractActivityC0098e;
import p011g0.C0101h;
import p019k0.d;
import p023m0.a;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f2004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0013n f2005c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0101h f2007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f2008f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2003a = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f2006d = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2009g = false;

    public e(Context context, c cVar, d dVar) {
        new HashMap();
        new HashMap();
        new HashMap();
        this.f2004b = cVar;
        this.f2005c = new C0013n(context, cVar.f1980c, cVar.f1995r.f2342a, new j(19, dVar));
    }

    public final void a(a aVar) {
        w0.a.b("FlutterEngineConnectionRegistry#add ".concat(aVar.getClass().getSimpleName()));
        try {
            Class<?> cls = aVar.getClass();
            HashMap map = this.f2003a;
            if (map.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f2004b + ").");
                Trace.endSection();
                return;
            }
            aVar.toString();
            map.put(aVar.getClass(), aVar);
            aVar.g(this.f2005c);
            if (aVar instanceof p025n0.a) {
                p025n0.a aVar2 = (p025n0.a) aVar;
                this.f2006d.put(aVar.getClass(), aVar2);
                if (e()) {
                    aVar2.b(this.f2008f);
                }
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
    }

    public final void b(AbstractActivityC0098e abstractActivityC0098e, n nVar) {
        this.f2008f = new d(abstractActivityC0098e, nVar);
        boolean booleanExtra = abstractActivityC0098e.getIntent() != null ? abstractActivityC0098e.getIntent().getBooleanExtra("enable-software-rendering", false) : false;
        c cVar = this.f2004b;
        o oVar = cVar.f1995r;
        oVar.f2361u = booleanExtra;
        if (oVar.f2344c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        oVar.f2344c = abstractActivityC0098e;
        oVar.f2346e = cVar.f1979b;
        Q q2 = new Q(cVar.f1980c, 15);
        oVar.f2348g = q2;
        q2.f472g = oVar.f2362v;
        for (p025n0.a aVar : this.f2006d.values()) {
            if (this.f2009g) {
                aVar.c(this.f2008f);
            } else {
                aVar.b(this.f2008f);
            }
        }
        this.f2009g = false;
    }

    public final void c() {
        if (!e()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        w0.a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = this.f2006d.values().iterator();
            while (it.hasNext()) {
                ((p025n0.a) it.next()).d();
            }
            o oVar = this.f2004b.f1995r;
            Q q2 = oVar.f2348g;
            if (q2 != null) {
                q2.f472g = null;
            }
            oVar.c();
            oVar.f2348g = null;
            oVar.f2344c = null;
            oVar.f2346e = null;
            this.f2007e = null;
            this.f2008f = null;
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

    public final void d() {
        if (e()) {
            c();
        }
    }

    public final boolean e() {
        return this.f2007e != null;
    }
}
