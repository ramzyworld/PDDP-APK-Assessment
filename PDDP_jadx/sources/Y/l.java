package Y;

import android.graphics.Rect;
import p042y.O;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V.b f1098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f1099b;

    public l(V.b bVar, O o2) {
        I0.i.e(o2, "_windowInsetsCompat");
        this.f1098a = bVar;
        this.f1099b = o2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        I0.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        l lVar = (l) obj;
        return I0.i.a(this.f1098a, lVar.f1098a) && I0.i.a(this.f1099b, lVar.f1099b);
    }

    public final int hashCode() {
        return this.f1099b.hashCode() + (this.f1098a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f1098a + ", windowInsetsCompat=" + this.f1099b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Rect rect, O o2) {
        this(new V.b(rect), o2);
        I0.i.e(o2, "insets");
    }
}
