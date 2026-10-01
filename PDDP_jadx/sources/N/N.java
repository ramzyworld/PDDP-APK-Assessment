package N;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new D.l(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f457j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f448a);
        parcel.writeInt(this.f449b);
        parcel.writeInt(this.f450c);
        if (this.f450c > 0) {
            parcel.writeIntArray(this.f451d);
        }
        parcel.writeInt(this.f452e);
        if (this.f452e > 0) {
            parcel.writeIntArray(this.f453f);
        }
        parcel.writeInt(this.f455h ? 1 : 0);
        parcel.writeInt(this.f456i ? 1 : 0);
        parcel.writeInt(this.f457j ? 1 : 0);
        parcel.writeList(this.f454g);
    }
}
