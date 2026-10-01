package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static t f2517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static r f2518f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlutterJNI f2520b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2519a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f2521c = new s(this, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f2522d = new b(this);

    public t(FlutterJNI flutterJNI) {
        this.f2520b = flutterJNI;
    }

    public static t a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f2517e == null) {
            f2517e = new t(flutterJNI);
        }
        if (f2518f == null) {
            t tVar = f2517e;
            Objects.requireNonNull(tVar);
            r rVar = new r(tVar, displayManager, 0);
            f2518f = rVar;
            displayManager.registerDisplayListener(rVar, null);
        }
        if (f2517e.f2519a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f2517e.f2519a = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f2517e;
    }
}
