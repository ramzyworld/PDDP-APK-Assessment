package androidx.core.graphics.drawable;

import I.k;
import R.a;
import R.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f1374a;
        if (aVar.e(1)) {
            i2 = ((b) aVar).f761e.readInt();
        }
        iconCompat.f1374a = i2;
        byte[] bArr = iconCompat.f1376c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f761e;
            int i3 = parcel.readInt();
            if (i3 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i3];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1376c = bArr;
        iconCompat.f1377d = aVar.f(iconCompat.f1377d, 3);
        int i4 = iconCompat.f1378e;
        if (aVar.e(4)) {
            i4 = ((b) aVar).f761e.readInt();
        }
        iconCompat.f1378e = i4;
        int i5 = iconCompat.f1379f;
        if (aVar.e(5)) {
            i5 = ((b) aVar).f761e.readInt();
        }
        iconCompat.f1379f = i5;
        iconCompat.f1380g = (ColorStateList) aVar.f(iconCompat.f1380g, 6);
        String string = iconCompat.f1382i;
        if (aVar.e(7)) {
            string = ((b) aVar).f761e.readString();
        }
        iconCompat.f1382i = string;
        String string2 = iconCompat.f1383j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f761e.readString();
        }
        iconCompat.f1383j = string2;
        iconCompat.f1381h = PorterDuff.Mode.valueOf(iconCompat.f1382i);
        switch (iconCompat.f1374a) {
            case -1:
                Parcelable parcelable = iconCompat.f1377d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1375b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.f1377d;
                if (parcelable2 != null) {
                    iconCompat.f1375b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1376c;
                    iconCompat.f1375b = bArr3;
                    iconCompat.f1374a = 3;
                    iconCompat.f1378e = 0;
                    iconCompat.f1379f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                String str = new String(iconCompat.f1376c, Charset.forName("UTF-16"));
                iconCompat.f1375b = str;
                if (iconCompat.f1374a == 2 && iconCompat.f1383j == null) {
                    iconCompat.f1383j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1375b = iconCompat.f1376c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1382i = iconCompat.f1381h.name();
        switch (iconCompat.f1374a) {
            case -1:
                iconCompat.f1377d = (Parcelable) iconCompat.f1375b;
                break;
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.f1377d = (Parcelable) iconCompat.f1375b;
                break;
            case 2:
                iconCompat.f1376c = ((String) iconCompat.f1375b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1376c = (byte[]) iconCompat.f1375b;
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f1376c = iconCompat.f1375b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f1374a;
        if (-1 != i2) {
            aVar.h(1);
            ((b) aVar).f761e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f1376c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f761e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1377d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f761e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f1378e;
        if (i3 != 0) {
            aVar.h(4);
            ((b) aVar).f761e.writeInt(i3);
        }
        int i4 = iconCompat.f1379f;
        if (i4 != 0) {
            aVar.h(5);
            ((b) aVar).f761e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f1380g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f761e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1382i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f761e.writeString(str);
        }
        String str2 = iconCompat.f1383j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f761e.writeString(str2);
        }
    }
}
