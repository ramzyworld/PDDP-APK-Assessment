package p011g0;

import I.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import io.flutter.embedding.engine.renderer.l;
import io.flutter.embedding.engine.renderer.n;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: renamed from: g0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0102i extends View implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageReader f1873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Image f1874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f1875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f1876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1878j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0102i(Context context, int i2, int i3, int i4) {
        super(context, null);
        ImageReader imageReaderF = f(i2, i3);
        this.f1878j = false;
        this.f1873e = imageReaderF;
        this.f1877i = i4;
        setAlpha(0.0f);
    }

    public static ImageReader f(int i2, int i3) {
        if (i2 <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i2 + ", set width=1");
            i2 = 1;
        }
        if (i3 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i3 + ", set height=1");
            i3 = 1;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i2, i3, 1, 3, 768L) : ImageReader.newInstance(i2, i3, 1, 3);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a(l lVar) {
        if (j.b(this.f1877i) == 0) {
            Surface surface = this.f1873e.getSurface();
            lVar.f2235c = surface;
            lVar.f2233a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f1876h = lVar;
        this.f1878j = true;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void c() {
        if (this.f1878j) {
            setAlpha(0.0f);
            e();
            this.f1875g = null;
            Image image = this.f1874f;
            if (image != null) {
                image.close();
                this.f1874f = null;
            }
            invalidate();
            this.f1878j = false;
        }
    }

    public final boolean e() {
        if (!this.f1878j) {
            return false;
        }
        Image imageAcquireLatestImage = this.f1873e.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            Image image = this.f1874f;
            if (image != null) {
                image.close();
                this.f1874f = null;
            }
            this.f1874f = imageAcquireLatestImage;
            invalidate();
        }
        return imageAcquireLatestImage != null;
    }

    public final void g(int i2, int i3) {
        if (this.f1876h == null) {
            return;
        }
        if (i2 == this.f1873e.getWidth() && i3 == this.f1873e.getHeight()) {
            return;
        }
        Image image = this.f1874f;
        if (image != null) {
            image.close();
            this.f1874f = null;
        }
        this.f1873e.close();
        this.f1873e = f(i2, i3);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public l getAttachedRenderer() {
        return this.f1876h;
    }

    public ImageReader getImageReader() {
        return this.f1873e;
    }

    public Surface getSurface() {
        return this.f1873e.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Image image = this.f1874f;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                HardwareBuffer hardwareBuffer = image.getHardwareBuffer();
                this.f1875g = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f1874f.getHeight();
                    Bitmap bitmap = this.f1875g;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f1875g.getHeight() != height) {
                        this.f1875g = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f1875g.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f1875g;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (!(i2 == this.f1873e.getWidth() && i3 == this.f1873e.getHeight()) && this.f1877i == 1 && this.f1878j) {
            g(i2, i3);
            l lVar = this.f1876h;
            Surface surface = this.f1873e.getSurface();
            lVar.f2235c = surface;
            lVar.f2233a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void d() {
    }
}
