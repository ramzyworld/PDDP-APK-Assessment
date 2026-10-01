package p011g0;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.l;
import io.flutter.embedding.engine.renderer.n;

/* JADX INFO: loaded from: classes.dex */
public final class k extends SurfaceView implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f1882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0099f f1883h;

    public k(AbstractActivityC0098e abstractActivityC0098e, boolean z2) {
        super(abstractActivityC0098e, null);
        this.f1880e = false;
        this.f1881f = false;
        j jVar = new j(this);
        this.f1883h = new C0099f(1, this);
        if (z2) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(jVar);
        setAlpha(0.0f);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a(l lVar) {
        l lVar2 = this.f1882g;
        if (lVar2 != null) {
            lVar2.g();
            this.f1882g.f2233a.removeIsDisplayingFlutterUiListener(this.f1883h);
        }
        this.f1882g = lVar;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b() {
        if (this.f1882g == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f1881f = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void c() {
        if (this.f1882g == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            l lVar = this.f1882g;
            if (lVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            lVar.g();
        }
        setAlpha(0.0f);
        this.f1882g.f2233a.removeIsDisplayingFlutterUiListener(this.f1883h);
        this.f1882g = null;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void d() {
        l lVar = this.f1882g;
        if (lVar == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        FlutterJNI flutterJNI = lVar.f2233a;
        C0099f c0099f = this.f1883h;
        flutterJNI.addIsDisplayingFlutterUiListener(c0099f);
        if (lVar.f2236d) {
            c0099f.b();
        }
        if (this.f1880e) {
            e();
        }
        this.f1881f = false;
    }

    public final void e() {
        if (this.f1882g == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        l lVar = this.f1882g;
        Surface surface = getHolder().getSurface();
        boolean z2 = this.f1881f;
        if (!z2) {
            lVar.g();
        }
        lVar.f2235c = surface;
        FlutterJNI flutterJNI = lVar.f2233a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            flutterJNI.onSurfaceCreated(surface);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i2 = iArr[0];
        region.op(i2, iArr[1], (getRight() + i2) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public l getAttachedRenderer() {
        return this.f1882g;
    }
}
