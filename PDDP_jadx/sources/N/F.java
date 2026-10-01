package N;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class F extends F.c {
    public static final Parcelable.Creator<F> CREATOR = new F.b(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Parcelable f429c;

    public F(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f429c = parcel.readParcelable(classLoader == null ? x.class.getClassLoader() : classLoader);
    }

    @Override // F.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f429c, 0);
    }
}
