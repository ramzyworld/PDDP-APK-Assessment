package p016j;

import android.content.Context;
import android.view.View;
import com.deeprf.pddp.R;
import p014i.j;
import p014i.l;
import p014i.n;
import p014i.t;

/* JADX INFO: renamed from: j.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0109f extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2632l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0112i f2633m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0109f(C0112i c0112i, Context context, j jVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, jVar, true);
        this.f2633m = c0112i;
        this.f2129f = 8388613;
        D.j jVar2 = c0112i.f2679z;
        this.f2131h = jVar2;
        l lVar = this.f2132i;
        if (lVar != null) {
            lVar.f(jVar2);
        }
    }

    @Override // p014i.n
    public final void c() {
        switch (this.f2632l) {
            case 0:
                C0112i c0112i = this.f2633m;
                c0112i.f2676w = null;
                c0112i.getClass();
                super.c();
                break;
            default:
                C0112i c0112i2 = this.f2633m;
                j jVar = c0112i2.f2661g;
                if (jVar != null) {
                    jVar.c(true);
                }
                c0112i2.f2675v = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0109f(C0112i c0112i, Context context, t tVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, tVar, false);
        this.f2633m = c0112i;
        if (!tVar.f2154w.d()) {
            View view2 = c0112i.f2666l;
            this.f2128e = view2 == null ? c0112i.f2665k : view2;
        }
        D.j jVar = c0112i.f2679z;
        this.f2131h = jVar;
        l lVar = this.f2132i;
        if (lVar != null) {
            lVar.f(jVar);
        }
    }
}
