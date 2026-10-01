package p031r;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f3035e = new c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3039d;

    public c(int i2, int i3, int i4, int i5) {
        this.f3036a = i2;
        this.f3037b = i3;
        this.f3038c = i4;
        this.f3039d = i5;
    }

    public static c a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f3035e : new c(i2, i3, i4, i5);
    }

    public final Insets b() {
        return b.a(this.f3036a, this.f3037b, this.f3038c, this.f3039d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3039d == cVar.f3039d && this.f3036a == cVar.f3036a && this.f3038c == cVar.f3038c && this.f3037b == cVar.f3037b;
    }

    public final int hashCode() {
        return (((((this.f3036a * 31) + this.f3037b) * 31) + this.f3038c) * 31) + this.f3039d;
    }

    public final String toString() {
        return "Insets{left=" + this.f3036a + ", top=" + this.f3037b + ", right=" + this.f3038c + ", bottom=" + this.f3039d + '}';
    }
}
