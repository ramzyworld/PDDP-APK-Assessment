package E;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.k;
import p011g0.q;
import p016j.f0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f55b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Handler handler, int i2) {
        super(handler);
        this.f54a = i2;
        this.f55b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f54a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2, Uri uri) {
        switch (this.f54a) {
            case 2:
                k kVar = (k) this.f55b;
                if (!kVar.f2499u) {
                    if (Settings.Global.getFloat(kVar.f2485f, "transition_animation_scale", 1.0f) == 0.0f) {
                        kVar.f2491l |= 4;
                    } else {
                        kVar.f2491l &= -5;
                    }
                    ((FlutterJNI) kVar.f2481b.f476f).setAccessibilityFeatures(kVar.f2491l);
                    break;
                }
                break;
            default:
                super.onChange(z2, uri);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f0 f0Var) {
        super(new Handler());
        this.f54a = 0;
        this.f55b = f0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        Cursor cursor;
        switch (this.f54a) {
            case 0:
                f0 f0Var = (f0) this.f55b;
                if (f0Var.f59f && (cursor = f0Var.f60g) != null && !cursor.isClosed()) {
                    f0Var.f58e = f0Var.f60g.requery();
                    break;
                }
                break;
            case 1:
                super.onChange(z2);
                q qVar = (q) this.f55b;
                if (qVar.f1901l != null) {
                    qVar.d();
                    break;
                }
                break;
            default:
                onChange(z2, null);
                break;
        }
    }
}
