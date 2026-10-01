package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static f a(g gVar) {
        I0.i.e(gVar, "state");
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 1) {
            return f.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return f.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return f.ON_RESUME;
    }
}
