package O0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f566a;

    public a(e eVar) {
        this.f566a = new AtomicReference(eVar);
    }

    @Override // O0.b
    public final Iterator iterator() {
        b bVar = (b) this.f566a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
