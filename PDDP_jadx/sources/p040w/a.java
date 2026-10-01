package p040w;

import L.l;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f3407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f3408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3410d;

    public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            l.l(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
        }
        this.f3407a = textPaint;
        this.f3408b = textDirectionHeuristic;
        this.f3409c = i2;
        this.f3410d = i3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    /* JADX WARN: Code duplicated, block: B:16:0x0022  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    public final boolean equals(Object obj) {
        TextPaint textPaint;
        float textScaleX;
        TextPaint textPaint2;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            if (this.f3409c == aVar.f3409c && this.f3410d == aVar.f3410d) {
                textPaint = this.f3407a;
                if (textPaint.getTextSize() != aVar.f3407a.getTextSize()) {
                    z2 = false;
                } else {
                    textScaleX = textPaint.getTextScaleX();
                    textPaint2 = aVar.f3407a;
                    if (textScaleX != textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && (i2 < 24 ? textPaint.getTextLocale().equals(textPaint2.getTextLocale()) : textPaint.getTextLocales().equals(textPaint2.getTextLocales())) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            } else {
                z2 = false;
            }
        } else {
            textPaint = this.f3407a;
            if (textPaint.getTextSize() != aVar.f3407a.getTextSize()) {
                z2 = false;
            } else {
                textScaleX = textPaint.getTextScaleX();
                textPaint2 = aVar.f3407a;
                if (textScaleX != textPaint2.getTextScaleX()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
        }
        return z2 && this.f3408b == aVar.f3408b;
    }

    public final int hashCode() {
        TextDirectionHeuristic textDirectionHeuristic = this.f3408b;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.f3410d;
        int i4 = this.f3409c;
        TextPaint textPaint = this.f3407a;
        return i2 >= 24 ? Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i4), Integer.valueOf(i3)) : Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i4), Integer.valueOf(i3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f3407a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i2 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i2 >= 24) {
            sb.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i2 >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f3408b);
        sb.append(", breakStrategy=" + this.f3409c);
        sb.append(", hyphenationFrequency=" + this.f3410d);
        sb.append("}");
        return sb.toString();
    }

    public a(PrecomputedText.Params params) {
        this.f3407a = params.getTextPaint();
        this.f3408b = params.getTextDirection();
        this.f3409c = params.getBreakStrategy();
        this.f3410d = params.getHyphenationFrequency();
    }
}
