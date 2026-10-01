package p007e;

import Q.e;
import android.graphics.drawable.Animatable;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p000a.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Animatable f1765f;

    public /* synthetic */ a(Animatable animatable, int i2) {
        this.f1764e = i2;
        this.f1765f = animatable;
    }

    @Override // p000a.a
    public final void L() {
        switch (this.f1764e) {
            case 0:
                this.f1765f.start();
                break;
            default:
                ((e) this.f1765f).start();
                break;
        }
    }

    @Override // p000a.a
    public final void N() {
        switch (this.f1764e) {
            case 0:
                this.f1765f.stop();
                break;
            default:
                ((e) this.f1765f).stop();
                break;
        }
    }
}
