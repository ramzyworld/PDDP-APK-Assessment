package io.flutter.plugin.platform;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class u implements io.flutter.view.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f2374a;

    public u(v vVar) {
        this.f2374a = vVar;
    }

    @Override // io.flutter.view.o
    public final void onTrimMemory(int i2) {
        if (i2 != 80 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f2374a.f2380f = true;
    }
}
