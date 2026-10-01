package N;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f458a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f459b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f460c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f462e;

    public O(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f462e = staggeredGridLayoutManager;
        this.f461d = i2;
    }

    public final int a(int i2) {
        int i3 = this.f460c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f458a.size() == 0) {
            return i2;
        }
        ArrayList arrayList = this.f458a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        L l2 = (L) view.getLayoutParams();
        this.f460c = this.f462e.f1699j.b(view);
        l2.getClass();
        return this.f460c;
    }
}
