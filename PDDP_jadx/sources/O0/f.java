package O0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterator, J0.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Iterator f568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f569f;

    public f(g gVar) {
        this.f569f = gVar;
        this.f568e = new P0.a(gVar.f570a);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f568e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f569f.f571b.j(this.f568e.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
