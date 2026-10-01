package p015i0;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import p030q0.e;

/* JADX INFO: loaded from: classes.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f2174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f2176c = new AtomicBoolean(false);

    public g(FlutterJNI flutterJNI, int i2) {
        this.f2174a = flutterJNI;
        this.f2175b = i2;
    }

    @Override // p030q0.e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f2176c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i2 = this.f2175b;
        FlutterJNI flutterJNI = this.f2174a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i2);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i2, byteBuffer, byteBuffer.position());
        }
    }
}
