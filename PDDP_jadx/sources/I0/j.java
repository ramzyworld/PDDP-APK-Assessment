package I0;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements f, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f333e;

    public j(int i2) {
        this.f333e = i2;
    }

    @Override // I0.f
    public final int c() {
        return this.f333e;
    }

    public final String toString() {
        q.f339a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        i.d(string, "renderLambdaToString(...)");
        return string;
    }
}
