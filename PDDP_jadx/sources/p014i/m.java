package p014i;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class m implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f2123e;

    public m(n nVar) {
        this.f2123e = nVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2123e.c();
    }
}
