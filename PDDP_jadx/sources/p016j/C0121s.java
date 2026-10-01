package p016j;

import V0.i;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.p;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: j.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0121s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f2731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2733c;

    public C0121s(C0122t c0122t, int i2, int i3) {
        this.f2731a = new WeakReference(c0122t);
        this.f2732b = i2;
        this.f2733c = i3;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).post(new p(3, this));
    }

    public final void b(Typeface typeface) {
        int i2;
        WeakReference weakReference = this.f2731a;
        C0122t c0122t = (C0122t) weakReference.get();
        if (c0122t == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f2732b) != -1) {
            typeface = Typeface.create(typeface, i2, (this.f2733c & 2) != 0);
        }
        c0122t.f2745a.post(new i(weakReference, typeface, 2, false));
    }
}
