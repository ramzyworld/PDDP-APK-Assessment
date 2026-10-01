package N;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class y extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f560b;

    public y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f559a = new Rect();
        this.f560b = true;
    }

    public y(int i2, int i3) {
        super(i2, i3);
        this.f559a = new Rect();
        this.f560b = true;
    }

    public y(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f559a = new Rect();
        this.f560b = true;
    }

    public y(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f559a = new Rect();
        this.f560b = true;
    }

    public y(y yVar) {
        super((ViewGroup.LayoutParams) yVar);
        this.f559a = new Rect();
        this.f560b = true;
    }
}
