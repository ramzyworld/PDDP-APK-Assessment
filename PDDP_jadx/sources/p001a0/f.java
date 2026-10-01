package p001a0;

import I0.i;
import Y.k;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import x.a;

/* JADX INFO: loaded from: classes.dex */
public final class f implements a, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1139a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f1141c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1140b = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f1142d = new LinkedHashSet();

    public f(Context context) {
        this.f1139a = context;
    }

    @Override // x.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        i.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f1140b;
        reentrantLock.lock();
        try {
            this.f1141c = e.c(this.f1139a, windowLayoutInfo);
            Iterator it = this.f1142d.iterator();
            while (it.hasNext()) {
                ((a) it.next()).accept(this.f1141c);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(Y.i iVar) {
        ReentrantLock reentrantLock = this.f1140b;
        reentrantLock.lock();
        try {
            k kVar = this.f1141c;
            if (kVar != null) {
                iVar.accept(kVar);
            }
            this.f1142d.add(iVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean c() {
        return this.f1142d.isEmpty();
    }

    public final void d(Y.i iVar) {
        ReentrantLock reentrantLock = this.f1140b;
        reentrantLock.lock();
        try {
            this.f1142d.remove(iVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
