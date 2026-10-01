package p011g0;

import android.view.SurfaceHolder;
import io.flutter.embedding.engine.renderer.l;

/* JADX INFO: loaded from: classes.dex */
public final class j implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f1879a;

    public j(k kVar) {
        this.f1879a = kVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        k kVar = this.f1879a;
        l lVar = kVar.f1882g;
        if (lVar == null || kVar.f1881f) {
            return;
        }
        if (lVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        lVar.f2233a.onSurfaceChanged(i3, i4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        k kVar = this.f1879a;
        kVar.f1880e = true;
        if ((kVar.f1882g == null || kVar.f1881f) ? false : true) {
            kVar.e();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        k kVar = this.f1879a;
        boolean z2 = false;
        kVar.f1880e = false;
        l lVar = kVar.f1882g;
        if (lVar != null && !kVar.f1881f) {
            z2 = true;
        }
        if (z2) {
            if (lVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            lVar.g();
        }
    }
}
