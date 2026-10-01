package I;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0088u;
import androidx.datastore.preferences.protobuf.AbstractC0090w;
import androidx.datastore.preferences.protobuf.C0077i;
import androidx.datastore.preferences.protobuf.C0079k;
import androidx.datastore.preferences.protobuf.C0083o;
import androidx.datastore.preferences.protobuf.C0089v;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.W;
import androidx.datastore.preferences.protobuf.c0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0090w {
    private static final f DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private I preferences_ = I.f1434f;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0090w.l(f.class, fVar);
    }

    public static I n(f fVar) {
        I i2 = fVar.preferences_;
        if (!i2.f1435e) {
            fVar.preferences_ = i2.b();
        }
        return fVar.preferences_;
    }

    public static d p() {
        return (d) ((AbstractC0088u) DEFAULT_INSTANCE.e(5));
    }

    public static f q(FileInputStream fileInputStream) {
        f fVar = DEFAULT_INSTANCE;
        C0077i c0077i = new C0077i(fileInputStream);
        C0083o c0083oA = C0083o.a();
        AbstractC0090w abstractC0090wK = fVar.k();
        try {
            T t = T.f1459c;
            t.getClass();
            W wA = t.a(abstractC0090wK.getClass());
            C0079k c0079k = c0077i.f1523b;
            if (c0079k == null) {
                c0079k = new C0079k(c0077i);
            }
            wA.b(abstractC0090wK, c0079k, c0083oA);
            wA.h(abstractC0090wK);
            if (AbstractC0090w.h(abstractC0090wK, true)) {
                return (f) abstractC0090wK;
            }
            throw new A(new c0().getMessage());
        } catch (A e2) {
            if (e2.f1413e) {
                throw new A(e2.getMessage(), e2);
            }
            throw e2;
        } catch (c0 e3) {
            throw new A(e3.getMessage());
        } catch (IOException e4) {
            if (e4.getCause() instanceof A) {
                throw ((A) e4.getCause());
            }
            throw new A(e4.getMessage(), e4);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof A) {
                throw ((A) e5.getCause());
            }
            throw e5;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0090w
    public final Object e(int i2) {
        switch (j.b(i2)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f315a});
            case 3:
                return new f();
            case k.LONG_FIELD_NUMBER /* 4 */:
                return new d(DEFAULT_INSTANCE);
            case k.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                S c0089v = PARSER;
                if (c0089v == null) {
                    synchronized (f.class) {
                        try {
                            c0089v = PARSER;
                            if (c0089v == null) {
                                c0089v = new C0089v();
                                PARSER = c0089v;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return c0089v;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
