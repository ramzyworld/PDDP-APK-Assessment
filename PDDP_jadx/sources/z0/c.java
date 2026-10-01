package z0;

import H0.p;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class c implements i, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f3501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f3502f;

    public c(i iVar, g gVar) {
        I0.i.e(iVar, "left");
        I0.i.e(gVar, "element");
        this.f3501e = iVar;
        this.f3502f = gVar;
    }

    @Override // z0.i
    public final i c(i iVar) {
        I0.i.e(iVar, "context");
        return iVar == j.f3504e ? this : (i) iVar.d(this, b.f3499h);
    }

    @Override // z0.i
    public final Object d(Object obj, p pVar) {
        return pVar.h(this.f3501e.d(obj, pVar), this.f3502f);
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i2 = 2;
            c cVar2 = cVar;
            int i3 = 2;
            while (true) {
                i iVar = cVar2.f3501e;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i3++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f3501e;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i2++;
            }
            if (i3 != i2) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                g gVar = cVar4.f3502f;
                if (!I0.i.a(cVar.f(gVar.getKey()), gVar)) {
                    zA = false;
                    break;
                }
                i iVar3 = cVar4.f3501e;
                if (!(iVar3 instanceof c)) {
                    I0.i.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    zA = I0.i.a(cVar.f(gVar2.getKey()), gVar2);
                    break;
                }
                cVar4 = (c) iVar3;
            }
            if (!zA) {
                return false;
            }
        }
        return true;
    }

    @Override // z0.i
    public final g f(h hVar) {
        I0.i.e(hVar, "key");
        c cVar = this;
        while (true) {
            g gVarF = cVar.f3502f.f(hVar);
            if (gVarF != null) {
                return gVarF;
            }
            i iVar = cVar.f3501e;
            if (!(iVar instanceof c)) {
                return iVar.f(hVar);
            }
            cVar = (c) iVar;
        }
    }

    @Override // z0.i
    public final i h(h hVar) {
        I0.i.e(hVar, "key");
        g gVar = this.f3502f;
        g gVarF = gVar.f(hVar);
        i iVar = this.f3501e;
        if (gVarF != null) {
            return iVar;
        }
        i iVarH = iVar.h(hVar);
        if (iVarH == iVar) {
            return this;
        }
        return iVarH == j.f3504e ? gVar : new c(iVarH, gVar);
    }

    public final int hashCode() {
        return this.f3502f.hashCode() + this.f3501e.hashCode();
    }

    public final String toString() {
        return "[" + ((String) d("", b.f3498g)) + ']';
    }
}
