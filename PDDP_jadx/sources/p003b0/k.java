package p003b0;

import D.j;
import L.e;
import Y.i;
import Z.a;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import p041x0.g;
import p043y0.l;

/* JADX INFO: loaded from: classes.dex */
public final class k implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile k f1733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f1734d = new ReentrantLock();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f1735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f1736b = new CopyOnWriteArrayList();

    public k(i iVar) {
        this.f1735a = iVar;
        if (iVar != null) {
            iVar.h(new j(16, this));
        }
    }

    @Override // Z.a
    public final void a(i iVar) {
        synchronized (f1734d) {
            try {
                if (this.f1735a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (j jVar : this.f1736b) {
                    if (jVar.f1731b == iVar) {
                        arrayList.add(jVar);
                    }
                }
                this.f1736b.removeAll(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Activity activity = ((j) it.next()).f1730a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f1736b;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((j) it2.next()).f1730a.equals(activity)) {
                                }
                            }
                        }
                    }
                    i iVar2 = this.f1735a;
                    if (iVar2 != null) {
                        iVar2.f(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // Z.a
    public final void b(Context context, e eVar, i iVar) {
        Object next;
        WindowManager.LayoutParams attributes;
        g gVar = null;
        iBinder = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        l lVar = l.f3483e;
        if (activity != null) {
            ReentrantLock reentrantLock = f1734d;
            reentrantLock.lock();
            try {
                i iVar2 = this.f1735a;
                if (iVar2 == null) {
                    iVar.accept(new Y.k(lVar));
                    reentrantLock.unlock();
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f1736b;
                boolean z2 = false;
                if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        if (((j) it.next()).f1730a.equals(activity)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                j jVar = new j(activity, eVar, iVar);
                copyOnWriteArrayList.add(jVar);
                if (z2) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!activity.equals(((j) next).f1730a));
                    j jVar2 = (j) next;
                    Y.k kVar = jVar2 != null ? jVar2.f1732c : null;
                    if (kVar != null) {
                        jVar.f1732c = kVar;
                        jVar.f1731b.accept(kVar);
                    }
                } else {
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        iVar2.g(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new h(iVar2, activity));
                    }
                }
                reentrantLock.unlock();
                gVar = g.f3419a;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        if (gVar == null) {
            iVar.accept(new Y.k(lVar));
        }
    }
}
