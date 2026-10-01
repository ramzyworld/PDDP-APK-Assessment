package p028p0;

import D.j;
import G.C0019u;
import I0.h;
import L.l;
import N.C0026b;
import N.C0038n;
import N.Q;
import T0.d;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.PointerIcon;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import io.flutter.plugin.editing.g;
import io.flutter.plugin.platform.e;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.n;
import io.flutter.plugin.platform.o;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p011g0.AbstractActivityC0098e;
import p011g0.D;
import p011g0.q;
import p011g0.t;
import p030q0.i;
import p030q0.k;
import p034s0.a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements k, d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f2896f;

    public /* synthetic */ b() {
        this.f2895e = 14;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void d(Q q2, k kVar) {
        byte b2;
        int i2;
        e eVarA;
        ClipDescription primaryClipDescription;
        Q q3 = (Q) this.f2896f;
        if (((n) q3.f472g) == null) {
            return;
        }
        String str = (String) q2.f471f;
        try {
            boolean zHasMimeType = false;
            switch (str.hashCode()) {
                case -1501580720:
                    if (!str.equals("SystemNavigator.setFrameworkHandlesBack")) {
                        b2 = -1;
                    } else {
                        b2 = 9;
                    }
                    break;
                case -931781241:
                    if (!str.equals("Share.invoke")) {
                        b2 = -1;
                    } else {
                        b2 = 14;
                    }
                    break;
                case -766342101:
                    if (!str.equals("SystemNavigator.pop")) {
                        b2 = -1;
                    } else {
                        b2 = 10;
                    }
                    break;
                case -720677196:
                    if (!str.equals("Clipboard.setData")) {
                        b2 = -1;
                    } else {
                        b2 = 12;
                    }
                    break;
                case -577225884:
                    if (!str.equals("SystemChrome.setSystemUIChangeListener")) {
                        b2 = -1;
                    } else {
                        b2 = 6;
                    }
                    break;
                case -548468504:
                    if (!str.equals("SystemChrome.setApplicationSwitcherDescription")) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case -247230243:
                    if (!str.equals("HapticFeedback.vibrate")) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case -215273374:
                    if (!str.equals("SystemSound.play")) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case 241845679:
                    if (!str.equals("SystemChrome.restoreSystemUIOverlays")) {
                        b2 = -1;
                    } else {
                        b2 = 7;
                    }
                    break;
                case 875995648:
                    if (!str.equals("Clipboard.hasStrings")) {
                        b2 = -1;
                    } else {
                        b2 = 13;
                    }
                    break;
                case 1128339786:
                    if (!str.equals("SystemChrome.setEnabledSystemUIMode")) {
                        b2 = -1;
                    } else {
                        b2 = 5;
                    }
                    break;
                case 1390477857:
                    if (!str.equals("SystemChrome.setSystemUIOverlayStyle")) {
                        b2 = -1;
                    } else {
                        b2 = 8;
                    }
                    break;
                case 1514180520:
                    if (!str.equals("Clipboard.getData")) {
                        b2 = -1;
                    } else {
                        b2 = 11;
                    }
                    break;
                case 1674312266:
                    if (!str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                case 2119655719:
                    if (!str.equals("SystemChrome.setPreferredOrientations")) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            Object obj = q2.f472g;
            switch (b2) {
                case 0:
                    try {
                        int iC = h.c((String) obj);
                        f fVar = (f) ((n) q3.f472g).f2340a;
                        if (iC == 1) {
                            fVar.f2316a.getWindow().getDecorView().playSoundEffect(0);
                        } else {
                            fVar.getClass();
                        }
                        kVar.c(null);
                        return;
                    } catch (NoSuchFieldException e2) {
                        kVar.a("error", e2.getMessage(), null);
                        return;
                    }
                case 1:
                    try {
                        ((n) q3.f472g).l(h.b((String) obj));
                        kVar.c(null);
                        return;
                    } catch (NoSuchFieldException e3) {
                        kVar.a("error", e3.getMessage(), null);
                        return;
                    }
                case 2:
                    try {
                        ((f) ((n) q3.f472g).f2340a).f2316a.setRequestedOrientation(Q.d(q3, (JSONArray) obj));
                        kVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e4) {
                        kVar.a("error", e4.getMessage(), null);
                        return;
                    }
                case 3:
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        int i3 = jSONObject.getInt("primaryColor");
                        if (i3 != 0) {
                            i3 |= -16777216;
                        }
                        String string = jSONObject.getString("label");
                        n nVar = (n) q3.f472g;
                        int i4 = Build.VERSION.SDK_INT;
                        AbstractActivityC0098e abstractActivityC0098e = ((f) nVar.f2340a).f2316a;
                        if (i4 < 28) {
                            abstractActivityC0098e.setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, i3));
                        } else {
                            abstractActivityC0098e.setTaskDescription(l.d(string, i3));
                        }
                        kVar.c(null);
                        return;
                    } catch (JSONException e5) {
                        kVar.a("error", e5.getMessage(), null);
                        return;
                    }
                case I.k.LONG_FIELD_NUMBER /* 4 */:
                    try {
                        ((n) q3.f472g).k(Q.e(q3, (JSONArray) obj));
                        kVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e6) {
                        kVar.a("error", e6.getMessage(), null);
                        return;
                    }
                case I.k.STRING_FIELD_NUMBER /* 5 */:
                    try {
                        int iF = Q.f(q3, (String) obj);
                        f fVar2 = (f) ((n) q3.f472g).f2340a;
                        fVar2.getClass();
                        if (iF == 1) {
                            i2 = 1798;
                        } else if (iF == 2) {
                            i2 = 3846;
                        } else {
                            if (iF != 3) {
                                if (iF == 4 && Build.VERSION.SDK_INT >= 29) {
                                    i2 = 1792;
                                }
                                kVar.c(null);
                                return;
                            }
                            i2 = 5894;
                        }
                        fVar2.f2320e = i2;
                        fVar2.b();
                        kVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e7) {
                        kVar.a("error", e7.getMessage(), null);
                        return;
                    }
                case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    f fVar3 = (f) ((n) q3.f472g).f2340a;
                    View decorView = fVar3.f2316a.getWindow().getDecorView();
                    decorView.setOnSystemUiVisibilityChangeListener(new e(fVar3, decorView));
                    kVar.c(null);
                    return;
                case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    ((f) ((n) q3.f472g).f2340a).b();
                    kVar.c(null);
                    return;
                case I.k.BYTES_FIELD_NUMBER /* 8 */:
                    try {
                        ((f) ((n) q3.f472g).f2340a).a(Q.h(q3, (JSONObject) obj));
                        kVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e8) {
                        kVar.a("error", e8.getMessage(), null);
                        return;
                    }
                case 9:
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    AbstractActivityC0098e abstractActivityC0098e2 = ((f) ((n) q3.f472g).f2340a).f2318c;
                    if (abstractActivityC0098e2 != null) {
                        abstractActivityC0098e2.h(zBooleanValue);
                    }
                    kVar.c(null);
                    return;
                case 10:
                    f fVar4 = (f) ((n) q3.f472g).f2340a;
                    AbstractActivityC0098e abstractActivityC0098e3 = fVar4.f2318c;
                    fVar4.f2316a.finish();
                    kVar.c(null);
                    return;
                case 11:
                    String str2 = (String) obj;
                    if (str2 != null) {
                        try {
                            eVarA = e.a(str2);
                        } catch (NoSuchFieldException unused) {
                            kVar.a("error", "No such clipboard content format: ".concat(str2), null);
                            eVarA = null;
                        }
                        break;
                    } else {
                        eVarA = null;
                    }
                    CharSequence charSequenceF = ((n) q3.f472g).f(eVarA);
                    if (charSequenceF == null) {
                        kVar.c(null);
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("text", charSequenceF);
                    kVar.c(jSONObject2);
                    return;
                case 12:
                    ((ClipboardManager) ((f) ((n) q3.f472g).f2340a).f2316a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                    kVar.c(null);
                    return;
                case 13:
                    ClipboardManager clipboardManager = (ClipboardManager) ((f) ((n) q3.f472g).f2340a).f2316a.getSystemService("clipboard");
                    if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                        zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("value", zHasMimeType);
                    kVar.c(jSONObject3);
                    return;
                case 14:
                    f fVar5 = (f) ((n) q3.f472g).f2340a;
                    fVar5.getClass();
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", (String) obj);
                    fVar5.f2316a.startActivity(Intent.createChooser(intent, null));
                    kVar.c(null);
                    return;
                default:
                    kVar.b();
                    return;
            }
        } catch (JSONException e9) {
            kVar.a("error", "JSON error: " + e9.getMessage(), null);
        }
        kVar.a("error", "JSON error: " + e9.getMessage(), null);
    }

    public void a(String str) {
        Q q2 = (Q) this.f2896f;
        a aVar = (a) q2.f471f;
        if (Q.f469i == null) {
            D d2 = new D();
            d2.put("alias", 1010);
            d2.put("allScroll", 1013);
            d2.put("basic", 1000);
            d2.put("cell", 1006);
            d2.put("click", 1002);
            d2.put("contextMenu", 1001);
            d2.put("copy", 1011);
            d2.put("forbidden", 1012);
            d2.put("grab", 1020);
            d2.put("grabbing", 1021);
            d2.put("help", 1003);
            d2.put("move", 1013);
            d2.put("none", 0);
            d2.put("noDrop", 1012);
            d2.put("precise", 1007);
            d2.put("text", 1008);
            d2.put("resizeColumn", 1014);
            d2.put("resizeDown", 1015);
            d2.put("resizeUpLeft", 1016);
            d2.put("resizeDownRight", 1017);
            d2.put("resizeLeft", 1014);
            d2.put("resizeLeftRight", 1014);
            d2.put("resizeRight", 1014);
            d2.put("resizeRow", 1015);
            d2.put("resizeUp", 1015);
            d2.put("resizeUpDown", 1015);
            d2.put("resizeUpLeft", 1017);
            d2.put("resizeUpRight", 1016);
            d2.put("resizeUpLeftDownRight", 1017);
            d2.put("resizeUpRightDownLeft", 1016);
            d2.put("verticalText", 1009);
            d2.put("wait", 1004);
            d2.put("zoomIn", 1018);
            d2.put("zoomOut", 1019);
            Q.f469i = d2;
        }
        aVar.setPointerIcon(PointerIcon.getSystemIcon(((q) ((a) q2.f471f)).getContext(), ((Integer) Q.f469i.getOrDefault(str, 1000)).intValue()));
    }

    public String b(String str, String str2) {
        p032r0.b bVar = (p032r0.b) this.f2896f;
        Context contextCreateConfigurationContext = bVar.f3060b;
        AbstractActivityC0098e abstractActivityC0098e = bVar.f3060b;
        if (str2 != null) {
            Locale localeA = p032r0.b.a(str2);
            Configuration configuration = new Configuration(abstractActivityC0098e.getResources().getConfiguration());
            configuration.setLocale(localeA);
            contextCreateConfigurationContext = abstractActivityC0098e.createConfigurationContext(configuration);
        }
        int identifier = contextCreateConfigurationContext.getResources().getIdentifier(str, "string", abstractActivityC0098e.getPackageName());
        if (identifier != 0) {
            return contextCreateConfigurationContext.getResources().getString(identifier);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:143:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:219:0x046c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @Override // p030q0.k
    public void c(Q q2, k kVar) {
        Bundle bundle;
        char c2 = 0;
        z = false;
        boolean z2 = false;
        c2 = 0;
        switch (this.f2895e) {
            case 0:
                ((H.a) this.f2896f).getClass();
                return;
            case 1:
            case I.k.LONG_FIELD_NUMBER /* 4 */:
            case 10:
            default:
                Q q3 = (Q) this.f2896f;
                if (((j) q3.f472g) == null) {
                    return;
                }
                String str = (String) q2.f471f;
                str.getClass();
                Object obj = q2.f472g;
                switch (str) {
                    case "TextInput.setPlatformViewClient":
                        try {
                            JSONObject jSONObject = (JSONObject) obj;
                            int i2 = jSONObject.getInt("platformViewId");
                            boolean zOptBoolean = jSONObject.optBoolean("usesVirtualDisplay", false);
                            io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) ((j) q3.f472g).f44f;
                            if (zOptBoolean) {
                                View view = jVar.f2292a;
                                view.requestFocus();
                                jVar.f2296e = new C0038n(3, i2);
                                jVar.f2293b.restartInput(view);
                                jVar.f2300i = false;
                            } else {
                                jVar.getClass();
                                jVar.f2296e = new C0038n(4, i2);
                                jVar.f2301j = null;
                            }
                            kVar.c(null);
                            return;
                        } catch (JSONException e2) {
                            kVar.a("error", e2.getMessage(), null);
                            return;
                        }
                    case "TextInput.setEditingState":
                        try {
                            ((j) q3.f472g).v(q.a((JSONObject) obj));
                            kVar.c(null);
                            return;
                        } catch (JSONException e3) {
                            kVar.a("error", e3.getMessage(), null);
                            return;
                        }
                    case "TextInput.setClient":
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            ((j) q3.f472g).t(jSONArray.getInt(0), o.a(jSONArray.getJSONObject(1)));
                            kVar.c(null);
                            return;
                        } catch (NoSuchFieldException | JSONException e4) {
                            kVar.a("error", e4.getMessage(), null);
                            return;
                        }
                    case "TextInput.hide":
                        io.flutter.plugin.editing.j jVar2 = (io.flutter.plugin.editing.j) ((j) q3.f472g).f44f;
                        if (jVar2.f2296e.f534b == 4) {
                            jVar2.d();
                        } else {
                            jVar2.d();
                            jVar2.f2293b.hideSoftInputFromWindow(jVar2.f2292a.getApplicationWindowToken(), 0);
                        }
                        kVar.c(null);
                        return;
                    case "TextInput.show":
                        io.flutter.plugin.editing.j jVar3 = (io.flutter.plugin.editing.j) ((j) q3.f472g).f44f;
                        View view2 = jVar3.f2292a;
                        o oVar = jVar3.f2297f;
                        InputMethodManager inputMethodManager = jVar3.f2293b;
                        if (oVar == null || oVar.f2963g.f2969a != 11) {
                            view2.requestFocus();
                            inputMethodManager.showSoftInput(view2, 0);
                        } else {
                            jVar3.d();
                            inputMethodManager.hideSoftInputFromWindow(view2.getApplicationWindowToken(), 0);
                        }
                        kVar.c(null);
                        return;
                    case "TextInput.sendAppPrivateCommand":
                        try {
                            JSONObject jSONObject2 = (JSONObject) obj;
                            String string = jSONObject2.getString("action");
                            String string2 = jSONObject2.getString("data");
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("data", string2);
                            }
                            io.flutter.plugin.editing.j jVar4 = (io.flutter.plugin.editing.j) ((j) q3.f472g).f44f;
                            jVar4.f2293b.sendAppPrivateCommand(jVar4.f2292a, string, bundle);
                            kVar.c(null);
                            return;
                        } catch (JSONException e5) {
                            kVar.a("error", e5.getMessage(), null);
                            return;
                        }
                    case "TextInput.setEditableSizeAndTransform":
                        try {
                            JSONObject jSONObject3 = (JSONObject) obj;
                            double d2 = jSONObject3.getDouble("width");
                            double d3 = jSONObject3.getDouble("height");
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (int i3 = 0; i3 < 16; i3++) {
                                dArr[i3] = jSONArray2.getDouble(i3);
                            }
                            ((j) q3.f472g).u(d2, d3, dArr);
                            kVar.c(null);
                            return;
                        } catch (JSONException e6) {
                            kVar.a("error", e6.getMessage(), null);
                            return;
                        }
                    case "TextInput.finishAutofillContext":
                        j jVar5 = (j) q3.f472g;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        if (Build.VERSION.SDK_INT >= 26) {
                            AutofillManager autofillManager = ((io.flutter.plugin.editing.j) jVar5.f44f).f2294c;
                            if (autofillManager != null) {
                                if (zBooleanValue) {
                                    autofillManager.commit();
                                } else {
                                    autofillManager.cancel();
                                }
                            }
                        } else {
                            jVar5.getClass();
                        }
                        kVar.c(null);
                        return;
                    case "TextInput.clearClient":
                        io.flutter.plugin.editing.j jVar6 = (io.flutter.plugin.editing.j) ((j) q3.f472g).f44f;
                        if (jVar6.f2296e.f534b != 3) {
                            jVar6.f2299h.e(jVar6);
                            jVar6.d();
                            jVar6.f2297f = null;
                            jVar6.e(null);
                            jVar6.f2296e = new C0038n(1, 0);
                            jVar6.f2303l = null;
                        }
                        kVar.c(null);
                        return;
                    case "TextInput.requestAutofill":
                        j jVar7 = (j) q3.f472g;
                        int i4 = Build.VERSION.SDK_INT;
                        io.flutter.plugin.editing.j jVar8 = (io.flutter.plugin.editing.j) jVar7.f44f;
                        if (i4 < 26) {
                            jVar8.getClass();
                        } else if (jVar8.f2294c != null && jVar8.f2298g != null) {
                            String str2 = (String) jVar8.f2297f.f2966j.f258a;
                            int[] iArr = new int[2];
                            View view3 = jVar8.f2292a;
                            view3.getLocationOnScreen(iArr);
                            Rect rect = new Rect(jVar8.f2303l);
                            rect.offset(iArr[0], iArr[1]);
                            jVar8.f2294c.notifyViewEntered(view3, str2.hashCode(), rect);
                        }
                        kVar.c(null);
                        return;
                    default:
                        kVar.b();
                        return;
                }
            case 2:
                Q q4 = (Q) this.f2896f;
                if (((b) q4.f472g) == null) {
                    return;
                }
                String str3 = (String) q2.f471f;
                str3.getClass();
                if (!str3.equals("Localization.getStringResource")) {
                    kVar.b();
                    return;
                }
                JSONObject jSONObject4 = (JSONObject) q2.f472g;
                try {
                    kVar.c(((b) q4.f472g).b(jSONObject4.getString("key"), jSONObject4.has("locale") ? jSONObject4.getString("locale") : null));
                    return;
                } catch (JSONException e7) {
                    kVar.a("error", e7.getMessage(), null);
                    return;
                }
            case 3:
                b bVar = (b) this.f2896f;
                if (((b) bVar.f2896f) == null) {
                    return;
                }
                String str4 = (String) q2.f471f;
                try {
                    if (str4.hashCode() == -1307105544 && str4.equals("activateSystemCursor")) {
                        try {
                            ((b) bVar.f2896f).a((String) ((HashMap) q2.f472g).get("kind"));
                            kVar.c(Boolean.TRUE);
                        } catch (Exception e8) {
                            kVar.a("error", "Error when setting cursors: " + e8.getMessage(), null);
                        }
                    }
                    return;
                } catch (Exception e9) {
                    kVar.a("error", "Unhandled error: " + e9.getMessage(), null);
                    return;
                }
            case I.k.STRING_FIELD_NUMBER /* 5 */:
                d(q2, kVar);
                return;
            case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                Q q5 = (Q) this.f2896f;
                if (((n) q5.f472g) == null) {
                    return;
                }
                String str5 = (String) q2.f471f;
                str5.getClass();
                Object obj2 = q2.f472g;
                switch (str5) {
                    case "create":
                        Map map = (Map) obj2;
                        boolean z3 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer byteBufferWrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            if (z3) {
                                h hVar = new h(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, byteBufferWrap);
                                o oVar2 = (o) ((n) q5.f472g).f2340a;
                                oVar2.getClass();
                                o.d(19);
                                o.a(oVar2, hVar);
                                oVar2.b(hVar, false);
                                o.d(19);
                                kVar.c(null);
                                return;
                            }
                            if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                                c2 = 1;
                            }
                            long jD = ((n) q5.f472g).d(new h(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), c2 != 0 ? 2 : 1, byteBufferWrap));
                            if (jD != -2) {
                                kVar.c(Long.valueOf(jD));
                                return;
                            } else {
                                if (c2 == 0) {
                                    throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                                }
                                kVar.c(null);
                                return;
                            }
                        } catch (IllegalStateException e10) {
                            kVar.a("error", Log.getStackTraceString(e10), null);
                            return;
                        }
                    case "offset":
                        Map map2 = (Map) obj2;
                        try {
                            ((n) q5.f472g).g(((Integer) map2.get("id")).intValue(), ((Double) map2.get("top")).doubleValue(), ((Double) map2.get("left")).doubleValue());
                            kVar.c(null);
                            return;
                        } catch (IllegalStateException e11) {
                            kVar.a("error", Log.getStackTraceString(e11), null);
                            return;
                        }
                    case "resize":
                        Map map3 = (Map) obj2;
                        try {
                            ((n) q5.f472g).i(new i(((Integer) map3.get("id")).intValue(), ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue()), new t(2, kVar));
                            return;
                        } catch (IllegalStateException e12) {
                            kVar.a("error", Log.getStackTraceString(e12), null);
                            return;
                        }
                    case "clearFocus":
                        try {
                            ((n) q5.f472g).c(((Integer) obj2).intValue());
                            kVar.c(null);
                            return;
                        } catch (IllegalStateException e13) {
                            kVar.a("error", Log.getStackTraceString(e13), null);
                            return;
                        }
                    case "synchronizeToNativeViewHierarchy":
                        try {
                            ((o) ((n) q5.f472g).f2340a).f2358q = ((Boolean) obj2).booleanValue();
                            kVar.c(null);
                            return;
                        } catch (IllegalStateException e14) {
                            kVar.a("error", Log.getStackTraceString(e14), null);
                            return;
                        }
                    case "touch":
                        List list = (List) obj2;
                        try {
                            ((n) q5.f472g).h(new j(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                            kVar.c(null);
                            return;
                        } catch (IllegalStateException e15) {
                            kVar.a("error", Log.getStackTraceString(e15), null);
                            return;
                        }
                    case "setDirection":
                        Map map4 = (Map) obj2;
                        try {
                            ((n) q5.f472g).j(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                            kVar.c(null);
                            return;
                        } catch (IllegalStateException e16) {
                            kVar.a("error", Log.getStackTraceString(e16), null);
                            return;
                        }
                    case "dispose":
                        try {
                            ((n) q5.f472g).e(((Integer) ((Map) obj2).get("id")).intValue());
                            kVar.c(null);
                            return;
                        } catch (IllegalStateException e17) {
                            kVar.a("error", Log.getStackTraceString(e17), null);
                            return;
                        }
                    default:
                        kVar.b();
                        return;
                }
            case I.k.DOUBLE_FIELD_NUMBER /* 7 */:
                Q q6 = (Q) this.f2896f;
                if (((p035t0.a) q6.f472g) == null) {
                    return;
                }
                String str6 = (String) q2.f471f;
                Object obj3 = q2.f472g;
                str6.getClass();
                if (str6.equals("ProcessText.processTextAction")) {
                    try {
                        ArrayList arrayList = (ArrayList) obj3;
                        ((p035t0.a) q6.f472g).f((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), kVar);
                        return;
                    } catch (IllegalStateException e18) {
                        kVar.a("error", e18.getMessage(), null);
                        return;
                    }
                }
                if (!str6.equals("ProcessText.queryTextActions")) {
                    kVar.b();
                    return;
                }
                try {
                    kVar.c(((p035t0.a) q6.f472g).h());
                    return;
                } catch (IllegalStateException e19) {
                    kVar.a("error", e19.getMessage(), null);
                    return;
                }
            case I.k.BYTES_FIELD_NUMBER /* 8 */:
                String str7 = (String) q2.f471f;
                str7.getClass();
                l lVar = (l) this.f2896f;
                if (!str7.equals("get")) {
                    if (!str7.equals("put")) {
                        kVar.b();
                        return;
                    } else {
                        lVar.f2947b = (byte[]) q2.f472g;
                        kVar.c(null);
                        return;
                    }
                }
                lVar.f2951f = true;
                if (lVar.f2950e || !lVar.f2946a) {
                    kVar.c(l.a(lVar.f2947b));
                    return;
                } else {
                    lVar.f2949d = kVar;
                    return;
                }
            case 9:
                b bVar2 = (b) this.f2896f;
                if (((Q) bVar2.f2896f) == null) {
                    return;
                }
                String str8 = (String) q2.f471f;
                str8.getClass();
                switch (str8) {
                    case "Scribe.isFeatureAvailable":
                        try {
                            Q q7 = (Q) bVar2.f2896f;
                            if (Build.VERSION.SDK_INT < 34) {
                                q7.getClass();
                            } else if (((InputMethodManager) q7.f471f).isStylusHandwritingAvailable()) {
                                z2 = true;
                            }
                            kVar.c(Boolean.valueOf(z2));
                            return;
                        } catch (IllegalStateException e20) {
                            kVar.a("error", e20.getMessage(), null);
                            return;
                        }
                    case "Scribe.startStylusHandwriting":
                        if (Build.VERSION.SDK_INT < 33) {
                            kVar.a("error", "Requires API level 33 or higher.", null);
                            return;
                        }
                        try {
                            Q q8 = (Q) bVar2.f2896f;
                            ((InputMethodManager) q8.f471f).startStylusHandwriting((View) q8.f472g);
                            kVar.c(null);
                            return;
                        } catch (IllegalStateException e21) {
                            kVar.a("error", e21.getMessage(), null);
                            return;
                        }
                    case "Scribe.isStylusHandwritingAvailable":
                        if (Build.VERSION.SDK_INT < 34) {
                            kVar.a("error", "Requires API level 34 or higher.", null);
                            return;
                        }
                        try {
                            kVar.c(Boolean.valueOf(((InputMethodManager) ((Q) bVar2.f2896f).f471f).isStylusHandwritingAvailable()));
                            return;
                        } catch (IllegalStateException e22) {
                            kVar.a("error", e22.getMessage(), null);
                            return;
                        }
                    default:
                        kVar.b();
                        return;
                }
            case 11:
                b bVar3 = (b) this.f2896f;
                if (((g) bVar3.f2896f) == null) {
                    return;
                }
                String str9 = (String) q2.f471f;
                Object obj4 = q2.f472g;
                str9.getClass();
                if (!str9.equals("SpellCheck.initiateSpellCheck")) {
                    kVar.b();
                    return;
                }
                try {
                    ArrayList arrayList2 = (ArrayList) obj4;
                    ((g) bVar3.f2896f).a((String) arrayList2.get(0), (String) arrayList2.get(1), kVar);
                    return;
                } catch (IllegalStateException e23) {
                    kVar.a("error", e23.getMessage(), null);
                    return;
                }
        }
    }

    @Override // T0.d
    public Object g(T0.e eVar, z0.d dVar) {
        Object objG = ((d) this.f2896f).g(new C0019u(eVar, 1), dVar);
        return objG == A0.a.f0e ? objG : p041x0.g.f3419a;
    }

    public /* synthetic */ b(int i2, Object obj) {
        this.f2895e = i2;
        this.f2896f = obj;
    }

    public b(p015i0.b bVar, int i2) {
        this.f2895e = i2;
        switch (i2) {
            case 10:
                new C0026b(bVar, "flutter/scribe", i.f3027a, 10).N(new b(9, this));
                break;
            case 11:
            default:
                new C0026b(bVar, "flutter/mousecursor", p030q0.o.f3031a, 10).N(new b(3, this));
                break;
            case 12:
                new C0026b(bVar, "flutter/spellcheck", p030q0.o.f3031a, 10).N(new b(11, this));
                break;
        }
    }

    public b(p030q0.f fVar) {
        this.f2895e = 1;
        new C0026b(fVar, "flutter/keyboard", p030q0.o.f3031a, 10).N(new Q(this));
    }
}
