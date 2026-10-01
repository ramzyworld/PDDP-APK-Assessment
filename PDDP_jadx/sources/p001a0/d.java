package p001a0;

import L.e;
import Y.i;
import Z.a;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p041x0.g;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1136b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1137c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1138d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f1135a = windowLayoutComponent;
    }

    @Override // Z.a
    public final void a(i iVar) {
        ReentrantLock reentrantLock = this.f1136b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1138d;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f1137c;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(iVar);
            linkedHashMap.remove(iVar);
            if (fVar.c()) {
                linkedHashMap2.remove(context);
                this.f1135a.removeWindowLayoutInfoListener(fVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // Z.a
    public final void b(Context context, e eVar, i iVar) {
        g gVar;
        ReentrantLock reentrantLock = this.f1136b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1137c;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1138d;
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
                this.f1135a.addWindowLayoutInfoListener(context, fVar2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
