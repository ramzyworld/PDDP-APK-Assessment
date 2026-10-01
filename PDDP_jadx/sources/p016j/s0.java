package p016j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.deeprf.pddp.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p042y.B;
import p042y.x;
import p042y.z;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static s0 f2734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static s0 f2735k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f2736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f2737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f2739d = new r0(this, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f2740e = new r0(this, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t0 f2743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2744i;

    public s0(View view, CharSequence charSequence) {
        this.f2736a = view;
        this.f2737b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = B.f3420a;
        this.f2738c = Build.VERSION.SDK_INT >= 28 ? z.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f2741f = Integer.MAX_VALUE;
        this.f2742g = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(s0 s0Var) {
        s0 s0Var2 = f2734j;
        if (s0Var2 != null) {
            s0Var2.f2736a.removeCallbacks(s0Var2.f2739d);
        }
        f2734j = s0Var;
        if (s0Var != null) {
            s0Var.f2736a.postDelayed(s0Var.f2739d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        s0 s0Var = f2735k;
        View view = this.f2736a;
        if (s0Var == this) {
            f2735k = null;
            t0 t0Var = this.f2743h;
            if (t0Var != null) {
                View view2 = t0Var.f2759b;
                if (view2.getParent() != null) {
                    ((WindowManager) t0Var.f2758a.getSystemService("window")).removeView(view2);
                }
                this.f2743h = null;
                this.f2741f = Integer.MAX_VALUE;
                this.f2742g = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f2734j == this) {
            b(null);
        }
        view.removeCallbacks(this.f2740e);
    }

    public final void c(boolean z2) {
        int height;
        int i2;
        int i3;
        long longPressTimeout;
        long j2;
        long j3;
        Field field = x.f3474a;
        View view = this.f2736a;
        if (view.isAttachedToWindow()) {
            b(null);
            s0 s0Var = f2735k;
            if (s0Var != null) {
                s0Var.a();
            }
            f2735k = this;
            this.f2744i = z2;
            t0 t0Var = new t0(view.getContext());
            this.f2743h = t0Var;
            int width = this.f2741f;
            int i4 = this.f2742g;
            boolean z3 = this.f2744i;
            View view2 = t0Var.f2759b;
            ViewParent parent = view2.getParent();
            Context context = t0Var.f2758a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            t0Var.f2760c.setText(this.f2737b);
            WindowManager.LayoutParams layoutParams = t0Var.f2761d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i2 = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                Rect rect = t0Var.f2762e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i3 = 0;
                } else {
                    Resources resources = context.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i3 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = t0Var.f2764g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = t0Var.f2763f;
                view.getLocationOnScreen(iArr2);
                int i5 = iArr2[i3] - iArr[i3];
                iArr2[i3] = i5;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i5 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i6 = iArr2[1];
                int i7 = ((i2 + i6) - dimensionPixelOffset3) - measuredHeight;
                int i8 = i6 + height + dimensionPixelOffset3;
                if (z3) {
                    if (i7 >= 0) {
                        layoutParams.y = i7;
                    } else {
                        layoutParams.y = i8;
                    }
                } else if (measuredHeight + i8 <= rect.height()) {
                    layoutParams.y = i8;
                } else {
                    layoutParams.y = i7;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f2744i) {
                j3 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j3 = j2 - longPressTimeout;
            }
            r0 r0Var = this.f2740e;
            view.removeCallbacks(r0Var);
            view.postDelayed(r0Var, j3);
        }
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2743h != null && this.f2744i) {
            return false;
        }
        View view2 = this.f2736a;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f2741f = Integer.MAX_VALUE;
                this.f2742g = Integer.MAX_VALUE;
                a();
            }
        } else if (view2.isEnabled() && this.f2743h == null) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            int iAbs = Math.abs(x2 - this.f2741f);
            int i2 = this.f2738c;
            if (iAbs > i2 || Math.abs(y2 - this.f2742g) > i2) {
                this.f2741f = x2;
                this.f2742g = y2;
                b(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f2741f = view.getWidth() / 2;
        this.f2742g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
