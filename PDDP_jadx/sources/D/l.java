package D;

import N.C0040p;
import N.M;
import N.N;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f45a) {
            case 0:
                m mVar = new m(parcel);
                mVar.f46a = parcel.readInt();
                return mVar;
            case 1:
                C0040p c0040p = new C0040p();
                c0040p.f541a = parcel.readInt();
                c0040p.f542b = parcel.readInt();
                c0040p.f543c = parcel.readInt() == 1;
                return c0040p;
            case 2:
                M m2 = new M();
                m2.f444a = parcel.readInt();
                m2.f445b = parcel.readInt();
                m2.f447d = parcel.readInt() == 1;
                int i2 = parcel.readInt();
                if (i2 > 0) {
                    int[] iArr = new int[i2];
                    m2.f446c = iArr;
                    parcel.readIntArray(iArr);
                }
                return m2;
            case 3:
                N n2 = new N();
                n2.f448a = parcel.readInt();
                n2.f449b = parcel.readInt();
                int i3 = parcel.readInt();
                n2.f450c = i3;
                if (i3 > 0) {
                    int[] iArr2 = new int[i3];
                    n2.f451d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i4 = parcel.readInt();
                n2.f452e = i4;
                if (i4 > 0) {
                    int[] iArr3 = new int[i4];
                    n2.f453f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                n2.f455h = parcel.readInt() == 1;
                n2.f456i = parcel.readInt() == 1;
                n2.f457j = parcel.readInt() == 1;
                n2.f454g = parcel.readArrayList(M.class.getClassLoader());
                return n2;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f45a) {
            case 0:
                return new m[i2];
            case 1:
                return new C0040p[i2];
            case 2:
                return new M[i2];
            case 3:
                return new N[i2];
            default:
                return new ParcelImpl[i2];
        }
    }
}
