package p039v0;

import I0.i;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.p;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;
import p028p0.b;

/* JADX INFO: renamed from: v0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0145c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f3326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f3327b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f3328c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f3329d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReferenceQueue f3330e = new ReferenceQueue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f3331f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f3332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f3333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f3334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3335j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f3336k;

    public C0145c(b bVar) {
        this.f3326a = bVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f3332g = handler;
        p pVar = new p(4, this);
        this.f3333h = pVar;
        this.f3334i = 65536L;
        this.f3336k = 3000L;
        handler.postDelayed(pVar, 3000L);
    }

    public final void a(long j2, Object obj) {
        i.e(obj, "instance");
        f();
        c(j2, obj);
    }

    public final long b(Object obj) {
        i.e(obj, "instance");
        f();
        if (!d(obj)) {
            long j2 = this.f3334i;
            this.f3334i = 1 + j2;
            c(j2, obj);
            return j2;
        }
        throw new IllegalArgumentException(("Instance of " + obj.getClass() + " has already been added.").toString());
    }

    public final void c(long j2, Object obj) {
        if (j2 < 0) {
            throw new IllegalArgumentException(("Identifier must be >= 0: " + j2).toString());
        }
        HashMap map = this.f3328c;
        if (map.containsKey(Long.valueOf(j2))) {
            throw new IllegalArgumentException(("Identifier has already been added: " + j2).toString());
        }
        WeakReference weakReference = new WeakReference(obj, this.f3330e);
        this.f3327b.put(obj, Long.valueOf(j2));
        map.put(Long.valueOf(j2), weakReference);
        this.f3331f.put(weakReference, Long.valueOf(j2));
        this.f3329d.put(Long.valueOf(j2), obj);
    }

    public final boolean d(Object obj) {
        f();
        return this.f3327b.containsKey(obj);
    }

    public final Object e(long j2) {
        f();
        WeakReference weakReference = (WeakReference) this.f3328c.get(Long.valueOf(j2));
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void f() {
        if (this.f3335j) {
            Log.w("PigeonInstanceManager", "The manager was used after calls to the PigeonFinalizationListener has been stopped.");
        }
    }
}
