package I0;

import H0.t;
import H0.u;
import H0.v;
import H0.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements N0.b, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f328d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f329a;

    static {
        List listP = p043y0.e.P(H0.a.class, H0.l.class, H0.p.class, H0.q.class, H0.r.class, H0.s.class, t.class, u.class, v.class, w.class, H0.b.class, H0.c.class, H0.d.class, H0.e.class, H0.f.class, H0.g.class, H0.h.class, H0.i.class, H0.j.class, H0.k.class, H0.m.class, H0.n.class, H0.o.class);
        ArrayList<p041x0.b> arrayList = new ArrayList(listP.size());
        int i2 = 0;
        for (Object obj : listP) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new p041x0.b((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        Map mapSingletonMap = p043y0.m.f3484e;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                mapSingletonMap = new LinkedHashMap(p000a.a.y(arrayList.size()));
                for (p041x0.b bVar : arrayList) {
                    mapSingletonMap.put(bVar.f3411e, bVar.f3412f);
                }
            } else {
                p041x0.b bVar2 = (p041x0.b) arrayList.get(0);
                i.e(bVar2, "pair");
                mapSingletonMap = Collections.singletonMap(bVar2.f3411e, bVar2.f3412f);
                i.d(mapSingletonMap, "singletonMap(...)");
            }
        }
        f326b = mapSingletonMap;
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        i.d(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            i.b(str);
            sb.append(P0.j.Y(str, str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f326b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        f327c = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(p000a.a.y(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, P0.j.Y(str2, str2));
        }
        f328d = linkedHashMap;
    }

    public e(Class cls) {
        i.e(cls, "jClass");
        this.f329a = cls;
    }

    @Override // I0.d
    public final Class a() {
        return this.f329a;
    }

    public final String b() {
        String str;
        Class cls = this.f329a;
        i.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = f328d;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return P0.j.X(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return P0.j.X(simpleName, enclosingConstructor.getName() + '$');
        }
        int iIndexOf = simpleName.indexOf(36, 0);
        if (iIndexOf == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iIndexOf + 1, simpleName.length());
        i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && p000a.a.v(this).equals(p000a.a.v((N0.b) obj));
    }

    public final int hashCode() {
        return p000a.a.v(this).hashCode();
    }

    public final String toString() {
        return this.f329a.toString() + " (Kotlin reflection is not available)";
    }
}
