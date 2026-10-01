package p030q0;

import G.C0013n;
import N.C0026b;
import android.util.Log;
import java.nio.ByteBuffer;
import p028p0.k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3023c;

    public /* synthetic */ a(int i2, Object obj, Object obj2) {
        this.f3021a = i2;
        this.f3023c = obj;
        this.f3022b = obj2;
    }

    @Override // p030q0.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f3021a) {
            case 0:
                C0013n c0013n = (C0013n) this.f3023c;
                try {
                    ((c) this.f3022b).b(((j) c0013n.f260c).a(byteBuffer));
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) c0013n.f259b), "Failed to handle message reply", e2);
                    return;
                }
                break;
            default:
                C0026b c0026b = (C0026b) this.f3023c;
                k kVar = (k) this.f3022b;
                try {
                    if (byteBuffer == null) {
                        kVar.getClass();
                    } else {
                        try {
                            kVar.c(((l) c0026b.f478h).c(byteBuffer));
                        } catch (g e3) {
                            kVar.a(e3.f3024e, e3.getMessage(), e3.f3025f);
                        }
                    }
                } catch (RuntimeException e4) {
                    Log.e("MethodChannel#".concat((String) c0026b.f476f), "Failed to handle method call result", e4);
                    return;
                }
                break;
        }
    }
}
