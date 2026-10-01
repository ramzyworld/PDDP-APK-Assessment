package T;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f822c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f824b;

    public c(String str, String str2) {
        this.f823a = str;
        this.f824b = str2;
        f822c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f820a;
        String str = this.f824b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ("eng".equals(str2) || "userdebug".equals(str2)) {
                if (hashSet.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }
}
