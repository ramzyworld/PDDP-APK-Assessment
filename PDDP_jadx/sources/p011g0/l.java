package p011g0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* JADX INFO: loaded from: classes.dex */
public final class l implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f1884a;

    public l(m mVar) {
        this.f1884a = mVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        m mVar = this.f1884a;
        mVar.f1885e = true;
        if ((mVar.f1887g == null || mVar.f1886f) ? false : true) {
            mVar.e();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        m mVar = this.f1884a;
        boolean z2 = false;
        mVar.f1885e = false;
        io.flutter.embedding.engine.renderer.l lVar = mVar.f1887g;
        if (lVar != null && !mVar.f1886f) {
            z2 = true;
        }
        if (z2) {
            if (lVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            lVar.g();
            Surface surface = mVar.f1888h;
            if (surface != null) {
                surface.release();
                mVar.f1888h = null;
            }
        }
        Surface surface2 = mVar.f1888h;
        if (surface2 != null) {
            surface2.release();
            mVar.f1888h = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        m mVar = this.f1884a;
        io.flutter.embedding.engine.renderer.l lVar = mVar.f1887g;
        if (lVar == null || mVar.f1886f) {
            return;
        }
        if (lVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        lVar.f2233a.onSurfaceChanged(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
