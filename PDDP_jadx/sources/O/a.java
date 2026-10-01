package O;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.deeprf.pddp.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f562e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f565c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f564b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f563a = new HashMap();

    public a(Context context) {
        this.f565c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f561d == null) {
            synchronized (f562e) {
                try {
                    if (f561d == null) {
                        f561d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f561d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f565c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f564b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new c(e2);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        boolean zC;
        boolean zBooleanValue = false;
        if (Build.VERSION.SDK_INT >= 29) {
            zC = P.a.c();
        } else {
            try {
                if (a1.a.f1144f == null) {
                    a1.a.f1143e = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    a1.a.f1144f = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                zBooleanValue = ((Boolean) a1.a.f1144f.invoke(null, Long.valueOf(a1.a.f1143e))).booleanValue();
            } catch (Exception e2) {
                a1.a.q("isTagEnabled", e2);
            }
            zC = zBooleanValue;
        }
        if (zC) {
            try {
                Trace.beginSection(a1.a.I(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f563a;
        if (map.containsKey(cls)) {
            map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                Object objB = bVar.b(this.f565c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        Trace.endSection();
    }
}
