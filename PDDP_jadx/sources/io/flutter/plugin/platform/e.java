package io.flutter.plugin.platform;

import N.C0026b;
import N.Q;
import android.view.View;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnSystemUiVisibilityChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f2314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f2315b;

    public e(f fVar, View view) {
        this.f2315b = fVar;
        this.f2314a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(final int i2) {
        this.f2314a.post(new Runnable() { // from class: io.flutter.plugin.platform.d
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2 & 4;
                f fVar = this.f2312e.f2315b;
                if (i3 == 0) {
                    Q q2 = fVar.f2317b;
                    q2.getClass();
                    ((C0026b) q2.f471f).F("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                } else {
                    Q q3 = fVar.f2317b;
                    q3.getClass();
                    ((C0026b) q3.f471f).F("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                }
            }
        });
    }
}
