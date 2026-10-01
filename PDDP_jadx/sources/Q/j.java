package Q;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class j extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p029q.d f608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p029q.d f610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f613i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f614j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f615k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint.Cap f616l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint.Join f617m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f618n;

    @Override // Q.l
    public final boolean a() {
        return this.f610f.b() || this.f608d.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // Q.l
    public final boolean b(int[] iArr) {
        boolean z2;
        p029q.d dVar = this.f610f;
        boolean z3 = false;
        if (dVar.b()) {
            ColorStateList colorStateList = dVar.f2989b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar.f2990c) {
                dVar.f2990c = colorForState;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        p029q.d dVar2 = this.f608d;
        if (dVar2.b()) {
            ColorStateList colorStateList2 = dVar2.f2989b;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != dVar2.f2990c) {
                dVar2.f2990c = colorForState2;
                z3 = true;
            }
        }
        return z2 | z3;
    }

    public float getFillAlpha() {
        return this.f612h;
    }

    public int getFillColor() {
        return this.f610f.f2990c;
    }

    public float getStrokeAlpha() {
        return this.f611g;
    }

    public int getStrokeColor() {
        return this.f608d.f2990c;
    }

    public float getStrokeWidth() {
        return this.f609e;
    }

    public float getTrimPathEnd() {
        return this.f614j;
    }

    public float getTrimPathOffset() {
        return this.f615k;
    }

    public float getTrimPathStart() {
        return this.f613i;
    }

    public void setFillAlpha(float f2) {
        this.f612h = f2;
    }

    public void setFillColor(int i2) {
        this.f610f.f2990c = i2;
    }

    public void setStrokeAlpha(float f2) {
        this.f611g = f2;
    }

    public void setStrokeColor(int i2) {
        this.f608d.f2990c = i2;
    }

    public void setStrokeWidth(float f2) {
        this.f609e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f614j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f615k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.f613i = f2;
    }
}
