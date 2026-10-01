package R;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f767k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new p022m.a(), new p022m.a(), new p022m.a());
    }

    @Override // R.a
    public final b a() {
        Parcel parcel = this.f761e;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.f766j;
        if (i2 == this.f762f) {
            i2 = this.f763g;
        }
        return new b(parcel, iDataPosition, i2, this.f764h + "  ", this.f757a, this.f758b, this.f759c);
    }

    @Override // R.a
    public final boolean e(int i2) {
        while (this.f766j < this.f763g) {
            int i3 = this.f767k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f766j;
            Parcel parcel = this.f761e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f767k = parcel.readInt();
            this.f766j += i5;
        }
        return this.f767k == i2;
    }

    @Override // R.a
    public final void h(int i2) {
        int i3 = this.f765i;
        SparseIntArray sparseIntArray = this.f760d;
        Parcel parcel = this.f761e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(iDataPosition - i4);
            parcel.setDataPosition(iDataPosition);
        }
        this.f765i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public b(Parcel parcel, int i2, int i3, String str, p022m.a aVar, p022m.a aVar2, p022m.a aVar3) {
        super(aVar, aVar2, aVar3);
        this.f760d = new SparseIntArray();
        this.f765i = -1;
        this.f767k = -1;
        this.f761e = parcel;
        this.f762f = i2;
        this.f763g = i3;
        this.f766j = i2;
        this.f764h = str;
    }
}
