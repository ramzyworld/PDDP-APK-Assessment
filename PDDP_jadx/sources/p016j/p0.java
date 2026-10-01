package p016j;

import F.b;
import F.c;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends c {
    public static final Parcelable.Creator<p0> CREATOR = new b(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2713d;

    public p0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2712c = parcel.readInt();
        this.f2713d = parcel.readInt() != 0;
    }

    @Override // F.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f2712c);
        parcel.writeInt(this.f2713d ? 1 : 0);
    }
}
