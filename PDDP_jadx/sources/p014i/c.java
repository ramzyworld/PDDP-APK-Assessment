package p014i;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p016j.M;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f2035f;

    public /* synthetic */ c(l lVar, int i2) {
        this.f2034e = i2;
        this.f2035f = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2034e) {
            case 0:
                g gVar = (g) this.f2035f;
                if (gVar.j()) {
                    ArrayList arrayList = gVar.f2055l;
                    if (arrayList.size() > 0 && !((f) arrayList.get(0)).f2042a.f2583y) {
                        View view = gVar.f2062s;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((f) it.next()).f2042a.c();
                            }
                        } else {
                            gVar.dismiss();
                        }
                        break;
                    }
                }
                break;
            default:
                s sVar = (s) this.f2035f;
                if (sVar.j()) {
                    M m2 = sVar.f2141l;
                    if (!m2.f2583y) {
                        View view2 = sVar.f2146q;
                        if (view2 != null && view2.isShown()) {
                            m2.c();
                        } else {
                            sVar.dismiss();
                        }
                    }
                }
                break;
        }
    }
}
