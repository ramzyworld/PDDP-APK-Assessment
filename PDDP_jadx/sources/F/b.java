package F;

import N.F;
import android.os.Parcel;
import android.os.Parcelable;
import p016j.c0;
import p016j.p0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68a;

    public /* synthetic */ b(int i2) {
        this.f68a = i2;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f68a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f69b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new F(parcel, classLoader);
            case 2:
                return new c0(parcel, classLoader);
            default:
                return new p0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f68a) {
            case 0:
                return new c[i2];
            case 1:
                return new F[i2];
            case 2:
                return new c0[i2];
            default:
                return new p0[i2];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f68a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return c.f69b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new F(parcel, null);
            case 2:
                return new c0(parcel, null);
            default:
                return new p0(parcel, null);
        }
    }
}
