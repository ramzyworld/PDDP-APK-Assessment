package androidx.appcompat.widget;

import N.C0026b;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.lang.reflect.Field;
import p016j.AbstractC0127y;
import p016j.C0122t;
import p016j.g0;
import p016j.w0;
import p042y.x;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final g0 f1285Q = new g0(Float.class, "thumbPos");

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int[] f1286R = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f1287A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f1288B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f1289C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f1290D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f1291E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f1292F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f1293G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f1294H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f1295I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final TextPaint f1296J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final ColorStateList f1297K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public StaticLayout f1298L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public StaticLayout f1299M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final p010g.a f1300N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ObjectAnimator f1301O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final Rect f1302P;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f1303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f1304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1307i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f1308j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f1309k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f1310l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1311m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1312n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1313o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1314p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1315q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1316r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f1317s;
    public CharSequence t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1319v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f1320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f1321x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f1322y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final VelocityTracker f1323z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, com.deeprf.pddp.R.attr.switchStyle);
        this.f1304f = null;
        this.f1305g = null;
        this.f1306h = false;
        this.f1307i = false;
        this.f1309k = null;
        this.f1310l = null;
        this.f1311m = false;
        this.f1312n = false;
        this.f1323z = VelocityTracker.obtain();
        this.f1302P = new Rect();
        TextPaint textPaint = new TextPaint(1);
        this.f1296J = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        C0026b c0026bI = C0026b.I(context, attributeSet, p004c.a.f1754r, com.deeprf.pddp.R.attr.switchStyle);
        Drawable drawableY = c0026bI.y(2);
        this.f1303e = drawableY;
        if (drawableY != null) {
            drawableY.setCallback(this);
        }
        Drawable drawableY2 = c0026bI.y(11);
        this.f1308j = drawableY2;
        if (drawableY2 != null) {
            drawableY2.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) c0026bI.f476f;
        this.f1317s = typedArray.getText(0);
        this.t = typedArray.getText(1);
        this.f1318u = typedArray.getBoolean(3, true);
        this.f1313o = typedArray.getDimensionPixelSize(8, 0);
        this.f1314p = typedArray.getDimensionPixelSize(5, 0);
        this.f1315q = typedArray.getDimensionPixelSize(6, 0);
        this.f1316r = typedArray.getBoolean(4, false);
        ColorStateList colorStateListX = c0026bI.x(9);
        if (colorStateListX != null) {
            this.f1304f = colorStateListX;
            this.f1306h = true;
        }
        PorterDuff.Mode modeD = AbstractC0127y.d(typedArray.getInt(10, -1), null);
        if (this.f1305g != modeD) {
            this.f1305g = modeD;
            this.f1307i = true;
        }
        if (this.f1306h || this.f1307i) {
            a();
        }
        ColorStateList colorStateListX2 = c0026bI.x(12);
        if (colorStateListX2 != null) {
            this.f1309k = colorStateListX2;
            this.f1311m = true;
        }
        PorterDuff.Mode modeD2 = AbstractC0127y.d(typedArray.getInt(13, -1), null);
        if (this.f1310l != modeD2) {
            this.f1310l = modeD2;
            this.f1312n = true;
        }
        if (this.f1311m || this.f1312n) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, p004c.a.f1755s);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = p006d.b.b(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f1297K = colorStateList;
            } else {
                this.f1297K = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f2 = dimensionPixelSize;
                if (f2 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f2);
                    requestLayout();
                }
            }
            int i2 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i3 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i2 != 2) {
                typeface = i2 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i3 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typeface, i3);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i4 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((i4 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                p010g.a aVar = new p010g.a();
                aVar.f1830a = context2.getResources().getConfiguration().locale;
                this.f1300N = aVar;
            } else {
                this.f1300N = null;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        new C0122t(this).d(attributeSet, com.deeprf.pddp.R.attr.switchStyle);
        c0026bI.L();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1320w = viewConfiguration.getScaledTouchSlop();
        this.f1287A = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private boolean getTargetCheckedState() {
        return this.f1288B > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((w0.a(this) ? 1.0f - this.f1288B : this.f1288B) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1308j;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1302P;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1303e;
        Rect rectC = drawable2 != null ? AbstractC0127y.c(drawable2) : AbstractC0127y.f2785c;
        return ((((this.f1289C - this.f1291E) - rect.left) - rect.right) - rectC.left) - rectC.right;
    }

    public final void a() {
        Drawable drawable = this.f1303e;
        if (drawable != null) {
            if (this.f1306h || this.f1307i) {
                Drawable drawableMutate = a1.a.K(drawable).mutate();
                this.f1303e = drawableMutate;
                if (this.f1306h) {
                    p033s.a.h(drawableMutate, this.f1304f);
                }
                if (this.f1307i) {
                    p033s.a.i(this.f1303e, this.f1305g);
                }
                if (this.f1303e.isStateful()) {
                    this.f1303e.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f1308j;
        if (drawable != null) {
            if (this.f1311m || this.f1312n) {
                Drawable drawableMutate = a1.a.K(drawable).mutate();
                this.f1308j = drawableMutate;
                if (this.f1311m) {
                    p033s.a.h(drawableMutate, this.f1309k);
                }
                if (this.f1312n) {
                    p033s.a.i(this.f1308j, this.f1310l);
                }
                if (this.f1308j.isStateful()) {
                    this.f1308j.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        p010g.a aVar = this.f1300N;
        if (aVar != null) {
            charSequence = aVar.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f1296J;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        int i3;
        int i4 = this.f1292F;
        int i5 = this.f1293G;
        int i6 = this.f1294H;
        int i7 = this.f1295I;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.f1303e;
        Rect rectC = drawable != null ? AbstractC0127y.c(drawable) : AbstractC0127y.f2785c;
        Drawable drawable2 = this.f1308j;
        Rect rect = this.f1302P;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i8 = rect.left;
            thumbOffset += i8;
            if (rectC != null) {
                int i9 = rectC.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = rectC.top;
                int i11 = rect.top;
                i2 = i10 > i11 ? (i10 - i11) + i5 : i5;
                int i12 = rectC.right;
                int i13 = rect.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = rectC.bottom;
                int i15 = rect.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                }
                this.f1308j.setBounds(i4, i2, i6, i3);
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.f1308j.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f1303e;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i16 = thumbOffset - rect.left;
            int i17 = thumbOffset + this.f1291E + rect.right;
            this.f1303e.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                p033s.a.f(background, i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f1303e;
        if (drawable != null) {
            p033s.a.e(drawable, f2, f3);
        }
        Drawable drawable2 = this.f1308j;
        if (drawable2 != null) {
            p033s.a.e(drawable2, f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1303e;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f1308j;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!w0.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1289C;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1315q : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (w0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1289C;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1315q : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f1318u;
    }

    public boolean getSplitTrack() {
        return this.f1316r;
    }

    public int getSwitchMinWidth() {
        return this.f1314p;
    }

    public int getSwitchPadding() {
        return this.f1315q;
    }

    public CharSequence getTextOff() {
        return this.t;
    }

    public CharSequence getTextOn() {
        return this.f1317s;
    }

    public Drawable getThumbDrawable() {
        return this.f1303e;
    }

    public int getThumbTextPadding() {
        return this.f1313o;
    }

    public ColorStateList getThumbTintList() {
        return this.f1304f;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1305g;
    }

    public Drawable getTrackDrawable() {
        return this.f1308j;
    }

    public ColorStateList getTrackTintList() {
        return this.f1309k;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1310l;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1303e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1308j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1301O;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1301O.end();
        this.f1301O = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1286R);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f1308j;
        Rect rect = this.f1302P;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1293G;
        int i3 = this.f1295I;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1303e;
        if (drawable != null) {
            if (!this.f1316r || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectC = AbstractC0127y.c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectC.left;
                rect.right -= rectC.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f1298L : this.f1299M;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1297K;
            TextPaint textPaint = this.f1296J;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i4 + i5) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f1317s : this.t;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(' ');
        sb.append(charSequence);
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z2, i2, i3, i4, i5);
        int iMax2 = 0;
        if (this.f1303e != null) {
            Drawable drawable = this.f1308j;
            Rect rect = this.f1302P;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectC = AbstractC0127y.c(this.f1303e);
            iMax = Math.max(0, rectC.left - rect.left);
            iMax2 = Math.max(0, rectC.right - rect.right);
        } else {
            iMax = 0;
        }
        if (w0.a(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f1289C + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f1289C) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i6 = this.f1290D;
            int i7 = height2 - (i6 / 2);
            height = i6 + i7;
            paddingTop = i7;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f1290D + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f1290D;
        }
        this.f1292F = paddingLeft;
        this.f1293G = paddingTop;
        this.f1295I = height;
        this.f1294H = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        if (this.f1318u) {
            if (this.f1298L == null) {
                this.f1298L = c(this.f1317s);
            }
            if (this.f1299M == null) {
                this.f1299M = c(this.t);
            }
        }
        Drawable drawable = this.f1303e;
        int intrinsicHeight2 = 0;
        Rect rect = this.f1302P;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f1303e.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f1303e.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f1318u) {
            iMax = (this.f1313o * 2) + Math.max(this.f1298L.getWidth(), this.f1299M.getWidth());
        } else {
            iMax = 0;
        }
        this.f1291E = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f1308j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f1308j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f1303e;
        if (drawable3 != null) {
            Rect rectC = AbstractC0127y.c(drawable3);
            iMax2 = Math.max(iMax2, rectC.left);
            iMax3 = Math.max(iMax3, rectC.right);
        }
        int iMax4 = Math.max(this.f1314p, (this.f1291E * 2) + iMax2 + iMax3);
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f1289C = iMax4;
        this.f1290D = iMax5;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1317s : this.t;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f1  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f2;
        VelocityTracker velocityTracker = this.f1323z;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f1320w;
        if (actionMasked != 0) {
            float f3 = 0.0f;
            if (actionMasked == 1) {
                if (this.f1319v == 2) {
                    this.f1319v = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    zIsChecked = isChecked();
                    if (z2) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f1287A) {
                            targetCheckedState = w0.a(this) ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f1319v = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i3 = this.f1319v;
                if (i3 == 1) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float f4 = i2;
                    if (Math.abs(x2 - this.f1321x) > f4 || Math.abs(y2 - this.f1322y) > f4) {
                        this.f1319v = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f1321x = x2;
                        this.f1322y = y2;
                        return true;
                    }
                } else if (i3 == 2) {
                    float x3 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f5 = x3 - this.f1321x;
                    if (thumbScrollRange != 0) {
                        f2 = f5 / thumbScrollRange;
                    } else {
                        f2 = f5 > 0.0f ? 1.0f : -1.0f;
                    }
                    if (w0.a(this)) {
                        f2 = -f2;
                    }
                    float f6 = this.f1288B;
                    float f7 = f2 + f6;
                    if (f7 >= 0.0f) {
                        f3 = f7 > 1.0f ? 1.0f : f7;
                    }
                    if (f3 != f6) {
                        this.f1321x = x3;
                        setThumbPosition(f3);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.f1319v == 2) {
                    this.f1319v = 0;
                    if (motionEvent.getAction() == 1) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    zIsChecked = isChecked();
                    if (z2) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f1287A) {
                            targetCheckedState = getTargetCheckedState();
                        } else if (w0.a(this)) {
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f1319v = 0;
                velocityTracker.clear();
            }
        } else {
            float x4 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (isEnabled() && this.f1303e != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f1303e;
                Rect rect = this.f1302P;
                drawable.getPadding(rect);
                int i4 = this.f1293G - i2;
                int i5 = (this.f1292F + thumbOffset) - i2;
                int i6 = this.f1291E + i5 + rect.left + rect.right + i2;
                int i7 = this.f1295I + i2;
                if (x4 > i5 && x4 < i6 && y3 > i4 && y3 < i7) {
                    this.f1319v = 1;
                    this.f1321x = x4;
                    this.f1322y = y3;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean zIsChecked = isChecked();
        if (getWindowToken() != null) {
            Field field = x.f3474a;
            if (isLaidOut()) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f1285Q, zIsChecked ? 1.0f : 0.0f);
                this.f1301O = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(250L);
                this.f1301O.setAutoCancel(true);
                this.f1301O.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f1301O;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(zIsChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a1.a.M(callback, this));
    }

    public void setShowText(boolean z2) {
        if (this.f1318u != z2) {
            this.f1318u = z2;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z2) {
        this.f1316r = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.f1314p = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.f1315q = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f1296J;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.t = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f1317s = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1303e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1303e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.f1288B = f2;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(p006d.b.c(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.f1313o = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1304f = colorStateList;
        this.f1306h = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1305g = mode;
        this.f1307i = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1308j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1308j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(p006d.b.c(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1309k = colorStateList;
        this.f1311m = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1310l = mode;
        this.f1312n = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1303e || drawable == this.f1308j;
    }
}
