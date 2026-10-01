package p016j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0124v {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final RectF f2770k = new RectF();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ConcurrentHashMap f2771l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2772a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2773b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2774c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2775d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2776e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f2777f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2778g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f2779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f2780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f2781j;

    static {
        new ConcurrentHashMap();
    }

    public C0124v(TextView textView) {
        this.f2780i = textView;
        this.f2781j = textView.getContext();
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f2771l;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return obj2;
        }
    }

    public final void a() {
        if (this.f2772a != 0) {
            if (this.f2773b) {
                if (this.f2780i.getMeasuredHeight() <= 0 || this.f2780i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = Build.VERSION.SDK_INT >= 29 ? this.f2780i.isHorizontallyScrollable() : ((Boolean) e(this.f2780i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f2780i.getMeasuredWidth() - this.f2780i.getTotalPaddingLeft()) - this.f2780i.getTotalPaddingRight();
                int height = (this.f2780i.getHeight() - this.f2780i.getCompoundPaddingBottom()) - this.f2780i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f2770k;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f2780i.getTextSize()) {
                            f(0, fC);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f2773b = true;
        }
    }

    public final int c(RectF rectF) {
        byte b2;
        StaticLayout staticLayout;
        TextDirectionHeuristic textDirectionHeuristic;
        CharSequence transformation;
        int length = this.f2777f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = length - 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 <= i2) {
            int i5 = (i3 + i2) / 2;
            int i6 = this.f2777f[i5];
            TextView textView = this.f2780i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int i7 = Build.VERSION.SDK_INT;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f2779h;
            if (textPaint == null) {
                this.f2779h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f2779h.set(textView.getPaint());
            this.f2779h.setTextSize(i6);
            Layout.Alignment alignment = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            int iRound = Math.round(rectF.right);
            if (i7 >= 23) {
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f2779h, iRound);
                builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                if (i7 >= 29) {
                    try {
                        textDirectionHeuristic = textView.getTextDirectionHeuristic();
                    } catch (ClassCastException unused) {
                        Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                    }
                } else {
                    textDirectionHeuristic = (TextDirectionHeuristic) e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
                }
                builderObtain.setTextDirection(textDirectionHeuristic);
                staticLayout = builderObtain.build();
                b2 = -1;
            } else {
                b2 = -1;
                staticLayout = new StaticLayout(text, this.f2779h, iRound, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
            }
            if (maxLines != b2 && (staticLayout.getLineCount() > maxLines || staticLayout.getLineEnd(staticLayout.getLineCount() - 1) != text.length())) {
                i4 = i5 - 1;
                i2 = i4;
            } else if (staticLayout.getHeight() > rectF.bottom) {
                i4 = i5 - 1;
                i2 = i4;
            } else {
                int i8 = i5 + 1;
                i4 = i3;
                i3 = i8;
            }
        }
        return this.f2777f[i4];
    }

    public final void f(int i2, float f2) {
        Context context = this.f2781j;
        float fApplyDimension = TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f2780i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f2773b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (this.f2772a == 1) {
            if (!this.f2778g || this.f2777f.length == 0) {
                int iFloor = ((int) Math.floor((this.f2776e - this.f2775d) / this.f2774c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i2 = 0; i2 < iFloor; i2++) {
                    iArr[i2] = Math.round((i2 * this.f2774c) + this.f2775d);
                }
                this.f2777f = b(iArr);
            }
            this.f2773b = true;
        } else {
            this.f2773b = false;
        }
        return this.f2773b;
    }

    public final boolean h() {
        int[] iArr = this.f2777f;
        int length = iArr.length;
        boolean z2 = length > 0;
        this.f2778g = z2;
        if (z2) {
            this.f2772a = 1;
            this.f2775d = iArr[0];
            this.f2776e = iArr[length - 1];
            this.f2774c = -1.0f;
        }
        return z2;
    }

    public final void i(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f2772a = 1;
        this.f2775d = f2;
        this.f2776e = f3;
        this.f2774c = f4;
        this.f2778g = false;
    }
}
