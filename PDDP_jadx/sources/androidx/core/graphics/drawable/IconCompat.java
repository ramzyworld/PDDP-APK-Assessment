package androidx.core.graphics.drawable;

import I.k;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import p033s.c;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1373k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1375b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1383j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1374a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f1376c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f1377d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1378e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1379f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f1380g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1381h = f1373k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f1382i = null;

    public final String toString() {
        String str;
        int iIntValue;
        int i2;
        if (this.f1374a == -1) {
            return String.valueOf(this.f1375b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1374a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                str = "URI";
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f1374a) {
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1375b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1375b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1383j);
                sb.append(" id=");
                int i3 = this.f1374a;
                if (i3 == -1 && (i2 = Build.VERSION.SDK_INT) >= 23) {
                    Object obj = this.f1375b;
                    if (i2 >= 28) {
                        iIntValue = c.a(obj);
                    } else {
                        try {
                            iIntValue = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                            iIntValue = 0;
                        } catch (NoSuchMethodException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                            iIntValue = 0;
                        } catch (InvocationTargetException e4) {
                            Log.e("IconCompat", "Unable to get icon resource", e4);
                            iIntValue = 0;
                        }
                    }
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    iIntValue = this.f1378e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1378e);
                if (this.f1379f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1379f);
                }
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.f1375b);
                break;
        }
        if (this.f1380g != null) {
            sb.append(" tint=");
            sb.append(this.f1380g);
        }
        if (this.f1381h != f1373k) {
            sb.append(" mode=");
            sb.append(this.f1381h);
        }
        sb.append(")");
        return sb.toString();
    }
}
