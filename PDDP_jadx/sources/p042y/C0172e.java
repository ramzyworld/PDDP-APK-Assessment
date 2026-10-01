package p042y;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: renamed from: y.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0172e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f3460a;

    public C0172e(DisplayCutout displayCutout) {
        this.f3460a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0172e.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f3460a, ((C0172e) obj).f3460a);
    }

    public final int hashCode() {
        return this.f3460a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f3460a + "}";
    }
}
