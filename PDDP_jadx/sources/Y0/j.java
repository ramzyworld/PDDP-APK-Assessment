package Y0;

import V0.v;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class j extends v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReferenceArray f1124i;

    public j(long j2, j jVar, int i2) {
        super(j2, jVar, i2);
        this.f1124i = new AtomicReferenceArray(i.f1123f);
    }

    @Override // V0.v
    public final int f() {
        return i.f1123f;
    }

    @Override // V0.v
    public final void g(int i2, z0.i iVar) {
        this.f1124i.set(i2, i.f1122e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f1014g + ", hashCode=" + hashCode() + ']';
    }
}
