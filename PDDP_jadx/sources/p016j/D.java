package p016j;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import p004c.a;

/* JADX INFO: loaded from: classes.dex */
public class D extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2539b;

    public D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2539b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1746j);
        this.f2538a = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
        this.f2539b = typedArrayObtainStyledAttributes.getInt(0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public D(int i2) {
        super(i2, -2);
        this.f2539b = -1;
        this.f2538a = 0.0f;
    }

    public D(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2539b = -1;
    }
}
