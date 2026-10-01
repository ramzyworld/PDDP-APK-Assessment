package io.flutter.plugin.platform;

import N.D;
import N.Q;
import android.app.Activity;
import android.content.MutableContextWrapper;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import p011g0.C0094a;
import p011g0.C0102i;
import p011g0.I;
import p039v0.C0160s;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Class[] f2341w = {SurfaceView.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f2342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0094a f2343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f2344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p011g0.q f2345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f2346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public io.flutter.plugin.editing.j f2347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Q f2348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0103a f2349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f2350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f2351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SparseArray f2352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SparseArray f2353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SparseArray f2354m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SparseArray f2355n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashSet f2359r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashSet f2360s;
    public final Q t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2356o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2357p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2358q = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2361u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final n f2362v = new n(this);

    public o() {
        n nVar = new n();
        nVar.f2340a = new HashMap();
        this.f2342a = nVar;
        this.f2350i = new HashMap();
        this.f2349h = new C0103a();
        this.f2351j = new HashMap();
        this.f2354m = new SparseArray();
        this.f2359r = new HashSet();
        this.f2360s = new HashSet();
        this.f2355n = new SparseArray();
        this.f2352k = new SparseArray();
        this.f2353l = new SparseArray();
        if (Q.f468h == null) {
            Q.f468h = new Q(9);
        }
        this.t = Q.f468h;
    }

    public static void a(o oVar, p028p0.h hVar) {
        oVar.getClass();
        int i2 = hVar.f2921g;
        if (i2 == 0 || i2 == 1) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i2 + "(view id: " + hVar.f2915a + ")");
    }

    public static void d(int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= i2) {
            return;
        }
        throw new IllegalStateException("Trying to use platform views with API " + i3 + ", required API level is: " + i2);
    }

    public static h i(io.flutter.embedding.engine.renderer.l lVar) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29) {
            return i2 >= 29 ? new D(lVar.b()) : new v(lVar.d());
        }
        TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducerC = lVar.c();
        n nVar = new n();
        nVar.f2340a = textureRegistry$SurfaceProducerC;
        return nVar;
    }

    public final g b(p028p0.h hVar, boolean z2) {
        g rVar;
        HashMap map = (HashMap) this.f2342a.f2340a;
        String str = hVar.f2916b;
        C0160s c0160s = (C0160s) map.get(str);
        if (c0160s == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        ByteBuffer byteBuffer = hVar.f2923i;
        Object objA = byteBuffer != null ? c0160s.f3393a.a(byteBuffer) : null;
        if (z2) {
            new MutableContextWrapper(this.f2344c);
        }
        Integer num = (Integer) objA;
        if (num == null) {
            throw new IllegalStateException("An identifier is required to retrieve a View instance.");
        }
        Object objE = c0160s.f3394b.e(num.intValue());
        if (objE instanceof g) {
            rVar = (g) objE;
        } else {
            if (!(objE instanceof View)) {
                throw new IllegalStateException("Unable to find a PlatformView or View instance: " + objA + ", " + objE);
            }
            rVar = new p039v0.r((View) objE);
        }
        View view = rVar.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(hVar.f2921g);
        this.f2352k.put(hVar.f2915a, rVar);
        return rVar;
    }

    public final void c() {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f2354m;
            if (i2 >= sparseArray.size()) {
                return;
            }
            c cVar = (c) sparseArray.valueAt(i2);
            cVar.c();
            cVar.f1873e.close();
            i2++;
        }
    }

    public final void e(boolean z2) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f2354m;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i2);
            c cVar = (c) sparseArray.valueAt(i2);
            if (this.f2359r.contains(Integer.valueOf(iKeyAt))) {
                p013h0.c cVar2 = this.f2345d.f1901l;
                if (cVar2 != null) {
                    cVar.a(cVar2.f1979b);
                }
                z2 &= cVar.e();
            } else {
                if (!this.f2357p) {
                    cVar.c();
                }
                cVar.setVisibility(8);
                this.f2345d.removeView(cVar);
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f2353l;
            if (i3 >= sparseArray2.size()) {
                return;
            }
            int iKeyAt2 = sparseArray2.keyAt(i3);
            View view = (View) sparseArray2.get(iKeyAt2);
            if (!this.f2360s.contains(Integer.valueOf(iKeyAt2)) || (!z2 && this.f2358q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i3++;
        }
    }

    public final float f() {
        return this.f2344c.getResources().getDisplayMetrics().density;
    }

    public final View g(int i2) {
        if (m(i2)) {
            return ((z) this.f2350i.get(Integer.valueOf(i2))).a();
        }
        g gVar = (g) this.f2352k.get(i2);
        if (gVar == null) {
            return null;
        }
        return gVar.getView();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final void h() {
        if (!this.f2358q || this.f2357p) {
            return;
        }
        p011g0.q qVar = this.f2345d;
        qVar.f1897h.b();
        C0102i c0102i = qVar.f1896g;
        if (c0102i == null) {
            C0102i c0102i2 = new C0102i(qVar.getContext(), qVar.getWidth(), qVar.getHeight(), 1);
            qVar.f1896g = c0102i2;
            qVar.addView(c0102i2);
        } else {
            c0102i.g(qVar.getWidth(), qVar.getHeight());
        }
        qVar.f1898i = qVar.f1897h;
        C0102i c0102i3 = qVar.f1896g;
        qVar.f1897h = c0102i3;
        p013h0.c cVar = qVar.f1901l;
        if (cVar != null) {
            c0102i3.a(cVar.f1979b);
        }
        this.f2357p = true;
    }

    public final void j() {
        for (z zVar : this.f2350i.values()) {
            int width = zVar.f2391f.getWidth();
            h hVar = zVar.f2391f;
            int height = hVar.getHeight();
            boolean zIsFocused = zVar.a().isFocused();
            t tVarDetachState = zVar.f2386a.detachState();
            zVar.f2393h.setSurface(null);
            zVar.f2393h.release();
            zVar.f2393h = ((DisplayManager) zVar.f2387b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + zVar.f2390e, width, height, zVar.f2389d, hVar.getSurface(), 0, z.f2385i, null);
            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(zVar.f2387b, zVar.f2393h.getDisplay(), zVar.f2388c, tVarDetachState, zVar.f2392g, zIsFocused);
            singleViewPresentation.show();
            zVar.f2386a.cancel();
            zVar.f2386a = singleViewPresentation;
        }
    }

    public final MotionEvent k(float f2, p028p0.j jVar, boolean z2) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j2;
        I i2 = new I(jVar.f2942p);
        while (true) {
            Q q2 = this.t;
            priorityQueue = (PriorityQueue) q2.f472g;
            boolean zIsEmpty = priorityQueue.isEmpty();
            longSparseArray = (LongSparseArray) q2.f471f;
            j2 = i2.f1844a;
            if (zIsEmpty || ((Long) priorityQueue.peek()).longValue() >= j2) {
                break;
            }
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j2) {
            priorityQueue.poll();
        }
        MotionEvent motionEvent = (MotionEvent) longSparseArray.get(j2);
        longSparseArray.remove(j2);
        List<List> list = (List) jVar.f2933g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d2 = f2;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d2);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d2);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d2);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d2);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d2);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d2);
            arrayList.add(pointerCoords);
        }
        int i3 = jVar.f2931e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i3]);
        if (!z2 && motionEvent != null) {
            if (pointerCoordsArr.length >= 1) {
                motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
            }
            return motionEvent;
        }
        List<List> list3 = (List) jVar.f2932f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        return MotionEvent.obtain(jVar.f2928b.longValue(), jVar.f2929c.longValue(), jVar.f2930d, jVar.f2931e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i3]), pointerCoordsArr, jVar.f2934h, jVar.f2935i, jVar.f2936j, jVar.f2937k, jVar.f2938l, jVar.f2939m, jVar.f2940n, jVar.f2941o);
    }

    public final int l(double d2) {
        return (int) Math.round(d2 * ((double) f()));
    }

    public final boolean m(int i2) {
        return this.f2350i.containsKey(Integer.valueOf(i2));
    }
}
