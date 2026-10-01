package p014i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f2069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2070f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LayoutInflater f2073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2074j;

    public h(j jVar, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f2072h = z2;
        this.f2073i = layoutInflater;
        this.f2069e = jVar;
        this.f2074j = i2;
        a();
    }

    public final void a() {
        j jVar = this.f2069e;
        k kVar = jVar.f2094s;
        if (kVar != null) {
            jVar.i();
            ArrayList arrayList = jVar.f2085j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((k) arrayList.get(i2)) == kVar) {
                    this.f2070f = i2;
                    return;
                }
            }
        }
        this.f2070f = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k getItem(int i2) {
        ArrayList arrayListK;
        j jVar = this.f2069e;
        if (this.f2072h) {
            jVar.i();
            arrayListK = jVar.f2085j;
        } else {
            arrayListK = jVar.k();
        }
        int i3 = this.f2070f;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (k) arrayListK.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListK;
        j jVar = this.f2069e;
        if (this.f2072h) {
            jVar.i();
            arrayListK = jVar.f2085j;
        } else {
            arrayListK = jVar.k();
        }
        return this.f2070f < 0 ? arrayListK.size() : arrayListK.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f2073i.inflate(this.f2074j, viewGroup, false);
        }
        int i3 = getItem(i2).f2098b;
        int i4 = i2 - 1;
        int i5 = i4 >= 0 ? getItem(i4).f2098b : i3;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2069e.l() && i3 != i5) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        q qVar = (q) view;
        if (this.f2071g) {
            listMenuItemView.setForceShowIcon(true);
        }
        qVar.c(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
