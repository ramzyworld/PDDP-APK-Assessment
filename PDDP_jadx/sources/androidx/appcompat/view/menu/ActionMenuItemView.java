package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import p014i.a;
import p014i.b;
import p014i.i;
import p014i.j;
import p014i.k;
import p014i.q;
import p016j.C0123u;
import p016j.InterfaceC0113j;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0123u implements q, View.OnClickListener, InterfaceC0113j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f1151i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f1152j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f1153k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i f1154l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f1155m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f1156n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1157o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1158p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f1159q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1160r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1161s;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1157o = e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p004c.a.f1739c, 0, 0);
        this.f1159q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f1161s = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1160r = -1;
        setSaveEnabled(false);
    }

    @Override // p016j.InterfaceC0113j
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p016j.InterfaceC0113j
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f1151i.getIcon() == null;
    }

    @Override // p014i.q
    public final void c(k kVar) {
        this.f1151i = kVar;
        setIcon(kVar.getIcon());
        setTitle(kVar.getTitleCondensed());
        setId(kVar.f2097a);
        setVisibility(kVar.isVisible() ? 0 : 8);
        setEnabled(kVar.isEnabled());
        if (kVar.hasSubMenu() && this.f1155m == null) {
            this.f1155m = new a(this);
        }
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f1152j);
        if (this.f1153k != null && ((this.f1151i.f2120y & 4) != 4 || (!this.f1157o && !this.f1158p))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f1152j : null);
        CharSequence charSequence = this.f1151i.f2113q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f1151i.f2101e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1151i.f2114r;
        if (TextUtils.isEmpty(charSequence2)) {
            a1.a.B(this, z4 ? null : this.f1151i.f2101e);
        } else {
            a1.a.B(this, charSequence2);
        }
    }

    @Override // p014i.q
    public k getItemData() {
        return this.f1151i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f1154l;
        if (iVar != null) {
            iVar.a(this.f1151i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1157o = e();
        f();
    }

    @Override // p016j.C0123u, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i4 = this.f1160r) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f1159q;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i5) : i5;
        if (mode != 1073741824 && i5 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i3);
        }
        if (!zIsEmpty || this.f1153k == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1153k.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f1151i.hasSubMenu() && (aVar = this.f1155m) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1158p != z2) {
            this.f1158p = z2;
            k kVar = this.f1151i;
            if (kVar != null) {
                j jVar = kVar.f2110n;
                jVar.f2086k = true;
                jVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1153k = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f1161s;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(i iVar) {
        this.f1154l = iVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f1160r = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.f1156n = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1152j = charSequence;
        f();
    }
}
