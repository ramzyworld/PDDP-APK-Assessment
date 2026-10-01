package p014i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class t extends j implements SubMenu {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f2153v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f2154w;

    public t(Context context, j jVar, k kVar) {
        super(context);
        this.f2153v = jVar;
        this.f2154w = kVar;
    }

    @Override // p014i.j
    public final boolean d(k kVar) {
        return this.f2153v.d(kVar);
    }

    @Override // p014i.j
    public final boolean e(j jVar, MenuItem menuItem) {
        super.e(jVar, menuItem);
        return this.f2153v.e(jVar, menuItem);
    }

    @Override // p014i.j
    public final boolean f(k kVar) {
        return this.f2153v.f(kVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2154w;
    }

    @Override // p014i.j
    public final j j() {
        return this.f2153v.j();
    }

    @Override // p014i.j
    public final boolean l() {
        return this.f2153v.l();
    }

    @Override // p014i.j
    public final boolean m() {
        return this.f2153v.m();
    }

    @Override // p014i.j
    public final boolean n() {
        return this.f2153v.n();
    }

    @Override // p014i.j, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f2153v.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f2154w.setIcon(drawable);
        return this;
    }

    @Override // p014i.j, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2153v.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        q(0, null, i2, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        q(i2, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        this.f2154w.setIcon(i2);
        return this;
    }
}
