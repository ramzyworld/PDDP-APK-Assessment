package p015i0;

import N.C0026b;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p030q0.d;
import p030q0.e;
import p030q0.f;
import p030q0.i;
import w0.a;

/* JADX INFO: loaded from: classes.dex */
public final class j implements f, k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FlutterJNI f2182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f2183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f2184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f2185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f2186i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f2187j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2188k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f2189l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WeakHashMap f2190m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final D.j f2191n;

    public j(FlutterJNI flutterJNI) {
        D.j jVar = new D.j(23, false);
        jVar.f44f = (ExecutorService) C0026b.E().f478h;
        this.f2183f = new HashMap();
        this.f2184g = new HashMap();
        this.f2185h = new Object();
        this.f2186i = new AtomicBoolean(false);
        this.f2187j = new HashMap();
        this.f2188k = 1;
        this.f2189l = new l();
        this.f2190m = new WeakHashMap();
        this.f2182e = flutterJNI;
        this.f2191n = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [i0.c] */
    public final void a(final String str, final f fVar, final ByteBuffer byteBuffer, final int i2, final long j2) {
        e eVar = fVar != null ? fVar.f2173b : null;
        String strA = a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            P.a.a(a1.a.I(strA), i2);
        } else {
            String strI = a1.a.I(strA);
            try {
                if (a1.a.f1145g == null) {
                    a1.a.f1145g = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                a1.a.f1145g.invoke(null, Long.valueOf(a1.a.f1143e), strI, Integer.valueOf(i2));
            } catch (Exception e2) {
                a1.a.q("asyncTraceBegin", e2);
            }
        }
        ?? r1 = new Runnable() { // from class: i0.c
            @Override // java.lang.Runnable
            public final void run() {
                long j3 = j2;
                FlutterJNI flutterJNI = this.f2163e.f2182e;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String strA2 = a.a(sb.toString());
                int i3 = Build.VERSION.SDK_INT;
                int i4 = i2;
                if (i3 >= 29) {
                    P.a.b(a1.a.I(strA2), i4);
                } else {
                    String strI2 = a1.a.I(strA2);
                    try {
                        if (a1.a.f1146h == null) {
                            a1.a.f1146h = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        a1.a.f1146h.invoke(null, Long.valueOf(a1.a.f1143e), strI2, Integer.valueOf(i4));
                    } catch (Exception e3) {
                        a1.a.q("asyncTraceEnd", e3);
                    }
                }
                try {
                    a.b("DartMessenger#handleMessageFromDart on " + str2);
                    f fVar2 = fVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (fVar2 != null) {
                            try {
                                try {
                                    fVar2.f2172a.l(byteBuffer2, new g(flutterJNI, i4));
                                } catch (Error e4) {
                                    Thread threadCurrentThread = Thread.currentThread();
                                    if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
                                        throw e4;
                                    }
                                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, e4);
                                }
                            } catch (Exception e5) {
                                Log.e("DartMessenger", "Uncaught exception in binary message listener", e5);
                                flutterJNI.invokePlatformMessageEmptyResponseCallback(i4);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i4);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                        flutterJNI.cleanupMessageData(j3);
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    flutterJNI.cleanupMessageData(j3);
                    throw th3;
                }
            }
        };
        e eVar2 = eVar;
        if (eVar == null) {
            eVar2 = this.f2189l;
        }
        eVar2.a(r1);
    }

    public final H.a b(i iVar) {
        D.j jVar = this.f2191n;
        jVar.getClass();
        i iVar2 = new i((ExecutorService) jVar.f44f);
        H.a aVar = new H.a(16);
        this.f2190m.put(aVar, iVar2);
        return aVar;
    }

    @Override // p030q0.f
    public final void e(String str, d dVar, H.a aVar) {
        e eVar;
        if (dVar == null) {
            synchronized (this.f2185h) {
                this.f2183f.remove(str);
            }
            return;
        }
        if (aVar != null) {
            eVar = (e) this.f2190m.get(aVar);
            if (eVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            eVar = null;
        }
        synchronized (this.f2185h) {
            try {
                this.f2183f.put(str, new f(dVar, eVar));
                List<d> list = (List) this.f2184g.remove(str);
                if (list == null) {
                    return;
                }
                for (d dVar2 : list) {
                    a(str, (f) this.f2183f.get(str), dVar2.f2169a, dVar2.f2170b, dVar2.f2171c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p030q0.f
    public final void f(String str, d dVar) {
        e(str, dVar, null);
    }

    @Override // p030q0.f
    public final H.a m() {
        D.j jVar = this.f2191n;
        jVar.getClass();
        i iVar = new i((ExecutorService) jVar.f44f);
        H.a aVar = new H.a(16);
        this.f2190m.put(aVar, iVar);
        return aVar;
    }

    @Override // p030q0.f
    public final void n(String str, ByteBuffer byteBuffer, e eVar) {
        a.b("DartMessenger#send on " + str);
        try {
            int i2 = this.f2188k;
            this.f2188k = i2 + 1;
            if (eVar != null) {
                this.f2187j.put(Integer.valueOf(i2), eVar);
            }
            FlutterJNI flutterJNI = this.f2182e;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i2);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i2);
            }
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
}
