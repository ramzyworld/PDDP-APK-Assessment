package I0;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements N0.a, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient N0.a f320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f325j;

    public c(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f321f = obj;
        this.f322g = cls;
        this.f323h = str;
        this.f324i = str2;
        this.f325j = z2;
    }

    public abstract N0.a a();

    public final d b() {
        Class cls = this.f322g;
        if (!this.f325j) {
            return q.a(cls);
        }
        q.f339a.getClass();
        return new k(cls);
    }
}
