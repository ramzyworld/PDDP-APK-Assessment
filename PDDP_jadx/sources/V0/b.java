package V0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f975a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC0068a.f969a;

    @Override // V0.r
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f975a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        D.j jVar = AbstractC0068a.f969a;
        if (obj2 == jVar) {
            D.j jVarC = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == jVar) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, jVarC)) {
                    if (atomicReferenceFieldUpdater.get(this) != jVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                    }
                }
                obj2 = jVarC;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract D.j c(Object obj);
}
