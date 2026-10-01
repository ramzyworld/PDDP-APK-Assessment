package p042y;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: y.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0182o implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O f3472a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3473b;

    public ViewOnApplyWindowInsetsListenerC0182o(View view, InterfaceC0177j interfaceC0177j) {
        this.f3473b = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        O oA = O.a(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            AbstractC0183p.a(windowInsets, this.f3473b);
            if (oA.equals(this.f3472a)) {
                throw null;
            }
        }
        this.f3472a = oA;
        throw null;
    }
}
