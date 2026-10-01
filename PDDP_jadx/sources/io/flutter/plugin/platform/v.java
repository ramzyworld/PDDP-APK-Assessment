package io.flutter.plugin.platform;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class v implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.i f2375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SurfaceTexture f2376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Surface f2377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2378d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2379e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2380f = false;

    public v(io.flutter.embedding.engine.renderer.i iVar) {
        u uVar = new u(this);
        if (Build.VERSION.SDK_INT < 23) {
            throw new UnsupportedOperationException("Platform views cannot be displayed below API level 23You can prevent this issue by setting `minSdkVersion: 23` in build.gradle.");
        }
        this.f2375a = iVar;
        this.f2376b = iVar.f2209b.surfaceTexture();
        iVar.f2211d = uVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final long a() {
        return this.f2375a.f2208a;
    }

    @Override // io.flutter.plugin.platform.h
    public final void b(int i2, int i3) {
        this.f2378d = i2;
        this.f2379e = i3;
        SurfaceTexture surfaceTexture = this.f2376b;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i2, i3);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final int getHeight() {
        return this.f2379e;
    }

    @Override // io.flutter.plugin.platform.h
    public final Surface getSurface() {
        Surface surface = this.f2377c;
        if (surface == null || this.f2380f) {
            if (surface != null) {
                surface.release();
                this.f2377c = null;
            }
            this.f2377c = new Surface(this.f2376b);
            this.f2380f = false;
        }
        SurfaceTexture surfaceTexture = this.f2376b;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            return null;
        }
        return this.f2377c;
    }

    @Override // io.flutter.plugin.platform.h
    public final int getWidth() {
        return this.f2378d;
    }

    @Override // io.flutter.plugin.platform.h
    public final void release() {
        this.f2376b = null;
        Surface surface = this.f2377c;
        if (surface != null) {
            surface.release();
            this.f2377c = null;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final /* synthetic */ void scheduleFrame() {
    }
}
