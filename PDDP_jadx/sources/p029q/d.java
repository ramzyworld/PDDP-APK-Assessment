package p029q;

import N.Q;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import p026o.a;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Shader f2988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f2989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2990c;

    public d(Shader shader, ColorStateList colorStateList, int i2) {
        this.f2988a = shader;
        this.f2989b = colorStateList;
        this.f2990c = i2;
    }

    public static d a(Resources resources, int i2, Resources.Theme theme) {
        int next;
        float f2;
        float f3;
        float f4;
        int i3;
        Shader radialGradient;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i2);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = c.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new d(null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayH = b.h(resources, theme, attributeSetAsAttributeSet, a.f2889d);
        float f5 = !b.e(xml, "startX") ? 0.0f : typedArrayH.getFloat(8, 0.0f);
        float f6 = !b.e(xml, "startY") ? 0.0f : typedArrayH.getFloat(9, 0.0f);
        float f7 = !b.e(xml, "endX") ? 0.0f : typedArrayH.getFloat(10, 0.0f);
        float f8 = !b.e(xml, "endY") ? 0.0f : typedArrayH.getFloat(11, 0.0f);
        float f9 = !b.e(xml, "centerX") ? 0.0f : typedArrayH.getFloat(3, 0.0f);
        float f10 = !b.e(xml, "centerY") ? 0.0f : typedArrayH.getFloat(4, 0.0f);
        int i4 = !b.e(xml, "type") ? 0 : typedArrayH.getInt(2, 0);
        int color = !b.e(xml, "startColor") ? 0 : typedArrayH.getColor(0, 0);
        boolean zE = b.e(xml, "centerColor");
        int color2 = !b.e(xml, "centerColor") ? 0 : typedArrayH.getColor(7, 0);
        int color3 = !b.e(xml, "endColor") ? 0 : typedArrayH.getColor(1, 0);
        int i5 = !b.e(xml, "tileMode") ? 0 : typedArrayH.getInt(6, 0);
        float f11 = !b.e(xml, "gradientRadius") ? 0.0f : typedArrayH.getFloat(5, 0.0f);
        typedArrayH.recycle();
        int depth = xml.getDepth() + 1;
        float f12 = f11;
        ArrayList arrayList = new ArrayList(20);
        float f13 = f8;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f2 = f7;
            if (next2 == 1) {
                f3 = f6;
                break;
            }
            int depth2 = xml.getDepth();
            f3 = f6;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayH2 = b.h(resources, theme, attributeSetAsAttributeSet, a.f2890e);
                boolean zHasValue = typedArrayH2.hasValue(0);
                boolean zHasValue2 = typedArrayH2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayH2.getColor(0, 0);
                float f14 = typedArrayH2.getFloat(1, 0.0f);
                typedArrayH2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f14));
            }
            f7 = f2;
            f6 = f3;
        }
        Q q2 = arrayList2.size() > 0 ? new Q(arrayList2, arrayList) : null;
        if (q2 == null) {
            q2 = zE ? new Q(color, color2, color3) : new Q(color, color3);
        }
        if (i4 == 1) {
            float f15 = f9;
            i3 = 0;
            if (f12 <= 0.0f) {
                f4 = f10;
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            if (i5 == 1) {
                f4 = f10;
                tileMode = Shader.TileMode.REPEAT;
            } else if (i5 != 2) {
                f4 = f10;
                tileMode = Shader.TileMode.CLAMP;
            } else {
                f4 = f10;
                tileMode = Shader.TileMode.MIRROR;
            }
            radialGradient = new RadialGradient(f15, f4, f12, (int[]) q2.f471f, (float[]) q2.f472g, tileMode);
        } else if (i4 != 2) {
            if (i5 != 1) {
                tileMode2 = i5 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode2 = Shader.TileMode.REPEAT;
            }
            Shader.TileMode tileMode3 = tileMode2;
            i3 = 0;
            radialGradient = new LinearGradient(f5, f3, f2, f13, (int[]) q2.f471f, (float[]) q2.f472g, tileMode3);
        } else {
            i3 = 0;
            radialGradient = new SweepGradient(f9, f10, (int[]) q2.f471f, (float[]) q2.f472g);
        }
        return new d(radialGradient, null, i3);
    }

    public final boolean b() {
        ColorStateList colorStateList;
        return this.f2988a == null && (colorStateList = this.f2989b) != null && colorStateList.isStateful();
    }
}
