package Q;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f601a;

    public d(Drawable.ConstantState constantState) {
        this.f601a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f601a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f601a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f601a.newDrawable();
        eVar.f607e = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f604h);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f601a.newDrawable(resources);
        eVar.f607e = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f604h);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f601a.newDrawable(resources, theme);
        eVar.f607e = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f604h);
        return eVar;
    }
}
