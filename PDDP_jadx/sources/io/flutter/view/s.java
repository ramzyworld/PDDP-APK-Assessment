package io.flutter.view;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f2516b;

    public s(t tVar, long j2) {
        this.f2516b = tVar;
        this.f2515a = j2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        long jNanoTime = System.nanoTime() - j2;
        long j3 = jNanoTime < 0 ? 0L : jNanoTime;
        t tVar = this.f2516b;
        tVar.f2520b.onVsync(j3, tVar.f2519a, this.f2515a);
        tVar.f2521c = this;
    }
}
