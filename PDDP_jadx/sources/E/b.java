package E;

import android.database.DataSetObserver;
import p016j.J;
import p016j.f0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f57b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f56a = i2;
        this.f57b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f56a) {
            case 0:
                f0 f0Var = (f0) this.f57b;
                f0Var.f58e = true;
                f0Var.notifyDataSetChanged();
                break;
            default:
                J j2 = (J) this.f57b;
                if (j2.f2584z.isShowing()) {
                    j2.c();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f56a) {
            case 0:
                f0 f0Var = (f0) this.f57b;
                f0Var.f58e = false;
                f0Var.notifyDataSetInvalidated();
                break;
            default:
                ((J) this.f57b).dismiss();
                break;
        }
    }
}
