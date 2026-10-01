package p016j;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p012h.a;
import p014i.j;
import p014i.k;
import p014i.p;
import p014i.t;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f2696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f2697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2698g;

    public m0(Toolbar toolbar) {
        this.f2698g = toolbar;
    }

    @Override // p014i.p
    public final boolean b(k kVar) {
        Toolbar toolbar = this.f2698g;
        KeyEvent.Callback callback = toolbar.f1347m;
        if (callback instanceof a) {
            SearchView searchView = (SearchView) ((a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.t;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f1268c0 = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f1269e0);
            searchView.d0 = false;
        }
        toolbar.removeView(toolbar.f1347m);
        toolbar.removeView(toolbar.f1346l);
        toolbar.f1347m = null;
        ArrayList arrayList = toolbar.f1332I;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2697f = null;
        toolbar.requestLayout();
        kVar.f2096B = false;
        kVar.f2110n.o(false);
        return true;
    }

    @Override // p014i.p
    public final boolean d() {
        return false;
    }

    @Override // p014i.p
    public final void e(Context context, j jVar) {
        k kVar;
        j jVar2 = this.f2696e;
        if (jVar2 != null && (kVar = this.f2697f) != null) {
            jVar2.d(kVar);
        }
        this.f2696e = jVar;
    }

    @Override // p014i.p
    public final boolean g(k kVar) {
        Toolbar toolbar = this.f2698g;
        toolbar.c();
        ViewParent parent = toolbar.f1346l.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1346l);
            }
            toolbar.addView(toolbar.f1346l);
        }
        View view = kVar.f2121z;
        if (view == null) {
            view = null;
        }
        toolbar.f1347m = view;
        this.f2697f = kVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1347m);
            }
            n0 n0VarG = Toolbar.g();
            n0VarG.f2705a = (toolbar.f1352r & 112) | 8388611;
            n0VarG.f2706b = 2;
            toolbar.f1347m.setLayoutParams(n0VarG);
            toolbar.addView(toolbar.f1347m);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((n0) childAt.getLayoutParams()).f2706b != 2 && childAt != toolbar.f1339e) {
                toolbar.removeViewAt(childCount);
                toolbar.f1332I.add(childAt);
            }
        }
        toolbar.requestLayout();
        kVar.f2096B = true;
        kVar.f2110n.o(false);
        KeyEvent.Callback callback = toolbar.f1347m;
        if (callback instanceof a) {
            SearchView searchView = (SearchView) ((a) callback);
            if (!searchView.d0) {
                searchView.d0 = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.t;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f1269e0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        return true;
    }

    @Override // p014i.p
    public final void h() {
        if (this.f2697f != null) {
            j jVar = this.f2696e;
            if (jVar != null) {
                int size = jVar.f2081f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f2696e.getItem(i2) == this.f2697f) {
                        return;
                    }
                }
            }
            b(this.f2697f);
        }
    }

    @Override // p014i.p
    public final boolean i(t tVar) {
        return false;
    }

    @Override // p014i.p
    public final void a(j jVar, boolean z2) {
    }
}
