package G;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements InterfaceC0001b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W f181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Y0.d f183e;

    public a0(File file, l0 l0Var, W w2) {
        I0.i.e(l0Var, "coordinator");
        this.f179a = file;
        this.f180b = l0Var;
        this.f181c = w2;
        this.f182d = new AtomicBoolean(false);
        this.f183e = Y0.e.a();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078 A[Catch: all -> 0x0079, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0079, blocks: (B:33:0x0078, B:43:0x008b, B:42:0x0088, B:39:0x0083), top: B:55:0x0020, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [G.a0] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [B0.b, G.Y] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [G.a0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [G.a0] */
    /* JADX WARN: Type inference failed for: r8v0, types: [G.s] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final Object a(C0017s c0017s, B0.b bVar) throws Throwable {
        ?? y2;
        U u2;
        Throwable th;
        ?? r1;
        ?? r8;
        if (bVar instanceof Y) {
            Y y3 = (Y) bVar;
            int i2 = y3.f171m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y3.f171m = i2 - Integer.MIN_VALUE;
                y2 = y3;
            } else {
                y2 = new Y(this, bVar);
            }
        } else {
            y2 = new Y(this, bVar);
        }
        Object obj = y2.f169k;
        A0.a aVar = A0.a.f0e;
        int i3 = y2.f171m;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0017s = y2.f168j;
                u2 = y2.f167i;
                y2 = y2.f166h;
                try {
                    p000a.a.O(obj);
                    r1 = y2;
                    r8 = c0017s;
                    try {
                        u2.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        r1.f183e.e(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        u2.close();
                    } catch (Throwable th4) {
                        a1.a.c(th, th4);
                    }
                    throw th;
                }
            }
            p000a.a.O(obj);
            if (this.f182d.get()) {
                throw new IllegalStateException("StorageConnection has already been disposed.");
            }
            boolean zD = this.f183e.d(null);
            try {
                U u3 = new U(this.f179a);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zD);
                    y2.f166h = this;
                    y2.f167i = u3;
                    y2.f168j = zD;
                    y2.f171m = 1;
                    Object objP = c0017s.p(u3, boolValueOf, y2);
                    if (objP == aVar) {
                        return aVar;
                    }
                    r1 = this;
                    u2 = u3;
                    obj = objP;
                    r8 = zD;
                    u2.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        r1.f183e.e(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    y2 = this;
                    u2 = u3;
                    th = th5;
                    c0017s = zD;
                    u2.close();
                    throw th;
                }
            } catch (Throwable th6) {
                y2 = this;
                th = th6;
                c0017s = zD;
                if (c0017s != 0) {
                    y2.f183e.e(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (c0017s != 0) {
                y2.f183e.e(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00db A[Catch: all -> 0x0116, IOException -> 0x0118, TRY_ENTER, TryCatch #0 {IOException -> 0x0118, blocks: (B:43:0x00db, B:45:0x00e1, B:47:0x00e9, B:51:0x00f5, B:52:0x0115, B:48:0x00ee, B:59:0x0123, B:66:0x0130, B:65:0x012d), top: B:76:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1 A[Catch: all -> 0x0116, IOException -> 0x0118, TryCatch #0 {IOException -> 0x0118, blocks: (B:43:0x00db, B:45:0x00e1, B:47:0x00e9, B:51:0x00f5, B:52:0x0115, B:48:0x00ee, B:59:0x0123, B:66:0x0130, B:65:0x012d), top: B:76:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e9 A[Catch: all -> 0x0116, IOException -> 0x0118, TryCatch #0 {IOException -> 0x0118, blocks: (B:43:0x00db, B:45:0x00e1, B:47:0x00e9, B:51:0x00f5, B:52:0x0115, B:48:0x00ee, B:59:0x0123, B:66:0x0130, B:65:0x012d), top: B:76:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee A[Catch: all -> 0x0116, IOException -> 0x0118, TryCatch #0 {IOException -> 0x0118, blocks: (B:43:0x00db, B:45:0x00e1, B:47:0x00e9, B:51:0x00f5, B:52:0x0115, B:48:0x00ee, B:59:0x0123, B:66:0x0130, B:65:0x012d), top: B:76:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f5 A[Catch: all -> 0x0116, IOException -> 0x0118, TryCatch #0 {IOException -> 0x0118, blocks: (B:43:0x00db, B:45:0x00e1, B:47:0x00e9, B:51:0x00f5, B:52:0x0115, B:48:0x00ee, B:59:0x0123, B:66:0x0130, B:65:0x012d), top: B:76:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0123 A[Catch: all -> 0x0116, IOException -> 0x0118, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0118, blocks: (B:43:0x00db, B:45:0x00e1, B:47:0x00e9, B:51:0x00f5, B:52:0x0115, B:48:0x00ee, B:59:0x0123, B:66:0x0130, B:65:0x012d), top: B:76:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00f5, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    public final Object b(Q q2, B0.b bVar) throws IOException {
        Z z2;
        File file;
        a0 a0Var;
        Y0.a aVar;
        H0.p pVar;
        c0 c0Var;
        Throwable th;
        c0 c0Var2;
        File file2;
        a0 a0Var2;
        File file3;
        boolean zRenameTo;
        if (bVar instanceof Z) {
            z2 = (Z) bVar;
            int i2 = z2.f178n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z2.f178n = i2 - Integer.MIN_VALUE;
            } else {
                z2 = new Z(this, bVar);
            }
        } else {
            z2 = new Z(this, bVar);
        }
        Object obj = z2.f176l;
        A0.a aVar2 = A0.a.f0e;
        ?? r3 = z2.f178n;
        try {
            try {
                try {
                    try {
                        if (r3 == 0) {
                            p000a.a.O(obj);
                            if (this.f182d.get()) {
                                throw new IllegalStateException("StorageConnection has already been disposed.");
                            }
                            File file4 = this.f179a;
                            File parentFile = file4.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    throw new IOException("Unable to create parent directories of " + file4);
                                }
                            }
                            z2.f172h = this;
                            z2.f173i = q2;
                            Y0.d dVar = this.f183e;
                            z2.f174j = dVar;
                            z2.f178n = 1;
                            if (dVar.c(z2) == aVar2) {
                                return aVar2;
                            }
                            a0Var = this;
                            aVar = dVar;
                            pVar = q2;
                        } else {
                            if (r3 != 1) {
                                if (r3 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c0Var2 = z2.f175k;
                                File file5 = (File) z2.f174j;
                                aVar = (Y0.a) z2.f173i;
                                a0Var2 = z2.f172h;
                                try {
                                    p000a.a.O(obj);
                                    file2 = file5;
                                    try {
                                        c0Var2.close();
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (file2.exists()) {
                                        file3 = a0Var2.f179a;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            zRenameTo = AbstractC0000a.a(file2, file3);
                                        } else {
                                            zRenameTo = file2.renameTo(file3);
                                        }
                                        if (zRenameTo) {
                                            throw new IOException("Unable to rename " + file2 + " to " + a0Var2.f179a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                        }
                                    }
                                    ((Y0.d) aVar).e(null);
                                    return p041x0.g.f3419a;
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        c0Var2.close();
                                    } catch (Throwable th4) {
                                        a1.a.c(th, th4);
                                    }
                                    throw th;
                                }
                            }
                            Y0.a aVar3 = (Y0.a) z2.f174j;
                            H0.p pVar2 = (H0.p) z2.f173i;
                            a0Var = z2.f172h;
                            p000a.a.O(obj);
                            aVar = aVar3;
                            pVar = pVar2;
                        }
                        z2.f172h = a0Var;
                        z2.f173i = aVar;
                        z2.f174j = file;
                        z2.f175k = c0Var;
                        z2.f178n = 2;
                        if (pVar.h(c0Var, z2) == aVar2) {
                            return aVar2;
                        }
                        file2 = file;
                        a0Var2 = a0Var;
                        c0Var2 = c0Var;
                        c0Var2.close();
                        th = null;
                        if (th == null) {
                            throw th;
                        }
                        if (file2.exists()) {
                            file3 = a0Var2.f179a;
                            if (Build.VERSION.SDK_INT >= 26) {
                                zRenameTo = AbstractC0000a.a(file2, file3);
                            } else {
                                zRenameTo = file2.renameTo(file3);
                            }
                            if (zRenameTo) {
                                throw new IOException("Unable to rename " + file2 + " to " + a0Var2.f179a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                            }
                        }
                        ((Y0.d) aVar).e(null);
                        return p041x0.g.f3419a;
                    } catch (Throwable th5) {
                        th = th5;
                        c0Var2 = c0Var;
                        c0Var2.close();
                        throw th;
                    }
                    c0Var = new c0(file);
                } catch (IOException e2) {
                    e = e2;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(a0Var.f179a.getAbsolutePath() + ".tmp");
            } catch (IOException e3) {
                e = e3;
                file = aVar2;
            }
        } catch (Throwable th6) {
            ((Y0.d) r3).e(null);
            throw th6;
        }
    }

    @Override // G.InterfaceC0001b
    public final void close() throws NoSuchMethodException, ClassNotFoundException {
        this.f182d.set(true);
        this.f181c.f();
    }
}
