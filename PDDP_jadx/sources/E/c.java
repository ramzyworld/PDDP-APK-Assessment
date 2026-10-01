package E;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p016j.f0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f58e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f59f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Cursor f60g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f61h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f62i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f63j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f64k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f65l;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f60g;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f63j;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f64k;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f60g = cursor;
            if (cursor != null) {
                a aVar2 = this.f63j;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f64k;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f62i = cursor.getColumnIndexOrThrow("_id");
                this.f58e = true;
                notifyDataSetChanged();
            } else {
                this.f62i = -1;
                this.f58e = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f58e || (cursor = this.f60g) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f58e) {
            return null;
        }
        this.f60g.moveToPosition(i2);
        if (view == null) {
            f0 f0Var = (f0) this;
            view = f0Var.f2639o.inflate(f0Var.f2638n, viewGroup, false);
        }
        a(view, this.f60g);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f65l == null) {
            d dVar = new d();
            dVar.f66a = this;
            this.f65l = dVar;
        }
        return this.f65l;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        Cursor cursor;
        if (!this.f58e || (cursor = this.f60g) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f60g;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        Cursor cursor;
        if (this.f58e && (cursor = this.f60g) != null && cursor.moveToPosition(i2)) {
            return this.f60g.getLong(this.f62i);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f58e) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f60g.moveToPosition(i2)) {
            throw new IllegalStateException("couldn't move cursor to position " + i2);
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f60g);
        return view;
    }
}
