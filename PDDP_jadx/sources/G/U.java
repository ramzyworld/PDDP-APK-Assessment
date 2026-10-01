package G;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class U implements InterfaceC0001b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f158b = new AtomicBoolean(false);

    public U(File file) {
        this.f157a = file;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [G.U] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [G.U] */
    public static Object a(U u2, B0.b bVar) throws IOException {
        T t;
        ?? r9;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (bVar instanceof T) {
            t = (T) bVar;
            int i2 = t.f156l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t.f156l = i2 - Integer.MIN_VALUE;
            } else {
                t = new T(u2, bVar);
            }
        } else {
            t = new T(u2, bVar);
        }
        Object obj = t.f154j;
        A0.a aVar = A0.a.f0e;
        ?? r2 = t.f156l;
        J.g gVar = J.g.f348a;
        boolean z2 = true;
        try {
            if (r2 != 0) {
                if (r2 == 1) {
                    fileInputStream = t.f153i;
                    r2 = (U) t.f152h;
                    try {
                        p000a.a.O(obj);
                        p000a.a.g(fileInputStream, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            p000a.a.g(fileInputStream, th2);
                            throw th4;
                        }
                    }
                }
                if (r2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) t.f152h;
                try {
                    p000a.a.O(obj);
                    p000a.a.g(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        p000a.a.g(closeable, th);
                        throw th6;
                    }
                }
            }
            p000a.a.O(obj);
            if (u2.f158b.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            try {
                FileInputStream fileInputStream2 = new FileInputStream(u2.f157a);
                try {
                    t.f152h = u2;
                    t.f153i = fileInputStream2;
                    t.f156l = 1;
                    J.b bVarA = gVar.a(fileInputStream2);
                    if (bVarA == aVar) {
                        return aVar;
                    }
                    fileInputStream = fileInputStream2;
                    obj = bVarA;
                    p000a.a.g(fileInputStream, null);
                    return obj;
                } catch (Throwable th7) {
                    r2 = u2;
                    fileInputStream = fileInputStream2;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                r9 = u2;
                if (!r9.f157a.exists()) {
                    return new J.b(z2);
                }
                FileInputStream fileInputStream3 = new FileInputStream(r9.f157a);
                try {
                    t.f152h = fileInputStream3;
                    t.f153i = null;
                    t.f156l = 2;
                    J.b bVarA2 = gVar.a(fileInputStream3);
                    if (bVarA2 == aVar) {
                        return aVar;
                    }
                    obj = bVarA2;
                    closeable = fileInputStream3;
                    p000a.a.g(closeable, null);
                    return obj;
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream3;
                    throw th;
                }
            }
        } catch (FileNotFoundException unused2) {
            r9 = r2;
        }
    }

    @Override // G.InterfaceC0001b
    public final void close() {
        this.f158b.set(true);
    }
}
