package p037u0;

import G.C0004e;
import G.S;
import G.W;
import G.X;
import I.a;
import I0.b;
import I0.l;
import I0.q;
import N0.c;
import Q0.B;
import Q0.C0061t;
import Q0.InterfaceC0062u;
import Q0.T;
import Q0.f0;
import V0.e;
import android.content.Context;
import java.util.List;
import java.util.Set;
import z0.i;
import z0.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c[] f3115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I.c f3116b;

    static {
        l lVar = new l(b.f319e, K.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        q.f339a.getClass();
        f3115a = new c[]{lVar};
        a aVar = a.f307f;
        i iVarC = B.f673b;
        f0 f0Var = new f0(null);
        iVarC.getClass();
        if (f0Var != j.f3504e) {
            iVarC = (i) f0Var.d(iVarC, z0.b.f3499h);
        }
        if (iVarC.f(C0061t.f743f) == null) {
            iVarC = iVarC.c(new T(null));
        }
        f3116b = new I.c(aVar, new e(iVarC));
    }

    public static final D.j a(Context context) {
        D.j jVar;
        I0.i.e(context, "<this>");
        I.c cVar = f3116b;
        c cVar2 = f3115a[0];
        cVar.getClass();
        I0.i.e(cVar2, "property");
        D.j jVar2 = cVar.f314d;
        if (jVar2 != null) {
            return jVar2;
        }
        synchronized (cVar.f313c) {
            try {
                if (cVar.f314d == null) {
                    Context applicationContext = context.getApplicationContext();
                    H0.l lVar = cVar.f311a;
                    I0.i.d(applicationContext, "applicationContext");
                    List list = (List) lVar.j(applicationContext);
                    InterfaceC0062u interfaceC0062u = cVar.f312b;
                    I.b bVar = new I.b(0, applicationContext, cVar);
                    I0.i.e(list, "migrations");
                    S s2 = new S(new X(new W(1, bVar)), a1.a.t(new C0004e(list, null)), new H.a(0), interfaceC0062u);
                    cVar.f314d = new D.j(5, new D.j(5, s2));
                }
                jVar = cVar.f314d;
                I0.i.b(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public static final boolean b(String str, Object obj, Set set) {
        I0.i.e(str, "key");
        if (set == null) {
            return (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double);
        }
        return set.contains(str);
    }

    public static final Object c(Object obj, H.a aVar) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        I0.i.e(str, "<this>");
        if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                return obj;
            }
            String strSubstring = str.substring(40);
            I0.i.d(strSubstring, "substring(...)");
            return aVar.e(strSubstring);
        }
        if (!str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            return obj;
        }
        String strSubstring2 = str.substring(40);
        I0.i.d(strSubstring2, "substring(...)");
        return Double.valueOf(Double.parseDouble(strSubstring2));
    }
}
