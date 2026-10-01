package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class r extends c {
    final /* synthetic */ s this$0;

    public static final class a extends c {
        final /* synthetic */ s this$0;

        public a(s sVar) {
            this.this$0 = sVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            I0.i.e(activity, "activity");
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            I0.i.e(activity, "activity");
            s sVar = this.this$0;
            int i2 = sVar.f1605e + 1;
            sVar.f1605e = i2;
            if (i2 == 1 && sVar.f1608h) {
                sVar.f1610j.c(f.ON_START);
                sVar.f1608h = false;
            }
        }
    }

    public r(s sVar) {
        this.this$0 = sVar;
    }

    @Override // androidx.lifecycle.c, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        I0.i.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = w.f1613f;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            I0.i.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((w) fragmentFindFragmentByTag).f1614e = this.this$0.f1612l;
        }
    }

    @Override // androidx.lifecycle.c, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        I0.i.e(activity, "activity");
        s sVar = this.this$0;
        int i2 = sVar.f1606f - 1;
        sVar.f1606f = i2;
        if (i2 == 0) {
            Handler handler = sVar.f1609i;
            I0.i.b(handler);
            handler.postDelayed(sVar.f1611k, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        I0.i.e(activity, "activity");
        q.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.c, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        I0.i.e(activity, "activity");
        s sVar = this.this$0;
        int i2 = sVar.f1605e - 1;
        sVar.f1605e = i2;
        if (i2 == 0 && sVar.f1607g) {
            sVar.f1610j.c(f.ON_STOP);
            sVar.f1608h = true;
        }
    }
}
