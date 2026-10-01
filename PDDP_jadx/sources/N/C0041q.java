package N;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: N.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0041q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f545b;

    public C0041q(x xVar, int i2) {
        this.f545b = i2;
        new Rect();
        this.f544a = xVar;
    }

    public static C0041q a(x xVar, int i2) {
        if (i2 == 0) {
            return new C0041q(xVar, 0);
        }
        if (i2 == 1) {
            return new C0041q(xVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public final int b(View view) {
        switch (this.f545b) {
            case 0:
                y yVar = (y) view.getLayoutParams();
                this.f544a.getClass();
                return view.getRight() + ((y) view.getLayoutParams()).f559a.right + ((ViewGroup.MarginLayoutParams) yVar).rightMargin;
            default:
                y yVar2 = (y) view.getLayoutParams();
                this.f544a.getClass();
                return view.getBottom() + ((y) view.getLayoutParams()).f559a.bottom + ((ViewGroup.MarginLayoutParams) yVar2).bottomMargin;
        }
    }

    public final int c(View view) {
        switch (this.f545b) {
            case 0:
                y yVar = (y) view.getLayoutParams();
                this.f544a.getClass();
                return (view.getLeft() - ((y) view.getLayoutParams()).f559a.left) - ((ViewGroup.MarginLayoutParams) yVar).leftMargin;
            default:
                y yVar2 = (y) view.getLayoutParams();
                this.f544a.getClass();
                return (view.getTop() - ((y) view.getLayoutParams()).f559a.top) - ((ViewGroup.MarginLayoutParams) yVar2).topMargin;
        }
    }

    public final int d() {
        switch (this.f545b) {
            case 0:
                x xVar = this.f544a;
                return xVar.f557f - xVar.t();
            default:
                x xVar2 = this.f544a;
                return xVar2.f558g - xVar2.r();
        }
    }

    public final int e() {
        switch (this.f545b) {
            case 0:
                return this.f544a.s();
            default:
                return this.f544a.u();
        }
    }
}
