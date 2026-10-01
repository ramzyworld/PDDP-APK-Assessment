package Q;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class q extends h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final PorterDuff.Mode f662n = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuffColorFilter f664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorFilter f665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Matrix f669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f670m;

    public q() {
        this.f667j = true;
        this.f668k = new float[9];
        this.f669l = new Matrix();
        this.f670m = new Rect();
        o oVar = new o();
        oVar.f651c = null;
        oVar.f652d = f662n;
        oVar.f650b = new n();
        this.f663f = oVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f607e;
        if (drawable == null) {
            return false;
        }
        p033s.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f607e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f670m;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f665h;
        if (colorFilter == null) {
            colorFilter = this.f664g;
        }
        Matrix matrix = this.f669l;
        canvas.getMatrix(matrix);
        float[] fArr = this.f668k;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && a1.a.o(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        o oVar = this.f663f;
        Bitmap bitmap = oVar.f654f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != oVar.f654f.getHeight()) {
            oVar.f654f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            oVar.f659k = true;
        }
        if (this.f667j) {
            o oVar2 = this.f663f;
            if (oVar2.f659k || oVar2.f655g != oVar2.f651c || oVar2.f656h != oVar2.f652d || oVar2.f658j != oVar2.f653e || oVar2.f657i != oVar2.f650b.getRootAlpha()) {
                o oVar3 = this.f663f;
                oVar3.f654f.eraseColor(0);
                Canvas canvas2 = new Canvas(oVar3.f654f);
                n nVar = oVar3.f650b;
                nVar.a(nVar.f640g, n.f633p, canvas2, iMin, iMin2);
                o oVar4 = this.f663f;
                oVar4.f655g = oVar4.f651c;
                oVar4.f656h = oVar4.f652d;
                oVar4.f657i = oVar4.f650b.getRootAlpha();
                oVar4.f658j = oVar4.f653e;
                oVar4.f659k = false;
            }
        } else {
            o oVar5 = this.f663f;
            oVar5.f654f.eraseColor(0);
            Canvas canvas3 = new Canvas(oVar5.f654f);
            n nVar2 = oVar5.f650b;
            nVar2.a(nVar2.f640g, n.f633p, canvas3, iMin, iMin2);
        }
        o oVar6 = this.f663f;
        if (oVar6.f650b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (oVar6.f660l == null) {
                Paint paint2 = new Paint();
                oVar6.f660l = paint2;
                paint2.setFilterBitmap(true);
            }
            oVar6.f660l.setAlpha(oVar6.f650b.getRootAlpha());
            oVar6.f660l.setColorFilter(colorFilter);
            paint = oVar6.f660l;
        }
        canvas.drawBitmap(oVar6.f654f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f607e;
        return drawable != null ? drawable.getAlpha() : this.f663f.f650b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f607e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f663f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f607e;
        return drawable != null ? p033s.a.c(drawable) : this.f665h;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f607e != null && Build.VERSION.SDK_INT >= 24) {
            return new p(this.f607e.getConstantState());
        }
        this.f663f.f649a = getChangingConfigurations();
        return this.f663f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f607e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f663f.f650b.f642i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f607e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f663f.f650b.f641h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f607e;
        return drawable != null ? drawable.isAutoMirrored() : this.f663f.f653e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f607e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            o oVar = this.f663f;
            if (oVar != null) {
                n nVar = oVar.f650b;
                if (nVar.f647n == null) {
                    nVar.f647n = Boolean.valueOf(nVar.f640g.a());
                }
                if (nVar.f647n.booleanValue() || ((colorStateList = this.f663f.f651c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f666i && super.mutate() == this) {
            o oVar = this.f663f;
            o oVar2 = new o();
            oVar2.f651c = null;
            oVar2.f652d = f662n;
            if (oVar != null) {
                oVar2.f649a = oVar.f649a;
                n nVar = new n(oVar.f650b);
                oVar2.f650b = nVar;
                if (oVar.f650b.f638e != null) {
                    nVar.f638e = new Paint(oVar.f650b.f638e);
                }
                if (oVar.f650b.f637d != null) {
                    oVar2.f650b.f637d = new Paint(oVar.f650b.f637d);
                }
                oVar2.f651c = oVar.f651c;
                oVar2.f652d = oVar.f652d;
                oVar2.f653e = oVar.f653e;
            }
            this.f663f = oVar2;
            this.f666i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f607e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        o oVar = this.f663f;
        ColorStateList colorStateList = oVar.f651c;
        if (colorStateList == null || (mode = oVar.f652d) == null) {
            z2 = false;
        } else {
            this.f664g = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        n nVar = oVar.f650b;
        if (nVar.f647n == null) {
            nVar.f647n = Boolean.valueOf(nVar.f640g.a());
        }
        if (nVar.f647n.booleanValue()) {
            boolean zB = oVar.f650b.f640g.b(iArr);
            oVar.f659k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f663f.f650b.getRootAlpha() != i2) {
            this.f663f.f650b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f663f.f653e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f665h = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            a1.a.A(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            p033s.a.h(drawable, colorStateList);
            return;
        }
        o oVar = this.f663f;
        if (oVar.f651c != colorStateList) {
            oVar.f651c = colorStateList;
            this.f664g = a(colorStateList, oVar.f652d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            p033s.a.i(drawable, mode);
            return;
        }
        o oVar = this.f663f;
        if (oVar.f652d != mode) {
            oVar.f652d = mode;
            this.f664g = a(oVar.f651c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f607e;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        n nVar;
        int i2;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f607e;
        if (drawable != null) {
            p033s.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        o oVar = this.f663f;
        oVar.f650b = new n();
        TypedArray typedArrayH = p029q.b.h(resources, theme, attributeSet, a.f584a);
        o oVar2 = this.f663f;
        n nVar2 = oVar2.f650b;
        int i3 = !p029q.b.e(xmlPullParser, "tintMode") ? -1 : typedArrayH.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        oVar2.f652d = mode;
        int i4 = 1;
        ColorStateList colorStateListA = null;
        if (p029q.b.e(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayH.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 >= 28 && i5 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayH.getResources();
                int resourceId = typedArrayH.getResourceId(1, 0);
                ThreadLocal threadLocal = p029q.c.f2987a;
                try {
                    colorStateListA = p029q.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            oVar2.f651c = colorStateList;
        }
        boolean z2 = oVar2.f653e;
        if (p029q.b.e(xmlPullParser, "autoMirrored")) {
            z2 = typedArrayH.getBoolean(5, z2);
        }
        oVar2.f653e = z2;
        float f2 = nVar2.f643j;
        if (p029q.b.e(xmlPullParser, "viewportWidth")) {
            f2 = typedArrayH.getFloat(7, f2);
        }
        nVar2.f643j = f2;
        float f3 = nVar2.f644k;
        if (p029q.b.e(xmlPullParser, "viewportHeight")) {
            f3 = typedArrayH.getFloat(8, f3);
        }
        nVar2.f644k = f3;
        if (nVar2.f643j <= 0.0f) {
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f3 > 0.0f) {
            nVar2.f641h = typedArrayH.getDimension(3, nVar2.f641h);
            float dimension = typedArrayH.getDimension(2, nVar2.f642i);
            nVar2.f642i = dimension;
            if (nVar2.f641h <= 0.0f) {
                throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = nVar2.getAlpha();
                if (p029q.b.e(xmlPullParser, "alpha")) {
                    alpha = typedArrayH.getFloat(4, alpha);
                }
                nVar2.setAlpha(alpha);
                String string = typedArrayH.getString(0);
                if (string != null) {
                    nVar2.f646m = string;
                    nVar2.f648o.put(string, nVar2);
                }
                typedArrayH.recycle();
                oVar.f649a = getChangingConfigurations();
                oVar.f659k = true;
                o oVar3 = this.f663f;
                n nVar3 = oVar3.f650b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(nVar3.f640g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z3 = true;
                for (int i6 = 3; eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != i6); i6 = 3) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        k kVar = (k) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        i2 = depth;
                        p022m.a aVar = nVar3.f648o;
                        if (zEquals) {
                            j jVar = new j();
                            jVar.f609e = 0.0f;
                            jVar.f611g = 1.0f;
                            jVar.f612h = 1.0f;
                            jVar.f613i = 0.0f;
                            jVar.f614j = 1.0f;
                            jVar.f615k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            jVar.f616l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            jVar.f617m = join3;
                            nVar = nVar3;
                            jVar.f618n = 4.0f;
                            TypedArray typedArrayH2 = p029q.b.h(resources, theme, attributeSet, a.f586c);
                            if (p029q.b.e(xmlPullParser, "pathData")) {
                                String string2 = typedArrayH2.getString(0);
                                if (string2 != null) {
                                    jVar.f631b = string2;
                                }
                                String string3 = typedArrayH2.getString(2);
                                if (string3 != null) {
                                    jVar.f630a = p000a.a.m(string3);
                                }
                                jVar.f610f = p029q.b.b(typedArrayH2, xmlPullParser, theme, "fillColor", 1);
                                float f4 = jVar.f612h;
                                if (p029q.b.e(xmlPullParser, "fillAlpha")) {
                                    f4 = typedArrayH2.getFloat(12, f4);
                                }
                                jVar.f612h = f4;
                                int i7 = !p029q.b.e(xmlPullParser, "strokeLineCap") ? -1 : typedArrayH2.getInt(8, -1);
                                Paint.Cap cap3 = jVar.f616l;
                                if (i7 != 0) {
                                    join = join3;
                                    if (i7 != 1) {
                                        cap = i7 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                } else {
                                    join = join3;
                                    cap = cap2;
                                }
                                jVar.f616l = cap;
                                int i8 = !p029q.b.e(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayH2.getInt(9, -1);
                                Paint.Join join4 = jVar.f617m;
                                if (i8 == 0) {
                                    join2 = join;
                                } else if (i8 != 1) {
                                    join2 = i8 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                jVar.f617m = join2;
                                float f5 = jVar.f618n;
                                if (p029q.b.e(xmlPullParser, "strokeMiterLimit")) {
                                    f5 = typedArrayH2.getFloat(10, f5);
                                }
                                jVar.f618n = f5;
                                jVar.f608d = p029q.b.b(typedArrayH2, xmlPullParser, theme, "strokeColor", 3);
                                float f6 = jVar.f611g;
                                if (p029q.b.e(xmlPullParser, "strokeAlpha")) {
                                    f6 = typedArrayH2.getFloat(11, f6);
                                }
                                jVar.f611g = f6;
                                float f7 = jVar.f609e;
                                if (p029q.b.e(xmlPullParser, "strokeWidth")) {
                                    f7 = typedArrayH2.getFloat(4, f7);
                                }
                                jVar.f609e = f7;
                                float f8 = jVar.f614j;
                                if (p029q.b.e(xmlPullParser, "trimPathEnd")) {
                                    f8 = typedArrayH2.getFloat(6, f8);
                                }
                                jVar.f614j = f8;
                                float f9 = jVar.f615k;
                                if (p029q.b.e(xmlPullParser, "trimPathOffset")) {
                                    f9 = typedArrayH2.getFloat(7, f9);
                                }
                                jVar.f615k = f9;
                                float f10 = jVar.f613i;
                                if (p029q.b.e(xmlPullParser, "trimPathStart")) {
                                    f10 = typedArrayH2.getFloat(5, f10);
                                }
                                jVar.f613i = f10;
                                int i9 = jVar.f632c;
                                if (p029q.b.e(xmlPullParser, "fillType")) {
                                    i9 = typedArrayH2.getInt(13, i9);
                                }
                                jVar.f632c = i9;
                            }
                            typedArrayH2.recycle();
                            kVar.f620b.add(jVar);
                            if (jVar.getPathName() != null) {
                                aVar.put(jVar.getPathName(), jVar);
                            }
                            oVar3.f649a = oVar3.f649a;
                            z3 = false;
                        } else {
                            nVar = nVar3;
                            if ("clip-path".equals(name)) {
                                i iVar = new i();
                                if (p029q.b.e(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayH3 = p029q.b.h(resources, theme, attributeSet, a.f587d);
                                    String string4 = typedArrayH3.getString(0);
                                    if (string4 != null) {
                                        iVar.f631b = string4;
                                    }
                                    String string5 = typedArrayH3.getString(1);
                                    if (string5 != null) {
                                        iVar.f630a = p000a.a.m(string5);
                                    }
                                    iVar.f632c = !p029q.b.e(xmlPullParser, "fillType") ? 0 : typedArrayH3.getInt(2, 0);
                                    typedArrayH3.recycle();
                                }
                                kVar.f620b.add(iVar);
                                if (iVar.getPathName() != null) {
                                    aVar.put(iVar.getPathName(), iVar);
                                }
                                oVar3.f649a = oVar3.f649a;
                            } else if ("group".equals(name)) {
                                k kVar2 = new k();
                                TypedArray typedArrayH4 = p029q.b.h(resources, theme, attributeSet, a.f585b);
                                float f11 = kVar2.f621c;
                                if (p029q.b.e(xmlPullParser, "rotation")) {
                                    f11 = typedArrayH4.getFloat(5, f11);
                                }
                                kVar2.f621c = f11;
                                kVar2.f622d = typedArrayH4.getFloat(1, kVar2.f622d);
                                kVar2.f623e = typedArrayH4.getFloat(2, kVar2.f623e);
                                float f12 = kVar2.f624f;
                                if (p029q.b.e(xmlPullParser, "scaleX")) {
                                    f12 = typedArrayH4.getFloat(3, f12);
                                }
                                kVar2.f624f = f12;
                                float f13 = kVar2.f625g;
                                if (p029q.b.e(xmlPullParser, "scaleY")) {
                                    f13 = typedArrayH4.getFloat(4, f13);
                                }
                                kVar2.f625g = f13;
                                float f14 = kVar2.f626h;
                                if (p029q.b.e(xmlPullParser, "translateX")) {
                                    f14 = typedArrayH4.getFloat(6, f14);
                                }
                                kVar2.f626h = f14;
                                float f15 = kVar2.f627i;
                                if (p029q.b.e(xmlPullParser, "translateY")) {
                                    f15 = typedArrayH4.getFloat(7, f15);
                                }
                                kVar2.f627i = f15;
                                String string6 = typedArrayH4.getString(0);
                                if (string6 != null) {
                                    kVar2.f629k = string6;
                                }
                                kVar2.c();
                                typedArrayH4.recycle();
                                kVar.f620b.add(kVar2);
                                arrayDeque.push(kVar2);
                                if (kVar2.getGroupName() != null) {
                                    aVar.put(kVar2.getGroupName(), kVar2);
                                }
                                oVar3.f649a = oVar3.f649a;
                            }
                        }
                    } else {
                        nVar = nVar3;
                        i2 = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    depth = i2;
                    nVar3 = nVar;
                    i4 = 1;
                }
                if (!z3) {
                    this.f664g = a(oVar.f651c, oVar.f652d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public q(o oVar) {
        this.f667j = true;
        this.f668k = new float[9];
        this.f669l = new Matrix();
        this.f670m = new Rect();
        this.f663f = oVar;
        this.f664g = a(oVar.f651c, oVar.f652d);
    }
}
