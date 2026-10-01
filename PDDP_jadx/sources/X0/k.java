package X0;

import V0.AbstractC0068a;
import V0.x;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f1055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f1056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f1057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f1058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f1059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f1060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f1061h;

    static {
        String property;
        int i2 = x.f1016a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f1054a = property;
        f1055b = AbstractC0068a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i3 = x.f1016a;
        if (i3 < 2) {
            i3 = 2;
        }
        f1056c = AbstractC0068a.k("kotlinx.coroutines.scheduler.core.pool.size", i3, 1, 0, 8);
        f1057d = AbstractC0068a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f1058e = TimeUnit.SECONDS.toNanos(AbstractC0068a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f1059f = f.f1048a;
        f1060g = new i(0);
        f1061h = new i(1);
    }
}
