package io.flutter.plugin.platform;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class q extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0103a f2365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f2366f;

    public q(Context context, C0103a c0103a, View view) {
        super(context);
        this.f2365e = c0103a;
        this.f2366f = view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.k kVar = this.f2365e.f2309a;
        if (kVar == null) {
            return false;
        }
        return kVar.a(this.f2366f, view, accessibilityEvent);
    }
}
