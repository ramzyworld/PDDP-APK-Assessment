package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.lifecycle.s;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f2233a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Surface f2235c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f2240h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f2234b = new AtomicLong(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2236d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f2237e = new Handler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f2238f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f2239g = new ArrayList();

    public l(FlutterJNI flutterJNI) {
        androidx.lifecycle.l lVar;
        a aVar = new a(this);
        this.f2240h = aVar;
        this.f2233a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
        androidx.lifecycle.n nVar = s.f1604m.f1610j;
        b bVar = new b(this);
        nVar.getClass();
        nVar.b("addObserver");
        androidx.lifecycle.g gVar = nVar.f1594c;
        androidx.lifecycle.g gVar2 = androidx.lifecycle.g.f1583e;
        gVar2 = gVar != gVar2 ? androidx.lifecycle.g.f1584f : gVar2;
        androidx.lifecycle.m mVar = new androidx.lifecycle.m();
        int i2 = androidx.lifecycle.o.f1601a;
        androidx.lifecycle.m mVar2 = null;
        mVar.f1591b = new androidx.lifecycle.b(bVar, null);
        mVar.f1590a = gVar2;
        p020l.a aVar2 = nVar.f1593b;
        HashMap map = aVar2.f2811i;
        p020l.c cVar = (p020l.c) map.get(bVar);
        if (cVar != null) {
            mVar2 = cVar.f2816f;
        } else {
            p020l.c cVar2 = new p020l.c(bVar, mVar);
            aVar2.f2810h++;
            p020l.c cVar3 = aVar2.f2808f;
            if (cVar3 == null) {
                aVar2.f2807e = cVar2;
                aVar2.f2808f = cVar2;
            } else {
                cVar3.f2817g = cVar2;
                cVar2.f2818h = cVar3;
                aVar2.f2808f = cVar2;
            }
            map.put(bVar, cVar2);
        }
        if (mVar2 == null && (lVar = (androidx.lifecycle.l) nVar.f1595d.get()) != null) {
            boolean z2 = nVar.f1596e != 0 || nVar.f1597f;
            nVar.f1596e++;
            for (androidx.lifecycle.g gVarA = nVar.a(bVar); mVar.f1590a.compareTo(gVarA) < 0 && nVar.f1593b.f2811i.containsKey(bVar); gVarA = nVar.a(bVar)) {
                nVar.f1599h.add(mVar.f1590a);
                androidx.lifecycle.d dVar = androidx.lifecycle.f.Companion;
                androidx.lifecycle.g gVar3 = mVar.f1590a;
                dVar.getClass();
                androidx.lifecycle.f fVarA = androidx.lifecycle.d.a(gVar3);
                if (fVarA == null) {
                    throw new IllegalStateException("no event up from " + mVar.f1590a);
                }
                mVar.a(lVar, fVarA);
                ArrayList arrayList = nVar.f1599h;
                arrayList.remove(arrayList.size() - 1);
            }
            if (!z2) {
                nVar.d();
            }
            nVar.f1596e--;
        }
    }

    public final void a(io.flutter.view.o oVar) {
        HashSet hashSet = this.f2238f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((io.flutter.view.o) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
        hashSet.add(new WeakReference(oVar));
    }

    public final TextureRegistry$ImageTextureEntry b() {
        FlutterRenderer$ImageTextureRegistryEntry flutterRenderer$ImageTextureRegistryEntry = new FlutterRenderer$ImageTextureRegistryEntry(this, this.f2234b.getAndIncrement());
        flutterRenderer$ImageTextureRegistryEntry.id();
        this.f2233a.registerImageTexture(flutterRenderer$ImageTextureRegistryEntry.id(), flutterRenderer$ImageTextureRegistryEntry);
        return flutterRenderer$ImageTextureRegistryEntry;
    }

    public final TextureRegistry$SurfaceProducer c() {
        if (Build.VERSION.SDK_INT < 29) {
            i iVarD = d();
            return new o(iVarD.f2208a, this.f2237e, this.f2233a, iVarD);
        }
        long andIncrement = this.f2234b.getAndIncrement();
        FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = new FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
        this.f2233a.registerImageTexture(andIncrement, flutterRenderer$ImageReaderSurfaceProducer);
        a(flutterRenderer$ImageReaderSurfaceProducer);
        this.f2239g.add(flutterRenderer$ImageReaderSurfaceProducer);
        return flutterRenderer$ImageReaderSurfaceProducer;
    }

    public final i d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        long andIncrement = this.f2234b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        i iVar = new i(this, andIncrement, surfaceTexture);
        this.f2233a.registerTexture(iVar.f2208a, iVar.f2209b);
        a(iVar);
        return iVar;
    }

    public final void e(int i2) {
        Iterator it = this.f2238f.iterator();
        while (it.hasNext()) {
            io.flutter.view.o oVar = (io.flutter.view.o) ((WeakReference) it.next()).get();
            if (oVar != null) {
                oVar.onTrimMemory(i2);
            } else {
                it.remove();
            }
        }
    }

    public final void f(io.flutter.view.o oVar) {
        HashSet<WeakReference> hashSet = this.f2238f;
        for (WeakReference weakReference : hashSet) {
            if (weakReference.get() == oVar) {
                hashSet.remove(weakReference);
                return;
            }
        }
    }

    public final void g() {
        if (this.f2235c != null) {
            this.f2233a.onSurfaceDestroyed();
            if (this.f2236d) {
                this.f2240h.a();
            }
            this.f2236d = false;
            this.f2235c = null;
        }
    }
}
