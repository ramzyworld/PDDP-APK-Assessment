package p014i;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p016j.A;
import p016j.C;
import p016j.C0109f;
import p016j.C0110g;
import p016j.C0111h;
import p016j.C0112i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f2026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C f2027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C f2028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f2031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f2033k;

    public a(View view) {
        this.f2031i = new int[2];
        this.f2026d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2023a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2024b = tapTimeout;
        this.f2025c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        C c2 = this.f2028f;
        View view = this.f2026d;
        if (c2 != null) {
            view.removeCallbacks(c2);
        }
        C c3 = this.f2027e;
        if (c3 != null) {
            view.removeCallbacks(c3);
        }
    }

    public final l b() {
        C0109f c0109f;
        switch (this.f2032j) {
            case 0:
                b bVar = ((ActionMenuItemView) this.f2033k).f1156n;
                if (bVar == null || (c0109f = ((C0110g) bVar).f2650a.f2676w) == null) {
                    return null;
                }
                return c0109f.a();
            default:
                C0109f c0109f2 = ((C0111h) this.f2033k).f2651g.f2675v;
                if (c0109f2 == null) {
                    return null;
                }
                return c0109f2.a();
        }
    }

    public final boolean c() {
        l lVarB;
        switch (this.f2032j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2033k;
                i iVar = actionMenuItemView.f1154l;
                return iVar != null && iVar.a(actionMenuItemView.f1151i) && (lVarB = b()) != null && lVarB.j();
            default:
                ((C0111h) this.f2033k).f2651g.k();
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        C0112i c0112i;
        boolean z3;
        l lVarB;
        A a2;
        boolean z4 = this.f2029g;
        View view2 = this.f2026d;
        if (z4) {
            l lVarB2 = b();
            if (lVarB2 == null || !lVarB2.j() || (a2 = (A) lVarB2.k()) == null || !a2.isShown()) {
                switch (this.f2032j) {
                    case 1:
                        c0112i = ((C0111h) this.f2033k).f2651g;
                        if (c0112i.f2677x != null) {
                            c0112i.j();
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        break;
                    default:
                        lVarB = b();
                        if (lVarB != null && lVarB.j()) {
                            lVarB.dismiss();
                        }
                        z3 = true;
                        break;
                }
                if (z3) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f2031i;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                a2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = a2.b(this.f2030h, motionEventObtainNoHistory);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z5 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z5) {
                    z2 = true;
                } else {
                    switch (this.f2032j) {
                        case 1:
                            c0112i = ((C0111h) this.f2033k).f2651g;
                            if (c0112i.f2677x != null) {
                                c0112i.j();
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            break;
                        default:
                            lVarB = b();
                            if (lVarB != null) {
                                lVarB.dismiss();
                            }
                            z3 = true;
                            break;
                    }
                    if (z3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f2030h = motionEvent.getPointerId(0);
                    if (this.f2027e == null) {
                        this.f2027e = new C(this, 0);
                    }
                    view2.postDelayed(this.f2027e, this.f2024b);
                    if (this.f2028f == null) {
                        this.f2028f = new C(this, 1);
                    }
                    view2.postDelayed(this.f2028f, this.f2025c);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f2030h);
                    if (iFindPointerIndex >= 0) {
                        float x2 = motionEvent.getX(iFindPointerIndex);
                        float y2 = motionEvent.getY(iFindPointerIndex);
                        float f2 = this.f2023a;
                        float f3 = -f2;
                        if (x2 < f3 || y2 < f3 || x2 >= (view2.getRight() - view2.getLeft()) + f2 || y2 >= (view2.getBottom() - view2.getTop()) + f2) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z2 = c();
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
            }
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f2029g = z2;
        return z2 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2029g = false;
        this.f2030h = -1;
        C c2 = this.f2027e;
        if (c2 != null) {
            this.f2026d.removeCallbacks(c2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f2032j = 0;
        this.f2033k = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(C0111h c0111h, C0111h c0111h2) {
        this(c0111h2);
        this.f2032j = 1;
        this.f2033k = c0111h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
