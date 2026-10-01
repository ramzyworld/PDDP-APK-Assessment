package L;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f405d;

    public o(int i2, int i3, long j2, long j3) {
        this.f402a = i2;
        this.f403b = i3;
        this.f404c = j2;
        this.f405d = j3;
    }

    public static o a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            o oVar = new o(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return oVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f402a);
            dataOutputStream.writeInt(this.f403b);
            dataOutputStream.writeLong(this.f404c);
            dataOutputStream.writeLong(this.f405d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f403b == oVar.f403b && this.f404c == oVar.f404c && this.f402a == oVar.f402a && this.f405d == oVar.f405d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f403b), Long.valueOf(this.f404c), Integer.valueOf(this.f402a), Long.valueOf(this.f405d));
    }
}
