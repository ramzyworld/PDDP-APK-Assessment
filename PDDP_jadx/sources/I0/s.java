package I0;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static void a(int i2, Object obj) {
        if (obj == null || b(i2, obj)) {
            return;
        }
        c(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static boolean b(int i2, Object obj) {
        int iC;
        if (!(obj instanceof p041x0.a)) {
            return false;
        }
        if (obj instanceof f) {
            iC = ((f) obj).c();
        } else if (obj instanceof H0.a) {
            iC = 0;
        } else if (obj instanceof H0.l) {
            iC = 1;
        } else if (obj instanceof H0.p) {
            iC = 2;
        } else {
            iC = obj instanceof H0.q ? 3 : -1;
        }
        return iC == i2;
    }

    public static void c(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        i.f(classCastException, s.class.getName());
        throw classCastException;
    }
}
