package N;

import G.C0013n;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import org.xmlpull.v1.XmlPullParserException;
import p016j.AbstractC0127y;
import p016j.C0118o;
import p016j.C0121s;
import p016j.j0;
import p037u0.C0134f;
import p037u0.C0136h;
import p037u0.InterfaceC0135g;

/* JADX INFO: renamed from: N.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0026b implements InterfaceC0135g, T0.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static C0026b f474i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f478h;

    public /* synthetic */ C0026b(Object obj, Object obj2, Object obj3, int i2) {
        this.f475e = i2;
        this.f477g = obj;
        this.f476f = obj2;
        this.f478h = obj3;
    }

    public static C0026b E() {
        if (f474i == null) {
            H.a aVar = new H.a(15);
            f0.a aVar2 = new f0.a();
            aVar2.f1829a = 0;
            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(aVar2);
            FlutterJNI flutterJNI = new FlutterJNI();
            p019k0.d dVar = new p019k0.d();
            dVar.f2800a = false;
            dVar.f2804e = flutterJNI;
            dVar.f2805f = executorServiceNewCachedThreadPool;
            C0026b c0026b = new C0026b(4);
            c0026b.f477g = dVar;
            c0026b.f476f = aVar;
            c0026b.f478h = executorServiceNewCachedThreadPool;
            f474i = c0026b;
        }
        return f474i;
    }

    public static void H(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public static C0026b I(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new C0026b(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    public View A(int i2) {
        return ((RecyclerView) ((D.j) this.f477g).f44f).getChildAt(i2);
    }

    public int B() {
        return ((RecyclerView) ((D.j) this.f477g).f44f).getChildCount();
    }

    public File C(Context context) {
        ((H.a) this.f476f).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public boolean D(KeyEvent keyEvent) {
        if (((HashSet) this.f476f).remove(keyEvent)) {
            return false;
        }
        p011g0.B[] bArr = (p011g0.B[]) this.f477g;
        if (bArr.length <= 0) {
            J(keyEvent);
            return true;
        }
        p011g0.A a2 = new p011g0.A(this, keyEvent);
        for (p011g0.B b2 : bArr) {
            b2.a(keyEvent, new p011g0.z(a2));
        }
        return true;
    }

    public void F(String str, Object obj, p028p0.k kVar) {
        ((p030q0.f) this.f477g).n((String) this.f476f, ((p030q0.l) this.f478h).e(new Q(22, str, obj)), kVar == null ? null : new p030q0.a(1, this, kVar));
    }

    public void G(int i2) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = (ImageView) this.f477g;
        C0026b c0026bI = I(imageView.getContext(), null, p004c.a.f1741e, i2);
        try {
            Drawable drawable3 = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) c0026bI.f476f;
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = p006d.b.c(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                AbstractC0127y.b(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList colorStateListX = c0026bI.x(2);
                int i3 = Build.VERSION.SDK_INT;
                D.f.c(imageView, colorStateListX);
                if (i3 == 21 && (drawable2 = imageView.getDrawable()) != null && D.f.a(imageView) != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode modeD = AbstractC0127y.d(typedArray.getInt(3, -1), null);
                int i4 = Build.VERSION.SDK_INT;
                D.f.d(imageView, modeD);
                if (i4 == 21 && (drawable = imageView.getDrawable()) != null && D.f.a(imageView) != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } finally {
            c0026bI.L();
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    public void J(KeyEvent keyEvent) {
        InputConnection inputConnection;
        io.flutter.plugin.editing.e eVar;
        int selectionStart;
        int selectionEnd;
        int unicodeChar;
        int iMin;
        int iMax;
        p011g0.C c2 = (p011g0.C) this.f478h;
        if (c2 != null) {
            io.flutter.plugin.editing.j jVar = ((p011g0.q) c2).f1904o;
            boolean zSendKeyEvent = false;
            if (jVar.f2293b.isAcceptingText() && (inputConnection = jVar.f2301j) != null) {
                if (inputConnection instanceof io.flutter.plugin.editing.b) {
                    io.flutter.plugin.editing.b bVar = (io.flutter.plugin.editing.b) inputConnection;
                    if (keyEvent.getAction() == 0) {
                        if (keyEvent.getKeyCode() == 21) {
                            zSendKeyEvent = bVar.d(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 22) {
                            zSendKeyEvent = bVar.d(false, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 19) {
                            zSendKeyEvent = bVar.e(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 20) {
                            zSendKeyEvent = bVar.e(false, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                            EditorInfo editorInfo = bVar.f2254e;
                            if ((editorInfo.inputType & 131072) == 0) {
                                bVar.performEditorAction(editorInfo.imeOptions & 255);
                            } else {
                                eVar = bVar.f2253d;
                                selectionStart = Selection.getSelectionStart(eVar);
                                selectionEnd = Selection.getSelectionEnd(eVar);
                                unicodeChar = keyEvent.getUnicodeChar();
                                if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                                    iMin = Math.min(selectionStart, selectionEnd);
                                    iMax = Math.max(selectionStart, selectionEnd);
                                    bVar.beginBatchEdit();
                                    if (iMin != iMax) {
                                        eVar.delete(iMin, iMax);
                                    }
                                    eVar.insert(iMin, (CharSequence) String.valueOf((char) unicodeChar));
                                    int i2 = iMin + 1;
                                    bVar.setSelection(i2, i2);
                                    bVar.endBatchEdit();
                                }
                            }
                            zSendKeyEvent = true;
                        } else {
                            eVar = bVar.f2253d;
                            selectionStart = Selection.getSelectionStart(eVar);
                            selectionEnd = Selection.getSelectionEnd(eVar);
                            unicodeChar = keyEvent.getUnicodeChar();
                            if (selectionStart >= 0) {
                                iMin = Math.min(selectionStart, selectionEnd);
                                iMax = Math.max(selectionStart, selectionEnd);
                                bVar.beginBatchEdit();
                                if (iMin != iMax) {
                                    eVar.delete(iMin, iMax);
                                }
                                eVar.insert(iMin, (CharSequence) String.valueOf((char) unicodeChar));
                                int i3 = iMin + 1;
                                bVar.setSelection(i3, i3);
                                bVar.endBatchEdit();
                                zSendKeyEvent = true;
                            }
                        }
                    }
                } else {
                    zSendKeyEvent = inputConnection.sendKeyEvent(keyEvent);
                }
            }
            if (zSendKeyEvent) {
                return;
            }
            HashSet hashSet = (HashSet) this.f476f;
            hashSet.add(keyEvent);
            ((p011g0.q) c2).getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void K(Activity activity, Y.k kVar) {
        I0.i.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f476f;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f478h;
        try {
            if (kVar.equals((Y.k) weakHashMap.get(activity))) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            for (p003b0.j jVar : ((p003b0.k) ((D.j) this.f477g).f44f).f1736b) {
                if (jVar.f1730a.equals(activity)) {
                    jVar.f1732c = kVar;
                    jVar.f1731b.accept(kVar);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void L() {
        ((TypedArray) this.f476f).recycle();
    }

    public void M(ArrayList arrayList) {
        Object[] objArr;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0025a abstractC0025a = (AbstractC0025a) arrayList.get(i2);
            abstractC0025a.getClass();
            p011g0.F f2 = (p011g0.F) this.f477g;
            f2.getClass();
            I0.i.e(abstractC0025a, "instance");
            int i3 = f2.f1837a;
            int i4 = 0;
            while (true) {
                objArr = f2.f1838b;
                if (i4 < i3) {
                    if (objArr[i4] == abstractC0025a) {
                        throw new IllegalStateException("Already in the pool!");
                    }
                    i4++;
                }
            }
            int i5 = f2.f1837a;
            if (i5 < objArr.length) {
                objArr[i5] = abstractC0025a;
                f2.f1837a = i5 + 1;
            }
        }
        arrayList.clear();
    }

    public void N(p030q0.k kVar) {
        ((p030q0.f) this.f477g).f((String) this.f476f, new Q(this, kVar, 23, false));
    }

    public void a() {
        ImageView imageView = (ImageView) this.f477g;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0127y.b(drawable);
        }
        if (drawable != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 <= 21 && i2 == 21) {
                if (((j0) this.f478h) == null) {
                    this.f478h = new j0();
                }
                j0 j0Var = (j0) this.f478h;
                j0Var.f2681a = null;
                j0Var.f2684d = false;
                j0Var.f2682b = null;
                j0Var.f2683c = false;
                ColorStateList colorStateListA = D.f.a(imageView);
                if (colorStateListA != null) {
                    j0Var.f2684d = true;
                    j0Var.f2681a = colorStateListA;
                }
                PorterDuff.Mode modeB = D.f.b(imageView);
                if (modeB != null) {
                    j0Var.f2683c = true;
                    j0Var.f2682b = modeB;
                }
                if (j0Var.f2684d || j0Var.f2683c) {
                    C0118o.c(drawable, j0Var, imageView.getDrawableState());
                    return;
                }
            }
            j0 j0Var2 = (j0) this.f476f;
            if (j0Var2 != null) {
                C0118o.c(drawable, j0Var2, imageView.getDrawableState());
            }
        }
    }

    @Override // p037u0.InterfaceC0135g
    public Boolean b(String str, C0136h c0136h) {
        SharedPreferences sharedPreferencesT = t(c0136h);
        if (sharedPreferencesT.contains(str)) {
            return Boolean.valueOf(sharedPreferencesT.getBoolean(str, true));
        }
        return null;
    }

    @Override // p037u0.InterfaceC0135g
    public String c(String str, C0136h c0136h) {
        SharedPreferences sharedPreferencesT = t(c0136h);
        if (sharedPreferencesT.contains(str)) {
            return sharedPreferencesT.getString(str, "");
        }
        return null;
    }

    @Override // p037u0.InterfaceC0135g
    public void d(String str, boolean z2, C0136h c0136h) {
        t(c0136h).edit().putBoolean(str, z2).apply();
    }

    @Override // p037u0.InterfaceC0135g
    public void e(String str, double d2, C0136h c0136h) {
        t(c0136h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d2).apply();
    }

    @Override // p037u0.InterfaceC0135g
    public void f(String str, String str2, C0136h c0136h) {
        t(c0136h).edit().putString(str, str2).apply();
    }

    @Override // T0.d
    public Object g(T0.e eVar, z0.d dVar) {
        Object objG = ((T0.d) this.f477g).g(new T0.l(eVar, (J.d) this.f476f, (p037u0.J) this.f478h), dVar);
        return objG == A0.a.f0e ? objG : p041x0.g.f3419a;
    }

    @Override // p037u0.InterfaceC0135g
    public List h(List list, C0136h c0136h) {
        Map<String, ?> all = t(c0136h).getAll();
        I0.i.d(all, "preferences.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            I0.i.d(key, "it.key");
            if (p037u0.K.b(key, entry.getValue(), list != null ? p043y0.d.U(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return p043y0.d.T(linkedHashMap.keySet());
    }

    @Override // p037u0.InterfaceC0135g
    public Long i(String str, C0136h c0136h) {
        long j2;
        SharedPreferences sharedPreferencesT = t(c0136h);
        if (!sharedPreferencesT.contains(str)) {
            return null;
        }
        try {
            j2 = sharedPreferencesT.getLong(str, 0L);
        } catch (ClassCastException unused) {
            j2 = sharedPreferencesT.getInt(str, 0);
        }
        return Long.valueOf(j2);
    }

    @Override // p037u0.InterfaceC0135g
    public void j(String str, String str2, C0136h c0136h) {
        t(c0136h).edit().putString(str, str2).apply();
    }

    @Override // p037u0.InterfaceC0135g
    public p037u0.N k(String str, C0136h c0136h) {
        SharedPreferences sharedPreferencesT = t(c0136h);
        if (!sharedPreferencesT.contains(str)) {
            return null;
        }
        String string = sharedPreferencesT.getString(str, "");
        I0.i.b(string);
        if (string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new p037u0.N(string, p037u0.L.f3118g);
        }
        return string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new p037u0.N(null, p037u0.L.f3117f) : new p037u0.N(null, p037u0.L.f3119h);
    }

    @Override // p037u0.InterfaceC0135g
    public Double l(String str, C0136h c0136h) {
        SharedPreferences sharedPreferencesT = t(c0136h);
        if (!sharedPreferencesT.contains(str)) {
            return null;
        }
        Object objC = p037u0.K.c(sharedPreferencesT.getString(str, ""), (H.a) this.f478h);
        I0.i.c(objC, "null cannot be cast to non-null type kotlin.Double");
        return (Double) objC;
    }

    @Override // p037u0.InterfaceC0135g
    public void m(String str, List list, C0136h c0136h) {
        t(c0136h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((H.a) this.f478h).f(list))).apply();
    }

    @Override // p037u0.InterfaceC0135g
    public Map n(List list, C0136h c0136h) {
        Object value;
        Map<String, ?> all = t(c0136h).getAll();
        I0.i.d(all, "preferences.all");
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (p037u0.K.b(entry.getKey(), entry.getValue(), list != null ? p043y0.d.U(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object objC = p037u0.K.c(value, (H.a) this.f478h);
                I0.i.c(objC, "null cannot be cast to non-null type kotlin.Any");
                map.put(key, objC);
            }
        }
        return map;
    }

    @Override // p037u0.InterfaceC0135g
    public void o(String str, long j2, C0136h c0136h) {
        t(c0136h).edit().putLong(str, j2).apply();
    }

    @Override // p037u0.InterfaceC0135g
    public void p(List list, C0136h c0136h) {
        SharedPreferences sharedPreferencesT = t(c0136h);
        SharedPreferences.Editor editorEdit = sharedPreferencesT.edit();
        I0.i.d(editorEdit, "preferences.edit()");
        Map<String, ?> all = sharedPreferencesT.getAll();
        I0.i.d(all, "preferences.all");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (p037u0.K.b(str, all.get(str), list != null ? p043y0.d.U(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
    }

    @Override // p037u0.InterfaceC0135g
    public ArrayList r(String str, C0136h c0136h) {
        List list;
        SharedPreferences sharedPreferencesT = t(c0136h);
        ArrayList arrayList = null;
        if (sharedPreferencesT.contains(str)) {
            String string = sharedPreferencesT.getString(str, "");
            I0.i.b(string);
            if (string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && (list = (List) p037u0.K.c(sharedPreferencesT.getString(str, ""), (H.a) this.f478h)) != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    public void s(Activity activity) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f476f;
        reentrantLock.lock();
        try {
            ((WeakHashMap) this.f478h).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public SharedPreferences t(C0136h c0136h) {
        String str = c0136h.f3136a;
        Context context = (Context) this.f476f;
        if (str != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            I0.i.d(sharedPreferences, "{\n      context.getShare…ntext.MODE_PRIVATE)\n    }");
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        I0.i.d(sharedPreferences2, "{\n      PreferenceManage…references(context)\n    }");
        return sharedPreferences2;
    }

    public String toString() {
        switch (this.f475e) {
            case 1:
                return ((C0027c) this.f478h).toString() + ", hidden list:" + ((ArrayList) this.f476f).size();
            default:
                return super.toString();
        }
    }

    public void u(int i2, io.flutter.view.e eVar) {
        ((FlutterJNI) this.f476f).dispatchSemanticsAction(i2, eVar);
    }

    public void v(int i2, io.flutter.view.e eVar, Serializable serializable) {
        ((FlutterJNI) this.f476f).dispatchSemanticsAction(i2, eVar, serializable);
    }

    public int w(int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f478h;
        int size = arrayList.size();
        while (i3 < size) {
            ((AbstractC0025a) arrayList.get(i3)).getClass();
            i3++;
        }
        return i2;
    }

    public ColorStateList x(int i2) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = (TypedArray) this.f476f;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListB = p006d.b.b((Context) this.f477g, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListB;
    }

    public Drawable y(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f476f;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : p006d.b.c((Context) this.f477g, resourceId);
    }

    public Typeface z(int i2, int i3, C0121s c0121s) {
        int i4 = 1;
        int resourceId = ((TypedArray) this.f476f).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f478h) == null) {
            this.f478h = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f478h;
        ThreadLocal threadLocal = p029q.n.f3007a;
        Context context = (Context) this.f477g;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            c0121s.a();
            return null;
        }
        int i5 = typedValue.assetCookie;
        p022m.d dVar = p031r.e.f3043b;
        Typeface typeface = (Typeface) dVar.a(p031r.e.b(resources, resourceId, string, i5, i3));
        if (typeface != null) {
            new Handler(Looper.getMainLooper()).post(new L.h(i4, c0121s, typeface));
            return typeface;
        }
        try {
            if (string.toLowerCase().endsWith(".xml")) {
                p029q.f fVarI = p029q.b.i(resources.getXml(resourceId), resources);
                if (fVarI != null) {
                    return p031r.e.a(context, fVarI, resources, resourceId, string, typedValue.assetCookie, i3, c0121s);
                }
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                c0121s.a();
                return null;
            }
            int i6 = typedValue.assetCookie;
            Typeface typefaceJ = p031r.e.f3042a.j(context, resources, resourceId, string, i3);
            if (typefaceJ != null) {
                dVar.b(p031r.e.b(resources, resourceId, string, i6, i3), typefaceJ);
            }
            if (typefaceJ != null) {
                new Handler(Looper.getMainLooper()).post(new L.h(i4, c0121s, typefaceJ));
            } else {
                c0121s.a();
            }
            return typefaceJ;
        } catch (IOException e2) {
            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e2);
            c0121s.a();
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e3);
            c0121s.a();
            return null;
        }
    }

    public C0026b(int i2) {
        this.f475e = i2;
        switch (i2) {
            case I.k.LONG_FIELD_NUMBER /* 4 */:
                break;
            case 9:
                this.f477g = new ConcurrentLinkedQueue();
                break;
            default:
                H.a aVar = new H.a(14);
                H.a aVar2 = new H.a(13);
                this.f477g = new HashSet();
                this.f476f = aVar;
                this.f478h = aVar2;
                break;
        }
    }

    public C0026b(ImageView imageView) {
        this.f475e = 6;
        this.f477g = imageView;
    }

    public C0026b(D.j jVar) {
        this.f475e = 1;
        this.f477g = jVar;
        this.f478h = new C0027c();
        this.f476f = new ArrayList();
    }

    public C0026b(Context context, TypedArray typedArray) {
        this.f475e = 7;
        this.f477g = context;
        this.f476f = typedArray;
    }

    public C0026b(H.a aVar) {
        this.f475e = 0;
        this.f477g = new p011g0.F(30);
        this.f476f = new ArrayList();
        this.f478h = new ArrayList();
        new H.a(8, this);
    }

    public C0026b(p015i0.b bVar, FlutterJNI flutterJNI) {
        this.f475e = 8;
        D.j jVar = new D.j(29, this);
        C0013n c0013n = new C0013n(bVar, "flutter/accessibility", p030q0.n.f3028a, (Object) null);
        this.f477g = c0013n;
        c0013n.g(jVar);
        this.f476f = flutterJNI;
    }

    public C0026b(p011g0.C c2) {
        this.f475e = 5;
        this.f476f = new HashSet();
        this.f478h = c2;
        p011g0.q qVar = (p011g0.q) c2;
        this.f477g = new p011g0.B[]{new p011g0.y(qVar.getBinaryMessenger()), new Q(new p028p0.c(qVar.getBinaryMessenger()))};
        new p028p0.b(qVar.getBinaryMessenger()).f2896f = this;
    }

    public C0026b(p030q0.f fVar, Context context, H.a aVar) {
        this.f475e = 11;
        I0.i.e(fVar, "messenger");
        I0.i.e(context, "context");
        this.f477g = fVar;
        this.f476f = context;
        this.f478h = aVar;
        try {
            InterfaceC0135g.f3135d.getClass();
            C0134f.b(fVar, this, "shared_preferences");
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e2);
        }
    }

    public C0026b(D.j jVar, byte b2) {
        this.f475e = 2;
        this.f477g = jVar;
        this.f476f = new ReentrantLock();
        this.f478h = new WeakHashMap();
    }
}
