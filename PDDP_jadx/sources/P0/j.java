package P0;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends h {
    public static final int S(CharSequence charSequence) {
        I0.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static int T(CharSequence charSequence, String str, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        I0.i.e(charSequence, "<this>");
        I0.i.e(str, "string");
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(str, i2);
        }
        int length = charSequence.length();
        if (i2 < 0) {
            i2 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        M0.c cVar = new M0.c(i2, length, 1);
        boolean z2 = charSequence instanceof String;
        int i4 = cVar.f415g;
        int i5 = cVar.f414f;
        int i6 = cVar.f413e;
        if (z2 && (str instanceof String)) {
            if ((i4 <= 0 || i6 > i5) && (i4 >= 0 || i5 > i6)) {
                return -1;
            }
            while (!V(str, (String) charSequence, i6, str.length(), false)) {
                if (i6 == i5) {
                    return -1;
                }
                i6 += i4;
            }
        } else {
            if ((i4 <= 0 || i6 > i5) && (i4 >= 0 || i5 > i6)) {
                return -1;
            }
            while (!W(str, charSequence, i6, str.length(), false)) {
                if (i6 == i5) {
                    return -1;
                }
                i6 += i4;
            }
        }
        return i6;
    }

    public static boolean U(CharSequence charSequence) {
        I0.i.e(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        Iterable cVar = new M0.c(0, charSequence.length() - 1, 1);
        if ((cVar instanceof Collection) && ((Collection) cVar).isEmpty()) {
            return true;
        }
        Iterator it = cVar.iterator();
        while (((M0.b) it).f418g) {
            char cCharAt = charSequence.charAt(((M0.b) it).a());
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean V(String str, String str2, int i2, int i3, boolean z2) {
        I0.i.e(str, "<this>");
        I0.i.e(str2, "other");
        return !z2 ? str.regionMatches(0, str2, i2, i3) : str.regionMatches(z2, 0, str2, i2, i3);
    }

    public static final boolean W(String str, CharSequence charSequence, int i2, int i3, boolean z2) {
        char upperCase;
        char upperCase2;
        I0.i.e(str, "<this>");
        I0.i.e(charSequence, "other");
        if (i2 < 0 || str.length() - i3 < 0 || i2 > charSequence.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            char cCharAt = str.charAt(i4);
            char cCharAt2 = charSequence.charAt(i2 + i4);
            if (cCharAt != cCharAt2 && (!z2 || ((upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)))) {
                return false;
            }
        }
        return true;
    }

    public static String X(String str, String str2) {
        I0.i.e(str2, "delimiter");
        int iT = T(str, str2, 0, 6);
        if (iT == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iT, str.length());
        I0.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Y(String str, String str2) {
        I0.i.e(str, "<this>");
        I0.i.e(str2, "missingDelimiterValue");
        int iLastIndexOf = str.lastIndexOf(46, S(str));
        if (iLastIndexOf == -1) {
            return str2;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        I0.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }
}
