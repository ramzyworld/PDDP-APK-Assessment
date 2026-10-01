package p011g0;

import N.Q;
import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import io.flutter.embedding.engine.renderer.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: g0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0094a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Matrix f1845f = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f1846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f1847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f1849d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1850e;

    public C0094a(l lVar, boolean z2) {
        this.f1846a = lVar;
        if (Q.f468h == null) {
            Q.f468h = new Q(9);
        }
        this.f1847b = Q.f468h;
        this.f1848c = z2;
    }

    public static int b(int i2) {
        if (i2 == 0) {
            return 4;
        }
        if (i2 == 1) {
            return 6;
        }
        if (i2 == 5) {
            return 4;
        }
        if (i2 == 6) {
            return 6;
        }
        if (i2 == 2) {
            return 5;
        }
        if (i2 == 7) {
            return 3;
        }
        if (i2 == 3) {
            return 0;
        }
        return i2 == 8 ? 3 : -1;
    }

    public final void a(MotionEvent motionEvent, int i2, int i3, int i4, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        int i5;
        int i6;
        long buttonState;
        int i7;
        long jIncrementAndGet;
        double min;
        double max;
        MotionEvent motionEvent2;
        double d2;
        double d3;
        double scaledVerticalScrollFactor;
        C0094a c0094a;
        float fC;
        InputDevice.MotionRange motionRange;
        if (i3 == -1) {
            return;
        }
        int pointerId = motionEvent.getPointerId(i2);
        int toolType = motionEvent.getToolType(i2);
        if (toolType == 1) {
            i5 = 0;
        } else if (toolType != 2) {
            i5 = 3;
            if (toolType == 3) {
                i5 = 1;
            } else if (toolType != 4) {
                i5 = 5;
            }
        } else {
            i5 = 2;
        }
        float[] fArr = {motionEvent.getX(i2), motionEvent.getY(i2)};
        matrix.mapPoints(fArr);
        HashMap map = this.f1849d;
        if (i5 == 1) {
            buttonState = motionEvent.getButtonState() & 31;
            if (buttonState == 0 && motionEvent.getSource() == 8194) {
                i6 = 4;
                if (i3 == 4) {
                    map.put(Integer.valueOf(pointerId), fArr);
                }
            } else {
                i6 = 4;
            }
        } else {
            i6 = 4;
            buttonState = i5 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean zContainsKey = map.containsKey(Integer.valueOf(pointerId));
        if (zContainsKey) {
            if (i3 == i6) {
                i7 = 7;
            } else if (i3 == 5) {
                i7 = 8;
            } else {
                i7 = (i3 == 6 || i3 == 0) ? 9 : -1;
            }
            if (i7 == -1) {
                return;
            }
        } else {
            i7 = -1;
        }
        if (this.f1848c) {
            Q q2 = this.f1847b;
            q2.getClass();
            jIncrementAndGet = I.f1843b.incrementAndGet();
            ((LongSparseArray) q2.f471f).put(jIncrementAndGet, MotionEvent.obtain(motionEvent));
            ((PriorityQueue) q2.f472g).add(Long.valueOf(jIncrementAndGet));
        } else {
            jIncrementAndGet = 0;
        }
        int i8 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        long j2 = buttonState;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(jIncrementAndGet);
        byteBuffer.putLong(eventTime);
        if (zContainsKey) {
            byteBuffer.putLong(i7);
            byteBuffer.putLong(4L);
        } else {
            byteBuffer.putLong(i3);
            byteBuffer.putLong(i5);
        }
        byteBuffer.putLong(i8);
        byteBuffer.putLong(pointerId);
        byteBuffer.putLong(0L);
        if (zContainsKey) {
            float[] fArr2 = (float[]) map.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
        } else {
            byteBuffer.putDouble(fArr[0]);
            byteBuffer.putDouble(fArr[1]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j2);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i2));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            min = 0.0d;
            max = 1.0d;
        } else {
            min = motionRange.getMin();
            max = motionRange.getMax();
        }
        byteBuffer.putDouble(min);
        byteBuffer.putDouble(max);
        if (i5 == 2) {
            motionEvent2 = motionEvent;
            byteBuffer.putDouble(motionEvent2.getAxisValue(24, i2));
            byteBuffer.putDouble(0.0d);
        } else {
            motionEvent2 = motionEvent;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i2));
        byteBuffer.putDouble(motionEvent.getToolMajor(i2));
        byteBuffer.putDouble(motionEvent.getToolMinor(i2));
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(motionEvent2.getAxisValue(8, i2));
        if (i5 == 2) {
            byteBuffer.putDouble(motionEvent2.getAxisValue(25, i2));
        } else {
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putLong(i4);
        if (i8 == 1) {
            if (context != null) {
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 26) {
                    fC = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
                    c0094a = this;
                } else {
                    c0094a = this;
                    fC = c0094a.c(context);
                }
                d3 = fC;
                scaledVerticalScrollFactor = i9 >= 26 ? ViewConfiguration.get(context).getScaledVerticalScrollFactor() : c0094a.c(context);
            } else {
                d3 = 48.0d;
                scaledVerticalScrollFactor = 48.0d;
            }
            double d4 = d3 * ((double) (-motionEvent2.getAxisValue(10, i2)));
            double d5 = scaledVerticalScrollFactor * ((double) (-motionEvent2.getAxisValue(9, i2)));
            byteBuffer.putDouble(d4);
            byteBuffer.putDouble(d5);
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (zContainsKey) {
            float[] fArr3 = (float[]) map.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr[0] - fArr3[0]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d2 = 0.0d;
        } else {
            d2 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d2);
        byteBuffer.putDouble(d2);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d2);
        byteBuffer.putLong(0L);
        if (zContainsKey && i7 == 9) {
            map.remove(Integer.valueOf(pointerId));
        }
    }

    public final int c(Context context) {
        if (this.f1850e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f1850e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1850e;
    }

    public final void d(MotionEvent motionEvent, Matrix matrix) {
        int actionMasked = motionEvent.getActionMasked();
        int iB = b(motionEvent.getActionMasked());
        char c2 = 5;
        boolean z2 = actionMasked == 0 || actionMasked == 5;
        boolean z3 = !z2 && (actionMasked == 1 || actionMasked == 6);
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        if (toolType == 1) {
            c2 = 0;
        } else if (toolType == 2) {
            c2 = 2;
        } else if (toolType == 3) {
            c2 = 1;
        } else if (toolType == 4) {
            c2 = 3;
        }
        int i2 = (z3 && c2 == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((pointerCount + i2) * 288);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z2) {
            a(motionEvent, motionEvent.getActionIndex(), iB, 0, matrix, byteBufferAllocateDirect, null);
        } else if (z3) {
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (i3 != motionEvent.getActionIndex() && motionEvent.getToolType(i3) == 1) {
                    a(motionEvent, i3, 5, 1, matrix, byteBufferAllocateDirect, null);
                }
            }
            a(motionEvent, motionEvent.getActionIndex(), iB, 0, matrix, byteBufferAllocateDirect, null);
            if (i2 != 0) {
                a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBufferAllocateDirect, null);
            }
        } else {
            for (int i4 = 0; i4 < pointerCount; i4++) {
                a(motionEvent, i4, iB, 0, matrix, byteBufferAllocateDirect, null);
            }
        }
        if (byteBufferAllocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        this.f1846a.f2233a.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
    }
}
