package p024n;

import p000a.a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a {
    @Override // p000a.a
    public final void B(f fVar, f fVar2) {
        fVar.f2878b = fVar2;
    }

    @Override // p000a.a
    public final void C(f fVar, Thread thread) {
        fVar.f2877a = thread;
    }

    @Override // p000a.a
    public final boolean d(g gVar, c cVar) {
        c cVar2 = c.f2869b;
        synchronized (gVar) {
            try {
                if (gVar.f2884b != cVar) {
                    return false;
                }
                gVar.f2884b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000a.a
    public final boolean e(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f2883a != obj) {
                    return false;
                }
                gVar.f2883a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000a.a
    public final boolean f(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f2885c != fVar) {
                    return false;
                }
                gVar.f2885c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
