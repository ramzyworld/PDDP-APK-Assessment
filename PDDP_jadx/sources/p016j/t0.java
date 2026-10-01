package p016j;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.deeprf.pddp.R;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f2759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f2760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f2761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f2762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f2763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f2764g;

    public t0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f2761d = layoutParams;
        this.f2762e = new Rect();
        this.f2763f = new int[2];
        this.f2764g = new int[2];
        this.f2758a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f2759b = viewInflate;
        this.f2760c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(t0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
