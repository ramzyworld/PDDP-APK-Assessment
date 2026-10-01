package p043y0;

import I0.i;
import p000a.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {
    public static final void S(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        i.e(objArr, "<this>");
        i.e(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }
}
