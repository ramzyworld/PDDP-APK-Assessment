package N;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: N.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0032h {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f495x = {R.attr.state_pressed};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f496y = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StateListDrawable f498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable f499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StateListDrawable f502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Drawable f503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f505i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f506j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f507k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RecyclerView f510n;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ValueAnimator f516u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f517v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final D.b f518w;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f508l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f509m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f511o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f512p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f513q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f514r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f515s = new int[2];
    public final int[] t = new int[2];

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public C0032h(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f516u = valueAnimatorOfFloat;
        this.f517v = 0;
        D.b bVar = new D.b(1 == true ? 1 : 0, this);
        this.f518w = bVar;
        C0029e c0029e = new C0029e();
        this.f498b = stateListDrawable;
        this.f499c = drawable;
        this.f502f = stateListDrawable2;
        this.f503g = drawable2;
        this.f500d = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f501e = Math.max(i2, drawable.getIntrinsicWidth());
        this.f504h = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f505i = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f497a = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C0030f(this));
        valueAnimatorOfFloat.addUpdateListener(new C0031g(this));
        RecyclerView recyclerView2 = this.f510n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            x xVar = recyclerView2.f1684m;
            if (xVar != null) {
                xVar.a("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1685n;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f510n;
            recyclerView3.f1686o.remove(this);
            if (recyclerView3.f1687p == this) {
                recyclerView3.f1687p = null;
            }
            ArrayList arrayList2 = this.f510n.f1668c0;
            if (arrayList2 != null) {
                arrayList2.remove(c0029e);
            }
            this.f510n.removeCallbacks(bVar);
        }
        this.f510n = recyclerView;
        if (recyclerView != null) {
            x xVar2 = recyclerView.f1684m;
            if (xVar2 != null) {
                xVar2.a("Cannot add item decoration during a scroll  or layout");
            }
            ArrayList arrayList3 = recyclerView.f1685n;
            if (arrayList3.isEmpty()) {
                recyclerView.setWillNotDraw(false);
            }
            arrayList3.add(this);
            recyclerView.m();
            recyclerView.requestLayout();
            this.f510n.f1686o.add(this);
            RecyclerView recyclerView4 = this.f510n;
            if (recyclerView4.f1668c0 == null) {
                recyclerView4.f1668c0 = new ArrayList();
            }
            recyclerView4.f1668c0.add(c0029e);
        }
    }

    public static int d(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / i5) * i6);
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    public final boolean a(float f2, float f3) {
        return f3 >= ((float) (this.f509m - this.f504h)) && f2 >= ((float) (0 - (0 / 2))) && f2 <= ((float) ((0 / 2) + 0));
    }

    public final boolean b(float f2, float f3) {
        RecyclerView recyclerView = this.f510n;
        Field field = p042y.x.f3474a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i2 = this.f500d;
        if (z2) {
            if (f2 > i2 / 2) {
                return false;
            }
        } else if (f2 < this.f508l - i2) {
            return false;
        }
        int i3 = 0 / 2;
        return f3 >= ((float) (0 - i3)) && f3 <= ((float) (i3 + 0));
    }

    public final boolean c(MotionEvent motionEvent) {
        int i2 = this.f513q;
        if (i2 == 1) {
            boolean zB = b(motionEvent.getX(), motionEvent.getY());
            boolean zA = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zB && !zA) {
                return false;
            }
            if (zA) {
                this.f514r = 1;
                this.f507k = (int) motionEvent.getX();
            } else if (zB) {
                this.f514r = 2;
                this.f506j = (int) motionEvent.getY();
            }
            e(2);
        } else if (i2 != 2) {
            return false;
        }
        return true;
    }

    public final void e(int i2) {
        D.b bVar = this.f518w;
        StateListDrawable stateListDrawable = this.f498b;
        if (i2 == 2 && this.f513q != 2) {
            stateListDrawable.setState(f495x);
            this.f510n.removeCallbacks(bVar);
        }
        if (i2 == 0) {
            this.f510n.invalidate();
        } else {
            f();
        }
        if (this.f513q == 2 && i2 != 2) {
            stateListDrawable.setState(f496y);
            this.f510n.removeCallbacks(bVar);
            this.f510n.postDelayed(bVar, 1200);
        } else if (i2 == 1) {
            this.f510n.removeCallbacks(bVar);
            this.f510n.postDelayed(bVar, 1500);
        }
        this.f513q = i2;
    }

    public final void f() {
        int i2 = this.f517v;
        ValueAnimator valueAnimator = this.f516u;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f517v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
