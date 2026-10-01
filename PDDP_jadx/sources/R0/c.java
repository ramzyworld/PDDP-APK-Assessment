package R0;

import Q0.AbstractC0060s;
import Q0.B;
import Q0.C0061t;
import Q0.InterfaceC0066y;
import Q0.P;
import V0.p;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import z0.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0060s implements InterfaceC0066y {
    private volatile c _immediate;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f771j;

    public c(Handler handler, String str, boolean z2) {
        this.f768g = handler;
        this.f769h = str;
        this.f770i = z2;
        this._immediate = z2 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f771j = cVar;
    }

    @Override // Q0.AbstractC0060s
    public final void e(i iVar, Runnable runnable) {
        if (this.f768g.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        P p2 = (P) iVar.f(C0061t.f743f);
        if (p2 != null) {
            p2.a(cancellationException);
        }
        B.f673b.e(iVar, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f768g == this.f768g;
    }

    @Override // Q0.AbstractC0060s
    public final boolean g() {
        return (this.f770i && I0.i.a(Looper.myLooper(), this.f768g.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f768g);
    }

    @Override // Q0.AbstractC0060s
    public final String toString() {
        c cVar;
        String str;
        X0.d dVar = B.f672a;
        c cVar2 = p.f1007a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f771j;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f769h;
        if (string == null) {
            string = this.f768g.toString();
        }
        if (!this.f770i) {
            return string;
        }
        return string + ".immediate";
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
