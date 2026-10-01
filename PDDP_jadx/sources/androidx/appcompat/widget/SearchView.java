package androidx.appcompat.widget;

import B0.e;
import N.C0026b;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.deeprf.pddp.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p016j.AbstractC0116m;
import p016j.E;
import p016j.F;
import p016j.T;
import p016j.U;
import p016j.V;
import p016j.W;
import p016j.X;
import p016j.Y;
import p016j.Z;
import p016j.a0;
import p016j.b0;
import p016j.c0;
import p016j.d0;
import p016j.f0;
import p042y.x;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends E implements p012h.a {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final e f1242k0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ImageView f1243A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final View f1244B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public d0 f1245C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Rect f1246D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Rect f1247E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int[] f1248F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int[] f1249G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ImageView f1250H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Drawable f1251I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f1252J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f1253K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Intent f1254L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Intent f1255M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final CharSequence f1256N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public View.OnFocusChangeListener f1257O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public View.OnClickListener f1258P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f1259Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f1260R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public E.c f1261S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f1262T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public CharSequence f1263U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f1264V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f1265W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f1266a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f1267b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public CharSequence f1268c0;
    public boolean d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f1269e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public SearchableInfo f1270f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Bundle f1271g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final U f1272h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final U f1273i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final WeakHashMap f1274j0;
    public final SearchAutoComplete t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final View f1275u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f1276v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f1277w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f1278x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImageView f1279y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ImageView f1280z;

    public static class SearchAutoComplete extends AbstractC0116m {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1281h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public SearchView f1282i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f1283j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final c f1284k;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1284k = new c(this);
            this.f1281h = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f1281h <= 0 || super.enoughToFilter();
        }

        @Override // p016j.AbstractC0116m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1283j) {
                c cVar = this.f1284k;
                removeCallbacks(cVar);
                post(cVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z2, int i2, Rect rect) {
            super.onFocusChanged(z2, i2, rect);
            SearchView searchView = this.f1282i;
            searchView.u(searchView.f1260R);
            searchView.post(searchView.f1272h0);
            if (searchView.t.hasFocus()) {
                searchView.j();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1282i.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z2) {
            Method method;
            super.onWindowFocusChanged(z2);
            if (z2 && this.f1282i.hasFocus() && getVisibility() == 0) {
                this.f1283j = true;
                Context context = getContext();
                e eVar = SearchView.f1242k0;
                if (context.getResources().getConfiguration().orientation != 2 || (method = SearchView.f1242k0.f8c) == null) {
                    return;
                }
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            c cVar = this.f1284k;
            if (!z2) {
                this.f1283j = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1283j = true;
                    return;
                }
                this.f1283j = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1282i = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f1281h = i2;
        }
    }

    static {
        e eVar = new e();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
            eVar.f6a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
            eVar.f7b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            eVar.f8c = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
        f1242k0 = eVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.t;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f1265W = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.t;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f1265W = false;
    }

    public int getImeOptions() {
        return this.t.getImeOptions();
    }

    public int getInputType() {
        return this.t.getInputType();
    }

    public int getMaxWidth() {
        return this.f1266a0;
    }

    public CharSequence getQuery() {
        return this.t.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1263U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1270f0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1256N : getContext().getText(this.f1270f0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f1253K;
    }

    public int getSuggestionRowLayout() {
        return this.f1252J;
    }

    public E.c getSuggestionsAdapter() {
        return this.f1261S;
    }

    public final Intent h(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1268c0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1271g0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1270f0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1271g0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void j() {
        int i2 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.t;
        if (i2 >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        e eVar = f1242k0;
        Method method = eVar.f6a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        Method method2 = eVar.f7b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.t;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f1259Q) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i2) {
        int position;
        String strH;
        Cursor cursor = this.f1261S.f60g;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intentH = null;
            try {
                int i3 = f0.f2634C;
                String strH2 = f0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strH2 == null) {
                    strH2 = this.f1270f0.getSuggestIntentAction();
                }
                if (strH2 == null) {
                    strH2 = "android.intent.action.SEARCH";
                }
                String strH3 = f0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strH3 == null) {
                    strH3 = this.f1270f0.getSuggestIntentData();
                }
                if (strH3 != null && (strH = f0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strH3 = strH3 + "/" + Uri.encode(strH);
                }
                intentH = h(strH2, strH3 == null ? null : Uri.parse(strH3), f0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), f0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e2) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e2);
            }
            if (intentH != null) {
                try {
                    getContext().startActivity(intentH);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intentH, e3);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.t;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i2) {
        Editable text = this.t.getText();
        Cursor cursor = this.f1261S.f60g;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        String strC = this.f1261S.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.t;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f1270f0 != null) {
            getContext().startActivity(h("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1272h0);
        post(this.f1273i0);
        super.onDetachedFromWindow();
    }

    @Override // p016j.E, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            int[] iArr = this.f1248F;
            SearchAutoComplete searchAutoComplete = this.t;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f1249G;
            getLocationInWindow(iArr2);
            int i6 = iArr[1] - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i7;
            int height = searchAutoComplete.getHeight() + i6;
            Rect rect = this.f1246D;
            rect.set(i7, i6, width, height);
            int i8 = rect.left;
            int i9 = rect.right;
            int i10 = i5 - i3;
            Rect rect2 = this.f1247E;
            rect2.set(i8, 0, i9, i10);
            d0 d0Var = this.f1245C;
            if (d0Var == null) {
                d0 d0Var2 = new d0(rect2, rect, searchAutoComplete);
                this.f1245C = d0Var2;
                setTouchDelegate(d0Var2);
            } else {
                d0Var.f2622b.set(rect2);
                Rect rect3 = d0Var.f2624d;
                rect3.set(rect2);
                int i11 = -d0Var.f2625e;
                rect3.inset(i11, i11);
                d0Var.f2623c.set(rect);
            }
        }
    }

    @Override // p016j.E, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f1260R) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.f1266a0;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1266a0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.f1266a0) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c0 c0Var = (c0) parcelable;
        super.onRestoreInstanceState(c0Var.f70a);
        u(c0Var.f2620c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        c0 c0Var = new c0(super.onSaveInstanceState());
        c0Var.f2620c = this.f1260R;
        return c0Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.f1272h0);
    }

    public final void p() {
        boolean zIsEmpty = TextUtils.isEmpty(this.t.getText());
        int i2 = (!zIsEmpty || (this.f1259Q && !this.d0)) ? 0 : 8;
        ImageView imageView = this.f1280z;
        imageView.setVisibility(i2);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.t.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1276v.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1277w.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z2 = this.f1259Q;
        SearchAutoComplete searchAutoComplete = this.t;
        CharSequence charSequence2 = charSequence;
        if (z2 && (drawable = this.f1251I) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        if (this.f1265W || !isFocusable()) {
            return false;
        }
        if (this.f1260R) {
            return super.requestFocus(i2, rect);
        }
        boolean zRequestFocus = this.t.requestFocus(i2, rect);
        if (zRequestFocus) {
            u(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        this.f1277w.setVisibility(((this.f1262T || this.f1267b0) && !this.f1260R && (this.f1279y.getVisibility() == 0 || this.f1243A.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1271g0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.t;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1258P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.f1259Q == z2) {
            return;
        }
        this.f1259Q = z2;
        u(z2);
        r();
    }

    public void setImeOptions(int i2) {
        this.t.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.t.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.f1266a0 = i2;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1257O = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1258P = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1263U = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.f1264V = z2;
        E.c cVar = this.f1261S;
        if (cVar instanceof f0) {
            ((f0) cVar).f2644u = z2 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1270f0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.t;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f1270f0.getImeOptions());
            int inputType = this.f1270f0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f1270f0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            E.c cVar = this.f1261S;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.f1270f0.getSuggestAuthority() != null) {
                f0 f0Var = new f0(getContext(), this, this.f1270f0, this.f1274j0);
                this.f1261S = f0Var;
                searchAutoComplete.setAdapter(f0Var);
                ((f0) this.f1261S).f2644u = this.f1264V ? 2 : 1;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.f1270f0;
        boolean z2 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f1270f0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f1254L;
            } else if (this.f1270f0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f1255M;
            }
            if (intent != null) {
                z2 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f1267b0 = z2;
        if (z2) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.f1260R);
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.f1262T = z2;
        u(this.f1260R);
    }

    public void setSuggestionsAdapter(E.c cVar) {
        this.f1261S = cVar;
        this.t.setAdapter(cVar);
    }

    public final void t(boolean z2) {
        boolean z3 = this.f1262T;
        this.f1279y.setVisibility((!z3 || !(z3 || this.f1267b0) || this.f1260R || !hasFocus() || (!z2 && this.f1267b0)) ? 8 : 0);
    }

    public final void u(boolean z2) {
        this.f1260R = z2;
        int i2 = 8;
        int i3 = z2 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.t.getText());
        this.f1278x.setVisibility(i3);
        t(!zIsEmpty);
        this.f1275u.setVisibility(z2 ? 8 : 0);
        ImageView imageView = this.f1250H;
        imageView.setVisibility((imageView.getDrawable() == null || this.f1259Q) ? 8 : 0);
        p();
        if (this.f1267b0 && !this.f1260R && zIsEmpty) {
            this.f1279y.setVisibility(8);
            i2 = 0;
        }
        this.f1243A.setVisibility(i2);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1246D = new Rect();
        this.f1247E = new Rect();
        this.f1248F = new int[2];
        this.f1249G = new int[2];
        this.f1272h0 = new U(this, 0);
        this.f1273i0 = new U(this, 1);
        this.f1274j0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        X x2 = new X(this);
        Y y2 = new Y(this);
        F f2 = new F(1, this);
        T t = new T(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p004c.a.f1753q, i2, 0);
        C0026b c0026b = new C0026b(context, typedArrayObtainStyledAttributes);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.t = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1275u = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f1276v = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f1277w = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f1278x = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f1279y = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f1280z = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f1243A = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f1250H = imageView5;
        Drawable drawableY = c0026b.y(10);
        Field field = x.f3474a;
        viewFindViewById.setBackground(drawableY);
        viewFindViewById2.setBackground(c0026b.y(14));
        imageView.setImageDrawable(c0026b.y(13));
        imageView2.setImageDrawable(c0026b.y(7));
        imageView3.setImageDrawable(c0026b.y(4));
        imageView4.setImageDrawable(c0026b.y(16));
        imageView5.setImageDrawable(c0026b.y(13));
        this.f1251I = c0026b.y(12);
        a1.a.B(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f1252J = typedArrayObtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f1253K = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(t);
        searchAutoComplete.setOnEditorActionListener(x2);
        searchAutoComplete.setOnItemClickListener(y2);
        searchAutoComplete.setOnItemSelectedListener(f2);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new V(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f1256N = typedArrayObtainStyledAttributes.getText(6);
        this.f1263U = typedArrayObtainStyledAttributes.getText(11);
        int i3 = typedArrayObtainStyledAttributes.getInt(3, -1);
        if (i3 != -1) {
            setImeOptions(i3);
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(2, -1);
        if (i4 != -1) {
            setInputType(i4);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(0, true));
        c0026b.L();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1254L = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1255M = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1244B = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new W(this));
        }
        u(this.f1259Q);
        r();
    }

    public void setOnCloseListener(Z z2) {
    }

    public void setOnQueryTextListener(a0 a0Var) {
    }

    public void setOnSuggestionListener(b0 b0Var) {
    }
}
