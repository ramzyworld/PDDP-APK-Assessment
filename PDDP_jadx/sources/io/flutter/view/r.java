package io.flutter.view;

import android.hardware.display.DisplayManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayManager f2513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2514c;

    public /* synthetic */ r(Object obj, DisplayManager displayManager, int i2) {
        this.f2512a = i2;
        this.f2514c = obj;
        this.f2513b = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i2) {
        switch (this.f2512a) {
            case 0:
                break;
            default:
                Iterator it = ((ArrayList) this.f2514c).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayAdded(i2);
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i2) {
        switch (this.f2512a) {
            case 0:
                if (i2 == 0) {
                    float refreshRate = this.f2513b.getDisplay(0).getRefreshRate();
                    t tVar = (t) this.f2514c;
                    tVar.f2519a = (long) (1.0E9d / ((double) refreshRate));
                    tVar.f2520b.setRefreshRateFPS(refreshRate);
                }
                break;
            default:
                if (this.f2513b.getDisplay(i2) != null) {
                    Iterator it = ((ArrayList) this.f2514c).iterator();
                    while (it.hasNext()) {
                        ((DisplayManager.DisplayListener) it.next()).onDisplayChanged(i2);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i2) {
        switch (this.f2512a) {
            case 0:
                break;
            default:
                Iterator it = ((ArrayList) this.f2514c).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayRemoved(i2);
                }
                break;
        }
    }

    private final void a(int i2) {
    }

    private final void b(int i2) {
    }
}
