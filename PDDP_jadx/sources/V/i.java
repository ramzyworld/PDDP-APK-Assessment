package V;

import G.W;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Comparable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i f961j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p041x0.e f966i = new p041x0.e(new W(3, this));

    static {
        new i(0, 0, 0, "");
        f961j = new i(0, 1, 0, "");
        new i(1, 0, 0, "");
    }

    public i(int i2, int i3, int i4, String str) {
        this.f962e = i2;
        this.f963f = i3;
        this.f964g = i4;
        this.f965h = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        I0.i.e(iVar, "other");
        Object objA = this.f966i.a();
        I0.i.d(objA, "<get-bigInteger>(...)");
        Object objA2 = iVar.f966i.a();
        I0.i.d(objA2, "<get-bigInteger>(...)");
        return ((BigInteger) objA).compareTo((BigInteger) objA2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f962e == iVar.f962e && this.f963f == iVar.f963f && this.f964g == iVar.f964g;
    }

    public final int hashCode() {
        return ((((527 + this.f962e) * 31) + this.f963f) * 31) + this.f964g;
    }

    public final String toString() {
        String str;
        String str2 = this.f965h;
        if (P0.j.U(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.f962e + '.' + this.f963f + '.' + this.f964g + str;
    }
}
