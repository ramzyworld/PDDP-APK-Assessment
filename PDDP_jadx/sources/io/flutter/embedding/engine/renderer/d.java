package io.flutter.embedding.engine.renderer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.flutter.view.o f2199f;

    public /* synthetic */ d(io.flutter.view.o oVar, int i2) {
        this.f2198e = i2;
        this.f2199f = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2198e) {
            case 0:
                ((FlutterRenderer$ImageReaderSurfaceProducer) this.f2199f).lambda$dequeueImage$0();
                break;
            default:
                ((i) this.f2199f).getClass();
                break;
        }
    }
}
