package io.flutter.plugin.editing;

import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import p028p0.q;

/* JADX INFO: loaded from: classes.dex */
public final class e extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2265a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2266b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2267c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2268d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f2269e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f2276l;

    public e(q qVar, View view) {
        this.f2276l = new c(view, this);
        if (qVar != null) {
            f(qVar);
        }
    }

    public final void a(d dVar) {
        if (this.f2266b > 0) {
            Log.e("ListenableEditingState", "adding a listener " + dVar.toString() + " in a listener callback");
        }
        if (this.f2265a <= 0) {
            this.f2267c.add(dVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f2268d.add(dVar);
        }
    }

    public final void b() {
        this.f2265a++;
        if (this.f2266b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f2265a != 1 || this.f2267c.isEmpty()) {
            return;
        }
        this.f2271g = toString();
        this.f2272h = Selection.getSelectionStart(this);
        this.f2273i = Selection.getSelectionEnd(this);
        this.f2274j = BaseInputConnection.getComposingSpanStart(this);
        this.f2275k = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i2 = this.f2265a;
        if (i2 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f2267c;
        ArrayList<d> arrayList2 = this.f2268d;
        if (i2 == 1) {
            for (d dVar : arrayList2) {
                this.f2266b++;
                dVar.a(true);
                this.f2266b--;
            }
            if (!arrayList.isEmpty()) {
                String.valueOf(arrayList.size());
                d(!toString().equals(this.f2271g), (this.f2272h == Selection.getSelectionStart(this) && this.f2273i == Selection.getSelectionEnd(this)) ? false : true, (this.f2274j == BaseInputConnection.getComposingSpanStart(this) && this.f2275k == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f2265a--;
    }

    public final void d(boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            for (d dVar : this.f2267c) {
                this.f2266b++;
                dVar.a(z2);
                this.f2266b--;
            }
        }
    }

    public final void e(d dVar) {
        if (this.f2266b > 0) {
            Log.e("ListenableEditingState", "removing a listener " + dVar.toString() + " in a listener callback");
        }
        this.f2267c.remove(dVar);
        if (this.f2265a > 0) {
            this.f2268d.remove(dVar);
        }
    }

    public final void f(q qVar) {
        int i2;
        b();
        replace(0, length(), (CharSequence) qVar.f2972a);
        int i3 = qVar.f2973b;
        if (i3 >= 0) {
            Selection.setSelection(this, i3, qVar.f2974c);
        } else {
            Selection.removeSelection(this);
        }
        int i4 = qVar.f2975d;
        if (i4 < 0 || i4 >= (i2 = qVar.f2976e)) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f2276l.setComposingRegion(i4, i2);
        }
        this.f2269e.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        super.setSpan(obj, i2, i3, i4);
        ArrayList arrayList = this.f2269e;
        String string = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f2285e = selectionStart;
        hVar.f2286f = selectionEnd;
        hVar.f2287g = composingSpanStart;
        hVar.f2288h = composingSpanEnd;
        hVar.f2281a = string;
        hVar.f2282b = "";
        hVar.f2283c = -1;
        hVar.f2284d = -1;
        arrayList.add(hVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f2270f;
        if (str != null) {
            return str;
        }
        String string = super.toString();
        this.f2270f = string;
        return string;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        if (this.f2266b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String string = toString();
        int i6 = i3 - i2;
        boolean z2 = i6 != i5 - i4;
        for (int i7 = 0; i7 < i6 && !z2; i7++) {
            z2 |= charAt(i2 + i7) != charSequence.charAt(i4 + i7);
        }
        if (z2) {
            this.f2270f = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder spannableStringBuilderReplace = super.replace(i2, i3, charSequence, i4, i5);
        ArrayList arrayList = this.f2269e;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f2285e = selectionStart2;
        hVar.f2286f = selectionEnd2;
        hVar.f2287g = composingSpanStart2;
        hVar.f2288h = composingSpanEnd2;
        String string2 = charSequence.toString();
        hVar.f2281a = string;
        hVar.f2282b = string2;
        hVar.f2283c = i2;
        hVar.f2284d = i3;
        arrayList.add(hVar);
        if (this.f2265a > 0) {
            return spannableStringBuilderReplace;
        }
        d(z2, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return spannableStringBuilderReplace;
    }
}
