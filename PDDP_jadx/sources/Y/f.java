package Y;

import androidx.window.extensions.layout.WindowLayoutComponent;

/* JADX INFO: loaded from: classes.dex */
public final class f extends I0.j implements H0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f1086f = new f(0);

    @Override // H0.a
    public final Object f() {
        WindowLayoutComponent windowLayoutComponentA;
        Object cVar;
        try {
            ClassLoader classLoader = h.class.getClassLoader();
            e eVar = classLoader != null ? new e(classLoader, new U.a(classLoader)) : null;
            if (eVar == null || (windowLayoutComponentA = eVar.a()) == null) {
                return null;
            }
            I0.i.d(classLoader, "loader");
            U.a aVar = new U.a(classLoader);
            int iA = V.e.a();
            if (iA >= 2) {
                cVar = new p001a0.d(windowLayoutComponentA);
            } else {
                cVar = iA == 1 ? new p001a0.c(windowLayoutComponentA, aVar) : new p001a0.a();
            }
            return cVar;
        } catch (Throwable unused) {
            g gVar = g.f1087a;
            return null;
        }
    }
}
