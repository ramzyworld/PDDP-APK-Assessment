package p014i;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p016j.InterfaceC0115l;
import p027p.a;
import p042y.B;
import p042y.z;

/* JADX INFO: loaded from: classes.dex */
public class j implements Menu {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f2075u = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f2077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public D.j f2080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f2081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f2082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f2084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f2085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f2087l;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k f2094s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2088m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2089n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2090o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2091p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f2092q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f2093r = new CopyOnWriteArrayList();
    public boolean t = false;

    public j(Context context) {
        boolean zB;
        boolean z2 = false;
        this.f2076a = context;
        Resources resources = context.getResources();
        this.f2077b = resources;
        this.f2081f = new ArrayList();
        this.f2082g = new ArrayList();
        this.f2083h = true;
        this.f2084i = new ArrayList();
        this.f2085j = new ArrayList();
        this.f2086k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = B.f3420a;
            if (Build.VERSION.SDK_INT >= 28) {
                zB = z.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zB = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zB) {
                z2 = true;
            }
        }
        this.f2079d = z2;
    }

    public final k a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 < 0 || i6 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (f2075u[i6] << 16) | (65535 & i4);
        k kVar = new k(this, i2, i3, i4, i7, charSequence);
        ArrayList arrayList = this.f2081f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((k) arrayList.get(size)).f2100d <= i7) {
                i5 = size + 1;
                arrayList.add(i5, kVar);
                o(true);
                return kVar;
            }
        }
        i5 = 0;
        arrayList.add(i5, kVar);
        o(true);
        return kVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f2076a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            k kVarA = a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            kVarA.setIcon(resolveInfo.loadIcon(packageManager));
            kVarA.f2103g = intent2;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = kVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(p pVar, Context context) {
        this.f2093r.add(new WeakReference(pVar));
        pVar.e(context, this);
        this.f2086k = true;
    }

    public final void c(boolean z2) {
        if (this.f2091p) {
            return;
        }
        this.f2091p = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2093r;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.a(this, z2);
            }
        }
        this.f2091p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        k kVar = this.f2094s;
        if (kVar != null) {
            d(kVar);
        }
        this.f2081f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f2087l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(k kVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2093r;
        boolean zB = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2094s == kVar) {
            s();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                p pVar = (p) weakReference.get();
                if (pVar != null) {
                    zB = pVar.b(kVar);
                    if (zB) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            r();
            if (zB) {
                this.f2094s = null;
            }
        }
        return zB;
    }

    public boolean e(j jVar, MenuItem menuItem) {
        InterfaceC0115l interfaceC0115l;
        D.j jVar2 = this.f2080e;
        if (jVar2 == null || (interfaceC0115l = ((ActionMenuView) jVar2.f44f).f1225B) == null) {
            return false;
        }
        ((Toolbar) ((D.j) interfaceC0115l).f44f).getClass();
        return false;
    }

    public boolean f(k kVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2093r;
        boolean zG = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar != null) {
                zG = pVar.g(kVar);
                if (zG) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        r();
        if (zG) {
            this.f2094s = kVar;
        }
        return zG;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f2081f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            if (kVar.f2097a == i2) {
                return kVar;
            }
            if (kVar.hasSubMenu() && (menuItemFindItem = kVar.f2111o.findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final k g(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2092q;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (k) arrayList.get(0);
        }
        boolean zM = m();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            char c2 = zM ? kVar.f2106j : kVar.f2104h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (zM && c2 == '\b' && i2 == 67))) {
                return kVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f2081f.get(i2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    public final void h(ArrayList arrayList, int i2, KeyEvent keyEvent) {
        boolean zM = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList2 = this.f2081f;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                k kVar = (k) arrayList2.get(i3);
                if (kVar.hasSubMenu()) {
                    kVar.f2111o.h(arrayList, i2, keyEvent);
                }
                char c2 = zM ? kVar.f2106j : kVar.f2104h;
                if ((modifiers & 69647) == ((zM ? kVar.f2107k : kVar.f2105i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (zM && c2 == '\b') {
                            if (i2 == 67) {
                            }
                        }
                    }
                    if (kVar.isEnabled()) {
                        arrayList.add(kVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f2081f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((k) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListK = k();
        if (this.f2086k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2093r;
            boolean zD = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                p pVar = (p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD |= pVar.d();
                }
            }
            ArrayList arrayList = this.f2084i;
            ArrayList arrayList2 = this.f2085j;
            if (zD) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListK.size();
                for (int i2 = 0; i2 < size; i2++) {
                    k kVar = (k) arrayListK.get(i2);
                    if (kVar.d()) {
                        arrayList.add(kVar);
                    } else {
                        arrayList2.add(kVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f2086k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return g(i2, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z2 = this.f2083h;
        ArrayList arrayList = this.f2082g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2081f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            k kVar = (k) arrayList2.get(i2);
            if (kVar.isVisible()) {
                arrayList.add(kVar);
            }
        }
        this.f2083h = false;
        this.f2086k = true;
        return arrayList;
    }

    public boolean l() {
        return this.t;
    }

    public boolean m() {
        return this.f2078c;
    }

    public boolean n() {
        return this.f2079d;
    }

    public final void o(boolean z2) {
        if (this.f2088m) {
            this.f2089n = true;
            if (z2) {
                this.f2090o = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f2083h = true;
            this.f2086k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2093r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.h();
            }
        }
        r();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    public final boolean p(MenuItem menuItem, l lVar, int i2) {
        boolean zExpandActionView;
        k kVar = (k) menuItem;
        boolean zI = false;
        if (kVar == null || !kVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = kVar.f2112p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(kVar)) {
            j jVar = kVar.f2110n;
            if (jVar.e(jVar, kVar)) {
                zExpandActionView = true;
            } else {
                Intent intent = kVar.f2103g;
                if (intent != null) {
                    try {
                        jVar.f2076a.startActivity(intent);
                        zExpandActionView = true;
                    } catch (ActivityNotFoundException e2) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                        zExpandActionView = false;
                    }
                }
                zExpandActionView = false;
            }
        } else {
            zExpandActionView = true;
        }
        if (kVar.c()) {
            zExpandActionView |= kVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (kVar.hasSubMenu()) {
            if ((i2 & 4) == 0) {
                c(false);
            }
            if (!kVar.hasSubMenu()) {
                t tVar = new t(this.f2076a, this, kVar);
                kVar.f2111o = tVar;
                tVar.setHeaderTitle(kVar.f2101e);
            }
            t tVar2 = kVar.f2111o;
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2093r;
            if (!copyOnWriteArrayList.isEmpty()) {
                zI = lVar != null ? lVar.i(tVar2) : false;
                for (WeakReference weakReference : copyOnWriteArrayList) {
                    p pVar = (p) weakReference.get();
                    if (pVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zI) {
                        zI = pVar.i(tVar2);
                    }
                }
            }
            zExpandActionView |= zI;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i2 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return p(findItem(i2), null, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        k kVarG = g(i2, keyEvent);
        boolean zP = kVarG != null ? p(kVarG, null, i3) : false;
        if ((i3 & 2) != 0) {
            c(true);
        }
        return zP;
    }

    public final void q(int i2, CharSequence charSequence, int i3, View view) {
        if (view != null) {
            this.f2087l = null;
        } else {
            if (i2 > 0) {
                this.f2087l = this.f2077b.getText(i2);
            } else if (charSequence != null) {
                this.f2087l = charSequence;
            }
            if (i3 > 0) {
                a.b(this.f2076a, i3);
            }
        }
        o(false);
    }

    public final void r() {
        this.f2088m = false;
        if (this.f2089n) {
            this.f2089n = false;
            o(this.f2090o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f2081f;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((k) arrayList.get(i4)).f2098b == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int size2 = arrayList.size() - i4;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size2 || ((k) arrayList.get(i4)).f2098b != i2) {
                    break;
                }
                if (i4 >= 0) {
                    ArrayList arrayList2 = this.f2081f;
                    if (i4 < arrayList2.size()) {
                        arrayList2.remove(i4);
                    }
                }
                i3 = i5;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        ArrayList arrayList = this.f2081f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((k) arrayList.get(i3)).f2097a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            ArrayList arrayList2 = this.f2081f;
            if (i3 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i3);
            o(true);
        }
    }

    public final void s() {
        if (this.f2088m) {
            return;
        }
        this.f2088m = true;
        this.f2089n = false;
        this.f2090o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        ArrayList arrayList = this.f2081f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            if (kVar.f2098b == i2) {
                kVar.f2119x = (kVar.f2119x & (-5)) | (z3 ? 4 : 0);
                kVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.t = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        ArrayList arrayList = this.f2081f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            if (kVar.f2098b == i2) {
                kVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        ArrayList arrayList = this.f2081f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            if (kVar.f2098b == i2) {
                int i4 = kVar.f2119x;
                int i5 = (i4 & (-9)) | (z2 ? 0 : 8);
                kVar.f2119x = i5;
                if (i4 != i5) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f2078c = z2;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2081f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return a(0, 0, 0, this.f2077b.getString(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f2077b.getString(i2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        k kVarA = a(i2, i3, i4, charSequence);
        t tVar = new t(this.f2076a, this, kVarA);
        kVarA.f2111o = tVar;
        tVar.setHeaderTitle(kVarA.f2101e);
        return tVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f2077b.getString(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f2077b.getString(i5));
    }

    public j j() {
        return this;
    }
}
