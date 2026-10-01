package Y;

import I0.q;
import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f1087a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p041x0.e f1088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1089c;

    static {
        q.a(h.class).b();
        f1088b = new p041x0.e(f.f1086f);
        f1089c = a.f1068a;
    }

    public static b a(Context context) {
        I0.i.e(context, "context");
        Z.a aVar = (Z.a) f1088b.a();
        if (aVar == null) {
            p003b0.k kVar = p003b0.k.f1733c;
            if (p003b0.k.f1733c == null) {
                ReentrantLock reentrantLock = p003b0.k.f1734d;
                reentrantLock.lock();
                try {
                    if (p003b0.k.f1733c == null) {
                        p003b0.i iVar = null;
                        try {
                            V.i iVarC = p003b0.g.c();
                            if (iVarC != null) {
                                V.i iVar2 = V.i.f961j;
                                I0.i.e(iVar2, "other");
                                Object objA = iVarC.f966i.a();
                                I0.i.d(objA, "<get-bigInteger>(...)");
                                Object objA2 = iVar2.f966i.a();
                                I0.i.d(objA2, "<get-bigInteger>(...)");
                                if (((BigInteger) objA).compareTo((BigInteger) objA2) >= 0) {
                                    p003b0.i iVar3 = new p003b0.i(context);
                                    if (iVar3.i()) {
                                        iVar = iVar3;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        p003b0.k.f1733c = new p003b0.k(iVar);
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            aVar = p003b0.k.f1733c;
            I0.i.b(aVar);
        }
        int i2 = o.f1102b;
        b bVar = new b(aVar);
        f1089c.getClass();
        return bVar;
    }
}
