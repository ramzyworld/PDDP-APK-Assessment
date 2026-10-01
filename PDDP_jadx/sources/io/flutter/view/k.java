package io.flutter.view;

import G.C0013n;
import N.C0026b;
import android.R;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2479z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f2480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0026b f2481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f2482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f2483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.o f2484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ContentResolver f2485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f2486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f2487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f2488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f2489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f2490k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2491l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f2492m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f2493n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h f2494o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f2495p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2496q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Integer f2497r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public D.j f2498s;
    public boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2499u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f2500v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f2501w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d f2502x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final E.a f2503y;

    public k(View view, C0026b c0026b, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.o oVar) {
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.f2486g = new HashMap();
        this.f2487h = new HashMap();
        this.f2491l = 0;
        this.f2495p = new ArrayList();
        this.f2496q = 0;
        this.f2497r = 0;
        this.t = false;
        this.f2499u = false;
        this.f2500v = new b(this);
        c cVar = new c(this);
        this.f2501w = cVar;
        E.a aVar = new E.a(this, new Handler(), 2);
        this.f2503y = aVar;
        this.f2480a = view;
        this.f2481b = c0026b;
        this.f2482c = accessibilityManager;
        this.f2485f = contentResolver;
        this.f2483d = accessibilityViewEmbedder;
        this.f2484e = oVar;
        cVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(cVar);
        d dVar = new d(this, accessibilityManager);
        this.f2502x = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        aVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, aVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            int i2 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 == Integer.MAX_VALUE || i2 < 300) {
                this.f2491l &= -9;
            } else {
                this.f2491l |= 8;
            }
            ((FlutterJNI) c0026b.f476f).setAccessibilityFeatures(this.f2491l);
        }
        oVar.f2349h.f2309a = this;
    }

    public final boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f2483d;
        if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f2490k = recordFlutterId;
            this.f2492m = null;
            return true;
        }
        if (eventType == 128) {
            this.f2494o = null;
            return true;
        }
        if (eventType == 32768) {
            this.f2489j = recordFlutterId;
            this.f2488i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f2490k = null;
        this.f2489j = null;
        return true;
    }

    public final f b(int i2) {
        HashMap map = this.f2487h;
        f fVar = (f) map.get(Integer.valueOf(i2));
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f();
        fVar2.f2423c = -1;
        fVar2.f2422b = i2;
        fVar2.f2421a = 267386881 + i2;
        map.put(Integer.valueOf(i2), fVar2);
        return fVar2;
    }

    public final h c(int i2) {
        HashMap map = this.f2486g;
        h hVar = (h) map.get(Integer.valueOf(i2));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        hVar2.f2452b = i2;
        map.put(Integer.valueOf(i2), hVar2);
        return hVar2;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        String str;
        int i3;
        int i4;
        int i5;
        i(true);
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f2483d;
        if (i2 >= 65536) {
            return accessibilityViewEmbedder.createAccessibilityNodeInfo(i2);
        }
        HashMap map = this.f2486g;
        View view = this.f2480a;
        if (i2 == -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
            if (map.containsKey(0)) {
                accessibilityNodeInfoObtain.addChild(view, 0);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                accessibilityNodeInfoObtain.setImportantForAccessibility(false);
            }
            return accessibilityNodeInfoObtain;
        }
        h hVar = (h) map.get(Integer.valueOf(i2));
        if (hVar == null) {
            return null;
        }
        int i6 = hVar.f2459i;
        io.flutter.plugin.platform.o oVar = this.f2484e;
        if (i6 != -1 && oVar.m(i6)) {
            View viewG = oVar.g(hVar.f2459i);
            if (viewG == null) {
                return null;
            }
            return accessibilityViewEmbedder.getRootNode(viewG, hVar.f2452b, hVar.f2450Y);
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(view, i2);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 24) {
            accessibilityNodeInfoObtain2.setImportantForAccessibility((hVar.h(12) || (h.b(hVar) == null && hVar.f2454d == 0)) ? false : true);
        }
        accessibilityNodeInfoObtain2.setViewIdResourceName("");
        String str2 = hVar.f2465o;
        if (str2 != null) {
            accessibilityNodeInfoObtain2.setViewIdResourceName(str2);
        }
        accessibilityNodeInfoObtain2.setPackageName(view.getContext().getPackageName());
        accessibilityNodeInfoObtain2.setClassName("android.view.View");
        accessibilityNodeInfoObtain2.setSource(view, i2);
        accessibilityNodeInfoObtain2.setFocusable(hVar.j());
        h hVar2 = this.f2492m;
        if (hVar2 != null) {
            accessibilityNodeInfoObtain2.setFocused(hVar2.f2452b == i2);
        }
        h hVar3 = this.f2488i;
        if (hVar3 != null) {
            accessibilityNodeInfoObtain2.setAccessibilityFocused(hVar3.f2452b == i2);
        }
        if (hVar.h(5)) {
            accessibilityNodeInfoObtain2.setPassword(hVar.h(11));
            if (!hVar.h(21)) {
                accessibilityNodeInfoObtain2.setClassName("android.widget.EditText");
            }
            accessibilityNodeInfoObtain2.setEditable(!hVar.h(21));
            int i8 = hVar.f2457g;
            if (i8 != -1 && (i5 = hVar.f2458h) != -1) {
                accessibilityNodeInfoObtain2.setTextSelection(i8, i5);
            }
            h hVar4 = this.f2488i;
            if (hVar4 != null && hVar4.f2452b == i2) {
                accessibilityNodeInfoObtain2.setLiveRegion(1);
            }
            if (h.a(hVar, e.f2409o)) {
                accessibilityNodeInfoObtain2.addAction(256);
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (h.a(hVar, e.f2410p)) {
                accessibilityNodeInfoObtain2.addAction(512);
                i4 = 1;
            }
            if (h.a(hVar, e.f2418y)) {
                accessibilityNodeInfoObtain2.addAction(256);
                i4 |= 2;
            }
            if (h.a(hVar, e.f2419z)) {
                accessibilityNodeInfoObtain2.addAction(512);
                i4 |= 2;
            }
            accessibilityNodeInfoObtain2.setMovementGranularities(i4);
            if (hVar.f2455e >= 0) {
                String str3 = hVar.f2468r;
                accessibilityNodeInfoObtain2.setMaxTextLength(((str3 == null ? 0 : str3.length()) - hVar.f2456f) + hVar.f2455e);
            }
        }
        if (h.a(hVar, e.f2411q)) {
            accessibilityNodeInfoObtain2.addAction(131072);
        }
        if (h.a(hVar, e.f2412r)) {
            accessibilityNodeInfoObtain2.addAction(16384);
        }
        if (h.a(hVar, e.f2413s)) {
            accessibilityNodeInfoObtain2.addAction(65536);
        }
        if (h.a(hVar, e.t)) {
            accessibilityNodeInfoObtain2.addAction(32768);
        }
        if (h.a(hVar, e.f2398A)) {
            accessibilityNodeInfoObtain2.addAction(2097152);
        }
        if (hVar.h(4) || hVar.h(23)) {
            accessibilityNodeInfoObtain2.setClassName("android.widget.Button");
        }
        if (hVar.h(15)) {
            accessibilityNodeInfoObtain2.setClassName("android.widget.ImageView");
        }
        if (h.a(hVar, e.f2417x)) {
            accessibilityNodeInfoObtain2.setDismissable(true);
            accessibilityNodeInfoObtain2.addAction(1048576);
        }
        h hVar5 = hVar.f2441O;
        if (hVar5 != null) {
            accessibilityNodeInfoObtain2.setParent(view, hVar5.f2452b);
        } else {
            accessibilityNodeInfoObtain2.setParent(view);
        }
        int i9 = hVar.f2427A;
        if (i9 != -1 && i7 >= 22) {
            accessibilityNodeInfoObtain2.setTraversalAfter(view, i9);
        }
        Rect rect = hVar.f2450Y;
        h hVar6 = hVar.f2441O;
        if (hVar6 != null) {
            Rect rect2 = hVar6.f2450Y;
            Rect rect3 = new Rect(rect);
            rect3.offset(-rect2.left, -rect2.top);
            accessibilityNodeInfoObtain2.setBoundsInParent(rect3);
        } else {
            accessibilityNodeInfoObtain2.setBoundsInParent(rect);
        }
        Rect rect4 = new Rect(rect);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect4.offset(iArr[0], iArr[1]);
        accessibilityNodeInfoObtain2.setBoundsInScreen(rect4);
        accessibilityNodeInfoObtain2.setVisibleToUser(true);
        accessibilityNodeInfoObtain2.setEnabled(!hVar.h(7) || hVar.h(8));
        if (h.a(hVar, e.f2400f)) {
            if (hVar.f2445S != null) {
                accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, hVar.f2445S.f2425e));
                accessibilityNodeInfoObtain2.setClickable(true);
            } else {
                accessibilityNodeInfoObtain2.addAction(16);
                accessibilityNodeInfoObtain2.setClickable(true);
            }
        } else if (hVar.h(24)) {
            accessibilityNodeInfoObtain2.addAction(16);
            accessibilityNodeInfoObtain2.setClickable(true);
        }
        if (h.a(hVar, e.f2401g)) {
            if (hVar.f2446T != null) {
                accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, hVar.f2446T.f2425e));
                accessibilityNodeInfoObtain2.setLongClickable(true);
            } else {
                accessibilityNodeInfoObtain2.addAction(32);
                accessibilityNodeInfoObtain2.setLongClickable(true);
            }
        }
        e eVar = e.f2402h;
        boolean zA = h.a(hVar, eVar);
        e eVar2 = e.f2405k;
        e eVar3 = e.f2404j;
        e eVar4 = e.f2403i;
        if (zA || h.a(hVar, eVar3) || h.a(hVar, eVar4) || h.a(hVar, eVar2)) {
            accessibilityNodeInfoObtain2.setScrollable(true);
            if (hVar.h(19)) {
                if (h.a(hVar, eVar) || h.a(hVar, eVar4)) {
                    if (j(hVar)) {
                        accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, hVar.f2460j, false));
                    } else {
                        accessibilityNodeInfoObtain2.setClassName("android.widget.HorizontalScrollView");
                    }
                } else if (j(hVar)) {
                    accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(hVar.f2460j, 0, false));
                } else {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.ScrollView");
                }
            }
            if (h.a(hVar, eVar) || h.a(hVar, eVar3)) {
                accessibilityNodeInfoObtain2.addAction(4096);
            }
            if (h.a(hVar, eVar4) || h.a(hVar, eVar2)) {
                accessibilityNodeInfoObtain2.addAction(8192);
            }
        }
        e eVar5 = e.f2406l;
        boolean zA2 = h.a(hVar, eVar5);
        e eVar6 = e.f2407m;
        if (zA2 || h.a(hVar, eVar6)) {
            accessibilityNodeInfoObtain2.setClassName("android.widget.SeekBar");
            if (h.a(hVar, eVar5)) {
                accessibilityNodeInfoObtain2.addAction(4096);
            }
            if (h.a(hVar, eVar6)) {
                accessibilityNodeInfoObtain2.addAction(8192);
            }
        }
        if (hVar.h(16)) {
            accessibilityNodeInfoObtain2.setLiveRegion(1);
        }
        if (hVar.h(5)) {
            accessibilityNodeInfoObtain2.setText(h.e(hVar.f2468r, hVar.f2469s));
            if (i7 >= 28) {
                CharSequence[] charSequenceArr = {h.e(hVar.f2466p, hVar.f2467q), h.e(hVar.f2473x, hVar.f2474y)};
                int i10 = 0;
                CharSequence charSequence = null;
                for (int i11 = 2; i10 < i11; i11 = 2) {
                    CharSequence charSequenceConcat = charSequenceArr[i10];
                    if (charSequenceConcat == null || charSequenceConcat.length() <= 0) {
                        i3 = 1;
                    } else {
                        if (charSequence == null || charSequence.length() == 0) {
                            i3 = 1;
                        } else {
                            i3 = 1;
                            charSequenceConcat = TextUtils.concat(charSequence, ", ", charSequenceConcat);
                        }
                        charSequence = charSequenceConcat;
                    }
                    i10 += i3;
                }
                accessibilityNodeInfoObtain2.setHintText(charSequence);
            }
        } else if (!hVar.h(12)) {
            CharSequence charSequenceB = h.b(hVar);
            if (i7 < 28 && hVar.f2475z != null) {
                charSequenceB = ((Object) (charSequenceB != null ? charSequenceB : "")) + "\n" + hVar.f2475z;
            }
            if (charSequenceB != null) {
                accessibilityNodeInfoObtain2.setContentDescription(charSequenceB);
            }
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28 && (str = hVar.f2475z) != null) {
            accessibilityNodeInfoObtain2.setTooltipText(str);
        }
        boolean z2 = true;
        boolean zH = hVar.h(1);
        boolean zH2 = hVar.h(17);
        if (!zH && !zH2) {
            z2 = false;
        }
        accessibilityNodeInfoObtain2.setCheckable(z2);
        if (zH) {
            accessibilityNodeInfoObtain2.setChecked(hVar.h(2));
            if (hVar.h(9)) {
                accessibilityNodeInfoObtain2.setClassName("android.widget.RadioButton");
            } else {
                accessibilityNodeInfoObtain2.setClassName("android.widget.CheckBox");
            }
        } else if (zH2) {
            accessibilityNodeInfoObtain2.setChecked(hVar.h(18));
            accessibilityNodeInfoObtain2.setClassName("android.widget.Switch");
        }
        accessibilityNodeInfoObtain2.setSelected(hVar.h(3));
        if (i12 >= 28) {
            accessibilityNodeInfoObtain2.setHeading(hVar.h(10));
        }
        h hVar7 = this.f2488i;
        if (hVar7 == null || hVar7.f2452b != i2) {
            accessibilityNodeInfoObtain2.addAction(64);
        } else {
            accessibilityNodeInfoObtain2.addAction(128);
        }
        ArrayList<f> arrayList = hVar.f2444R;
        if (arrayList != null) {
            for (f fVar : arrayList) {
                accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(fVar.f2421a, fVar.f2424d));
            }
        }
        for (h hVar8 : hVar.f2442P) {
            if (!hVar8.h(14)) {
                int i13 = hVar8.f2459i;
                if (i13 != -1) {
                    View viewG2 = oVar.g(i13);
                    if (!oVar.m(hVar8.f2459i)) {
                        accessibilityNodeInfoObtain2.addChild(viewG2);
                    }
                }
                accessibilityNodeInfoObtain2.addChild(view, hVar8.f2452b);
            }
        }
        return accessibilityNodeInfoObtain2;
    }

    public final AccessibilityEvent d(int i2, int i3) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i3);
        View view = this.f2480a;
        accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        accessibilityEventObtain.setSource(view, i2);
        return accessibilityEventObtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z2) {
        h hVarI;
        if (!this.f2482c.isTouchExplorationEnabled()) {
            return false;
        }
        HashMap map = this.f2486g;
        if (map.isEmpty()) {
            return false;
        }
        h hVarI2 = ((h) map.get(0)).i(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z2);
        if (hVarI2 != null && hVarI2.f2459i != -1) {
            if (z2) {
                return false;
            }
            return this.f2483d.onAccessibilityHoverEvent(hVarI2.f2452b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (!map.isEmpty() && (hVarI = ((h) map.get(0)).i(new float[]{x2, y2, 0.0f, 1.0f}, z2)) != this.f2494o) {
                if (hVarI != null) {
                    g(hVarI.f2452b, 128);
                }
                h hVar = this.f2494o;
                if (hVar != null) {
                    g(hVar.f2452b, 256);
                }
                this.f2494o = hVarI;
            }
        } else {
            if (motionEvent.getAction() != 10) {
                motionEvent.toString();
                return false;
            }
            h hVar2 = this.f2494o;
            if (hVar2 != null) {
                g(hVar2.f2452b, 256);
                this.f2494o = null;
            }
        }
        return true;
    }

    public final boolean f(h hVar, int i2, Bundle bundle, boolean z2) {
        int i3;
        int i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i5 = hVar.f2457g;
        int i6 = hVar.f2458h;
        if (i6 >= 0 && i5 >= 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 4) {
                        if (i4 == 8 || i4 == 16) {
                            if (z2) {
                                hVar.f2458h = hVar.f2468r.length();
                            } else {
                                hVar.f2458h = 0;
                            }
                        }
                    } else if (z2 && i6 < hVar.f2468r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(hVar.f2468r.substring(hVar.f2458h));
                        if (matcher.find()) {
                            hVar.f2458h += matcher.start(1);
                        } else {
                            hVar.f2458h = hVar.f2468r.length();
                        }
                    } else if (!z2 && hVar.f2458h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(hVar.f2468r.substring(0, hVar.f2458h));
                        if (matcher2.find()) {
                            hVar.f2458h = matcher2.start(1);
                        } else {
                            hVar.f2458h = 0;
                        }
                    }
                } else if (z2 && i6 < hVar.f2468r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(hVar.f2468r.substring(hVar.f2458h));
                    matcher3.find();
                    if (matcher3.find()) {
                        hVar.f2458h += matcher3.start(1);
                    } else {
                        hVar.f2458h = hVar.f2468r.length();
                    }
                } else if (!z2 && hVar.f2458h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(hVar.f2468r.substring(0, hVar.f2458h));
                    if (matcher4.find()) {
                        hVar.f2458h = matcher4.start(1);
                    }
                }
            } else if (z2 && i6 < hVar.f2468r.length()) {
                hVar.f2458h++;
            } else if (!z2 && (i3 = hVar.f2458h) > 0) {
                hVar.f2458h = i3 - 1;
            }
            if (!z3) {
                hVar.f2457g = hVar.f2458h;
            }
        }
        if (i5 != hVar.f2457g || i6 != hVar.f2458h) {
            String str = hVar.f2468r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent accessibilityEventD = d(hVar.f2452b, 8192);
            accessibilityEventD.getText().add(str);
            accessibilityEventD.setFromIndex(hVar.f2457g);
            accessibilityEventD.setToIndex(hVar.f2458h);
            accessibilityEventD.setItemCount(str.length());
            h(accessibilityEventD);
        }
        C0026b c0026b = this.f2481b;
        if (i4 == 1) {
            if (z2) {
                e eVar = e.f2409o;
                if (h.a(hVar, eVar)) {
                    c0026b.v(i2, eVar, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                e eVar2 = e.f2410p;
                if (h.a(hVar, eVar2)) {
                    c0026b.v(i2, eVar2, Boolean.valueOf(z3));
                    return true;
                }
            }
        } else if (i4 == 2) {
            if (z2) {
                e eVar3 = e.f2418y;
                if (h.a(hVar, eVar3)) {
                    c0026b.v(i2, eVar3, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                e eVar4 = e.f2419z;
                if (h.a(hVar, eVar4)) {
                    c0026b.v(i2, eVar4, Boolean.valueOf(z3));
                    return true;
                }
            }
        } else if (i4 == 4 || i4 == 8 || i4 == 16) {
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i2) {
        if (i2 == 1) {
            h hVar = this.f2492m;
            if (hVar != null) {
                return createAccessibilityNodeInfo(hVar.f2452b);
            }
            Integer num = this.f2490k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i2 != 2) {
            return null;
        }
        h hVar2 = this.f2488i;
        if (hVar2 != null) {
            return createAccessibilityNodeInfo(hVar2.f2452b);
        }
        Integer num2 = this.f2489j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public final void g(int i2, int i3) {
        if (this.f2482c.isEnabled()) {
            h(d(i2, i3));
        }
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (this.f2482c.isEnabled()) {
            View view = this.f2480a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void i(boolean z2) {
        if (this.t == z2) {
            return;
        }
        this.t = z2;
        if (z2) {
            this.f2491l |= 1;
        } else {
            this.f2491l &= -2;
        }
        ((FlutterJNI) this.f2481b.f476f).setAccessibilityFeatures(this.f2491l);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0017  */
    /* JADX WARN: Code duplicated, block: B:16:0x001b  */
    /* JADX WARN: Code duplicated, block: B:18:0x001f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0029 A[LOOP:1: B:17:0x001d->B:21:0x0029, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0027 A[SYNTHETIC] */
    public final boolean j(h hVar) {
        h hVar2;
        h hVar3;
        if (hVar.f2460j > 0) {
            h hVar4 = this.f2488i;
            h hVar5 = null;
            if (hVar4 != null) {
                h hVar6 = hVar4.f2441O;
                while (true) {
                    if (hVar6 == null) {
                        hVar6 = null;
                        break;
                    }
                    if (hVar6 == hVar) {
                        break;
                    }
                    hVar6 = hVar6.f2441O;
                }
                if (hVar6 == null) {
                    hVar2 = this.f2488i;
                    if (hVar2 != null) {
                        for (hVar3 = hVar2.f2441O; hVar3 != null; hVar3 = hVar3.f2441O) {
                            if (hVar3.h(19)) {
                                hVar5 = hVar3;
                                break;
                            }
                        }
                        if (hVar5 != null) {
                        }
                    }
                }
            } else {
                hVar2 = this.f2488i;
                if (hVar2 != null) {
                    while (hVar3 != null) {
                        if (hVar3.h(19)) {
                            hVar5 = hVar3;
                            break;
                        }
                    }
                    if (hVar5 != null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i3, Bundle bundle) {
        if (i2 >= 65536) {
            boolean zPerformAction = this.f2483d.performAction(i2, i3, bundle);
            if (zPerformAction && i3 == 128) {
                this.f2489j = null;
            }
            return zPerformAction;
        }
        HashMap map = this.f2486g;
        h hVar = (h) map.get(Integer.valueOf(i2));
        if (hVar == null) {
            return false;
        }
        e eVar = e.f2406l;
        e eVar2 = e.f2407m;
        C0026b c0026b = this.f2481b;
        switch (i3) {
            case 16:
                c0026b.u(i2, e.f2400f);
                return true;
            case 32:
                c0026b.u(i2, e.f2401g);
                return true;
            case 64:
                if (this.f2488i == null) {
                    this.f2480a.invalidate();
                }
                this.f2488i = hVar;
                c0026b.u(i2, e.f2414u);
                HashMap map2 = new HashMap();
                map2.put("type", "didGainFocus");
                map2.put("nodeId", Integer.valueOf(hVar.f2452b));
                ((C0013n) c0026b.f477g).f(map2, null);
                g(i2, 32768);
                if (h.a(hVar, eVar) || h.a(hVar, eVar2)) {
                    g(i2, 4);
                }
                return true;
            case 128:
                h hVar2 = this.f2488i;
                if (hVar2 != null && hVar2.f2452b == i2) {
                    this.f2488i = null;
                }
                Integer num = this.f2489j;
                if (num != null && num.intValue() == i2) {
                    this.f2489j = null;
                }
                c0026b.u(i2, e.f2415v);
                g(i2, 65536);
                return true;
            case 256:
                return f(hVar, i2, bundle, true);
            case 512:
                return f(hVar, i2, bundle, false);
            case 4096:
                e eVar3 = e.f2404j;
                if (h.a(hVar, eVar3)) {
                    c0026b.u(i2, eVar3);
                } else {
                    e eVar4 = e.f2402h;
                    if (h.a(hVar, eVar4)) {
                        c0026b.u(i2, eVar4);
                    } else {
                        if (!h.a(hVar, eVar)) {
                            return false;
                        }
                        hVar.f2468r = hVar.t;
                        hVar.f2469s = hVar.f2470u;
                        g(i2, 4);
                        c0026b.u(i2, eVar);
                    }
                }
                return true;
            case 8192:
                e eVar5 = e.f2405k;
                if (h.a(hVar, eVar5)) {
                    c0026b.u(i2, eVar5);
                } else {
                    e eVar6 = e.f2403i;
                    if (h.a(hVar, eVar6)) {
                        c0026b.u(i2, eVar6);
                    } else {
                        if (!h.a(hVar, eVar2)) {
                            return false;
                        }
                        hVar.f2468r = hVar.f2471v;
                        hVar.f2469s = hVar.f2472w;
                        g(i2, 4);
                        c0026b.u(i2, eVar2);
                    }
                }
                return true;
            case 16384:
                c0026b.u(i2, e.f2412r);
                return true;
            case 32768:
                c0026b.u(i2, e.t);
                return true;
            case 65536:
                c0026b.u(i2, e.f2413s);
                return true;
            case 131072:
                HashMap map3 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    map3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    map3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    map3.put("base", Integer.valueOf(hVar.f2458h));
                    map3.put("extent", Integer.valueOf(hVar.f2458h));
                }
                c0026b.v(i2, e.f2411q, map3);
                h hVar3 = (h) map.get(Integer.valueOf(i2));
                hVar3.f2457g = ((Integer) map3.get("base")).intValue();
                hVar3.f2458h = ((Integer) map3.get("extent")).intValue();
                return true;
            case 1048576:
                c0026b.u(i2, e.f2417x);
                return true;
            case 2097152:
                String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                c0026b.v(i2, e.f2398A, string);
                hVar.f2468r = string;
                hVar.f2469s = null;
                return true;
            case R.id.accessibilityActionShowOnScreen:
                c0026b.u(i2, e.f2408n);
                return true;
            default:
                f fVar = (f) this.f2487h.get(Integer.valueOf(i3 - 267386881));
                if (fVar == null) {
                    return false;
                }
                c0026b.v(i2, e.f2416w, Integer.valueOf(fVar.f2422b));
                return true;
        }
    }
}
