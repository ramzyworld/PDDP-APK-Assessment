package androidx.core.app;

import R.a;
import R.b;
import R.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarG = remoteActionCompat.f1367a;
        if (aVar.e(1)) {
            cVarG = aVar.g();
        }
        remoteActionCompat.f1367a = (IconCompat) cVarG;
        CharSequence charSequence = remoteActionCompat.f1368b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f761e);
        }
        remoteActionCompat.f1368b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1369c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f761e);
        }
        remoteActionCompat.f1369c = charSequence2;
        remoteActionCompat.f1370d = (PendingIntent) aVar.f(remoteActionCompat.f1370d, 4);
        boolean z2 = remoteActionCompat.f1371e;
        if (aVar.e(5)) {
            z2 = ((b) aVar).f761e.readInt() != 0;
        }
        remoteActionCompat.f1371e = z2;
        boolean z3 = remoteActionCompat.f1372f;
        if (aVar.e(6)) {
            z3 = ((b) aVar).f761e.readInt() != 0;
        }
        remoteActionCompat.f1372f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1367a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1368b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f761e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1369c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1370d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1371e;
        aVar.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1372f;
        aVar.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
