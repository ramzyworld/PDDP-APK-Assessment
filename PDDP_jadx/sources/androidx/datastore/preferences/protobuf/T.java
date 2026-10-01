package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T f1459c = new T();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f1461b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f1460a = new F();

    public final W a(Class cls) {
        C0084p c0084p;
        W wX;
        O o2;
        Class cls2;
        AbstractC0092y.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f1461b;
        W w2 = (W) concurrentHashMap.get(cls);
        if (w2 != null) {
            return w2;
        }
        F f2 = this.f1460a;
        f2.getClass();
        Class cls3 = X.f1469a;
        if (!AbstractC0090w.class.isAssignableFrom(cls) && (cls2 = X.f1469a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        V vB = ((E) f2.f1429a).b(cls);
        if ((vB.f1468d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC0090w.class.isAssignableFrom(cls);
            AbstractC0090w abstractC0090w = vB.f1465a;
            if (zIsAssignableFrom) {
                o2 = new O(X.f1471c, AbstractC0085q.f1547a, abstractC0090w);
            } else {
                e0 e0Var = X.f1470b;
                C0084p c0084p2 = AbstractC0085q.f1548b;
                if (c0084p2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                o2 = new O(e0Var, c0084p2, abstractC0090w);
            }
            wX = o2;
        } else if (AbstractC0090w.class.isAssignableFrom(cls)) {
            P p2 = Q.f1458b;
            C c2 = D.f1426b;
            e0 e0Var2 = X.f1471c;
            C0084p c0084p3 = I.j.b(vB.d()) != 1 ? AbstractC0085q.f1547a : null;
            J j2 = K.f1437b;
            int[] iArr = N.f1439n;
            if (!(vB instanceof V)) {
                vB.getClass();
                throw new ClassCastException();
            }
            wX = N.x(vB, p2, c2, e0Var2, c0084p3, j2);
        } else {
            P p3 = Q.f1457a;
            C c3 = D.f1425a;
            e0 e0Var3 = X.f1470b;
            if (I.j.b(vB.d()) != 1) {
                c0084p = AbstractC0085q.f1548b;
                if (c0084p == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                c0084p = null;
            }
            J j3 = K.f1436a;
            int[] iArr2 = N.f1439n;
            if (!(vB instanceof V)) {
                vB.getClass();
                throw new ClassCastException();
            }
            wX = N.x(vB, p3, c3, e0Var3, c0084p, j3);
        }
        W w3 = (W) concurrentHashMap.putIfAbsent(cls, wX);
        return w3 != null ? w3 : wX;
    }
}
