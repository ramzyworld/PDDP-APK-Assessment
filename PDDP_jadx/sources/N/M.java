package N;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class M implements Parcelable {
    public static final Parcelable.Creator<M> CREATOR = new D.l(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f447d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f444a + ", mGapDir=" + this.f445b + ", mHasUnwantedGapAfter=" + this.f447d + ", mGapPerSpan=" + Arrays.toString(this.f446c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f444a);
        parcel.writeInt(this.f445b);
        parcel.writeInt(this.f447d ? 1 : 0);
        int[] iArr = this.f446c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f446c);
        }
    }
}
