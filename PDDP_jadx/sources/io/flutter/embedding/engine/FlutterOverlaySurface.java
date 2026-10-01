package io.flutter.embedding.engine;

import android.view.Surface;
import p002b.a;

/* JADX INFO: loaded from: classes.dex */
@a
public class FlutterOverlaySurface {
    private final int id;
    private final Surface surface;

    public FlutterOverlaySurface(int i2, Surface surface) {
        this.id = i2;
        this.surface = surface;
    }

    public int getId() {
        return this.id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
