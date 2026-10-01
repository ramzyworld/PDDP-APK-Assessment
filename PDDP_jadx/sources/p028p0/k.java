package p028p0;

import N.C0026b;
import N.Q;
import android.util.Log;
import p015i0.g;
import p030q0.l;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2945c;

    public /* synthetic */ k(int i2, Object obj, Object obj2) {
        this.f2943a = i2;
        this.f2945c = obj;
        this.f2944b = obj2;
    }

    public final void a(String str, String str2, Object obj) {
        switch (this.f2943a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((g) this.f2944b).a(((l) ((C0026b) ((Q) this.f2945c).f472g).f478h).f(str, str2, obj));
                break;
        }
    }

    public void b() {
        ((g) this.f2944b).a(null);
    }

    public final void c(Object obj) {
        switch (this.f2943a) {
            case 0:
                ((l) this.f2945c).f2947b = (byte[]) this.f2944b;
                break;
            default:
                ((g) this.f2944b).a(((l) ((C0026b) ((Q) this.f2945c).f472g).f478h).a(obj));
                break;
        }
    }
}
