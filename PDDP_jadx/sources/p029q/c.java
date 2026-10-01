package p029q;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.deeprf.pddp.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
import p026o.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2987a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i2;
        int iF;
        float f2;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == r4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr2 = a.f2886a;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i3, i3);
                int resourceId = typedArrayObtainAttributes.getResourceId(i3, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f2987a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, (boolean) r4);
                    int i5 = typedValue.type;
                    if (i5 < 28 || i5 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = typedArrayObtainAttributes.getColor(i3, -65281);
                        }
                    } else {
                        color = typedArrayObtainAttributes.getColor(i3, -65281);
                    }
                } else {
                    color = typedArrayObtainAttributes.getColor(i3, -65281);
                }
                float f3 = typedArrayObtainAttributes.hasValue(r4) ? typedArrayObtainAttributes.getFloat(r4, 1.0f) : typedArrayObtainAttributes.hasValue(3) ? typedArrayObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                float f4 = (Build.VERSION.SDK_INT < 31 || !typedArrayObtainAttributes.hasValue(2)) ? typedArrayObtainAttributes.getFloat(4, -1.0f) : typedArrayObtainAttributes.getFloat(2, -1.0f);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i6 = 0;
                for (int i7 = 0; i7 < attributeCount; i7++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i7);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i8 = i6 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i7, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i6] = attributeNameResource;
                        i6 = i8;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i6);
                boolean z2 = f4 >= 0.0f && f4 <= 100.0f;
                if (f3 != 1.0f || z2) {
                    int iAlpha = (int) ((Color.alpha(color) * f3) + 0.5f);
                    if (iAlpha < 0) {
                        i2 = 0;
                    } else {
                        i2 = 255;
                        if (iAlpha <= 255) {
                            i2 = iAlpha;
                        }
                    }
                    if (z2) {
                        a aVarA = a.a(color);
                        o oVar = o.f3010k;
                        float f5 = aVarA.f2978b;
                        if (f5 >= 1.0d && Math.round(f4) > 0.0d && Math.round(f4) < 100.0d) {
                            float f6 = aVarA.f2977a;
                            float fMin = f6 < 0.0f ? 0.0f : Math.min(360.0f, f6);
                            float f7 = f5;
                            a aVar = null;
                            boolean z3 = true;
                            float f8 = 0.0f;
                            while (true) {
                                if (Math.abs(f8 - f5) < 0.4f) {
                                    depth2 = depth2;
                                    if (aVar != null) {
                                        iF = aVar.c(oVar);
                                        break;
                                    }
                                    iF = b.f(f4);
                                    break;
                                }
                                float f9 = 1000.0f;
                                float f10 = 1000.0f;
                                float f11 = 0.0f;
                                float f12 = 100.0f;
                                a aVar2 = null;
                                while (true) {
                                    if (Math.abs(f11 - f12) <= 0.01f) {
                                        depth2 = depth2;
                                        fMin = fMin;
                                        break;
                                    }
                                    float f13 = ((f12 - f11) / 2.0f) + f11;
                                    int iC = a.b(f13, f7, fMin).c(o.f3010k);
                                    float fG = b.g(Color.red(iC));
                                    float fG2 = b.g(Color.green(iC));
                                    float fG3 = b.g(Color.blue(iC));
                                    float[] fArr = b.f2986d[1];
                                    float f14 = ((fG3 * fArr[2]) + ((fG2 * fArr[1]) + (fG * fArr[0]))) / 100.0f;
                                    float fCbrt = f14 <= 0.008856452f ? f14 * 903.2963f : (((float) Math.cbrt(f14)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f4 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        a aVarA2 = a.a(iC);
                                        a aVarB = a.b(aVarA2.f2979c, aVarA2.f2978b, fMin);
                                        f2 = f13;
                                        float f15 = aVarA2.f2980d - aVarB.f2980d;
                                        fMin = fMin;
                                        float f16 = aVarA2.f2981e - aVarB.f2981e;
                                        float f17 = aVarA2.f2982f - aVarB.f2982f;
                                        float fPow = (float) (Math.pow(Math.sqrt((f17 * f17) + (f16 * f16) + (f15 * f15)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            aVar2 = aVarA2;
                                            f10 = fPow;
                                            f9 = fAbs;
                                        }
                                    } else {
                                        f2 = f13;
                                        fMin = fMin;
                                    }
                                    if (f9 == 0.0f && f10 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f4) {
                                        f11 = f2;
                                    } else {
                                        f12 = f2;
                                    }
                                    depth2 = depth2;
                                    fMin = fMin;
                                }
                                a aVar3 = aVar2;
                                if (!z3) {
                                    if (aVar3 == null) {
                                        f5 = f7;
                                    } else {
                                        aVar = aVar3;
                                        f8 = f7;
                                    }
                                    f7 = ((f5 - f8) / 2.0f) + f8;
                                } else {
                                    if (aVar3 != null) {
                                        iF = aVar3.c(oVar);
                                        break;
                                    }
                                    f7 = ((f5 - f8) / 2.0f) + f8;
                                    z3 = false;
                                }
                            }
                        } else {
                            depth2 = depth2;
                            iF = b.f(f4);
                        }
                        color = iF;
                    } else {
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (i2 << 24);
                } else {
                    depth2 = depth2;
                }
                int i9 = i4 + 1;
                if (i9 > iArr.length) {
                    int[] iArr4 = new int[i4 <= 4 ? 8 : i4 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i4);
                    iArr = iArr4;
                }
                iArr[i4] = color;
                if (i9 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4 > 4 ? i4 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i4);
                    objArr = objArr2;
                }
                objArr[i4] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i4 = i9;
                depth2 = depth2;
                r4 = 1;
                i3 = 0;
            } else {
                depth2 = depth2;
                r4 = 1;
                i3 = 0;
            }
        }
        int[] iArr5 = new int[i4];
        int[][] iArr6 = new int[i4][];
        System.arraycopy(iArr, 0, iArr5, 0, i4);
        System.arraycopy(objArr, 0, iArr6, 0, i4);
        return new ColorStateList(iArr6, iArr5);
    }
}
