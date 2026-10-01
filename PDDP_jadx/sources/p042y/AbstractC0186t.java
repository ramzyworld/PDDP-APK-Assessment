package p042y;

import A.a;
import android.view.View;
import com.deeprf.pddp.R;
import java.util.Objects;
import p022m.i;

/* JADX INFO: renamed from: y.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0186t {
    public static void a(View view, w wVar) {
        i iVar = (i) view.getTag(R.id.tag_unhandled_key_listeners);
        if (iVar == null) {
            iVar = new i();
            view.setTag(R.id.tag_unhandled_key_listeners, iVar);
        }
        Objects.requireNonNull(wVar);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0185s = new ViewOnUnhandledKeyEventListenerC0185s();
        iVar.put(wVar, viewOnUnhandledKeyEventListenerC0185s);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0185s);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, w wVar) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        i iVar = (i) view.getTag(R.id.tag_unhandled_key_listeners);
        if (iVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) iVar.getOrDefault(wVar, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i2) {
        return (T) view.requireViewById(i2);
    }

    public static void g(View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }
}
