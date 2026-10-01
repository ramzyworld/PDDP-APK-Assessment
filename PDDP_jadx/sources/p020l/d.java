package p020l;

import a1.a;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f2819m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2820n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f2821o;

    public d(a aVar) {
        this.f2821o = aVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2820n) {
            return this.f2821o.f2807e != null;
        }
        c cVar = this.f2819m;
        return (cVar == null || cVar.f2817g == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2820n) {
            this.f2820n = false;
            this.f2819m = this.f2821o.f2807e;
        } else {
            c cVar = this.f2819m;
            this.f2819m = cVar != null ? cVar.f2817g : null;
        }
        return this.f2819m;
    }
}
