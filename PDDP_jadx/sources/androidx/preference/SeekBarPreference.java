package androidx.preference;

import K.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.deeprf.pddp.R;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1625l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1626m;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f360i, R.attr.seekBarPreferenceStyle, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(1, 100);
        i3 = i3 < i2 ? i2 : i3;
        if (i3 != this.f1625l) {
            this.f1625l = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i4 != this.f1626m) {
            this.f1626m = Math.min(this.f1625l - i2, Math.abs(i4));
        }
        typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.getBoolean(5, false);
        typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i2) {
        return Integer.valueOf(typedArray.getInt(i2, 0));
    }
}
