package p003b0;

import I0.i;
import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import io.flutter.plugin.platform.m;
import io.flutter.plugin.platform.x;
import io.flutter.plugin.platform.y;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class h implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1722a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1724c;

    public h(View view, m mVar) {
        this.f1723b = view;
        this.f1724c = mVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.f1722a) {
            case 0:
                i.e(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.f1724c).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity != null && iBinder != null) {
                    ((i) this.f1723b).g(iBinder, activity);
                }
                break;
            default:
                x xVar = new x(0, this);
                View view2 = (View) this.f1723b;
                view2.getViewTreeObserver().addOnDrawListener(new y(view2, xVar));
                view2.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1722a) {
            case 0:
                i.e(view, "view");
                break;
        }
    }

    public h(i iVar, Activity activity) {
        i.e(iVar, "sidecarCompat");
        this.f1723b = iVar;
        this.f1724c = new WeakReference(activity);
    }

    private final void a(View view) {
    }
}
