package p029q;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f3005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f3006b;

    public m(Resources resources, Resources.Theme theme) {
        this.f3005a = resources;
        this.f3006b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f3005a.equals(mVar.f3005a) && Objects.equals(this.f3006b, mVar.f3006b);
    }

    public final int hashCode() {
        return Objects.hash(this.f3005a, this.f3006b);
    }
}
