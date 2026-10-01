package p011g0;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.l;
import io.flutter.embedding.engine.renderer.n;

/* JADX INFO: loaded from: classes.dex */
public final class m extends TextureView implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f1887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Surface f1888h;

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a(l lVar) {
        l lVar2 = this.f1887g;
        if (lVar2 != null) {
            lVar2.g();
        }
        this.f1887g = lVar;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b() {
        if (this.f1887g == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f1886f = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void c() {
        if (this.f1887g == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            l lVar = this.f1887g;
            if (lVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            lVar.g();
            Surface surface = this.f1888h;
            if (surface != null) {
                surface.release();
                this.f1888h = null;
            }
        }
        this.f1887g = null;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void d() {
        if (this.f1887g == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f1885e) {
            e();
        }
        this.f1886f = false;
    }

    public final void e() {
        if (this.f1887g == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f1888h;
        if (surface != null) {
            surface.release();
            this.f1888h = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f1888h = surface2;
        l lVar = this.f1887g;
        boolean z2 = this.f1886f;
        if (!z2) {
            lVar.g();
        }
        lVar.f2235c = surface2;
        FlutterJNI flutterJNI = lVar.f2233a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public l getAttachedRenderer() {
        return this.f1887g;
    }

    public void setRenderSurface(Surface surface) {
        this.f1888h = surface;
    }
}
