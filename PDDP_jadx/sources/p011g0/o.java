package p011g0;

import android.view.textservice.SpellCheckerInfo;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((SpellCheckerInfo) obj).getPackageName().equals("com.google.android.inputmethod.latin");
    }
}
