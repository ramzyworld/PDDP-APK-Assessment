package p007e;

import Q.q;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParserException;
import p000a.a;
import p016j.P;
import p029q.b;
import p033s.d;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f implements d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f1806r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1807s;
    public b t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f1808u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1809v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1810w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1811x;

    public e(b bVar, Resources resources) {
        this.f1817i = 255;
        this.f1819k = -1;
        this.f1809v = -1;
        this.f1810w = -1;
        d(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static e e(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        e eVar = new e(null, null);
        TypedArray typedArrayH = b.h(resources2, theme, attributeSet, p009f.a.f1826a);
        int i2 = 1;
        eVar.setVisible(typedArrayH.getBoolean(1, true), true);
        b bVar = eVar.t;
        bVar.f1779d |= typedArrayH.getChangingConfigurations();
        int i3 = 2;
        bVar.f1784i = typedArrayH.getBoolean(2, bVar.f1784i);
        int i4 = 3;
        bVar.f1787l = typedArrayH.getBoolean(3, bVar.f1787l);
        bVar.f1799y = typedArrayH.getInt(4, bVar.f1799y);
        bVar.f1800z = typedArrayH.getInt(5, bVar.f1800z);
        boolean z2 = false;
        eVar.setDither(typedArrayH.getBoolean(0, bVar.f1797w));
        b bVar2 = eVar.f1813e;
        if (resources2 != null) {
            bVar2.f1777b = resources2;
            int i5 = resources.getDisplayMetrics().densityDpi;
            if (i5 == 0) {
                i5 = 160;
            }
            int i6 = bVar2.f1778c;
            bVar2.f1778c = i5;
            if (i6 != i5) {
                bVar2.f1788m = false;
                bVar2.f1785j = false;
            }
        } else {
            bVar2.getClass();
        }
        typedArrayH.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i2 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i4)) {
                break;
            }
            if (next3 == i3 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray typedArrayH2 = b.h(resources2, theme, attributeSet, p009f.a.f1827b);
                    int resourceId = typedArrayH2.getResourceId(z2 ? 1 : 0, z2 ? 1 : 0);
                    int resourceId2 = typedArrayH2.getResourceId(i2, -1);
                    Drawable drawableF = resourceId2 > 0 ? P.d().f(context2, resourceId2) : null;
                    typedArrayH2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i7 = 0;
                    for (int i8 = 0; i8 < attributeCount; i8++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i8);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i9 = i7 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i8, z2)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i7] = attributeNameResource;
                            i7 = i9;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i7);
                    if (drawableF == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            drawableF = new q();
                            drawableF.inflate(resources2, xmlResourceParser2, attributeSet, theme);
                        } else {
                            drawableF = Drawable.createFromXmlInner(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (drawableF == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    b bVar3 = eVar.t;
                    int iA = bVar3.a(drawableF);
                    bVar3.f1773H[iA] = iArrTrimStateSet;
                    bVar3.f1775J.d(iA, Integer.valueOf(resourceId));
                } else {
                    if (xmlResourceParser.getName().equals("transition")) {
                        TypedArray typedArrayH3 = b.h(resources2, theme, attributeSet, p009f.a.f1828c);
                        int resourceId3 = typedArrayH3.getResourceId(2, -1);
                        int resourceId4 = typedArrayH3.getResourceId(1, -1);
                        int resourceId5 = typedArrayH3.getResourceId(z2 ? 1 : 0, -1);
                        Drawable drawableF2 = resourceId5 > 0 ? P.d().f(context2, resourceId5) : null;
                        boolean z3 = typedArrayH3.getBoolean(3, z2);
                        typedArrayH3.recycle();
                        if (drawableF2 == null) {
                            do {
                                next = xmlResourceParser.next();
                            } while (next == 4);
                            if (next != 2) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (xmlResourceParser.getName().equals("animated-vector")) {
                                drawableF2 = new Q.e(context2);
                                drawableF2.inflate(resources2, xmlResourceParser2, attributeSet, theme);
                            } else {
                                drawableF2 = Drawable.createFromXmlInner(resources, xmlResourceParser, attributeSet, theme);
                            }
                        }
                        if (drawableF2 == null) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (resourceId3 == -1 || resourceId4 == -1) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                        }
                        b bVar4 = eVar.t;
                        int iA2 = bVar4.a(drawableF2);
                        long j2 = resourceId3;
                        long j3 = resourceId4;
                        long j4 = (j2 << 32) | j3;
                        long j5 = z3 ? 8589934592L : 0L;
                        long j6 = iA2;
                        bVar4.f1774I.a(j4, Long.valueOf(j6 | j5));
                        if (z3) {
                            bVar4.f1774I.a((j3 << 32) | j2, Long.valueOf(j6 | 4294967296L | j5));
                        }
                        context2 = context;
                        resources2 = resources;
                        xmlResourceParser2 = xmlResourceParser;
                        i2 = 1;
                        z2 = false;
                    } else {
                        context2 = context;
                        resources2 = resources;
                        xmlResourceParser2 = xmlResourceParser;
                    }
                    i3 = 2;
                    i4 = 3;
                }
                i2 = 1;
                i3 = 2;
                i4 = 3;
            }
        }
        eVar.onStateChange(eVar.getState());
        return eVar;
    }

    @Override // p007e.f, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p007e.f
    public final void d(b bVar) {
        this.f1813e = bVar;
        int i2 = this.f1819k;
        if (i2 >= 0) {
            Drawable drawableD = bVar.d(i2);
            this.f1815g = drawableD;
            if (drawableD != null) {
                b(drawableD);
            }
        }
        this.f1816h = null;
        this.f1806r = bVar;
        this.t = bVar;
    }

    public final Drawable f() {
        if (!this.f1807s) {
            super.mutate();
            b bVar = this.f1806r;
            bVar.f1774I = bVar.f1774I.clone();
            bVar.f1775J = bVar.f1775J.clone();
            this.f1807s = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // p007e.f, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        a aVar = this.f1808u;
        if (aVar != null) {
            aVar.N();
            this.f1808u = null;
            c(this.f1809v);
            this.f1809v = -1;
            this.f1810w = -1;
        }
    }

    @Override // p007e.f, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f1811x) {
            f();
            b bVar = this.t;
            bVar.f1774I = bVar.f1774I.clone();
            bVar.f1775J = bVar.f1775J.clone();
            this.f1811x = true;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:51:0x0108  */
    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        b bVar;
        int iIntValue;
        int iIntValue2;
        a aVar;
        b bVar2 = this.t;
        int iE = bVar2.e(iArr);
        if (iE < 0) {
            iE = bVar2.e(StateSet.WILD_CARD);
        }
        int i2 = this.f1819k;
        boolean z2 = false;
        if (iE != i2) {
            a aVar2 = this.f1808u;
            if (aVar2 == null) {
                this.f1808u = null;
                this.f1810w = -1;
                this.f1809v = -1;
                bVar = this.t;
                if (i2 < 0) {
                    bVar.getClass();
                    iIntValue = 0;
                } else {
                    iIntValue = ((Integer) bVar.f1775J.c(i2, 0)).intValue();
                }
                if (iE < 0) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = ((Integer) bVar.f1775J.c(iE, 0)).intValue();
                }
                if (iIntValue2 == 0 && iIntValue != 0) {
                    long j2 = ((long) iIntValue2) | (((long) iIntValue) << 32);
                    int iLongValue = (int) ((Long) bVar.f1774I.d(j2, -1L)).longValue();
                    if (iLongValue >= 0) {
                        boolean z3 = (((Long) bVar.f1774I.d(j2, -1L)).longValue() & 8589934592L) != 0;
                        c(iLongValue);
                        Object obj = this.f1815g;
                        if (obj instanceof AnimationDrawable) {
                            aVar = new c((AnimationDrawable) obj, (((Long) bVar.f1774I.d(j2, -1L)).longValue() & 4294967296L) != 0, z3);
                        } else if (obj instanceof Q.e) {
                            aVar = new a((Q.e) obj, 1);
                        } else if (obj instanceof Animatable) {
                            aVar = new a((Animatable) obj, 0);
                        } else if (c(iE)) {
                            z2 = true;
                        }
                        aVar.L();
                        this.f1808u = aVar;
                        this.f1810w = i2;
                        this.f1809v = iE;
                        z2 = true;
                    } else if (c(iE)) {
                        z2 = true;
                    }
                } else if (c(iE)) {
                    z2 = true;
                }
            } else {
                if (iE != this.f1809v) {
                    if (iE == this.f1810w && aVar2.c()) {
                        aVar2.D();
                        this.f1809v = this.f1810w;
                        this.f1810w = iE;
                    } else {
                        i2 = this.f1809v;
                        aVar2.N();
                        this.f1808u = null;
                        this.f1810w = -1;
                        this.f1809v = -1;
                        bVar = this.t;
                        if (i2 < 0) {
                            bVar.getClass();
                            iIntValue = 0;
                        } else {
                            iIntValue = ((Integer) bVar.f1775J.c(i2, 0)).intValue();
                        }
                        if (iE < 0) {
                            iIntValue2 = 0;
                        } else {
                            iIntValue2 = ((Integer) bVar.f1775J.c(iE, 0)).intValue();
                        }
                        if (iIntValue2 == 0) {
                            if (c(iE)) {
                            }
                        } else if (c(iE)) {
                        }
                    }
                }
                z2 = true;
            }
        }
        Drawable drawable = this.f1815g;
        return drawable != null ? z2 | drawable.setState(iArr) : z2;
    }

    @Override // p007e.f, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        a aVar = this.f1808u;
        if (aVar != null && (visible || z3)) {
            if (z2) {
                aVar.L();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
