package Q;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class o extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f659k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f660l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f649a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new q(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new q(this);
    }
}
