package E;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import p016j.f0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f66a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((f0) this.f66a).c((Cursor) obj);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String string;
        Cursor cursorG;
        f0 f0Var = (f0) this.f66a;
        if (charSequence == null) {
            string = "";
        } else {
            f0Var.getClass();
            string = charSequence.toString();
        }
        SearchView searchView = f0Var.f2640p;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursorG = f0Var.g(f0Var.f2641q, string);
                if (cursorG != null) {
                    cursorG.getCount();
                } else {
                    cursorG = null;
                }
            } catch (RuntimeException e2) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
            }
        } else {
            cursorG = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorG != null) {
            filterResults.count = cursorG.getCount();
            filterResults.values = cursorG;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        c cVar = this.f66a;
        Cursor cursor = cVar.f60g;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((f0) cVar).b((Cursor) obj);
    }
}
