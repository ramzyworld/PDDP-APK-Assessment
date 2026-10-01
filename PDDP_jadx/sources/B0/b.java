package B0;

import Q0.C0048f;
import V0.AbstractC0068a;
import V0.h;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z0.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements z0.d, c, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z0.d f3e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f4f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient z0.d f5g;

    public b(z0.d dVar, i iVar) {
        this.f3e = dVar;
        this.f4f = iVar;
    }

    public z0.d b(Object obj, z0.d dVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement d() {
        int iIntValue;
        String strC;
        d dVar = (d) getClass().getAnnotation(d.class);
        String str = null;
        if (dVar == null) {
            return null;
        }
        int iV = dVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i2 = iIntValue >= 0 ? dVar.l()[iIntValue] : -1;
        e eVar = f.f10b;
        e eVar2 = f.f9a;
        if (eVar == null) {
            try {
                e eVar3 = new e(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f10b = eVar3;
                eVar = eVar3;
            } catch (Exception unused2) {
                f.f10b = eVar2;
                eVar = eVar2;
            }
        }
        if (eVar != eVar2) {
            Method method = eVar.f6a;
            Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
            if (objInvoke != null) {
                Method method2 = eVar.f7b;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                if (objInvoke2 != null) {
                    Method method3 = eVar.f8c;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = dVar.c();
        } else {
            strC = str + '/' + dVar.c();
        }
        return new StackTraceElement(strC, dVar.m(), dVar.f(), i2);
    }

    @Override // B0.c
    public c g() {
        z0.d dVar = this.f3e;
        if (dVar instanceof c) {
            return (c) dVar;
        }
        return null;
    }

    @Override // z0.d
    public i i() {
        i iVar = this.f4f;
        I0.i.b(iVar);
        return iVar;
    }

    public abstract Object k(Object obj);

    @Override // z0.d
    public final void m(Object obj) {
        z0.d dVar = this;
        while (true) {
            b bVar = (b) dVar;
            z0.d dVar2 = bVar.f3e;
            I0.i.b(dVar2);
            try {
                obj = bVar.k(obj);
                if (obj == A0.a.f0e) {
                    return;
                }
            } catch (Throwable th) {
                obj = p000a.a.l(th);
            }
            bVar.n();
            if (!(dVar2 instanceof b)) {
                dVar2.m(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        z0.d dVar = this.f5g;
        if (dVar != null && dVar != this) {
            z0.g gVarF = i().f(z0.e.f3503e);
            I0.i.b(gVarF);
            h hVar = (h) dVar;
            do {
                atomicReferenceFieldUpdater = h.f982l;
            } while (atomicReferenceFieldUpdater.get(hVar) == AbstractC0068a.f972d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0048f c0048f = obj instanceof C0048f ? (C0048f) obj : null;
            if (c0048f != null) {
                c0048f.r();
            }
        }
        this.f5g = a.f2e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objD = d();
        if (objD == null) {
            objD = getClass().getName();
        }
        sb.append(objD);
        return sb.toString();
    }

    public b(z0.d dVar) {
        this(dVar, dVar != null ? dVar.i() : null);
    }
}
