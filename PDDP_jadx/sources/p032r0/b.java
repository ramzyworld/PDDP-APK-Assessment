package p032r0;

import N.C0026b;
import N.Q;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;
import p011g0.AbstractActivityC0098e;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f3059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractActivityC0098e f3060b;

    public b(AbstractActivityC0098e abstractActivityC0098e, Q q2) {
        p028p0.b bVar = new p028p0.b(15, this);
        this.f3060b = abstractActivityC0098e;
        this.f3059a = q2;
        q2.f472g = bVar;
    }

    public static Locale a(String str) {
        String str2;
        String[] strArrSplit = str.replace('_', '-').split("-", -1);
        String str3 = strArrSplit[0];
        String str4 = "";
        int i2 = 1;
        if (strArrSplit.length <= 1 || strArrSplit[1].length() != 4) {
            str2 = "";
        } else {
            str2 = strArrSplit[1];
            i2 = 2;
        }
        if (strArrSplit.length > i2 && strArrSplit[i2].length() >= 2 && strArrSplit[i2].length() <= 3) {
            str4 = strArrSplit[i2];
        }
        return new Locale(str3, str4, str2);
    }

    public final void b(Configuration configuration) {
        ArrayList<Locale> arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            int size = locales.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(locales.get(i2));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        Q q2 = this.f3059a;
        ArrayList arrayList2 = new ArrayList();
        for (Locale locale : arrayList) {
            locale.getLanguage();
            locale.getCountry();
            locale.getVariant();
            arrayList2.add(locale.getLanguage());
            arrayList2.add(locale.getCountry());
            arrayList2.add(locale.getScript());
            arrayList2.add(locale.getVariant());
        }
        ((C0026b) q2.f471f).F("setLocale", arrayList2, null);
    }
}
