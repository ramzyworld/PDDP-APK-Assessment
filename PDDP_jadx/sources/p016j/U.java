package p016j;

import E.c;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class U implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SearchView f2611f;

    public /* synthetic */ U(SearchView searchView, int i2) {
        this.f2610e = i2;
        this.f2611f = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2610e) {
            case 0:
                this.f2611f.q();
                break;
            default:
                c cVar = this.f2611f.f1261S;
                if (cVar instanceof f0) {
                    cVar.b(null);
                }
                break;
        }
    }
}
