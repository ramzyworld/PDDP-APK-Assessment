package p016j;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import p014i.k;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2691e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2692f;

    public l0(q0 q0Var) {
        this.f2692f = q0Var;
        q0Var.f2716a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2691e) {
            case 0:
                m0 m0Var = ((Toolbar) this.f2692f).f1336M;
                k kVar = m0Var == null ? null : m0Var.f2697f;
                if (kVar != null) {
                    kVar.collapseActionView();
                }
                break;
            default:
                q0 q0Var = (q0) this.f2692f;
                if (q0Var.f2726k != null) {
                    q0Var.getClass();
                }
                break;
        }
    }

    public l0(Toolbar toolbar) {
        this.f2692f = toolbar;
    }
}
