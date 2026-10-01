package p013h0;

import android.util.SparseArray;
import io.flutter.plugin.platform.o;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f1977a;

    public a(c cVar) {
        this.f1977a = cVar;
    }

    @Override // p013h0.b
    public final void a() {
        c cVar = this.f1977a;
        Iterator it = cVar.f1996s.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        while (true) {
            o oVar = cVar.f1995r;
            SparseArray sparseArray = oVar.f2352k;
            if (sparseArray.size() <= 0) {
                cVar.f1988k.f2947b = null;
                return;
            } else {
                oVar.f2362v.e(sparseArray.keyAt(0));
            }
        }
    }

    @Override // p013h0.b
    public final void b() {
    }
}
