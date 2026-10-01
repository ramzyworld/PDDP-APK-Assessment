package p012h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import p014i.k;
import p042y.AbstractC0173f;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f1942A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ d f1945D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f1946a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1954i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1955j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f1956k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f1957l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1958m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f1959n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1960o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f1961p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1962q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1963r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1964s;
    public boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1965u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1966v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1967w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f1968x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f1969y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f1970z;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ColorStateList f1943B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f1944C = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1947b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1948c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1949d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1950e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1951f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1952g = true;

    public c(d dVar, Menu menu) {
        this.f1945D = dVar;
        this.f1946a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f1945D.f1975c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f1964s).setVisible(this.t).setEnabled(this.f1965u).setCheckable(this.f1963r >= 1).setTitleCondensed(this.f1957l).setIcon(this.f1958m);
        int i2 = this.f1966v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f1969y;
        d dVar = this.f1945D;
        if (str != null) {
            if (dVar.f1975c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (dVar.f1976d == null) {
                dVar.f1976d = d.a(dVar.f1975c);
            }
            Object obj = dVar.f1976d;
            String str2 = this.f1969y;
            b bVar = new b();
            bVar.f1940a = obj;
            Class<?> cls = obj.getClass();
            try {
                bVar.f1941b = cls.getMethod(str2, b.f1939c);
                menuItem.setOnMenuItemClickListener(bVar);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        boolean z3 = menuItem instanceof k;
        if (z3) {
        }
        if (this.f1963r >= 2 && z3) {
            k kVar = (k) menuItem;
            kVar.f2119x = (kVar.f2119x & (-5)) | 4;
        }
        String str3 = this.f1968x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, d.f1971e, dVar.f1973a));
            z2 = true;
        }
        int i3 = this.f1967w;
        if (i3 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        CharSequence charSequence = this.f1970z;
        boolean z4 = menuItem instanceof k;
        if (z4) {
            ((k) menuItem).e(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0173f.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f1942A;
        if (z4) {
            ((k) menuItem).g(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0173f.m(menuItem, charSequence2);
        }
        char c2 = this.f1959n;
        int i4 = this.f1960o;
        if (z4) {
            ((k) menuItem).setAlphabeticShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0173f.g(menuItem, c2, i4);
        }
        char c3 = this.f1961p;
        int i5 = this.f1962q;
        if (z4) {
            ((k) menuItem).setNumericShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0173f.k(menuItem, c3, i5);
        }
        PorterDuff.Mode mode = this.f1944C;
        if (mode != null) {
            if (z4) {
                ((k) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0173f.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f1943B;
        if (colorStateList != null) {
            if (z4) {
                ((k) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0173f.i(menuItem, colorStateList);
            }
        }
    }
}
