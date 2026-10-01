package Q;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h implements Animatable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f604h = new b(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f602f = new c();

    public e(Context context) {
        this.f603g = context;
    }

    @Override // Q.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            p033s.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            return p033s.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        c cVar = this.f602f;
        cVar.f597a.draw(canvas);
        if (cVar.f598b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f607e;
        return drawable != null ? drawable.getAlpha() : this.f602f.f597a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f602f.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f607e;
        return drawable != null ? p033s.a.c(drawable) : this.f602f.f597a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f607e == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.f607e.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f607e;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f602f.f597a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f607e;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f602f.f597a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f607e;
        return drawable != null ? drawable.getOpacity() : this.f602f.f597a.getOpacity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        c cVar;
        XmlResourceParser xmlResourceParser;
        Animator animatorA;
        q qVar;
        int next;
        Drawable drawable = this.f607e;
        if (drawable != null) {
            p033s.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            cVar = this.f602f;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayH = p029q.b.h(resources, theme, attributeSet, a.f588e);
                    int resourceId = typedArrayH.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = q.f662n;
                        if (Build.VERSION.SDK_INT >= 24) {
                            qVar = new q();
                            ThreadLocal threadLocal = p029q.n.f3007a;
                            qVar.f607e = p029q.j.a(resources, resourceId, theme);
                            new p(qVar.f607e.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
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
                                qVar = new q();
                                qVar.inflate(resources, xml, attributeSetAsAttributeSet, theme);
                            } catch (IOException e2) {
                                Log.e("VectorDrawableCompat", "parser error", e2);
                                qVar = null;
                            } catch (XmlPullParserException e3) {
                                Log.e("VectorDrawableCompat", "parser error", e3);
                                qVar = null;
                            }
                        }
                        qVar.f667j = false;
                        qVar.setCallback(this.f604h);
                        q qVar2 = cVar.f597a;
                        if (qVar2 != null) {
                            qVar2.setCallback(null);
                        }
                        cVar.f597a = qVar;
                    }
                    typedArrayH.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a.f589f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f603g;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            animatorA = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    XmlResourceParser animation = resources2.getAnimation(resourceId2);
                                    try {
                                        animatorA = a.a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                        animation.close();
                                    } catch (IOException e4) {
                                        e = e4;
                                        Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException.initCause(e);
                                        throw notFoundException;
                                    } catch (XmlPullParserException e5) {
                                        e = e5;
                                        Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException2.initCause(e);
                                        throw notFoundException2;
                                    } catch (Throwable th) {
                                        th = th;
                                        xmlResourceParser = animation;
                                        if (xmlResourceParser != 0) {
                                            xmlResourceParser.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    xmlResourceParser = context;
                                }
                            } catch (IOException e6) {
                                e = e6;
                            } catch (XmlPullParserException e7) {
                                e = e7;
                            } catch (Throwable th3) {
                                th = th3;
                                xmlResourceParser = 0;
                            }
                        }
                        animatorA.setTarget(cVar.f597a.f663f.f650b.f648o.getOrDefault(string, null));
                        if (cVar.f599c == null) {
                            cVar.f599c = new ArrayList();
                            cVar.f600d = new p022m.a();
                        }
                        cVar.f599c.add(animatorA);
                        cVar.f600d.put(animatorA, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (cVar.f598b == null) {
            cVar.f598b = new AnimatorSet();
        }
        cVar.f598b.playTogether(cVar.f599c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f607e;
        return drawable != null ? drawable.isAutoMirrored() : this.f602f.f597a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f607e;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f602f.f598b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f607e;
        return drawable != null ? drawable.isStateful() : this.f602f.f597a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f602f.f597a.setBounds(rect);
        }
    }

    @Override // Q.h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.f607e;
        return drawable != null ? drawable.setLevel(i2) : this.f602f.f597a.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f607e;
        return drawable != null ? drawable.setState(iArr) : this.f602f.f597a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f602f.f597a.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f602f.f597a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f602f.f597a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            a1.a.A(drawable, i2);
        } else {
            this.f602f.f597a.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            p033s.a.h(drawable, colorStateList);
        } else {
            this.f602f.f597a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            p033s.a.i(drawable, mode);
        } else {
            this.f602f.f597a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f602f.f597a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        c cVar = this.f602f;
        if (cVar.f598b.isStarted()) {
            return;
        }
        cVar.f598b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f607e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f602f.f598b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
