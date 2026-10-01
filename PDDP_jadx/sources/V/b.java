package V;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f948d;

    public b(Rect rect) {
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        this.f945a = i2;
        this.f946b = i3;
        this.f947c = i4;
        this.f948d = i5;
        if (i2 > i4) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i2 + ", right: " + i4).toString());
        }
        if (i3 <= i5) {
            return;
        }
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i3 + ", bottom: " + i5).toString());
    }

    public final int a() {
        return this.f948d - this.f946b;
    }

    public final int b() {
        return this.f947c - this.f945a;
    }

    public final Rect c() {
        return new Rect(this.f945a, this.f946b, this.f947c, this.f948d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        I0.i.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f945a == bVar.f945a && this.f946b == bVar.f946b && this.f947c == bVar.f947c && this.f948d == bVar.f948d;
    }

    public final int hashCode() {
        return (((((this.f945a * 31) + this.f946b) * 31) + this.f947c) * 31) + this.f948d;
    }

    public final String toString() {
        return b.class.getSimpleName() + " { [" + this.f945a + ',' + this.f946b + ',' + this.f947c + ',' + this.f948d + "] }";
    }
}
