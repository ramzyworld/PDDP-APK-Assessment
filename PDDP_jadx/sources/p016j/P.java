package p016j;

import Q.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.deeprf.pddp.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p013h0.d;
import p022m.a;
import p022m.b;
import p022m.c;
import p022m.j;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static P f2592i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f2594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f2595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f2596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f2597d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f2598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f2600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f2591h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final O f2593j = new O(6);

    public static synchronized P d() {
        try {
            if (f2592i == null) {
                P p2 = new P();
                f2592i = p2;
                if (Build.VERSION.SDK_INT < 24) {
                    p2.a("vector", new N(2));
                    p2.a("animated-vector", new N(1));
                    p2.a("animated-selector", new N(0));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2592i;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        O o2 = f2593j;
        o2.getClass();
        int i3 = (31 + i2) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) o2.a(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
        }
        return porterDuffColorFilter;
    }

    public final void a(String str, N n2) {
        if (this.f2595b == null) {
            this.f2595b = new a();
        }
        this.f2595b.put(str, n2);
    }

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                c cVar = (c) this.f2597d.get(context);
                if (cVar == null) {
                    cVar = new c();
                    this.f2597d.put(context, cVar);
                }
                cVar.e(j2, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i2) {
        if (this.f2598e == null) {
            this.f2598e = new TypedValue();
        }
        TypedValue typedValue = this.f2598e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j2);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawable = null;
        if (this.f2600g != null && i2 == R.drawable.abc_cab_background_top_material) {
            layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j2) {
        c cVar = (c) this.f2597d.get(context);
        if (cVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) cVar.d(j2, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iB = b.b(cVar.f2835f, cVar.f2837h, j2);
            if (iB >= 0) {
                Object[] objArr = cVar.f2836g;
                Object obj = objArr[iB];
                Object obj2 = c.f2833i;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    cVar.f2834e = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i2) {
        return g(context, i2);
    }

    public final synchronized Drawable g(Context context, int i2) {
        Drawable drawableJ;
        try {
            if (!this.f2599f) {
                this.f2599f = true;
                Drawable drawableF = f(context, R.drawable.abc_vector_test);
                if (drawableF == null || (!(drawableF instanceof q) && !"android.graphics.drawable.VectorDrawable".equals(drawableF.getClass().getName()))) {
                    this.f2599f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableJ = j(context, i2);
            if (drawableJ == null) {
                drawableJ = c(context, i2);
            }
            if (drawableJ == null) {
                drawableJ = p027p.a.b(context, i2);
            }
            if (drawableJ != null) {
                drawableJ = l(context, i2, drawableJ);
            }
            if (drawableJ != null) {
                AbstractC0127y.b(drawableJ);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableJ;
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        j jVar;
        WeakHashMap weakHashMap = this.f2594a;
        ColorStateList colorStateListC = null;
        colorStateList = (weakHashMap == null || (jVar = (j) weakHashMap.get(context)) == null) ? null : (ColorStateList) jVar.c(i2, null);
        if (colorStateList == null) {
            d dVar = this.f2600g;
            if (dVar != null) {
                colorStateListC = dVar.c(context, i2);
            }
            if (colorStateListC != null) {
                if (this.f2594a == null) {
                    this.f2594a = new WeakHashMap();
                }
                j jVar2 = (j) this.f2594a.get(context);
                if (jVar2 == null) {
                    jVar2 = new j();
                    this.f2594a.put(context, jVar2);
                }
                jVar2.a(i2, colorStateListC);
            }
            colorStateList = colorStateListC;
        }
        return colorStateList;
    }

    public final Drawable j(Context context, int i2) {
        int next;
        a aVar = this.f2595b;
        if (aVar == null || aVar.isEmpty()) {
            return null;
        }
        j jVar = this.f2596c;
        if (jVar != null) {
            String str = (String) jVar.c(i2, null);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f2595b.getOrDefault(str, null) == null)) {
                return null;
            }
        } else {
            this.f2596c = new j();
        }
        if (this.f2598e == null) {
            this.f2598e = new TypedValue();
        }
        TypedValue typedValue = this.f2598e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j2);
        if (drawableE != null) {
            return drawableE;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f2596c.a(i2, name);
                N n2 = (N) this.f2595b.getOrDefault(name, null);
                if (n2 != null) {
                    drawableE = n2.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableE != null) {
                    drawableE.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j2, drawableE);
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (drawableE == null) {
            this.f2596c.a(i2, "appcompat_skip_skip");
        }
        return drawableE;
    }

    public final synchronized void k(d dVar) {
        this.f2600g = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x0100  */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:50:0x010b  */
    /* JADX WARN: Code duplicated, block: B:57:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Drawable l(Context context, int i2, Drawable drawable) {
        d dVar;
        boolean z2;
        PorterDuff.Mode mode;
        boolean zA;
        int i3;
        int iRound;
        Drawable drawableMutate;
        int iB;
        ColorStateList colorStateListI = i(context, i2);
        if (colorStateListI != null) {
            if (AbstractC0127y.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = a1.a.K(drawable);
            p033s.a.h(drawable, colorStateListI);
            PorterDuff.Mode mode2 = null;
            if (this.f2600g != null && i2 == R.drawable.abc_switch_thumb_material) {
                mode2 = PorterDuff.Mode.MULTIPLY;
            }
            if (mode2 != null) {
                p033s.a.i(drawable, mode2);
            }
        } else if (this.f2600g == null) {
            dVar = this.f2600g;
            z2 = false;
            if (dVar != null) {
                mode = C0118o.f2707b;
                if (d.a((int[]) dVar.f1997a, i2)) {
                    iRound = -1;
                    z2 = true;
                    i3 = R.attr.colorControlNormal;
                } else if (d.a((int[]) dVar.f1999c, i2)) {
                    iRound = -1;
                    z2 = true;
                    i3 = R.attr.colorControlActivated;
                } else {
                    zA = d.a((int[]) dVar.f2000d, i2);
                    i3 = android.R.attr.colorBackground;
                    if (zA) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else if (i2 == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        z2 = true;
                        i3 = android.R.attr.colorForeground;
                    } else if (i2 == R.drawable.abc_dialog_material_background) {
                        iRound = -1;
                        i3 = 0;
                    }
                    iRound = -1;
                    z2 = true;
                }
                if (z2) {
                    if (AbstractC0127y.a(drawable)) {
                        drawableMutate = drawable.mutate();
                    } else {
                        drawableMutate = drawable;
                    }
                    iB = h0.b(context, i3);
                    synchronized (C0118o.class) {
                        PorterDuffColorFilter porterDuffColorFilterH = h(iB, mode);
                    }
                    drawableMutate.setColorFilter(porterDuffColorFilterH);
                    if (iRound != -1) {
                        drawableMutate.setAlpha(iRound);
                    }
                }
            }
        } else if (i2 == R.drawable.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
            int iB2 = h0.b(context, R.attr.colorControlNormal);
            PorterDuff.Mode mode3 = C0118o.f2707b;
            d.e(drawableFindDrawableByLayerId, iB2, mode3);
            d.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), h0.b(context, R.attr.colorControlNormal), mode3);
            d.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), h0.b(context, R.attr.colorControlActivated), mode3);
        } else if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
            int iA = h0.a(context, R.attr.colorControlNormal);
            PorterDuff.Mode mode4 = C0118o.f2707b;
            d.e(drawableFindDrawableByLayerId2, iA, mode4);
            d.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), h0.b(context, R.attr.colorControlActivated), mode4);
            d.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), h0.b(context, R.attr.colorControlActivated), mode4);
        } else {
            dVar = this.f2600g;
            z2 = false;
            if (dVar != null) {
                mode = C0118o.f2707b;
                if (d.a((int[]) dVar.f1997a, i2)) {
                    iRound = -1;
                    z2 = true;
                    i3 = R.attr.colorControlNormal;
                } else if (d.a((int[]) dVar.f1999c, i2)) {
                    iRound = -1;
                    z2 = true;
                    i3 = R.attr.colorControlActivated;
                } else {
                    zA = d.a((int[]) dVar.f2000d, i2);
                    i3 = android.R.attr.colorBackground;
                    if (zA) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else if (i2 == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        z2 = true;
                        i3 = android.R.attr.colorForeground;
                    } else if (i2 == R.drawable.abc_dialog_material_background) {
                        iRound = -1;
                        i3 = 0;
                    }
                    iRound = -1;
                    z2 = true;
                }
                if (z2) {
                    if (AbstractC0127y.a(drawable)) {
                        drawableMutate = drawable.mutate();
                    } else {
                        drawableMutate = drawable;
                    }
                    iB = h0.b(context, i3);
                    synchronized (C0118o.class) {
                        PorterDuffColorFilter porterDuffColorFilterH2 = h(iB, mode);
                        drawableMutate.setColorFilter(porterDuffColorFilterH2);
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                    }
                }
            }
        }
        return drawable;
    }
}
