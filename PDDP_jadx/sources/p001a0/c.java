package p001a0;

import I0.q;
import L.e;
import V.d;
import Y.i;
import Z.a;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p041x0.g;
import p043y0.l;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U.a f1130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f1131c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1132d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f1133e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1134f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, U.a aVar) {
        this.f1129a = windowLayoutComponent;
        this.f1130b = aVar;
    }

    @Override // Z.a
    public final void a(i iVar) {
        ReentrantLock reentrantLock = this.f1131c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1133e;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f1132d;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(iVar);
            linkedHashMap.remove(iVar);
            if (fVar.f1142d.isEmpty()) {
                linkedHashMap2.remove(context);
                d dVar = (d) this.f1134f.remove(fVar);
                if (dVar != null) {
                    dVar.f951a.invoke(dVar.f952b, dVar.f953c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // Z.a
    public final void b(Context context, e eVar, i iVar) {
        g gVar;
        ReentrantLock reentrantLock = this.f1131c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1132d;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1133e;
            if (fVar != null) {
                fVar.b(iVar);
                linkedHashMap2.put(iVar, context);
                gVar = g.f3419a;
            } else {
                gVar = null;
            }
            if (gVar == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(iVar, context);
                fVar2.b(iVar);
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(l.f3483e));
                } else {
                    this.f1134f.put(fVar2, this.f1130b.a(this.f1129a, q.a(WindowLayoutInfo.class), (Activity) context, new b(fVar2)));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
