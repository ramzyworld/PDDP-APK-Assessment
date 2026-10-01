package androidx.appcompat.view.menu;

import N.C0026b;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p014i.i;
import p014i.k;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements i, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f1162e = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0026b c0026bI = C0026b.I(context, attributeSet, f1162e, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c0026bI.f476f;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c0026bI.y(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c0026bI.y(1));
        }
        c0026bI.L();
    }

    @Override // p014i.i
    public final boolean a(k kVar) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        throw null;
    }
}
