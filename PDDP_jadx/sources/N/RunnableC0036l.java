package N;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: N.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0036l implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f527i = new ThreadLocal();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0033i f528j = new C0033i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f532h;

    public final void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.f1688q && this.f530f == 0) {
            this.f530f = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0034j c0034j = recyclerView.f1666a0;
        c0034j.f519a = i2;
        c0034j.f520b = i3;
    }

    public final void b(long j2) {
        C0035k c0035k;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f529e;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i3);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0034j c0034j = recyclerView2.f1666a0;
                c0034j.f521c = 0;
                i2 += c0034j.f521c;
            }
        }
        ArrayList arrayList2 = this.f532h;
        arrayList2.ensureCapacity(i2);
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i4);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0034j c0034j2 = recyclerView3.f1666a0;
                Math.abs(c0034j2.f519a);
                Math.abs(c0034j2.f520b);
                if (c0034j2.f521c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new C0035k());
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList2, f528j);
        if (arrayList2.size() <= 0 || (recyclerView = (c0035k = (C0035k) arrayList2.get(0)).f525d) == null) {
            return;
        }
        int i5 = c0035k.f526e;
        if (recyclerView.f1675h.B() > 0) {
            RecyclerView.j(recyclerView.f1675h.A(0));
            throw null;
        }
        D d2 = recyclerView.f1669e;
        try {
            recyclerView.f1643A++;
            d2.d(i5);
            throw null;
        } catch (Throwable th) {
            int i6 = recyclerView.f1643A - 1;
            recyclerView.f1643A = i6;
            if (i6 < 1) {
                recyclerView.f1643A = 0;
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = p036u.b.f3078a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f529e;
            if (arrayList.isEmpty()) {
                this.f530f = 0L;
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i3 = 0; i3 < size; i3++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i3);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f530f = 0L;
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f531g);
                this.f530f = 0L;
            }
        } finally {
            this.f530f = 0L;
            int i4 = p036u.b.f3078a;
            Trace.endSection();
        }
    }
}
