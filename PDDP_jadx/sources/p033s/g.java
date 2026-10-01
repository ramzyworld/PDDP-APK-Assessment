package p033s;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable.ConstantState f3070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f3071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f3072d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i2 = this.f3069a;
        Drawable.ConstantState constantState = this.f3070b;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        f fVar = new f();
        fVar.f3066h = this;
        Drawable.ConstantState constantState = this.f3070b;
        if (constantState != null) {
            fVar.h(constantState.newDrawable(resources));
        }
        f.a();
        return fVar;
    }
}
