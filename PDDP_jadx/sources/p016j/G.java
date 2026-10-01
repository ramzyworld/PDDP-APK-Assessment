package p016j;

import java.lang.reflect.Field;
import p042y.x;

/* JADX INFO: loaded from: classes.dex */
public final class G implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ J f2558f;

    public /* synthetic */ G(J j2, int i2) {
        this.f2557e = i2;
        this.f2558f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J j2 = this.f2558f;
        switch (this.f2557e) {
            case 0:
                L l2 = j2.f2566g;
                if (l2 != null) {
                    l2.setListSelectionHidden(true);
                    l2.requestLayout();
                }
                break;
            default:
                L l3 = j2.f2566g;
                if (l3 != null) {
                    Field field = x.f3474a;
                    if (l3.isAttachedToWindow() && j2.f2566g.getCount() > j2.f2566g.getChildCount() && j2.f2566g.getChildCount() <= Integer.MAX_VALUE) {
                        j2.f2584z.setInputMethodMode(2);
                        j2.c();
                        break;
                    }
                }
                break;
        }
    }
}
