package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0090w extends AbstractC0069a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0090w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected d0 unknownFields;

    public AbstractC0090w() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = d0.f1492f;
    }

    public static AbstractC0090w f(Class cls) {
        AbstractC0090w abstractC0090w = defaultInstanceMap.get(cls);
        if (abstractC0090w == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0090w = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (abstractC0090w == null) {
            abstractC0090w = (AbstractC0090w) ((AbstractC0090w) j0.d(cls)).e(6);
            if (abstractC0090w == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0090w);
        }
        return abstractC0090w;
    }

    public static Object g(Method method, AbstractC0069a abstractC0069a, Object... objArr) {
        try {
            return method.invoke(abstractC0069a, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean h(AbstractC0090w abstractC0090w, boolean z2) {
        byte bByteValue = ((Byte) abstractC0090w.e(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        T t = T.f1459c;
        t.getClass();
        boolean zA = t.a(abstractC0090w.getClass()).a(abstractC0090w);
        if (z2) {
            abstractC0090w.e(2);
        }
        return zA;
    }

    public static void l(Class cls, AbstractC0090w abstractC0090w) {
        abstractC0090w.j();
        defaultInstanceMap.put(cls, abstractC0090w);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0069a
    public final int a(W w2) {
        int iF;
        int iF2;
        if (i()) {
            if (w2 == null) {
                T t = T.f1459c;
                t.getClass();
                iF2 = t.a(getClass()).f(this);
            } else {
                iF2 = w2.f(this);
            }
            if (iF2 >= 0) {
                return iF2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iF2);
        }
        int i2 = this.memoizedSerializedSize;
        if ((i2 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i2 & Integer.MAX_VALUE;
        }
        if (w2 == null) {
            T t2 = T.f1459c;
            t2.getClass();
            iF = t2.a(getClass()).f(this);
        } else {
            iF = w2.f(this);
        }
        m(iF);
        return iF;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0069a
    public final void b(C0081m c0081m) {
        T t = T.f1459c;
        t.getClass();
        W wA = t.a(getClass());
        F f2 = c0081m.f1538m;
        if (f2 == null) {
            f2 = new F(c0081m);
        }
        wA.d(this, f2);
    }

    public final void c() {
        this.memoizedHashCode = 0;
    }

    public final void d() {
        m(Integer.MAX_VALUE);
    }

    public abstract Object e(int i2);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        T t = T.f1459c;
        t.getClass();
        return t.a(getClass()).i(this, (AbstractC0090w) obj);
    }

    public final int hashCode() {
        if (i()) {
            T t = T.f1459c;
            t.getClass();
            return t.a(getClass()).e(this);
        }
        if (this.memoizedHashCode == 0) {
            T t2 = T.f1459c;
            t2.getClass();
            this.memoizedHashCode = t2.a(getClass()).e(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final AbstractC0090w k() {
        return (AbstractC0090w) e(4);
    }

    public final void m(int i2) {
        if (i2 >= 0) {
            this.memoizedSerializedSize = (i2 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i2);
        }
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = M.f1438a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        M.c(this, sb, 0);
        return sb.toString();
    }
}
