package p029q;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f3002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f3003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3004c;

    public l(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f3002a = colorStateList;
        this.f3003b = configuration;
        this.f3004c = theme == null ? 0 : theme.hashCode();
    }
}
