package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class w extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f1613f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public D.j f1614e;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final v Companion = new v();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            I0.i.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            I0.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            I0.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            I0.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            I0.i.e(activity, "activity");
            int i2 = w.f1613f;
            t.a(activity, f.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            I0.i.e(activity, "activity");
            int i2 = w.f1613f;
            t.a(activity, f.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            I0.i.e(activity, "activity");
            int i2 = w.f1613f;
            t.a(activity, f.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            I0.i.e(activity, "activity");
            int i2 = w.f1613f;
            t.a(activity, f.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            I0.i.e(activity, "activity");
            int i2 = w.f1613f;
            t.a(activity, f.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            I0.i.e(activity, "activity");
            int i2 = w.f1613f;
            t.a(activity, f.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            I0.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            I0.i.e(activity, "activity");
            I0.i.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            I0.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            I0.i.e(activity, "activity");
        }
    }

    public final void a(f fVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            I0.i.d(activity, "activity");
            t.a(activity, fVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(f.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(f.ON_DESTROY);
        this.f1614e = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(f.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        D.j jVar = this.f1614e;
        if (jVar != null) {
            ((s) jVar.f44f).b();
        }
        a(f.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        D.j jVar = this.f1614e;
        if (jVar != null) {
            s sVar = (s) jVar.f44f;
            int i2 = sVar.f1605e + 1;
            sVar.f1605e = i2;
            if (i2 == 1 && sVar.f1608h) {
                sVar.f1610j.c(f.ON_START);
                sVar.f1608h = false;
            }
        }
        a(f.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(f.ON_STOP);
    }
}
