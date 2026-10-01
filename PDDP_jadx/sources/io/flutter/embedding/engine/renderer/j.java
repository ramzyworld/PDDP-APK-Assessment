package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FlutterJNI f2214f;

    public j(long j2, FlutterJNI flutterJNI) {
        this.f2213e = j2;
        this.f2214f = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.f2214f;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f2213e);
        }
    }
}
