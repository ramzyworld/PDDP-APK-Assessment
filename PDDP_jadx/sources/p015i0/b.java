package p015i0;

import D.j;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import p030q0.d;
import p030q0.e;
import p030q0.f;
import p030q0.i;
import w0.a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f2159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f2160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f2161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f2162i;

    public b(String str, String str2, String str3, String str4, boolean z2) {
        this.f2159f = str == null ? "libapp.so" : str;
        this.f2160g = str2 == null ? "flutter_assets" : str2;
        this.f2162i = str4;
        this.f2161h = str3 == null ? "" : str3;
        this.f2158e = z2;
    }

    public void a(a aVar, List list) {
        if (this.f2158e) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            ((FlutterJNI) this.f2159f).runBundleAndSnapshotFromLibrary(aVar.f2155a, aVar.f2157c, aVar.f2156b, (AssetManager) this.f2160g, list);
            this.f2158e = true;
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p030q0.f
    public void e(String str, d dVar, H.a aVar) {
        ((j) this.f2162i).e(str, dVar, aVar);
    }

    @Override // p030q0.f
    public void f(String str, d dVar) {
        ((j) this.f2162i).f(str, dVar);
    }

    @Override // p030q0.f
    public H.a m() {
        return ((j) ((j) this.f2162i).f44f).b(new i());
    }

    @Override // p030q0.f
    public void n(String str, ByteBuffer byteBuffer, e eVar) {
        ((j) this.f2162i).n(str, byteBuffer, eVar);
    }

    public b(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.f2158e = false;
        j jVar = new j(21, this);
        this.f2159f = flutterJNI;
        this.f2160g = assetManager;
        j jVar2 = new j(flutterJNI);
        this.f2161h = jVar2;
        jVar2.e("flutter/isolate", jVar, null);
        this.f2162i = new j(22, jVar2);
        if (flutterJNI.isAttached()) {
            this.f2158e = true;
        }
    }
}
