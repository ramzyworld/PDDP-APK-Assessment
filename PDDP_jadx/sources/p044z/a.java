package p044z;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f3487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3488c;

    public a(int i2, j jVar, int i3) {
        this.f3486a = i2;
        this.f3487b = jVar;
        this.f3488c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3486a);
        this.f3487b.f3496a.performAction(this.f3488c, bundle);
    }
}
