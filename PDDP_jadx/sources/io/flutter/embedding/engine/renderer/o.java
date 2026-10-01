package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$GLTextureConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;

/* JADX INFO: loaded from: classes.dex */
public final class o implements TextureRegistry$SurfaceProducer, TextureRegistry$GLTextureConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f2245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f2246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f2247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FlutterJNI f2248h;

    public o(long j2, Handler handler, FlutterJNI flutterJNI, i iVar) {
        this.f2241a = j2;
        this.f2247g = handler;
        this.f2248h = flutterJNI;
        this.f2246f = iVar;
    }

    public final void finalize() throws Throwable {
        try {
            if (this.f2244d) {
                return;
            }
            release();
            this.f2247g.post(new j(this.f2241a, this.f2248h));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getHeight() {
        return this.f2243c;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getSurface() {
        if (this.f2245e == null) {
            this.f2245e = new Surface(this.f2246f.f2209b.surfaceTexture());
        }
        return this.f2245e;
    }

    @Override // io.flutter.view.TextureRegistry$GLTextureConsumer
    public final SurfaceTexture getSurfaceTexture() {
        return this.f2246f.f2209b.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getWidth() {
        return this.f2242b;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final long id() {
        return this.f2241a;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void release() {
        this.f2246f.release();
        this.f2244d = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void scheduleFrame() {
        this.f2248h.markTextureFrameAvailable(this.f2241a);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setCallback(p pVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setSize(int i2, int i3) {
        this.f2242b = i2;
        this.f2243c = i3;
        this.f2246f.f2209b.surfaceTexture().setDefaultBufferSize(i2, i3);
    }
}
