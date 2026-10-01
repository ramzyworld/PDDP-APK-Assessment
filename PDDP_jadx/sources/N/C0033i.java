package N;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* JADX INFO: renamed from: N.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0033i implements Comparator {
    /* JADX WARN: Code duplicated, block: B:13:0x0019 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x001b A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0035k c0035k = (C0035k) obj;
        C0035k c0035k2 = (C0035k) obj2;
        RecyclerView recyclerView = c0035k.f525d;
        if ((recyclerView == null) != (c0035k2.f525d == null)) {
            if (recyclerView == null) {
                return 1;
            }
            return -1;
        }
        boolean z2 = c0035k.f522a;
        if (z2 != c0035k2.f522a) {
            if (z2) {
                return -1;
            }
            return 1;
        }
        int i2 = c0035k2.f523b - c0035k.f523b;
        if (i2 != 0) {
            return i2;
        }
        int i3 = c0035k.f524c - c0035k2.f524c;
        if (i3 != 0) {
            return i3;
        }
        return 0;
    }
}
