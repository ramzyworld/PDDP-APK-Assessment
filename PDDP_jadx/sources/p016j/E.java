package p016j;

import N.C0026b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Field;
import p004c.a;
import p042y.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class E extends ViewGroup {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f2546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f2548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f2549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f2550o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2551p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2552q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2554s;

    public E(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f2540e = true;
        this.f2541f = -1;
        this.f2542g = 0;
        this.f2544i = 8388659;
        C0026b c0026bI = C0026b.I(context, attributeSet, a.f1745i, i2);
        TypedArray typedArray = (TypedArray) c0026bI.f476f;
        int i3 = typedArray.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = typedArray.getInt(0, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f2546k = typedArray.getFloat(4, -1.0f);
        this.f2541f = typedArray.getInt(3, -1);
        this.f2547l = typedArray.getBoolean(7, false);
        setDividerDrawable(c0026bI.y(5));
        this.f2553r = typedArray.getInt(8, 0);
        this.f2554s = typedArray.getDimensionPixelSize(6, 0);
        c0026bI.L();
    }

    public final void b(Canvas canvas, int i2) {
        this.f2550o.setBounds(getPaddingLeft() + this.f2554s, i2, (getWidth() - getPaddingRight()) - this.f2554s, this.f2552q + i2);
        this.f2550o.draw(canvas);
    }

    public final void c(Canvas canvas, int i2) {
        this.f2550o.setBounds(i2, getPaddingTop() + this.f2554s, this.f2551p + i2, (getHeight() - getPaddingBottom()) - this.f2554s);
        this.f2550o.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof D;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public D generateDefaultLayoutParams() {
        int i2 = this.f2543h;
        if (i2 == 0) {
            return new D(-2);
        }
        if (i2 == 1) {
            return new D(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public D generateLayoutParams(AttributeSet attributeSet) {
        return new D(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public D generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new D(layoutParams);
    }

    public final boolean g(int i2) {
        if (i2 == 0) {
            return (this.f2553r & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f2553r & 4) != 0;
        }
        if ((this.f2553r & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f2541f < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f2541f;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f2541f == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f2542g;
        if (this.f2543h == 1 && (i2 = this.f2544i & 112) != 48) {
            if (i2 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2545j) / 2;
            } else if (i2 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2545j;
            }
        }
        return bottom + ((ViewGroup.MarginLayoutParams) ((D) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2541f;
    }

    public Drawable getDividerDrawable() {
        return this.f2550o;
    }

    public int getDividerPadding() {
        return this.f2554s;
    }

    public int getDividerWidth() {
        return this.f2551p;
    }

    public int getGravity() {
        return this.f2544i;
    }

    public int getOrientation() {
        return this.f2543h;
    }

    public int getShowDividers() {
        return this.f2553r;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2546k;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        int bottom;
        if (this.f2550o == null) {
            return;
        }
        int i3 = 0;
        if (this.f2543h == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && g(i3)) {
                    b(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((D) childAt.getLayoutParams())).topMargin) - this.f2552q);
                }
                i3++;
            }
            if (g(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f2552q;
                } else {
                    bottom = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((D) childAt2.getLayoutParams())).bottomMargin;
                }
                b(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zA = w0.a(this);
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i3)) {
                D d2 = (D) childAt3.getLayoutParams();
                c(canvas, zA ? childAt3.getRight() + ((ViewGroup.MarginLayoutParams) d2).rightMargin : (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) d2).leftMargin) - this.f2551p);
            }
            i3++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                D d3 = (D) childAt4.getLayoutParams();
                if (zA) {
                    left = childAt4.getLeft() - ((ViewGroup.MarginLayoutParams) d3).leftMargin;
                    i2 = this.f2551p;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) d3).rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f2551p;
                right = left - i2;
            }
            c(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0153  */
    /* JADX WARN: Code duplicated, block: B:60:0x015c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0160  */
    /* JADX WARN: Code duplicated, block: B:64:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0167  */
    /* JADX WARN: Code duplicated, block: B:67:0x016f  */
    /* JADX WARN: Code duplicated, block: B:68:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0183  */
    /* JADX WARN: Code duplicated, block: B:71:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x019e  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int paddingLeft;
        int i6;
        int i7;
        int i8;
        int i9;
        int baseline;
        int i10;
        int i11;
        int measuredHeight;
        int paddingTop;
        int i12;
        int i13;
        int i14;
        int i15 = 8;
        if (this.f2543h == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i16 = i4 - i2;
            int paddingRight = i16 - getPaddingRight();
            int paddingRight2 = (i16 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i17 = this.f2544i;
            int i18 = i17 & 112;
            int i19 = 8388615 & i17;
            if (i18 != 16) {
                paddingTop = i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - this.f2545j;
            } else {
                paddingTop = getPaddingTop() + (((i5 - i3) - this.f2545j) / 2);
            }
            int i20 = 0;
            while (i20 < virtualChildCount) {
                View childAt = getChildAt(i20);
                if (childAt != null && childAt.getVisibility() != i15) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    D d2 = (D) childAt.getLayoutParams();
                    int i21 = d2.f2539b;
                    if (i21 < 0) {
                        i21 = i19;
                    }
                    Field field = x.f3474a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i14 = ((ViewGroup.MarginLayoutParams) d2).leftMargin + paddingLeft2;
                        } else {
                            i12 = paddingRight - measuredWidth;
                            i13 = ((ViewGroup.MarginLayoutParams) d2).rightMargin;
                        }
                        if (g(i20)) {
                            paddingTop += this.f2552q;
                        }
                        int i22 = paddingTop + ((ViewGroup.MarginLayoutParams) d2).topMargin;
                        childAt.layout(i14, i22, measuredWidth + i14, i22 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) d2).bottomMargin + i22;
                    } else {
                        i12 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((ViewGroup.MarginLayoutParams) d2).leftMargin;
                        i13 = ((ViewGroup.MarginLayoutParams) d2).rightMargin;
                    }
                    i14 = i12 - i13;
                    if (g(i20)) {
                        paddingTop += this.f2552q;
                    }
                    int i23 = paddingTop + ((ViewGroup.MarginLayoutParams) d2).topMargin;
                    childAt.layout(i14, i23, measuredWidth + i14, i23 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) d2).bottomMargin + i23;
                }
                i20++;
                i15 = 8;
            }
            return;
        }
        boolean zA = w0.a(this);
        int paddingTop2 = getPaddingTop();
        int i24 = i5 - i3;
        int paddingBottom = i24 - getPaddingBottom();
        int paddingBottom2 = (i24 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i25 = this.f2544i;
        int i26 = 8388615 & i25;
        int i27 = i25 & 112;
        boolean z3 = this.f2540e;
        int[] iArr = this.f2548m;
        int[] iArr2 = this.f2549n;
        Field field2 = x.f3474a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i26, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i4) - i2) - this.f2545j;
        } else {
            paddingLeft = getPaddingLeft() + (((i4 - i2) - this.f2545j) / 2);
        }
        if (zA) {
            i6 = virtualChildCount2 - 1;
            i7 = -1;
        } else {
            i6 = 0;
            i7 = 1;
        }
        int i28 = 0;
        while (i28 < virtualChildCount2) {
            int i29 = (i7 * i28) + i6;
            View childAt2 = getChildAt(i29);
            if (childAt2 == null) {
                i7 = i7;
                i8 = virtualChildCount2;
                i27 = i27;
                i9 = 1;
            } else {
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    D d3 = (D) childAt2.getLayoutParams();
                    if (z3) {
                        i8 = virtualChildCount2;
                        baseline = ((ViewGroup.MarginLayoutParams) d3).height != -1 ? childAt2.getBaseline() : -1;
                        i10 = d3.f2539b;
                        if (i10 < 0) {
                            i10 = i27;
                        }
                        i11 = i10 & 112;
                        if (i11 != 16) {
                            measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((ViewGroup.MarginLayoutParams) d3).topMargin) - ((ViewGroup.MarginLayoutParams) d3).bottomMargin;
                        } else if (i11 != 48) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) d3).topMargin + paddingTop2;
                            if (baseline != -1) {
                                measuredHeight = (iArr[1] - baseline) + measuredHeight;
                            }
                        } else if (i11 != 80) {
                            measuredHeight = paddingTop2;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight3) - ((ViewGroup.MarginLayoutParams) d3).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (g(i29)) {
                            paddingLeft += this.f2551p;
                        }
                        int i30 = paddingLeft + ((ViewGroup.MarginLayoutParams) d3).leftMargin;
                        childAt2.layout(i30, measuredHeight, i30 + measuredWidth2, measuredHeight + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((ViewGroup.MarginLayoutParams) d3).rightMargin + i30;
                    } else {
                        i8 = virtualChildCount2;
                    }
                    i10 = d3.f2539b;
                    if (i10 < 0) {
                        i10 = i27;
                    }
                    i11 = i10 & 112;
                    if (i11 != 16) {
                        measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((ViewGroup.MarginLayoutParams) d3).topMargin) - ((ViewGroup.MarginLayoutParams) d3).bottomMargin;
                    } else if (i11 != 48) {
                        measuredHeight = ((ViewGroup.MarginLayoutParams) d3).topMargin + paddingTop2;
                        if (baseline != -1) {
                            measuredHeight = (iArr[1] - baseline) + measuredHeight;
                        }
                    } else if (i11 != 80) {
                        measuredHeight = paddingTop2;
                    } else {
                        measuredHeight = (paddingBottom - measuredHeight3) - ((ViewGroup.MarginLayoutParams) d3).bottomMargin;
                        if (baseline != -1) {
                            measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                        }
                    }
                    if (g(i29)) {
                        paddingLeft += this.f2551p;
                    }
                    int i31 = paddingLeft + ((ViewGroup.MarginLayoutParams) d3).leftMargin;
                    childAt2.layout(i31, measuredHeight, i31 + measuredWidth2, measuredHeight + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((ViewGroup.MarginLayoutParams) d3).rightMargin + i31;
                } else {
                    i8 = virtualChildCount2;
                }
                i9 = 1;
            }
            i28 += i9;
            i6 = i6;
            i7 = i7;
            virtualChildCount2 = i8;
            i27 = i27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:155:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:215:0x0480  */
    /* JADX WARN: Code duplicated, block: B:216:0x0485  */
    /* JADX WARN: Code duplicated, block: B:219:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:220:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:223:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:224:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:226:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:232:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:242:0x0530  */
    /* JADX WARN: Code duplicated, block: B:248:0x0540  */
    /* JADX WARN: Code duplicated, block: B:251:0x0548 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x054a  */
    /* JADX WARN: Code duplicated, block: B:254:0x0553 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:255:0x0555  */
    /* JADX WARN: Code duplicated, block: B:282:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:284:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:285:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:288:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:290:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:291:0x0604  */
    /* JADX WARN: Code duplicated, block: B:315:0x0689  */
    /* JADX WARN: Code duplicated, block: B:317:0x0690  */
    /* JADX WARN: Code duplicated, block: B:320:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:322:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:324:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:370:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:375:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:383:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:390:0x0834  */
    /* JADX WARN: Code duplicated, block: B:393:0x0857  */
    /* JADX WARN: Code duplicated, block: B:395:0x0865  */
    /* JADX WARN: Code duplicated, block: B:397:0x0871  */
    /* JADX WARN: Code duplicated, block: B:399:0x087d  */
    /* JADX WARN: Code duplicated, block: B:400:0x0892  */
    /* JADX WARN: Code duplicated, block: B:431:0x0614 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x0893 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        char c2;
        int iMax;
        int i4;
        float f2;
        int i5;
        int i6;
        int i7;
        char c3;
        int i8;
        View childAt;
        int i9;
        int i10;
        int i11;
        int baseline;
        int i12;
        int iMakeMeasureSpec;
        int i13;
        View childAt2;
        D d2;
        int i14;
        View childAt3;
        D d3;
        float f3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z2;
        boolean z3;
        D d4;
        int measuredWidth;
        boolean z4;
        int i21;
        boolean z5;
        int i22;
        int measuredHeight;
        boolean z6;
        int baseline2;
        int iMax2;
        int i23;
        int i24;
        boolean z7;
        int i25;
        int i26;
        D d5;
        boolean z8;
        boolean z9;
        int iMax3;
        int i27 = -2;
        int i28 = 1073741824;
        int i29 = 8;
        int i30 = Integer.MIN_VALUE;
        float f4 = 0.0f;
        if (this.f2543h == 1) {
            this.f2545j = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int i31 = this.f2541f;
            boolean z10 = this.f2547l;
            int i32 = 0;
            float f5 = 0.0f;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z11 = false;
            int iMax6 = 0;
            int i33 = 0;
            int i34 = 0;
            boolean z12 = true;
            boolean z13 = false;
            while (i32 < virtualChildCount) {
                View childAt4 = getChildAt(i32);
                if (childAt4 == null) {
                    this.f2545j = this.f2545j;
                } else {
                    if (childAt4.getVisibility() != i29) {
                        if (g(i32)) {
                            this.f2545j += this.f2552q;
                        }
                        D d6 = (D) childAt4.getLayoutParams();
                        float f6 = d6.f2538a;
                        f5 += f6;
                        if (mode2 == i28 && ((ViewGroup.MarginLayoutParams) d6).height == 0 && f6 > f4) {
                            int i35 = this.f2545j;
                            this.f2545j = Math.max(i35, ((ViewGroup.MarginLayoutParams) d6).topMargin + i35 + ((ViewGroup.MarginLayoutParams) d6).bottomMargin);
                            d5 = d6;
                            z8 = true;
                        } else {
                            if (((ViewGroup.MarginLayoutParams) d6).height != 0 || f6 <= f4) {
                                i26 = Integer.MIN_VALUE;
                            } else {
                                ((ViewGroup.MarginLayoutParams) d6).height = i27;
                                i26 = 0;
                            }
                            int i36 = f5 == f4 ? this.f2545j : 0;
                            d5 = d6;
                            measureChildWithMargins(childAt4, i2, 0, i3, i36);
                            if (i26 != i30) {
                                ((ViewGroup.MarginLayoutParams) d5).height = i26;
                            }
                            int measuredHeight2 = childAt4.getMeasuredHeight();
                            int i37 = this.f2545j;
                            this.f2545j = Math.max(i37, i37 + measuredHeight2 + ((ViewGroup.MarginLayoutParams) d5).topMargin + ((ViewGroup.MarginLayoutParams) d5).bottomMargin);
                            int i38 = iMax6;
                            if (z10) {
                                iMax6 = Math.max(measuredHeight2, i38);
                            }
                            z8 = z11;
                        }
                        if (i31 >= 0 && i31 == i32 + 1) {
                            this.f2542g = this.f2545j;
                        }
                        float f7 = d5.f2538a;
                        if (i32 < i31 && f7 > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        mode = mode;
                        if (mode == 1073741824 || ((ViewGroup.MarginLayoutParams) d5).width != -1) {
                            z9 = false;
                        } else {
                            z9 = true;
                            z13 = true;
                        }
                        int i39 = ((ViewGroup.MarginLayoutParams) d5).leftMargin + ((ViewGroup.MarginLayoutParams) d5).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i39;
                        iMax3 = Math.max(i33, measuredWidth2);
                        int iCombineMeasuredStates = View.combineMeasuredStates(i34, childAt4.getMeasuredState());
                        boolean z14 = z12 && ((ViewGroup.MarginLayoutParams) d5).width == -1;
                        if (f7 > 0.0f) {
                            if (!z9) {
                                i39 = measuredWidth2;
                            }
                            iMax5 = Math.max(iMax5, i39);
                        } else {
                            int i40 = iMax5;
                            if (!z9) {
                                i39 = measuredWidth2;
                            }
                            iMax4 = Math.max(iMax4, i39);
                            iMax5 = i40;
                        }
                        z11 = z8;
                        i34 = iCombineMeasuredStates;
                        z12 = z14;
                    }
                    i32++;
                    i31 = i31;
                    i33 = iMax3;
                    mode2 = mode2;
                    virtualChildCount = virtualChildCount;
                    i27 = -2;
                    i28 = 1073741824;
                    i29 = 8;
                    i30 = Integer.MIN_VALUE;
                    f4 = 0.0f;
                }
                i31 = i31;
                mode2 = mode2;
                virtualChildCount = virtualChildCount;
                iMax3 = i33;
                i32++;
                i31 = i31;
                i33 = iMax3;
                mode2 = mode2;
                virtualChildCount = virtualChildCount;
                i27 = -2;
                i28 = 1073741824;
                i29 = 8;
                i30 = Integer.MIN_VALUE;
                f4 = 0.0f;
            }
            int i41 = mode2;
            int i42 = virtualChildCount;
            int iMax7 = iMax4;
            int i43 = iMax5;
            int i44 = iMax6;
            int i45 = i33;
            int iCombineMeasuredStates2 = i34;
            if (this.f2545j > 0 && g(i42)) {
                this.f2545j += this.f2552q;
            }
            int i46 = i41;
            if (z10 && (i46 == Integer.MIN_VALUE || i46 == 0)) {
                this.f2545j = 0;
                for (int i47 = 0; i47 < i42; i47++) {
                    View childAt5 = getChildAt(i47);
                    if (childAt5 == null) {
                        this.f2545j = this.f2545j;
                    } else if (childAt5.getVisibility() != 8) {
                        D d7 = (D) childAt5.getLayoutParams();
                        int i48 = this.f2545j;
                        this.f2545j = Math.max(i48, i48 + i44 + ((ViewGroup.MarginLayoutParams) d7).topMargin + ((ViewGroup.MarginLayoutParams) d7).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f2545j;
            this.f2545j = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, 0);
            int i49 = (16777215 & iResolveSizeAndState) - this.f2545j;
            if (z11 || (i49 != 0 && f5 > 0.0f)) {
                float f8 = this.f2546k;
                if (f8 > 0.0f) {
                    f5 = f8;
                }
                this.f2545j = 0;
                int i50 = 0;
                while (i50 < i42) {
                    View childAt6 = getChildAt(i50);
                    if (childAt6.getVisibility() != 8) {
                        D d8 = (D) childAt6.getLayoutParams();
                        float f9 = d8.f2538a;
                        if (f9 > 0.0f) {
                            int i51 = (int) ((i49 * f9) / f5);
                            f5 -= f9;
                            int i52 = i49 - i51;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) d8).leftMargin + ((ViewGroup.MarginLayoutParams) d8).rightMargin, ((ViewGroup.MarginLayoutParams) d8).width);
                            if (((ViewGroup.MarginLayoutParams) d8).height == 0) {
                                i25 = 1073741824;
                                if (i46 == 1073741824) {
                                    if (i51 <= 0) {
                                        i51 = 0;
                                    }
                                    childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i51, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt6.getMeasuredState() & (-256));
                                i49 = i52;
                            } else {
                                i25 = 1073741824;
                            }
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i51;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i25));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt6.getMeasuredState() & (-256));
                            i49 = i52;
                        }
                        int i53 = ((ViewGroup.MarginLayoutParams) d8).leftMargin + ((ViewGroup.MarginLayoutParams) d8).rightMargin;
                        int measuredWidth3 = childAt6.getMeasuredWidth() + i53;
                        int iMax8 = Math.max(i45, measuredWidth3);
                        if (mode != 1073741824) {
                            i23 = iMax8;
                            i24 = -1;
                            if (((ViewGroup.MarginLayoutParams) d8).width != -1) {
                            }
                            iMax7 = Math.max(iMax7, i53);
                            if (z12 || ((ViewGroup.MarginLayoutParams) d8).width != i24) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            int i54 = this.f2545j;
                            this.f2545j = Math.max(i54, childAt6.getMeasuredHeight() + i54 + ((ViewGroup.MarginLayoutParams) d8).topMargin + ((ViewGroup.MarginLayoutParams) d8).bottomMargin);
                            z12 = z7;
                            i45 = i23;
                        } else {
                            i23 = iMax8;
                            i24 = -1;
                        }
                        i53 = measuredWidth3;
                        iMax7 = Math.max(iMax7, i53);
                        if (z12) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        int i55 = this.f2545j;
                        this.f2545j = Math.max(i55, childAt6.getMeasuredHeight() + i55 + ((ViewGroup.MarginLayoutParams) d8).topMargin + ((ViewGroup.MarginLayoutParams) d8).bottomMargin);
                        z12 = z7;
                        i45 = i23;
                    }
                    i50++;
                    i46 = i46;
                }
                this.f2545j = getPaddingBottom() + getPaddingTop() + this.f2545j;
                iMax2 = iMax7;
            } else {
                iMax2 = Math.max(iMax7, i43);
                if (z10 && i46 != 1073741824) {
                    for (int i56 = 0; i56 < i42; i56++) {
                        View childAt7 = getChildAt(i56);
                        if (childAt7 != null && childAt7.getVisibility() != 8 && ((D) childAt7.getLayoutParams()).f2538a > 0.0f) {
                            childAt7.measure(View.MeasureSpec.makeMeasureSpec(childAt7.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i44, 1073741824));
                        }
                    }
                }
            }
            int i57 = i45;
            if (z12 || mode == 1073741824) {
                iMax2 = i57;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax2, getSuggestedMinimumWidth()), i2, iCombineMeasuredStates2), iResolveSizeAndState);
            if (z13) {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i58 = 0; i58 < i42; i58++) {
                    View childAt8 = getChildAt(i58);
                    if (childAt8.getVisibility() != 8) {
                        D d9 = (D) childAt8.getLayoutParams();
                        if (((ViewGroup.MarginLayoutParams) d9).width == -1) {
                            int i59 = ((ViewGroup.MarginLayoutParams) d9).height;
                            ((ViewGroup.MarginLayoutParams) d9).height = childAt8.getMeasuredHeight();
                            measureChildWithMargins(childAt8, iMakeMeasureSpec2, 0, i3, 0);
                            ((ViewGroup.MarginLayoutParams) d9).height = i59;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f2545j = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i2);
        int mode4 = View.MeasureSpec.getMode(i3);
        if (this.f2548m == null || this.f2549n == null) {
            this.f2548m = new int[4];
            this.f2549n = new int[4];
        }
        int[] iArr = this.f2548m;
        int[] iArr2 = this.f2549n;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z15 = this.f2540e;
        boolean z16 = this.f2547l;
        boolean z17 = mode3 == 1073741824;
        int iMax9 = 0;
        float f10 = 0.0f;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        int iMax10 = 0;
        int iMax11 = 0;
        boolean z18 = true;
        boolean z19 = false;
        boolean z20 = false;
        while (i61 < virtualChildCount2) {
            View childAt9 = getChildAt(i61);
            if (childAt9 == null) {
                this.f2545j = this.f2545j;
                i20 = i61;
                z2 = z16;
                z3 = z15;
            } else {
                int i63 = iMax9;
                int i64 = i60;
                if (childAt9.getVisibility() == 8) {
                    z3 = z15;
                    iMax9 = i63;
                    i60 = i64;
                    i20 = i61;
                    z2 = z16;
                } else {
                    if (g(i61)) {
                        this.f2545j += this.f2551p;
                    }
                    D d10 = (D) childAt9.getLayoutParams();
                    float f11 = d10.f2538a;
                    float f12 = f10 + f11;
                    if (mode3 == 1073741824 && ((ViewGroup.MarginLayoutParams) d10).width == 0 && f11 > 0.0f) {
                        if (z17) {
                            this.f2545j = ((ViewGroup.MarginLayoutParams) d10).leftMargin + ((ViewGroup.MarginLayoutParams) d10).rightMargin + this.f2545j;
                        } else {
                            int i65 = this.f2545j;
                            this.f2545j = Math.max(i65, ((ViewGroup.MarginLayoutParams) d10).leftMargin + i65 + ((ViewGroup.MarginLayoutParams) d10).rightMargin);
                        }
                        if (z15) {
                            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt9.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
                            d4 = d10;
                            i17 = i63;
                            i18 = i64;
                            i20 = i61;
                            z2 = z16;
                            z3 = z15;
                        } else {
                            d4 = d10;
                            i17 = i63;
                            i18 = i64;
                            i20 = i61;
                            i21 = 1073741824;
                            z2 = z16;
                            z3 = z15;
                            z4 = true;
                        }
                        if (mode4 == i21 && ((ViewGroup.MarginLayoutParams) d4).height == -1) {
                            z5 = true;
                            z20 = true;
                        } else {
                            z5 = false;
                        }
                        i22 = ((ViewGroup.MarginLayoutParams) d4).topMargin + ((ViewGroup.MarginLayoutParams) d4).bottomMargin;
                        measuredHeight = childAt9.getMeasuredHeight() + i22;
                        int iCombineMeasuredStates3 = View.combineMeasuredStates(i62, childAt9.getMeasuredState());
                        if (!z3 && (baseline2 = childAt9.getBaseline()) != -1) {
                            int i66 = d4.f2539b;
                            if (i66 < 0) {
                                i66 = this.f2544i;
                            }
                            int i67 = (((i66 & 112) >> 4) & (-2)) >> 1;
                            iArr[i67] = Math.max(iArr[i67], baseline2);
                            iArr2[i67] = Math.max(iArr2[i67], measuredHeight - baseline2);
                        }
                        int iMax12 = Math.max(i18, measuredHeight);
                        if (z18 || ((ViewGroup.MarginLayoutParams) d4).height != -1) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (d4.f2538a > 0.0f) {
                            if (z5) {
                                measuredHeight = i22;
                            }
                            iMax11 = Math.max(iMax11, measuredHeight);
                            iMax9 = i17;
                        } else {
                            if (z5) {
                                measuredHeight = i22;
                            }
                            iMax9 = Math.max(i17, measuredHeight);
                        }
                        i60 = iMax12;
                        i62 = iCombineMeasuredStates3;
                        z19 = z4;
                        z18 = z6;
                        f10 = f12;
                    } else {
                        int i68 = i61;
                        if (((ViewGroup.MarginLayoutParams) d10).width == 0) {
                            f3 = 0.0f;
                            if (f11 > 0.0f) {
                                ((ViewGroup.MarginLayoutParams) d10).width = -2;
                                i15 = 0;
                            }
                            if (f12 == f3) {
                                i16 = this.f2545j;
                            } else {
                                i16 = 0;
                            }
                            i17 = i63;
                            i18 = i64;
                            i19 = i15;
                            i20 = i68;
                            z2 = z16;
                            z3 = z15;
                            measureChildWithMargins(childAt9, i2, i16, i3, 0);
                            if (i19 != Integer.MIN_VALUE) {
                                d4 = d10;
                                ((ViewGroup.MarginLayoutParams) d4).width = i19;
                            } else {
                                d4 = d10;
                            }
                            measuredWidth = childAt9.getMeasuredWidth();
                            if (z17) {
                                this.f2545j = ((ViewGroup.MarginLayoutParams) d4).leftMargin + measuredWidth + ((ViewGroup.MarginLayoutParams) d4).rightMargin + this.f2545j;
                            } else {
                                int i69 = this.f2545j;
                                this.f2545j = Math.max(i69, i69 + measuredWidth + ((ViewGroup.MarginLayoutParams) d4).leftMargin + ((ViewGroup.MarginLayoutParams) d4).rightMargin);
                            }
                            if (z2) {
                                iMax10 = Math.max(measuredWidth, iMax10);
                            }
                        } else {
                            f3 = 0.0f;
                        }
                        i15 = Integer.MIN_VALUE;
                        if (f12 == f3) {
                            i16 = this.f2545j;
                        } else {
                            i16 = 0;
                        }
                        i17 = i63;
                        i18 = i64;
                        i19 = i15;
                        i20 = i68;
                        z2 = z16;
                        z3 = z15;
                        measureChildWithMargins(childAt9, i2, i16, i3, 0);
                        if (i19 != Integer.MIN_VALUE) {
                            d4 = d10;
                            ((ViewGroup.MarginLayoutParams) d4).width = i19;
                        } else {
                            d4 = d10;
                        }
                        measuredWidth = childAt9.getMeasuredWidth();
                        if (z17) {
                            this.f2545j = ((ViewGroup.MarginLayoutParams) d4).leftMargin + measuredWidth + ((ViewGroup.MarginLayoutParams) d4).rightMargin + this.f2545j;
                        } else {
                            int i610 = this.f2545j;
                            this.f2545j = Math.max(i610, i610 + measuredWidth + ((ViewGroup.MarginLayoutParams) d4).leftMargin + ((ViewGroup.MarginLayoutParams) d4).rightMargin);
                        }
                        if (z2) {
                            iMax10 = Math.max(measuredWidth, iMax10);
                        }
                    }
                    z4 = z19;
                    i21 = 1073741824;
                    if (mode4 == i21) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    i22 = ((ViewGroup.MarginLayoutParams) d4).topMargin + ((ViewGroup.MarginLayoutParams) d4).bottomMargin;
                    measuredHeight = childAt9.getMeasuredHeight() + i22;
                    int iCombineMeasuredStates4 = View.combineMeasuredStates(i62, childAt9.getMeasuredState());
                    if (!z3) {
                    }
                    int iMax13 = Math.max(i18, measuredHeight);
                    if (z18) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    if (d4.f2538a > 0.0f) {
                        if (z5) {
                            measuredHeight = i22;
                        }
                        iMax11 = Math.max(iMax11, measuredHeight);
                        iMax9 = i17;
                    } else {
                        if (z5) {
                            measuredHeight = i22;
                        }
                        iMax9 = Math.max(i17, measuredHeight);
                    }
                    i60 = iMax13;
                    i62 = iCombineMeasuredStates4;
                    z19 = z4;
                    z18 = z6;
                    f10 = f12;
                }
            }
            i61 = i20 + 1;
            z16 = z2;
            z15 = z3;
        }
        int i70 = i60;
        boolean z21 = z16;
        boolean z22 = z15;
        if (this.f2545j > 0 && g(virtualChildCount2)) {
            this.f2545j += this.f2551p;
        }
        int i71 = iArr[1];
        if (i71 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c2 = 3;
            if (iArr[3] == -1) {
                iMax = i70;
            }
            if (z21 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                this.f2545j = 0;
                for (i14 = 0; i14 < virtualChildCount2; i14++) {
                    childAt3 = getChildAt(i14);
                    if (childAt3 == null) {
                        this.f2545j = this.f2545j;
                    } else if (childAt3.getVisibility() == 8) {
                        d3 = (D) childAt3.getLayoutParams();
                        if (z17) {
                            this.f2545j = ((ViewGroup.MarginLayoutParams) d3).leftMargin + iMax10 + ((ViewGroup.MarginLayoutParams) d3).rightMargin + this.f2545j;
                        } else {
                            int i72 = this.f2545j;
                            this.f2545j = Math.max(i72, i72 + iMax10 + ((ViewGroup.MarginLayoutParams) d3).leftMargin + ((ViewGroup.MarginLayoutParams) d3).rightMargin);
                        }
                    }
                }
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f2545j;
            this.f2545j = paddingRight;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, 0);
            i4 = (16777215 & iResolveSizeAndState2) - this.f2545j;
            if (!z19 || (i4 != 0 && f10 > 0.0f)) {
                f2 = this.f2546k;
                if (f2 > 0.0f) {
                    f10 = f2;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                this.f2545j = 0;
                int iCombineMeasuredStates5 = i62;
                iMax = -1;
                i5 = 0;
                while (i5 < virtualChildCount2) {
                    childAt = getChildAt(i5);
                    if (childAt != null || childAt.getVisibility() == 8) {
                        i9 = i4;
                        virtualChildCount2 = virtualChildCount2;
                    } else {
                        D d11 = (D) childAt.getLayoutParams();
                        float f13 = d11.f2538a;
                        if (f13 > 0.0f) {
                            int i73 = (int) ((i4 * f13) / f10);
                            float f14 = f10 - f13;
                            int i74 = i4 - i73;
                            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) d11).topMargin + ((ViewGroup.MarginLayoutParams) d11).bottomMargin, ((ViewGroup.MarginLayoutParams) d11).height);
                            if (((ViewGroup.MarginLayoutParams) d11).width == 0) {
                                i12 = 1073741824;
                                if (mode3 == 1073741824) {
                                    if (i73 <= 0) {
                                        i73 = 0;
                                    }
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i73, 1073741824), childMeasureSpec2);
                                }
                                iCombineMeasuredStates5 = View.combineMeasuredStates(iCombineMeasuredStates5, childAt.getMeasuredState() & (-16777216));
                                f10 = f14;
                                i10 = i74;
                            } else {
                                i12 = 1073741824;
                            }
                            int measuredWidth4 = childAt.getMeasuredWidth() + i73;
                            if (measuredWidth4 < 0) {
                                measuredWidth4 = 0;
                            }
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i12), childMeasureSpec2);
                            iCombineMeasuredStates5 = View.combineMeasuredStates(iCombineMeasuredStates5, childAt.getMeasuredState() & (-16777216));
                            f10 = f14;
                            i10 = i74;
                        } else {
                            i10 = i4;
                        }
                        if (z17) {
                            this.f2545j = childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) d11).leftMargin + ((ViewGroup.MarginLayoutParams) d11).rightMargin + this.f2545j;
                        } else {
                            int i75 = this.f2545j;
                            this.f2545j = Math.max(i75, childAt.getMeasuredWidth() + i75 + ((ViewGroup.MarginLayoutParams) d11).leftMargin + ((ViewGroup.MarginLayoutParams) d11).rightMargin);
                        }
                        boolean z23 = mode4 != 1073741824 && ((ViewGroup.MarginLayoutParams) d11).height == -1;
                        int i76 = ((ViewGroup.MarginLayoutParams) d11).topMargin + ((ViewGroup.MarginLayoutParams) d11).bottomMargin;
                        int measuredHeight4 = childAt.getMeasuredHeight() + i76;
                        iMax = Math.max(iMax, measuredHeight4);
                        if (!z23) {
                            i76 = measuredHeight4;
                        }
                        iMax9 = Math.max(iMax9, i76);
                        if (z18) {
                            i11 = -1;
                            boolean z24 = ((ViewGroup.MarginLayoutParams) d11).height == -1;
                            if (!z22 && (baseline = childAt.getBaseline()) != i11) {
                                int i77 = d11.f2539b;
                                if (i77 < 0) {
                                    i77 = this.f2544i;
                                }
                                int i78 = (((i77 & 112) >> 4) & (-2)) >> 1;
                                iArr[i78] = Math.max(iArr[i78], baseline);
                                iArr2[i78] = Math.max(iArr2[i78], measuredHeight4 - baseline);
                            }
                            z18 = z24;
                            i9 = i10;
                            f10 = f10;
                        } else {
                            i11 = -1;
                        }
                        if (!z22) {
                        }
                        z18 = z24;
                        i9 = i10;
                        f10 = f10;
                    }
                    i5++;
                    i4 = i9;
                    virtualChildCount2 = virtualChildCount2;
                }
                i6 = virtualChildCount2;
                this.f2545j = getPaddingRight() + getPaddingLeft() + this.f2545j;
                i7 = iArr[1];
                if (i7 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                    c3 = 3;
                    if (iArr[3] == -1) {
                        i8 = 0;
                    }
                    i62 = iCombineMeasuredStates5;
                } else {
                    c3 = 3;
                }
                i8 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i7, iArr[2]))));
                i62 = iCombineMeasuredStates5;
            } else {
                iMax9 = Math.max(iMax9, iMax11);
                if (z21 && mode3 != 1073741824) {
                    for (int i79 = 0; i79 < virtualChildCount2; i79++) {
                        View childAt10 = getChildAt(i79);
                        if (childAt10 != null && childAt10.getVisibility() != 8 && ((D) childAt10.getLayoutParams()).f2538a > 0.0f) {
                            childAt10.measure(View.MeasureSpec.makeMeasureSpec(iMax10, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
                i6 = virtualChildCount2;
                i8 = 0;
            }
            if (z18 || mode4 == 1073741824) {
                iMax9 = iMax;
            }
            setMeasuredDimension((i62 & (-16777216)) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax9, getSuggestedMinimumHeight()), i3, i62 << 16));
            if (z20) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                i13 = i6;
                while (i8 < i13) {
                    childAt2 = getChildAt(i8);
                    if (childAt2.getVisibility() != 8) {
                        d2 = (D) childAt2.getLayoutParams();
                        if (((ViewGroup.MarginLayoutParams) d2).height == -1) {
                            int i80 = ((ViewGroup.MarginLayoutParams) d2).width;
                            ((ViewGroup.MarginLayoutParams) d2).width = childAt2.getMeasuredWidth();
                            measureChildWithMargins(childAt2, i2, 0, iMakeMeasureSpec, 0);
                            ((ViewGroup.MarginLayoutParams) d2).width = i80;
                        }
                    }
                    i8++;
                }
            }
        }
        c2 = 3;
        iMax = Math.max(i70, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i71, iArr[2]))));
        if (z21) {
            this.f2545j = 0;
            while (i14 < virtualChildCount2) {
                childAt3 = getChildAt(i14);
                if (childAt3 == null) {
                    this.f2545j = this.f2545j;
                } else if (childAt3.getVisibility() == 8) {
                    d3 = (D) childAt3.getLayoutParams();
                    if (z17) {
                        this.f2545j = ((ViewGroup.MarginLayoutParams) d3).leftMargin + iMax10 + ((ViewGroup.MarginLayoutParams) d3).rightMargin + this.f2545j;
                    } else {
                        int i710 = this.f2545j;
                        this.f2545j = Math.max(i710, i710 + iMax10 + ((ViewGroup.MarginLayoutParams) d3).leftMargin + ((ViewGroup.MarginLayoutParams) d3).rightMargin);
                    }
                }
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f2545j;
        this.f2545j = paddingRight2;
        int iResolveSizeAndState3 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i2, 0);
        i4 = (16777215 & iResolveSizeAndState3) - this.f2545j;
        if (z19) {
            f2 = this.f2546k;
            if (f2 > 0.0f) {
                f10 = f2;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f2545j = 0;
            int iCombineMeasuredStates6 = i62;
            iMax = -1;
            i5 = 0;
            while (i5 < virtualChildCount2) {
                childAt = getChildAt(i5);
                if (childAt != null) {
                    i9 = i4;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    i9 = i4;
                    virtualChildCount2 = virtualChildCount2;
                }
                i5++;
                i4 = i9;
                virtualChildCount2 = virtualChildCount2;
            }
            i6 = virtualChildCount2;
            this.f2545j = getPaddingRight() + getPaddingLeft() + this.f2545j;
            i7 = iArr[1];
            if (i7 != -1) {
                c3 = 3;
                i8 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i7, iArr[2]))));
            } else {
                c3 = 3;
                i8 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i7, iArr[2]))));
            }
            i62 = iCombineMeasuredStates6;
        } else {
            f2 = this.f2546k;
            if (f2 > 0.0f) {
                f10 = f2;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f2545j = 0;
            int iCombineMeasuredStates7 = i62;
            iMax = -1;
            i5 = 0;
            while (i5 < virtualChildCount2) {
                childAt = getChildAt(i5);
                if (childAt != null) {
                    i9 = i4;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    i9 = i4;
                    virtualChildCount2 = virtualChildCount2;
                }
                i5++;
                i4 = i9;
                virtualChildCount2 = virtualChildCount2;
            }
            i6 = virtualChildCount2;
            this.f2545j = getPaddingRight() + getPaddingLeft() + this.f2545j;
            i7 = iArr[1];
            if (i7 != -1) {
                c3 = 3;
                i8 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i7, iArr[2]))));
            } else {
                c3 = 3;
                i8 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i7, iArr[2]))));
            }
            i62 = iCombineMeasuredStates7;
        }
        if (z18) {
            iMax9 = iMax;
        } else {
            iMax9 = iMax;
        }
        setMeasuredDimension((i62 & (-16777216)) | iResolveSizeAndState3, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax9, getSuggestedMinimumHeight()), i3, i62 << 16));
        if (z20) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            i13 = i6;
            while (i8 < i13) {
                childAt2 = getChildAt(i8);
                if (childAt2.getVisibility() != 8) {
                    d2 = (D) childAt2.getLayoutParams();
                    if (((ViewGroup.MarginLayoutParams) d2).height == -1) {
                        int i81 = ((ViewGroup.MarginLayoutParams) d2).width;
                        ((ViewGroup.MarginLayoutParams) d2).width = childAt2.getMeasuredWidth();
                        measureChildWithMargins(childAt2, i2, 0, iMakeMeasureSpec, 0);
                        ((ViewGroup.MarginLayoutParams) d2).width = i81;
                    }
                }
                i8++;
            }
        }
    }

    public void setBaselineAligned(boolean z2) {
        this.f2540e = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f2541f = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2550o) {
            return;
        }
        this.f2550o = drawable;
        if (drawable != null) {
            this.f2551p = drawable.getIntrinsicWidth();
            this.f2552q = drawable.getIntrinsicHeight();
        } else {
            this.f2551p = 0;
            this.f2552q = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f2554s = i2;
    }

    public void setGravity(int i2) {
        if (this.f2544i != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f2544i = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f2544i;
        if ((8388615 & i4) != i3) {
            this.f2544i = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f2547l = z2;
    }

    public void setOrientation(int i2) {
        if (this.f2543h != i2) {
            this.f2543h = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f2553r) {
            requestLayout();
        }
        this.f2553r = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f2544i;
        if ((i4 & 112) != i3) {
            this.f2544i = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f2546k = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
