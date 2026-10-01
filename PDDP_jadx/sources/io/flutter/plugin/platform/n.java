package io.flutter.plugin.platform;

import N.C0026b;
import N.Q;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import p011g0.AbstractActivityC0098e;

/* JADX INFO: loaded from: classes.dex */
public final class n implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2340a;

    public /* synthetic */ n(Object obj) {
        this.f2340a = obj;
    }

    @Override // io.flutter.plugin.platform.h
    public long a() {
        return ((TextureRegistry$SurfaceProducer) this.f2340a).id();
    }

    @Override // io.flutter.plugin.platform.h
    public void b(int i2, int i3) {
        ((TextureRegistry$SurfaceProducer) this.f2340a).setSize(i2, i3);
    }

    public void c(int i2) {
        View view;
        o oVar = (o) this.f2340a;
        if (oVar.m(i2)) {
            view = ((z) oVar.f2350i.get(Integer.valueOf(i2))).a();
        } else {
            g gVar = (g) oVar.f2352k.get(i2);
            if (gVar == null) {
                Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i2);
                return;
            }
            view = gVar.getView();
        }
        if (view != null) {
            view.clearFocus();
            return;
        }
        Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e0  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00e0, please report this as an issue */
    /* JADX WARN: Type inference failed for: r14v0, types: [io.flutter.plugin.platform.l] */
    public long d(final p028p0.h hVar) {
        h hVarI;
        int iL;
        int iL2;
        Activity activity;
        ?? r14;
        z zVar;
        int i2;
        VirtualDisplay virtualDisplayCreateVirtualDisplay;
        j jVar;
        long j2;
        final int i3 = 1;
        final o oVar = (o) this.f2340a;
        o.a(oVar, hVar);
        SparseArray sparseArray = oVar.f2355n;
        int i4 = hVar.f2915a;
        if (sparseArray.get(i4) != null) {
            throw new IllegalStateException("Trying to create an already created platform view, view id: " + i4);
        }
        if (oVar.f2346e == null) {
            throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i4);
        }
        if (oVar.f2345d == null) {
            throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i4);
        }
        g gVarB = oVar.b(hVar, true);
        View view = gVarB.getView();
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        int i5 = Build.VERSION.SDK_INT;
        double d2 = hVar.f2918d;
        double d3 = hVar.f2917c;
        if (i5 >= 23) {
            if (p000a.a.P(view, new p011g0.t(8, o.f2341w))) {
                if (hVar.f2922h == 2) {
                    o.d(19);
                    return -2L;
                }
                if (!oVar.f2361u) {
                    o.d(20);
                    hVarI = o.i(oVar.f2346e);
                    iL = oVar.l(d3);
                    iL2 = oVar.l(d2);
                    activity = oVar.f2344c;
                    r14 = new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.l
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view2, boolean z2) {
                            switch (i3) {
                                case 0:
                                    p028p0.h hVar2 = hVar;
                                    o oVar2 = oVar;
                                    int i6 = hVar2.f2915a;
                                    if (!z2) {
                                        io.flutter.plugin.editing.j jVar2 = oVar2.f2347f;
                                        if (jVar2 != null) {
                                            jVar2.b(i6);
                                        }
                                        break;
                                    } else {
                                        C0026b c0026b = (C0026b) oVar2.f2348g.f471f;
                                        if (c0026b != null) {
                                            c0026b.F("viewFocused", Integer.valueOf(i6), null);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    o oVar3 = oVar;
                                    if (!z2) {
                                        oVar3.getClass();
                                        break;
                                    } else {
                                        Q q2 = oVar3.f2348g;
                                        p028p0.h hVar3 = hVar;
                                        C0026b c0026b2 = (C0026b) q2.f471f;
                                        if (c0026b2 != null) {
                                            c0026b2.F("viewFocused", Integer.valueOf(hVar3.f2915a), null);
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                    };
                    w wVar = z.f2385i;
                    zVar = null;
                    if (iL != 0 && iL2 != 0) {
                        DisplayManager displayManager = (DisplayManager) activity.getSystemService("display");
                        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                        hVarI.b(iL, iL2);
                        StringBuilder sb = new StringBuilder("flutter-vd#");
                        i2 = hVar.f2915a;
                        sb.append(i2);
                        virtualDisplayCreateVirtualDisplay = displayManager.createVirtualDisplay(sb.toString(), iL, iL2, displayMetrics.densityDpi, hVarI.getSurface(), 0, z.f2385i, null);
                        if (virtualDisplayCreateVirtualDisplay != null) {
                            zVar = new z(activity, oVar.f2349h, virtualDisplayCreateVirtualDisplay, gVarB, hVarI, r14, i2);
                        }
                    }
                    if (zVar != null) {
                        oVar.f2350i.put(Integer.valueOf(i4), zVar);
                        View view2 = gVarB.getView();
                        oVar.f2351j.put(view2.getContext(), view2);
                        return hVarI.a();
                    }
                    throw new IllegalStateException("Failed creating virtual display for a " + hVar.f2916b + " with id: " + i4);
                }
            }
        } else {
            if (hVar.f2922h == 2) {
                o.d(19);
                return -2L;
            }
            if (!oVar.f2361u) {
                o.d(20);
                hVarI = o.i(oVar.f2346e);
                iL = oVar.l(d3);
                iL2 = oVar.l(d2);
                activity = oVar.f2344c;
                r14 = new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.l
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view3, boolean z2) {
                        switch (i3) {
                            case 0:
                                p028p0.h hVar2 = hVar;
                                o oVar2 = oVar;
                                int i6 = hVar2.f2915a;
                                if (!z2) {
                                    io.flutter.plugin.editing.j jVar2 = oVar2.f2347f;
                                    if (jVar2 != null) {
                                        jVar2.b(i6);
                                    }
                                    break;
                                } else {
                                    C0026b c0026b = (C0026b) oVar2.f2348g.f471f;
                                    if (c0026b != null) {
                                        c0026b.F("viewFocused", Integer.valueOf(i6), null);
                                        break;
                                    }
                                }
                                break;
                            default:
                                o oVar3 = oVar;
                                if (!z2) {
                                    oVar3.getClass();
                                    break;
                                } else {
                                    Q q2 = oVar3.f2348g;
                                    p028p0.h hVar3 = hVar;
                                    C0026b c0026b2 = (C0026b) q2.f471f;
                                    if (c0026b2 != null) {
                                        c0026b2.F("viewFocused", Integer.valueOf(hVar3.f2915a), null);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                };
                w wVar2 = z.f2385i;
                zVar = null;
                if (iL != 0) {
                    DisplayManager displayManager2 = (DisplayManager) activity.getSystemService("display");
                    DisplayMetrics displayMetrics2 = activity.getResources().getDisplayMetrics();
                    hVarI.b(iL, iL2);
                    StringBuilder sb2 = new StringBuilder("flutter-vd#");
                    i2 = hVar.f2915a;
                    sb2.append(i2);
                    virtualDisplayCreateVirtualDisplay = displayManager2.createVirtualDisplay(sb2.toString(), iL, iL2, displayMetrics2.densityDpi, hVarI.getSurface(), 0, z.f2385i, null);
                    if (virtualDisplayCreateVirtualDisplay != null) {
                        zVar = new z(activity, oVar.f2349h, virtualDisplayCreateVirtualDisplay, gVarB, hVarI, r14, i2);
                    }
                }
                if (zVar != null) {
                    oVar.f2350i.put(Integer.valueOf(i4), zVar);
                    View view3 = gVarB.getView();
                    oVar.f2351j.put(view3.getContext(), view3);
                    return hVarI.a();
                }
                throw new IllegalStateException("Failed creating virtual display for a " + hVar.f2916b + " with id: " + i4);
            }
        }
        o.d(23);
        int iL3 = oVar.l(d3);
        int iL4 = oVar.l(d2);
        if (oVar.f2361u) {
            jVar = new j(oVar.f2344c);
            j2 = -1;
        } else {
            h hVarI2 = o.i(oVar.f2346e);
            j jVar2 = new j(oVar.f2344c);
            jVar2.f2329j = hVarI2;
            Surface surface = hVarI2.getSurface();
            if (surface != null) {
                Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                } catch (Throwable th) {
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    throw th;
                }
            }
            long jA = hVarI2.a();
            jVar = jVar2;
            j2 = jA;
        }
        jVar.setTouchProcessor(oVar.f2343b);
        h hVar2 = jVar.f2329j;
        if (hVar2 != null) {
            hVar2.b(iL3, iL4);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iL3, iL4);
        int iL5 = oVar.l(hVar.f2919e);
        int iL6 = oVar.l(hVar.f2920f);
        layoutParams.topMargin = iL5;
        layoutParams.leftMargin = iL6;
        jVar.setLayoutParams(layoutParams);
        View view4 = gVarB.getView();
        view4.setLayoutParams(new FrameLayout.LayoutParams(iL3, iL4));
        view4.setImportantForAccessibility(4);
        jVar.addView(view4);
        final int i6 = 0;
        jVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.l
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view5, boolean z2) {
                switch (i6) {
                    case 0:
                        p028p0.h hVar3 = hVar;
                        o oVar2 = oVar;
                        int i7 = hVar3.f2915a;
                        if (!z2) {
                            io.flutter.plugin.editing.j jVar3 = oVar2.f2347f;
                            if (jVar3 != null) {
                                jVar3.b(i7);
                            }
                            break;
                        } else {
                            C0026b c0026b = (C0026b) oVar2.f2348g.f471f;
                            if (c0026b != null) {
                                c0026b.F("viewFocused", Integer.valueOf(i7), null);
                                break;
                            }
                        }
                        break;
                    default:
                        o oVar3 = oVar;
                        if (!z2) {
                            oVar3.getClass();
                            break;
                        } else {
                            Q q2 = oVar3.f2348g;
                            p028p0.h hVar4 = hVar;
                            C0026b c0026b2 = (C0026b) q2.f471f;
                            if (c0026b2 != null) {
                                c0026b2.F("viewFocused", Integer.valueOf(hVar4.f2915a), null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        oVar.f2345d.addView(jVar);
        sparseArray.append(i4, jVar);
        return j2;
    }

    public void e(int i2) {
        i iVar;
        i iVar2;
        o oVar = (o) this.f2340a;
        g gVar = (g) oVar.f2352k.get(i2);
        if (gVar == null) {
            Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i2);
            return;
        }
        if (gVar.getView() != null) {
            View view = gVar.getView();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        oVar.f2352k.remove(i2);
        if (oVar.m(i2)) {
            HashMap map = oVar.f2350i;
            z zVar = (z) map.get(Integer.valueOf(i2));
            View viewA = zVar.a();
            if (viewA != null) {
                oVar.f2351j.remove(viewA.getContext());
            }
            zVar.f2386a.cancel();
            zVar.f2386a.detachState();
            zVar.f2393h.release();
            zVar.f2391f.release();
            map.remove(Integer.valueOf(i2));
            return;
        }
        SparseArray sparseArray = oVar.f2355n;
        j jVar = (j) sparseArray.get(i2);
        if (jVar != null) {
            jVar.removeAllViews();
            h hVar = jVar.f2329j;
            if (hVar != null) {
                hVar.release();
                jVar.f2329j = null;
            }
            ViewTreeObserver viewTreeObserver = jVar.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (iVar2 = jVar.f2330k) != null) {
                jVar.f2330k = null;
                viewTreeObserver.removeOnGlobalFocusChangeListener(iVar2);
            }
            ViewGroup viewGroup2 = (ViewGroup) jVar.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(jVar);
            }
            sparseArray.remove(i2);
            return;
        }
        SparseArray sparseArray2 = oVar.f2353l;
        p021l0.a aVar = (p021l0.a) sparseArray2.get(i2);
        if (aVar != null) {
            aVar.removeAllViews();
            ViewTreeObserver viewTreeObserver2 = aVar.getViewTreeObserver();
            if (viewTreeObserver2.isAlive() && (iVar = aVar.f2829l) != null) {
                aVar.f2829l = null;
                viewTreeObserver2.removeOnGlobalFocusChangeListener(iVar);
            }
            ViewGroup viewGroup3 = (ViewGroup) aVar.getParent();
            if (viewGroup3 != null) {
                viewGroup3.removeView(aVar);
            }
            sparseArray2.remove(i2);
        }
    }

    public CharSequence f(p028p0.e eVar) {
        AbstractActivityC0098e abstractActivityC0098e = ((f) this.f2340a).f2316a;
        ClipboardManager clipboardManager = (ClipboardManager) abstractActivityC0098e.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (eVar != null && eVar != p028p0.e.f2902e) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text != null) {
                    return text;
                }
                try {
                    Uri uri = itemAt.getUri();
                    if (uri == null) {
                        Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                    } else {
                        String scheme = uri.getScheme();
                        if (scheme.equals("content")) {
                            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = abstractActivityC0098e.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence charSequenceCoerceToText = itemAt.coerceToText(abstractActivityC0098e);
                            if (assetFileDescriptorOpenTypedAssetFileDescriptor != null) {
                                try {
                                    assetFileDescriptorOpenTypedAssetFileDescriptor.close();
                                } catch (IOException e2) {
                                    charSequence = charSequenceCoerceToText;
                                    e = e2;
                                }
                            }
                            charSequence = charSequenceCoerceToText;
                        } else {
                            Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                        }
                    }
                    return charSequence;
                } catch (IOException e3) {
                    e = e3;
                    charSequence = text;
                }
            } catch (IOException e4) {
                e = e4;
            }
        } catch (FileNotFoundException unused) {
            Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (SecurityException e5) {
            Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e5);
            return null;
        }
        Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
        return charSequence;
    }

    public void g(int i2, double d2, double d3) {
        o oVar = (o) this.f2340a;
        if (oVar.m(i2)) {
            return;
        }
        j jVar = (j) oVar.f2355n.get(i2);
        if (jVar == null) {
            Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i2);
        } else {
            int iL = oVar.l(d2);
            int iL2 = oVar.l(d3);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
            layoutParams.topMargin = iL;
            layoutParams.leftMargin = iL2;
            jVar.setLayoutParams(layoutParams);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public int getHeight() {
        return ((TextureRegistry$SurfaceProducer) this.f2340a).getHeight();
    }

    @Override // io.flutter.plugin.platform.h
    public Surface getSurface() {
        return ((TextureRegistry$SurfaceProducer) this.f2340a).getSurface();
    }

    @Override // io.flutter.plugin.platform.h
    public int getWidth() {
        return ((TextureRegistry$SurfaceProducer) this.f2340a).getWidth();
    }

    public void h(p028p0.j jVar) {
        o oVar = (o) this.f2340a;
        float f2 = oVar.f2344c.getResources().getDisplayMetrics().density;
        int i2 = jVar.f2927a;
        if (oVar.m(i2)) {
            z zVar = (z) oVar.f2350i.get(Integer.valueOf(i2));
            MotionEvent motionEventK = oVar.k(f2, jVar, true);
            SingleViewPresentation singleViewPresentation = zVar.f2386a;
            if (singleViewPresentation == null) {
                return;
            }
            singleViewPresentation.dispatchTouchEvent(motionEventK);
            return;
        }
        g gVar = (g) oVar.f2352k.get(i2);
        if (gVar == null) {
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i2);
            return;
        }
        View view = gVar.getView();
        if (view != null) {
            view.dispatchTouchEvent(oVar.k(f2, jVar, false));
            return;
        }
        Log.e("PlatformViewsController", "Sending touch to a null view with id: " + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [io.flutter.plugin.platform.m, java.lang.Runnable] */
    public void i(p028p0.i iVar, final p011g0.t tVar) {
        h hVar;
        o oVar = (o) this.f2340a;
        int iL = oVar.l(iVar.f2925b);
        int iL2 = oVar.l(iVar.f2926c);
        int i2 = iVar.f2924a;
        if (!oVar.m(i2)) {
            g gVar = (g) oVar.f2352k.get(i2);
            j jVar = (j) oVar.f2355n.get(i2);
            if (gVar == null || jVar == null) {
                Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i2);
                return;
            }
            if ((iL > jVar.getRenderTargetWidth() || iL2 > jVar.getRenderTargetHeight()) && (hVar = jVar.f2329j) != null) {
                hVar.b(iL, iL2);
            }
            ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
            layoutParams.width = iL;
            layoutParams.height = iL2;
            jVar.setLayoutParams(layoutParams);
            View view = gVar.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = iL;
                layoutParams2.height = iL2;
                view.setLayoutParams(layoutParams2);
            }
            int iRound = (int) Math.round(((double) jVar.getRenderTargetWidth()) / ((double) oVar.f()));
            int iRound2 = (int) Math.round(((double) jVar.getRenderTargetHeight()) / ((double) oVar.f()));
            p028p0.k kVar = (p028p0.k) tVar.f1916f;
            HashMap map = new HashMap();
            map.put("width", Double.valueOf(iRound));
            map.put("height", Double.valueOf(iRound2));
            kVar.c(map);
            return;
        }
        final float f2 = oVar.f();
        final z zVar = (z) oVar.f2350i.get(Integer.valueOf(i2));
        io.flutter.plugin.editing.j jVar2 = oVar.f2347f;
        if (jVar2 != null) {
            if (jVar2.f2296e.f534b == 3) {
                jVar2.f2306o = true;
            }
            SingleViewPresentation singleViewPresentation = zVar.f2386a;
            if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
                zVar.f2386a.getView().getClass();
            }
        }
        ?? r3 = new Runnable() { // from class: io.flutter.plugin.platform.m
            @Override // java.lang.Runnable
            public final void run() {
                o oVar2 = (o) this.f2336e.f2340a;
                io.flutter.plugin.editing.j jVar3 = oVar2.f2347f;
                z zVar2 = zVar;
                if (jVar3 != null) {
                    if (jVar3.f2296e.f534b == 3) {
                        jVar3.f2306o = false;
                    }
                    SingleViewPresentation singleViewPresentation2 = zVar2.f2386a;
                    if (singleViewPresentation2 != null && singleViewPresentation2.getView() != null) {
                        zVar2.f2386a.getView().getClass();
                    }
                }
                double dF = oVar2.f2344c == null ? f2 : oVar2.f();
                int iRound3 = (int) Math.round(((double) zVar2.f2391f.getWidth()) / dF);
                int iRound4 = (int) Math.round(((double) zVar2.f2391f.getHeight()) / dF);
                p028p0.k kVar2 = (p028p0.k) tVar.f1916f;
                HashMap map2 = new HashMap();
                map2.put("width", Double.valueOf(iRound3));
                map2.put("height", Double.valueOf(iRound4));
                kVar2.c(map2);
            }
        };
        int width = zVar.f2391f.getWidth();
        h hVar2 = zVar.f2391f;
        if (iL == width && iL2 == hVar2.getHeight()) {
            zVar.a().postDelayed(r3, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            View viewA = zVar.a();
            hVar2.b(iL, iL2);
            zVar.f2393h.resize(iL, iL2, zVar.f2389d);
            zVar.f2393h.setSurface(hVar2.getSurface());
            viewA.postDelayed(r3, 0L);
            return;
        }
        boolean zIsFocused = zVar.a().isFocused();
        t tVarDetachState = zVar.f2386a.detachState();
        zVar.f2393h.setSurface(null);
        zVar.f2393h.release();
        DisplayManager displayManager = (DisplayManager) zVar.f2387b.getSystemService("display");
        hVar2.b(iL, iL2);
        zVar.f2393h = displayManager.createVirtualDisplay("flutter-vd#" + zVar.f2390e, iL, iL2, zVar.f2389d, hVar2.getSurface(), 0, z.f2385i, null);
        View viewA2 = zVar.a();
        viewA2.addOnAttachStateChangeListener(new p003b0.h(viewA2, (m) r3));
        SingleViewPresentation singleViewPresentation2 = new SingleViewPresentation(zVar.f2387b, zVar.f2393h.getDisplay(), zVar.f2388c, tVarDetachState, zVar.f2392g, zIsFocused);
        singleViewPresentation2.show();
        zVar.f2386a.cancel();
        zVar.f2386a = singleViewPresentation2;
    }

    public void j(int i2, int i3) {
        View view;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalStateException("Trying to set unknown direction value: " + i3 + "(view id: " + i2 + ")");
        }
        o oVar = (o) this.f2340a;
        if (oVar.m(i2)) {
            view = ((z) oVar.f2350i.get(Integer.valueOf(i2))).a();
        } else {
            g gVar = (g) oVar.f2352k.get(i2);
            if (gVar == null) {
                Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i2);
                return;
            }
            view = gVar.getView();
        }
        if (view != null) {
            view.setLayoutDirection(i3);
            return;
        }
        Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i2);
    }

    public void k(ArrayList arrayList) {
        f fVar = (f) this.f2340a;
        fVar.getClass();
        int i2 = arrayList.size() == 0 ? 5894 : 1798;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int iOrdinal = ((p028p0.g) arrayList.get(i3)).ordinal();
            if (iOrdinal == 0) {
                i2 &= -5;
            } else if (iOrdinal == 1) {
                i2 &= -515;
            }
        }
        fVar.f2320e = i2;
        fVar.b();
    }

    public void l(int i2) {
        View decorView = ((f) this.f2340a).f2316a.getWindow().getDecorView();
        int iB = I.j.b(i2);
        if (iB == 0) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (iB == 1) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (iB == 2) {
            decorView.performHapticFeedback(3);
            return;
        }
        if (iB != 3) {
            if (iB != 4) {
                return;
            }
            decorView.performHapticFeedback(4);
        } else if (Build.VERSION.SDK_INT >= 23) {
            decorView.performHapticFeedback(6);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public void release() {
        ((TextureRegistry$SurfaceProducer) this.f2340a).release();
        this.f2340a = null;
    }

    @Override // io.flutter.plugin.platform.h
    public void scheduleFrame() {
        ((TextureRegistry$SurfaceProducer) this.f2340a).scheduleFrame();
    }
}
