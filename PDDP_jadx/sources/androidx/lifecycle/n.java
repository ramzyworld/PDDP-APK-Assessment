package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class n extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p020l.a f1593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f1594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f1595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f1599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final T0.q f1600i;

    public n(l lVar) {
        new AtomicReference();
        this.f1592a = true;
        this.f1593b = new p020l.a();
        g gVar = g.f1584f;
        this.f1594c = gVar;
        this.f1599h = new ArrayList();
        this.f1595d = new WeakReference(lVar);
        this.f1600i = new T0.q(gVar);
    }

    public final g a(io.flutter.embedding.engine.renderer.b bVar) {
        HashMap map = this.f1593b.f2811i;
        p020l.c cVar = map.containsKey(bVar) ? ((p020l.c) map.get(bVar)).f2818h : null;
        g gVar = cVar != null ? cVar.f2816f.f1590a : null;
        ArrayList arrayList = this.f1599h;
        g gVar2 = arrayList.isEmpty() ? null : (g) arrayList.get(arrayList.size() - 1);
        g gVar3 = this.f1594c;
        I0.i.e(gVar3, "state1");
        if (gVar == null || gVar.compareTo(gVar3) >= 0) {
            gVar = gVar3;
        }
        return (gVar2 == null || gVar2.compareTo(gVar) >= 0) ? gVar : gVar2;
    }

    public final void b(String str) {
        p018k.a aVar;
        if (this.f1592a) {
            if (p018k.a.f2789f != null) {
                aVar = p018k.a.f2789f;
            } else {
                synchronized (p018k.a.class) {
                    try {
                        if (p018k.a.f2789f == null) {
                            p018k.a.f2789f = new p018k.a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                aVar = p018k.a.f2789f;
            }
            ((p018k.a) aVar.f2790e).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void c(f fVar) {
        I0.i.e(fVar, "event");
        b("handleLifecycleEvent");
        g gVarA = fVar.a();
        g gVar = this.f1594c;
        if (gVar == gVarA) {
            return;
        }
        g gVar2 = g.f1584f;
        g gVar3 = g.f1583e;
        if (gVar == gVar2 && gVarA == gVar3) {
            throw new IllegalStateException(("no event down from " + this.f1594c + " in component " + this.f1595d.get()).toString());
        }
        this.f1594c = gVarA;
        if (this.f1597f || this.f1596e != 0) {
            this.f1598g = true;
            return;
        }
        this.f1597f = true;
        d();
        this.f1597f = false;
        if (this.f1594c == gVar3) {
            this.f1593b = new p020l.a();
        }
    }

    public final void d() {
        f fVar;
        l lVar = (l) this.f1595d.get();
        if (lVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            p020l.a aVar = this.f1593b;
            if (aVar.f2810h != 0) {
                p020l.c cVar = aVar.f2807e;
                I0.i.b(cVar);
                g gVar = cVar.f2816f.f1590a;
                p020l.c cVar2 = this.f1593b.f2808f;
                I0.i.b(cVar2);
                g gVar2 = cVar2.f2816f.f1590a;
                if (gVar == gVar2 && this.f1594c == gVar2) {
                    break;
                }
                this.f1598g = false;
                g gVar3 = this.f1594c;
                p020l.c cVar3 = this.f1593b.f2807e;
                I0.i.b(cVar3);
                if (gVar3.compareTo(cVar3.f2816f.f1590a) < 0) {
                    p020l.a aVar2 = this.f1593b;
                    p020l.b bVar = new p020l.b(aVar2.f2808f, aVar2.f2807e, 1);
                    aVar2.f2809g.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f1598g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        I0.i.d(entry, "next()");
                        k kVar = (k) entry.getKey();
                        m mVar = (m) entry.getValue();
                        while (mVar.f1590a.compareTo(this.f1594c) > 0 && !this.f1598g && this.f1593b.f2811i.containsKey(kVar)) {
                            d dVar = f.Companion;
                            g gVar4 = mVar.f1590a;
                            dVar.getClass();
                            I0.i.e(gVar4, "state");
                            int iOrdinal = gVar4.ordinal();
                            if (iOrdinal == 2) {
                                fVar = f.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                fVar = iOrdinal != 4 ? null : f.ON_PAUSE;
                            } else {
                                fVar = f.ON_STOP;
                            }
                            if (fVar == null) {
                                throw new IllegalStateException("no event down from " + mVar.f1590a);
                            }
                            this.f1599h.add(fVar.a());
                            mVar.a(lVar, fVar);
                            ArrayList arrayList = this.f1599h;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                p020l.c cVar4 = this.f1593b.f2808f;
                if (!this.f1598g && cVar4 != null && this.f1594c.compareTo(cVar4.f2816f.f1590a) > 0) {
                    p020l.a aVar3 = this.f1593b;
                    aVar3.getClass();
                    p020l.d dVar2 = new p020l.d(aVar3);
                    aVar3.f2809g.put(dVar2, Boolean.FALSE);
                    while (dVar2.hasNext() && !this.f1598g) {
                        Map.Entry entry2 = (Map.Entry) dVar2.next();
                        k kVar2 = (k) entry2.getKey();
                        m mVar2 = (m) entry2.getValue();
                        while (mVar2.f1590a.compareTo(this.f1594c) < 0 && !this.f1598g && this.f1593b.f2811i.containsKey(kVar2)) {
                            this.f1599h.add(mVar2.f1590a);
                            d dVar3 = f.Companion;
                            g gVar5 = mVar2.f1590a;
                            dVar3.getClass();
                            f fVarA = d.a(gVar5);
                            if (fVarA == null) {
                                throw new IllegalStateException("no event up from " + mVar2.f1590a);
                            }
                            mVar2.a(lVar, fVarA);
                            ArrayList arrayList2 = this.f1599h;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f1598g = false;
        Object obj = this.f1594c;
        T0.q qVar = this.f1600i;
        qVar.getClass();
        if (obj == null) {
            obj = U0.l.f928a;
        }
        qVar.c(null, obj);
    }
}
