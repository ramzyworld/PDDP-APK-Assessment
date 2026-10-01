package p042y;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: y.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0174g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f3461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f3462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f3463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f3465e;

    public C0174g(ViewGroup viewGroup) {
        this.f3463c = viewGroup;
    }

    public final boolean a(float f2, float f3, boolean z2) {
        ViewParent viewParentE;
        if (!this.f3464d || (viewParentE = e(0)) == null) {
            return false;
        }
        try {
            return C.a(viewParentE, this.f3463c, f2, f3, z2);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    public final boolean b(float f2, float f3) {
        ViewParent viewParentE;
        if (!this.f3464d || (viewParentE = e(0)) == null) {
            return false;
        }
        try {
            return C.b(viewParentE, this.f3463c, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public final boolean c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent viewParentE;
        int i5;
        int i6;
        if (!this.f3464d || (viewParentE = e(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f3463c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            if (this.f3465e == null) {
                this.f3465e = new int[2];
            }
            iArr = this.f3465e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (viewParentE instanceof InterfaceC0175h) {
            ((InterfaceC0175h) viewParentE).d(i2, i3, iArr, i4);
        } else if (i4 == 0) {
            try {
                C.c(viewParentE, viewGroup, i2, i3, iArr);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public final boolean d(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent viewParentE;
        int i7;
        int i8;
        int[] iArr3;
        if (!this.f3464d || (viewParentE = e(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f3463c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            if (this.f3465e == null) {
                this.f3465e = new int[2];
            }
            int[] iArr4 = this.f3465e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (viewParentE instanceof InterfaceC0176i) {
            ((InterfaceC0176i) viewParentE).e(viewGroup, i2, i3, i4, i5, i6, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i4;
            iArr3[1] = iArr3[1] + i5;
            if (viewParentE instanceof InterfaceC0175h) {
                ((InterfaceC0175h) viewParentE).b(viewGroup, i2, i3, i4, i5, i6);
            } else if (i6 == 0) {
                try {
                    C.d(viewParentE, viewGroup, i2, i3, i4, i5);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e2);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    public final ViewParent e(int i2) {
        if (i2 == 0) {
            return this.f3461a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f3462b;
    }

    public final boolean f(int i2) {
        return e(i2) != null;
    }

    public final boolean g(int i2, int i3) {
        boolean zF;
        if (f(i3)) {
            return true;
        }
        if (this.f3464d) {
            ViewGroup viewGroup = this.f3463c;
            View view = viewGroup;
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                boolean z2 = parent instanceof InterfaceC0175h;
                if (z2) {
                    zF = ((InterfaceC0175h) parent).f(view, viewGroup, i2, i3);
                } else if (i3 == 0) {
                    try {
                        zF = C.f(parent, view, viewGroup, i2);
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        zF = false;
                    }
                } else {
                    zF = false;
                }
                if (zF) {
                    if (i3 == 0) {
                        this.f3461a = parent;
                    } else if (i3 == 1) {
                        this.f3462b = parent;
                    }
                    if (z2) {
                        ((InterfaceC0175h) parent).a(view, viewGroup, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            C.e(parent, view, viewGroup, i2);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i2) {
        ViewParent viewParentE = e(i2);
        if (viewParentE != null) {
            boolean z2 = viewParentE instanceof InterfaceC0175h;
            ViewGroup viewGroup = this.f3463c;
            if (z2) {
                ((InterfaceC0175h) viewParentE).c(viewGroup, i2);
            } else if (i2 == 0) {
                try {
                    C.g(viewParentE, viewGroup);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i2 == 0) {
                this.f3461a = null;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f3462b = null;
            }
        }
    }
}
