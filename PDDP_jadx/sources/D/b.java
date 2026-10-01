package D;

import N.C0028d;
import N.C0032h;
import N.v;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import p016j.A;
import p016j.C0112i;
import p042y.x;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f23f;

    public /* synthetic */ b(int i2, Object obj) {
        this.f22e = i2;
        this.f23f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0112i c0112i;
        Object obj = this.f23f;
        switch (this.f22e) {
            case 0:
                g gVar = (g) obj;
                if (gVar.f40o) {
                    boolean z2 = gVar.f38m;
                    a aVar = gVar.f26a;
                    if (z2) {
                        gVar.f38m = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f17e = jCurrentAnimationTimeMillis;
                        aVar.f19g = -1L;
                        aVar.f18f = jCurrentAnimationTimeMillis;
                        aVar.f20h = 0.5f;
                    }
                    if ((aVar.f19g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f19g + ((long) aVar.f21i)) || !gVar.e()) {
                        gVar.f40o = false;
                        return;
                    }
                    boolean z3 = gVar.f39n;
                    ListView listView = gVar.f28c;
                    if (z3) {
                        gVar.f39n = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f18f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j2 = jCurrentAnimationTimeMillis2 - aVar.f18f;
                    aVar.f18f = jCurrentAnimationTimeMillis2;
                    gVar.f42q.scrollListBy((int) (j2 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.f16d));
                    Field field = x.f3474a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                C0032h c0032h = (C0032h) obj;
                int i2 = c0032h.f517v;
                ValueAnimator valueAnimator = c0032h.f516u;
                if (i2 == 1) {
                    valueAnimator.cancel();
                } else if (i2 != 2) {
                    return;
                }
                c0032h.f517v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 2:
                v vVar = ((RecyclerView) obj).f1650H;
                if (vVar != null) {
                    C0028d c0028d = (C0028d) vVar;
                    ArrayList arrayList = c0028d.f481e;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0028d.f483g;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0028d.f484h;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0028d.f482f;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList.clear();
                    if (!zIsEmpty2) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.addAll(arrayList2);
                        ArrayList arrayList6 = c0028d.f486j;
                        arrayList6.add(arrayList5);
                        arrayList2.clear();
                        if (!zIsEmpty) {
                            I0.h.g(arrayList5.get(0));
                            throw null;
                        }
                        Iterator it2 = arrayList5.iterator();
                        if (it2.hasNext()) {
                            I0.h.g(it2.next());
                            throw null;
                        }
                        arrayList5.clear();
                        arrayList6.remove(arrayList5);
                    }
                    if (!zIsEmpty3) {
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.addAll(arrayList3);
                        ArrayList arrayList8 = c0028d.f487k;
                        arrayList8.add(arrayList7);
                        arrayList3.clear();
                        if (!zIsEmpty) {
                            I0.h.g(arrayList7.get(0));
                            throw null;
                        }
                        Iterator it3 = arrayList7.iterator();
                        if (it3.hasNext()) {
                            I0.h.g(it3.next());
                            throw null;
                        }
                        arrayList7.clear();
                        arrayList8.remove(arrayList7);
                    }
                    if (zIsEmpty4) {
                        return;
                    }
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.addAll(arrayList4);
                    ArrayList arrayList10 = c0028d.f485i;
                    arrayList10.add(arrayList9);
                    arrayList4.clear();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty3) {
                        Math.max(!zIsEmpty2 ? c0028d.f548c : 0L, zIsEmpty3 ? 0L : c0028d.f549d);
                        arrayList9.get(0).getClass();
                        throw new ClassCastException();
                    }
                    Iterator it4 = arrayList9.iterator();
                    if (it4.hasNext()) {
                        it4.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList9.clear();
                    arrayList10.remove(arrayList9);
                    return;
                }
                return;
            case 3:
                ((StaggeredGridLayoutManager) obj).J();
                return;
            case I.k.LONG_FIELD_NUMBER /* 4 */:
                p007e.e eVar = (p007e.e) obj;
                eVar.a(true);
                eVar.invalidateSelf();
                return;
            case I.k.STRING_FIELD_NUMBER /* 5 */:
                A a2 = (A) obj;
                a2.f2535q = null;
                a2.drawableStateChanged();
                return;
            case I.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ActionMenuView actionMenuView = ((Toolbar) obj).f1339e;
                if (actionMenuView == null || (c0112i = actionMenuView.f1228w) == null) {
                    return;
                }
                c0112i.k();
                return;
            default:
                Object obj2 = ((p028p0.b) obj).f2896f;
                return;
        }
    }

    public b(p028p0.b bVar, int i2) {
        this.f22e = 7;
        this.f23f = bVar;
    }
}
