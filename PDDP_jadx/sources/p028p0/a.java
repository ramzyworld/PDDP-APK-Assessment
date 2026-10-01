package p028p0;

import N.C0026b;
import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;
import p015i0.b;
import p030q0.i;
import p030q0.o;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0026b f2894a;

    public a(b bVar, int i2) {
        switch (i2) {
            case 1:
                H.a aVar = new H.a(22);
                C0026b c0026b = new C0026b(bVar, "flutter/navigation", i.f3027a, 10);
                this.f2894a = c0026b;
                c0026b.N(aVar);
                break;
            default:
                H.a aVar2 = new H.a(20);
                C0026b c0026b2 = new C0026b(bVar, "flutter/backgesture", o.f3031a, 10);
                this.f2894a = c0026b2;
                c0026b2.N(aVar2);
                break;
        }
    }

    public static HashMap a(BackEvent backEvent) {
        HashMap map = new HashMap(3);
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        map.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        map.put("progress", Float.valueOf(backEvent.getProgress()));
        map.put("swipeEdge", Integer.valueOf(backEvent.getSwipeEdge()));
        return map;
    }
}
