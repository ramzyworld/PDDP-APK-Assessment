package I;

import androidx.datastore.preferences.protobuf.AbstractC0070b;
import androidx.datastore.preferences.protobuf.AbstractC0088u;
import androidx.datastore.preferences.protobuf.AbstractC0090w;
import androidx.datastore.preferences.protobuf.AbstractC0092y;
import androidx.datastore.preferences.protobuf.C0089v;
import androidx.datastore.preferences.protobuf.InterfaceC0091x;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.V;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0090w {
    private static final h DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0091x strings_ = U.f1462h;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC0090w.l(h.class, hVar);
    }

    public static void n(h hVar, Set set) {
        InterfaceC0091x interfaceC0091x = hVar.strings_;
        if (!((AbstractC0070b) interfaceC0091x).f1485e) {
            U u2 = (U) interfaceC0091x;
            int i2 = u2.f1464g;
            hVar.strings_ = u2.c(i2 == 0 ? 10 : i2 * 2);
        }
        RandomAccess randomAccess = hVar.strings_;
        Charset charset = AbstractC0092y.f1577a;
        set.getClass();
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((U) randomAccess).f1464g);
        }
        U u3 = (U) randomAccess;
        int i3 = u3.f1464g;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (u3.f1464g - i3) + " is null.";
                for (int i4 = u3.f1464g - 1; i4 >= i3; i4--) {
                    u3.remove(i4);
                }
                throw new NullPointerException(str);
            }
            u3.add(obj);
        }
    }

    public static h o() {
        return DEFAULT_INSTANCE;
    }

    public static g q() {
        return (g) ((AbstractC0088u) DEFAULT_INSTANCE.e(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0090w
    public final Object e(int i2) {
        switch (j.b(i2)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new h();
            case k.LONG_FIELD_NUMBER /* 4 */:
                return new g(DEFAULT_INSTANCE);
            case k.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                S c0089v = PARSER;
                if (c0089v == null) {
                    synchronized (h.class) {
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

    public final InterfaceC0091x p() {
        return this.strings_;
    }
}
