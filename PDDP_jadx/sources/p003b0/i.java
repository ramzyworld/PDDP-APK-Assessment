package p003b0;

import D.j;
import I0.i;
import N.C0026b;
import Y.k;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import p003b0.f;
import p003b0.g;
import p043y0.l;
import x.a;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SidecarInterface f1725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f1726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0026b f1729e;

    public i(Context context) {
        I0.i.e(context, "context");
        SidecarInterface sidecarInterfaceB = g.b(context);
        f fVar = new f();
        this.f1725a = sidecarInterfaceB;
        this.f1726b = fVar;
        this.f1727c = new LinkedHashMap();
        this.f1728d = new LinkedHashMap();
    }

    public final SidecarInterface d() {
        return this.f1725a;
    }

    public final k e(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        IBinder iBinderA = g.a(activity);
        if (iBinderA == null) {
            return new k(l.f3483e);
        }
        SidecarInterface sidecarInterface = this.f1725a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinderA) : null;
        SidecarInterface sidecarInterface2 = this.f1725a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f1726b.e(windowLayoutInfo, sidecarDeviceState);
    }

    public final void f(Activity activity) {
        SidecarInterface sidecarInterface;
        IBinder iBinderA = g.a(activity);
        if (iBinderA == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f1725a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderA);
        }
        LinkedHashMap linkedHashMap = this.f1728d;
        if (((a) linkedHashMap.get(activity)) != null) {
            linkedHashMap.remove(activity);
        }
        C0026b c0026b = this.f1729e;
        if (c0026b != null) {
            c0026b.s(activity);
        }
        LinkedHashMap linkedHashMap2 = this.f1727c;
        boolean z2 = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinderA);
        if (!z2 || (sidecarInterface = this.f1725a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final void g(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f1727c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f1725a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f1725a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        C0026b c0026b = this.f1729e;
        if (c0026b != null) {
            c0026b.K(activity, e(activity));
        }
        this.f1728d.get(activity);
    }

    public final void h(j jVar) {
        this.f1729e = new C0026b(jVar, (byte) 0);
        SidecarInterface sidecarInterface = this.f1725a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f1726b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                    SidecarInterface sidecarInterfaceD;
                    i.e(sidecarDeviceState, "newDeviceState");
                    Collection<Activity> collectionValues = this.f1716a.f1727c.values();
                    p003b0.i iVar = this.f1716a;
                    for (Activity activity : collectionValues) {
                        IBinder iBinderA = g.a(activity);
                        SidecarWindowLayoutInfo windowLayoutInfo = null;
                        if (iBinderA != null && (sidecarInterfaceD = iVar.d()) != null) {
                            windowLayoutInfo = sidecarInterfaceD.getWindowLayoutInfo(iBinderA);
                        }
                        C0026b c0026b = iVar.f1729e;
                        if (c0026b != null) {
                            c0026b.K(activity, iVar.f1726b.e(windowLayoutInfo, sidecarDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                    SidecarDeviceState sidecarDeviceState;
                    i.e(iBinder, "windowToken");
                    i.e(sidecarWindowLayoutInfo, "newLayout");
                    Activity activity = (Activity) this.f1716a.f1727c.get(iBinder);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    f fVar = this.f1716a.f1726b;
                    SidecarInterface sidecarInterfaceD = this.f1716a.d();
                    if (sidecarInterfaceD == null || (sidecarDeviceState = sidecarInterfaceD.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    k kVarE = fVar.e(sidecarWindowLayoutInfo, sidecarDeviceState);
                    C0026b c0026b = this.f1716a.f1729e;
                    if (c0026b != null) {
                        c0026b.K(activity, kVarE);
                    }
                }
            }));
        }
    }

    public final boolean i() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f1725a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!I0.i.a(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f1725a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f1725a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f1725a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!I0.i.a(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f1725a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!I0.i.a(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f1725a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!I0.i.a(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                I0.i.c(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            I0.i.d(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                I0.i.c(objInvoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (!I0.i.a(arrayList, (List) objInvoke2)) {
                    throw new Exception("Invalid display feature getter/setter");
                }
            }
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }
}
