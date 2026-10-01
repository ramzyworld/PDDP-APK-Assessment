package androidx.versionedparcelable;

import D.l;
import R.b;
import R.c;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new l(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f1709a;

    public ParcelImpl(Parcel parcel) {
        this.f1709a = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        new b(parcel).i(this.f1709a);
    }
}
