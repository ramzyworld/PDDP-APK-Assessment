package p016j;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class F implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2556f;

    public /* synthetic */ F(int i2, Object obj) {
        this.f2555e = i2;
        this.f2556f = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        L l2;
        switch (this.f2555e) {
            case 0:
                if (i2 != -1 && (l2 = ((J) this.f2556f).f2566g) != null) {
                    l2.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f2556f).m(i2);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i2 = this.f2555e;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
