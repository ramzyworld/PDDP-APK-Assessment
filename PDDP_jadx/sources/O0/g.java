package O0;

import G.M;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P0.b f570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f571b;

    public g(P0.b bVar, M m2) {
        this.f570a = bVar;
        this.f571b = m2;
    }

    @Override // O0.b
    public final Iterator iterator() {
        return new f(this);
    }
}
