package io.flutter.plugin.editing;

import G.C0013n;
import N.C0026b;
import N.C0038n;
import N.Q;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import p028p0.o;
import p028p0.q;

/* JADX INFO: loaded from: classes.dex */
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f2292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputMethodManager f2293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AutofillManager f2294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q f2295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0038n f2296e = new C0038n(1, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f2297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SparseArray f2298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f2299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InputConnection f2301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final io.flutter.plugin.platform.o f2302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Rect f2303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f2304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q f2305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2306o;

    public j(View view, Q q2, p028p0.b bVar, io.flutter.plugin.platform.o oVar) {
        this.f2292a = view;
        this.f2299h = new e(null, view);
        this.f2293b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f2294c = T.d.f(view.getContext().getSystemService(T.d.l()));
        } else {
            this.f2294c = null;
        }
        if (i2 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f2304m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f2295d = q2;
        q2.f472g = new D.j(25, this);
        ((C0026b) q2.f471f).F("TextInputClient.requestExistingInputState", null, null);
        this.f2302k = oVar;
        oVar.f2347f = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r10 == r0.f2976e) goto L38;
     */
    @Override // io.flutter.plugin.editing.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r17) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.j.a(boolean):void");
    }

    public final void b(int i2) {
        C0038n c0038n = this.f2296e;
        int i3 = c0038n.f534b;
        if ((i3 == 3 || i3 == 4) && c0038n.f535c == i2) {
            this.f2296e = new C0038n(1, 0);
            d();
            View view = this.f2292a;
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            InputMethodManager inputMethodManager = this.f2293b;
            inputMethodManager.hideSoftInputFromWindow(applicationWindowToken, 0);
            inputMethodManager.restartInput(view);
            this.f2300i = false;
        }
    }

    public final void c() {
        this.f2302k.f2347f = null;
        this.f2295d.f472g = null;
        d();
        this.f2299h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f2304m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void d() {
        AutofillManager autofillManager;
        o oVar;
        C0013n c0013n;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f2294c) == null || (oVar = this.f2297f) == null || (c0013n = oVar.f2966j) == null || this.f2298g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f2292a, ((String) c0013n.f258a).hashCode());
    }

    public final void e(o oVar) {
        C0013n c0013n;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (oVar == null || (c0013n = oVar.f2966j) == null) {
            this.f2298g = null;
            return;
        }
        SparseArray sparseArray = new SparseArray();
        this.f2298g = sparseArray;
        o[] oVarArr = oVar.f2968l;
        if (oVarArr == null) {
            sparseArray.put(((String) c0013n.f258a).hashCode(), oVar);
            return;
        }
        for (o oVar2 : oVarArr) {
            C0013n c0013n2 = oVar2.f2966j;
            if (c0013n2 != null) {
                SparseArray sparseArray2 = this.f2298g;
                String str = (String) c0013n2.f258a;
                sparseArray2.put(str.hashCode(), oVar2);
                this.f2294c.notifyValueChanged(this.f2292a, str.hashCode(), AutofillValue.forText(((q) c0013n2.f260c).f2972a));
            }
        }
    }
}
