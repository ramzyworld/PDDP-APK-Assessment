package N;

import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import java.util.ArrayList;
import java.util.Collections;
import p011g0.AbstractC0095b;

/* JADX INFO: loaded from: classes.dex */
public final class D implements io.flutter.plugin.platform.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f428f;

    public D(TextureRegistry$ImageTextureEntry textureRegistry$ImageTextureEntry) {
        this.f423a = 0;
        this.f424b = 0;
        this.f427e = new Handler();
        this.f428f = new io.flutter.plugin.platform.b(this);
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.f425c = textureRegistry$ImageTextureEntry;
    }

    @Override // io.flutter.plugin.platform.h
    public long a() {
        return ((TextureRegistry$ImageTextureEntry) this.f425c).id();
    }

    @Override // io.flutter.plugin.platform.h
    public void b(int i2, int i3) {
        ImageReader imageReaderNewInstance;
        ImageReader imageReader = (ImageReader) this.f426d;
        if (imageReader != null && this.f423a == i2 && this.f424b == i3) {
            return;
        }
        if (imageReader != null) {
            ((TextureRegistry$ImageTextureEntry) this.f425c).pushImage(null);
            ((ImageReader) this.f426d).close();
            this.f426d = null;
        }
        this.f423a = i2;
        this.f424b = i3;
        int i4 = Build.VERSION.SDK_INT;
        Handler handler = (Handler) this.f427e;
        io.flutter.plugin.platform.b bVar = (io.flutter.plugin.platform.b) this.f428f;
        if (i4 >= 33) {
            AbstractC0095b.h();
            ImageReader.Builder builderC = AbstractC0095b.c(this.f423a, this.f424b);
            builderC.setMaxImages(4);
            builderC.setImageFormat(34);
            builderC.setUsage(256L);
            imageReaderNewInstance = builderC.build();
            imageReaderNewInstance.setOnImageAvailableListener(bVar, handler);
        } else {
            if (i4 < 29) {
                throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
            }
            imageReaderNewInstance = ImageReader.newInstance(i2, i3, 34, 4, 256L);
            imageReaderNewInstance.setOnImageAvailableListener(bVar, handler);
        }
        this.f426d = imageReaderNewInstance;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f426d;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            if (arrayList.get(size) != null) {
                throw new ClassCastException();
            }
            int[] iArr = RecyclerView.f1639l0;
            throw null;
        }
        arrayList.clear();
        if (RecyclerView.f1641n0) {
            C0034j c0034j = ((RecyclerView) this.f428f).f1666a0;
            c0034j.getClass();
            c0034j.f521c = 0;
        }
    }

    public void d(int i2) {
        RecyclerView recyclerView = (RecyclerView) this.f428f;
        if (i2 < 0 || i2 >= recyclerView.f1667b0.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i2 + "(" + i2 + "). Item count:" + recyclerView.f1667b0.a() + recyclerView.h());
        }
        G g2 = recyclerView.f1667b0;
        boolean z2 = g2.f432c;
        ArrayList arrayList = (ArrayList) this.f425c;
        if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList2 = (ArrayList) recyclerView.f1675h.f476f;
        if (arrayList2.size() > 0) {
            RecyclerView.j((View) arrayList2.get(0));
            throw null;
        }
        ArrayList arrayList3 = (ArrayList) this.f426d;
        if (arrayList3.size() > 0) {
            arrayList3.get(0).getClass();
            throw new ClassCastException();
        }
        int iW = recyclerView.f1673g.w(i2, 0);
        if (iW >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i2 + "(offset:" + iW + ").state:" + g2.a() + recyclerView.h());
    }

    public void e() {
        x xVar = ((RecyclerView) this.f428f).f1684m;
        this.f424b = this.f423a;
        ArrayList arrayList = (ArrayList) this.f426d;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f424b) {
            return;
        }
        if (arrayList.get(size) != null) {
            throw new ClassCastException();
        }
        int[] iArr = RecyclerView.f1639l0;
        throw null;
    }

    @Override // io.flutter.plugin.platform.h
    public int getHeight() {
        return this.f424b;
    }

    @Override // io.flutter.plugin.platform.h
    public Surface getSurface() {
        return ((ImageReader) this.f426d).getSurface();
    }

    @Override // io.flutter.plugin.platform.h
    public int getWidth() {
        return this.f423a;
    }

    @Override // io.flutter.plugin.platform.h
    public void release() {
        if (((ImageReader) this.f426d) != null) {
            ((TextureRegistry$ImageTextureEntry) this.f425c).pushImage(null);
            ((ImageReader) this.f426d).close();
            this.f426d = null;
        }
        this.f425c = null;
    }

    @Override // io.flutter.plugin.platform.h
    public /* synthetic */ void scheduleFrame() {
    }

    public D(RecyclerView recyclerView) {
        this.f428f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f425c = arrayList;
        this.f426d = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f423a = 2;
        this.f424b = 2;
    }
}
