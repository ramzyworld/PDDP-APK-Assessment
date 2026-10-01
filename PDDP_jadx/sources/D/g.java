package D;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.lang.reflect.Field;
import p016j.A;
import p042y.x;

/* JADX INFO: loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f25r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f26a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f27b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListView f28c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f29d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f30e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f31f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f32g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f33h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f34i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f35j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f36k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f37l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f38m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f39n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f40o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f41p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final A f42q;

    public g(A a2) {
        a aVar = new a();
        aVar.f17e = Long.MIN_VALUE;
        aVar.f19g = -1L;
        aVar.f18f = 0L;
        this.f26a = aVar;
        this.f27b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f30e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f31f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f34i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f35j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f36k = fArr5;
        this.f28c = a2;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f32g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f33h = f25r;
        aVar.f13a = 500;
        aVar.f14b = 500;
        this.f42q = a2;
    }

    public static float b(float f2, float f3, float f4) {
        if (f2 > f4) {
            return f4;
        }
        return f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    public final float a(int i2, float f2, float f3, float f4) {
        float fB;
        float interpolation;
        float fB2 = b(this.f30e[i2] * f3, 0.0f, this.f31f[i2]);
        float fC = c(f3 - f2, fB2) - c(f2, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f27b;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f5 = this.f34i[i2];
            float f6 = this.f35j[i2];
            float f7 = this.f36k[i2];
            float f8 = f5 * f4;
            return fB > 0.0f ? b(fB * f8, f6, f7) : -b((-fB) * f8, f6, f7);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f9 = this.f34i[i2];
        float f10 = this.f35j[i2];
        float f11 = this.f36k[i2];
        float f12 = f9 * f4;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f32g;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f40o && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    public final void d() {
        int i2 = 0;
        if (this.f38m) {
            this.f40o = false;
            return;
        }
        a aVar = this.f26a;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (jCurrentAnimationTimeMillis - aVar.f17e);
        int i4 = aVar.f14b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        aVar.f21i = i2;
        aVar.f20h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f19g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        A a2;
        int count;
        a aVar = this.f26a;
        float f2 = aVar.f16d;
        int iAbs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f15c);
        if (iAbs == 0 || (count = (a2 = this.f42q).getCount()) == 0) {
            return false;
        }
        int childCount = a2.getChildCount();
        int firstVisiblePosition = a2.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i2 >= count && a2.getChildAt(childCount - 1).getBottom() <= a2.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && a2.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i2;
        int i3 = 0;
        if (!this.f41p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                d();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    d();
                }
            }
            return false;
        }
        this.f39n = true;
        this.f37l = false;
        float x2 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f28c;
        float fA = a(0, x2, width, listView.getWidth());
        float fA2 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
        a aVar = this.f26a;
        aVar.f15c = fA;
        aVar.f16d = fA2;
        if (!this.f40o && e()) {
            if (this.f29d == null) {
                this.f29d = new b(i3, this);
            }
            this.f40o = true;
            this.f38m = true;
            if (this.f37l || (i2 = this.f33h) <= 0) {
                this.f29d.run();
            } else {
                b bVar = this.f29d;
                long j2 = i2;
                Field field = x.f3474a;
                listView.postOnAnimationDelayed(bVar, j2);
            }
            this.f37l = true;
        }
        return false;
    }
}
