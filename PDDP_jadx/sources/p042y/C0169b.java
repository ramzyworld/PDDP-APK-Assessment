package p042y;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.deeprf.pddp.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p044z.e;
import p044z.j;

/* JADX INFO: renamed from: y.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0169b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f3449c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f3450a = f3449c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0168a f3451b = new C0168a(this);

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f3450a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, j jVar) {
        this.f3450a.onInitializeAccessibilityNodeInfo(view, jVar.f3496a);
    }

    public boolean c(View view, int i2, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < listEmptyList.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((e) listEmptyList.get(i3)).f3493a).getId() != i2; i3++) {
        }
        boolean zPerformAccessibilityAction = this.f3450a.performAccessibilityAction(view, i2, bundle);
        if (zPerformAccessibilityAction || i2 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i4 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i4)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i5 = 0; clickableSpanArr != null && i5 < clickableSpanArr.length; i5++) {
                if (clickableSpan.equals(clickableSpanArr[i5])) {
                    clickableSpan.onClick(view);
                    z2 = true;
                    break;
                }
            }
        }
        return z2;
    }
}
