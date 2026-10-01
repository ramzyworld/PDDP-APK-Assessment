package androidx.lifecycle;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, f fVar) {
        I0.i.e(activity, "activity");
        I0.i.e(fVar, "event");
        if (activity instanceof l) {
            n nVarA = ((l) activity).a();
            if (nVarA instanceof n) {
                nVarA.c(fVar);
            }
        }
    }
}
