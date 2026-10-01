package p016j;

import a1.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.deeprf.pddp.R;

/* JADX INFO: renamed from: j.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0111h extends C0120q implements InterfaceC0113j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0112i f2651g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0111h(C0112i c0112i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f2651g = c0112i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        a.B(this, getContentDescription());
        setOnTouchListener(new p014i.a(this, this));
    }

    @Override // p016j.InterfaceC0113j
    public final boolean a() {
        return false;
    }

    @Override // p016j.InterfaceC0113j
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f2651g.k();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i2, int i3, int i4, int i5) {
        boolean frame = super.setFrame(i2, i3, i4, i5);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            p033s.a.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
