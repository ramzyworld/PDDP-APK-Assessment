package p007e;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;
import p022m.c;
import p022m.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable.ConstantState {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f1766A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ColorFilter f1767B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f1768C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ColorStateList f1769D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public PorterDuff.Mode f1770E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f1771F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f1772G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int[][] f1773H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public c f1774I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public j f1775J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f1776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources f1777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray f1781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable[] f1782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f1786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1790o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1792q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1793r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1794s;
    public boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1795u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1796v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1797w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1798x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1799y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1800z;

    public b(b bVar, e eVar, Resources resources) {
        this.f1778c = 160;
        this.f1784i = false;
        this.f1787l = false;
        this.f1797w = true;
        this.f1799y = 0;
        this.f1800z = 0;
        this.f1776a = eVar;
        this.f1777b = resources != null ? resources : bVar != null ? bVar.f1777b : null;
        int i2 = bVar != null ? bVar.f1778c : 0;
        int i3 = f.f1812q;
        i2 = resources != null ? resources.getDisplayMetrics().densityDpi : i2;
        int i4 = i2 != 0 ? i2 : 160;
        this.f1778c = i4;
        if (bVar != null) {
            this.f1779d = bVar.f1779d;
            this.f1780e = bVar.f1780e;
            this.f1795u = true;
            this.f1796v = true;
            this.f1784i = bVar.f1784i;
            this.f1787l = bVar.f1787l;
            this.f1797w = bVar.f1797w;
            this.f1798x = bVar.f1798x;
            this.f1799y = bVar.f1799y;
            this.f1800z = bVar.f1800z;
            this.f1766A = bVar.f1766A;
            this.f1767B = bVar.f1767B;
            this.f1768C = bVar.f1768C;
            this.f1769D = bVar.f1769D;
            this.f1770E = bVar.f1770E;
            this.f1771F = bVar.f1771F;
            this.f1772G = bVar.f1772G;
            if (bVar.f1778c == i4) {
                if (bVar.f1785j) {
                    this.f1786k = new Rect(bVar.f1786k);
                    this.f1785j = true;
                }
                if (bVar.f1788m) {
                    this.f1789n = bVar.f1789n;
                    this.f1790o = bVar.f1790o;
                    this.f1791p = bVar.f1791p;
                    this.f1792q = bVar.f1792q;
                    this.f1788m = true;
                }
            }
            if (bVar.f1793r) {
                this.f1794s = bVar.f1794s;
                this.f1793r = true;
            }
            if (bVar.t) {
                this.t = true;
            }
            Drawable[] drawableArr = bVar.f1782g;
            this.f1782g = new Drawable[drawableArr.length];
            this.f1783h = bVar.f1783h;
            SparseArray sparseArray = bVar.f1781f;
            if (sparseArray != null) {
                this.f1781f = sparseArray.clone();
            } else {
                this.f1781f = new SparseArray(this.f1783h);
            }
            int i5 = this.f1783h;
            for (int i6 = 0; i6 < i5; i6++) {
                Drawable drawable = drawableArr[i6];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f1781f.put(i6, constantState);
                    } else {
                        this.f1782g[i6] = drawableArr[i6];
                    }
                }
            }
        } else {
            this.f1782g = new Drawable[10];
            this.f1783h = 0;
        }
        if (bVar != null) {
            this.f1773H = bVar.f1773H;
        } else {
            this.f1773H = new int[this.f1782g.length][];
        }
        if (bVar != null) {
            this.f1774I = bVar.f1774I;
            this.f1775J = bVar.f1775J;
        } else {
            this.f1774I = new c();
            this.f1775J = new j();
        }
    }

    public final int a(Drawable drawable) {
        int i2 = this.f1783h;
        if (i2 >= this.f1782g.length) {
            int i3 = i2 + 10;
            Drawable[] drawableArr = new Drawable[i3];
            System.arraycopy(this.f1782g, 0, drawableArr, 0, i2);
            this.f1782g = drawableArr;
            int[][] iArr = new int[i3][];
            System.arraycopy(this.f1773H, 0, iArr, 0, i2);
            this.f1773H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f1776a);
        this.f1782g[i2] = drawable;
        this.f1783h++;
        this.f1780e = drawable.getChangingConfigurations() | this.f1780e;
        this.f1793r = false;
        this.t = false;
        this.f1786k = null;
        this.f1785j = false;
        this.f1788m = false;
        this.f1795u = false;
        return i2;
    }

    public final void b() {
        this.f1788m = true;
        c();
        int i2 = this.f1783h;
        Drawable[] drawableArr = this.f1782g;
        this.f1790o = -1;
        this.f1789n = -1;
        this.f1792q = 0;
        this.f1791p = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f1789n) {
                this.f1789n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f1790o) {
                this.f1790o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f1791p) {
                this.f1791p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f1792q) {
                this.f1792q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f1781f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.f1781f.keyAt(i2);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f1781f.valueAt(i2);
                Drawable[] drawableArr = this.f1782g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f1777b);
                if (Build.VERSION.SDK_INT >= 23) {
                    drawableNewDrawable.setLayoutDirection(this.f1798x);
                }
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f1776a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f1781f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i2 = this.f1783h;
        Drawable[] drawableArr = this.f1782g;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f1781f.get(i3);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i2) {
        int iIndexOfKey;
        Drawable drawable = this.f1782g[i2];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f1781f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i2)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f1781f.valueAt(iIndexOfKey)).newDrawable(this.f1777b);
        if (Build.VERSION.SDK_INT >= 23) {
            drawableNewDrawable.setLayoutDirection(this.f1798x);
        }
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f1776a);
        this.f1782g[i2] = drawableMutate;
        this.f1781f.removeAt(iIndexOfKey);
        if (this.f1781f.size() == 0) {
            this.f1781f = null;
        }
        return drawableMutate;
    }

    public final int e(int[] iArr) {
        int[][] iArr2 = this.f1773H;
        int i2 = this.f1783h;
        for (int i3 = 0; i3 < i2; i3++) {
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f1779d | this.f1780e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
