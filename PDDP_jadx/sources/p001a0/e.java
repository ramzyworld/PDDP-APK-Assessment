package p001a0;

import I0.i;
import Y.b;
import Y.c;
import Y.k;
import Y.l;
import Y.o;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import p042y.E;
import p042y.F;
import p042y.G;
import p042y.H;
import p042y.O;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static c a(l lVar, FoldingFeature foldingFeature) {
        b bVar;
        b bVar2;
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = b.f1074k;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = b.f1075l;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = b.f1072i;
        } else {
            if (state != 2) {
                return null;
            }
            bVar2 = b.f1073j;
        }
        Rect bounds = foldingFeature.getBounds();
        i.d(bounds, "oemFeature.bounds");
        V.b bVar3 = new V.b(bounds);
        Rect rectC = lVar.f1098a.c();
        if (bVar3.a() == 0 && bVar3.b() == 0) {
            return null;
        }
        if (bVar3.b() != rectC.width() && bVar3.a() != rectC.height()) {
            return null;
        }
        if (bVar3.b() < rectC.width() && bVar3.a() < rectC.height()) {
            return null;
        }
        if (bVar3.b() == rectC.width() && bVar3.a() == rectC.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        i.d(bounds2, "oemFeature.bounds");
        return new c(new V.b(bounds2), bVar, bVar2);
    }

    public static k b(l lVar, WindowLayoutInfo windowLayoutInfo) {
        c cVarA;
        i.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        i.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                i.d(foldingFeature, "feature");
                cVarA = a(lVar, foldingFeature);
            } else {
                cVarA = null;
            }
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return new k(arrayList);
    }

    public static k c(Context context, WindowLayoutInfo windowLayoutInfo) throws Exception {
        boolean z2;
        H f2;
        l lVar;
        i.e(windowLayoutInfo, "info");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            if (i2 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i3 = o.f1102b;
            return b(o.a((Activity) context), windowLayoutInfo);
        }
        int i4 = o.f1102b;
        if (i2 >= 30) {
            WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
            O oA = O.a(windowManager.getCurrentWindowMetrics().getWindowInsets(), null);
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            i.d(bounds, "wm.currentWindowMetrics.bounds");
            lVar = new l(bounds, oA);
        } else {
            Context baseContext = context;
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    throw new IllegalArgumentException("Context " + context + " is not a UiContext");
                }
                z2 = baseContext instanceof Activity;
                if (z2 || (baseContext instanceof InputMethodService)) {
                    break;
                }
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() == null) {
                    break;
                }
                baseContext = contextWrapper.getBaseContext();
                i.d(baseContext, "iterator.baseContext");
            }
            if (z2) {
                lVar = o.a((Activity) context);
            } else {
                if (!(baseContext instanceof InputMethodService)) {
                    throw new IllegalArgumentException(context + " is not a UiContext");
                }
                Object systemService = context.getSystemService("window");
                i.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                i.d(defaultDisplay, "wm.defaultDisplay");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Rect rect = new Rect(0, 0, point.x, point.y);
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 30) {
                    f2 = new G();
                } else {
                    f2 = i5 >= 29 ? new F() : new E();
                }
                O oB = f2.b();
                i.d(oB, "Builder().build()");
                lVar = new l(rect, oB);
            }
        }
        return b(lVar, windowLayoutInfo);
    }
}
