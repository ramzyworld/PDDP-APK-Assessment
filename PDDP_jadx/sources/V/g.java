package V;

import H0.l;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static String b(Object obj, String str) {
        I0.i.e(obj, "value");
        return str + " value: " + obj;
    }

    public static i c(String str) {
        String strGroup;
        if (str != null && !P0.j.U(str)) {
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
                int i2 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                if (strGroup2 != null) {
                    int i3 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    if (strGroup3 != null) {
                        int i4 = Integer.parseInt(strGroup3);
                        String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
                        I0.i.d(strGroup4, "description");
                        return new i(i2, i3, i4, strGroup4);
                    }
                }
            }
        }
        return null;
    }

    public abstract Object a();

    public abstract g d(String str, l lVar);
}
