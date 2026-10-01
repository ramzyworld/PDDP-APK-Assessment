package p014i;

import a1.a;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p006d.b;

/* JADX INFO: loaded from: classes.dex */
public final class k implements MenuItem {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2095A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f2101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f2102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f2103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f2104h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f2106j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f2108l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f2110n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public t f2111o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2112p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f2113q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f2114r;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f2121z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2105i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2107k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2109m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f2115s = null;
    public PorterDuff.Mode t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2116u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2117v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2118w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2119x = 16;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f2096B = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2120y = 0;

    public k(j jVar, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f2110n = jVar;
        this.f2097a = i3;
        this.f2098b = i2;
        this.f2099c = i4;
        this.f2100d = i5;
        this.f2101e = charSequence;
    }

    public static void a(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f2118w && (this.f2116u || this.f2117v)) {
            drawable = a.K(drawable).mutate();
            if (this.f2116u) {
                p033s.a.h(drawable, this.f2115s);
            }
            if (this.f2117v) {
                p033s.a.i(drawable, this.t);
            }
            this.f2118w = false;
        }
        return drawable;
    }

    public final boolean c() {
        return ((this.f2120y & 8) == 0 || this.f2121z == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2120y & 8) == 0) {
            return false;
        }
        if (this.f2121z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2095A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2110n.d(this);
        }
        return false;
    }

    public final boolean d() {
        return (this.f2119x & 32) == 32;
    }

    public final k e(CharSequence charSequence) {
        this.f2113q = charSequence;
        this.f2110n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2095A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2110n.f(this);
        }
        return false;
    }

    public final void f(boolean z2) {
        if (z2) {
            this.f2119x |= 32;
        } else {
            this.f2119x &= -33;
        }
    }

    public final k g(CharSequence charSequence) {
        this.f2114r = charSequence;
        this.f2110n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2121z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2107k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2106j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2113q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2098b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2108l;
        if (drawable != null) {
            return b(drawable);
        }
        int i2 = this.f2109m;
        if (i2 == 0) {
            return null;
        }
        Drawable drawableC = b.c(this.f2110n.f2076a, i2);
        this.f2109m = 0;
        this.f2108l = drawableC;
        return b(drawableC);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2115s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2103g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2097a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2105i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2104h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2099c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2111o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2101e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2102f;
        return charSequence != null ? charSequence : this.f2101e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2114r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2111o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2096B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2119x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2119x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2119x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f2119x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.f2121z = view;
        if (view != null && view.getId() == -1 && (i2 = this.f2097a) > 0) {
            view.setId(i2);
        }
        j jVar = this.f2110n;
        jVar.f2086k = true;
        jVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2106j == c2) {
            return this;
        }
        this.f2106j = Character.toLowerCase(c2);
        this.f2110n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.f2119x;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f2119x = i3;
        if (i2 != i3) {
            this.f2110n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i2 = this.f2119x;
        if ((i2 & 4) != 0) {
            j jVar = this.f2110n;
            jVar.getClass();
            ArrayList arrayList = jVar.f2081f;
            int size = arrayList.size();
            jVar.s();
            for (int i3 = 0; i3 < size; i3++) {
                k kVar = (k) arrayList.get(i3);
                if (kVar.f2098b == this.f2098b && (kVar.f2119x & 4) != 0 && kVar.isCheckable()) {
                    boolean z3 = kVar == this;
                    int i4 = kVar.f2119x;
                    int i5 = (z3 ? 2 : 0) | (i4 & (-3));
                    kVar.f2119x = i5;
                    if (i4 != i5) {
                        kVar.f2110n.o(false);
                    }
                }
            }
            jVar.r();
        } else {
            int i6 = (i2 & (-3)) | (z2 ? 2 : 0);
            this.f2119x = i6;
            if (i2 != i6) {
                this.f2110n.o(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f2119x |= 16;
        } else {
            this.f2119x &= -17;
        }
        this.f2110n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2109m = 0;
        this.f2108l = drawable;
        this.f2118w = true;
        this.f2110n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2115s = colorStateList;
        this.f2116u = true;
        this.f2118w = true;
        this.f2110n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.f2117v = true;
        this.f2118w = true;
        this.f2110n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2103g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f2104h == c2) {
            return this;
        }
        this.f2104h = c2;
        this.f2110n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2095A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2112p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f2104h = c2;
        this.f2106j = Character.toLowerCase(c3);
        this.f2110n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2120y = i2;
        j jVar = this.f2110n;
        jVar.f2086k = true;
        jVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2101e = charSequence;
        this.f2110n.o(false);
        t tVar = this.f2111o;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2102f = charSequence;
        this.f2110n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        g(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i2 = this.f2119x;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f2119x = i3;
        if (i2 != i3) {
            j jVar = this.f2110n;
            jVar.f2083h = true;
            jVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2101e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f2106j == c2 && this.f2107k == i2) {
            return this;
        }
        this.f2106j = Character.toLowerCase(c2);
        this.f2107k = KeyEvent.normalizeMetaState(i2);
        this.f2110n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f2104h == c2 && this.f2105i == i2) {
            return this;
        }
        this.f2104h = c2;
        this.f2105i = KeyEvent.normalizeMetaState(i2);
        this.f2110n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f2104h = c2;
        this.f2105i = KeyEvent.normalizeMetaState(i2);
        this.f2106j = Character.toLowerCase(c3);
        this.f2107k = KeyEvent.normalizeMetaState(i3);
        this.f2110n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f2108l = null;
        this.f2109m = i2;
        this.f2118w = true;
        this.f2110n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f2110n.f2076a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i3;
        Context context = this.f2110n.f2076a;
        View viewInflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.f2121z = viewInflate;
        if (viewInflate != null && viewInflate.getId() == -1 && (i3 = this.f2097a) > 0) {
            viewInflate.setId(i3);
        }
        j jVar = this.f2110n;
        jVar.f2086k = true;
        jVar.o(true);
        return this;
    }
}
