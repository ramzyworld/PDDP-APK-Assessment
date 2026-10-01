package T;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, String str, String str2) {
        super(str, str2);
        this.f821d = i2;
    }

    @Override // T.c
    public final boolean a() {
        switch (this.f821d) {
            case 0:
                return Build.VERSION.SDK_INT >= 23;
            case 1:
                return Build.VERSION.SDK_INT >= 24;
            case 2:
                return false;
            case 3:
                return Build.VERSION.SDK_INT >= 26;
            case I.k.LONG_FIELD_NUMBER /* 4 */:
                return Build.VERSION.SDK_INT >= 27;
            case I.k.STRING_FIELD_NUMBER /* 5 */:
                return Build.VERSION.SDK_INT >= 28;
            default:
                return Build.VERSION.SDK_INT >= 29;
        }
    }
}
