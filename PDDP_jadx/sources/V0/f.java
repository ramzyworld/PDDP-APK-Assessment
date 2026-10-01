package V0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f980a;

    static {
        try {
            Iterator it = Arrays.asList(new R0.b()).iterator();
            I0.i.e(it, "<this>");
            f980a = O0.c.S(new O0.a(new O0.e(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
