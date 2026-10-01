package p021l0;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.plugin.platform.i;
import java.util.Iterator;
import p011g0.C0094a;

/* JADX INFO: loaded from: classes.dex */
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlutterMutatorsStack f2822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f2823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0094a f2828k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i f2829l;

    public a(Activity activity, float f2, C0094a c0094a) {
        super(activity, null);
        this.f2823f = f2;
        this.f2828k = c0094a;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f2822e.getFinalMatrix());
        float f2 = this.f2823f;
        matrix.preScale(1.0f / f2, 1.0f / f2);
        matrix.postTranslate(-this.f2824g, -this.f2825h);
        return matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it = this.f2822e.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f2824g, -this.f2825h);
            canvas.clipPath(path);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0094a c0094a = this.f2828k;
        if (c0094a == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i2 = this.f2824g;
            this.f2826i = i2;
            int i3 = this.f2825h;
            this.f2827j = i3;
            matrix.postTranslate(i2, i3);
        } else if (action != 2) {
            matrix.postTranslate(this.f2824g, this.f2825h);
        } else {
            matrix.postTranslate(this.f2826i, this.f2827j);
            this.f2826i = this.f2824g;
            this.f2827j = this.f2825h;
        }
        c0094a.d(motionEvent, matrix);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        i iVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (iVar = this.f2829l) != null) {
            this.f2829l = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(iVar);
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f2829l == null) {
            i iVar2 = new i(onFocusChangeListener, this);
            this.f2829l = iVar2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(iVar2);
        }
    }
}
