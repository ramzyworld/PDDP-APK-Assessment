package N;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0040p implements Parcelable {
    public static final Parcelable.Creator<C0040p> CREATOR = new D.l(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f543c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f541a);
        parcel.writeInt(this.f542b);
        parcel.writeInt(this.f543c ? 1 : 0);
    }
}
