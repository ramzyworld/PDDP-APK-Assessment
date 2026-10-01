package io.flutter.plugin.platform;

import android.app.Activity;
import android.hardware.display.VirtualDisplay;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final w f2385i = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SingleViewPresentation f2386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f2387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0103a f2388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f2391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f2392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public VirtualDisplay f2393h;

    public z(Activity activity, C0103a c0103a, VirtualDisplay virtualDisplay, g gVar, h hVar, l lVar, int i2) {
        this.f2387b = activity;
        this.f2388c = c0103a;
        this.f2391f = hVar;
        this.f2392g = lVar;
        this.f2390e = i2;
        this.f2393h = virtualDisplay;
        this.f2389d = activity.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(activity, this.f2393h.getDisplay(), gVar, c0103a, i2, lVar);
        this.f2386a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public final View a() {
        SingleViewPresentation singleViewPresentation = this.f2386a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }
}
