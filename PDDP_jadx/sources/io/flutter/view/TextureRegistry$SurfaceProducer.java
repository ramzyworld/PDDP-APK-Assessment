package io.flutter.view;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
@p002b.a
public interface TextureRegistry$SurfaceProducer {
    int getHeight();

    Surface getSurface();

    int getWidth();

    boolean handlesCropAndRotation();

    /* synthetic */ long id();

    /* synthetic */ void release();

    void scheduleFrame();

    void setCallback(p pVar);

    void setSize(int i2, int i3);
}
