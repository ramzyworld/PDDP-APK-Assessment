package io.flutter.plugin.platform;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import p011g0.C0094a;

/* JADX INFO: loaded from: classes.dex */
public final class j extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0094a f2328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f2329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f2330k;

    public j(Activity activity) {
        super(activity);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        h hVar = this.f2329j;
        if (hVar == null) {
            super.draw(canvas);
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = hVar.getSurface();
        if (!surface.isValid()) {
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        if (canvasLockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(canvasLockHardwareCanvas);
        } finally {
            this.f2329j.scheduleFrame();
            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f2330k;
    }

    public int getRenderTargetHeight() {
        h hVar = this.f2329j;
        if (hVar != null) {
            return hVar.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        h hVar = this.f2329j;
        if (hVar != null) {
            return hVar.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f2328i == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i2 = this.f2326g;
            this.f2324e = i2;
            int i3 = this.f2327h;
            this.f2325f = i3;
            matrix.postTranslate(i2, i3);
        } else if (action != 2) {
            matrix.postTranslate(this.f2326g, this.f2327h);
        } else {
            matrix.postTranslate(this.f2324e, this.f2325f);
            this.f2324e = this.f2326g;
            this.f2325f = this.f2327h;
        }
        this.f2328i.d(motionEvent, matrix);
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

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.f2326g = layoutParams.leftMargin;
        this.f2327h = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        i iVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (iVar = this.f2330k) != null) {
            this.f2330k = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(iVar);
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f2330k == null) {
            i iVar2 = new i(this, onFocusChangeListener);
            this.f2330k = iVar2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(iVar2);
        }
    }

    public void setTouchProcessor(C0094a c0094a) {
        this.f2328i = c0094a;
    }
}
