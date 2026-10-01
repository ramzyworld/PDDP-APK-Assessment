package p020l;

import a1.a;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f2812m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f2813n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2814o;

    public b(c cVar, c cVar2, int i2) {
        this.f2814o = i2;
        this.f2812m = cVar2;
        this.f2813n = cVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2813n != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        c cVar2 = this.f2813n;
        c cVar3 = this.f2812m;
        if (cVar2 != cVar3 && cVar3 != null) {
            switch (this.f2814o) {
                case 0:
                    cVar = cVar2.f2817g;
                    break;
                default:
                    cVar = cVar2.f2818h;
                    break;
            }
        } else {
            cVar = null;
        }
        this.f2813n = cVar;
        return cVar2;
    }
}
