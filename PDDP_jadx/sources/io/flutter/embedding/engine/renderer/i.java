package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;

/* JADX INFO: loaded from: classes.dex */
public final class i implements TextureRegistry$SurfaceTextureEntry, io.flutter.view.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SurfaceTextureWrapper f2209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.flutter.view.o f2211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f2212e;

    public i(l lVar, long j2, SurfaceTexture surfaceTexture) {
        this.f2212e = lVar;
        this.f2208a = j2;
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture, new d(this, 1));
        this.f2209b = surfaceTextureWrapper;
        surfaceTextureWrapper.surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i iVar = this.f2207a;
                if (iVar.f2210c) {
                    return;
                }
                l lVar2 = iVar.f2212e;
                if (lVar2.f2233a.isAttached()) {
                    iVar.f2209b.markDirty();
                    lVar2.f2233a.scheduleFrame();
                }
            }
        }, new Handler());
    }

    public final void finalize() throws Throwable {
        try {
            if (this.f2210c) {
                return;
            }
            l lVar = this.f2212e;
            lVar.f2237e.post(new j(this.f2208a, lVar.f2233a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final long id() {
        return this.f2208a;
    }

    @Override // io.flutter.view.o
    public final void onTrimMemory(int i2) {
        io.flutter.view.o oVar = this.f2211d;
        if (oVar != null) {
            oVar.onTrimMemory(i2);
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void release() {
        if (this.f2210c) {
            return;
        }
        this.f2209b.release();
        l lVar = this.f2212e;
        lVar.f2233a.unregisterTexture(this.f2208a);
        lVar.f(this);
        this.f2210c = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnFrameConsumedListener(io.flutter.view.n nVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnTrimMemoryListener(io.flutter.view.o oVar) {
        this.f2211d = oVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final SurfaceTexture surfaceTexture() {
        return this.f2209b.surfaceTexture();
    }
}
