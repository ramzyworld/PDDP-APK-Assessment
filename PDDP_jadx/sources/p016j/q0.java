package p016j;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements InterfaceC0126x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f2716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f2718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f2719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f2720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f2721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f2723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f2724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f2725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f2726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f2728m;

    public final void a(int i2) {
        View view;
        int i3 = this.f2717b ^ i2;
        this.f2717b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    b();
                }
                int i4 = this.f2717b & 4;
                Toolbar toolbar = this.f2716a;
                if (i4 != 0) {
                    Drawable drawable = this.f2721f;
                    if (drawable == null) {
                        drawable = this.f2728m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                c();
            }
            int i5 = i3 & 8;
            Toolbar toolbar2 = this.f2716a;
            if (i5 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.f2723h);
                    toolbar2.setSubtitle(this.f2724i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f2718c) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f2717b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f2725j);
            Toolbar toolbar = this.f2716a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f2727l);
            } else {
                toolbar.setNavigationContentDescription(this.f2725j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i2 = this.f2717b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f2720e) == null) {
            drawable = this.f2719d;
        }
        this.f2716a.setLogo(drawable);
    }
}
