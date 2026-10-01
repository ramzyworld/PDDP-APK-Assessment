package androidx.profileinstaller;

import H.a;
import L.h;
import L.k;
import O.b;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // O.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // O.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new a(5);
        }
        k.a(new h(0, this, context.getApplicationContext()));
        return new a(5);
    }
}
