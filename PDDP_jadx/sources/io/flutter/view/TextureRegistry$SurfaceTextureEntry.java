package io.flutter.view;

import android.graphics.SurfaceTexture;

/* JADX INFO: loaded from: classes.dex */
@p002b.a
public interface TextureRegistry$SurfaceTextureEntry {
    /* synthetic */ long id();

    /* synthetic */ void release();

    void setOnFrameConsumedListener(n nVar);

    void setOnTrimMemoryListener(o oVar);

    SurfaceTexture surfaceTexture();
}
