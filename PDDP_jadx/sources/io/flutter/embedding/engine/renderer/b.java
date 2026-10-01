package io.flutter.embedding.engine.renderer;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements androidx.lifecycle.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f2194a;

    public b(l lVar) {
        this.f2194a = lVar;
    }

    public final void a() {
        Iterator it = this.f2194a.f2239g.iterator();
        while (it.hasNext()) {
            FlutterRenderer$ImageReaderSurfaceProducer.access$200((FlutterRenderer$ImageReaderSurfaceProducer) it.next());
        }
    }
}
