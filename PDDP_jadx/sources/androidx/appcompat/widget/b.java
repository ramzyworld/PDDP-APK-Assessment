package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnKeyListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SearchView f1365e;

    public b(SearchView searchView) {
        this.f1365e = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        SearchView searchView = this.f1365e;
        if (searchView.f1270f0 == null) {
            return false;
        }
        SearchView.SearchAutoComplete searchAutoComplete = searchView.t;
        if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
            if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.h("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
        if (searchView.f1270f0 != null && searchView.f1261S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                searchView.l(searchAutoComplete.getListSelection());
                return true;
            }
            if (i2 == 21 || i2 == 22) {
                searchAutoComplete.setSelection(i2 == 21 ? 0 : searchAutoComplete.length());
                searchAutoComplete.setListSelection(0);
                searchAutoComplete.clearListSelection();
                Method method = SearchView.f1242k0.f8c;
                if (method == null) {
                    return true;
                }
                try {
                    method.invoke(searchAutoComplete, Boolean.TRUE);
                    return true;
                } catch (Exception unused) {
                    return true;
                }
            }
            if (i2 == 19) {
                searchAutoComplete.getListSelection();
            }
        }
        return false;
    }
}
