package L;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f374f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d[] f375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f376h;

    public c(AssetManager assetManager, Executor executor, f fVar, String str, File file) {
        this.f369a = executor;
        this.f370b = fVar;
        this.f373e = str;
        this.f372d = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 >= 24 && i2 <= 34) {
            switch (i2) {
                case 24:
                case 25:
                    bArr = g.f393h;
                    break;
                case 26:
                    bArr = g.f392g;
                    break;
                case 27:
                    bArr = g.f391f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = g.f390e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = g.f389d;
                    break;
            }
        }
        this.f371c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f370b.j();
            }
            return null;
        }
    }

    public final void b(final int i2, final Serializable serializable) {
        this.f369a.execute(new Runnable() { // from class: L.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f366e.f370b.h(i2, serializable);
            }
        });
    }
}
