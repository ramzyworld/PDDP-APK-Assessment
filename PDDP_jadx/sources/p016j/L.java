package p016j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p014i.h;
import p014i.j;
import p014i.k;

/* JADX INFO: loaded from: classes.dex */
public final class L extends A {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2585r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2586s;
    public K t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public k f2587u;

    public L(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2585r = 21;
            this.f2586s = 22;
        } else {
            this.f2585r = 22;
            this.f2586s = 21;
        }
    }

    @Override // p016j.A, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        h hVar;
        int headersCount;
        int iPointToPosition;
        int i2;
        if (this.t != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                hVar = (h) headerViewListAdapter.getWrappedAdapter();
            } else {
                hVar = (h) adapter;
                headersCount = 0;
            }
            k item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = iPointToPosition - headersCount) < 0 || i2 >= hVar.getCount()) ? null : hVar.getItem(i2);
            k kVar = this.f2587u;
            if (kVar != item) {
                j jVar = hVar.f2069e;
                if (kVar != null) {
                    this.t.i(jVar, kVar);
                }
                this.f2587u = item;
                if (item != null) {
                    this.t.d(jVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f2585r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f2586s) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ((h) getAdapter()).f2069e.c(false);
        return true;
    }

    public void setHoverListener(K k2) {
        this.t = k2;
    }

    @Override // p016j.A, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
