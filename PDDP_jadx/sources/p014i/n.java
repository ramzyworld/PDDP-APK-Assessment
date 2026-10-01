package p014i;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.deeprf.pddp.R;
import java.lang.reflect.Field;
import p042y.x;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f2125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f2128e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o f2131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l f2132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m f2133j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2129f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m f2134k = new m(this);

    public n(int i2, Context context, View view, j jVar, boolean z2) {
        this.f2124a = context;
        this.f2125b = jVar;
        this.f2128e = view;
        this.f2126c = z2;
        this.f2127d = i2;
    }

    public final l a() {
        l sVar;
        if (this.f2132i == null) {
            Context context = this.f2124a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                sVar = new g(context, this.f2128e, this.f2127d, this.f2126c);
            } else {
                View view = this.f2128e;
                Context context2 = this.f2124a;
                boolean z2 = this.f2126c;
                sVar = new s(this.f2127d, context2, view, this.f2125b, z2);
            }
            sVar.l(this.f2125b);
            sVar.r(this.f2134k);
            sVar.n(this.f2128e);
            sVar.f(this.f2131h);
            sVar.o(this.f2130g);
            sVar.p(this.f2129f);
            this.f2132i = sVar;
        }
        return this.f2132i;
    }

    public final boolean b() {
        l lVar = this.f2132i;
        return lVar != null && lVar.j();
    }

    public void c() {
        this.f2132i = null;
        m mVar = this.f2133j;
        if (mVar != null) {
            mVar.onDismiss();
        }
    }

    public final void d(int i2, int i3, boolean z2, boolean z3) {
        l lVarA = a();
        lVarA.s(z3);
        if (z2) {
            int i4 = this.f2129f;
            View view = this.f2128e;
            Field field = x.f3474a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f2128e.getWidth();
            }
            lVarA.q(i2);
            lVarA.t(i3);
            int i5 = (int) ((this.f2124a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            lVarA.f2122e = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        lVarA.c();
    }
}
