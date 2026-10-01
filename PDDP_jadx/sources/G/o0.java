package G;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends OutputStream {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FileOutputStream f265e;

    public o0(FileOutputStream fileOutputStream) {
        this.f265e = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f265e.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i2) throws IOException {
        this.f265e.write(i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        I0.i.e(bArr, "b");
        this.f265e.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) throws IOException {
        I0.i.e(bArr, "bytes");
        this.f265e.write(bArr, i2, i3);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
