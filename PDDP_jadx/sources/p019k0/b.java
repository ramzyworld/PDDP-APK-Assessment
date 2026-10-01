package p019k0;

import android.content.Context;
import android.os.Trace;
import androidx.lifecycle.p;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.Callable;
import w0.a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f2796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f2797b;

    public b(d dVar, Context context) {
        this.f2797b = dVar;
        this.f2796a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        Context context = this.f2796a;
        d dVar = this.f2797b;
        a.b("FlutterLoader initTask");
        try {
            dVar.getClass();
            FlutterJNI flutterJNI = dVar.f2804e;
            try {
                flutterJNI.loadLibrary(context);
                flutterJNI.updateRefreshRate();
                dVar.f2805f.execute(new p(2, this));
                File filesDir = context.getFilesDir();
                if (filesDir == null) {
                    filesDir = new File(a1.a.m(context), "files");
                }
                String path = filesDir.getPath();
                File codeCacheDir = context.getCodeCacheDir();
                if (codeCacheDir == null) {
                    codeCacheDir = context.getCacheDir();
                }
                if (codeCacheDir == null) {
                    codeCacheDir = new File(a1.a.m(context), "cache");
                }
                String path2 = codeCacheDir.getPath();
                File dir = context.getDir("flutter", 0);
                if (dir == null) {
                    dir = new File(a1.a.m(context), "app_flutter");
                }
                dir.getPath();
                c cVar = new c(path, path2);
                Trace.endSection();
                return cVar;
            } catch (UnsatisfiedLinkError e2) {
                if (!e2.toString().contains("couldn't find \"libflutter.so\"") && !e2.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                    throw e2;
                }
                String property = System.getProperty("os.arch");
                File file = new File((String) dVar.f2803d.f2162i);
                String[] list = file.list();
                StringBuilder sb = new StringBuilder("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                sb.append(property);
                sb.append(", and the native libraries directory (with path ");
                sb.append(file.getAbsolutePath());
                sb.append(") ");
                if (file.exists()) {
                    str = "contains the following files: " + Arrays.toString(list);
                } else {
                    str = "does not exist.";
                }
                sb.append(str);
                throw new UnsupportedOperationException(sb.toString(), e2);
            }
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
