package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements O.b {
    @Override // O.b
    public final List a() {
        return p043y0.l.f3483e;
    }

    @Override // O.b
    public final Object b(Context context) {
        I0.i.e(context, "context");
        O.a aVarC = O.a.c(context);
        I0.i.d(aVarC, "getInstance(context)");
        if (!aVarC.f564b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!j.f1589a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            I0.i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new i());
        }
        s sVar = s.f1604m;
        sVar.getClass();
        sVar.f1609i = new Handler();
        sVar.f1610j.c(f.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        I0.i.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new r(sVar));
        return sVar;
    }
}
