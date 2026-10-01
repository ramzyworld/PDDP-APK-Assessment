package io.flutter.view;

import android.app.Activity;
import android.opengl.Matrix;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p013h0.k, p013h0.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2394a;

    public /* synthetic */ b(Object obj) {
        this.f2394a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        io.flutter.plugin.platform.o oVar;
        ArrayList arrayList;
        int i2;
        h hVar;
        int i3;
        int i4;
        h hVar2;
        String str;
        String str2;
        float f2;
        float f3;
        View viewG;
        Integer num;
        boolean z2;
        WindowInsets rootWindowInsets;
        Activity activityT;
        int i5;
        k kVar;
        View viewG2;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        k kVar2 = (k) this.f2394a;
        kVar2.getClass();
        ArrayList<h> arrayList2 = new ArrayList();
        while (true) {
            boolean zHasRemaining = byteBuffer.hasRemaining();
            oVar = kVar2.f2484e;
            if (!zHasRemaining) {
                break;
            }
            h hVarC = kVar2.c(byteBuffer.getInt());
            hVarC.f2428B = true;
            hVarC.f2434H = hVarC.f2468r;
            hVarC.f2435I = hVarC.f2466p;
            hVarC.f2429C = hVarC.f2453c;
            hVarC.f2430D = hVarC.f2454d;
            hVarC.f2431E = hVarC.f2457g;
            hVarC.f2432F = hVarC.f2458h;
            hVarC.f2433G = hVarC.f2462l;
            hVarC.f2453c = byteBuffer.getInt();
            hVarC.f2454d = byteBuffer.getInt();
            hVarC.f2455e = byteBuffer.getInt();
            hVarC.f2456f = byteBuffer.getInt();
            hVarC.f2457g = byteBuffer.getInt();
            hVarC.f2458h = byteBuffer.getInt();
            hVarC.f2459i = byteBuffer.getInt();
            hVarC.f2460j = byteBuffer.getInt();
            hVarC.f2461k = byteBuffer.getInt();
            hVarC.f2462l = byteBuffer.getFloat();
            hVarC.f2463m = byteBuffer.getFloat();
            hVarC.f2464n = byteBuffer.getFloat();
            int i6 = byteBuffer.getInt();
            hVarC.f2465o = i6 == -1 ? null : strArr[i6];
            int i7 = byteBuffer.getInt();
            hVarC.f2466p = i7 == -1 ? null : strArr[i7];
            hVarC.f2467q = h.g(byteBuffer, byteBufferArr);
            int i8 = byteBuffer.getInt();
            hVarC.f2468r = i8 == -1 ? null : strArr[i8];
            hVarC.f2469s = h.g(byteBuffer, byteBufferArr);
            int i9 = byteBuffer.getInt();
            hVarC.t = i9 == -1 ? null : strArr[i9];
            hVarC.f2470u = h.g(byteBuffer, byteBufferArr);
            int i10 = byteBuffer.getInt();
            hVarC.f2471v = i10 == -1 ? null : strArr[i10];
            hVarC.f2472w = h.g(byteBuffer, byteBufferArr);
            int i11 = byteBuffer.getInt();
            hVarC.f2473x = i11 == -1 ? null : strArr[i11];
            hVarC.f2474y = h.g(byteBuffer, byteBufferArr);
            int i12 = byteBuffer.getInt();
            hVarC.f2475z = i12 == -1 ? null : strArr[i12];
            byteBuffer.getInt();
            hVarC.f2436J = byteBuffer.getFloat();
            hVarC.f2437K = byteBuffer.getFloat();
            hVarC.f2438L = byteBuffer.getFloat();
            hVarC.f2439M = byteBuffer.getFloat();
            if (hVarC.f2440N == null) {
                hVarC.f2440N = new float[16];
            }
            for (int i13 = 0; i13 < 16; i13++) {
                hVarC.f2440N[i13] = byteBuffer.getFloat();
            }
            hVarC.f2447U = true;
            hVarC.f2449W = true;
            int i14 = byteBuffer.getInt();
            ArrayList arrayList3 = hVarC.f2442P;
            arrayList3.clear();
            ArrayList arrayList4 = hVarC.f2443Q;
            arrayList4.clear();
            int i15 = 0;
            while (true) {
                kVar = hVarC.f2451a;
                if (i15 >= i14) {
                    break;
                }
                h hVarC2 = kVar.c(byteBuffer.getInt());
                hVarC2.f2441O = hVarC;
                arrayList3.add(hVarC2);
                i15++;
            }
            for (int i16 = 0; i16 < i14; i16++) {
                h hVarC3 = kVar.c(byteBuffer.getInt());
                hVarC3.f2441O = hVarC;
                arrayList4.add(hVarC3);
            }
            int i17 = byteBuffer.getInt();
            if (i17 == 0) {
                hVarC.f2444R = null;
            } else {
                ArrayList arrayList5 = hVarC.f2444R;
                if (arrayList5 == null) {
                    hVarC.f2444R = new ArrayList(i17);
                } else {
                    arrayList5.clear();
                }
                for (int i18 = 0; i18 < i17; i18++) {
                    f fVarB = kVar.b(byteBuffer.getInt());
                    int i19 = fVarB.f2423c;
                    if (i19 == 1) {
                        hVarC.f2445S = fVarB;
                    } else if (i19 == 2) {
                        hVarC.f2446T = fVarB;
                    } else {
                        hVarC.f2444R.add(fVarB);
                    }
                    hVarC.f2444R.add(fVarB);
                }
            }
            if (!hVarC.h(14)) {
                if (hVarC.h(6)) {
                    kVar2.f2492m = hVarC;
                }
                if (hVarC.f2428B) {
                    arrayList2.add(hVarC);
                }
                int i20 = hVarC.f2459i;
                if (i20 != -1 && !oVar.m(i20) && (viewG2 = oVar.g(hVarC.f2459i)) != null) {
                    viewG2.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        HashMap map = kVar2.f2486g;
        h hVar3 = (h) map.get(0);
        ArrayList arrayList6 = new ArrayList();
        View view = kVar2.f2480a;
        if (hVar3 != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            int i21 = Build.VERSION.SDK_INT;
            if (i21 < 23 || ((i21 >= 28 && ((activityT = p000a.a.t(view.getContext())) == null || activityT.getWindow() == null || !((i5 = activityT.getWindow().getAttributes().layoutInDisplayCutoutMode) == 2 || i5 == 0))) || (rootWindowInsets = view.getRootWindowInsets()) == null)) {
                z2 = false;
            } else {
                if (!kVar2.f2497r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                    hVar3.f2449W = true;
                    hVar3.f2447U = true;
                }
                int systemWindowInsetLeft = rootWindowInsets.getSystemWindowInsetLeft();
                kVar2.f2497r = Integer.valueOf(systemWindowInsetLeft);
                z2 = false;
                Matrix.translateM(fArr, 0, systemWindowInsetLeft, 0.0f, 0.0f);
            }
            hVar3.l(fArr, hashSet, z2);
            hVar3.d(arrayList6);
        }
        Iterator it = arrayList6.iterator();
        h hVar4 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = kVar2.f2495p;
            if (!zHasNext) {
                break;
            }
            h hVar5 = (h) it.next();
            if (!arrayList.contains(Integer.valueOf(hVar5.f2452b))) {
                hVar4 = hVar5;
            }
        }
        if (hVar4 == null && arrayList6.size() > 0) {
            hVar4 = (h) arrayList6.get(arrayList6.size() - 1);
        }
        if (hVar4 != null && (hVar4.f2452b != kVar2.f2496q || arrayList6.size() != arrayList.size())) {
            kVar2.f2496q = hVar4.f2452b;
            String strF = hVar4.f();
            if (strF == null) {
                strF = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                view.setAccessibilityPaneTitle(strF);
            } else {
                AccessibilityEvent accessibilityEventD = kVar2.d(hVar4.f2452b, 32);
                accessibilityEventD.getText().add(strF);
                kVar2.h(accessibilityEventD);
            }
        }
        arrayList.clear();
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((h) it2.next()).f2452b));
        }
        Iterator it3 = map.entrySet().iterator();
        while (true) {
            i2 = 4;
            if (!it3.hasNext()) {
                break;
            }
            h hVar6 = (h) ((Map.Entry) it3.next()).getValue();
            if (!hashSet.contains(hVar6)) {
                hVar6.f2441O = null;
                if (hVar6.f2459i != -1 && (num = kVar2.f2489j) != null && kVar2.f2483d.platformViewOfNode(num.intValue()) == oVar.g(hVar6.f2459i)) {
                    kVar2.g(kVar2.f2489j.intValue(), 65536);
                    kVar2.f2489j = null;
                }
                int i22 = hVar6.f2459i;
                if (i22 != -1 && (viewG = oVar.g(i22)) != null) {
                    viewG.setImportantForAccessibility(4);
                }
                h hVar7 = kVar2.f2488i;
                if (hVar7 == hVar6) {
                    kVar2.g(hVar7.f2452b, 65536);
                    kVar2.f2488i = null;
                }
                if (kVar2.f2492m == hVar6) {
                    kVar2.f2492m = null;
                }
                if (kVar2.f2494o == hVar6) {
                    kVar2.f2494o = null;
                }
                it3.remove();
            }
        }
        int i23 = 2048;
        AccessibilityEvent accessibilityEventD2 = kVar2.d(0, 2048);
        accessibilityEventD2.setContentChangeTypes(1);
        kVar2.h(accessibilityEventD2);
        for (h hVar8 : arrayList2) {
            if (!Float.isNaN(hVar8.f2462l) && !Float.isNaN(hVar8.f2433G) && hVar8.f2433G != hVar8.f2462l) {
                AccessibilityEvent accessibilityEventD3 = kVar2.d(hVar8.f2452b, 4096);
                float f4 = hVar8.f2462l;
                float f5 = hVar8.f2463m;
                if (Float.isInfinite(f5)) {
                    if (f4 > 70000.0f) {
                        f4 = 70000.0f;
                    }
                    f5 = 100000.0f;
                }
                if (Float.isInfinite(hVar8.f2464n)) {
                    f2 = f5 + 100000.0f;
                    if (f4 < -70000.0f) {
                        f4 = -70000.0f;
                    }
                    f3 = f4 + 100000.0f;
                } else {
                    float f6 = hVar8.f2464n;
                    f2 = f5 - f6;
                    f3 = f4 - f6;
                }
                if (h.c(hVar8, e.f2404j) || h.c(hVar8, e.f2405k)) {
                    accessibilityEventD3.setScrollY((int) f3);
                    accessibilityEventD3.setMaxScrollY((int) f2);
                } else if (h.c(hVar8, e.f2402h) || h.c(hVar8, e.f2403i)) {
                    accessibilityEventD3.setScrollX((int) f3);
                    accessibilityEventD3.setMaxScrollX((int) f2);
                }
                int i24 = hVar8.f2460j;
                if (i24 > 0) {
                    accessibilityEventD3.setItemCount(i24);
                    accessibilityEventD3.setFromIndex(hVar8.f2461k);
                    Iterator it4 = hVar8.f2443Q.iterator();
                    int i25 = 0;
                    while (it4.hasNext()) {
                        if (!((h) it4.next()).h(14)) {
                            i25++;
                        }
                    }
                    accessibilityEventD3.setToIndex((hVar8.f2461k + i25) - 1);
                }
                kVar2.h(accessibilityEventD3);
            }
            if (hVar8.h(16) && (((str = hVar8.f2466p) != null || hVar8.f2435I != null) && (str == null || (str2 = hVar8.f2435I) == null || !str.equals(str2)))) {
                AccessibilityEvent accessibilityEventD4 = kVar2.d(hVar8.f2452b, i23);
                accessibilityEventD4.setContentChangeTypes(1);
                kVar2.h(accessibilityEventD4);
            }
            h hVar9 = kVar2.f2488i;
            if (hVar9 != null && hVar9.f2452b == hVar8.f2452b && (hVar8.f2429C & I0.h.d(3)) == 0 && hVar8.h(3)) {
                AccessibilityEvent accessibilityEventD5 = kVar2.d(hVar8.f2452b, i2);
                accessibilityEventD5.getText().add(hVar8.f2466p);
                kVar2.h(accessibilityEventD5);
            }
            h hVar10 = kVar2.f2492m;
            if (hVar10 != null && (i3 = hVar10.f2452b) == (i4 = hVar8.f2452b) && ((hVar2 = kVar2.f2493n) == null || hVar2.f2452b != i3)) {
                kVar2.f2493n = hVar10;
                kVar2.h(kVar2.d(i4, 8));
            } else if (hVar10 == null) {
                kVar2.f2493n = null;
            }
            h hVar11 = kVar2.f2492m;
            if (hVar11 != null && hVar11.f2452b == hVar8.f2452b && (hVar8.f2429C & I0.h.d(5)) != 0 && hVar8.h(5) && ((hVar = kVar2.f2488i) == null || hVar.f2452b == kVar2.f2492m.f2452b)) {
                String str3 = hVar8.f2434H;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = hVar8.f2468r;
                String str5 = str4 != null ? str4 : "";
                AccessibilityEvent accessibilityEventD6 = kVar2.d(hVar8.f2452b, 16);
                accessibilityEventD6.setBeforeText(str3);
                accessibilityEventD6.getText().add(str5);
                int i26 = 0;
                while (i26 < str3.length() && i26 < str5.length() && str3.charAt(i26) == str5.charAt(i26)) {
                    i26++;
                }
                if (i26 < str3.length() || i26 < str5.length()) {
                    accessibilityEventD6.setFromIndex(i26);
                    int length = str3.length() - 1;
                    int length2 = str5.length() - 1;
                    while (length >= i26 && length2 >= i26 && str3.charAt(length) == str5.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    accessibilityEventD6.setRemovedCount((length - i26) + 1);
                    accessibilityEventD6.setAddedCount((length2 - i26) + 1);
                } else {
                    accessibilityEventD6 = null;
                }
                if (accessibilityEventD6 != null) {
                    kVar2.h(accessibilityEventD6);
                }
                if (hVar8.f2431E != hVar8.f2457g || hVar8.f2432F != hVar8.f2458h) {
                    AccessibilityEvent accessibilityEventD7 = kVar2.d(hVar8.f2452b, 8192);
                    accessibilityEventD7.getText().add(str5);
                    accessibilityEventD7.setFromIndex(hVar8.f2457g);
                    accessibilityEventD7.setToIndex(hVar8.f2458h);
                    accessibilityEventD7.setItemCount(str5.length());
                    kVar2.h(accessibilityEventD7);
                }
            }
            i23 = 2048;
            i2 = 4;
        }
    }
}
