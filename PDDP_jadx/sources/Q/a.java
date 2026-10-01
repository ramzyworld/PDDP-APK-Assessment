package Q;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f584a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f585b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f586c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f587d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f588e = {R.attr.drawable};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f589f = {R.attr.name, R.attr.animation};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f590g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f591h = {R.attr.ordering};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f592i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f593j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f594k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i2) throws XmlPullParserException, IOException {
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        String str;
        PropertyValuesHolder propertyValuesHolderB;
        int size;
        int i3;
        int i4;
        Keyframe keyframeOfFloat;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        int depth = xmlResourceParser.getDepth();
        Animator animatorD = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlResourceParser.next();
            boolean z2 = false;
            int i5 = 3;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i6 = 1;
            if (next == 1) {
                break;
            }
            int i7 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    d(context, resources, theme, attributeSet, objectAnimator, xmlResourceParser);
                    animatorD = objectAnimator;
                } else if (name.equals("animator")) {
                    animatorD = d(context, resources, theme, attributeSet, null, xmlResourceParser);
                } else if (name.equals("set")) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    TypedArray typedArrayH = p029q.b.h(resources2, theme2, attributeSet, f591h);
                    a(context, resources, theme, xmlResourceParser, attributeSet, animatorSet2, !p029q.b.e(xmlResourceParser2, "ordering") ? 0 : typedArrayH.getInt(0, 0));
                    typedArrayH.recycle();
                    animatorD = animatorSet2;
                } else {
                    String str2 = "propertyValuesHolder";
                    if (!name.equals("propertyValuesHolder")) {
                        throw new RuntimeException("Unknown animator name: " + xmlResourceParser.getName());
                    }
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                    ArrayList arrayList2 = null;
                    while (true) {
                        int eventType = xmlResourceParser.getEventType();
                        if (eventType == i5 || eventType == i6) {
                            break;
                        }
                        if (eventType != i7) {
                            xmlResourceParser.next();
                        } else {
                            if (xmlResourceParser.getName().equals(str2)) {
                                TypedArray typedArrayH2 = p029q.b.h(resources2, theme2, attributeSetAsAttributeSet, f592i);
                                String strC = p029q.b.c(typedArrayH2, xmlResourceParser2, "propertyName", i5);
                                int i8 = !p029q.b.e(xmlResourceParser2, "valueType") ? 4 : typedArrayH2.getInt(i7, 4);
                                int i9 = i8;
                                ArrayList arrayList3 = null;
                                while (true) {
                                    int next2 = xmlResourceParser.next();
                                    attributeSet2 = attributeSetAsAttributeSet;
                                    if (next2 == i5 || next2 == 1) {
                                        break;
                                    }
                                    if (xmlResourceParser.getName().equals("keyframe")) {
                                        int[] iArr = f593j;
                                        i4 = i9;
                                        if (i4 == 4) {
                                            TypedArray typedArrayH3 = p029q.b.h(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                            TypedValue typedValuePeekValue = !p029q.b.e(xmlResourceParser2, "value") ? null : typedArrayH3.peekValue(0);
                                            int i10 = (typedValuePeekValue == null || !c(typedValuePeekValue.type)) ? 0 : 3;
                                            typedArrayH3.recycle();
                                            i4 = i10;
                                        }
                                        TypedArray typedArrayH4 = p029q.b.h(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                        float f2 = p029q.b.e(xmlResourceParser2, "fraction") ? typedArrayH4.getFloat(3, -1.0f) : -1.0f;
                                        TypedValue typedValuePeekValue2 = !p029q.b.e(xmlResourceParser2, "value") ? null : typedArrayH4.peekValue(0);
                                        boolean z3 = typedValuePeekValue2 != null;
                                        int i11 = i4 == 4 ? (z3 && c(typedValuePeekValue2.type)) ? 3 : 0 : i4;
                                        if (!z3) {
                                            keyframeOfFloat = i11 == 0 ? Keyframe.ofFloat(f2) : Keyframe.ofInt(f2);
                                        } else if (i11 == 0) {
                                            keyframeOfFloat = Keyframe.ofFloat(f2, !p029q.b.e(xmlResourceParser2, "value") ? 0.0f : typedArrayH4.getFloat(0, 0.0f));
                                        } else if (i11 == 1 || i11 == 3) {
                                            keyframeOfFloat = Keyframe.ofInt(f2, !p029q.b.e(xmlResourceParser2, "value") ? 0 : typedArrayH4.getInt(0, 0));
                                        } else {
                                            keyframeOfFloat = null;
                                        }
                                        int resourceId = !p029q.b.e(xmlResourceParser2, "interpolator") ? 0 : typedArrayH4.getResourceId(1, 0);
                                        if (resourceId > 0) {
                                            keyframeOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                        }
                                        typedArrayH4.recycle();
                                        if (keyframeOfFloat != null) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(keyframeOfFloat);
                                        }
                                        xmlResourceParser.next();
                                    } else {
                                        i4 = i9;
                                    }
                                    resources2 = resources;
                                    theme2 = theme;
                                    str2 = str2;
                                    attributeSetAsAttributeSet = attributeSet2;
                                    i9 = i4;
                                    i5 = 3;
                                }
                                int i12 = i9;
                                str = str2;
                                if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                    propertyValuesHolderB = null;
                                } else {
                                    Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                    Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                    float fraction = keyframe2.getFraction();
                                    if (fraction < 1.0f) {
                                        if (fraction < 0.0f) {
                                            keyframe2.setFraction(1.0f);
                                        } else {
                                            arrayList3.add(arrayList3.size(), keyframe2.getType() == Float.TYPE ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == Integer.TYPE ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                            size++;
                                        }
                                    }
                                    float fraction2 = keyframe.getFraction();
                                    if (fraction2 != 0.0f) {
                                        if (fraction2 < 0.0f) {
                                            keyframe.setFraction(0.0f);
                                        } else {
                                            arrayList3.add(0, keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(0.0f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                            size++;
                                        }
                                    }
                                    Keyframe[] keyframeArr = new Keyframe[size];
                                    arrayList3.toArray(keyframeArr);
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Keyframe keyframe3 = keyframeArr[i13];
                                        if (keyframe3.getFraction() >= 0.0f) {
                                            i3 = size;
                                        } else {
                                            if (i13 == 0) {
                                                keyframe3.setFraction(0.0f);
                                            } else {
                                                int i14 = size - 1;
                                                if (i13 == i14) {
                                                    keyframe3.setFraction(1.0f);
                                                } else {
                                                    int i15 = i13;
                                                    for (int i16 = i13 + 1; i16 < i14 && keyframeArr[i16].getFraction() < 0.0f; i16++) {
                                                        i15 = i16;
                                                    }
                                                    float fraction3 = (keyframeArr[i15 + 1].getFraction() - keyframeArr[i13 - 1].getFraction()) / ((i15 - i13) + 2);
                                                    int i17 = i13;
                                                    while (i17 <= i15) {
                                                        keyframeArr[i17].setFraction(keyframeArr[i17 - 1].getFraction() + fraction3);
                                                        i17++;
                                                        size = size;
                                                    }
                                                    i3 = size;
                                                }
                                            }
                                            i3 = size;
                                        }
                                        i13++;
                                        size = i3;
                                    }
                                    propertyValuesHolderB = PropertyValuesHolder.ofKeyframe(strC, keyframeArr);
                                    if (i12 == 3) {
                                        propertyValuesHolderB.setEvaluator(g.f606a);
                                    }
                                }
                                if (propertyValuesHolderB == null) {
                                    propertyValuesHolderB = b(typedArrayH2, i8, 0, 1, strC);
                                }
                                if (propertyValuesHolderB != null) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    arrayList2.add(propertyValuesHolderB);
                                }
                                typedArrayH2.recycle();
                            } else {
                                attributeSet2 = attributeSetAsAttributeSet;
                                str = str2;
                            }
                            xmlResourceParser.next();
                            resources2 = resources;
                            theme2 = theme;
                            xmlResourceParser2 = xmlResourceParser;
                            str2 = str;
                            attributeSetAsAttributeSet = attributeSet2;
                            i5 = 3;
                            i6 = 1;
                            i7 = 2;
                        }
                    }
                    if (arrayList2 != null) {
                        int size2 = arrayList2.size();
                        propertyValuesHolderArr = new PropertyValuesHolder[size2];
                        for (int i18 = 0; i18 < size2; i18++) {
                            propertyValuesHolderArr[i18] = (PropertyValuesHolder) arrayList2.get(i18);
                        }
                    } else {
                        propertyValuesHolderArr = null;
                    }
                    if (propertyValuesHolderArr != null && (animatorD instanceof ValueAnimator)) {
                        ((ValueAnimator) animatorD).setValues(propertyValuesHolderArr);
                    }
                    z2 = true;
                }
                if (animatorSet != null && !z2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(animatorD);
                }
                resources2 = resources;
                theme2 = theme;
                xmlResourceParser2 = xmlResourceParser;
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i19 = 0;
            while (it.hasNext()) {
                animatorArr[i19] = (Animator) it.next();
                i19++;
            }
            if (i2 == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return animatorD;
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i2, int i3, int i4, String str) {
        int color;
        int color2;
        int color3;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue != null;
        int i5 = z2 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i4);
        boolean z3 = typedValuePeekValue2 != null;
        int i6 = z3 ? typedValuePeekValue2.type : 0;
        if (i2 == 4) {
            i2 = ((z2 && c(i5)) || (z3 && c(i6))) ? 3 : 0;
        }
        boolean z4 = i2 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i2 == 2) {
            String string = typedArray.getString(i3);
            String string2 = typedArray.getString(i4);
            p031r.d[] dVarArrM = p000a.a.m(string);
            p031r.d[] dVarArrM2 = p000a.a.m(string2);
            if (dVarArrM == null && dVarArrM2 == null) {
                return null;
            }
            if (dVarArrM == null) {
                if (dVarArrM2 != null) {
                    return PropertyValuesHolder.ofObject(str, new f(), dVarArrM2);
                }
                return null;
            }
            f fVar = new f();
            if (dVarArrM2 == null) {
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, fVar, dVarArrM);
            } else {
                if (!p000a.a.b(dVarArrM, dVarArrM2)) {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, fVar, dVarArrM, dVarArrM2);
            }
            return propertyValuesHolderOfObject;
        }
        g gVar = i2 == 3 ? g.f606a : null;
        if (z4) {
            if (z2) {
                float dimension = i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f);
                if (z3) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z2) {
            if (i5 == 5) {
                color2 = (int) typedArray.getDimension(i3, 0.0f);
            } else {
                color2 = c(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
            }
            if (z3) {
                if (i6 == 5) {
                    color3 = (int) typedArray.getDimension(i4, 0.0f);
                } else {
                    color3 = c(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (z3) {
            if (i6 == 5) {
                color = (int) typedArray.getDimension(i4, 0.0f);
            } else {
                color = c(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt == null || gVar == null) {
            return propertyValuesHolderOfInt;
        }
        propertyValuesHolderOfInt.setEvaluator(gVar);
        return propertyValuesHolderOfInt;
    }

    public static boolean c(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:103:0x0203  */
    /* JADX WARN: Code duplicated, block: B:105:0x020b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0217  */
    /* JADX WARN: Code duplicated, block: B:109:0x021e  */
    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        int i2;
        TypedArray typedArray2;
        int resourceId;
        ValueAnimator valueAnimator2;
        int i3 = 1;
        TypedArray typedArrayH = p029q.b.h(resources, theme, attributeSet, f590g);
        TypedArray typedArrayH2 = p029q.b.h(resources, theme, attributeSet, f594k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j2 = p029q.b.e(xmlResourceParser, "duration") ? typedArrayH.getInt(1, 300) : 300;
        long j3 = !p029q.b.e(xmlResourceParser, "startOffset") ? 0 : typedArrayH.getInt(2, 0);
        int i4 = !p029q.b.e(xmlResourceParser, "valueType") ? 4 : typedArrayH.getInt(7, 4);
        if (p029q.b.e(xmlResourceParser, "valueFrom") && p029q.b.e(xmlResourceParser, "valueTo")) {
            if (i4 == 4) {
                TypedValue typedValuePeekValue = typedArrayH.peekValue(5);
                boolean z2 = typedValuePeekValue != null;
                int i5 = z2 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayH.peekValue(6);
                boolean z3 = typedValuePeekValue2 != null;
                i4 = ((z2 && c(i5)) || (z3 && c(z3 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderB = b(typedArrayH, i4, 5, 6, "");
            if (propertyValuesHolderB != null) {
                valueAnimator3.setValues(propertyValuesHolderB);
            }
        }
        valueAnimator3.setDuration(j2);
        valueAnimator3.setStartDelay(j3);
        valueAnimator3.setRepeatCount(!p029q.b.e(xmlResourceParser, "repeatCount") ? 0 : typedArrayH.getInt(3, 0));
        valueAnimator3.setRepeatMode(!p029q.b.e(xmlResourceParser, "repeatMode") ? 1 : typedArrayH.getInt(4, 1));
        if (typedArrayH2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strC = p029q.b.c(typedArrayH2, xmlResourceParser, "pathData", 1);
            if (strC != null) {
                String strC2 = p029q.b.c(typedArrayH2, xmlResourceParser, "propertyXName", 2);
                String strC3 = p029q.b.c(typedArrayH2, xmlResourceParser, "propertyYName", 3);
                if (strC2 == null && strC3 == null) {
                    throw new InflateException(typedArrayH2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path path = new Path();
                try {
                    p031r.d.b(p000a.a.m(strC), path);
                    PathMeasure pathMeasure = new PathMeasure(path, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.0f));
                    float length = 0.0f;
                    while (true) {
                        length += pathMeasure.getLength();
                        arrayList.add(Float.valueOf(length));
                        if (!pathMeasure.nextContour()) {
                            break;
                        }
                        valueAnimator3 = valueAnimator3;
                        i3 = 1;
                    }
                    PathMeasure pathMeasure2 = new PathMeasure(path, false);
                    int iMin = Math.min(100, ((int) (length / 0.5f)) + i3);
                    float[] fArr = new float[iMin];
                    float[] fArr2 = new float[iMin];
                    float[] fArr3 = new float[2];
                    float f2 = length / (iMin - 1);
                    valueAnimator = valueAnimator3;
                    typedArray = typedArrayH;
                    int i6 = 0;
                    int i7 = 0;
                    float f3 = 0.0f;
                    while (true) {
                        if (i7 >= iMin) {
                            break;
                        }
                        int i8 = iMin;
                        pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i6)).floatValue(), fArr3, null);
                        fArr[i7] = fArr3[0];
                        fArr2[i7] = fArr3[1];
                        f3 += f2;
                        int i9 = i6 + 1;
                        if (i9 < arrayList.size() && f3 > ((Float) arrayList.get(i9)).floatValue()) {
                            pathMeasure2.nextContour();
                            i6 = i9;
                        }
                        i7++;
                        iMin = i8;
                    }
                    PropertyValuesHolder propertyValuesHolderOfFloat = strC2 != null ? PropertyValuesHolder.ofFloat(strC2, fArr) : null;
                    PropertyValuesHolder propertyValuesHolderOfFloat2 = strC3 != null ? PropertyValuesHolder.ofFloat(strC3, fArr2) : null;
                    if (propertyValuesHolderOfFloat == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                    } else if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                } catch (RuntimeException e2) {
                    throw new RuntimeException("Error in parsing ".concat(strC), e2);
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = typedArrayH;
                i2 = 0;
                objectAnimator2.setPropertyName(p029q.b.c(typedArrayH2, xmlResourceParser, "propertyName", 0));
            }
            if (p029q.b.e(xmlResourceParser, "interpolator")) {
                typedArray2 = typedArray;
                resourceId = typedArray2.getResourceId(i2, i2);
            } else {
                typedArray2 = typedArray;
                resourceId = 0;
            }
            if (resourceId > 0) {
                valueAnimator2 = valueAnimator;
                valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
            } else {
                valueAnimator2 = valueAnimator;
            }
            typedArray2.recycle();
            if (typedArrayH2 != null) {
                typedArrayH2.recycle();
            }
            return valueAnimator2;
        }
        valueAnimator = valueAnimator3;
        typedArray = typedArrayH;
        i2 = 0;
        if (p029q.b.e(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
            resourceId = 0;
        } else {
            typedArray2 = typedArray;
            resourceId = typedArray2.getResourceId(i2, i2);
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (typedArrayH2 != null) {
            typedArrayH2.recycle();
        }
        return valueAnimator2;
    }
}
