package p042y;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class K extends J {
    public K(O o2, WindowInsets windowInsets) {
        super(o2, windowInsets);
    }

    @Override // p042y.N
    public O a() {
        return O.a(this.f3437c.consumeDisplayCutout(), null);
    }

    @Override // p042y.N
    public C0172e e() {
        DisplayCutout displayCutout = this.f3437c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0172e(displayCutout);
    }

    @Override // p042y.I, p042y.N
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k2 = (K) obj;
        return Objects.equals(this.f3437c, k2.f3437c) && Objects.equals(this.f3439e, k2.f3439e);
    }

    @Override // p042y.N
    public int hashCode() {
        return this.f3437c.hashCode();
    }
}
