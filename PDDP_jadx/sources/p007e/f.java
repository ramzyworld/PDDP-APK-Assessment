package p007e;

import D.b;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import p033s.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f1812q = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f1813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f1814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f1815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f1816h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1817i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1818j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1819k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1820l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f1821m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f1822n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1823o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Q.b f1824p;

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void a(boolean z2) {
        boolean z3;
        Drawable drawable;
        long j2;
        boolean z4 = true;
        this.f1818j = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f1815g;
        if (drawable2 != null) {
            long j3 = this.f1822n;
            if (j3 != 0) {
                if (j3 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f1817i);
                    this.f1822n = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j3 - jUptimeMillis) * 255)) / this.f1813e.f1799y)) * this.f1817i) / 255);
                    z3 = true;
                }
            }
            drawable = this.f1816h;
            if (drawable != null) {
                j2 = this.f1823o;
                if (j2 == 0) {
                    if (j2 <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f1816h = null;
                        this.f1823o = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j2 - jUptimeMillis) * 255)) / this.f1813e.f1800z) * this.f1817i) / 255);
                    }
                }
                if (z2 || !z4) {
                }
                scheduleSelf(this.f1821m, jUptimeMillis + 16);
                return;
            }
            this.f1823o = 0L;
            z4 = z3;
            if (z2) {
            }
        }
        this.f1822n = 0L;
        z3 = false;
        drawable = this.f1816h;
        if (drawable != null) {
            j2 = this.f1823o;
            if (j2 == 0) {
                if (j2 <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f1816h = null;
                    this.f1823o = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j2 - jUptimeMillis) * 255)) / this.f1813e.f1800z) * this.f1817i) / 255);
                }
            }
            if (z2) {
            }
        }
        this.f1823o = 0L;
        z4 = z3;
        if (z2) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        b bVar = this.f1813e;
        if (theme == null) {
            bVar.getClass();
            return;
        }
        bVar.c();
        int i2 = bVar.f1783h;
        Drawable[] drawableArr = bVar.f1782g;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i3].applyTheme(theme);
                bVar.f1780e |= drawableArr[i3].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            bVar.f1777b = resources;
            int i4 = resources.getDisplayMetrics().densityDpi;
            if (i4 == 0) {
                i4 = 160;
            }
            int i5 = bVar.f1778c;
            bVar.f1778c = i4;
            if (i5 != i4) {
                bVar.f1788m = false;
                bVar.f1785j = false;
            }
        }
    }

    public final void b(Drawable drawable) {
        if (this.f1824p == null) {
            this.f1824p = new Q.b();
        }
        Q.b bVar = this.f1824p;
        bVar.f596f = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f1813e.f1799y <= 0 && this.f1818j) {
                drawable.setAlpha(this.f1817i);
            }
            b bVar2 = this.f1813e;
            if (bVar2.f1768C) {
                drawable.setColorFilter(bVar2.f1767B);
            } else {
                if (bVar2.f1771F) {
                    a.h(drawable, bVar2.f1769D);
                }
                b bVar3 = this.f1813e;
                if (bVar3.f1772G) {
                    a.i(drawable, bVar3.f1770E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f1813e.f1797w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            drawable.setAutoMirrored(this.f1813e.f1766A);
            Rect rect = this.f1814f;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            Q.b bVar4 = this.f1824p;
            Drawable.Callback callback = (Drawable.Callback) bVar4.f596f;
            bVar4.f596f = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    public final boolean c(int i2) {
        if (i2 == this.f1819k) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f1813e.f1800z > 0) {
            Drawable drawable = this.f1816h;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f1815g;
            if (drawable2 != null) {
                this.f1816h = drawable2;
                this.f1823o = ((long) this.f1813e.f1800z) + jUptimeMillis;
            } else {
                this.f1816h = null;
                this.f1823o = 0L;
            }
        } else {
            Drawable drawable3 = this.f1815g;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i2 >= 0) {
            b bVar = this.f1813e;
            if (i2 < bVar.f1783h) {
                Drawable drawableD = bVar.d(i2);
                this.f1815g = drawableD;
                this.f1819k = i2;
                if (drawableD != null) {
                    int i3 = this.f1813e.f1799y;
                    if (i3 > 0) {
                        this.f1822n = jUptimeMillis + ((long) i3);
                    }
                    b(drawableD);
                }
            } else {
                this.f1815g = null;
                this.f1819k = -1;
            }
        } else {
            this.f1815g = null;
            this.f1819k = -1;
        }
        if (this.f1822n != 0 || this.f1823o != 0) {
            b bVar2 = this.f1821m;
            if (bVar2 == null) {
                this.f1821m = new b(4, (e) this);
            } else {
                unscheduleSelf(bVar2);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f1813e.canApplyTheme();
    }

    public abstract void d(b bVar);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f1815g;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f1816h;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f1817i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f1813e.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z2;
        b bVar = this.f1813e;
        synchronized (bVar) {
            if (!bVar.f1795u) {
                bVar.c();
                z2 = true;
                bVar.f1795u = true;
                int i2 = bVar.f1783h;
                Drawable[] drawableArr = bVar.f1782g;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        bVar.f1796v = true;
                        break;
                    }
                    if (drawableArr[i3].getConstantState() == null) {
                        bVar.f1796v = false;
                        z2 = false;
                        break;
                    }
                    i3++;
                }
            } else {
                z2 = bVar.f1796v;
            }
        }
        if (!z2) {
            return null;
        }
        this.f1813e.f1779d = getChangingConfigurations();
        return this.f1813e;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f1815g;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f1814f;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b bVar = this.f1813e;
        if (bVar.f1787l) {
            if (!bVar.f1788m) {
                bVar.b();
            }
            return bVar.f1790o;
        }
        Drawable drawable = this.f1815g;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b bVar = this.f1813e;
        if (bVar.f1787l) {
            if (!bVar.f1788m) {
                bVar.b();
            }
            return bVar.f1789n;
        }
        Drawable drawable = this.f1815g;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        b bVar = this.f1813e;
        if (bVar.f1787l) {
            if (!bVar.f1788m) {
                bVar.b();
            }
            return bVar.f1792q;
        }
        Drawable drawable = this.f1815g;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        b bVar = this.f1813e;
        if (bVar.f1787l) {
            if (!bVar.f1788m) {
                bVar.b();
            }
            return bVar.f1791p;
        }
        Drawable drawable = this.f1815g;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1815g;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        b bVar = this.f1813e;
        if (bVar.f1793r) {
            return bVar.f1794s;
        }
        bVar.c();
        int i2 = bVar.f1783h;
        Drawable[] drawableArr = bVar.f1782g;
        int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i3 = 1; i3 < i2; i3++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
        }
        bVar.f1794s = opacity;
        bVar.f1793r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f1815g;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        b bVar = this.f1813e;
        boolean padding = false;
        Rect rect2 = null;
        if (!bVar.f1784i) {
            Rect rect3 = bVar.f1786k;
            if (rect3 != null || bVar.f1785j) {
                rect2 = rect3;
            } else {
                bVar.c();
                Rect rect4 = new Rect();
                int i2 = bVar.f1783h;
                Drawable[] drawableArr = bVar.f1782g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i4 = rect4.left;
                        if (i4 > rect2.left) {
                            rect2.left = i4;
                        }
                        int i5 = rect4.top;
                        if (i5 > rect2.top) {
                            rect2.top = i5;
                        }
                        int i6 = rect4.right;
                        if (i6 > rect2.right) {
                            rect2.right = i6;
                        }
                        int i7 = rect4.bottom;
                        if (i7 > rect2.bottom) {
                            rect2.bottom = i7;
                        }
                    }
                }
                bVar.f1785j = true;
                bVar.f1786k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f1815g;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f1813e.f1766A && a1.a.o(this) == 1) {
            int i8 = rect.left;
            rect.left = rect.right;
            rect.right = i8;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f1813e;
        if (bVar != null) {
            bVar.f1793r = false;
            bVar.t = false;
        }
        if (drawable != this.f1815g || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f1813e.f1766A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z2;
        Drawable drawable = this.f1816h;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f1816h = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f1815g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f1818j) {
                this.f1815g.setAlpha(this.f1817i);
            }
        }
        if (this.f1823o != 0) {
            this.f1823o = 0L;
            z2 = true;
        }
        if (this.f1822n != 0) {
            this.f1822n = 0L;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f1820l && super.mutate() == this) {
            e eVar = (e) this;
            b bVar = new b(eVar.t, eVar, null);
            bVar.f1774I = bVar.f1774I.clone();
            bVar.f1775J = bVar.f1775J.clone();
            d(bVar);
            this.f1820l = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1816h;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f1815g;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        b bVar = this.f1813e;
        int i3 = this.f1819k;
        int i4 = bVar.f1783h;
        Drawable[] drawableArr = bVar.f1782g;
        boolean z2 = false;
        for (int i5 = 0; i5 < i4; i5++) {
            Drawable drawable = drawableArr[i5];
            if (drawable != null) {
                boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawable.setLayoutDirection(i2) : false;
                if (i5 == i3) {
                    z2 = layoutDirection;
                }
            }
        }
        bVar.f1798x = i2;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.f1816h;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f1815g;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable != this.f1815g || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.f1818j && this.f1817i == i2) {
            return;
        }
        this.f1818j = true;
        this.f1817i = i2;
        Drawable drawable = this.f1815g;
        if (drawable != null) {
            if (this.f1822n == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        b bVar = this.f1813e;
        if (bVar.f1766A != z2) {
            bVar.f1766A = z2;
            Drawable drawable = this.f1815g;
            if (drawable != null) {
                drawable.setAutoMirrored(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f1813e;
        bVar.f1768C = true;
        if (bVar.f1767B != colorFilter) {
            bVar.f1767B = colorFilter;
            Drawable drawable = this.f1815g;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        b bVar = this.f1813e;
        if (bVar.f1797w != z2) {
            bVar.f1797w = z2;
            Drawable drawable = this.f1815g;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f3) {
        Drawable drawable = this.f1815g;
        if (drawable != null) {
            a.e(drawable, f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f1814f;
        if (rect == null) {
            this.f1814f = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f1815g;
        if (drawable != null) {
            a.f(drawable, i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f1813e;
        bVar.f1771F = true;
        if (bVar.f1769D != colorStateList) {
            bVar.f1769D = colorStateList;
            a.h(this.f1815g, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f1813e;
        bVar.f1772G = true;
        if (bVar.f1770E != mode) {
            bVar.f1770E = mode;
            a.i(this.f1815g, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.f1816h;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f1815g;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f1815g || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
