package p016j;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f2627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f2628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f2629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f2630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f2631e;

    public e0(View view) {
        this.f2627a = (TextView) view.findViewById(R.id.text1);
        this.f2628b = (TextView) view.findViewById(R.id.text2);
        this.f2629c = (ImageView) view.findViewById(R.id.icon1);
        this.f2630d = (ImageView) view.findViewById(R.id.icon2);
        this.f2631e = (ImageView) view.findViewById(com.deeprf.pddp.R.id.edit_query);
    }
}
