package Y;

import I0.q;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public final class d extends I0.j implements H0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f1082g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i2) {
        super(0);
        this.f1081f = i2;
        this.f1082g = eVar;
    }

    @Override // H0.a
    public final Object f() throws NoSuchMethodException, ClassNotFoundException {
        Class<?> clsB = null;
        e eVar = this.f1082g;
        boolean z2 = false;
        switch (this.f1081f) {
            case 0:
                Class<?> clsLoadClass = eVar.f1083a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                I0.i.d(clsLoadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method method = clsLoadClass.getMethod("getBounds", null);
                Method method2 = clsLoadClass.getMethod("getType", null);
                Method method3 = clsLoadClass.getMethod("getState", null);
                I0.i.d(method, "getBoundsMethod");
                if (a1.a.k(method, q.a(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
                    I0.i.d(method2, "getTypeMethod");
                    Class cls = Integer.TYPE;
                    if (a1.a.k(method2, q.a(cls)) && Modifier.isPublic(method2.getModifiers())) {
                        I0.i.d(method3, "getStateMethod");
                        if (a1.a.k(method3, q.a(cls)) && Modifier.isPublic(method3.getModifiers())) {
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 1:
                try {
                    clsB = eVar.f1084b.b();
                    break;
                } catch (ClassNotFoundException unused) {
                }
                if (clsB == null) {
                    return Boolean.FALSE;
                }
                Class<?> clsLoadClass2 = eVar.f1083a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                I0.i.d(clsLoadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method4 = clsLoadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, clsB);
                Method method5 = clsLoadClass2.getMethod("removeWindowLayoutInfoListener", clsB);
                I0.i.d(method4, "addListenerMethod");
                if (Modifier.isPublic(method4.getModifiers())) {
                    I0.i.d(method5, "removeListenerMethod");
                    if (Modifier.isPublic(method5.getModifiers())) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 2:
                Class<?> clsLoadClass3 = eVar.f1083a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                I0.i.d(clsLoadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method6 = clsLoadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method method7 = clsLoadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                I0.i.d(method6, "addListenerMethod");
                if (Modifier.isPublic(method6.getModifiers())) {
                    I0.i.d(method7, "removeListenerMethod");
                    if (Modifier.isPublic(method7.getModifiers())) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            default:
                Class<?> clsLoadClass4 = eVar.f1085c.f906a.loadClass("androidx.window.extensions.WindowExtensions");
                I0.i.d(clsLoadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method method8 = clsLoadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> clsLoadClass5 = eVar.f1083a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                I0.i.d(clsLoadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                I0.i.d(method8, "getWindowLayoutComponentMethod");
                if (Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(clsLoadClass5)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
        }
    }
}
