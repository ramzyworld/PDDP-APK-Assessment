package p016j;

import N.C0026b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageView;
import p006d.b;

/* JADX INFO: renamed from: j.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0120q extends ImageView {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0117n f2714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0026b f2715f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120q(Context context, int i2) {
        super(context, null, i2);
        i0.a(context);
        C0117n c0117n = new C0117n(this);
        this.f2714e = c0117n;
        c0117n.b(null, i2);
        C0026b c0026b = new C0026b(this);
        this.f2715f = c0026b;
        c0026b.G(i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0117n c0117n = this.f2714e;
        if (c0117n != null) {
            c0117n.a();
        }
        C0026b c0026b = this.f2715f;
        if (c0026b != null) {
            c0026b.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        j0 j0Var;
        C0117n c0117n = this.f2714e;
        if (c0117n == null || (j0Var = c0117n.f2703e) == null) {
            return null;
        }
        return j0Var.f2681a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        j0 j0Var;
        C0117n c0117n = this.f2714e;
        if (c0117n == null || (j0Var = c0117n.f2703e) == null) {
            return null;
        }
        return j0Var.f2682b;
    }

    public ColorStateList getSupportImageTintList() {
        j0 j0Var;
        C0026b c0026b = this.f2715f;
        if (c0026b == null || (j0Var = (j0) c0026b.f476f) == null) {
            return null;
        }
        return j0Var.f2681a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        j0 j0Var;
        C0026b c0026b = this.f2715f;
        if (c0026b == null || (j0Var = (j0) c0026b.f476f) == null) {
            return null;
        }
        return j0Var.f2682b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f2715f.f477g).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0117n c0117n = this.f2714e;
        if (c0117n != null) {
            c0117n.f2701c = -1;
            c0117n.d(null);
            c0117n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0117n c0117n = this.f2714e;
        if (c0117n != null) {
            c0117n.c(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0026b c0026b = this.f2715f;
        if (c0026b != null) {
            c0026b.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0026b c0026b = this.f2715f;
        if (c0026b != null) {
            c0026b.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        C0026b c0026b = this.f2715f;
        if (c0026b != null) {
            ImageView imageView = (ImageView) c0026b.f477g;
            if (i2 != 0) {
                Drawable drawableC = b.c(imageView.getContext(), i2);
                if (drawableC != null) {
                    AbstractC0127y.b(drawableC);
                }
                imageView.setImageDrawable(drawableC);
            } else {
                imageView.setImageDrawable(null);
            }
            c0026b.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0026b c0026b = this.f2715f;
        if (c0026b != null) {
            c0026b.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0117n c0117n = this.f2714e;
        if (c0117n != null) {
            c0117n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0117n c0117n = this.f2714e;
        if (c0117n != null) {
            c0117n.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0026b c0026b = this.f2715f;
        if (c0026b != null) {
            if (((j0) c0026b.f476f) == null) {
                c0026b.f476f = new j0();
            }
            j0 j0Var = (j0) c0026b.f476f;
            j0Var.f2681a = colorStateList;
            j0Var.f2684d = true;
            c0026b.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0026b c0026b = this.f2715f;
        if (c0026b != null) {
            if (((j0) c0026b.f476f) == null) {
                c0026b.f476f = new j0();
            }
            j0 j0Var = (j0) c0026b.f476f;
            j0Var.f2682b = mode;
            j0Var.f2683c = true;
            c0026b.a();
        }
    }
}
