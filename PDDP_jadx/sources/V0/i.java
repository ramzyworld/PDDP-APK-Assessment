package V0;

import Q0.AbstractC0063v;
import android.graphics.Typeface;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import java.lang.ref.WeakReference;
import p016j.C0109f;
import p016j.C0112i;
import p016j.C0121s;
import p016j.C0122t;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f989g;

    public /* synthetic */ i(int i2, Object obj, Object obj2) {
        this.f987e = i2;
        this.f989g = obj;
        this.f988f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar;
        D.j jVar2;
        switch (this.f987e) {
            case 0:
                int i2 = 0;
                do {
                    try {
                        ((Runnable) this.f988f).run();
                    } catch (Throwable th) {
                        AbstractC0063v.d(th, z0.j.f3504e);
                    }
                    jVar = (j) this.f989g;
                    Runnable runnableI = jVar.i();
                    if (runnableI != null) {
                        this.f988f = runnableI;
                        i2++;
                    }
                    break;
                } while (i2 < 16);
                X0.l lVar = jVar.f991g;
                lVar.getClass();
                lVar.e(jVar, this);
                break;
            case 1:
                C0112i c0112i = (C0112i) this.f989g;
                p014i.j jVar3 = c0112i.f2661g;
                if (jVar3 != null && (jVar2 = jVar3.f2080e) != null) {
                    ((ActionMenuView) jVar2.f44f).getClass();
                }
                ActionMenuView actionMenuView = c0112i.f2665k;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    C0109f c0109f = (C0109f) this.f988f;
                    if (c0109f.b()) {
                        c0112i.f2675v = c0109f;
                    } else if (c0109f.f2128e != null) {
                        c0109f.d(0, 0, false, false);
                        c0112i.f2675v = c0109f;
                    }
                }
                c0112i.f2677x = null;
                break;
            case 2:
                C0122t c0122t = (C0122t) ((WeakReference) this.f988f).get();
                if (c0122t != null && c0122t.f2757m) {
                    TextView textView = c0122t.f2745a;
                    Typeface typeface = (Typeface) this.f989g;
                    textView.setTypeface(typeface);
                    c0122t.f2756l = typeface;
                }
                break;
            case 3:
                C0121s c0121s = (C0121s) ((p028p0.b) this.f988f).f2896f;
                if (c0121s != null) {
                    c0121s.b((Typeface) this.f989g);
                }
                break;
            default:
                ((p038v.f) this.f988f).accept(this.f989g);
                break;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, int i2, boolean z2) {
        this.f987e = i2;
        this.f988f = obj;
        this.f989g = obj2;
    }
}
