package J;

import H0.l;
import I0.i;
import I0.j;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a extends j implements l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f340f = new a(1);

    @Override // H0.l
    public final Object j(Object obj) {
        String strValueOf;
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            i.e(bArr, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i2 = 0;
            for (byte b2 : bArr) {
                i2++;
                if (i2 > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b2));
            }
            sb.append((CharSequence) "]");
            strValueOf = sb.toString();
            i.d(strValueOf, "toString(...)");
        } else {
            strValueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((d) entry.getKey()).f346a + " = " + strValueOf;
    }
}
