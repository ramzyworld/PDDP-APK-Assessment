package p022m;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2842e;

    public d(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f2840c = i2;
        this.f2838a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f2838a.get(obj);
                if (obj2 != null) {
                    this.f2841d++;
                    return obj2;
                }
                this.f2842e++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f2839b++;
                objPut = this.f2838a.put(obj, obj2);
                if (objPut != null) {
                    this.f2839b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c(this.f2840c);
        return objPut;
    }

    public final void c(int i2) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f2839b < 0 || (this.f2838a.isEmpty() && this.f2839b != 0)) {
                        break;
                    }
                    if (this.f2839b > i2 && !this.f2838a.isEmpty()) {
                        Map.Entry entry = (Map.Entry) this.f2838a.entrySet().iterator().next();
                        Object key = entry.getKey();
                        entry.getValue();
                        this.f2838a.remove(key);
                        this.f2839b--;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        int i4;
        try {
            i2 = this.f2841d;
            i3 = this.f2842e;
            int i5 = i2 + i3;
            i4 = i5 != 0 ? (i2 * 100) / i5 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f2840c + ",hits=" + i2 + ",misses=" + i3 + ",hitRate=" + i4 + "%]";
    }
}
