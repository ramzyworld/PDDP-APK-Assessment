package io.flutter.view;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f2510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2511b;

    public m(View view, int i2) {
        this.f2510a = view;
        this.f2511b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f2511b == mVar.f2511b && this.f2510a.equals(mVar.f2510a);
    }

    public final int hashCode() {
        return ((this.f2510a.hashCode() + 31) * 31) + this.f2511b;
    }
}
